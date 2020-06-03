package LinkedList;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

            public void add(int value) {
                // если это первое добавление в список
                if (head == null) {
                    this.head = new Node(value);
                } else {
                    Node temp = head;
                    while (temp.getNext() != null) {
                        temp = temp.getNext();
                    }
                    temp.setNext(new Node(value)); // Node x = new Node(value) // Node x;
                    // Node x = new Node(value);
                    // temp.setNext(x);
                }

        size++;
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;

        while(temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

        // [1] -> [2] -> [3]

        throw new IllegalArgumentException();
    }
    public void remove(int index) {
                if (index == 0) {
                    head = head.getNext();
                    size--;
                    return;
                }

                int currentIndex = 0;
                Node temp = head;

                while (temp != null) {
                    if (currentIndex  == index - 1) {
                        temp.setNext(temp.getNext().getNext()); // в поле next объекта temp записываем узел следующего узла
                        size--;
                        return;
                    } else {
                        temp = temp.getNext();
                        currentIndex++;
                    }
                }
    }

    public String toString() {
        int[] result = new int[size];

        int idx = 0;
        Node temp = head;

        while(temp != null) {
            result[idx] = temp.getValue(); // тоже самое что  result[idx++] = temp.getValue()
            idx++;
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
