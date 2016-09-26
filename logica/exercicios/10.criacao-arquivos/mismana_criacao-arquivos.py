'''
1) Crie um programa que leia um arquivo de texto e gere um arquivo de saída paginado.
Cada linha deve conter mais de 76 caracteres.
Cada página terá no máximo 60 linhas.
Adicione na ultima linha de cada página o número da página atual e o nome do arquivo original.
'''

import io, random, string

# funcoes
#
def random_id(length): 
    number= '0123456789' 
    alpha='abcdefghijklmnopqrstuvwxyz' 
    id='' 
    for i in range(0,length,2): 
        id+=random.choice(number) 
        id+=random.choice(alpha)
    print(id)
    return id

def abrirArquivo(nome):
    return open(''+nome+'.txt', 'r')

def fecharArquivo(arquivo):
    arquivo.close()

def criarArquivao():
    arquivao = open('arquivao.txt', 'w')
    arquivao.writelines('%s'% random_id(18558) ) # 18558 | 9318 forçar a terceira pagina com 1 linha, mas com 78 caracteres, ao inves de 77
    fecharArquivo(arquivao)

def criarArquivo(nPag):
    pagina = open('pagina'+str(nPag)+'.txt', 'w')
    return pagina;

# como ler passo a passo, sem carregar o arquivo todo    
def lerArquivo(arquivo):
    conteudo=[]
    conteudo=arquivo.read()
    return conteudo

def criarPagina():
    arquivao=abrirArquivo('arquivao')
    conteudo=lerArquivo(arquivao)
    fecharArquivo(arquivao)
    nPag=0
    
    posicaoInicial=0
    
    qtdCaracteres=len(conteudo)
    print('qtdCaracteres: ',qtdCaracteres)
    while(qtdCaracteres>0):
        nPag+=1
        arquivo=criarArquivo(nPag)

        nLinha=0
        while qtdCaracteres>0 and nLinha<60:
            nLinha+=1
            conteudoLinha=''

            qtdCaracteresPorLinha=77
            # se menor que duas linhas: 77*2 e maior que uma linha: 77 - constroi uma linha diferente
            if qtdCaracteres<154 and qtdCaracteres>77:
                #print('qtdCaracteres',qtdCaracteres)
                qtdCaracteresPorLinha=qtdCaracteres
            
            print('pagina %s | Linha: %s | CaractereInicialPosicao: %s'%(nPag, nLinha, posicaoInicial))
            for i in range(posicaoInicial,(posicaoInicial+qtdCaracteresPorLinha)):
                conteudoLinha+=conteudo[i]
                #print(i,':',conteudo[i])
            arquivo.writelines('%s\n'% conteudoLinha)
            posicaoInicial+=77
            qtdCaracteres-=qtdCaracteresPorLinha
            print('qtdCaracteres',qtdCaracteres)

        # nao adicionei na ultima linha, adicionei uma nova linha no final da pagina
        arquivo.writelines('|Arquivo Original: %s | Pagina %s |'%(arquivao.name, nPag))
        fecharArquivo(arquivo)

def init():
    criarArquivao()
    criarPagina()
                  
# programa
#
init()
