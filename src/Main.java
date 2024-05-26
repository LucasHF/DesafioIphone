
public class Main {

	public static void main(String[] args) {
		Iphone meuIphone = new Iphone();
		
		//Testando métodos de telefone
		meuIphone.ligar("91234-5678");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		
		//testando métodos de Música
		meuIphone.selecionarMusica("Apologize");
		meuIphone.tocar();
		meuIphone.pausar();
		
		//testando métodos de Internet
		meuIphone.exibirPagina("vaticannews.va");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();

	}

}
