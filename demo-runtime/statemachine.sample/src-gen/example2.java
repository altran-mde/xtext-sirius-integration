import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example2 {
	
	public static void main(String[] args) {
		new example2().run();
	}
	
	
	protected void run() {
		boolean executeActions = true;
		String currentState = "asdf";
		String lastEvent = null;
		while (true) {
			if (currentState.equals("asdf")) {
				if (executeActions) {
					executeActions = false;
				}
				System.out.println("Your are now in state 'asdf'. Possible events are [].");
				lastEvent = receiveEvent();
			}
			
		}
	}
	
	private String receiveEvent() {
		System.out.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch (IOException ioe) {
			System.out.println("Problem reading input");
			return "";
		}
	}
}
