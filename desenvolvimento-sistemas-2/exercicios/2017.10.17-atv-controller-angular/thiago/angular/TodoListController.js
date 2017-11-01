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
  .service('UsuariosService', function() {
    let usuarios = [{
        email: 'thiago@gmail.com'
      },
      {
        email: 'teste@gmail.com'
      },
      {
        email: 'vitor@gmail.com'
      },
      {
        email: 'joao@gmail.com'
      },
      {
        email: 'invictor@gmail.com'
      },
      {
        email: 'alguem@gmail.com'
      },
      {
        email: 'kevin@gmail.com'
      },
      {
        email: 'cesar@gmail.com'
      },
      {
        email: 'leo@gmail.com'
      }
    ]

    return {
      getUsuarios: function () {
          return usuarios;
      },
      setUsuarios: function(valor) {
          usuarios = valor;
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
  .controller('AtividadeFormController', function($scope, $timeout, $http, UsuariosService) {
    const select = document.getElementById("paises")
    const data = new Date();
    let option
    let anoAtual = data.getFullYear()
    $scope.usuario = {}
    $scope.submeterFormulario = submeterFormulario
    $scope.verificaEmail = verificaEmail

    $scope.$watch('usuario.anoNascimento', function() {
      if ($scope.usuario.anoNascimento >= anoAtual - 3) $scope.formCadastro.$setValidity("anoNascimento", false);
      else $scope.formCadastro.$setValidity("anoNascimento", true)
    });

    $('select').material_select();

    $http.get('paises.json').then(function(data){
      for (var i = 0; i < data.data.length; i++) {
        option = new Option(data.data[i].nome_pais, data.data[i].nome_pais);
        select.add(option);
      }
      $('#paises').material_select();
    });

    function submeterFormulario() {
      if($scope.formCadastro.$invalid) return alert('FORMULARIO CONTEM ERRO DE VALIDAÇÃO')

      alert('FORMULARIO SUBMETIDO COM SUCESSO')
    }

    function verificaEmail() {
      let verificaEmail = UsuariosService.getUsuarios().some(usuario => $scope.usuario.email === usuario.email)

      if(verificaEmail) $scope.formCadastro.$setValidity("emailRegistrado", false);
      else $scope.formCadastro.$setValidity("emailRegistrado", true);
    }

  })
