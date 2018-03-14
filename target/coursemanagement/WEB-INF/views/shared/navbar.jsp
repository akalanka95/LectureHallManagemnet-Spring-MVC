<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
    <a class="navbar-brand" href="index.html" style="font-size: 1.40em">Applied Science Lecture Scheduling</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Dashboard">
                <a class="nav-link" href="${contextroot}/">
                    <i class="fa fa-fw fa-dashboard"></i>
                    <span class="nav-link-text">Home</span>
                </a>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Charts">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseViews" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-area-chart"></i>
                    <span class="nav-link-text">View Details</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseViews">
                    <li>
                        <a href="${contextroot}/view/lectures">Lectures</a>
                    </li>
                    <li>
                        <a href="${contextroot}/view/departmentRef">Department Refs</a>
                    </li>
                </ul>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Tables">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseViews1" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-table"></i>
                    <span class="nav-link-text">Time Tables</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseViews1">
                    <li>
                        <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseViews2" >Information System</a>
                        <ul class="sidenav-third-level collapse" id="collapseViews2">
                            <li>
                                <a href="${contextroot}/view/1/1/timetable" >Semester 01</a>

                            </li>
                            <li>
                                <a href="${contextroot}/view/1/2/timetable">Semester 02</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseViews3" >Physical Science</a>
                        <ul class="sidenav-third-level collapse" id="collapseViews3">
                            <li>
                                <a href="${contextroot}/view/2/1/timetable" >Semester 01</a>

                            </li>
                            <li>
                                <a href="${contextroot}/view/2/2/timetable">Semester 02</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseComponents" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-wrench"></i>
                    <span class="nav-link-text">Halls Arrangement</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseComponents">
                    <li>
                        <a href="${contextroot}/view/Monday/lecturehalls">Monday</a>
                    </li>
                    <li>
                        <a href="${contextroot}/view/Tuesday/lecturehalls">Tuesday</a>
                    </li>
                    <li>
                        <a href="${contextroot}/view/Wednesday/lecturehalls">Wednesday</a>
                    </li>
                    <li>
                        <a href="${contextroot}/view/Thursday/lecturehalls">Thursday</a>
                    </li>
                    <li>
                        <a href="${contextroot}/view/Friday/lecturehalls">Friday</a>
                    </li>
                </ul>
            </li>

            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Menu Levels">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-sitemap"></i>
                    <span class="nav-link-text">Lectures Schedule</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseMulti">
                    <li>
                        <a href="${contextroot}/view/Monday/lecture/schedule">Monday</a>
                    </li>
                    <li>
                        <a href="${contextroot}/view/Tuesday/lecture/schedule">Tuesday</a>
                    </li>
                    <li>
                        <a href="${contextroot}/view/Wednesday/lecture/schedule">Wednesday</a>
                    </li>
                    <li>
                        <a href="${contextroot}/view/Thursday/lecture/schedule">Thursday</a>
                    </li>
                    <li>
                        <a href="${contextroot}/view/Friday/lecture/schedule">Friday</a>
                    </li>
                </ul>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Link">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti1" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-sitemap"></i>
                    <span class="nav-link-text">Adding Lecture</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseMulti1">
                    <li>
                        <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti12" >Information System</a>
                        <ul class="sidenav-third-level collapse" id="collapseMulti12">
                            <li>
                                <a href="${contextroot}/adding/newlecture/1/1/add" >Semester 01</a>

                            </li>
                            <li>
                                <a href="${contextroot}/adding/newlecture/1/2/add">Semester 02</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseMulti3" >Physical Science</a>
                        <ul class="sidenav-third-level collapse" id="collapseMulti3">
                            <li>
                                <a href="${contextroot}/adding/newlecture/2/1/add" >Semester 01</a>

                            </li>
                            <li>
                                <a href="${contextroot}/adding/newlecture/2/2/add">Semester 02</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Link">
                <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseViews21" data-parent="#exampleAccordion">
                    <i class="fa fa-fw fa-link"></i>
                    <span class="nav-link-text">Canceling Lecture</span>
                </a>
                <ul class="sidenav-second-level collapse" id="collapseViews21">
                    <li>
                        <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseViews31" >Information System</a>
                        <ul class="sidenav-third-level collapse" id="collapseViews31">
                            <li>
                                <a href="${contextroot}/canceling/1/1/lecture" >Semester 01</a>

                            </li>
                            <li>
                                <a href="${contextroot}/canceling/1/2/lecture">Semester 02</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseViews41" >Physical Science</a>
                        <ul class="sidenav-third-level collapse" id="collapseViews41">
                            <li>
                                <a href="${contextroot}/canceling/2/1/lecture" >Semester 01</a>

                            </li>
                            <li>
                                <a href="${contextroot}/canceling/2/2/lecture">Semester 02</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </li>
            <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Dashboard">
                <a class="nav-link" href="${contextroot}/reset/lecture">
                    <i class="fa fa-fw fa-dashboard"></i>
                    <span class="nav-link-text">Reseting Schedule</span>
                </a>
            </li>
        </ul>
        <ul class="navbar-nav sidenav-toggler">
            <li class="nav-item">
                <a class="nav-link text-center" id="sidenavToggler">
                    <i class="fa fa-fw fa-angle-left"></i>
                </a>
            </li>
        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle mr-lg-2" id="messagesDropdown" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <i class="fa fa-fw fa-envelope"></i>
                    <span class="d-lg-none">Messages
              <span class="badge badge-pill badge-primary">12 New</span>
            </span>
                    <span class="indicator text-primary d-none d-lg-block">
              <i class="fa fa-fw fa-circle"></i>
            </span>
                </a>
                <div class="dropdown-menu" aria-labelledby="messagesDropdown">
                    <h6 class="dropdown-header">New Messages:</h6>
                    <div class="dropdown-divider"></div>
                    <c:forEach items="${response}" var="response">
                    <a class="dropdown-item" href="${contextroot}/view/${response.lectureName}/${response.sendDate}/${response.messageBody}/${response.day}/${response.imageUrl}/${response.code}/${response.frommessage}">
                        <strong>${response.lectureName}</strong>
                        <br>
                        <span class="small float-right text-muted">${response.sendDate}</span>
                        <br>
                        <div class="dropdown-message small">${response.messageBody}</div>
                    </a>
                    <div class="dropdown-divider"></div>
                    </c:forEach>
                    <a class="dropdown-item small" href="${contextroot}/view/messages">View all messages</a>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle mr-lg-2" id="alertsDropdown" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <i class="fa fa-fw fa-bell"></i>
                    <span class="d-lg-none">Alerts
              <span class="badge badge-pill badge-warning">6 New</span>
            </span>
                    <span class="indicator text-warning d-none d-lg-block">
              <i class="fa fa-fw fa-circle"></i>
            </span>
                </a>
                <div class="dropdown-menu" aria-labelledby="alertsDropdown">
                    <h6 class="dropdown-header">New Alerts:</h6>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">
              <span class="text-success">
                <strong>
                  <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong>
              </span>
                        <span class="small float-right text-muted">11:21 AM</span>
                        <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">
              <span class="text-danger">
                <strong>
                  <i class="fa fa-long-arrow-down fa-fw"></i>Status Update</strong>
              </span>
                        <span class="small float-right text-muted">11:21 AM</span>
                        <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">
              <span class="text-success">
                <strong>
                  <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong>
              </span>
                        <span class="small float-right text-muted">11:21 AM</span>
                        <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
                    </a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item small" href="#">View all alerts</a>
                </div>
            </li>
            <li class="nav-item">
                <form class="form-inline my-2 my-lg-0 mr-lg-2">
                    <div class="input-group">
                        <input class="form-control" type="text" placeholder="Search for...">
                        <span class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fa fa-search"></i>
                </button>
              </span>
                    </div>
                </form>
            </li>
            <li class="nav-item">
                <a class="nav-link" data-toggle="modal" data-target="#exampleModal">
                    <i class="fa fa-fw fa-sign-out"></i>Logout</a>
            </li>
        </ul>
    </div>
</nav>