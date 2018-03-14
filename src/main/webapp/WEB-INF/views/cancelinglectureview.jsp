<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextroot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>CourseManagement - ${title}</title>

    <script>
        window.menu = '${title}';
        window.root ='${contextroot}';
    </script>

    <!-- Bootstrap core CSS-->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
    <!-- Custom fonts for this template-->
    <link href="${css}/font-awesome.min.css" rel="stylesheet" type="text/css">
    <!-- Page level plugin CSS-->
    <link href="${css}/dataTables.bootstrap4.css" rel="stylesheet">
    <link href="${css}/bootstrap-toggle.min.css" rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="${css}/sb-admin.css" rel="stylesheet">
    <link href="${css}/myapptime.css" rel="stylesheet">
</head>



<body class="fixed-nav sticky-footer bg-dark" id="page-top">

<%@include file="./shared/navbar.jsp"%>
<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <%@include file="./shared/breadcrum.jsp"%>

        <div class="jumbotron" style="background-color: darkred">
        <h2 style="color: white; text-align: center"> Confirm Lecture Canceling By pressing on the relevant Lecture Tab</h2>
        </div>
        <c:if test="${not empty message}">
            <div class="col-md-12">

                <div class="alert alert-success alert-dismissible">

                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                        ${message }
                </div>

            </div>

        </c:if>

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

                    <li class="events-group ">
                        <div class="top-info"><span>Monday</span></div>

                        <ul>

                            <c:forEach items="${mondayTime}" var="mondayTime">
                                <li class="single-event " data-start="${mondayTime.startTime.time}" data-end="${mondayTime.endTime.time}" data-content="event-abs-circuit" data-event="event-1">
                                    <a class="id_customized_details_duplicate1" href="${contextroot}/canceling/${depid}/${semid}/lecture/${monday}/${mondayTime.course.id}/${mondayTime.startTime.id}" >
                                        <em class="event-name">${mondayTime.course.courseName}</em>
                                        <br>
                                        <em class="event-info" type="hidden" style="color: white">${mondayTime.lectureHall.name}</em>
                                    </a>

                                </li>
                            </c:forEach>

                        </ul>
                    </li>

                    <li class="events-group">
                        <div class="top-info"><span>Tuesday</span></div>

                        <ul>
                            <c:forEach items="${tuesdayTime}" var="tuesdayTime">
                                <li class="single-event " data-start="${tuesdayTime.startTime.time}" data-end="${tuesdayTime.endTime.time}" data-content="event-abs-circuit" data-event="event-2">
                                    <a class="id_customized_details_duplicate1" href="${contextroot}/canceling/${depid}/${semid}/lecture/${tuesday}/${tuesdayTime.course.id}/${tuesdayTime.startTime.id}" >
                                        <em class="event-name">${tuesdayTime.course.courseName}</em>
                                        <br>
                                        <em class="event-info" type="hidden" style="color: white">${tuesdayTime.lectureHall.name}</em>
                                    </a>

                                </li>
                            </c:forEach>
                        </ul>
                    </li>



                    <li class="events-group">
                        <div class="top-info"><span>Wednesday</span></div>

                        <ul>
                            <c:forEach items="${wednesdayTime}" var="wednesdayTime">
                                <li class="single-event " data-start="${wednesdayTime.startTime.time}" data-end="${wednesdayTime.endTime.time}" data-content="event-abs-circuit" data-event="event-3">
                                    <a class="id_customized_details_duplicate1" href="${contextroot}/canceling/${depid}/${semid}/lecture/${wednesday}/${wednesdayTime.course.id}/${wednesdayTime.startTime.id}" >
                                        <em class="event-name">${wednesdayTime.course.courseName}</em>
                                        <br>
                                        <em class="event-info" type="hidden" style="color: white">${wednesdayTime.lectureHall.name}</em>
                                    </a>

                                </li>
                            </c:forEach>
                        </ul>
                    </li>

                    <li class="events-group">
                        <div class="top-info"><span>Thursday</span></div>

                        <ul>
                            <c:forEach items="${thursdayTime}" var="thursdayTime">
                                <li class="single-event " data-start="${thursdayTime.startTime.time}" data-end="${thursdayTime.endTime.time}" data-content="event-abs-circuit" data-event="event-4">
                                    <a class="id_customized_details_duplicate1" href="${contextroot}/canceling/${depid}/${semid}/lecture/${thursday}/${thursdayTime.course.id}/${thursdayTime.startTime.id}" >
                                        <em class="event-name">${thursdayTime.course.courseName}</em>
                                        <br>
                                        <em class="event-info" type="hidden" style="color: white">${thursdayTime.lectureHall.name}</em>
                                    </a>

                                </li>
                            </c:forEach>
                        </ul>
                    </li>

                    <li class="events-group">
                        <div class="top-info"><span>Friday</span></div>

                        <ul>
                            <c:forEach items="${fridayTime}" var="fridayTime">
                                <li class="single-event " data-start="${fridayTime.startTime.time}" data-end="${fridayTime.endTime.time}" data-content="event-abs-circuit" data-event="event-4">
                                    <a class="id_customized_details_duplicate1" href="${contextroot}/canceling/${depid}/${semid}/lecture/${friday}/${fridayTime.course.id}/${fridayTime.startTime.id}" >
                                        <em class="event-name">${fridayTime.course.courseName}</em>
                                        <br>
                                        <em class="event-info" type="hidden" style="color: white">${fridayTime.lectureHall.name}</em>
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
</div>

<footer class="sticky-footer">
    <div class="container">
        <div class="text-center">
            <small>Copyright © Your Website 2018</small>
        </div>
    </div>
</footer>
<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fa fa-angle-up"></i>
</a>
<!-- Logout Modal-->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                <a class="btn btn-primary" href="login.html">Logout</a>
            </div>
        </div>
    </div>
</div>
<!-- Bootstrap core JavaScript-->
<script src="${js}/jquery.min.js"></script>
<script src="${js}/bootstrap.bundle.min.js"></script>
<!-- Core plugin JavaScript-->
<script src="${js}/jquery.easing.min.js"></script>
<!-- Page level plugin JavaScript-->
<script src="${js}/Chart.min.js"></script>
<script src="${js}/jquery.dataTables.js"></script>
<script src="${js}/dataTables.bootstrap4.js"></script>

<script src="${js}/bootbox.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="${js}/sb-admin.min.js"></script>
<script src="${js}/timenext.js"></script>
<script src="${js}/myappcancel.js"></script>
<!-- Custom scripts for this page-->
<script src="${js}/sb-admin-datatables.min.js"></script>
<script src="${js}/sb-admin-charts.min.js"></script>
<script src="${js}/myapp.js"></script>
</div>
</body>

</html>














