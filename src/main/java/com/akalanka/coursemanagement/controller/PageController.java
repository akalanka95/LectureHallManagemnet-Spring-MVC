package com.akalanka.coursemanagement.controller;


import com.akalanka.coursemanagement.backend.dao.*;
import com.akalanka.coursemanagement.backend.dto.*;
//import com.sun.mail.imap.protocol.BODY;
import com.twilio.Twilio;
//import com.twilio.rest.lookups.v1.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;




import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.List;

//twilio recevie sms new jdk

import com.twilio.twiml.messaging.Body;
import com.twilio.twiml.messaging.Message;
import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.TwiMLException;

//twilio send messages
import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

//httpbody

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.web.servlet.ModelAndViewDefiningException;

@Controller
public class PageController {

    public static final String ACCOUNT_SID = "ACbecac8a7b460fab527f7fda2753aa0e5";
    public static final String AUTH_TOKEN = "19ab037f72dd8ac0bea9bd6c2000021f";
    public static final String TWILIO_NUMBER = "+447492886126 ";


    @Autowired
    private LectureDao lectureDao;
    @Autowired
    private DepartmentRefDao departmentRefDao;
    @Autowired
    private TimeTableDao timeTableDao;
    @Autowired
    private DepartmentDao departmentDao;
    @Autowired
    private SemesterDao semesterDao;
    @Autowired
    private LectureHallDao lectureHallDao;
    @Autowired
    private CourseDao courseDao;
    @Autowired
    private  TimeDao timeDao;
    @Autowired
    private  ResponseDao responseDao;

    @RequestMapping(value = { "/", "home", "index" })
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","Home");
        mv.addObject("userclickhome",true);
        mv.addObject("sizelecture",lectureDao.lectureList().size());
        mv.addObject("sizelecturehall",lectureHallDao.lectureHallList().size());

        return mv;
    }
    @RequestMapping(value = { "greeting" })
    public ModelAndView twilio() {

        /*try {
            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

            // Build a filter for the MessageList
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("Body", "Hai bimalka good morning honde fuck"));
            params.add(new BasicNameValuePair("To", "+94702223540 ")); //Add real number here
            params.add(new BasicNameValuePair("From", TWILIO_NUMBER));

            MessageFactory messageFactory = client.getAccount().getMessageFactory();
            Message message = messageFactory.create(params);
            System.out.println(message.getSid());
        }
        catch (TwilioRestException e) {
            System.out.println(e.getErrorMessage());
        }*/




        ModelAndView mv = new ModelAndView("twilio");
        mv.addObject("title","Home");
        mv.addObject("userclicktwilio",true);
        return mv;
    }


    @RequestMapping(value = {"view/lectures"} )
    public ModelAndView viewLectures() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","Lecture");
        mv.addObject("userclickviewlecture",true);
        mv.addObject("size",lectureDao.lectureList().size());
        return mv;
    }

    @RequestMapping(value = {"view/lectures/{id}"} )
    public ModelAndView viewSingleLecture(@PathVariable("id") int id) {

        Lecture lecture = null;
        lecture = lectureDao.get(id);

        System.out.println(lecture.getAddress());

        ModelAndView mv = new ModelAndView("page");

        mv.addObject("title","Lecture");
        mv.addObject("lecture",lecture);
        mv.addObject("userclickviewlecturedetails",true);
        return mv;
    }

    @RequestMapping(value = {"view/departmentRef"} )
    public ModelAndView viewDepartmentRef() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","DepartmentRef");
        mv.addObject("userclickviewdepartmentRef",true);
        mv.addObject("size",departmentRefDao.departmentRefList().size());
        return mv;
    }

    @RequestMapping(value = {"view/departmentRef/{id}"} )
    public ModelAndView viewSingleDepartmentRef(@PathVariable("id") int id) {

        DepartmentRef departmentRef = null;
        departmentRef = departmentRefDao.get(id);


        ModelAndView mv = new ModelAndView("page");

        mv.addObject("title","DepartmentRef");
        mv.addObject("departmentRef",departmentRef);
        mv.addObject("userclickviewdepartmentRefDetails",true);
        return mv;
    }
    @RequestMapping(value = {"view/{dep}/{sem}/timetable"})
    public ModelAndView viewTimetable(@PathVariable("dep") int dep,@PathVariable("sem") int sem){

        List<TimeTable> mondaytimetable = timeTableDao.getMondayTimeTableList(dep,sem);
        List<TimeTable> tuesdaytimetable = timeTableDao.getTuesdayTimeTableList(dep,sem);
        List<TimeTable> wednesdaytimetable = timeTableDao.getWednesdayTimeTableList(dep,sem);
        List<TimeTable> thursdaydaytimetable = timeTableDao.getThursdayTimeTableList(dep,sem);
        List<TimeTable> fridaydaytimetable = timeTableDao.getFridayTimeTableList(dep,sem);

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","TimeTable");
        mv.addObject("mondayTime",mondaytimetable);
        mv.addObject("tuesdayTime",tuesdaytimetable);
        mv.addObject("wednesdayTime",wednesdaytimetable);
        mv.addObject("thursdayTime",thursdaydaytimetable);
        mv.addObject("fridayTime",fridaydaytimetable);


        mv.addObject("userclickviewdepartmenttimetable",true);
        return mv;
    }

    @RequestMapping(value = {"view/{day}/lecturehalls"})
    public ModelAndView viewLectureHalls(@PathVariable("day")String day) {

        List<TimeTable> timeTable = timeTableDao.getLectureHallsList(day);

       /* Map<String, List<TimeTable>> byHall = lectureHalls.stream().collect(
                Collectors.groupingBy(a-> a.getLectureHall().getName()));*/

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","TimeTable");
        mv.addObject("timeTable",timeTable);
        mv.addObject("userclickviewlecturehallarrangements",true);
        mv.addObject("day",day);
        return mv;
    }

    @RequestMapping(value = {"view/{day}/lecture/schedule"})
    public ModelAndView viewLectureschedule(@PathVariable("day")String day) {

        List<TimeTable> timeTable = timeTableDao.getLectureHallsList(day);

       /* Map<String, List<TimeTable>> byHall = lectureHalls.stream().collect(
                Collectors.groupingBy(a-> a.getLectureHall().getName()));*/

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","TimeTable");
        mv.addObject("timeTable",timeTable);
        mv.addObject("userclickviewlecturearrangements",true);
        mv.addObject("day",day);
        return mv;
    }




    @RequestMapping(value = {"adding/newlecture/{depid}/{semid}/add"},method = RequestMethod.GET)
    public ModelAndView addExtraLecture(@RequestParam(name = "operation",required = false)String operation,@PathVariable("depid")int depid,@PathVariable("semid")int semid){


        Department department =  departmentDao.get(depid);
        Semester semester = semesterDao.get(semid);
        List<Semester> semesterList = semesterDao.getlist(semid);
        List<Department> departmentList = departmentDao.getlist(depid);
       List<Course> courseList = courseDao.getSemDepCourseList(depid,semid);
       List<Time> timeList = timeDao.getTimetList();

       TimeTable ntimeTable = new TimeTable();


        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","Add Extra Lecture");
        mv.addObject("department",department);
        mv.addObject("semester",semester);
        mv.addObject("courseList",courseList);
        mv.addObject("ntimeTable",ntimeTable);
        mv.addObject("depid",depid);
        mv.addObject("semid",semid);
        mv.addObject("semesterList",semesterList);
        mv.addObject("departmentList",departmentList);
        mv.addObject("timeList",timeList);
        mv.addObject("userclickaddextralecture",true);

        if(operation!=null){
            if(operation.equals("addingExtraLecture")){
                mv.addObject("message","Extra Lecture Details Added Successfully");
            }
        }

        return mv;
    }

    @RequestMapping(value = {"adding/newlecture/{depid}/{semid}/adding"},method = RequestMethod.GET)
    public String handleExtraLectureSubmission(@ModelAttribute("ntimeTable")TimeTable timeTable, BindingResult result, Model model, HttpServletRequest request,@PathVariable("depid")int depid,@PathVariable("semid")int semid) {

        timeTable.setActive(true);
        timeTable.setState("new");

        timeTableDao.addTimeTable(timeTable);

        String url="redirect:/adding/newlecture/"+depid+"/"+semid+"/add?operation=extralecture";

        return url;

    }

    @RequestMapping(value = {"adding/newlecture/{depid}/{semid}/search"},method = RequestMethod.POST)
    public ModelAndView handleExtraLectureSubmissionSearch(@Valid @ModelAttribute("ntimeTable")TimeTable timeTable, BindingResult result, Model model, HttpServletRequest request,@PathVariable("depid")int depid,@PathVariable("semid")int semid) {

        String day = timeTable.getDay();


        int lectureid = timeTable.getLecture().getId();
        Lecture lecturer = lectureDao.get(lectureid) ;
        String lecturename =lecturer.getFullName();

        int startsid = timeTable.getStartTime().getId();
        Time time = timeDao.get(startsid);
        String startid = String.valueOf(time.getTime());

        int endsid = timeTable.getEndTime().getId();
        Time time2 = timeDao.get(endsid);
        String endid = String.valueOf(time2.getTime());


        int hallid = timeTable.getLectureHall().getId();
        LectureHall lec = lectureHallDao.get(hallid);
        String lecturehall = lec.getName();

        int courseid = timeTable.getCourse().getId();
        Course course = courseDao.get(courseid);

        int lecid = timeTable.getLecture().getId();

        Department department = departmentDao.get(depid);


        System.out.print(lecturename);

        List<TimeTable>  depTimeTable = timeTableDao.getDepTimeTable(day,depid,semid);
        List<TimeTable>  dateLectureHall = timeTableDao.getDateLectureHalls(day,hallid);
        List<TimeTable>  dateLecture = timeTableDao.getDateLecture(day,lecid);


        ModelAndView mv = new ModelAndView("page");
       // mv.addObject("userclickaddextralecture",true);
        mv.addObject("depTimeTable",depTimeTable);
        mv.addObject("dateLectureHall",dateLectureHall);
        mv.addObject("dateLecture",dateLecture);
        mv.addObject("ntimeTable",timeTable);
        mv.addObject("lecturename",lecturename);
        mv.addObject("lecturehall",lecturehall);
        mv.addObject("course",course);
        mv.addObject("department",department);
        mv.addObject("startid",startid);
        mv.addObject("endid",endid);

        mv.addObject("userclicksearchextralecture",true);

        mv.addObject("startsid",startsid);
        mv.addObject("endsid",endsid);
        mv.addObject("depid",depid);
        mv.addObject("semid",semid);
        mv.addObject("day",day);
        mv.addObject("courseid",courseid);
        mv.addObject("lectureid",lectureid);
        mv.addObject("hallid",hallid);


        //String url="redirect:/adding/newlecture/"+depid+"/"+semid+"/add?operation=extralecture";

        return mv;

    }
    /*

   @RequestMapping(value ="adding/newlecture/{day}/{startsid}/{endsid}/{depid}/{semid}/{courseid}/{lectureid}/{hallid}/adding", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView addingextralecturectivation(@PathVariable("day")String day,@PathVariable("startsid")int startid,@PathVariable("endsid")int endid,@PathVariable("depid")int depid,@PathVariable("semid")int semid,@PathVariable("courseid")int courseid,@PathVariable("lectureid")int lectureid,@PathVariable("hallid")int hallid) {

        TimeTable addTimeTable = new TimeTable();
        addTimeTable.setDay(day);
        addTimeTable.setActive(true);
        addTimeTable.setState("new");

        Time starttime = new Time();
        starttime = timeDao.get(startid);
        addTimeTable.setStartTime(starttime);

        Time endtime = new Time();
        endtime = timeDao.get(endid);
        addTimeTable.setStartTime(endtime);

        Department addDepartment = new Department();
        addDepartment = departmentDao.get(depid);
        addTimeTable.setDepartment(addDepartment);

        Semester addSemester = new Semester();
        addSemester = semesterDao.get(semid);
        addTimeTable.setSemester(addSemester);

        Lecture addLecture = new Lecture();
        addLecture = lectureDao.get(lectureid);
        addTimeTable.setLecture(addLecture);

        LectureHall addLectureHall = new LectureHall();
        addLectureHall = lectureHallDao.get(hallid);
        addTimeTable.setLectureHall(addLectureHall);

        Course addCourse = new Course();
        addCourse = courseDao.get(courseid);
        addTimeTable.setCourse(addCourse);

        timeTableDao.addTimeTable(addTimeTable);

        //addTimeTable = timeTableDao.addextralecture(day,startid,endid,depid,semid,courseid,lectureid,hallid);

        String url = "adding/newlecture/"+depid+"/"+semid+"/add?operation=addingExtraLecture";
        return new ModelAndView(url);

    }

*/



    @RequestMapping(value = {"canceling/{dep}/{sem}/lecture"})
    public ModelAndView CancelingLecture(@RequestParam(name = "operation",required = false)String operation,@PathVariable("dep") int dep,@PathVariable("sem") int sem){

        List<TimeTable> mondaytimetable = timeTableDao.getMondayTimeTableList(dep,sem);
        List<TimeTable> tuesdaytimetable = timeTableDao.getTuesdayTimeTableList(dep,sem);
        List<TimeTable> wednesdaytimetable = timeTableDao.getWednesdayTimeTableList(dep,sem);
        List<TimeTable> thursdaytimetable = timeTableDao.getThursdayTimeTableList(dep,sem);
        List<TimeTable> fridaytimetable = timeTableDao.getFridayTimeTableList(dep,sem);
        String monday = "Monday";
        String tuesday = "Tuesday";
        String wednesday = "Wednesday";
        String thursday = "Thursday";
        String friday = "Friday";

        ModelAndView mv = new ModelAndView("cancelinglectureview");
        mv.addObject("title","TimeTable");
        mv.addObject("mondayTime",mondaytimetable);
        mv.addObject("tuesdayTime",tuesdaytimetable);
        mv.addObject("wednesdayTime",wednesdaytimetable);
        mv.addObject("thursdayTime",thursdaytimetable);
        mv.addObject("fridayTime",fridaytimetable);
        mv.addObject("depid",dep);
        mv.addObject("semid",sem);
        mv.addObject("monday",monday);
        mv.addObject("tuesday",tuesday);
        mv.addObject("wednesday",wednesday);
        mv.addObject("thursday",thursday);
        mv.addObject("friday",friday);

        if(operation!=null){
            if(operation.equals("lectureCancel")){
                mv.addObject("message","Lecture Canceled Successfully");
            }
        }

        return mv;
    }



    @RequestMapping(value ="/reset/lecture/schedule", method = RequestMethod.POST)
    @ResponseBody
    public String handleDepartmentRefActivation() {


       List<TimeTable> resetTimeTable = timeTableDao.getstatenewlecture();
        for (TimeTable element : resetTimeTable) {
            //element.setState("old");
            timeTableDao.delete(element);
        }

        List<TimeTable> resetTable = timeTableDao.getTimeTableList();
        for (TimeTable element : resetTable) {
            element.setActive(true);
            timeTableDao.updatetimetablelectureday(element);
        }

       List<Lecture> resetLecture = lectureDao.lectureList();
        for (Lecture element : resetLecture) {
            element.setActive(true);
            lectureDao.updateLecture(element);
        }
        return  "You have Succesfully Reset the lecture schedule";


    }
    @RequestMapping(value = {"reset/lecture"})
    public ModelAndView resetLEcture(){
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("userclickresetlecture",true);
        mv.addObject("title","Reset");
        return mv;
    }


    //twilio reply messages
@RequestMapping(value = {"sms"},method = RequestMethod.POST)
    public void rplyMessage(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String messagebody = request.getParameter("Body");
    String from = request.getParameter("From");
    //String sendDate = request.getParameter("DateUpdated");

    String timeStamp = new SimpleDateFormat("HH.mm.ss").format(new Date());
    String day  = new SimpleDateFormat("yyyy.MM.dd").format(new Date());

    Response messageResponse = new Response();
    messageResponse.setMessageBody(messagebody);
    messageResponse.setFrommessage(from);
    messageResponse.setSendDate(timeStamp);
    messageResponse.setDay(day);
    messageResponse.setState("received");

    String lectureName;
    String imgUrl;

    try {
        Lecture lecture = lectureDao.getfromcontactnumber(from);
        lectureName = lecture.getFullName();
        imgUrl = lecture.getImageUrl();

    } catch (Exception ex) {
        lectureName = "Unkonwnumber";
        imgUrl = "Imageunknown";

    }
    messageResponse.setLectureName(lectureName);
    messageResponse.setImageUrl(imgUrl);

    responseDao.addResponse(messageResponse);

    Body body = new Body.Builder("FAS - We will inform you shortly regarding your request.").build();
    Message sms =
            new Message.Builder().body(body).build();

    MessagingResponse twiml = new MessagingResponse.Builder().message(sms).build();

    response.setContentType("application/xml");

    try {
        response.getWriter().print(twiml.toXml());
    } catch (TwiMLException e) {
        e.printStackTrace();
    }

}

    @RequestMapping(value = {"view/messages"})
    public ModelAndView viewallMessages(){
        ModelAndView mv = new ModelAndView("messages");
        mv.addObject("userclickviewmessages",true);
        mv.addObject("title","Messages");
        return mv;
    }


    @RequestMapping(value = {"view/{lectureName}/{sendDate}/{messageBody}/{day}/{imageUrl}/{code}/{frommessage}"},method = RequestMethod.GET)
    public ModelAndView viewMessages(@PathVariable("lectureName") String lectureName,@PathVariable("sendDate") String sendDate,@PathVariable("messageBody") String messageBody,@PathVariable("day") String day,@PathVariable("imageUrl") String imageUrl,@PathVariable("code") String code,@PathVariable("frommessage") String frommessage){


        ModelAndView mv = new ModelAndView("page");
        mv.addObject("userclickviewsinglewmessage",true);
        mv.addObject("title","Messages");
        mv.addObject("lectureName",lectureName);
        mv.addObject("sendDate",sendDate);
        mv.addObject("messageBody",messageBody);
        mv.addObject("day",day);
        mv.addObject("imageUrl",imageUrl);
        mv.addObject("code",code);
        mv.addObject("frommessage",frommessage);

        Response messageResponse = new Response();
        mv.addObject("messageresponse",messageResponse);


        return mv;
    }



    @RequestMapping(value = {"handle/reply/{code}"},method = RequestMethod.GET)
    public ModelAndView handlemessagereplySubmissionreplypage( @PathVariable("code")String code) {

        String received = "received";
        String sent = "sent";
        Response sentmessage = responseDao.getResponsesent(code,sent);
        Response receivedmessage = responseDao.getResponserecived(code,received);


        ModelAndView mv = new ModelAndView("page");
        mv.addObject("userclickviewrplymessage",true);
        mv.addObject("title","Messages");
        mv.addObject("receivedmessage",receivedmessage);
        mv.addObject("sentmessage",sentmessage);

        return mv;

    }



    @ModelAttribute("lecture")
    public List<Lecture> getLeturesList(){
        return lectureDao.lectureList();
    }

    @ModelAttribute("lectureHall")
    public List<LectureHall> getLetureHallList(){
        return lectureHallDao.lectureHallList();
    }

    @ModelAttribute("response")
    public List<Response> getmessageList(){
        return responseDao.getlastfive();
    }
    @ModelAttribute("allresponse")
    public List<Response> getallmessageList(){
        return responseDao.getallresponses();
    }

}
