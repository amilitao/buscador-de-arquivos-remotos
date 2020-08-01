
public class TransferidorDeArquivos {

	private String absoluteLocalFile;

	public TransferidorDeArquivos() {
		absoluteLocalFile = "c:\\home\\";
	}

	public void transfere(CredencialSftp credencial, Servidor servidor, Relatorio relatorio) {

		String absoluteRemoteFile = servidor.getCaminhoBK() + relatorio.getNome() + ".f" + servidor.getNumero() + "*";

		Sftp sftp = new Sftp(credencial.getLogin(), credencial.getPassword());

		sftp.transfere(servidor.getHost(), absoluteRemoteFile, absoluteLocalFile);

	}

}
