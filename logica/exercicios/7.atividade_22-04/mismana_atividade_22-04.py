'''
QUESTAO 9

Construa um algoritmo, utilizando array, while e lista, para corrigir provas a partir de um gabarito, com as seguintes funções:
- ler o gabarito;
- ler as respostas dos candidatos;
- comparar as respostas com o gabarito e armazenar a corretude ou não destas;
- promover ranking de classificação baseado na quantidade de acertos.
.

'''
#import
import array as ar

#var
qtdQuestoes=0
gabarito=[]
qtdAlternativas=0
alternativas={'A':0,'B':1,'C':2,'D':3,'E':4,'F':5,'G':6,'H':7,'I':8,'J':9}
qtdCandidatos=0
respostas=ar.array('l')
cont=0
cont2=0

#program
print('\n---------------\nPré-cadastro\n---------------')
qtdQuestoes=int(input('Informe a quantidade de questões da prova: '))
qtdAlternativas=int(input('Informe a quantidade de alternativas por questão: '))

print('\n--------------\nCadastro de Gabarito\n---------------')
cont=0
while(cont<qtdQuestoes):
    print('Questão %d:'%(cont+1))
    alt=str.upper(input('Informe a alternativa correta (letra): '))

    gabarito.append(alternativas[alt])
    cont+=1

print('\n---------------\nCadastro de Respostas\n---------------')
cont=0
qtdCandidatos=int(input('Informe a quantidade de candidatos que realizaram a prova: '))
while(cont<qtdCandidatos):
    
    respCandidatos=[]
    print('\nCandidato %d\n----'%(cont+1))
    cont2=0
    while(cont2<qtdQuestoes):
        print('-> Questão %d:'%(cont2+1))
        alt=str.upper(input('Informe a alternativa respondida pelo candidato (letra): '))
        respCandidatos.append(alternativas[alt])
        cont2+=1
    print('respCandidatos',respCandidatos)
    # erro aqui add list in array
    respostas.append(respCandidatos)
    print('respostas:',respostas)
        
print('\n---------------\nCorreção Automática\n---------------') 
