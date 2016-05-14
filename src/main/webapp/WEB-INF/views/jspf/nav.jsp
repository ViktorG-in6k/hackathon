<nav class="navbar navbar-default navbar-fixed-top" ng-controller="navbarCtrl">
    <div class="container-fluid">
        <div class="navbar-header">
            <div class="navbar-brand"><b>BookCrossing</b></div>
        </div>


        <div class="navbar-header pull-right" style="right: 10px;">
            <div class="navbar-brand">
                Welcome,
                <span ng-bind="user.data.name"></span>!
                <a class="btn btn-default" href="/logout">Logout</a>
            </div>

        </div>
    </div>
</nav>
