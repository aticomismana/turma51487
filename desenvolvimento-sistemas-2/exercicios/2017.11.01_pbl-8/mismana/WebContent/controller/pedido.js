var pedido = angular.module('pedido', []);

pedido.controller('pedido', function($scope, $http){
	alert("here");
	// $http.get(
	// 	"http://localhost:8080/prj-padaria_mismana/rest/produto").
	// then(function(response){
	// 	$scope.produtos = response.data;
	// })
})

produto.controller('produto', function($scope, $http){
	$http.get(
		"http://localhost:8080/prj-padaria_mismana/rest/produto").
	then(function(response){
		$scope.produtos = response.data;
	})
})