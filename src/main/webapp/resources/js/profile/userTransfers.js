var module = angular.module('userTransfers', []);

module.factory('UserTransfers', ['$resource',
    function ($resource) {
        return $resource('/api/transfers/current', {}, {});
    }]);