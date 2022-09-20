package ss11_stack_queue.exercise.bracket;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {

        String str = "s * (s – a) * (s – b) * (s – c)   ";
        String[] strings = str.split("");
        Stack<String> bStack = new Stack<>();
        boolean check = true;
        String left = "";

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("(")) {
                bStack.push(strings[i]);
            } else if (strings[i].equals(")")) {
                if (bStack.isEmpty()) {
                    check = false;
                    break;
                } else {
                    left = bStack.pop();
                    if (!left.equals("(") || !strings[i].equals(")")) {
                        check = false;
                        break;
                    }
                }
            }
            if (i == strings.length - 1) {
                check = bStack.isEmpty();
            }
        }

        if (check) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}