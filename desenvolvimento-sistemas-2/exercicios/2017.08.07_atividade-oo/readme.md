# Atividade  

## Questão 1:  

Criar uma classe com o nome Carro com:  

Os atributos:  
		- String cor;  
		- String modelo;  
		- double velocidadeAtual;  
		- double velocidadeMaxima;  

E os métodos:
	- void liga(): que exibirá uma mensagem "Carro ligado";  
	- void acelera(): passando por paramêtro a quantidade que será somada à velocidadeAtual;  
	- int pegaMarcha(): condições para retornar em qual marcha o carro está:  
	1. Entre velocidade 0 e 20: retornar marcha 1  
	2. Entre velocidade 20 e 40: retornar marcha 2  
	3. Entre velocidade 40 e 60: retornar marcha 3  
	4. Entre velocidade 70 e 100: retornar marcha 4  
	5. Acima de 100: retornar marcha 5