var module = angular.module('foundBookCtrl', []);

module.controller('FoundBookCtrl', ['$scope', 'FoundBook',
    function ($scope, FoundBook) {

        $scope.addBook = function() {
            FoundBook.save({id: $scope.bookId});
        }
    }]);