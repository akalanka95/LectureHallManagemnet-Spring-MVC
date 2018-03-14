
<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <%@include file="./shared/breadcrum.jsp"%>
        <!-- Icon Cards-->

        <div class="row">

            <c:if test="${not empty message1}">
                <div class="col-md-12">

                    <div class="alert alert-success alert-dismissible" >

                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                            ${message1}
                    </div>

                </div>

            </c:if>

            <div class="col-8 mx-auto">

                <div class="card card-primary">

                    <div class="card-header">
                        <h4>Adding Extra Lecture</h4>
                    </div>

                    <div class="card-body">

                        <sf:form action="${contextroot }/adding/newlecture/${depid}/${semid}" method="POST" modelAttribute="ntimeTable"
                                 >

                            <div class="form-group row">
                                <label for="day" class="col-md-3 col-form-label ">
                                    Day</label>
                                <div class="col-md-9">
                                    <sf:select class="form-control" id="day" path="day">
                                        <option>Monday</option>
                                        <option>Tuesday</option>
                                        <option>Wednesday</option>
                                        <option>Thursday</option>
                                        <option>Friday</option>
                                    </sf:select>

                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="startTime" class="col-md-3 col-form-label ">
                                    Start Time</label>
                                <div class="col-md-9">
                                    <sf:select class="form-control" id="startTime"
                                               path="startTime.id" items="${timeList}" itemLabel="time"
                                               itemValue="id" />

                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="endTime" class="col-md-3 col-form-label ">
                                    End Time</label>
                                <div class="col-md-9">
                                    <sf:select class="form-control" id="endTime"
                                               path="endTime.id" items="${timeList}" itemLabel="time"
                                               itemValue="id" />


                                </div>
                            </div>


                            <div class="form-group row">
                                <label for="department" class="col-md-3 col-form-label ">
                                    Enter Department</label>
                                <div class="col-md-9">
                                    <sf:select class="form-control" id="department"
                                               path="department.id" items="${departmentList}" itemLabel="departmentName"
                                               itemValue="id" />


                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="semester" class="col-md-3 col-form-label ">
                                    Enter Semester</label>
                                <div class="col-md-9">
                                    <sf:select class="form-control" id="semester"
                                               path="semester.id" items="${semesterList}" itemLabel="semesterName"
                                               itemValue="id" />
                                </div>
                            </div>



                            <div class="form-group row">
                                <label for="lectureHall" class="col-md-3 col-form-label ">
                                    Select Lecture Hall</label>
                                <div class="col-md-9">
                                    <sf:select class="form-control" id="lectureHall"
                                               path="lectureHall.id" items="${lectureHall}" itemLabel="Name"
                                               itemValue="id" />

                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="lecture" class="col-md-3 col-form-label ">
                                    Select Lecture</label>
                                <div class="col-md-9">
                                    <sf:select class="form-control" id="lecture"
                                               path="lecture.id" items="${lecture}" itemLabel="fullName"
                                               itemValue="id" />

                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="course" class="col-md-3 col-form-label ">
                                    Select Course</label>
                                <div class="col-md-9">
                                    <sf:select class="form-control" id="course"
                                               path="course.id" items="${courseList}" itemLabel="courseName"
                                               itemValue="id" />

                                </div>
                            </div>




                            <div class="form-group row">

                                <div class="offset-md-3 col-md-9">
                                    <input type="submit" class="btn btn-primary" id="submit"
                                           name="submit" value="Sumbit">

                                    <sf:hidden path="id"></sf:hidden>
                                    <sf:hidden path="acive"></sf:hidden>
                                    <sf:hidden path="state"></sf:hidden>



                                </div>


                            </div>


                        </sf:form>


                    </div>

                </div>

            </div>
        </div>

    </div>
</div>

