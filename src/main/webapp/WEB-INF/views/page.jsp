<%@include file="./shared/header.jsp"%>
<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<!-- Navigation-->
<%@include file="./shared/navbar.jsp"%>

<c:if test="${userclickhome  == true }">
    <%@include file="homecontent.jsp"%>
</c:if>

<c:if test="${userclickviewlecture== true }">
    <%@include file="lectureview.jsp"%>
</c:if>

<c:if test="${userclickviewlecturedetails == true }">
    <%@include file="singlelecture.jsp"%>
</c:if>

<c:if test="${userclickmanagelecture == true }">
    <%@include file="managelecture.jsp"%>
</c:if>


<c:if test="${userclickviewdepartmentRef == true }">
    <%@include file="departmentrefview.jsp"%>
</c:if>

<c:if test="${userclickviewdepartmentRefDetails == true }">
    <%@include file="singledepartmentref.jsp"%>
</c:if>

<c:if test="${userclickmanagedepartmentRef == true }">
    <%@include file="managedepartmentref.jsp"%>
</c:if>
<c:if test="${userclickviewdepartmenttimetable == true }">
    <%@include file="timeschedule.jsp"%>
</c:if>

<c:if test="${userclickviewlecturehallarrangements == true }">
    <%@include file="lecturehallarrangement.jsp"%>
</c:if>

<c:if test="${userclickviewlecturearrangements == true }">
    <%@include file="lecturearrangement.jsp"%>
</c:if>

<c:if test="${userclickaddextralecture == true }">
    <%@include file="addingnewlecture.jsp"%>
</c:if>

<c:if test="${userclicksearchextralecture == true }">
    <%@include file="addinglecturesearchtable.jsp"%>
</c:if>


<c:if test="${userclickresetlecture == true }">
    <%@include file="resetschedule.jsp"%>
</c:if>

<c:if test="${userclicktwilio == true }">
    <%@include file="twilio.jsp"%>
</c:if>

<c:if test="${userclickviewmessages == true }">
    <%@include file="messages.jsp"%>
</c:if>


<c:if test="${userclickviewsinglewmessage == true }">
    <%@include file="singlemessage.jsp"%>
</c:if>

<c:if test="${userclickviewrplymessage == true }">
    <%@include file="replymessage.jsp"%>
</c:if>




<%@include file="./shared/footer.jsp"%>