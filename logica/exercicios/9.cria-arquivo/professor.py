import os        					 	 : importar diretorios
os.listdir()     					         : Ver diretorios
os.mkdir('aula') 					 : Cria diretorio caso não exista
os.makedirs('aula/python/console tk') 	 : Cria diretorio dentro de outros diretorios caso não exista
os.getcwd()						 : Informa qual diretorio você está

os.unlink('teste.txt') 					 : Apaga um arquivo 



import io
def criaArquivo():
    index = io.open('index.html','w',encoding='utf-8')
    index.writelines('<!DOCTYPE html>\n'+
    "<html lang='pt-br'>\n"+
    "<head>\n"+
    '<meta charset="utf-8">\n'+
    '<title>Hello</title>\n'+
    '</head>\n'+
    '<body>\n'+
    '<style type="text/css">body{width:970px;magin:0 auto;}div{width:20%;margin:0 auto;display:block;background:#000;border-radius:10px;}h1{color:#fff;}</style>'+
    '<div>'                 )
    for e in range(3,0,-1):
        index.writelines('<h1>'+str(e)+'</h1>')
    index.writelines('<h1>Olá mundo</h1>\n'+
                     '</div>'
                     '</body>\n'+
                     '</html>')
    index.close()
criaArquivo()
    
