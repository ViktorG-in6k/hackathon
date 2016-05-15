var module = angular.module('bookCtrls', []);

module.controller('booksCtrl', ['$scope', 'Book',
    function ($scope, Book) {
        $scope.books = Book.query();
    }]);

module.controller('bookDetailCtrl', ['$scope', '$routeParams', 'Book', 'Transfer',
    function($scope, $routeParams, Book, Transfer){
        var bookId = $routeParams.bookId;

        $scope.book = Book.get({id: bookId});

        $scope.transfers = Transfer.query({id: bookId});
        //$scope.createBook = Book.save
}]);

module.controller('bookCreationCtrl', ['$scope', 'Book',
    function($scope, Book){
        $scope.book = {};
        $scope.createBook = function () {
            Book.save($scope.book);
        }
    }]);