setTimeout(function () {
  $('.timepicker').pickatime({
    default: 'now', // Set default time: 'now', '1:30AM', '16:30'
    fromnow: 0,       // set default time to * milliseconds from now (using with default = 'now')
    twelvehour: false, // Use AM/PM or 24-hour format
    donetext: 'OK', // text for done-button
    cleartext: 'Clear', // text for clear-button
    canceltext: 'Cancel', // Text for cancel-button
    autoclose: false, // automatic close timepicker
    ampmclickable: true, // make AM PM clickable
    aftershow: function(){} //Function for after opening timepicker
  });

  $(document).ready(function() {
    $('select').material_select();
  });

}, 10);

let refeicoes = []

function adicionarAlimentacao() {
  let objRefeicao = {
    refeicao: document.getElementById('alimento').value,
    horario: document.getElementById('horario').value
  }

  let verificar = refeicoes.some(function(alimento){
    return alimento.horario == objRefeicao.horario;
  });

  refeicoes.push(objRefeicao);

  if(!verificar){
    let select = document.getElementById("filtro");
    let opt = document.createElement('option');

    opt.value = objRefeicao.horario;
    opt.innerHTML = objRefeicao.horario;
    select.appendChild(opt);
  }

  $('select').material_select();

  listar(objRefeicao, false);
}

function removerRecomendacao() {
  document.getElementById("filtro").value = ""
  document.getElementById("cards").innerHTML = ""

  document.getElementById("titulo").innerHTML = "Lista de alimentos"

  for (var i = 0; i < refeicoes.length; i++) {
    listar(refeicoes[i], false);
  }
}

function listar(objRefeicao, opcional){
  let lista = document.getElementById("cards");

  if(opcional){
    lista.innerHTML = ""
  }

  let card = `
    <div class="col s6 m4">
      <div class="card horizontal">
        <div class="card-stacked">
          <div class="card-content">
            <p>Alimento: ${objRefeicao.refeicao} </p>
          </div>
          <div class="card-action">
            <a href="#">Horário: ${objRefeicao.horario} </a>
          </div>
        </div>
      </div>
    </div>
  `;


  $('#cards').append(card)
}

function buscarRefeicao() {
  let horario = document.getElementById("filtro").value;

  let refeicao = refeicoes.map(function(alimento){
    if(alimento.horario == horario){
      return alimento
    }
  });

  let tamanho = refeicao.length;

  if(tamanho > 0){
    let min = 0;
    let recomendacao = refeicoes[ Math.floor(Math.random() * (tamanho - min)) + min];
    document.getElementById("titulo").innerHTML = "Alimento recomenadado"

    listar(recomendacao, true);
  }
}
