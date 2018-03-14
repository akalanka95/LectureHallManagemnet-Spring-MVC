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
    <link href="${css}/messaging.css" rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="${css}/sb-admin.css" rel="stylesheet">
    <link href="${css}/myapp.css" rel="stylesheet">



</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">

<%@include file="./shared/navbar.jsp"%>

<div class="content-wrapper">
    <div class="container-fluid">

        <h2>Recent Chat</h2>



        <div class="alert-info" style="padding-left: 20px;padding-top: 5px;padding-bottom: 5px; padding-right: 20px; height: 130px">
        <img src="../resources/images/${receivedmessage.imageUrl}.jpg" alt="Img">
                <p>${receivedmessage.messageBody}</p>
                <br>
                <p>${receivedmessage.lectureName}</p>
                <span class="time-right">${receivedmessage.sendDate}</span>
                </div>



        <div class="alert-info" style="padding-left: 20px;padding-top: 5px;padding-bottom: 5px; padding-right: 20px; height: 130px">
           <img src="../resources/images/${sentmessage.imageUrl}.jpg" alt="Img">
                <p>${sentmessage.messageBody}</p>
                <br>
                <p>${sentmessage.lectureName}</p>
                <span class="time-right">${sentmessage.sendDate}</span>
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
</div>
</body>

</html>

