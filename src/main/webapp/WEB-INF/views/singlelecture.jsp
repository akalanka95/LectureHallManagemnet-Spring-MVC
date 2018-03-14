<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <%@include file="./shared/breadcrum.jsp"%>

        <div class="row">
            <div class="col-xs-12 col-sm-4 ">
                <div class="img-thumbnail">
                    <img src="${images }/${lecture.imageUrl}.jpg" class="img-fluid">
                </div>
            </div>

        <div class="col-xs-12 col-sm-4 ">
            <div class="card mb-3" style="margin-left: 30px">
                <div class="card-header">
                    <h1>Personal Details</h1>
                </div>
                <div class="card-body">
                    <h1>Full Name : ${lecture.fullName}</h1>
                <hr>
                    <p>Address : ${lecture.address}</p>
                <hr>
                    <p>Email : ${lecture.email}</p>
                <hr>
                    <p>Department : ${lecture.department.departmentName}</p>
                <hr>
                    <p>Contact : ${lecture.contact}</p>
                <hr>
                </div>
            </div>
            </div>
        </div>
        </div>


    </div>
</div>