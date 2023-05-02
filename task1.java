// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список
// Постараться не обращаться к листу по индексам.

package dz_four;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.printf("Первоначальный список : %s \n", list);
        Stack<Integer> stackList = new Stack<>();
        stackList.addAll(list);
        list.clear();
        while (!stackList.empty())
            list.add(stackList.pop());
        System.out.printf("Перевернутый список : %s ", list);
    }
}
