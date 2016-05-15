var module = angular.module('closeTransfer', []);

module.factory('CloseTransfer', ['$resource',
    function ($resource) {
        return $resource('/api/transfers/:id', {id: '@id'}, {});
    }]);