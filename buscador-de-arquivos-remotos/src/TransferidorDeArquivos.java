
public class TransferidorDeArquivos {

	private String absoluteLocalFile;

	public TransferidorDeArquivos() {
		absoluteLocalFile = "c:\\home\\";
	}

	public void download(CredencialSftp credencial, Relatorio relatorio) {

		String absoluteRemoteFile = relatorio.getServidor().getCaminhoBK() 
				+ relatorio.getNome() + ".f" + relatorio.getServidor().getNumero() + ".1234";

		Sftp sftp = new Sftp(credencial.getLogin(), credencial.getPassword());

		sftp.download(relatorio.getServidor().getHost(), absoluteRemoteFile, absoluteLocalFile);

	}
	
	public void upload(CredencialSftp credencial, Relatorio relatorio) {

		String absoluteRemoteFile = relatorio.getServidor().getCaminhoBK();

		Sftp sftp = new Sftp(credencial.getLogin(), credencial.getPassword());
		
	    this.absoluteLocalFile += relatorio.getNome() + ".f" + relatorio.getServidor().getNumero()+".2222";

		sftp.upload(relatorio.getServidor().getHost(), absoluteRemoteFile, absoluteLocalFile);

	}

}
