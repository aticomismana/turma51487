'''
7) Altere o programa, o jogo da forca. Utilize um arquivo em que a palavra seja gravada a
cada linha.
Use um editor de texto para gerar o arquivo com 10 palavras.
Ao iniciar o programa utilize esse arquivo para carregar a lista de palavras e escolha
uma de forma aleatória.
Experimente também perguntar o nome do jogador e gerar um arquivo com o número de
acertos dos 5 melhores.
O melhor ganha um salgado simples com um refresco ;)
'''
#JOGO  DA FORCA
palavra = input("Digite a palavra secreta:").lower().strip()
for x in range(100):
    print()
digitadas = []
acertos = []
erros = 0
while True:
    senha = ''
    for letra in palavra:
        senha += letra if letra in acertos else "__ "
    print(senha)
    if senha == palavra:
        print("voce acertou!")
        break
    tentativa = input("\nDigite uma letra:").lower().strip()
    if tentativa in digitadas:
        print("voce ja tentou esta letra!")
        continue
    else:
        digitadas += tentativa
        if tentativa in palavra:
            acertos += tentativa
        else:
            erros += 1
            print("voce errou!")
    print("X==:==\nX : ")
    print("X  º " if erros >= 1 else "X")
    linha2 = ""
    if erros == 2:
        linha2 = "  | "
    elif erros == 3:
        linha2 = " \| "
    elif erros >= 4:
        linha2 = " \|/ "
    print("x%s" % linha2)
    linha3 = ""
    if erros == 5:
        linha3 += " / "
    elif erros >= 6:
        linha3 += " /°\ "
    print("x%s" % linha3)
    print("X\n========")
    if erros == 6:
        print("Enforcado!")
        break
