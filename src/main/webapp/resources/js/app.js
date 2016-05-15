var bookCrossing = angular.module('bookCrossing', [
    'ngRoute',
    'ngResource',
    'ngAnimate',
    'navbarCtrl',
    'sidebarCtrl',
    'bookService',
    'bookCtrls',
    'transferService'
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
            .when('/createBook', {
                templateUrl: '/resources/js/books/newBook.html',
                controller: 'bookCreationCtrl'
            })
            .otherwise({
                redirectTo: '/books'
            });

    }]);