

public class TransferidorDeArquivos {
	

	public void download(CredencialSftp credencial, String host, String absoluteRemoteFile, String absoluteLocalFile) {
	
				
		Sftp sftp = new Sftp(credencial.getLogin(), credencial.getPassword());
		sftp.download(host, absoluteRemoteFile, absoluteLocalFile);

	}
	
	public void upload(CredencialSftp credencial, String host, String absoluteRemoteFile, String absoluteLocalFile) {
		
		System.out.println(absoluteRemoteFile);
		System.out.println(absoluteLocalFile);
		
		Sftp sftp = new Sftp(credencial.getLogin(), credencial.getPassword());
		sftp.upload(host, absoluteRemoteFile, absoluteLocalFile);

	}

}
