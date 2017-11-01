# funcao

def maior(a,b):
    if a>b:
        return a
    else:
        return b

def multiploDeB(a,b):
    if (a%b==0):
        return True
    else:
        return False

def areaQuadrado(x):
    return x*x

def calcAlugCar():
    kmRodados=float(input('informe quantidade de km percorridos: '))
    qtdDias=int(input('informe quantidade de dias: '))
    preco=qtdDias*60+kmRodados*0.15
    print('preço a pagar: %.2f' % preco)


# programa

num1=9
num2=3
lado=3.5
grauCelcius=100

print("\n------\nQuestão 1\n------")
print( maior(num1,num2) )

print("\n------\nQuestão 2\n------")
print( multiploDeB(num1,num2) )

print("\n------\nQuestão 3\n------")
print( areaQuadrado(lado) )

print("\n------\nQuestão 4\n------")
print( cToF(grauCelcius) )

print("\n------\nQuestão 5\n------")
calcAlugCar()
