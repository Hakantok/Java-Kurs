package logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		
		System.out.println("Mail logland� : " + data);
		
	}

}
