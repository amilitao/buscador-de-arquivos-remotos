
public class TestTransferidorDeArquivos {
	
	public static void main(String[] args) {
		
		
		CredencialSftp credencialSftp = new CredencialSftp();
		credencialSftp.setLogin("amilitao");
		credencialSftp.setPassword("springMVC@20");
		
		
		Servidor servidor = new Servidor();
		servidor.setHost("dbcom01");
		servidor.setNumero("111");
		servidor.setCaminhoBK("/fs206/save/bk/");
		
		Relatorio relatorio = new Relatorio();
		relatorio.setNome("srm02");
		relatorio.setServidor(servidor);
		
		
		TransferidorDeArquivos transferidor = new TransferidorDeArquivos();
		
		String host = relatorio.getServidor().getHost();
		String absoluteRemoteFile = relatorio.getAbsoluteRemotePath() + relatorio.getNome() + "*";
		String diretorioRecebidos = "c:\\home\\usuario\\projetos\\relatoriosdiarios\\recebidos\\";
		String diretorioEnviar = "c:\\home\\usuario\\projetos\\relatoriosdiarios\\enviar\\";
				
		
		transferidor.download(credencialSftp, host, absoluteRemoteFile, diretorioRecebidos);	
		//transferidor.upload(credencialSftp, host, relatorio.getAbsoluteRemotePath(), diretorioEnviar + "srm02.f111" );	
		
	}
	
	

}
