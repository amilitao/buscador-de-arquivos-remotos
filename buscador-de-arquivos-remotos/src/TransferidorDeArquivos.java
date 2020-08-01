
public class TransferidorDeArquivos {

	private String absoluteLocalFile;

	public TransferidorDeArquivos() {
		absoluteLocalFile = "c:\\home\\";
	}

	public void transfere(CredencialSftp credencial, Relatorio relatorio) {

		String absoluteRemoteFile = relatorio.getServidor().getCaminhoBK() + relatorio.getNome() + ".f" + relatorio.getServidor().getNumero() + "*";

		Sftp sftp = new Sftp(credencial.getLogin(), credencial.getPassword());

		sftp.transfere(relatorio.getServidor().getHost(), absoluteRemoteFile, absoluteLocalFile);

	}

}
