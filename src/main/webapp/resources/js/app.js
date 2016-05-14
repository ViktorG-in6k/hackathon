var bookCrossing = angular.module('bookCrossing', [
    'ngRoute',
    'ngResource',
    'navbarCtrl',
    'mainCtrl'
]);

bookCrossing.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider
            .when('/main', {
                templateUrl: '/resources/js/main/main.html',
                controller: 'mainCtrl'
            })
            .otherwise({
                redirectTo: '/main'
            });

    }]);