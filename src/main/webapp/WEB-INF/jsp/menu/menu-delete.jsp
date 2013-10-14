<%--
- Author   : Dynastymasra
- Name     : Dimas Ragil T
- Email    : dynastymasra@gmail.com
- LinkedIn : http://www.linkedin.com/in/dynastymasra
- Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="navbar">
    <div class="navbar-inner">
        <ul class="nav">
            <li><a href="<c:url value='/'/>">Home</a></li>
            <li><a href="<c:url value='/mahasiswa/form'/>">Insert</a></li>
            <li><a href="<c:url value='/update'/>">Update</a></li>
            <li class="active"><a href="<c:url value='/delete'/>">Delete</a></li>
        </ul>
    </div>
</div>