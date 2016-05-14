<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" ng-app="bookCrossing">
<head>
    <meta content='text/html; charset=UTF-8' http-equiv='Content-Type'/>
    <title>Bookcrossing</title>
    <link href="/resources/css/lib/bootstrap.min.css" rel="stylesheet"/>
    <link href="/resources/css/lib/bootstrap-theme.css" rel="stylesheet"/>
    <link href="/resources/css/main.css" rel="stylesheet"/>
    <link href="/resources/css/books.css" rel="stylesheet"/>
    <link href="/resources/css/sidebar.css" rel="stylesheet"/>
    <link href="/resources/css/navbar.css" rel="stylesheet"/>


</head>
<body>
<jsp:include page="/WEB-INF/views/jspf/nav.jsp" flush="true"/>
<br/>
<div class="app-container">
    <div class="col-md-2 col-sm-12">
        <jsp:include page="/WEB-INF/views/jspf/sidebar.jsp" flush="true"/>
    </div>
    <div class="col-md-10 col-sm-12">
        <div ng-view></div>
    </div>
</div>
<script src="/resources/js/lib/angular.min.js"></script>
<script src="/resources/js/lib/angular-route.min.js"></script>
<script src="/resources/js/lib/angular-resource.js"></script>
<script src="/resources/js/lib/angular-animate.js"></script>

<script src="/resources/js/app.js"></script>
<script src="/resources/js/navbarCtrl.js"></script>
<script src="/resources/js/sidebarCtrl.js"></script>
<script src="/resources/js/books/bookService.js"></script>
<script src="/resources/js/books/bookCtrl.js"></script>


</body>
</html>