<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <%@include file="./shared/breadcrum.jsp"%>
        <!-- Icon Cards-->




    <%@ page import="java.util.Date" %>
       <!-- <div class="row" >
            <div class="col-xl-3 col-sm-6 mb-3">
                <div class="card text-white bg-primary o-hidden h-100">
                    <div class="card-body">
                        <div class="card-body-icon">
                            <i class="fa fa-fw fa-comments"></i>
                        </div>
                        <div class="mr-5">
                            <%
                                Date date = new Date();
                                out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
                            %></div>
                    </div>
                    <a class="card-footer text-white clearfix small z-1" href="#">
                <span class="float-left"><center>
                    <h1> Current Date & Time</h1>
                </center></span>
                        <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
                    </a>
                </div>
            </div>
            <div class="col-xl-3 col-sm-6 mb-3">
                <div class="card text-white bg-warning o-hidden h-100">
                    <div class="card-body">
                        <div class="card-body-icon">
                            <i class="fa fa-fw fa-list"></i>
                        </div>
                        <div class="mr-5">${ntimeTable.day}
                        <br><br>${startid} to ${endid}</div>
                    </div>
                    <a class="card-footer text-white clearfix small z-1" href="#">
                        <span class="float-left">You searched Time</span>
                        <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
                    </a>
                </div>
            </div>
            <div class="col-xl-3 col-sm-6 mb-3">
                <div class="card text-white bg-success o-hidden h-100">
                    <div class="card-body">
                        <div class="card-body-icon">
                            <i class="fa fa-fw fa-shopping-cart"></i>
                        </div>
                        <div class="mr-5">${lecturename} at ${lecturehall}</div>
                    </div>
                    <a class="card-footer text-white clearfix small z-1" href="#">
                        <span class="float-left">Lecture Name</span>
                        <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
                    </a>
                </div>
            </div>
            <div class="col-xl-3 col-sm-6 mb-3">
                <div class="card text-white bg-danger o-hidden h-100">
                    <div class="card-body">
                        <div class="card-body-icon">
                            <i class="fa fa-fw fa-support"></i>
                        </div>
                        <div class="mr-5">Confirm Lecture Adding <br>
                            </div>
                    </div>
                    <a class="card-footer text-white clearfix small z-1" href="${contextroot}/adding/newlecture/${day}/${startsid}/${endsid}/${depid}/${semid}/${courseid}/${lectureid}/${hallid}/adding">
                        <span class="float-left">Confirm Adding</span>
                        <span class="float-right">
                <i class="fa fa-angle-right"></i>
              </span>
                    </a>
                </div>
            </div>
        </div>-->



       <!-- <div class="jumbotron" style="text-align: center; align-items: center; background-color: #4CAF50">
            <h1 style="color: white;" >Confirm Lecture will add extra lectures for ${department.departmentName} regarding ${course.courseName} on ${ntimeTable.day} <br><br>at ${startid} to ${endid} in ${lecturehall}</h1>
            <br>

            <a style="text-align: center"  href="${contextroot}/adding/newlecture/${day}/${startsid}/${endsid}/${depid}/${semid}/${courseid}/${lectureid}/${hallid}/adding" class="btn btn-outline-warning btn-lg" role="button" aria-pressed="true" >Confirm Lecture Adding</a>
        </div>-->

        <div class="alert-info" style="background-color:#4CAF50; padding-top: 5px;padding-left: 4px;padding-bottom: 5px">
            <h1 style="color: white"><b>Confirming Lecture will add extra lectures for ${department.departmentName} regarding ${course.courseName} on ${ntimeTable.day} at ${startid} to ${endid} in ${lecturehall}</b></h1>
            <br><a style="text-align: center"  href="${contextroot}/adding/newlecture/${day}/${startsid}/${endsid}/${depid}/${semid}/${courseid}/${lectureid}/${hallid}/adding" class="btn btn-outline-warning btn-lg" role="button" aria-pressed="true" >Confirm Lecture Adding</a>
        </div>

<div class="col-md-12" >

    <div class="cd-schedule loading">
        <div class="timeline">
            <ul>
                <li><span>08:00</span></li>
                <li><span>08:30</span></li>
                <li><span>09:00</span></li>
                <li><span>09:30</span></li>
                <li><span>10:00</span></li>
                <li><span>10:30</span></li>
                <li><span>11:00</span></li>
                <li><span>11:30</span></li>
                <li><span>12:00</span></li>
                <li><span>12:30</span></li>
                <li><span>13:00</span></li>
                <li><span>13:30</span></li>
                <li><span>14:00</span></li>
                <li><span>14:30</span></li>
                <li><span>15:00</span></li>
                <li><span>15:30</span></li>
                <li><span>16:00</span></li>
                <li><span>16:30</span></li>
                <li><span>17:00</span></li>

            </ul>
        </div> <!-- .timeline -->


        <div class="events">
            <ul>


                <li class="events-group" style="width: 25%">
                    <div class="top-info"><span>${ntimeTable.day}</span></div>

                    <ul>
                        <c:forEach items="${depTimeTable}" var="depTimeTable" >

                            <li class="single-event" data-start="${depTimeTable.startTime.time}" data-end="${depTimeTable.endTime.time}" data-content="event-restorative-yoga" data-event="event-4">
                                <a href="#0">
                                    <em class="event-name">${depTimeTable.course.courseName}</em>
                                </a>
                            </li>
                        </c:forEach>
                    </ul>
                </li>

                <li class="events-group" style="width: 25%">
                    <div class="top-info"><span>${lecturehall}</span></div>

                    <ul>
                        <c:forEach items="${dateLectureHall}" var="dateLectureHall">
                            <li class="single-event" data-start="${dateLectureHall.startTime.time}" data-end="${dateLectureHall.endTime.time}"  data-content="event-rowing-workout" data-event="event-2">
                                <a href="#0">
                                    <em class="event-name">${dateLectureHall.department.departmentName}</em>
                                </a>
                            </li>
                        </c:forEach>
                    </ul>
                </li>

                <li class="events-group" style="width: 25%">
                    <div class="top-info"><span>${lecturename}</span></div>

                    <ul>
                        <c:forEach items="${dateLecture}" var="dateLecture">
                            <li class="single-event" data-start="${dateLecture.startTime.time}" data-end="${dateLecture.endTime.time}" data-content="event-abs-circuit" data-event="event-1">
                                <a href="#0">
                                    <em class="event-name">${dateLecture.department.departmentName}</em>
                                </a>
                            </li>
                        </c:forEach>

                    </ul>
                </li>


            </ul>
        </div>


        <div class="event-modal">
            <header class="header">
                <div class="content">
                    <span class="event-date"></span>
                    <h3 class="event-name"></h3>
                </div>

                <div class="header-bg"></div>
            </header>

            <div class="body">
                <div class="event-info"><h3 class="event-name"></h3></div>
                <div class="body-bg"><h3 class="event-name"></h3></div>
            </div>

            <a href="#0" class="close">Close</a>
        </div>

        <div class="cover-layer"></div>
    </div> <!-- .cd-schedule -->

</div>
