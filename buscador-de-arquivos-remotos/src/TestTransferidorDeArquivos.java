
public class TestTransferidorDeArquivos {
	
	public static void main(String[] args) {
		
		
		CredencialSftp credencialSftp = new CredencialSftp();
		credencialSftp.setLogin("amilitao");
		credencialSftp.setPassword("amilitao");
		
		Servidor servidor = new Servidor();
		servidor.setHost("192.168.0.103");
		servidor.setNumero("020");
		servidor.setCaminhoBK("/fs1/save/bk/");
		
		Relatorio relatorio = new Relatorio();
		relatorio.setNome("srt01");
		relatorio.setServidor(servidor);
		
		
		TransferidorDeArquivos transferidor = new TransferidorDeArquivos();
		transferidor.download(credencialSftp, relatorio);	
		transferidor.upload(credencialSftp, relatorio);	
		
	}
	
	

}
