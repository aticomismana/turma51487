let myApp = angular.module('myApp', ['ui.router'])
  .controller('formController', function($scope, $location, $http) {
    $scope.submitForm = submitForm

    function submitForm () {
      const produto = JSON.stringify($scope.produto)
      console.log($scope.produto)
//      $http.post('http://localhost:8080/padaria-thiago/rest/produtos', produto).then(
//        (data) => console.log(data),
//        (erro) => console.log(erro)
//      );
      
      $http({
	        url: 'http://localhost:8080/padaria-thiago/rest/produtos',
	        method: "POST",
	        data: produto,
	    })
	    .then(function(response) {
	    	console.log(response)
	    }, 
	    function(response) { // optional
	    	console.log(response)
	    });

    }
  })
  .controller('pedidosController', function($scope, $http) {

    $http.get('http://localhost:8080/padaria-thiago/rest/produtos').then(
	    (response) => $scope.produtos = response.data,
	    (erro) => console.log(erro)
	  );
  })
