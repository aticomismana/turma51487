const myApp = angular.module('todoApp', ['ui.router'])
  .service('TodoListService', function() {
    let atividades = []

    return {
      getAtividades: function () {
          return atividades;
      },
      setAtividades: function(valor) {
          atividades = valor;
      }
    };
  })
  .controller('TodoFormController', function($scope, $location, TodoListService) {
    let atividades = TodoListService.getAtividades()
    $scope.resetar = resetar
    $scope.adicionar = adicionar

    function resetar() {
      $scope.todo = {}
    }

    function adicionar() {
      if($scope.formTodo.$invalid) return

      $scope.todo.completa = false
      atividades.push($scope.todo);
      TodoListService.setAtividades(atividades)

      $location.path('/list')
    }
  })
  .controller('ListController', function($scope, TodoListService) {
    $scope.atividades = TodoListService.getAtividades()
    $scope.mudarStatus = mudarStatus
    $scope.deletarAtividade = deletarAtividade

    function mudarStatus(row) {
      row.completa = !row.completa
      TodoListService.setAtividades($scope.atividades)
    }

    function deletarAtividade(indice) {
      $scope.atividades.splice(indice, 1)
      TodoListService.setAtividades($scope.atividades)
    }
  })
