const myApp = angular.module('myApp',[]);

myApp.controller('indexController', ['$scope', '$http', function($scope, $http) {
  $http.get('http://localhost:8080/proj-json/rest/pessoas').then(function (response) {
      $scope.contatos = response.data
  });
}]);