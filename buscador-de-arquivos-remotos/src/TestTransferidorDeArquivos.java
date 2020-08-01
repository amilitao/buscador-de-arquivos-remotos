
public class TestTransferidorDeArquivos {
	
	public static void main(String[] args) {
		
		
		CredencialSftp credencialSftp = new CredencialSftp();
		credencialSftp.setLogin("amilitao");
		credencialSftp.setPassword("springMVC@20");
		
		Servidor servidor = new Servidor();
		servidor.setHost("db020");
		servidor.setNumero("020");
		servidor.setCaminhoBK("/fs1/save/bk/");
		
		Relatorio relatorio = new Relatorio();
		relatorio.setNome("srt01");
		
		
		TransferidorDeArquivos transferidor = new TransferidorDeArquivos();
		transferidor.transfere(credencialSftp, servidor, relatorio);		
		
		
	}
	
	

}
