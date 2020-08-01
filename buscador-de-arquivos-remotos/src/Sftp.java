import java.util.Properties;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class Sftp {

	private JSch jsch;
	private ChannelSftp channelSftp;
	private String login;
	private String password;

	public Sftp(String login, String password) {
		this.login = login;
		this.password = password;
		this.jsch = new JSch();
		this.channelSftp = new ChannelSftp();
	}

	public void transfere(String host, String absoluteRemoteFile, String absoluteLocalFile) {

		Session jschSession;

		try {
			jschSession = jsch.getSession(login, host);
			jschSession.setPassword(password);

			jschSession.setConfig("PreferredAuthentications", "password");

			Properties config = new Properties();
			config.put("StrictHostKeyChecking", "no");

			jschSession.setConfig(config);
			jschSession.connect();
			channelSftp = (ChannelSftp) jschSession.openChannel("sftp");

			channelSftp.connect();

			channelSftp.get(absoluteRemoteFile, absoluteLocalFile);

		} catch (JSchException | SftpException ex) {
			System.out.println("Erro ao transferir arquivo! " + ex.getMessage());
		} finally {
			channelSftp.exit();
		}

	}

}
