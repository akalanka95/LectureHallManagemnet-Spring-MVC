<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
    <link href="${css}/messaging.css" rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="${css}/sb-admin.css" rel="stylesheet">
    <link href="${css}/myapp.css" rel="stylesheet">



</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">

<%@include file="./shared/navbar.jsp"%>

<div class="content-wrapper" >
        <div class="card mb-3" style="margin-right: 120px; margin-left: 120px">
            <div class="card-header">
                <br>
                <h2><b>Recent Chat</b></h2>
                <br>
            </div>
            <div class="card-body">
                <div class="alert-info" style="padding-left: 20px;padding-top: 5px;padding-bottom: 5px; padding-right: 20px; height: 130px">
                <img src="../resources/images/${imageUrl}.jpg" alt="Image" style="float: left;margin-right: 20px">
                <p>${messageBody}</p>
                <br>
                <p>${lectureName}</p>
                <span class="time-right">${sendDate}</span>
                </div>
            </div>

                <br>
                <br>

        <div class="alert alert-warning">
                <sf:form action="${contextroot}/handle/${lectureName}/${code}/${frommessage}" method="POST" class="formrply" modelAttribute="messageresponse">

                    <div class="form-group row">
                        <sf:textarea rows="5" cols="40" path="messageBody" class="form-control form-rounded"/>
                    </div>
                    <div class="form-group row">

                        <div class="offset-md-3 col-md-9">
                            <input type="submit" class="btn btn-primary" id="submit"
                                name="submit" value="Reply">
                            <sf:hidden path="id"></sf:hidden>
                            <sf:hidden path="imageUrl"></sf:hidden>
                            <sf:hidden path="sendDate"></sf:hidden>
                            <sf:hidden path="frommessage"></sf:hidden>
                            <sf:hidden path="lecturename"></sf:hidden>
                            <sf:hidden path="day"></sf:hidden>
                            <sf:hidden path="state"></sf:hidden>
                            <sf:hidden path="code"></sf:hidden>
                        </div>

                    </div>

                </sf:form>
        </div>
        </div>

    </div>



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
    <script src="${js}/myappcancel.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="${js}/sb-admin.min.js"></script>
    <script src="${js}/time.js"></script>
    <!-- Custom scripts for this page-->
    <script src="${js}/sb-admin-datatables.min.js"></script>
    <script src="${js}/sb-admin-charts.min.js"></script>
    <script src="${js}/myapp.js"></script>

</body>

</html>

