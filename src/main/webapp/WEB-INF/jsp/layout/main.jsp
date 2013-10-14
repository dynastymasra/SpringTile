<%--
- Author   : Dynastymasra
- Name     : Dimas Ragil T
- Email    : dynastymasra@gmail.com
- LinkedIn : http://www.linkedin.com/in/dynastymasra
- Blogspot : dynastymasra.wordpress.com | dynastymasra.blogspot.com
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<c:url value='/bootstrap/css/style.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/bootstrap/css/bootstrap.min.css'/>">
    <link rel="stylesheet" type="text/css" href="<c:url value='/bootstrap/css/bootstrap-responsive.min.css'/>">
    <script type="text/javascript" src="<c:url value='/bootstrap/js/bootstrap.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/bootstrap/js/jquery-1.9.1.min.js'/>"></script>
    <style type="text/css">

            /* Customize the navbar links to be fill the entire space of the .navbar */
        .navbar .navbar-inner {
            padding: 0;
        }

        .navbar .nav {
            margin: 0;
            display: table;
            width: 100%;
        }

        .navbar .nav li {
            display: table-cell;
            width: 1%;
            float: none;
        }

        .navbar .nav li a {
            font-weight: bold;
            text-align: center;
            border-left: 1px solid rgba(255, 255, 255, .75);
            border-right: 1px solid rgba(0, 0, 0, .1);
        }

        .navbar .nav li:first-child a {
            border-left: 0;
            border-radius: 3px 0 0 3px;
        }

        .navbar .nav li:last-child a {
            border-right: 0;
            border-radius: 0 3px 3px 0;
        }
    </style>

    <title>Spring Tile</title>
</head>
<body>
<div class="container">
    <div class="masthead">
        <tiles:insertAttribute name="head-content"/>
        <tiles:insertAttribute name="menu-content"/>
    </div>
    <div class="row-fluid">
        <tiles:insertAttribute name="main-content"/>
        <tiles:insertAttribute name="footer-content"/>
    </div>
</div>
</body>
</html>
