def soma(a,b):
    return a+b

def cadastro():
    nome=input('informe nome: ')
    idade=int(input('informe idade: '))
    return nome,idade

def criarTupla():
    tupla=cadastro()
    return tupla[1]

def separarString(frase):
    return frase[15:]

num1=2
num2=5

print("\n------\nQuestão 1\n------")
print( soma(num1,num2) )

print("\n------\nQuestão 2\n------")
print( cadastro() )

print("\n------\nQuestão 3\n------")
print( criarTupla() )

print("\n------\nQuestão 4\n------")
print( separarString('João estuda no CIMATEC') )
