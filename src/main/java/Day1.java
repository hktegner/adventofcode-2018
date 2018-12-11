import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Day1 implements Runnable {

	private static final String INPUT_FILE_URL = "https://adventofcode.com/2018/day/1/input";
	
	@Override
	public void run() {
		try {
			URL inputURL = new URL(INPUT_FILE_URL);
			String input = inputURL.getContent().toString();
			processInput(input);
		} catch (MalformedURLException e) {
			throw new IllegalStateException("Error while parsing URL", e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void processInput(String input) {
		
	}

}
