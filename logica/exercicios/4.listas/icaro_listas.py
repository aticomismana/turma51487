"""
1. Crie uma lista notas e, por meio de while, calcule a média: 7,8,8,7.5,8.5,9,10

2. Calcule a média com notas obtidas a partir do teclado que serão armazenadas em uma lista.

3. Crie um programa que ler cinco números, armazena-os em uma lista e depois solicita que o usuário escolha um número a mostrar.

"""
def lista():
    notas = [7,8,8,7.5,8.5,9,10.0]
    soma = 0
    x = 0
    while x < len(notas):
        #soma = sum(notas)
        soma+=notas[x]
        x+=1
    print("A media é ",soma/x)
#----------------------------------------------------------------------
def calcMedia():
    x = 1
    qM = int(input("Digite quantas medias você quer fazer: "))
    lista = list(range(qM))
    cont=0
    while x <= qM:
        lista[cont] = float(input("digite a %d° nota:"%(x)))
        cont +=1
        x+=1
    media = sum(lista)/qM
    print(media)
    DverNot = str(input("Digite S se você quer escolher a nota:"))
    if DverNot == "s" or DverNot == "S":
        eM = int(input("Escolha qual numero você quer:"))
        eM-=1
        if (eM < qM):
            print(lista[eM])
        else:
            print("Numero maior que a quantidade da lista")
#----------------------------------------------------------------------
def vMed():
    x = 1
    cont = 0
    lista = list(range(5))
    
    while cont < 5:
        lista[cont] = float(input("digite a %d° nota:"%(cont)))
        cont+=1
        
    VerNot = int(input("Digite qual numero você quer ver:"))
    enc= False
    cont = 0
    while cont<len(lista):
        if lista[cont] == VerNot:
            print("numero encontrado na posição: %d"%cont)
            enc = True
        cont+=1
    if(enc==False):
        print('numero não encontrado')


#---------------------------------------------------------------------        
print("Digite 1 se você quer lista notas e, por meio de while\n2° se você quer Calcule a média com notas obtida\n3 se você quer ler cinco números, armazena-os")
escolha = int(input("Digite: "))
if (escolha == 1):
    print("Rodando exercicio 1:")
    lista()
elif (escolha == 2):
    print("Rodando exercicio 2:")
    calcMedia()
elif (escolha == 3):
    print("Rodando exercicio 3:")
    vMed()
