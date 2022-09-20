package ss11_stack_queue.exercise.palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String string = "huy van nav yuh";
        String[] strings = string.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();

        for (int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
            queue.offer(strings[i]);
        }
        int count = 0;
        System.out.println(queue);
        for (int i = 0; i < stack.size(); i++) {
            if (stack.peek().equals(queue.peek()))
                count++;
        }
        if (count == stack.size()) {
            System.out.println("ok");
        }else{
            System.out.println("not ok");
        }
    }
}
