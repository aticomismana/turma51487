// Criando banco local de 5mb de armazenamento
const db = window.openDatabase("bancoLocal", "1.0", "Teste banco local", 5*1024*1024);

// Carga inicial
criarTabelas();
listarRanking();

function listarRanking(){
  db.transaction (function (tx) {
    tx.executeSql ('SELECT * FROM ranking', [], function (tx, results) {
      let len = results.rows.length;
      for (var i = 0; i <len; i ++) {
        console.log(results.rows.item(i));
      }
    }, null);
  });
}

function criarTabelas(){
  db.transaction (function (tx) {
    tx.executeSql ("CREATE TABLE IF NOT EXISTS ranking (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, nome TEXT, acertos TEXT, erros TEXT, moviemtnos TEXT)");
    console.log("TABELA CRIADA COM SUCESSO");
  });
}
