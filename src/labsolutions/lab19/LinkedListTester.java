package labsolutions.lab19;

public class LinkedListTester {

    public static void main(String[] args) {
        // Create a new linked list
        MyLinkedList<String> list = new MyLinkedList<>();

        // Demonstrating add method
        System.out.println("Adding elements:");
        list.add(0, "sample string");
        System.out.println(list);
        list.add(1, "ending string");
        System.out.println(list);
        list.add(0, "before string");
        System.out.println(list);
        list.add(2, "inbetween string");
        System.out.println(list);

        // Demonstrating set method
        System.out.println("\nSetting element at index 1 to 'changed string':");
        list.set(1, "changed string");
        System.out.println(list);

        // Demonstrating remove method
        System.out.println("\nRemoving element at index 1:");
        list.remove(1);
        System.out.println(list);

        // Demonstrating size method
        System.out.println("\nSize of the list:");
        System.out.println("Size: " + list.size());

        // Demonstrating get method
        System.out.println("\nGetting elements by index:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        // Demonstrating the iterator and for-each loop
        System.out.println("\nUsing for-each loop to iterate over the list:");
        for (String s : list) {
            System.out.println(s);
        }

        // Demonstrating edge case: Adding at the end of the list
        System.out.println("\nAdding an element at the end of the list:");
        list.add(list.size(), "new ending string");
        System.out.println(list);

        // Demonstrating edge case: Removing the first element
        System.out.println("\nRemoving the first element:");
        list.remove(0);
        System.out.println(list);

        // Demonstrating edge case: Clearing the list by removing all elements
        System.out.println("\nClearing the list by removing all elements:");
        while (list.size() > 0) {
            list.remove(0);
            System.out.println(list);
        }
    }
}
