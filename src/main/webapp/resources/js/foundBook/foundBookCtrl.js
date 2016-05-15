var module = angular.module('foundBookCtrl', []);

module.controller('FoundBookCtrl', ['$scope', '$location','FoundBook', 'Notification',
    function ($scope, $location, FoundBook, Notification) {

        $scope.addBook = function() {
            FoundBook.save({id: $scope.bookId})
                .$promise
                .then(function (data) {
                    if(data) {
                        $location.path('/books/' + $scope.bookId);
                        Notification('Congratulations! You have found the book!');
                    } else {
                        Notification('This book is not free!!!');
                    }
                });
        }
    }]);