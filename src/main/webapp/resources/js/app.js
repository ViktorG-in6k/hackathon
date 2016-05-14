var bookCrossing = angular.module('bookCrossing', [
    'ngRoute',
    'ngResource',
    'ngAnimate',
    'navbarCtrl',
    'sidebarCtrl',
    'bookService',
    'bookCtrls'
]);

bookCrossing.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider
            .when('/books', {
                templateUrl: '/resources/js/books/books.html',
                controller: 'booksCtrl'
            })
            .when('/books/:bookId', {
                templateUrl: '/resources/js/books/book.html',
                controller: 'bookDetailCtrl'
            })
            .otherwise({
                redirectTo: '/books'
            });

    }]);