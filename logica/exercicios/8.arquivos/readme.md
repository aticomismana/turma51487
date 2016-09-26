'r' aberto para leitura ( padrão)
'w' aberto para escrita , truncando o arquivo primeiro
'a' abrir para a escrita, anexando ao final do arquivo se ele existir
'b' modo binário 
't' modo de texto (padrão)
'+' Abrir um arquivo em disco para a atualização ( leitura e escrita)
'U' Modo nova linha universal (para compatibilidade com versões anteriores ; desnecessários
              para novo código )

open( nome_do_arquivo, modo )
read() – lê todo o conteúdo do arquivo
readline() – lê uma linha do arquivo
readlines() – lê todas as linhas do arquivo
seek() – posiciona o “cursor” de leitura
write(conteudo) – escreve ‘conteudo’ no arquivo


- Crie um arquivo e escreva em um arquivo 0 a 100
#################### Cria  o arquivo caso não exista e escreve de 1 a 100 ####################

arquivo = open('numeros.txt', 'w')
for linha in range(1,101):
    arquivo.write('%d\n' % linha)
arquivo.close()


- Imprima todo o conteúdo do arquivo
#################### Ler as linhas e imprime ####################


arquivo = open('numeros.txt', 'r')
for linha in arquivo.readlines():
    print(linha)
arquivo.close()




= Criar dois arquivos. Um com 10 números pares e outro com dez números impares. Em, seguida reúna-os em um arquivo pares e impares em ordem crescente.



listaimpar = open('textos/listaimpar.txt', 'w')
listapares = open('textos/listapares.txt', 'w')

for i in range(0,11):
    if (i%2) == 0:
        listapares.write(str(i))
    else:
        listaimpar.write(str(i))

listaimpar.close()
listapares.close()

listaimpar = open('textos/listapares.txt', 'r')
listapares = open('textos/listaimpar.txt', 'r')
listacresc = open('textos/pareimpar.txt', 'w')

lista = list(listapares.read() + listaimpar.read())
lista.sort()

for i in lista:
    if int(i) != (len(lista) - 1):
        listacresc.write(i + ', ')
    else:
        listacresc.write(i + '.')

print(len(lista))

