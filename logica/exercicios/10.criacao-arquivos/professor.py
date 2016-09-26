'''Exercícios com arquivos
1) Crie um programa que leia um arquivo de texto e gere um arquivo de saída paginado.
Cada linha deve conter mais de 76 caracteres.
Cada página terá no máximo 60 linhas.
Adicione na ultima linha de cada página o número da página atual e o nome do arquivo original.
'''
import io, random, string


def random_id(length): 
    number =  '0123456789' 
    alpha =  'abcdefghijklmnopqrstuvwxyz' 
    id =  '' 
    for i in range ( 0 , length , 2 ): 
        id += random.choice(number) 
        id += random.choice(alpha) 
    return id
def arquivo(n):
    nome = ('pagina%s.txt'%n)
    return nome
def criarArquivo(n):
    nome = arquivo(n)
    criarquivo = open(nome, 'w')
    for e in range(62):
        criarquivo.writelines('%s\n'% random_id(77) )
        if e == 61:
            criarquivo.writelines('Pagina %s'%n)
    criarquivo.close()

for n in range(1,3): 
    criarArquivo(n)
