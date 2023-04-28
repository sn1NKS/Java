// Пусть дан произвольный список целых чисел, удалить из него четные числа.

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(2);
        list.add(6);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }

        }
        System.out.println(list);
    }
}
