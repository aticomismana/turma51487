      var agenda = angular.module('agenda', []);

      agenda.controller('agendaController', function($scope) {

       $scope.contatos = [ {nome: 'Ático', tel: '123456'},
                            {nome: 'Ives', tel: '3215645'},
                            {nome: 'Nayrã', tel: '7894565'}];
        $scope.addUm = function(nomeP, telP) {
          $scope.contatos.push({nome: nomeP, tel: telP});
          $scope.nomeModel = "";
          $scope.telModel = "";
        }
      });
