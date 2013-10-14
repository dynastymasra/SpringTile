<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="navbar">
    <div class="navbar-inner">
        <ul class="nav">
            <li class="active"><a href="<c:url value='/'/>">Home</a></li>
            <li><a href="<c:url value='/mahasiswa/form'/>">Insert</a></li>
            <li><a href="<c:url value='/update'/>">Update</a></li>
            <li><a href="<c:url value="/delete"/>">Delete</a></li>
        </ul>
    </div>
</div>
