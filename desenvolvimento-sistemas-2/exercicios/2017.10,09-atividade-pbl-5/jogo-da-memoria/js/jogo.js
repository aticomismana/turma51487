// Criando banco local de 5mb de armazenamento
const db = window.openDatabase("bancoLocal", "1.0", "Teste banco local", 5*1024*1024);

let cartas = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1];
let movimentos = 0;
let comparacao = [];
let acertos = 0, erros = 0;

cartas = embaralhar(cartas);

function virarCarta(indice) {
  document.getElementById(indice).src = "../img/" + cartas[indice] + ".jpg";

  comparacao.push(indice);

  compararCartas();
}


function compararCartas() {
  if(comparacao.length == 2){
    let indice1 = comparacao[0], indice2 = comparacao[1];
    movimentos += 1;
    document.getElementById("movimentos").innerHTML = movimentos;

    if( cartas[indice1] == cartas[indice2] ) {
      acertos += 1;
      document.getElementById("acertos").innerHTML = acertos;
      console.log("Acertou");
      if(acertos == 10) {
        setTimeout(function () {
          alert("VC GANHOU")
          salvarPontuacao();
        }, 100);
      }
    } else {
      erros += 1;
      document.getElementById("erros").innerHTML = erros;

      setTimeout(function () {
        document.getElementById(indice1).src = "../img/carta.png";
        document.getElementById(indice2).src = "../img/carta.png";
      }, 1200);
    }

    comparacao = [];
  }
}

function embaralhar(array) {
  let indice_atual = array.length, valor_temporario, indice_aleatorio;

  while (0 !== indice_atual) {

    indice_aleatorio = Math.floor(Math.random() * indice_atual);
    indice_atual -= 1;

    valor_temporario = array[indice_atual];
    array[indice_atual] = array[indice_aleatorio];
    array[indice_aleatorio] = valor_temporario;
  }

  return array;
}

function salvarPontuacao(){
  var ranking = ["Usuario", acertos, erros, movimentos];

  db.transaction (function (tx) {
    tx.executeSql ("INSERT INTO ranking(nome, acertos, erros, movimentos) VALUES (?, ?, ?, ?) ", ranking,
      function(success){
        window.location.href = "ranking.html";
      }, null);
  });

}
