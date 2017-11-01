let refeicoes = JSON.parse(localStorage.getItem("refeicoes")) || []
let opcoes = JSON.parse(localStorage.getItem("opcoes")) || []

$(document).ready(function() {
  $('select').material_select()

  $('.timepicker').pickatime({
    default: 'now', // Set default time: 'now', '1:30AM', '16:30'
    fromnow: 0,       // set default time to * milliseconds from now (using with default = 'now')
    twelvehour: false, // Use AM/PM or 24-hour format
    donetext: 'OK', // text for done-button
    cleartext: 'Clear', // text for clear-button
    canceltext: 'Cancel', // Text for cancel-button
    autoclose: false, // automatic close timepicker
    ampmclickable: true // make AM PM clickable
  })

  for (let i = 0; i < refeicoes.length; i++) {
    listar(refeicoes[i], false)
  }

  listarOptions();
})


function adicionarAlimentacao() {
  let objRefeicao = {
    refeicao: document.getElementById('alimento').value,
    horario: document.getElementById('horario').value,
    adicionado_em: dataAtualFormatada()
  }

  let verificaExistencia = refeicoes.some(function(refeicao){
    return objRefeicao.horario == refeicao.horario && objRefeicao.refeicao == refeicao.refeicao
  })

  if(verificaExistencia){
    document.getElementById('alimento').className = "invalid"
    return document.getElementById('validate_alimento').innerHTML = "Alimento já cadastrado neste horário"
  }

  if(!objRefeicao.horario){
    document.getElementById('validate_horario').innerHTML = "Campo obrigatório"
    return document.getElementById('horario').className = "invalid"
  }

  if(!objRefeicao.refeicao){
    document.getElementById('validate_alimento').innerHTML = "Campo obrigatório"
    return document.getElementById('alimento').className = "invalid"
  }

  refeicoes.push(objRefeicao)

  localStorage.setItem("refeicoes", JSON.stringify(refeicoes))

  let verificar = opcoes.some(function(horario){
    return horario == objRefeicao.horario
  })

  if(!verificar){
    let select = document.getElementById("filtro")
    let opt = document.createElement('option')

    opt.value = objRefeicao.horario
    opt.innerHTML = objRefeicao.horario
    select.appendChild(opt)
    opcoes.push(objRefeicao.horario);
  }

  $('select').material_select()

  limparInput()
  listar(objRefeicao, false)
  setLocalStorage()
}

function listarOptions() {
  let select = document.getElementById("filtro")
  select.innerHTML = "<option value='' disabled selected>Escolha um horário</option>"
  for (var i = 0; i < opcoes.length; i++) {
    let opt = document.createElement('option')
    opt.value = opcoes[i]
    opt.innerHTML = opcoes[i]
    select.appendChild(opt)
  }
  $('select').material_select()
  setLocalStorage()
}

function limparInput() {
  document.getElementById('alimento').className = "validate"
  document.getElementById('horario').className = "validate"
  document.getElementById('validate_alimento').innerHTML = ""
  document.getElementById('validate_horario').innerHTML = ""
  document.getElementById('alimento').value = ""
  document.getElementById('horario').value = ""
}

function dataAtualFormatada(){
  let data = new Date()
  let dia = data.getDate()
  if (dia.toString().length == 1)
    dia = "0" + dia
  let mes = data.getMonth()+1
  if (mes.toString().length == 1)
    mes = "0" + mes
  let ano = data.getFullYear()
  return dia + "/" + mes + "/" + ano
}

function removerRefeicao(indice) {
  let horario = refeicoes[indice].horario
  refeicoes.splice(indice, 1)

  document.getElementById("cards").innerHTML = ""

  for (let i = 0; i < refeicoes.length; i++) {
    listar(refeicoes[i], false)
  }

  if(!verificarExistencia(horario)){
    let index = opcoes.indexOf(horario);
    opcoes.splice(index, 1)
  }

  listarOptions()
  document.getElementById("titulo").innerHTML = "Lista de alimentos"
  setLocalStorage()
}

function setLocalStorage() {
  localStorage.setItem("opcoes", JSON.stringify(opcoes))
  localStorage.setItem("refeicoes", JSON.stringify(refeicoes))
}

function removerRecomendacao() {
  document.getElementById("filtro").value = ""
  document.getElementById("cards").innerHTML = ""

  document.getElementById("titulo").innerHTML = "Lista de alimentos"

  for (let i = 0; i < refeicoes.length; i++) {
    listar(refeicoes[i], false)
  }
}

function listar(objRefeicao, opcional){
  let lista = document.getElementById("cards")
  let indice = refeicoes.indexOf(objRefeicao);

  if(opcional){
    lista.innerHTML = ""
  }

  let card = `
    <div class="col s12 m4">
      <div class="card horizontal">
        <div class="card-stacked">
          <div class="card-content">
            <div class="row">
              <div class="col s9">
                <p><b>Alimento:</b> ${objRefeicao.refeicao} </p>
                <p><b>Adicionado em:</b> ${objRefeicao.adicionado_em} </p>
              </div>
              <div class="">
                <a class="btn-floating btn-large waves-effect waves-light red darken-2  ">
                  <i class="material-icons" onclick="removerRefeicao(${indice})">clear</i>
                </a>
              </div>
            </div>
          </div>
          <div class="card-action">
            <a href="#">Horário: ${objRefeicao.horario} </a>
          </div>
        </div>
      </div>
    </div>
  `

  $('#cards').append(card)
}

function buscarRefeicao() {
  let horario = document.getElementById("filtro").value

  let refeicao = refeicoes.filter(function(alimento){
      return alimento.horario == horario
  })

  let tamanho = refeicao.length
  let indice = Math.floor(Math.random() * tamanho)
  let recomendacao = refeicao[ indice ]
  document.getElementById("titulo").innerHTML = "Alimento recomendado"

  if(recomendacao){
    return listar(recomendacao, true)
  }

  document.getElementById("titulo").innerHTML = "Nenhum alimento encontrado neste horário"
  document.getElementById("cards").innerHTML = ""
}

function verificarExistencia(horario) {
  let refeicao = refeicoes.map(function(alimento){
    if(alimento.horario == horario){
      return alimento
    }
  })

  if(refeicao[0]) return true;

  return false
}
