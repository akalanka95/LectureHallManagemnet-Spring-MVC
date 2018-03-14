package com.akalanka.coursemanagement.controller;


import com.akalanka.coursemanagement.backend.dao.*;
import com.akalanka.coursemanagement.backend.dto.*;
import com.akalanka.coursemanagement.util.FileUploadUtility;
import com.akalanka.coursemanagement.validator.DepartmentRefValidator;
import com.akalanka.coursemanagement.validator.LectureValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    private LectureDao lectureDao;

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private DepartmentRefDao departmentRefDao;

    @Autowired
    private TimeTableDao timeTableDao;

    @Autowired
    private SemesterDao semesterDao;

    @Autowired
    private  ResponseDao responseDao;

    @RequestMapping(value = {"/lecture"},method = RequestMethod.GET)
    public ModelAndView editLecture(@RequestParam(name = "operation",required = false)String operation){


        Lecture nLecture = new Lecture();

        nLecture.setActive(true);

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("userclickmanagelecture",true);
        mv.addObject("title","AddLecture");
        mv.addObject("nlecture",nLecture);

        System.out.print("inside manage lecture");


        if(operation!=null){
            if(operation.equals("lecture")){
                mv.addObject("message","Lecture Details Added Successfully");
            }
        }

        return mv;
    }

    @RequestMapping(value = {"/lecture"},method = RequestMethod.POST)
    public String handleLectureSubmission(@Valid @ModelAttribute("nlecture")Lecture mLecture, BindingResult result, Model model,HttpServletRequest request){

        new LectureValidator().validate(mLecture, result);

        if(result.hasErrors()){
            model.addAttribute("userclickmanagelecture",true);
            model.addAttribute("title","AddLecture");
            model.addAttribute("message","Validation Failed");

            return "page";

        }

        lectureDao.addLecture(mLecture);

        if(!(mLecture.getFile().getOriginalFilename().equals(""))) {
            FileUploadUtility.uploadFile(request,mLecture.getFile(),mLecture.getImageUrl());
        }

        return "redirect:/manage/lecture?operation=lecture";
    }


    @RequestMapping(value ="{id}/lecture",method = RequestMethod.GET)
    public ModelAndView showUpdateProducts(@PathVariable int id) {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","Edit Lecture");
        mv.addObject("userclickmanagelecture",true);

        //fetch the product
        Lecture uLecture = lectureDao.get(id);


        mv.addObject("nlecture",uLecture);

        return mv;
    }

    @RequestMapping(value ="/lecture/{id}/activation", method = RequestMethod.POST)
    @ResponseBody
    public String handleProductactivation(@PathVariable int id) {

        String day;
        Lecture lecture = lectureDao.get(id);
        boolean isActive = lecture.isActive();

        Date now = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        day = simpleDateformat.format(now);
        //day = "Monday";
        List<TimeTable> timeTable = timeTableDao.getlecturedayid(day,id);
        List<TimeTable> timeTableonlyid = timeTableDao.getlecturedayonlyid(id);

        if(isActive){

            for (TimeTable element : timeTable) {
                element.setActive(false);
                timeTableDao.updatetimetablelectureday(element);
            }

        }else{
            for (TimeTable element : timeTableonlyid) {
                element.setActive(true);
                timeTableDao.updatetimetablelectureday(element);
            }
        }

        lecture.setActive(!isActive);

        lectureDao.updateLecture(lecture);
        return (isActive)? "You have Succesfully Deactivated the lecture account with name " + lecture.getFullName()
                :"You have Succesfully Activated the lecture account with name " + lecture.getFullName();

    }

    @ModelAttribute("departments")
    public List<Department> getdepartment(){
        return departmentDao.getDepartmentList();
    }

    @ModelAttribute("semesters")
    public List<Semester> getsemester(){
        return semesterDao.allSemesterList();
    }


    //DepartmentRef controlles Start Here


    @RequestMapping(value = {"/departmentRef"},method = RequestMethod.GET)
    public ModelAndView editDepartmentRef(@RequestParam(name = "operation",required = false)String operation){


        DepartmentRef nDepartmentRef = new DepartmentRef();

        nDepartmentRef.setActive(true);

        ModelAndView mv = new ModelAndView("page");
        mv.addObject("userclickmanagedepartmentRef",true);
        mv.addObject("title","AddDepartmentRef");
        mv.addObject("ndepartmentRef",nDepartmentRef);

        //System.out.print("inside manage lecture");


        if(operation!=null){
            if(operation.equals("departmentRef")){
                mv.addObject("message"," Details Added Successfully");
            }
        }

        return mv;
    }

    @RequestMapping(value = {"/departmentRef"},method = RequestMethod.POST)
    public String handleDepartmentRefSubmission(@Valid @ModelAttribute("ndepartmentRef")DepartmentRef mdepartmentRef, BindingResult result, Model model,HttpServletRequest request){

        new DepartmentRefValidator().validate(mdepartmentRef, result);

        if(result.hasErrors()){
            model.addAttribute("userclickmanagedepartmentRef",true);
            model.addAttribute("title","AddDepartmentRef");
            model.addAttribute("message","Validation Failed");

            return "page";

        }

        departmentRefDao.addDepartmentRef(mdepartmentRef);

        if(!(mdepartmentRef.getFile().getOriginalFilename().equals(""))) {
            FileUploadUtility.uploadFile(request,mdepartmentRef.getFile(),mdepartmentRef.getImageUrl());
        }

        return "redirect:/manage/departmentRef?operation=departmentRef";
    }


    @RequestMapping(value ="{id}/departmentRef",method = RequestMethod.GET)
    public ModelAndView showUpdateDepartmentRef(@PathVariable int id) {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title","Edit DepartmentRef");
        mv.addObject("userclickmanagedepartmentRef",true);

        //fetch the product
        DepartmentRef uDepartmentRef = departmentRefDao.get(id);

        mv.addObject("ndepartmentRef",uDepartmentRef);

        return mv;
    }

    @RequestMapping(value ="/departmentRef/{id}/activation", method = RequestMethod.POST)
    @ResponseBody
    public String handleDepartmentRefActivation(@PathVariable int id) {


        DepartmentRef departmentRef = departmentRefDao.get(id);
        boolean isActive = departmentRef.isActive();

        departmentRef.setActive(!isActive);

        departmentRefDao.updateDepartmentRef(departmentRef);
        return (isActive)? "You have Succesfully Deactivated the lecture account with name " + departmentRef.getName()
                :"You have Succesfully Activated the lecture account with name " + departmentRef.getName();

    }


    @ModelAttribute("response")
    public List<Response> getmessageList(){
        return responseDao.getlastfive();
    }





}
