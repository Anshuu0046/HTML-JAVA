package ad1;

import java.util.Scanner;

public class LinkedList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Create a linked list
    LinkedList list = new LinkedList();

    // Add nodes to the list
    list.add(1);
    list.add(2);
    list.add(3);

    // Display the list
    list.display();

    // Close the scanner
    scanner.close();
  }

  // Add a node to the list
  public void add(int data) {
    // Create a new node
    Node node = new Node(data);

    Object head;
	// If the list is empty, make the new node the head
    if (head == null) {
      head = node;
    } else {
      Object tail;
	// Otherwise, add the new node to the end of the list
      tail.add = node;
      tail = node;
    }
  }

  // Display the list
  public void display() {
    System.out.println("The list is empty.");
  }
}

// Node class
class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}