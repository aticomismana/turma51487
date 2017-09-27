var dados = [];

function adicionarTabela(){
  var descricao = $('#descricao').val();
  var nota = $('#nota').val();

  if(descricao && nota && nota <= 10){
     var indice =  dados.length;
     var newRow = $("<tr id="+ indice +">");
     var cols = "";

     cols += '<td> <spam id="descricao-' + indice + '">'+ descricao +
                '</spam> <input id="inputdescricao-' + indice + '" type="text" name="nota" id="notaHidden">' +
              '</td>';
     cols += '<td> <spam id="nota-' + indice + '">'+ nota +
                '</spam> <input type="text" name="nota" id="inputnota-' + indice + '">' +
              '</td>';
     cols += '<td><button type="button" id="editar-' + indice + '" name="editar" onClick="editarTabela(' + indice + ')" class="ui button teal">Editar</button></td>';
     cols += '<td><button type="button" name="remover" onClick="removerTabela(' + indice + ')" class="ui button red">Remover</button></td>';
     cols += '<td id="concluir-' + indice + '"><button type="button" name="editar" onClick="concluirEdicao(' + indice + ')" class="ui button green">Concluir</button></td>';
     cols += '<td>';
     cols += '</td>';

     newRow.append(cols);
     $("#tabela").append(newRow);

     $("#inputdescricao-"+indice).hide();
     $("#inputnota-"+indice).hide();
     $("#concluir-"+indice).hide();


     dados.push({
       nota: nota,
       descricao: descricao
     })

     calculaMedia();

     $('#descricao').val('')
     $('#nota').val('')
  } else {
    $('#alerta').modal('toggle')
  }
}

function removerTabela(indice){
  $("#"+indice).remove();
  dados[indice] = {};
  calculaMedia();
}

function editarTabela(indice){
  $("#descricao-"+indice).hide();
  $("#nota-"+indice).hide();
  $("#editar-"+indice).prop("disabled",true);

  $("#inputdescricao-"+indice).val($("#descricao-"+indice).text());
  $("#inputdescricao-"+indice).show();
  $("#inputnota-"+indice).val($("#nota-"+indice).text());
  $("#inputnota-"+indice).show();
  $("#concluir-"+indice).show();
}

function concluirEdicao(indice){
  var nota = $("#inputnota-"+indice).val(),
      descricao = $("#inputdescricao-"+indice).val();

  if(nota && descricao && nota <= 10) {
    $("#inputdescricao-"+indice).hide();
    $("#concluir-"+indice).hide();
    $("#inputnota-"+indice).hide();

    dados[indice].descricao = descricao;
    dados[indice].nota = nota;

    $("#nota-"+indice).text(nota);
    $("#descricao-"+indice).text(descricao);

    $("#descricao-"+indice).show();
    $("#nota-"+indice).show();
    $("#editar-"+indice).prop("disabled",false);
    calculaMedia();

  } else {
    $('#alerta').modal('toggle')
  }
}

function calculaMedia(){
  var media = 0,
    count = 0;

  dados.map(function(avaliacao){
    if(avaliacao.nota){
      media += parseFloat(avaliacao.nota)
      count += 1;
    }
  })

  var valor = (media / count) || 0

  $('#media').text('Media: ' + valor.toFixed(2) )


  if(valor >= 7){
    $("#aprovado").show();
    $("#reprovado").hide();
  } else {
    $("#reprovado").show();
    $("#aprovado").hide();
  }
}
