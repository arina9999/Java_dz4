// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package dz_four;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Поместить элемент в конец очереди");
            System.out.println("2. Вернуть первый элемент из очереди и удалить его");
            System.out.println("3. Вернуть первый элемент из очереди не удаляя его");
            System.out.println("4. Выход\n");
            System.out.println("Выберите действие: ");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Введите число: ");
                    int num = sc.nextInt();
                    enqueue(list, num);
                    break;
                case 2:
                    if (!list.isEmpty()) {
                        dequeue(list);
                    } else {
                        System.out.println("\nОчередь пуста");
                    }
                    break;
                case 3:
                    if (!list.isEmpty()) {
                        first(list);
                    } else {
                        System.out.println("\nОчередь пуста");
                    }
                    break;
                case 4:
                    sc.close();
                    System.out.println(list);
                    return;
            }
        }
    }

    public static void enqueue(LinkedList<Integer> list, int elem) {
        list.add(elem);
    }

    public static void dequeue(LinkedList<Integer> list) {
        System.out.println("\n" + list.removeFirst());
    }

    public static void first(LinkedList<Integer> list) {
        System.out.println("\n" + list.getFirst());
    }
}