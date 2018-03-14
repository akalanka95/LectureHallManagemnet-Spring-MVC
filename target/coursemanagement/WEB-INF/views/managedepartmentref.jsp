<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <%@include file="./shared/breadcrum.jsp"%>




        <div class="row">

            <c:if test="${not empty message}">
                <div class="col-md-12">

                    <div class="alert alert-success alert-dismissible">

                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                            ${message }
                    </div>

                </div>

            </c:if>


            <div class="col-8 mx-auto">

                <div class="card card-primary">

                    <div class="card-header">
                        <h4>Manage DepartmentRef Details</h4>
                    </div>

                    <div class="card-body">

                        <sf:form action="${contextroot }/manage/departmentRef" method="POST" modelAttribute="ndepartmentRef"
                                 enctype="multipart/form-data">

                            <div class="form-group row">
                                <label for="name" class="col-md-3 col-form-label ">
                                    Full Name</label>
                                <div class="col-md-9">
                                    <sf:input type="text" class="form-control" id="name" path="name"
                                              placeholder="Enter Name" />
                                    <sf:errors path="name" cssClass="help-block" element="em"/>





                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="address" class="col-md-3 col-form-label ">
                                    Address</label>
                                <div class="col-md-9">
                                    <sf:input type="text" class="form-control" id="address" path="address"
                                              placeholder="Enter Address" />

                                    <sf:errors path="address" cssClass="help-block" element="em"/>


                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="department" class="col-md-3 col-form-label ">
                                    Select Department</label>
                                <div class="col-md-9">
                                    <sf:select class="form-control" id="departmentId"
                                               path="department" items="${departments}" itemLabel="departmentName"
                                               itemValue="id" />

                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="semester" class="col-md-3 col-form-label ">
                                    Select Semester</label>
                                <div class="col-md-9">
                                    <sf:select class="form-control" id="semesterId"
                                               path="semester" items="${semesters}" itemLabel="semesterName"
                                               itemValue="id" />

                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="department" class="col-md-3 col-form-label ">
                                    Email</label>
                                <div class="col-md-9">
                                    <sf:input type="email" class="form-control" id="email" path="email"
                                              placeholder="Enter Email" />
                                    <sf:errors path="email" cssClass="help-block" element="em"/>


                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="contact" class="col-md-3 col-form-label ">
                                    Contact Number</label>
                                <div class="col-md-9">
                                    <sf:input type="text" class="form-control" id="contact" path="contact"
                                              placeholder="Enter Contact Number" />
                                    <sf:errors path="contact" cssClass="help-block" element="em"/>


                                </div>
                            </div>


                            <!-- File element for image -->
                            <div class="form-group row">

                                <label for="file" class="file-upload col-md-3 col-form-label ">
                                    Select an Image </label>
                                <div class="col-md-9">
                                    <sf:input type="file" class="form-control" id="file" path="file" />
                                    <sf:errors path="file" cssClass="help-block" element="em"/>

                                </div>


                            </div>

                            <div class="form-group row">

                                <div class="offset-md-3 col-md-9">
                                    <input type="submit" class="btn btn-primary" id="submit"
                                           name="submit" value="Sumbit">

                                    <sf:hidden path="id"></sf:hidden>
                                    <sf:hidden path="imageUrl"></sf:hidden>
                                    <sf:hidden path="active"></sf:hidden>

                                </div>


                            </div>


                        </sf:form>


                    </div>

                </div>

            </div>
        </div>




    </div>
</div>

