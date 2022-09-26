public class Roda {
	Baralho compra, descarte;// o baralho enviado pelo "jogo" nada mais é um baralho de compra, que retiramos
							 // as cartas iniciais dos jogadores
	Jogador jogadores[];
	private int idJogador;// usado para inserir os jogadores recebidos de "jogo" no vetor jogadores, e
	// quando o jogo começa, é o índice do ultimo jogadr que jogou
	private int sentido;// é um valor, que varia entre positivo e negativo, e é somado á posição do
	// ultimo jogador para definir o próximo a jogar
  
	private int numJogadores;
  /**
   * 
   * @return
   */
  public Carta comprarCarta() {
	  return(compra.pegarCarta(0));
	}
  
	
	
	/**
	 * receber baralho do "jogo"
	 * @param recebido
	 * @param jogadoresRecebidos
	 */
   public Roda(Baralho recebido, Jogador jogadoresRecebidos[]){
	  compra = recebido;
	  this.jogadores = jogadoresRecebidos;
	 for(int i = 0; i < jogadores.length; i ++){
		 jogadores[i].iniciarMao();
	   }
	 do{
	   descarte.adicionarCarta(comprarCarta());
	 }while(descarte[ULTIMA].getCarta() == -1);
  }
  	/**
	   * 
	   * @param recebida
	   */
	public void descartarCarta(Carta recebida) {
	  // recebe uma carta e coloca no "descarte"
	}
  
	public void verificarCompra() {
	  // verifica se já está na hora de "transformar" o "descarte" em compra, tipo, se
	  // tiver menos que 10 cartas na "compra" esta função chama a função
	  // tranformaDescarte
	}
  
	public void transformaDescarte() {
	  // pega as cartas de descarte, exceto a ultima, e coloca na "compra"
	}
	/**
	 * 
	 * @param sentido
	 */
	public void inverter(int sentido) {
	  if (sentido == 0) {
		sentido = 1;
	  }
	  if (sentido == 1) {
		sentido = 0;
	  }
	}
	/**
	 * 
	 * @param sentido
	 * @param idJogador
	 * @param numJogadores
	 */
	public void pular(int sentido, int idJogador, int numJogadores) {
	  proximoJogador(sentido, proximoJogador(sentido, idJogador, numJogadores), numJogadores);
	}
	/**
	 * 
	 * @param sentido
	 * @param idJogador
	 * @param numJogadores
	 */
	public void circular(int sentido, int idJogador, int numJogadores) {
	  if (sentido == 0) {
		  idJogador = idJogador - numJogadores;
	  }
	  if (sentido == 1) {
		  idJogador = idJogador + numJogadores;
	  }
	}
  
  
	/**
	 * 
	 * @param sentido
	 * @param idJogador
	 * @param numJogadores
	 * @return
	 */
	public int proximoJogador(int sentido, int idJogador, int numJogadores) {
	  // calcula a posição atual mais o sentido e retorna a posição do próximo
	  // jogador; caso o incremento possua valor maior que 1, informa o próximo
	  // jogador e altera o sentido(que é nosso incremento) para 1
	  if (sentido == 0) {
		if (idJogador >= numJogadores) {
			circular(sentido, idJogador, numJogadores);
		} else {
		  idJogador = idJogador + 1;
		}
	  }
	  if (sentido == 1) {
		if (idJogador <= 0) {
		  circular(sentido, idJogador, numJogadores);
		} else {
		  idJogador = idJogador - 1;
		}
	  }
	  return idJogador;
	}
	/**
	 * 
	 * @param idJogador
	 */
  }
