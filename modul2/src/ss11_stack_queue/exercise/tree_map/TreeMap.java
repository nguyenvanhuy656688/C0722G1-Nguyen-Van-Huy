package ss11_stack_queue.exercise.tree_map;


import java.util.Map;


public class TreeMap {
    public static void main(String[] args) {


        String str = "Nguyễn Văn Huy Huy nguyễn";
        String[] str1 = str.toLowerCase().split(" ");
        Map <String, Integer> map = new java.util.TreeMap<>();
        for (String key : str1) {
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key,map.get(key)+1);
            }
        }
        System.out.println(map); }
}

