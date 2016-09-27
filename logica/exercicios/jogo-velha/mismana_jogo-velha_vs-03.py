# ===========================
# FUNÇÕES
# ===========================
#----------------------------
#----------------------------
#----------------------------
#----------------------------
def verificarGanhador(simbolo):
    if (tabuleiro[0][0]==simbolo and tabuleiro[0][1]==simbolo and tabuleiro[0][2]==simbolo or
    tabuleiro[1][0]==simbolo and tabuleiro[1][1]==simbolo and tabuleiro[1][2]==simbolo or
    tabuleiro[2][0]==simbolo and tabuleiro[2][1]==simbolo and tabuleiro[2][2]==simbolo or
    tabuleiro[0][0]==simbolo and tabuleiro[1][0]==simbolo and tabuleiro[2][0]==simbolo or
    tabuleiro[0][1]==simbolo and tabuleiro[1][1]==simbolo and tabuleiro[2][1]==simbolo or
    tabuleiro[0][2]==simbolo and tabuleiro[1][2]==simbolo and tabuleiro[2][2]==simbolo or
    tabuleiro[0][0]==simbolo and tabuleiro[1][1]==simbolo and tabuleiro[2][2]==simbolo or
    tabuleiro[2][0]==simbolo and tabuleiro[1][1]==simbolo and tabuleiro[0][2]==simbolo):
        return True
    else:
        return False
#----------------------------
def gravarJogada(posicao,simbolo):
    if posicao==1:
        tabuleiro[0][0]=simbolo
    if posicao==2:
        tabuleiro[0][1]=simbolo
    if posicao==3:
        tabuleiro[0][2]=simbolo
    if posicao==4:
        tabuleiro[1][0]=simbolo
    if posicao==5:
        tabuleiro[1][1]=simbolo
    if posicao==6:
        tabuleiro[1][2]=simbolo
    if posicao==7:
        tabuleiro[2][0]=simbolo
    if posicao==8:
        tabuleiro[2][1]=simbolo
    if posicao==9:
        tabuleiro[2][2]=simbolo        
#----------------------------
def verificarJogada(posicao):
    totem=False
    if posicao==1:
        if tabuleiro[0][0]==' ':
            totem=True
    elif posicao==2:
        if tabuleiro[0][1]==' ':
            totem=True
    elif posicao==3:
        if tabuleiro[0][2]==' ':
            totem=True
    elif posicao==4:
        if tabuleiro[1][0]==' ':
            totem=True
    elif posicao==5:
        if tabuleiro[1][1]==' ':
            totem=True
    elif posicao==6:
        if tabuleiro[1][2]==' ':
            totem=True
    elif posicao==7:
        if tabuleiro[2][0]==' ':
            totem=True
    elif posicao==8:
        if tabuleiro[2][1]==' ':
            totem=True        
    elif posicao==9:
        if tabuleiro[2][2]==' ':
            totem=True
    return totem
#----------------------------
def imprimirTabuleiro(tabuleiro):
    print('''
   POSIÇÕES  JOGADAS
    1|2|3     '''+tabuleiro[0][0]+'|'+tabuleiro[0][1]+'|'+tabuleiro[0][2]+'''
    -----     -----
    4|5|6     '''+tabuleiro[1][0]+'|'+tabuleiro[1][1]+'|'+tabuleiro[1][2]+'''
    -----     -----
    7|8|9     '''+tabuleiro[2][0]+'|'+tabuleiro[2][1]+'|'+tabuleiro[2][2]+'\n')    
#----------------------------
def modo2():
    print('**** modo multiplayer ****')

    jog_name={1:' ', 2:' '}
    jog_simbolo={1:' ',2:' '}

    print('----------------------------\n-> Identificação\n')
    for i in range(1,3):
        jog_name[i]=input('Jogador informe seu nome: ')
        if i==1:
            totem=str.upper(input('Jogador informe seu simbolo (X ou O): '))
            if totem=='X':
                jog_simbolo[i]='X'
                jog_simbolo[i+1]='O'
            else:
                jog_simbolo[i]='O'
                jog_simbolo[i+1]='X'
        else:
            print('Jogador 1: '+jog_name[1]+', Simbolo: '+jog_simbolo[1]+'\nJogador 2: '+jog_name[2]+', Simbolo: '+jog_simbolo[2])

    print('----------------------------\n-> Hora de Jogar\n----------------------------')
    global tabuleiro
    tabuleiro=[ [' ', ' ', ' '],[' ', ' ', ' '],[' ', ' ', ' '] ]

    ganhador=False
    cont=0
    cont2=1
    while(cont<2):
        if cont>1 and ganhador==False: #posso tirar o and
            imprimirTabuleiro(tabuleiro)
            print('-> Deu velha!!!!')
        else:
            #cont2=1
            while(cont2<10):
            #for i in range(1,10):
                imprimirTabuleiro(tabuleiro)        

                if cont2%2==1:
                    name=jog_name[1]
                    simbolo=jog_simbolo[1]
                else:
                    name=jog_name[2]
                    simbolo=jog_simbolo[2]

                jogadaLegal=False
                while(jogadaLegal==False):
                    posicao=int(input(''+name+', escolha uma posição livre do tabuleiro: '))
                    jogadaLegal=verificarJogada(posicao)

                #print(posicao,simbolo)
                gravarJogada(posicao,simbolo)

                ganhador=verificarGanhador(simbolo)
                if ganhador==True:
                    imprimirTabuleiro(tabuleiro)
                    print('Temos um(a) vencedor(a)!!')
                    print('-> Parabéns '+name+'!!!!!!!')
                    cont2+=10
                    break
                    #break
                    
                cont2+=1
        cont+=1
    print('----------------------------')    
#----------------------------
def modo1():
    print('**** modo player único ****')
    print('Desculpe, ainda está em desenvolvimento! Enquanto isso jogue no modo 2. Volte em breve!!')
#----------------------------
def menu():         
    print('----------------------------\nBem Vindo ao Jogo da Velha\nVersão 0.1\n----------------------------')

    jogo=True
    while(jogo):
        print('----------------------------\n-> Modo de Jogo\n\n1-Um jogador\n2-Dois Jogadores\n')
        modo=int(input('Informe o código do modo desejado: '))
        print('----------------------------')
        if(modo==1):
            modo1()
        else:
            modo2()
        opcao=str.upper(input('----------------------------\nDeseja jogar novamente (Informe S ou N): '))
        if opcao=='N':
            jogo=False
    print('----------------------------\n-> Licença: CC BY-SA\n** Obrigado por usar o nosso Jogo da Velha!!\n----------------------------')
#----------------------------
def main():
    menu()    
#----------------------------

# ===========================
# PROGRAMA
# ===========================

if __name__ == '__main__':
    main()

# ===========================
