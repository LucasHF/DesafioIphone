import musica.ReprodutorMusical;
import navegacaoInternet.NavegadorInternet;
import telefone.AparelhoTelefonico;

public class Iphone  implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
	
	/*
	 * A variável musica identifica a musica que estará serlecionada para o tocador de música.
	 * A variável tocando identifica se há alguma musica tocando no Iphone.
	 */
	String musica;
	boolean tocando;
	
	//construtor que define o valor padrão para os atributos da classe.
	public Iphone() {
		this.musica = "Padrao";
		this.tocando = false;
	}
	
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando do seu Iphone para o número "+numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iniciando o correio de voz do seu Iphone");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessando pelo Safari do seu Iphone o seguinte endereço: "+url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando aba no seu navegador");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página atual");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		this.musica = musica;
		System.out.println("Selecionado no seu Iphone a música "+musica);
		
	}

	@Override
	public void tocar() {
		System.out.println("tocando a musica "+ this.musica);
		this.tocando = true;
		
	}

	@Override
	public void pausar() {
		System.out.println(this.tocando? "Pausando a música atual." : "Não há música tocando no momento.");
		
	}
	
	

}
