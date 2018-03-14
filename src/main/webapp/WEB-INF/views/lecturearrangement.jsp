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
    <link href="${css}/myapplecturehall.css" rel="stylesheet">
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">

<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <%@include file="./shared/breadcrum.jsp"%>
        <div class="alert-info" style="background-color:#4CAF50; padding-top: 5px;padding-left: 10px;padding-bottom: 5px;font-size: 2rem">
            <h1 style="color: white"><b>${day} - Lectures Schedule </b></h1>
        </div>

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
                    <li class="events-group">
                        <div class="top-info"><span>Dr.B.T.G.S.Kumara</span></div>

                        <ul>
                            <c:forEach items="${timeTable}" var="timeTable">
                                <c:if test="${timeTable.lecture.fullName eq 'Dr.B.T.G.S.Kumara'}">

                                    <li class="single-event" data-start="${timeTable.startTime.time}" data-end="${timeTable.endTime.time}" data-content="event-abs-circuit" data-event="event-1">
                                        <a href="#0">
                                            <em class="event-name">${timeTable.department.departmentName}</em>

                                        </a>
                                    </li>

                                </c:if>
                            </c:forEach>
                        </ul>
                    </li>

                    <li class="events-group">
                        <div class="top-info"><span>Mr.Priyankar</span></div>

                        <ul>
                            <c:forEach items="${timeTable}" var="timeTable">
                                <c:if test="${timeTable.lecture.fullName eq 'Mr.R.K.Priyankar'}">

                                    <li class="single-event" data-start="${timeTable.startTime.time}" data-end="${timeTable.endTime.time}" data-content="event-abs-circuit" data-event="event-4">
                                        <a href="#0">
                                            <em class="event-name">${timeTable.department.departmentName}</em>

                                        </a>
                                    </li>

                                </c:if>
                            </c:forEach>

                        </ul>
                    </li>

                    <li class="events-group">
                        <div class="top-info"><span>Mr.Kariapper</span></div>

                        <ul>
                            <c:forEach items="${timeTable}" var="timeTable">
                                <c:if test="${timeTable.lecture.fullName eq 'Mr.R.K.A.R.Kariapper'}">

                                    <li class="single-event" data-start="${timeTable.startTime.time}" data-end="${timeTable.endTime.time}" data-content="event-abs-circuit" data-event="event-3">
                                        <a href="#0">
                                            <em class="event-name">${timeTable.department.departmentName}</em>

                                        </a>
                                    </li>

                                </c:if>
                            </c:forEach>
                        </ul>
                    </li>

                    <li class="events-group">
                        <div class="top-info"><span>Mrs.Sugeeswari</span></div>

                        <ul>
                            <c:forEach items="${timeTable}" var="timeTable">
                                <c:if test="${timeTable.lecture.fullName eq 'Mrs.Sugeeswari Lekamge'}">

                                    <li class="single-event" data-start="${timeTable.startTime.time}" data-end="${timeTable.endTime.time}" data-content="event-abs-circuit" data-event="event-5">
                                        <a href="#0">
                                            <em class="event-name">${timeTable.department.departmentName}</em>

                                        </a>
                                    </li>

                                </c:if>
                            </c:forEach>
                        </ul>
                    </li>

                    <li class="events-group">
                        <div class="top-info"><span>Mr.R.L.Dangalla</span></div>

                        <ul>
                            <c:forEach items="${timeTable}" var="timeTable">
                                <c:if test="${timeTable.lecture.fullName eq 'Mr.R.L.Dangalla'}">

                                    <li class="single-event" data-start="${timeTable.startTime.time}" data-end="${timeTable.endTime.time}" data-content="event-abs-circuit" data-event="event-2">
                                        <a href="#0">
                                            <em class="event-name">${timeTable.department.departmentName}</em>

                                        </a>
                                    </li>

                                </c:if>
                            </c:forEach>
                        </ul>
                    </li>
                    <li class="events-group">
                        <div class="top-info"><span>Mr.Jayalath</span></div>

                        <ul>
                            <c:forEach items="${timeTable}" var="timeTable">
                                <c:if test="${timeTable.lecture.fullName eq 'Mr.Jayalath B.Ekanayake'}">

                                    <li class="single-event" data-start="${timeTable.startTime.time}" data-end="${timeTable.endTime.time}" data-content="event-abs-circuit" data-event="event-1">
                                        <a href="#0">
                                            <em class="event-name">${timeTable.department.departmentName}</em>

                                        </a>
                                    </li>

                                </c:if>
                            </c:forEach>
                        </ul>
                    </li>
                    <li class="events-group">
                        <div class="top-info"><span>Dr.M.Nirmali</span></div>

                        <ul>
                            <c:forEach items="${timeTable}" var="timeTable">
                                <c:if test="${timeTable.lecture.fullName eq 'Dr.M.Nirmali Wicramaratne'}">

                                    <li class="single-event" data-start="${timeTable.startTime.time}" data-end="${timeTable.endTime.time}" data-content="event-abs-circuit" data-event="event-3">
                                        <a href="#0">
                                            <em class="event-name">${timeTable.department.departmentName}</em>

                                        </a>
                                    </li>

                                </c:if>
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



