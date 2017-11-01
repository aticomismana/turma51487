from array import array

def filadeBanco():
    ultimo = 10
    fila = array('f',(range(1,ultimo+1)))
    while True:
        print('Existem %i clientes nesta fila ' %len(fila))
        print('fila atual:\n', tuple(fila))#formatando a saída
        print('F para adicionar um cliente ao fim da fila:\n')
        print('ou A para realizar o atendimento. S para sair')
        op = input('Operação ::A:: ::F:: ou ::S::')
        if str.upper(op) =='A':
            if (len(fila))>0:
                fila.pop(0)
                print('Atendimento Realizado!')
            else:
                print('fila vazia: niguém para atender')
        elif str.upper(op) =='F':
            ultimo += 1
            fila.append(ultimo)
        elif str.upper(op) == 'S':
            print('Banco fechado.')
            break
        else:
            print('Operação inválida: digite apenas A, F ou S!')
filadeBanco()
