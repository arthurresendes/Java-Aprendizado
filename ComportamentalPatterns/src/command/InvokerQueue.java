package command;

import java.util.ArrayDeque;
import java.util.Queue;

public class InvokerQueue {
	private static final Queue<Command> queue = new ArrayDeque<Command>();
	
	public static void add(Command cmd) {
		queue.add(cmd);
	}
	
	public static Command poll() {
		return queue.poll();
	}
	
	public static int size() {
		return queue.size();
	}
}
