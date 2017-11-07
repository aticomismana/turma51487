var pedido = angular.module('pedido', []);

pedido.controller('pedido', function($scope, $http){

	// $scope.produtos = [];
	$scope.itensPedido = [];

	$scope.buscarProdutos = function() {
		$http.get(
			"http://localhost:8080/prj-padaria_mismana/rest/produto").
		then(function(response){
			$scope.produtos = response.data;
		})
	}

    $scope.adicionarNovoItem = function(especificacaoP, qtdP) {
      $scope.itensPedido.push({especificacao: especificacaoP, qtd: qtdP});
      $scope.especificacaoP = "";
      $scope.qtdP = "";
    }

    $scope.guardarPedido = function() {
		$http.post(
			"http://localhost:8080/prj-padaria_mismana/rest/pedido").
		then(function(response){
			$scope.produtos = response.data;
		})
    }
});

// pedido.controller('pedido', function($scope, $http){
// 	alert("here");
// 	// $http.get(
// 	// 	"http://localhost:8080/prj-padaria_mismana/rest/produto").
// 	// then(function(response){
// 	// 	$scope.produtos = response.data;
// 	// })
// })

// pedido.controller('produto', function($scope, $http){
// 	$http.get(
// 		"http://localhost:8080/prj-padaria_mismana/rest/produto").
// 	then(function(response){
// 		$scope.produtos = response.data;
// 	})
// })