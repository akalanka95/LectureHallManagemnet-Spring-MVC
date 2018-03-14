package com.akalanka.coursemanagement.controller;

import com.akalanka.coursemanagement.backend.dao.*;
import com.akalanka.coursemanagement.backend.dto.*;
import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class PageController2 {


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
        private TimeDao timeDao;
        @Autowired
        private ResponseDao responseDao;

        @RequestMapping(value = "adding/newlecture/{day}/{startsid}/{endsid}/{depid}/{semid}/{courseid}/{lectureid}/{hallid}/adding", method = RequestMethod.GET)
        @ResponseBody
        public ModelAndView addingextralecturectivation(@PathVariable("day") String day, @PathVariable("startsid") int startid, @PathVariable("endsid") int endid, @PathVariable("depid") int depid, @PathVariable("semid") int semid, @PathVariable("courseid") int courseid, @PathVariable("lectureid") int lectureid, @PathVariable("hallid") int hallid) {

            TimeTable addTimeTable = new TimeTable();
            addTimeTable.setDay(day);
            addTimeTable.setActive(true);
            addTimeTable.setState("new");

            Time starttime = new Time();
            starttime = timeDao.get(startid);
            String twilioStartTime = String.valueOf(starttime.getTime());
            addTimeTable.setStartTime(starttime);

            Time endtime = new Time();
            endtime = timeDao.get(endid);
            String twilioendTime = String.valueOf(endtime.getTime());
            addTimeTable.setEndTime(endtime);

            Department addDepartment = new Department();
            addDepartment = departmentDao.get(depid);
            String twilioDepartment = addDepartment.getDepartmentName();
            addTimeTable.setDepartment(addDepartment);

            Semester addSemester = new Semester();
            addSemester = semesterDao.get(semid);
            String twilioSemester = addSemester.getSemesterName();
            addTimeTable.setSemester(addSemester);

            Lecture addLecture = new Lecture();
            addLecture = lectureDao.get(lectureid);
            String twilioLecture = addLecture.getFullName();
            addTimeTable.setLecture(addLecture);


            LectureHall addLectureHall = new LectureHall();
            addLectureHall = lectureHallDao.get(hallid);
            String twilioLectureHall = addLectureHall.getName();
            addTimeTable.setLectureHall(addLectureHall);

            Course addCourse = new Course();
            addCourse = courseDao.get(courseid);
            String twilioCourse = addCourse.getCourseName();
            addTimeTable.setCourse(addCourse);

            timeTableDao.addTimeTable(addTimeTable);

            //getting lecture Contact Number
            String twiliocontactnumberlecture = addLecture.getContact();

            DepartmentRef twiliosenddepref = departmentRefDao.getDepartmentrefsemdep(depid, semid);
            String twiliocontactnumberref = twiliosenddepref.getContact();


            String twiliomessageBody = "  " + twilioLecture + " - Lecture added for " + twilioDepartment + "-" + twilioSemester + " regarding " + twilioCourse + " on " + day + " at " + twilioStartTime + " to "
                    + twilioendTime + " in " + twilioLectureHall;


            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

            Message message = Message
                    .creator(new PhoneNumber(twiliocontactnumberlecture), // to
                            new PhoneNumber(TWILIO_NUMBER), // from
                            twiliomessageBody)
                    .create();

            System.out.println(message.getSid());

            Message message1 = Message
                    .creator(new PhoneNumber(twiliocontactnumberref), // to
                            new PhoneNumber(TWILIO_NUMBER), // from
                            twiliomessageBody)
                    .create();

            System.out.println(message1.getSid());


//Sending MEssage To lecture
       /* try {
            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

            // Build a filter for the MessageList
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("Body", twiliomessageBody));
            params.add(new BasicNameValuePair("To", twiliocontactnumberlecture)); //Add real number here
            params.add(new BasicNameValuePair("From", TWILIO_NUMBER));

            MessageFactory messageFactory = client.getAccount().getMessageFactory();
            Message message = messageFactory.create(params);
            System.out.println(message.getSid());
        }
        catch (TwilioRestException e) {
            System.out.println(e.getErrorMessage());
        }

   //Sending Message to Department ref
        try {
            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

            // Build a filter for the MessageList
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("Body", twiliomessageBody));
            params.add(new BasicNameValuePair("To",twiliocontactnumberref)); //Add real number here
            params.add(new BasicNameValuePair("From", TWILIO_NUMBER));

            MessageFactory messageFactory = client.getAccount().getMessageFactory();
            Message message = messageFactory.create(params);
            System.out.println(message.getSid());
        }
        catch (TwilioRestException e) {
            System.out.println(e.getErrorMessage());
        }
*/
            String url = "redirect:/adding/newlecture/" + depid + "/" + semid + "/add?operation=addingExtraLecture";
            return new ModelAndView(url);

        }

        @RequestMapping(value = {"handle/{lectureName}/{code}/{frommessage}"},method = RequestMethod.POST)
        public String handlemessagereplySubmissionreply(@ModelAttribute("nResponse")Response response, BindingResult result, Model model, HttpServletRequest request, @PathVariable("lectureName")String lectureName, @PathVariable("code")String code,@PathVariable("frommessage")String frommessage) {

            String replymessageBody = response.getMessageBody();

            response.setState("sent");
            response.setCode(code);
            response.setLectureName(lectureName);
            response.setFrommessage("+44567890");

            String timeStamp = new SimpleDateFormat("HH.mm.ss").format(new Date());
            String day  = new SimpleDateFormat("yyyy.MM.dd").format(new Date());

            response.setDay(day);
            response.setSendDate(timeStamp);
            response.setImageUrl("123456");

            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

            Message message = Message
                    .creator(new PhoneNumber(frommessage), // to
                            new PhoneNumber(TWILIO_NUMBER), // from
                            replymessageBody)
                    .create();

            System.out.println(message.getSid());


            responseDao.addResponse(response);

            String url="redirect:/handle/reply/"+code;

            return url;

        }




        @RequestMapping(value ="canceling/{depid}/{semid}/lecture/{day}/{mondayTimecourseid}/{mondayTimestartTimeid}", method = RequestMethod.GET)
        @ResponseBody
        public ModelAndView handlecancelactivation(@PathVariable("depid") int dep,@PathVariable("semid") int sem,@PathVariable("day") String day,@PathVariable("mondayTimecourseid") int mondayTimecourseid,@PathVariable("mondayTimestartTimeid") int mondayTimestartTimeid) {

            List<TimeTable> cancelTimeTable = timeTableDao.cancellecture(day,dep,sem,mondayTimecourseid,mondayTimestartTimeid);
            for (TimeTable element : cancelTimeTable) {
                element.setActive(false);
                timeTableDao.updatetimetablelectureday(element);

                Lecture cancelLecture = element.getLecture();
                String cancellecturename = cancelLecture.getFullName();


                Time cancelLectureTime =  element.getStartTime();
                String cancelLectureStartTime = String.valueOf(cancelLectureTime.getTime());

                LectureHall cancelHall = element.getLectureHall();
                String cancelLectureHall = cancelHall.getName();


                Department cancelDepartment = new Department();
                cancelDepartment = departmentDao.get(dep);
                String cancelDepartmentName = cancelDepartment.getDepartmentName();

                Semester  cancelSemester = new Semester();
                cancelSemester = semesterDao.get(sem);
                String cancelSemName = cancelSemester.getSemesterName();

                Course cancelCourse = new Course();
                cancelCourse = courseDao.get(mondayTimecourseid);
                String cancelcourseName = cancelCourse.getCourseName();


                String twiliocancellecturecontactnumber = cancelLecture.getContact();

                DepartmentRef twiliosenddepref = departmentRefDao.getDepartmentrefsemdep(dep,sem);
                String twiliocontactnumberref = twiliosenddepref.getContact();

                String twiliocancelmessageBody = " Canceling Lecture "+cancellecturename+" - Scheduled lecture for "+cancelDepartmentName+"-"+cancelSemName+" regarding "+ cancelcourseName +" on "+day+" at " +cancelLectureStartTime+" in "+cancelLectureHall+ "cancelled due to some unavoidable reason";


                Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

                Message message = Message
                        .creator(new PhoneNumber(twiliocontactnumberref), // to
                                new PhoneNumber(TWILIO_NUMBER), // from
                                twiliocancelmessageBody)
                        .create();

                System.out.println(message.getSid());

                Message message1 = Message
                        .creator(new PhoneNumber(twiliocancellecturecontactnumber), // to
                                new PhoneNumber(TWILIO_NUMBER), // from
                                twiliocancelmessageBody)
                        .create();

                System.out.println(message1.getSid());


            /*try {
                TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

                // Build a filter for the MessageList
                List<NameValuePair> params = new ArrayList<NameValuePair>();
                params.add(new BasicNameValuePair("Body", twiliocancelmessageBody));
                params.add(new BasicNameValuePair("To", twiliocancellecturecontactnumber)); //Add real number here
                params.add(new BasicNameValuePair("From", TWILIO_NUMBER));

                MessageFactory messageFactory = client.getAccount().getMessageFactory();
                Message message = messageFactory.create(params);
                System.out.println(message.getSid());
            }
            catch (TwilioRestException e) {
                System.out.println(e.getErrorMessage());
            }
*/

            }

            //TimeTable cancelTimeTableuniqe = timeTableDao.getuniqueresult(day,dep,sem,mondayTimecourseid,mondayTimestartTimeid);

            String url1 = "redirect:/canceling/"+dep+"/"+sem+"/lecture?operation=lectureCancel";
            return new ModelAndView(url1);

        }


    }



}
