var module = angular.module('sidebarCtrl', []);

module.controller('sidebarCtrl', ['$scope', '$location',
    function ($scope, $location) {
        $scope.location = $location.path();


    }]);