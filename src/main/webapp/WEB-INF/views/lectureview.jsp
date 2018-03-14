<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <%@include file="./shared/breadcrum.jsp"%>
        <!-- Icon Cards-->
        <div class="jumbotron" style="text-align: center; align-items: center; background-color: #4CAF50; padding: 8px">
            <h1 style="color: white;" >${size} Lectures allready added.You can Add a new lecture here.</h1><br>
            <a style="text-align: center"  href="${contextroot}/manage/lecture" class="btn btn-warning btn-lg" role="button" aria-pressed="true" >Add New Lecture</a>
        </div>
        <!-- Area Chart Example-->

        <!--Json data table-->

        <div class="row">
            <div class="col-md-12">

                <div class="container-fluid">
                    <div class="table-responsive">
                        <table id="lectureList"
                               class="table table-hover table-condensed">
                            <thead>
                            <tr>
                                <th></th>
                                <th>Name</th>
                                <th>Address</th>
                                <th>Email</th>
                                <th>Department</th>
                                <th>Contact</th>
                                <th>Enable</th>
                                <th>View/Edit</th>

                            </tr>
                            </thead>
                            <tfooter>
                                <tr>
                                    <th></th>
                                    <th>Name</th>
                                    <th>Address</th>
                                    <th>Email</th>
                                    <th>Department</th>
                                    <th>Contact</th>
                                    <th>Enable<</th>
                                    <th>View/Edit</th>

                                </tr>
                            </tfooter>

                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>