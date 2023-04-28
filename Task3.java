/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с
 * повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        List<String> Planets = new ArrayList<>();
        Planets.add("Меркурий");
        Planets.add("Венера");
        Planets.add("Земля");
        Planets.add("Земля");
        Planets.add("Марс");
        Planets.add("Сатурн");
        Planets.add("Сатурн");
        Planets.add("Юпитер");
        Planets.add("Уран");
        Planets.add("Нептун");
        Planets.add("Нептун");
        Planets.add("Нептун");
        for (String planet : Planets) {
            int count = 0;
            for (String p : Planets) {
                if (planet.equals(p)) {
                    count++;
                }
            }
            System.out.printf("%s - %d%n", planet, count);
        }
    }
}
