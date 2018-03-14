<ol class="breadcrumb" style="margin-bottom: 30px">


<c:if test="${userclickhome  == true }">
    <li class="breadcrumb-item">
        <a href="${contextroot}/home">Home</a>
    </li>
    <li class="breadcrumb-item active">Admin Dashboard</li>
</c:if>

    <c:if test="${userclickviewlecture == true }">
        <li class="breadcrumb-item">
            <a href="${contextroot}/home">Home</a>
        </li>
        <li class="breadcrumb-item active">Lectures</li>
    </c:if>

    <c:if test="${userclickviewlecturedetails == true }">
        <li class="breadcrumb-item">
            <a href="${contextroot}/home">Home</a>
        </li>
        <li class="breadcrumb-item"><a href="${contextroot}/view/lectures">Lectures</a></li>
        <li class="breadcrumb-item active">${lecture.fullName}</li>
    </c:if>

    <c:if test="${userclickmanagelecture == true }">
        <li class="breadcrumb-item">
            <a href="${contextroot}/home">Home</a>
        </li>
        <li class="breadcrumb-item"><a href="${contextroot}/view/lectures">Lectures</a></li>
        <li class="breadcrumb-item active">${lecture.fullName}</li>
    </c:if>

    <c:if test="${userclickviewdepartmentRef == true }">
        <li class="breadcrumb-item">
            <a href="${contextroot}/home">Home</a>
        </li>
        <li class="breadcrumb-item active">DepartmentRef</li>
    </c:if>

    <c:if test="${userclickaddextralecture == true }">
        <li class="breadcrumb-item">
            <a href="${contextroot}/home">Home</a>
        </li>
        <li class="breadcrumb-item active">Search</li>
    </c:if>
    <c:if test="${userclicksearchextralecture == true }">
        <li class="breadcrumb-item">
            <a href="${contextroot}/home">Home</a>
        </li>
        <li class="breadcrumb-item active"><a href="${contextroot}/adding/newlecture/${depid}/${semid}/add">Search</a></li>
        <li class="breadcrumb-item active">View</li>
    </c:if>




</ol>
