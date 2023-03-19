package gb.linkedlist;


public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> gbLinkedList = new GBLinkedList<>();
        gbLinkedList.add(0);
        gbLinkedList.add(1);
        gbLinkedList.add(2);
        gbLinkedList.add(3);
        gbLinkedList.add(4);
        gbLinkedList.add(5);
        
        System.out.println("Элемент списка с индексом 1: "+gbLinkedList.get(1));
        System.out.println("Список:");
        for (Integer integer : gbLinkedList) {
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println("Размер списка:"+gbLinkedList.size());
        gbLinkedList.remove(4);
     
        System.out.println("Список после удаления элемента с индексом 4: ");
        for (Integer integer : gbLinkedList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        gbLinkedList.update(0, 10);
        System.out.println("Список после замены элемента с индексом 0 на 10: ");
        for (Integer integer : gbLinkedList) {
            System.out.print(integer + " ");
        }
        gbLinkedList.addFirst(20);
        System.out.println("Список после добавления в начало списка 20: ");
        for (Integer integer : gbLinkedList) {
            System.out.print(integer + " ");
        }



      
    }
    
    
}
