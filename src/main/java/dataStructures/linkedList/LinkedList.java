package dataStructures.linkedList;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class LinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public LinkedList() {
        head = null;
    }

    public LinkedList(int num) {
        head = new Node(num);
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int data) {
        if(prevNode == null) {
            System.out.print("Previous node cannot be null" );
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public void delete(int data) {
        Node temp = head, prev = null;

        if(temp != null && temp.data == data) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if(temp == null) return;

        prev.next = temp.next;
    }

    public int getCount(Node node){
        if(node==null){
            return 0;
        } else {
            return 1 + getCount(node.next);
        }
    }

    public int getNth(int index) {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            if(count == index){
                return temp.data;
            }
            count ++;
            temp = temp.next;
        }
        assert(false);
        return 0;
    }

    public void deleteList() {
        head = null;
    }

    public LinkedList addNums(LinkedList list2) {

        LinkedList listSum = new LinkedList();
        int cf = 0;

        Node curr1 = this.head;
        Node curr2 = list2.head;

        while (curr1 != null || curr2 != null) {
            int sum;
            sum = (curr1 == null ? 0 : curr1.data) + (curr2 == null ? 0 : curr2.data) + cf;
            if (sum > 9) {
                sum = sum % 10;
                cf = 1;
            } else {
                cf = 0;
            }
            listSum.append(sum);
            curr1 = (curr1 == null ? null : curr1.next);
            curr2 = (curr2 == null ? null : curr2.next);
        }

        if(cf == 1){
            listSum.append(cf);
        }

        return listSum;
    }

    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.append(7);
        list1.append(8);
        list1.append(9);

        list2.append(7);
        list2.append(8);
        list2.append(9);
        list2.append(4);

        System.out.println("\nCreated Linked list1 is:");
        list1.printList();
        System.out.println("\nCreated Linked list2 is:");
        list2.printList();

        System.out.println("\nSum Linked list is:");
        list1.addNums(list2).printList();

    }
}
