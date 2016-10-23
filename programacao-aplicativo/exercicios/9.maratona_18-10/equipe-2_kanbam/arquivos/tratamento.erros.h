/*
 *
 *	Arquivo-cabeçalho para tratamento de erros.
 *	Arquivo com a finalidade de separar as frases
 *	de erro do arquivo principal.
 *
 */


#define ERR_NO_01 "\n\n%sNão foi possível concatenar o endereco %s com a extensão .bin.%s\n", KRED , endereco , KWHT
#define ERR_NO_02 "\n\n%sNÂO FOI POSSÌVEL ABRIR O ARQUIVO : %s.\n%sArquivo possivelmente inexistente.%s\n", KRED , endereco , KYEL , KWHT
#define ERR_NO_03 "\n\n%sERRO COM O ARQUIVO: %s!%s\n", KRED , endereco , KWHT
#define ERR_NO_04 "\n\n%sERRO COM O PONTEIRO!%s\n", KRED , KWHT
#define ERR_NO_05 "\n\n%sNão foi possível concatenar o endereco %s com a extensão .nomes.%s\n", KRED , enderecoCompleto , KWHT
#define ERR_NO_06 "\n\n%sNão foi possível abrir/ler arquivo de atividades no endereco: %s.%s\n", KRED , enderecoCompleto , KWHT
#define ERR_NO_07 "\n\n%sERRO COM O ARQUIVO: %s!%s\n", KRED , enderecoCompleto , KWHT
#define ERR_NO_09 "\n\n%sVETOR PARA SALVAMENTO INEXISTENTE!%s", KRED , KWHT
#define ERR_NO_10 "\n\n%sNÂO FOI POSSÌVEL ABRIR/CRIAR O ARQUIVO PARA SALVAR: %s.\n%sPossível falta de permissão.%s\n", KRED , enderecoCompleto , KYEL , KWHT
#define ERR_NO_11 "\n\n%sNÂO FOI POSSÌVEL ESCREVER NO ARQUIVO: %s.\n%sPossível falta de permissão.%s\n", KRED , enderecoCompleto , KYEL , KWHT
#define ERR_NO_13 "\n\n%sFalha ao salvar os nomes das atividades no endereco: %s.nomes.%s\n", KRED , endereco , KWHT
#define ERR_NO_16 "\n\n%sNão foi possível abrir/criar arquivo de atividades no endereco: %s.%s\n", KRED , enderecoCompleto , KWHT
#define ERR_NO_18 "\n\n%sNão foi possível identificar o endereco: %s.\n%sPossível erro na passagem por parâmetro.%s\n", KRED , endereco , KYEL , KWHT
#define ERR_NO_19 "\n\n%sNão foi possível identificar a extensao: %s.\n%sPossível erro na passagem por parâmetro.%s\n", KRED , endereco , KYEL , KWHT
#define ERR_NO_20 "\n\n%sProblema com o nome do arquivo: %s.\n%sNome do arquivo possivelmente com tamanho nulo.%s\n", KRED , endereco , KYEL , KWHT
#define ERR_NO_21 "\n\n%sProblema com o nome da extensão: %s.\n%sNome da extensão possivelmente com tamanho nulo.%s\n", KRED , extensao , KYEL , KWHT
#define ERR_NO_22 "\n\n%sNão foi possível alterar o tamanho do endereço: %s.\n%sFalha na realocação.%s\n", KRED , endereco , KYEL , KWHT
#define ERR_NO_23 "\n\n%sNão foi possível copiar a extensão: %s.\n%s\n", KRED , extensao , KWHT
#define ERR_NO_24 "\n\n%sNão foi possível medir a string: %s.\n%sString vazia.%s\n", KRED , string , KYEL , KWHT
#define ERR_NO_25 "\n\n%sPROBLEMA NA ALOCAÇÂO DAS ATIVIDADES!%s" , KRED , KWHT
#define ERR_NO_26 "\n\n%sFalha ao obter nomes das atividades do arquivo %s.\n%sPossível arquivo recém-criado!%s" , KRED , enderecoCompleto , KYEL , KWHT
#define ERR_NO_27 "\n\n%sFalha ao mover o ponteiro do arquivo para a posição inicial!%s" , KRED , KWHT
#define ERR_L10N  "\n\n%sFalha em configurar localização do sistema.%s\n" , KRED , KWHT

#define pErr( __erno ) ( fprintf( stderr , __erno ), sleep( 2.5 ) )
