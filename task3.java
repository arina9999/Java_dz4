// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

package dz_four;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0, i);
        }
        System.out.println(list);
        Iterator<Integer> lisIterator = list.iterator();
        int sum = 0;
        while (lisIterator.hasNext()) {
            sum += lisIterator.next();
        }
        System.out.printf("Сумма всех элементов  = %d", sum);
    }
}