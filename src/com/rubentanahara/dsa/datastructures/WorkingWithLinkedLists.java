// Linked lists are a data structure that can grow and shrink as needed.
import java.util.LinkedList;
class WorkingWithLinkedLists {
    public static void main(String[] args) {
        // Linked List
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("bottom");
        printLinkedList(linkedList);
        linkedList.add("second");
        printLinkedList(linkedList);
        linkedList.add("third");
        printLinkedList(linkedList);
        linkedList.add("top");
        printLinkedList(linkedList);
        linkedList.addFirst("first");
        printLinkedList(linkedList);
        linkedList.addLast("last");
        printLinkedList(linkedList);
        linkedList.remove();
        printLinkedList(linkedList);
        linkedList.removeFirst();
        printLinkedList(linkedList);
        linkedList.removeLast();
        printLinkedList(linkedList);
        linkedList.remove(1);
        printLinkedList(linkedList);
        linkedList.remove("second");
        printLinkedList(linkedList);
        linkedList.add("second");
        printLinkedList(linkedList);
        linkedList.add("second");

      }

      private static void printLinkedList(LinkedList<String> linkedList) {
          if (linkedList.isEmpty()) {
              System.out.println("You have nothing in your linked list");
          } else {
              System.out.printf("%s size: %s \n", linkedList, linkedList.size());
          }
      }
}
