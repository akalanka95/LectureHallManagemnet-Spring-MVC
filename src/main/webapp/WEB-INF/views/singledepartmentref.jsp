<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <%@include file="./shared/breadcrum.jsp"%>

        <div class="row">
            <div class="col-xs-12 col-sm-4 ">
                <div class="img-thumbnail">
                    <img src="${images }/${departmentRef.imageUrl}.jpg" class="img-fluid">
                </div>
            </div>

            <div class="col-xs-12 col-sm-4 ">
                <div class="thumbnail">
                    <h1>${departmentRef.name}</h1>
                    <hr>
                    <p>${departmentRef.address}</p>
                    <hr>
                    <p>${departmentRef.email}</p>
                    <hr>
                    <p>${departmentRef.department}</p>
                    <hr>
                    <p>${departmentRef.contact}</p>
                    <hr>
                </div>
            </div>
        </div>


    </div>
</div>