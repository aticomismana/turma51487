var agenda = angular.module('agenda', []);
	agenda.controller('agendaController', function($scope, $http){
		$http.get("./js/contatos.json").then(function(response){
			$scope.contatos = response.data.contatos;
   		}).catch(function(err){
   			console.log(err)
   		})       
	});