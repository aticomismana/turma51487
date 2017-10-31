var agenda = angular.module('agenda', []);

agenda.controller('pessoaController', function($scope, $http){
	
	$http.get("http://localhost:8080/ProJsonJava/rest/pessoas").then(function(response){
		$scope.contatos = response.data;
	})
})