var module = angular.module('bookCtrls', []);

module.controller('booksCtrl', ['$scope', 'Book',
    function ($scope, Book) {
        $scope.books = Book.query();
    }]);

module.controller('bookDetailCtrl', ['$scope', '$routeParams', 'Book', 'Transfer',
    function ($scope, $routeParams, Book, Transfer) {
        var bookId = $routeParams.bookId;

        $scope.book = Book.get({id: bookId});

        $scope.transfers = Transfer.query({id: bookId});
    }]);

module.controller('bookCreationCtrl', ['$scope', '$location', 'Book', 'Notification',
    function ($scope, $location, Book, Notification) {
        $scope.book = {};
        $scope.createBook = function () {
            Book.save($scope.book)
                .$promise
                .then(function () {
                    $location.path('/books');
                    Notification('Book created!');
                });
        }
    }]);