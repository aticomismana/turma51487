def removeL():
    '''l = ['a','b','c'] 
    #fifo = first in first out - 1° que etra e 1° que sai - fila de dados
    print(l)
    del l[1]
    print(l)
    l1 = list(range(1,11))
    print(l1)
    print(l1[2:5])
    del l1[3:6]
    print(l1)'''
    #como verifica se a lista esta vazia antes de usar o pop
    dT = int(input("digite o tamanho da lista:"))
    l2 = list(range(dT+1))
    print(l2)
    print("Qual item Você quer remover:")
    while len(l2) != 0:    
        rV = int(input("Digite oque você quer remover:"))
        if rV == 1 or rV == 0:
            l2.remove(rV)
        else:
            l2.remove(rV)
        print(l2)
    print("lista VAZia")
def listaPop():
    dT = int(input("digite o tamanho da lista:"))
    lista = list(range(dT+1))
    lista.reverse()
    if len(lista) != 0:
        for e in range(len(lista)):
            print(lista)
            lista.pop()
        
#removeL()
listaPop()


def filaBanco():
    ultimo=10
    fila=list(range(1,ultimo+1))
    while True:
        print('Existem %i clientes nesta fila'%len(fila))
        print('fila atual',fila)
        print('digite F para adicionar um cliente ao fim da fila')
        print('ou A para realizar o atendimento. S para sair')
        operacao=input('operacao A, F ou S: ')
        if str.upper(operacao)=='A':
            if (len(fila))>0:
                atendido=fila.pop(0)
                print('Cliente % atendido'% atendido)
            else:
                print('fila vazia: inguem para atender')
        elif str.upper(operacao)=='F':
            ultimo+=1
            fila.append(ultimo)
        elif str.upper(operacao)=='S':
            break
        else:
            print('Operacao invaloida: digite apenas A,F ou S!')

filaBanco()      
