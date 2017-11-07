let myApp = angular.module('myApp', ['ui.router'])
  .controller('formController', function($scope, $location, $http) {
    $scope.submitForm = submitForm

    function submitForm () {
      const produto = JSON.stringify($scope.produto)
      $http({
	        url: 'http://localhost:8080/padaria-thiago/rest/produtos',
	        method: "POST",
	        data: produto,
	    })
	    .then(function(response) {
	    	$location.path('/listaProdutos')
	    },
	    function(response) { // optional
	    	$location.path('/listaProdutos')
	    })

    }
  })
  .controller('pedidosController', function($scope, $http) {
    $scope.listPedidos = []
    $scope.total = 0
    $scope.addTable = addTable

    function getProdutos() {
      $http.get('http://localhost:8080/padaria-thiago/rest/produtos').then(
  	    (response) => {
          $scope.produtos = response.data
        },
  	    (erro) => console.log(erro)
  	  );
    }

    function addTable () {
      const pedido = {
        produto:  JSON.parse($scope.produtoSelect),
        quantidade: $scope.quantidade
      }
      console.log(pedido);
      $http({
	        url: 'http://localhost:8080/padaria-thiago/rest/pedidos',
	        method: "POST",
	        data: pedido,
	    })
	    .then(function(response) {
	    	getPedidos()
	    },
	    function(response) { // optional
	    	getPedidos()
	    });
    }

    function getPedidos () {
      $http.get('http://localhost:8080/padaria-thiago/rest/pedidos').then(
  	    (response) => {
          $scope.pedidos = response.data
          $scope.pedidos.forEach(pedido => ($scope.total += pedido.produto.preco * pedido.quantidade))
        },
  	    (erro) => console.log(erro)
  	  );
    }

    getProdutos()
    getPedidos()
  })
