// Criando banco local de 5mb de armazenamento
var db = window.openDatabase("bancoLocal", "1.0", "Teste banco local", 5*1024*1024);

// Carga inicial
criarTabelas();
buscarAlunos();

function submeterFormulario(){
  var
    nome = $("#nome").val(),
    email = $("#email").val(),
    senha = $("#senha").val(),
    escola = $("#escola").val(),
    data_nascimento = $("#data_nascimento").val();

  var aluno = [nome, email, senha, escola, data_nascimento];

  db.transaction (function (tx) {
    tx.executeSql ("INSERT INTO aluno(nome, email, senha, escola, data_nascimento) VALUES (?, ?, ?, ?, ?) ", aluno,
      function(success){
        window.location.href = "home.html";
      }, null);
  });

}

function apagarRegistro(indice){
  db.transaction (function (tx) {
    tx.executeSql ("DELETE FROM aluno WHERE id = ?", [indice], null, null);
    window.location.href = "home.html";
  })
}


function buscarAlunos(){
  db.transaction (function (tx) {
    tx.executeSql ('SELECT * FROM aluno', [], function (tx, results) {
      var len = results.rows.length;
      for (var i = 0; i <len; i ++) {
        var newRow = $("<tr>");
        var cols = "";

        var data_nascimento = new Date(results.rows.item(i).data_nascimento);

        cols += '<td>' + results.rows.item(i).nome + '</td>';
        cols += '<td>' + results.rows.item(i).escola + '</td>';
        cols += '<td>' +  results.rows.item(i).data_nascimento + '</td>';
        cols += '<td>' + results.rows.item(i).email + '</td>';
        cols += '<td><button type="button" name="remover" onClick="apagarRegistro(' + results.rows.item(i).id + ')" class="ui small button red">Apagar</button></td>';
        cols += '<td>';
        cols += '</td>';

        newRow.append(cols);
        $("#tabela-alunos").append(newRow);
      }
    }, null);
  });
}

function criarTabelas(){
  db.transaction (function (tx) {
    tx.executeSql ("CREATE TABLE IF NOT EXISTS aluno (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, nome TEXT, email TEXT, senha TEXT, escola TEXT, data_nascimento TEXT)");

    // tx.executeSql ("DROP TABLE aluno");

  });
}
