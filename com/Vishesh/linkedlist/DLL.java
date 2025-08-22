package com.Vishesh.linkedlist;

public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            System.out.print(temp.value + "->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END!!");

        System.out.println("Print in Reverse");
        while(last != null){
            System.out.print(last.value + "->");
            last = last.prev;
        }
        System.out.println("START!!");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next , Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
