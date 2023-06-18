package JavaHome;
/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести подходящие по условиям.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(1, "lenovo", 4, 250, "black");
        Laptop laptop2 = new Laptop(2, "Samsung", 4, 250, "silvery white");
        Laptop laptop3 = new Laptop(3, "Philips", 8, 500, "white");
        Laptop laptop4 = new Laptop(4, "Apple", 16, 1000, "silver");
        Laptop laptop5 = new Laptop(5, "lenovo", 16, 250, "black");
        Laptop laptop6 = new Laptop(6, "lenovo", 8, 500, "black");
        Laptop laptop7 = new Laptop(7, "lenovo", 16, 250, "black");

        Set<Laptop> laptops = new HashSet<Laptop>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);

        scannerOut(laptops);
    }

    public static Set<Laptop> scannerOut(Set<Laptop> laptops) {
        Map<String, Integer> basket = new HashMap<>();
        Map<String, String> basket2 = new HashMap<>(); // ------ ???
        while (true) {
            // System.out.println(basket); // Проверка на добавление ------------ !!!
            System.out.println("\nВведите цифру, нужного раздела: " + // Начало программы. Общее меню -------------
                    "\n1 - Оперативная память." +
                    "\n2 - Жёсткий диск." +
                    "\n3 - Бренд." +
                    "\n4 - Цвет." +
                    "\n5 - Выход.");
            Scanner sc = new Scanner(System.in);
            int digit1 = sc.nextInt();
            if (digit1 == 1) {
                System.out.println("Выберите обьём оперативной памяти: " + // Выбор ОЗУ -------------
                        "\n1 - 4 гб" +
                        "\n2 - 8 гб" +
                        "\n3 - 16 гб");
                Scanner sc2 = new Scanner(System.in);
                int digit2 = sc2.nextInt();

                if (digit2 == 1) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getRam() == 4) {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());

                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc3 = new Scanner(System.in);
                    Integer digit3 = sc3.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit3.equals(ram.getId())) {
                            basket.put(ram.getName(), ram.getRam()); // Добавление ОЗУ 4гб -----------

                        } else if (digit3 == 0) {
                            continue;
                        }
                    }

                    for (Map.Entry ram2 : basket.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey() + " " + ram2.getValue() + " гб");

                    }
                    continue;
                } else if (digit2 == 2) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getRam() == 8) {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());
                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc3 = new Scanner(System.in);
                    Integer digit3 = sc3.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit3.equals(ram.getId())) {
                            basket.put(ram.getName(), ram.getRam()); // Добавление ОЗУ 8гб -----------

                        } else if (digit3 == 0) {
                            continue;
                        }
                    }
                    for (Map.Entry ram2 : basket.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey() + " " + ram2.getValue() + " гб");
                    }
                    continue;
                } else if (digit2 == 3) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getRam() == 16) {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());
                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc3 = new Scanner(System.in);
                    Integer digit3 = sc3.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit3.equals(ram.getId())) {
                            basket.put(ram.getName(), ram.getRam()); // Добавление ОЗУ 16гб -----------

                        } else if (digit3 == 0) {
                            continue;
                        }
                    }
                    for (Map.Entry ram2 : basket.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey() + " " + ram2.getValue() + " гб");
                    }
                    continue;
                }

                break;

            } else if (digit1 == 2) {
                System.out.println("Выберите обьём жёсткого диска: " + // Выбор ЖД --------------
                        "\n1" + " - " + "250 гб" +
                        "\n2" + " - " + "500 гб" +
                        "\n3" + " - " + "1000 гб");
                Scanner sc2 = new Scanner(System.in);
                int digit2 = sc2.nextInt();

                if (digit2 == 1) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getHdd() == 250) {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());

                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc3 = new Scanner(System.in);
                    Integer digit3 = sc3.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit3.equals(ram.getId())) {
                            basket.put(ram.getName(), ram.getHdd()); // Добавление Диска 250 гб -----------

                        } else if (digit3 == 0) {
                            continue;
                        }
                    }

                    for (Map.Entry ram2 : basket.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey() + " " + ram2.getValue() + " гб");

                    }
                    continue;
                } else if (digit2 == 2) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getHdd() == 500) {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getHdd() + " " + "гб");
                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc3 = new Scanner(System.in);
                    Integer digit3 = sc3.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit3.equals(ram.getId())) {
                            basket.put(ram.getName(), ram.getHdd()); // Добавление Диска 500 гб -----------

                        } else if (digit3 == 0) {
                            continue;
                        }
                    }
                    for (Map.Entry ram2 : basket.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey() + " " + ram2.getValue() + " гб");
                    }
                    continue;
                } else if (digit2 == 3) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getHdd() == 1000) {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getHdd() + " " + "гб");
                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc3 = new Scanner(System.in);
                    Integer digit3 = sc3.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit3.equals(ram.getId())) {
                            basket.put(ram.getName(), ram.getHdd()); // Добавление Диска 1000 гб -----------

                        } else if (digit3 == 0) {
                            continue;
                        }
                    }
                    for (Map.Entry ram2 : basket.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey() + " " + ram2.getValue() + " гб");

                    }
                }
                continue;

            } else if (digit1 == 3) {
                System.out.println("Выбор бренда: " +
                        "\n1" + " - " + "lenovo" +
                        "\n2" + " - " + "Samsung" +
                        "\n3" + " - " + "Philips" +
                        "\n4" + " - " + "Apple");
                Scanner sc3 = new Scanner(System.in);
                int digit3 = sc3.nextInt();

                if (digit3 == 1) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getName() == "lenovo") {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());

                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc4 = new Scanner(System.in);
                    Integer digit4 = sc4.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit4.equals(ram.getId())) {
                            basket.put(ram.getName(), ram.getHdd()); // Добавление бренда -----------

                        } else if (digit3 == 0) {
                            continue;
                        }
                    }

                    for (Map.Entry ram2 : basket.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey());

                    }
                    continue;
                }

                else if (digit3 == 2) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getName() == "Samsung") {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());

                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc4 = new Scanner(System.in);
                    Integer digit4 = sc4.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit4.equals(ram.getId())) {
                            basket.put(ram.getName(), ram.getHdd()); // Добавление бренда -----------

                        } else if (digit3 == 0) {
                            continue;
                        }
                    }

                    for (Map.Entry ram2 : basket.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey());

                    }
                    continue;
                }

                else if (digit3 == 3) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getName() == "Philips") {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());

                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc4 = new Scanner(System.in);
                    Integer digit4 = sc4.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit4.equals(ram.getId())) {
                            basket.put(ram.getName(), ram.getHdd()); // Добавление бренда -----------

                        } else if (digit3 == 0) {
                            continue;
                        }
                    }

                    for (Map.Entry ram2 : basket.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey());

                    }
                    continue;
                }

                else if (digit3 == 4) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getName() == "Apple") {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());

                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc4 = new Scanner(System.in);
                    Integer digit4 = sc4.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit4.equals(ram.getId())) {
                            basket.put(ram.getName(), ram.getHdd()); // Добавление бренда -----------

                        } else if (digit3 == 0) {
                            continue;
                        }
                    }

                    for (Map.Entry ram2 : basket.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey());

                    }
                }
                continue;

            } else if (digit1 == 4) {
                System.out.println("Цвет: " + // Цвет --------------------
                        "\n1" + " - " + "black" +
                        "\n2" + " - " + "silvery white" +
                        "\n3" + " - " + "white" +
                        "\n4" + " - " + "silver");
                Scanner sc4 = new Scanner(System.in);
                int digit4 = sc4.nextInt();

                if (digit4 == 1) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getColor() == "black") {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());

                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc5 = new Scanner(System.in);
                    Integer digit5 = sc5.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit5.equals(ram.getId())) {
                            basket2.put(ram.getName(), ram.getColor()); // Добавление Цвета -----------

                        } else if (digit4 == 0) {
                            continue;
                        }
                    }

                    for (Map.Entry ram2 : basket2.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey());

                    }
                    continue;
                } else if (digit4 == 2) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getColor() == "silvery white") {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());

                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc5 = new Scanner(System.in);
                    Integer digit5 = sc5.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit5.equals(ram.getId())) {
                            basket2.put(ram.getName(), ram.getColor()); // Добавление Цвета -----------

                        } else if (digit4 == 0) {
                            continue;
                        }
                    }

                    for (Map.Entry ram2 : basket2.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey());

                    }
                    continue;
                } else if (digit4 == 3) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getColor() == "white") {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());

                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc5 = new Scanner(System.in);
                    Integer digit5 = sc5.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit5.equals(ram.getId())) {
                            basket2.put(ram.getName(), ram.getColor()); // Добавление Цвета -----------

                        } else if (digit4 == 0) {
                            continue;
                        }
                    }

                    for (Map.Entry ram2 : basket2.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey());

                    }
                    continue;
                } else if (digit4 == 4) {
                    System.out.println("В наличии: ");
                    for (Laptop ram : laptops) {
                        if (ram.getColor() == "silver") {
                            System.out.println(ram.getId() + " " + ram.getName() + " " + ram.getRam() + " " + "гб "
                                    + ram.getHdd() + " " + "гб " + ram.getColor());

                        }
                    }
                    System.out.println("Сделайте выбор по идентификатору или нажмите 0 для выхода в меню: ");
                    Scanner sc5 = new Scanner(System.in);
                    Integer digit5 = sc5.nextInt();
                    for (Laptop ram : laptops) {
                        if (digit5.equals(ram.getId())) {
                            basket2.put(ram.getName(), ram.getColor()); // Добавление Цвета -----------

                        } else if (digit4 == 0) {
                            continue;
                        }
                    }

                    for (Map.Entry ram2 : basket2.entrySet()) {

                        System.out.println("Вы добавили" + " " + ram2.getKey());

                    }
                    continue;
                }
                break;
            } else if (digit1 == 5) {
                break;
            }

        }
        return laptops;
    }

}
