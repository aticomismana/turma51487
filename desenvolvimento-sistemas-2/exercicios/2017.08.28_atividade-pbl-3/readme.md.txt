Problema 3 - Aeroporto    


 Um avi�o � representado pelo seu prefixo, pelo nome do seu modelo,  
pelo nome do seu fabricante, pela quantidade de assentos e pela quantidade  
de assentos ocupados. Escreva uma classe que represente um avi�o e desenvolva  
um m�todo que informe qual o prefixo da aeronave.  
 Um aeroporto � representado pelo seu c�digo e seu nome (ex.: SSA: Salvador,  
BSB: Bras�lia. etc), por um status que informa se ele � um aeroporto internacional  
ou n�o, uma lista de outros aeroportos para os quais partam v�os diretos � partir  
dele e uma lista de outros aeroportos de onde venham v�os para ele.  
 Al�m disto possui uma lista de avi�es que est�o atualmente no p�tio.  
Escreva uma classe que contemple os atributos apresentados e mais os seguintes  
membros:    

a) Um construtor queinicialize o c�digo do aeroporto e seu nome.  

b) M�todos que verifiquem e alterem a situa��o relativa ao fato do aeroporto  
ser internacional ou n�o.  

c) Um m�todo que verifique e informe se um aeroporto � igual a ele: - public  
boolean equals (Aeroporto aeroposto) - Dois aeroportos s�o iguais se o seu  
c�digo for coincidente.  

d) Um m�todo que receba um prefixo de avi�o como par�metro e informe se a aeronave est� pousada nele. e) Um m�todo que receba  
um outro aeroporto como par�metro e verifique se existe alguma forma de se  
chegar nele.  

  Para isto, o aeroporto deve verificar se ele possui v�o partindo para o   
aeroporto desejado, e caso n�o saia, se existe alguma forma de chegar  
nele � partir dos aeroportos de onde sai -
public boolean possuiRota (Aeroporto  aeroporto)  
Obs: A quantidade m�xima de aeronaves que um aeroporto pode ter em  
terra � igual a 100 e a quantidade m�xima de outros aeroportos com os quais o  
aeroporto pode ter linhas saindo e chegando � 100. 
