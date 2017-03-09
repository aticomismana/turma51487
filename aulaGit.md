Curso técnico senai

Informática Desenvolvimento de sistemas I

Carga horária: 100h

1.  download do git 
    1.1. google "git download" 
    1.2. Acessar site para download 
    1.3. seleciona sistema operacional 
    1.4. download e instala 

2. Criar diretorio de projetos 
    2.1. $ mkdir Projetos 
        2.1.1. C:\Users\geltoncruz\Documents\Projetos 
    2.2. acessar diretorio de projetos 
    2.3. $ cd C:/Users/{userName}/Documents/Projetos 
    2.4. $ ls list source 

3. Iniciar repositorio git 
    3.1. $ git init 
    3.2. Configuração git 
        3.2.1. $ git config --global user.name "Gelton Cruz" 
        3.2.2. $ git config --global user.email "Gelton@midiaplural.com.br" 

4. Track files 
    4.1. criar arquivo README.md 
    4.2. $ git status [Para saber o status do repositorio) 
    4.3. $ git add README.md  
    4.4. $ git status [verificar status]
    4.5. $ git commit -m "{texto}" [para trackear arquivos]
    4.6. $ git [log para acompanhar registros de commit]

5. Criando host
    5.1. Criar repositorio online
    5.2. Pegar endereco do host
    5.3. Add endereco remoto
    5.4. $ git remote add origin https://github.com/geltoncruz/devsis.git
    5.5. $ git remote -v [visualizar remote]

6. Enviar para o git
   6.1. $ git push -u origin master