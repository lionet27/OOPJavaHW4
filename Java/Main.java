
import gb.GBList;
import gb.list.GBArrayList;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> gbList = new GBArrayList<>();
        gbList.add(0);
        gbList.add(1);
        gbList.add(2);
        gbList.add(3);
        System.out.println("Размер списка:"+gbList.size());
        System.out.println("Первый элемент списка:"+gbList.get(0));
        gbList.remove(2);
        System.out.println("Список после удаления элемента с индексом 2:");
        for (Integer integer : gbList) {
            System.out.println(integer + " ");
        }

        gbList.update(0, 10);
        System.out.println("Список после замены элемента с индексом 0 на 10:");
        for (Integer integer : gbList) {
            System.out.println(integer + " ");
        }

    }
}
