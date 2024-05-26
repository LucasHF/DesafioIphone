package telefone;

public class Phone implements AparelhoTelefonico{

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número "+numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação.");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iniciando a primeira mensagem do correio de voz.");
		
	}

}
