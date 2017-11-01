# ========================== Questão 1 ====================================
(1) Um computador é uma máquina que executa ordens e, a fim de obter a solução de um problema, é necessário que o mesmo execute um programa. Sendo assim, é correto afirmar que, de forma abstrata, se for determinado um conjunto de passos, mediante um fato concreto, que o computador deverá executar para resolver o problema, poderei ter como resposta uma das afirmações abaixo?
a) Você deve comprar mais gasolina.
b) É melhor ficar em casa.

print('''Ana Maria entrou na cabine e foi vestir um biquíni legal, mas era pequeno, o biquíni que:
a) Ana Maria foi botar mais gasolina para ir a praia;
b) Resolveu ficar em casa ''')

# ========================== Questão 2 ====================================
2. (1) Então, para qualquer que tenha sido a sua resposta na questão 1 escreva um programa em Python que, por meio de uma função, retorne, pra ser impresso no terminal como resposta, uma das alternativas da questão anterior.

saida = ''
contador = 0
while saida != 'Q':
	opcao = input("Digite a alternativa \'a\' ou a alternativa \'b\' ou a alternativa \'q\'  para sair: ")
	saida = str.upper(opcao)
	if str.lower(opcao) == 'a':
		print("Ana Maria foi mostrar seu biquíni legal na praia")
	elif str.lower(opcao) == 'b':
		print("Ana Maria ficou em casa")
	else:
		print("Caractere invalido tente outro")
print('tchau')
# ========================== Questão 3 ====================================
3. (1) Construa um algoritmo que para um grupo de 50 valores inteiros, determine por meio de uma função uma lista para:

Lembrando que vc terá que criar uma lista de 50 valores

l =list(range(-25,25))

# ========================== Letra A ======================================
a) determinar a soma dos 25 números positivos;

def positivo():
	a = []
	saida = []
	for e in range(len(l)):
		if l[e] > 0:
	for i in range(0,25):
		saida.append(i)
			a.append(l[e])
	print(sum(saida))
positivo()

# ========================== Letra B =======================================
b) determinar a quantidade de valores negativos. (usar filtro)
# Usando a função lambda

print(len(list(filter(lambda x: x<0, l))))

# ========================== Questão 4 ======================================
4. (1) Para uma turma de 45 alunos, construir um algoritmo que determine por meio de uma função:
a) a idade média dos alunos com menos 1,70m de altura;
b) a altura média dos alunos com mais de 20 anos.

Importação : import statistics    
		     import statistics as sta

# ========================== Questão 5 ======================================
5. (1) Em conformidade com o paradigma da Programação Estruturada: dividir um problema em partes/problemas menores para, em cada problema, identificar a entrada o processo e saída que se deseja obter. Resolva o problema, com Python, para encontrar os múltiplos de 7 existentes entre 1 e 22 em uma função. Em seguida, por meio de outra função, chame a função anterior a fim de saber qual o maior dentre os números obtidos.

l = []
def multiplos7():
    for e in range(0,22,7):
        if e > 0:
            l.append(e)
            print(e)

def maior():
    if l[0] > l[1] > l[2]:
        print(l[0])
    if l[1] > l[2] > l[0]:
        print(l[1])
    else:
        print(l[2])

# ========================== Questão 6 ======================================
6. (1) Crie um algoritmo que pode remover um valor, obtido como argumento de uma função Python, de uma lista.
def remover(n):
    l = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    l.remove(n)

    print(l)
remover(2) \O número que vai ser removido

# ========================== Questão 7 ======================================
7. (1) Crie uma função Python que permita obter, por meio do teclado, 10 valor que serão guardados em uma lista vazia.

l = []
def lista():
    for i in range(10):
        a = input('Digite %dº número: '% (i+1))
        l.append(a)
lista()

# ========================== Questão 8 ======================================
8. (1) Crie uma função Python que insira um valor na lista da questão 7 na posição 2.

def trocar():
    l = []
    for i in range(10):
        a = input('Digite %dº número: '% (i+1))
        l.append(a)
    x = int(input("Digite o número que deseja inserir: "))
    l[2] = x
    print(l)
trocar()

# ========================== Questão 9 ======================================
9. (1) Por meio de uma função Python retorne o valor dos argumentos na ordem sobrenome, nome de alguém.

def identificacao(sobrenome, nome):
    print(sobrenome, nome)
identificacao('Nogueira', 'Thiago')


# ========================== Questão 10 ======================================
10. (1) Crie uma função Python, que receba 2 argumentos, para cada uma das 4 operações matemáticas

def operacoes(n1, n2):
    op = str.upper(input("Informe a operação matematica que deseja \n'D\' = DIVISÃO \n'S\' = SOMA \n'M\' = MULTIPLICAÇÃO \n'SS\' SUBTRAÇÃO\n"))
    if op == 'D':
        print(n1 ,'/', n2, '=', n1/n2)
    if op == 'S':
        print(n1 ,'+', n2, '=',n1+n2)
    if op == 'M':
        print(n1 ,'x', n2, '=',n1*n2)
    if op == 'SS':
        print(n1 ,'-', n2, '=',n1-n2)
    else:
	print('Caractere invalido, tente novamente')

operacoes(10,2) \Os algarismos que serão feito as operações


# ========================== Questão 11 ======================================
11. (1) Por meio de uma função crie uma estrutura com while para imprimir os 10 múltiplos de um número

def multiplos10():
    a = 0
    opcao = ''
    while opcao != 'Y':
        a = int(input("Informe um numero: "))
        print(a*10)
        opcao = input("Deseja continuar Y/N: ")
