'''
1. Crie uma lista notas e, por meio de while, calcule a média: 7,8,8,7.5,8.5,9,10

2. Calcule a média com notas obtidas a partir do teclado que serão armazenadas em uma lista.

3. Crie um programa que ler cinco números, armazena-os em uma lista e depois solicita que o usuário escolha um número a mostrar.

'''

# funcoes

# ------------------------------------------------------------------
def questao1():
    notas=[7,8,8,7.5,8.5,9,10]
    soma=0
    media=0

    x=0

    '''
    while x<len(notas):
       soma+=notas[x]
       x+=1
    '''
    soma=sum(notas)

    media=soma/len(notas)
    print("%.1f" % media)

# ------------------------------------------------------------------
def questao2():
    
    media=0

    qtd_notas=int(input("informe quantas notas serão informadas: "))

    notas_lista=list(range(qtd_notas))
    #notas_lista=range(100)

    cont=0
    while cont<qtd_notas:
        notas_lista[cont]=float(input("informe uma nota: "))
        cont+=1

    media=(sum(notas_lista)/len(notas_lista))
    print("media: %.1f" % media)
    print("notas: ",notas_lista)

# ------------------------------------------------------------------

def questao3():

    numeros=list(range(5))
    #numeros=[0,0,0,0,0]
    
    cont=0
    while cont<5:
        numeros[cont]=float(input("informe um numero: "))
        cont+=1
    print(numeros)
    
    pesquisa=int(input("informe o nº da posicao que deseja imprimir (iniciando em 1): "))

    if (pesquisa>5) or (pesquisa<1):
        print("posicao inexistente!")
    else:
        pesquisa-=1
        print("o número presente na posicao é: %.2f" % numeros[pesquisa])

# ------------------------------------------------------------------
def questao3_busca():

    numeros=list(range(5))
    #numeros=[0,0,0,0,0]
    
    cont=0
    while cont<5:
        numeros[cont]=float(input("informe um numero: "))
        cont+=1
    print(numeros)
    
    pesquisa=float(input("informe numero para pesquisar: "))
    encontrado=False

    cont=0
    while cont<len(numeros):
        if numeros[cont]==pesquisa:
            print("numero encontrado! na posicao %d " % cont)
            encontrado=True
        cont+=1

    if(encontrado==False):
        print("numero não encontrado")
        
# ------------------------------------------------------------------
    
# programa

print("\n------\nQuestão 1\n------")
questao1()

print("\n------\nQuestão 2\n------")
questao2()

print("\n------\nQuestão 3\n------")
questao3()

print("\n------\nQuestão 3\n------")
questao3_busca()
