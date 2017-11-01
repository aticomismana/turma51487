int verificarPrimo(int num){
	int cont=0,aux,i;

	if(num==0){
		return 0;
	} else {
		// testa numero primo
		for(i = 1;i<=num; i++){
			aux = num%i;
			if(aux==0){
				cont++;
			}
		}
		
		// verifica teste
		if(cont<=2){
			return 1;
		}else{
			return 0;
		}
	}
}

void main(){
	int num;
	printf("\nVerificacao de Numero Primo\n\nInforme o numero inteiro a ser verificado: ");
	scanf("%d",&num);
	
	if ( verificarPrimo(num) == 1 ) {
		printf("\nO numero %d eh primo!",num);
	} else {
		printf("\nO numero %d nao eh primo!",num);
	}
	
	getchar();
}
