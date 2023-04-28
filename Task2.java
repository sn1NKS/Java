
/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и
 * среднее арифметическое из этого списка.
 * Collections.max()
 */
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
   public static void main(String[] args) {
      List<Integer> list = new ArrayList<Integer>();
      list.add(4);
      list.add(3);
      list.add(8);
      list.add(9);
      list.add(2);
      list.add(6);
      System.out.println(list);
      Integer resultMax = Collections.max(list);
      Integer resultMin = Collections.min(list);
      int sum = 0;
      for (int i = 0; i < list.size(); i++) {
         sum += list.get(i);
      }
      System.out.println("Максимальное: " + resultMax);
      System.out.println("Минимальное: " + resultMin);
      System.out.println("Среднее арифметическое: " + (sum) / 6);
   }
}