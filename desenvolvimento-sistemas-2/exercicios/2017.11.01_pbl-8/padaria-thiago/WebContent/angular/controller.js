let myApp = angular.module('myApp', ['ui.router'])
  .controller('formController', function($scope, $location, $http) {
    $scope.submitForm = submitForm

    function submitForm () {
      const produto = JSON.stringify($scope.produto)
      $http.post('http://localhost:8080/padaria-thiago/rest/produtos', produto).then(
        (data) => console.log(data),
        (erro) => console.log(erro)
      );

    }
  })
  .controller('listaProdutosController', function($scope, $http) {

    $http.get('http://localhost:8080/padaria-thiago/rest/produtos').then(
	    (data) => $scope.produtos = response.data,
	    (erro) => console.log(erro)
	  );
  })
