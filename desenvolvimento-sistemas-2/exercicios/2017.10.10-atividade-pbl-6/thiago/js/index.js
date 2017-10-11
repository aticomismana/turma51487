let refeicoes = JSON.parse(localStorage.getItem("refeicoes")) || []

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
})


function adicionarAlimentacao() {
  let objRefeicao = {
    indice: refeicoes.length,
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



  let verificar = refeicoes.some(function(alimento){
    return alimento.horario == objRefeicao.horario
  })

  refeicoes.push(objRefeicao)

  localStorage.setItem("refeicoes", JSON.stringify(refeicoes))

  if(!verificar){
    let select = document.getElementById("filtro")
    let opt = document.createElement('option')

    opt.value = objRefeicao.horario
    opt.innerHTML = objRefeicao.horario
    select.appendChild(opt)
  }

  $('select').material_select()

  limparInput()
  listar(objRefeicao, false)
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
  refeicoes.splice(indice, 1)

  if(!refeicoes.length){
    document.getElementById("cards").innerHTML = ""
  }

  for (let i = 0; i < refeicoes.length; i++) {
    listar(refeicoes[i], false)
  }
  
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

function listar(objRefeicao, opcional, indice){
  let lista = document.getElementById("cards")

  if(opcional){
    lista.innerHTML = ""
  }

  let card = `
    <div class="col s6 m4">
      <div class="card horizontal">
        <div class="card-stacked">
          <div class="card-content">
            <div class="row">
              <div class="col s9">
                <p><b>Alimento:</b> ${objRefeicao.refeicao} </p>
                <p><b>Adicionado em:</b> ${objRefeicao.adicionado_em} </p>
              </div>
              <div class="">
                <a class="btn-floating btn-large waves-effect waves-light red darken-2  "><i class="material-icons" onclick="removerRefeicao(${objRefeicao.indice})">clear</i></a>
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

  let refeicao = refeicoes.map(function(alimento){
    if(alimento.horario == horario){
      return alimento
    }
  })

  let tamanho = refeicao.length

  if(tamanho > 0){
    let min = 0
    let recomendacao = refeicoes[ Math.floor(Math.random() * (tamanho - min)) + min]
    document.getElementById("titulo").innerHTML = "Alimento recomenadado"

    listar(recomendacao, true)
  }
}
