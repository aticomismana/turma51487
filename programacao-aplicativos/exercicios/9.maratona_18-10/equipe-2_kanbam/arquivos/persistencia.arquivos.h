/*
 *	Arquivo-cabeçalho das funções de persistência de dados
 *	em arquivos para a mini-maratona da Prof.ª Fran.
 *
 *	Equipe: Ícaro, Thiago, Bertolino
 *
 */

#include "tratamento.erros.h"

afazeres * buscaDados( char *endereco );

char ** buscaDadosNomes( char *endereco );

short escreveDados( afazeres *vetor , size_t tamVet , char *endereco );

short escreveDadosNomes( afazeres *vetor , size_t tamVet , char *endereco );

char * completaNome( char *endereco , char *extensao );

size_t tamString( char *string );

afazeres * buscaDados( char *endereco ){
	FILE *arquivo; size_t indices_lidos; unsigned int loop = 0;
	afazeres *dadosDoArquivo = NULL , dadosTmp; char *enderecoCompleto , **nomesBuscados;

	if( !(enderecoCompleto = completaNome( endereco , ".bin" )) ){ pErr( ERR_NO_01 ); return NULL; }

	if( !(arquivo = fopen( enderecoCompleto , "a+b" )) ){ pErr( ERR_NO_02 ); return NULL; }
	rewind( arquivo );

	if( !(nomesBuscados = buscaDadosNomes( endereco )) ){ pErr( ERR_NO_26 ); fclose( arquivo ); return NULL; }

	do{
		dadosDoArquivo = (afazeres *) realloc( dadosDoArquivo , ( loop + 1 ) * sizeof( afazeres ) );

		indices_lidos = fread( &dadosTmp , sizeof( afazeres ) , 1 , arquivo );

		dadosTmp.nomeAtv = nomesBuscados[loop];

		dadosDoArquivo[loop++] = dadosTmp;

	}while( indices_lidos == 1 && !feof( arquivo ) && !ferror( arquivo ) && !dadosTmp.final );

	if( ferror( arquivo ) ){ pErr( ERR_NO_03 ); fclose( arquivo ); return NULL; }
	fclose( arquivo );

	if( !dadosDoArquivo ){ pErr( ERR_NO_04 ); free( dadosDoArquivo ); return NULL; }

	return dadosDoArquivo;

}

char ** buscaDadosNomes( char *endereco ){
	FILE *arquivo = NULL; char *enderecoCompleto = NULL, **nomeLido = NULL , letra; unsigned int loop = 0 , loopLetra;
	#if defined( _WIN32 ) || defined( WIN32 )
		char *nomeTmp = NULL; size_t tamNomeTmp;
	#endif
	
	if( !(enderecoCompleto = completaNome( endereco , ".nomes" )) ){ pErr( ERR_NO_05 ); return NULL; }
	
	if( !(arquivo = fopen( enderecoCompleto , "a+" )) ){ pErr( ERR_NO_06 ); return NULL; }
	
	rewind( arquivo );
	while( (letra = fgetc(arquivo)) != EOF );
	if( feof( arquivo ) ) if( ftell( arquivo ) <= 1 ){ pErr( ERR_NO_26 ); fclose( arquivo ); return NULL; }
	rewind( arquivo );

	do{

		nomeLido = (char **) realloc( nomeLido , ( loop + 1 ) * sizeof( char * ) );

		loopLetra = 0;
		while( ( letra = fgetc( arquivo ) ) != '\n' && letra != EOF ){
			#ifdef linux
				nomeLido[loop] = (char *) realloc( nomeLido[loop] , ( loopLetra + 2 ) * sizeof( char ) );
				nomeLido[loop][loopLetra] = letra; loopLetra++;
			#elif defined( _WIN32 ) || defined( WIN32 )
				nomeTmp = (char *) realloc( nomeTmp , ( loopLetra + 2 ) * sizeof( char ) );
				nomeTmp[loopLetra] = letra; loopLetra++;
			#endif
		}
		#ifdef linux
			if( letra != EOF ) nomeLido[loop][loopLetra] = '\0';
		#elif defined( _WIN32 ) || defined( WIN32 )
			if( letra != EOF ) nomeTmp[loopLetra] = '\0';
			loopLetra = 0;
			tamNomeTmp = tamString( nomeTmp );
			nomeLido[loop] = (char *) malloc( ( tamNomeTmp + 1 ) * sizeof( char ) );
			while( loopLetra <= tamNomeTmp ) nomeLido[loop][loopLetra] = nomeTmp[loopLetra++];
		#endif

		++loop;

	}while( !ferror( arquivo ) && !feof( arquivo ) && letra != EOF );

	if( ferror( arquivo ) ){ pErr( ERR_NO_07 ); fclose( arquivo ); return NULL; }

	fclose( arquivo );

	return nomeLido;
}


short escreveDados( afazeres *vetor , size_t tamVet , char *endereco ){
	FILE *arquivo; char *enderecoCompleto;

	if( !(enderecoCompleto = completaNome( endereco , ".bin" )) ){ pErr( ERR_NO_01 ); return 0; }

	if( !vetor ){ pErr( ERR_NO_09 ); return 0; }

	if( !(arquivo = fopen( enderecoCompleto , "wb" )) ){ pErr( ERR_NO_10 ); return 0; }

	if( fwrite( vetor , sizeof( afazeres ) , tamVet , arquivo ) < tamVet ){ pErr( ERR_NO_11 ); return 0; }

	if( ferror( arquivo ) ){ pErr( ERR_NO_07 ); fclose( arquivo ); return 0; }
	fclose( arquivo );

	if( !escreveDadosNomes( vetor , tamVet , endereco )){ pErr( ERR_NO_13 ); return 0; }

	return 1;

}

short escreveDadosNomes( afazeres *vetor , size_t tamVet , char *endereco ){
	FILE *arquivo; char *enderecoCompleto; size_t passoNome = 0;

	if( !(enderecoCompleto = completaNome( endereco , ".nomes" )) ){ pErr( ERR_NO_05 ); return 0; }

	if( !vetor ){ pErr( ERR_NO_09 ); return 0; }

	if( !(arquivo = fopen( enderecoCompleto , "w" )) ){ pErr( ERR_NO_16 ); return 0; }

	while( !vetor[passoNome].final ) fputs( vetor[passoNome++].nomeAtv , arquivo ) , fputc( '\n' , arquivo );

	if( ferror( arquivo ) ){ pErr( ERR_NO_07 ); fclose( arquivo ); return 0; }
	fclose( arquivo );

	return 1;

}

char * completaNome( char *endereco , char *extensao ){
	size_t tamEnd , tamExt , ind_P_Esc = 0; char *endTmp = NULL;

	if( !endereco ){ pErr( ERR_NO_18 ); return NULL; }
	if( !extensao ){ pErr( ERR_NO_19 ); return NULL; }

	if( !(tamEnd = tamString( endereco )) ){ pErr( ERR_NO_20 ); return NULL; }
	if( !(tamExt = tamString( extensao )) ){ pErr( ERR_NO_21 ); return NULL; }

	if( !(endTmp = (char *) realloc( endTmp , tamEnd + tamExt + 1 )) ){ pErr( ERR_NO_22 ); return NULL; };

	while( ind_P_Esc < tamEnd )	endTmp[ind_P_Esc] = *endereco++ , ++ind_P_Esc;
	while( ind_P_Esc < tamEnd + tamExt ) endTmp[ind_P_Esc] = *extensao++ , ++ind_P_Esc;
	*(endTmp+ind_P_Esc) = '\0';

	if( !endTmp ){ pErr( ERR_NO_23 ); return NULL; }
	return endTmp;
}

size_t tamString( char *string ){
	size_t tamStr = 0;
	if( !string ){ pErr( ERR_NO_24 ); return 0; }
	while( *string++ != '\0' ) ++tamStr;
	return tamStr;
}