let ranking = JSON.parse(localStorage.getItem('ranking')) || [];
let linha;

setTimeout(function () {
  listar()

}, 10);
function listar(){
  var tbody = document.getElementById("ranking")

  for (var i = 0; i < ranking.length; i++) {
    linha = `<tr>
        <td>${i + 1}</td>
        <td>${ranking[i].jogador}</td>
        <td>${ranking[i].acertos}</td>
        <td>${ranking[i].erros}</td>
        <td>${ranking[i].movimentos}<td>
      </tr>
    `;

    tbody.innerHTML += linha;

  }

}
