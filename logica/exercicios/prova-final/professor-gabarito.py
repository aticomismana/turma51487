# -*- coding: utf-8 -*-
#################### Questão 1 ##################
def q1():
    print('início da questão 1')
    import random, array
    # apresentar as opções de frutas
    frutas = ['uva', 'banana', 'maça', 'manga', 'pera', 'laranja', 'mamão']
    limpa = ['[', ']', ',', '\'']
    escolha = []
    i = 1
    while i<=5: # escolher 5 tipos de frutas
        escolha.append(random.choice(frutas))
        i+=1
    escolha = str(escolha)
    for e in limpa:
        escolha = escolha.replace(e, '')
    # colocar na cesta
    cesta = array.array('u', escolha)

    eu = {'Tiago': cesta}
    fila = ['Paula', 'Nayrã', 'Isabel', 'Leonardo', 'Ático']
    # ir para o fim da fila
    fila.append(eu)
    pago = []
    for i in fila:
        pago.append(i)
    for e in range(len(pago)-1):
        print('%dº) %s pagou!'% (e+1,pago[e]))
    for eu, cesta in pago[-1].items(): # pagar
        print('%dº) %s pagou, por %s ' % (e + 2, eu,cesta))
    print('fim da questão 1\n')
    return tuple(cesta)
q1()

#################### Questão 2 ##################
def q2(tupla = None):
    tupla = q1()
    print('início da questão 2')
    if type(tupla) == type(tuple()):
        frutasStr = str(tupla)
        limpa = [',', '\'']
        for e in limpa:
            frutasStr = frutasStr.replace(e, '')
        arquivo = open('q2.txt', 'w')
        arquivo.write(frutasStr)
        arquivo.close()
        arquivo = open('q2.txt')
        q2 = arquivo.read()
        print(q2)
        arquivo.close()
    else:
        print('Não é tuple')
    print('fim da questão 2\n')
q2()

#################### Questão 3 de I a V ##################
def q3i(mconstante, md):
    for e in range(mconstante,md*11, md):
        print(e)
q3i(0,3)

def q3ii(metros, cm):
    m2cm = metros*100
    fatorcomum = 10
    print('escala de %i/%i' % (cm/fatorcomum, m2cm/fatorcomum))
q3ii(100, 10)


def q3iii(todo, p1, p2, p3):
    maior = todo/(p1 + p2 + p3)
    print('a maior parte é: %d' % (maior*maior))
q3iii(270,2,5,10)


def q3iv():
    hora = (3.5*5/9)//(3/5)
    minuto = ((3.5*5/9)%(3/5)+0.10)*100
    return hora, minuto
print('%dh%dmin'% q3iv())


def q3v():
    import random
    l = list(range(71))
    print(l)
    a = int(random.choice(l))
    print('O valor original de a:',a)
    b = 7
    if a > b:
        if a%b == 0:
            p = a/b
            if p%2 == 0:
                print(int(p),'é par')
    else:
        for e in l:
            if e%b == 0:
                print(e)
q3v()

#################### Questão 4 ##################
def q4():
    import array, random
    meuarray = array.array('d',(random.random() for i in range(10)))
    print('Tupla:',tuple(meuarray))
    lista = list(meuarray)
    lista.sort()
    meuarray = array.array('d',lista)
    print('array odenado:',meuarray)
    lista.reverse()
    print('lista invertida',lista)
q4()

#################### Questão 5 ##################
def q5(b,h):
        bd='_'
        hd='|'
        t = ' '*int(b)
        hd1 = '\n|'
        hd2 = '%s|'%t
        print('Área: %.2f'%(b*h),
              '\nPerímetro: %.2f'%(b+b+h+h))

        def retângulo():
            return (' ' + bd * int(b) + '' + (hd1 + '' + hd2) * (int(h) - 1) +
                  '' + hd1 + '' + bd * int(b) + '' + hd + '\n')

        if b < 1 or h < 1:
            b+=2; h+=1
            print(retângulo())
        else:
            print(retângulo())

q5(1.8,0.3)
q5(9,2)

#################### Questão 6 ##################
def q6():
    # artigos à venda
    artigos = {'feijão': 7.60,
              'arroz': 5.80,
               'carne': 24.90,
               'ovo': 5.80,
               'tomate': 4.30,
               'cebola': 4.80}
    compra = {}
    def escolha():
        compra = []
        for n, p in artigos.items():
            item = n
            preço = p
            compra.append([item, preço])
        return compra
    i=1
    receita = 0
    despesa = 0
    # compra dos artigos no atacado com nome e preço de custo
    # espectativa de venda
    while i<=4:
        item, custo = escolha()[i]
        compra[item] = custo
        percent = 0.05
        pvenda = custo + custo*percent
        receita += pvenda
        despesa += custo
        i+=1
        # saida para descrever: item, custo, venda, receita e percentual
    for n, c in compra.items():
        print('Nome: ',n,'\n'+
              'Custo: R$%.2f'%c,'\n'+
              'Preço de venda: R$%.2f'%pvenda,'\n')
    print('Lucro bruto: R$%.2f'%receita,'\n'+
              'Percentual de lucro: %.0f%%' % ((receita*100/despesa)-100))
q6()

#################### Questão 7 ##################
def q7():
    entrada = str.lower(input('Deseja entra no pais das varavilhas?\n'
          's (sim)/n (não): '))
    if entrada[0:1] == 's':
        print('''Não se entra no país das maravilhas,
    pois ele fica do lado de fora,
    não do lado de dentro.''')

    elif entrada[0:1] == 'n':
        print('''você sabe que ele
        não está no centro vago do seu eu''')
    else:
        print('OPS! você não escolheu s ou n')
    acredita  = str.lower(input('Você acredita que existem saídas que dão nele?\n'
                  's (sim)/n (não): '))

    if acredita[0:1] == 's':
        print('''Se há saídas
    que dão nele, estão certamente à orla
    iridescente do meu pensamento [...].''')

    elif acredita[0:1] == 'n':
        print('''você sabe que ele
        não está no centro vago do seu eu''')
    else:
        print('OPS! você não escolheu s ou n')
    entrega = str.lower(input('você se entrega às imagens do espelho ou da água\n'
                              'e (espelho)/a (água): '))

    def saida():
        coisas = ['peixe', 'pássaro']
        p = []
        for c in coisas:
            p.append(c)
        print('\t',p[0], '''entre peixes''', p[1], '''entre pássaros,
        um dia passo inteiro para lá.
        ''')

    if entrega[0:1] == 'e' or entrega[0:1] == 'a':
        print('''..., tendo no fundo o céu,
    não penso que se apaixonou por si.
    Não: bom é ver-se no espaço diáfano
    do mundo, coisa entre coisas que há
    no lume do espelho, fora de si:''')
        saida()

    else:
        print('OPS! você não escolheu a ou e')
q7()

#################### Questão 8 ##################
def q8():
    import random, array
    vogal = ['a','e','i','o','u']
    nomes = []
    for i in range(1,46): # gera os nomes
        nomes.append('n'+random.choice(vogal)+'m'+random.choice(vogal))
    nomes = tuple(nomes)
    print('total de nomes gerados:',len(nomes),'nomes')

    # gera dados para as notas idades e alturas
    def dados():
        return array.array('d', (random.random() for n in range(1,46)))
    print('total de dados (notas, idades e alturas), gerados:', len(dados()), 'de cada')

    notas = [n*10 for n in dados()] # varrer cada objeto para formatar a saida
    idades = [i*100 for i in dados()]
    alturas = [a*10 for a in dados()]

    contNota = 0
    soma = 0
    for nota in notas:
        if nota >= 7:
            contNota += 1
            soma = soma + nota
    if contNota >= ((45 * (10 / 100))): # mais de 10% da turma foi aprovada - testar com 90%
        print('Média dos %d aprovados: %.2f'% (((45-(45 * (90 / 100))),(soma / contNota))))
    else:
        print('Média dos %d aprovados: %.2f' % ((45-(45 * (10 / 100)),(soma / contNota))))
    print('O aluno mais velho: 1%d'% ((max(idades))/10))
    print('A estudante mais alta 1,%d'% ((max(alturas))))

    # quantidade de alunos com a letra a no nome
    cont = 0
    nomeOrdenados = []
    for nome in nomes:
        nomeOrdenados.append(nome)
        for i in range(len(nome)):
            if nome[i] == 'a':
                cont += 1
                #print('%d) aluna(o) %s'% (cont, nome))
    print('total de alunos com a letra a no nome:', cont)
    nomeOrdenados.sort()
    print('o nome dos estudantes em ordem alfabética:')
    for n in range(len(nomeOrdenados)):
        print('%dº - %s'% (n+1, nomeOrdenados[n]))

q8()
