var p = "imagens/";
var pa = p+"Solvay_conference_1927.jpg";
var path = [
    p+"Cesar_lattes.png",
    p+"Erwin_Schrodinger.jpg",
    p+"jose-leite-lopes.jpg",
    p+"marie-curie.jpg",
    p+"mario_schenberg.jpg",
    p+"Max_Planck.jpg",
    p+"michael-faraday.jpg",
    p+"paul-dirac.jpg",
    p+"Richard_Feynman.jpg",
    p+"werner-heisenberg.jpg"
];
var nomes = [
    "César Lattes",
    "Erwin Schorodinger",
    "José Leite Lopes",
    "Marie Curie",
    "Mário Schenberg",
    "Max Planck",
    "Michael Faraday",
    "Paul Dirac",
    "Richard Feynman",
    "Werner Heisenberg"
];
var alturaImagens, larguraImages;
var cartaAssociada = [];
var trLength, tdLength;
var atualmenteAberta = -1;

var podeAbrir = true;
var matches=0;
var tentativas=0;
var melhorTentativa=0;

window.onload = novoJogo;

function novoJogo() {
    inicializaCartas();
    atualmenteAberta = -1;
    podeAbrir = true;
    matches=0;
    tentativas=0;
}

function inicializaCartas(){
    var table = document.getElementsByClassName('container')[0];
    var tbody = table.getElementsByTagName('tbody')[0];
    var trs = tbody.getElementsByTagName('tr');
    for (var i = 0; i < trs.length; i++) {
        var tds = trs[i].getElementsByTagName('td');
        for (var j = 0; j < tds.length; j++) {
            var img = tds[j].getElementsByTagName('img')[0];
            img.setAttribute("src",pa);
        }
    }
    larguraImages = img.offsetWidth;
    alturaImagens = img.offsetHeight;

    inicializaDados();
}

function inicializaDados(){

    var usados = []; for(var i in path){ usados.push(0); }

    var table = document.getElementsByClassName('container')[0];
    var tbody = table.getElementsByTagName('tbody')[0];
    var trs = tbody.getElementsByTagName('tr');
    trLength = trs.length;
    tdLength = trs[0].getElementsByTagName('td').length;

    for (var i = 0; i < trs.length; i++) {
        var tds = trs[i].getElementsByTagName('td');
        for (var j = 0; j < tds.length; j++) {
            var img = tds[j].getElementsByTagName('img')[0];
            var para = tds[j].getElementsByTagName('span')[0];
            var pos;
            do {
                 pos = Math.floor(Math.random()*path.length);
            } while (usados[pos] >= 2);
            usados[pos]++;
            cartaAssociada.push(pos);
            img.setAttribute('style',"display:block; margin:0 auto; max-width:"+larguraImages+
            "px;max-height:"+alturaImagens+"px;width:auto;height:auto;");
            para.innerHTML = '&emsp;';
            tds[j].onclick = function(){clickVer(this)};
        }
    }
};

function clickVer(carta){
    if(podeAbrir){
        mostraCarta(carta);
        if(atualmenteAberta == -1){
            atualmenteAberta = posicaoElemento(carta);
            return;
        }
        if(atualmenteAberta == posicaoElemento(carta))
            return;
        limitaClick();
        tentativas++;
        if( cartaAssociada[atualmenteAberta] == cartaAssociada[posicaoElemento(carta)] ){
            limpaCarta(pegaElemento(atualmenteAberta));
            limpaCarta(carta);
            matches++;
            atualmenteAberta = -1;
            checaFimPartida();
        }else{
            escondeCarta(pegaElemento(atualmenteAberta), carta);
            atualmenteAberta = -1;
        }
    }
}

function mostraTentativas(){
    var h4 = document.getElementById('tentativas');
    h4.innerHTML = "Última jogada: " + tentativas;
}

function limitaClick(){
    podeAbrir = false;
    setTimeout(function(){podeAbrir=true;},1000);
}

function mostraCarta(carta){
    var img = carta.getElementsByTagName('img')[0];
    var para = carta.getElementsByTagName('span')[0];
    img.setAttribute('src',path[cartaAssociada[posicaoElemento(carta)]]);
    para.innerHTML = nomes[cartaAssociada[posicaoElemento(carta)]];
}

function escondeCarta(carta1,carta2){
    setTimeout(function(){
        var img1 = carta1.getElementsByTagName('img')[0];
        var img2 = carta2.getElementsByTagName('img')[0];
        var para1 = carta1.getElementsByTagName('span')[0];
        var para2 = carta2.getElementsByTagName('span')[0];
        img1.setAttribute('src',pa);
        img2.setAttribute('src',pa);
        para1.innerHTML = "&emsp;";
        para2.innerHTML = "&emsp;";
    }, 1000);
}

function limpaCarta(carta){
    carta.onclick = limpaOnlick;
}

function posicaoElemento(element){
    var papai = element.parentElement
    // Getting myCol
    for (var myCol=0; (element=element.previousElementSibling); myCol++);
    // Getting myLine
    for (var myLine=0; (papai=papai.previousElementSibling); myLine++);

    return myLine*tdLength + myCol;
}

function pegaElemento(posicao){
    var coluna = posicao%tdLength;
    var linha = Math.floor(posicao/tdLength);

    var table = document.getElementsByClassName('container')[0];
    var tbody = table.getElementsByTagName('tbody')[0];
    var tr = tbody.getElementsByTagName('tr')[linha];
    var td = tr.getElementsByTagName('td')[coluna];
    return td;
}

function limpaOnlick(){
    return false;
}

function checaFimPartida(){
    if(matches >= path.length){
        mostraTentativas();
        if(melhorTentativa < 10 || tentativas < melhorTentativa){
            var h4 = document.getElementById("melhorTentativa");
            h4.innerHTML = "Melhor Pontuação: " + tentativas;
            melhorTentativa = tentativas;
            mostraTentativas();
        }
        matches=0;
    }
}
