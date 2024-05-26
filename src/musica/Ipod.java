package musica;

public class Ipod implements ReprodutorMusical{

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionado no seu Ipod a música "+musica);
		
	}

	@Override
	public void tocar() {
		System.out.println("tocando a musica selecionada.");
		
	}

	@Override
	public void pausar() {
		System.out.println("pausando a musica atual");
		
	}

}
