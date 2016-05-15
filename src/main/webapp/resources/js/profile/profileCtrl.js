var module = angular.module('profileCtrl', []);

module.controller('profileCtrl', ['$scope', 'UserTransfers',
    function ($scope, UserTransfers) {
        $scope.transfers = UserTransfers.query();
    }]);