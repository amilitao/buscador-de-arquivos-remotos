
public class TestTransferidorDeArquivos {
	
	public static void main(String[] args) {
		
		
		CredencialSftp credencialSftp = new CredencialSftp();
		credencialSftp.setLogin("amilitao");
		credencialSftp.setPassword("eclipse#1985");
		
		Servidor servidor = new Servidor();
		servidor.setHost("db048");
		servidor.setNumero("048");
		servidor.setCaminhoBK("/fs1/save/bk/");
		
		Relatorio relatorio = new Relatorio();
		relatorio.setNome("srt01");
		relatorio.setServidor(servidor);
		
		
		TransferidorDeArquivos transferidor = new TransferidorDeArquivos();
		
		String host = relatorio.getServidor().getHost();
		String absoluteRemoteFile = relatorio.getAbsoluteRemotePath() + relatorio.getNomeCompleto() + "*";
		
		//transferidor.download(credencialSftp, host, absoluteRemoteFile, "c:\\home");	
		transferidor.upload(credencialSftp, host, relatorio.getAbsoluteRemotePath(), "c:\\home\\srm02.comprador19.f111" );	
		
	}
	
	

}
