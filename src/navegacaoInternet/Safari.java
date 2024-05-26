package navegacaoInternet;

public class Safari implements NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessando o seguinte endereço: "+url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando aba no seu navegador");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página atual");
		
	}

}
