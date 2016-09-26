# funcao

def questao1():
    cont=0
    while(cont<100):
        cont+=1
        print(cont)

def questao2():
    cont=50
    while(cont<=100):
        print(cont)
        cont+=1

def questao3():
    cont=10
    while(cont>=0):
        if(cont!=0):
            print(cont)
        else:
            print('FOGO!')
        cont-=1

def questao4():
    cont=0
    num=int(input('informe o numero de parada: '))
    while(cont<=num):
        print(cont)
        cont+=2    

def questao4vs2():
    cont=0
    num=int(input('informe o numero de parada: '))
    while(cont<=num):
        if(cont%2==0):
            print(cont)
        cont+=1

# programa

print("\n------\nQuestão 1\n------")
questao1()

print("\n------\nQuestão 2\n------")
questao2()

print("\n------\nQuestão 3\n------")
questao3()

print("\n------\nQuestão 4\n------")
questao4()

print("\n------\nQuestão 4 vs2\n------")
questao4vs2()
