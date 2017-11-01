def questao3():
    '''
    3. (1) Construa um algoritmo que para um grupo de 50 valores inteiros, determine por meio de uma função uma lista para:
    a) determinar a soma dos 25 números positivos;
    b) determinar a quantidade de valores negativos. (usar filtro)
    '''
    
    lista=list(range(-25,25))
    print('tamanho da lista: ',len(lista))
    print(lista)

# ------------------------------------------------------------------
    def letraA():
        listaA=[0]
        cont=0
        
        for i in range(0,51):

            if len(listaA)<25 and lista[i]>=0:
                listaA.append(lista[i])

            if cont==0:
                listaA.pop(0)
            cont+=1

        print("tamanho da listaA: ",len(listaA))
        print(listaA)
# ------------------------------------------------------------------
    def letraB():
        listaB=[0]

        cont=0
        
        for i in range(0,51):
            
            if len(listaB)<25 and lista[i]<=0:
                listaB.append(lista[i])
                
            if cont==0:
                listaB.pop(0)
            cont+=1

        print("tamanho da listaB: ",len(listaB))    
        print(listaB)
# ------------------------------------------------------------------
    print('----------------')
    print('letra a:')
    letraA()
    print('----------------')
    print('letra b:')
    letraB()
    print('----------------')    

# ------------------------------------------------------------------

# programa

print("\n------\nQuestão 3\n------")
questao3()
