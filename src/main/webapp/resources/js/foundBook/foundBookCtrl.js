var module = angular.module('foundBookCtrl', []);

module.controller('FoundBookCtrl', ['$scope', '$location','FoundBook',
    function ($scope, $location, FoundBook) {

        $scope.addBook = function() {
            FoundBook.save({id: $scope.bookId})
                .$promise
                .then(function () {
                    $location.path('/books/' + $scope.bookId);
                });
        }
    }]);