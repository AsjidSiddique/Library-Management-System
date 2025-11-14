package AdminLogic;
import java.util.Stack;

public class Back_Stack {
    private static Stack<String> stack = new Stack<>();
    private static boolean goingBack = false;

    private Back_Stack() {}

    public static void pushPanel(String panelName) {
        if (!goingBack) { 
            stack.push(panelName);
        }
    }

    public static String popPanel() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public static String peekPanel() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return null;
    }

    public static boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void setGoingBack(boolean value) {
        goingBack = value;
    }
}