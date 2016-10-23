/*
 *	Arquivo-cabeçalho com definições de cores
 *	determinadas pelo padrão ANSI para serem
 *	escapadas pelo terminal através do print.
 *
 *	Equipe: Ícaro, Thiago, Bertolino
 *
 */

#if defined( linux ) || defined( _terminal_ansi_ )
	#define KNRM "\x1B[0m"
	#define KRED "\x1B[31m"
	#define KGRN "\x1B[32m"
	#define KYEL "\x1B[33m"
	#define KBLU "\x1B[34m"
	#define KMAG "\x1B[35m"
	#define KCYN "\x1B[36m"
	#define KWHT "\x1B[37m"
#elif defined( _WIN32 ) || defined( WIN32 )
	#define KNRM ""
	#define KRED ""
	#define KGRN ""
	#define KYEL ""
	#define KBLU ""
	#define KMAG ""
	#define KCYN ""
	#define KWHT ""
#endif