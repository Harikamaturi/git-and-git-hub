
        import java.util.*;
public class LinkedListPrgm {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Linked list numbers:"+numbers);
        Integer n=numbers.get(0);
        System.out.println("First number:"+n);
        numbers.set(2,2);
        System.out.println("Second number:"+numbers);
        Integer n1=numbers.remove(3); // removed first number using remove method or clear or remove all
        System.out.println("Linked list numbers:"+numbers);
        System.out.println("Removed number:"+n1);
        numbers.addFirst(5); // adding first number to the list using addfirst method
        System.out.println("Linked list numbers:"+numbers);
        numbers.addLast(7);  // adding last number to the list using addlast method
        System.out.println("Linked list numbers:"+numbers);
        Integer num1=numbers.peek(); //peek returns the first element (head) of the linked list
        System.out.println("Linkedlist number:"+numbers);
        System.out.println("First number:"+num1);
        Integer num2=numbers.poll(); //poll returns and removes the first element from the linked list
        System.out.println("Removed element:"+num2);
        System.out.println("Linkedlist number:"+ numbers);
        numbers.offer(8);   //offer adds the specified element at the end of the linked list
        System.out.println("Linkedlist number:"+numbers);
    }

}




