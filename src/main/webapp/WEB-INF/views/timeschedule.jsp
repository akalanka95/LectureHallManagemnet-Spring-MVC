

<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <%@include file="./shared/breadcrum.jsp"%>

        <div class="alert-info" style="background-color:#4CAF50; padding-top: 5px;padding-left: 10px;padding-bottom: 5px;font-size: 2rem">
                <h1 style="color: white"><b>TimeTable</b></h1>
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
                <div class="top-info"><span>Monday</span></div>

                <ul>

                    <c:forEach items="${mondayTime}" var="mondayTime">
                    <li class="single-event" data-start="${mondayTime.startTime.time}" data-end="${mondayTime.endTime.time}" data-content="event-abs-circuit" data-event="event-1">
                        <a href="#0">
                            <em class="event-name">${mondayTime.course.courseName}</em>
                            <br>
                            <em class="event-info" type="hidden">${mondayTime.lectureHall.name}</em>

                        </a>

                    </li>
                    </c:forEach>

                </ul>
            </li>

            <li class="events-group">
                <div class="top-info"><span>Tuesday</span></div>

                <ul>
                    <c:forEach items="${tuesdayTime}" var="tuesdayTime">
                    <li class="single-event" data-start="${tuesdayTime.startTime.time}" data-end="${tuesdayTime.endTime.time}"  data-content="event-rowing-workout" data-event="event-2">
                        <a href="#0">
                            <em class="event-name">${tuesdayTime.course.courseName}</em>
                            <br>
                            <em class="event-info" type="hidden">${tuesdayTime.lectureHall.name}</em>
                        </a>
                    </li>
                    </c:forEach>
                </ul>
            </li>

            <li class="events-group">
                <div class="top-info"><span>Wednesday</span></div>

                <ul>
                    <c:forEach items="${wednesdayTime}" var="wednesdayTime">
                    <li class="single-event" data-start="${wednesdayTime.startTime.time}" data-end="${wednesdayTime.endTime.time}" data-content="event-restorative-yoga" data-event="event-4">
                        <a href="#0">
                            <em class="event-name">${wednesdayTime.course.courseName}</em>
                            <br>
                            <em class="event-info" type="hidden">${wednesdayTime.lectureHall.name}</em>
                        </a>
                    </li>
                    </c:forEach>
                </ul>
            </li>

            <li class="events-group">
                <div class="top-info"><span>Thursday</span></div>

                <ul>
                    <c:forEach items="${thursdayTime}" var="thursdayTime">
                    <li class="single-event" data-start="${thursdayTime.startTime.time}" data-end="${thursdayTime.endTime.time}" data-content="event-abs-circuit" data-event="event-3">
                        <a href="#0">
                            <em class="event-name">${thursdayTime.course.courseName}</em>
                        <br>
                        <em class="event-info" type="hidden">${thursdayTime.lectureHall.name}</em>
                        </a>
                    </li>
                    </c:forEach>

                </ul>
            </li>

            <li class="events-group">
                <div class="top-info"><span>Friday</span></div>

                <ul>
                        <c:forEach items="${fridayTime}" var="fridayTime">
                    <li class="single-event" data-start="${fridayTime.startTime.time}" data-end="${fridayTime.endTime.time}"  data-content="event-rowing-workout" data-event="event-2">
                        <a href="#0">
                            <em class="event-name">${fridayTime.course.courseName}</em>
                            <br>
                            <em class="event-info" type="hidden">${fridayTime.lectureHall.name}</em>
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
