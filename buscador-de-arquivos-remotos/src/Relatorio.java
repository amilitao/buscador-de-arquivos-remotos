
public class Relatorio {
	
	private String nome;
	private Servidor servidor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}	
	
	
	public String getAbsoluteRemotePath() {
		return this.getServidor().getCaminhoBK();
	}
	
	public String getNomeCompleto() {
		return this.nome + ".f" + this.getServidor().getNumero();
	}
	


}
