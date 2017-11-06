var produto = angular.module('produto', []);

produto.controller('produto', function($scope, $http){
	$http.get(
		"http://localhost:8080/prj-padaria_mismana/rest/produto").
	then(function(response){
		$scope.produtos = response.data;
	})
})