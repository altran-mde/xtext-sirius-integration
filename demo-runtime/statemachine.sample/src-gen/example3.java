import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example3 {
	
	public static void main(String[] args) {
		new example3().run();
	}
	
	
	protected void run() {
		boolean executeActions = true;
		String currentState = "State1456";
		String lastEvent = null;
		while (true) {
			if (currentState.equals("State1456")) {
				if (executeActions) {
					executeActions = false;
				}
				System.out.println("Your are now in state 'State1456'. Possible events are [event1456, event1456].");
				lastEvent = receiveEvent();
				if ("event1456".equals(lastEvent)) {
					currentState = "State2asdf";
					executeActions = true;
				}
				if ("event1456".equals(lastEvent)) {
					currentState = "State3";
					executeActions = true;
				}
			}
			if (currentState.equals("State2asdf")) {
				if (executeActions) {
					executeActions = false;
				}
				System.out.println("Your are now in state 'State2asdf'. Possible events are [event1456, event2].");
				lastEvent = receiveEvent();
				if ("event1456".equals(lastEvent)) {
					currentState = "State3";
					executeActions = true;
				}
				if ("event2".equals(lastEvent)) {
					currentState = "State1456";
					executeActions = true;
				}
			}
			if (currentState.equals("State3")) {
				if (executeActions) {
					executeActions = false;
				}
				System.out.println("Your are now in state 'State3'. Possible events are [].");
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
