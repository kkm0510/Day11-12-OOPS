package DeckOfCards;

public class CustomQueue<T> {

    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (tail == null) {
            head = node;
            tail = node;
            return;
        }
        if (data.getClass().getName().equals("java.lang.Integer")) {
            if ((int)data <= (int)head.data) {
                node.next = head;
                head = node;
                return;
            }
            if ((int)data >= (int)tail.data) {
                tail.next = node;
                tail = tail.next;
                return;
            }
            Node<T> temp = head;
            while (temp.next != null) {
                if ((int)data > (int)temp.data && (int)data < (int)temp.next.data) {
                    node.next = temp.next;
                    temp.next = node;
                    return;
                }
                temp = temp.next;
            }
        }
        else{
            tail.next=node;
            tail=tail.next;
        }
    }

    public T remove() {
        T data = head.data;
        head = head.next;
        return data;
    }

    public boolean isEmpty(){
        return head == null;
    }
}
