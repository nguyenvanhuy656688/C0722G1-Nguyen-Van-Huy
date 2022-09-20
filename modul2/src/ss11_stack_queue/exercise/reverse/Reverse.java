package ss11_stack_queue.exercise.reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        List<Integer> lists = new ArrayList<>();
        lists.add(2);
        lists.add(4);
        lists.add(6);
        lists.add(8);

        for (Integer integer : lists) {
            stacks.push(integer);
        }
        System.out.println(stacks);
        lists.clear();

        for (int i = 0; i < stacks.size() + i; i++) {
            int number = stacks.pop();
            lists.add(number);
        }
        System.out.println(lists);



        Stack<String> wStack = new Stack<>();
        String mWord = "Huycute";
        String[] mWord1 = mWord.split("");
        for (int i = 0; i < mWord1.length; i++) {
            wStack.push(mWord1[i]);
        }
        System.out.println(wStack);
        for (int i = 0; i < mWord1.length; i++) {
            mWord1[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(mWord1));
    }
}

