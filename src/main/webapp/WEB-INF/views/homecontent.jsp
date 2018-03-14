<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <%@include file="./shared/breadcrum.jsp"%>
        <!-- Icon Cards-->
        <%@include file="./shared/iconcard.jsp"%>

        <!-- Area Chart Example-->

        <div class="row">
            <div class="col-lg-7" style="padding-top: 40px">
                <!-- Example Bar Chart Card-->
                <div class="card mb-3">
                <div class="card-header">
                    <i class="fa fa-bar-chart"></i> Department</div>
                <div class="card-body"  style="padding-top: 40px">
                <canvas id="doughnutChart" width="100%"  ></canvas>
                </div>
                </div>
            </div>


            <div class="col-lg-5" style="padding-top: 40px">
                <!-- Example Pie Chart Card-->
                <br>
                <br>
                <div class="card mb-3">
                <div class="card-header">
                    <i class="fa fa-bar-chart"></i> Lecture Hall Capacity</div>
                <div class="card-body"  style="padding-top: 40px">
                <canvas id="barChart" width="100%"></canvas>
                </div>
                </div>


                <!-- Example Notifications Card-->

            </div>
        </div>
        <!-- Example DataTables Card-->
        <div class="card mb-3">
            <div class="card-header">
                <i class="fa fa-table"></i>Course Details</div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="courselist" width="100%" cellspacing="0">
                        <thead>
                        <tr>
                            <th>Code</th>
                            <th>Course Name</th>
                            <th>Year</th>
                            <th>Semester</th>
                            <th>Department</th>
                            <th>Lecture</th>

                        </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>Code</th>
                                <th>Course Name</th>
                                <th>Year</th>
                                <th>Semester</th>
                                <th>Department</th>
                                <th>Lecture</th>

                            </tr>
                        </tfoot>

                    </table>
                </div>
            </div>
            <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
        </div>
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->

</div>