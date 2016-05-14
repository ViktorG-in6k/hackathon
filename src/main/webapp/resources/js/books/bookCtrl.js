var module = angular.module('bookCtrls', []);

module.controller('booksCtrl', ['$scope', 'Book',
    function ($scope, Book) {
        $scope.books = Book.query();
    }]);

module.controller('bookDetailCtrl', ['$scope', '$routeParams', 'Book',
    function($scope, $routeParams, Book){
        var bookId = $routeParams.bookId;

        $scope.book = Book.get({id: bookId});
}]);