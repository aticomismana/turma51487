var agenda = angular.module('agenda', []);

agenda.controller('pessoaController', function($scope, $http){
	$http.get("controller/contato.json").then(function(response){
		$scope.contatos = response.data.contatos;
	})
})