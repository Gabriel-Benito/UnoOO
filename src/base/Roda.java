package base;
//oi
/**
 * 
 * @author Luciano
 *
 */
public class Roda {
	Baralho compra, descarte;// o baralho enviado pelo "jogo" nada mais é um baralho de compra, que retiramos
								// as cartas iniciais dos jogadores
	Jogador jogadores[];
	int idJogador;// usado para inserir os jogadores recebidos de "jogo" no vetor jogadores, e
					// quando o jogo começa, é o índice do ultimo jogadr que jogou
	int sentido;// é um valor, que varia entre positivo e negativo, e é somado á posição do
				// ultimo jogador para definir o próximo a jogar

	/**
	 * receber baralho do "jogo"
	 * 
	 * @param recebido
	 */
	public Roda(Baralho recebido) {
		compra = recebido;
	}

	/**
	 * adicionar jogadores na roda, e sua ordem será a posição no vetor
	 * 
	 * @param recebido
	 * @param nJogadores
	 */
	public Roda(Jogador recebido, int nJogadores) {
		jogadores[idJogador] = recebido;
		idJogador++;
	}

	public void distribuirCartas() {

	}

	/**
	 * calcula a posição atual mais o sentido e retorna a posição do próximo
	 * jogador; caso o incremento possua valor maior que 1, informa o próximo
	 * jogador e altera o sentido(que é nosso incremento) para 1
	 * 
	 * @return
	 */
	public int proximoJogador() {
		return 0;
	}

	public void comprarCarta(Jogador comprador) {
		// recebe o jogador, tira a ultima carta da "compra" e adiciona uma carta na sua
		// "mão"
	}

	public void descartarCarta(Carta recebida) {
		// recebe uma carta e coloca no "descarte"
	}

	public void verificarCompra() {
		// verifica se já está na hora de "transformar" o "descarte" em compra, tipo, se
		// tiver menos que 3 cartas na "compra" esta função chama a função
		// tranformaDescarte
	}

	public void transformaDescarte() {
		// pega as cartas de descarte, exceto a ultima, e coloca na "compra"
	}

	public void inverter() {
		// esta função é chamada pela classe ação, e altera o valor de sentido,
		// multiplicando por -1
	}

	public void pular() {
		// altera o valo de sentido, adicionando mais 1 no valor, pois o sentido é o
		// incremento, e ao invés de passar para a próxima pessoa, ele irá passar para a
		// asegunda próxima pessoa
	}

	public void circular() {
		// método responsável por tranformar o vetor em um "círculo", pois verifica se o
		// "próximo jogador" excede o vetor, caso positivamente, volta para o primero,
		// ou o segundo caso a ultima carta seja um "pular", e caso exceda
		// negativamente, ele volta para a última posição do vetor dos jogadores, ou
		// para a penúltima, caso a última carta seja um "pular"
	}

	public void chamarJogadaJogador() {
		// chama o próximo jogador para realizar a sua jogada
		// utiliza o valor retornado pela função proximoJogador

	}

}
