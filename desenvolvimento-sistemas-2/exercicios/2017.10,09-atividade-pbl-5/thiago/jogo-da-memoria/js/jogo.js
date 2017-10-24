let cartas = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1];
let movimentos = 0;
let comparacao = [];
let acertos = 0, erros = 0;
let jogador = prompt("Insira seu nome");
cartas = embaralhar(cartas);
setTimeout(function () {
  document.getElementById("jogador").innerHTML = jogador;

}, 0);
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
      }, 1000);
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
  let ranking = JSON.parse(localStorage.getItem('ranking')) || [];
  let usuario = {
    jogador: jogador,
    acertos: acertos,
    erros: erros,
    movimentos: movimentos
  };

  ranking.push(usuario);

  localStorage.setItem("ranking", JSON.stringify(ranking));
  let reiniciar = confirm("Deseja reiniciar a partida?");
  if(reiniciar){
    window.location.reload()
  }
  return true;
}
