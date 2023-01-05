package practice;

//링크드리스트를 구현하면서 알아봅시다.
public class SingleLinkedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        /* 작성해보기 */
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        /* 작성해보기 */
        if (head == null) {
            System.out.println("없음");
        } else {
            Node<T> node = this.head;
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }
    }
    public Node<T> search(T data) {
        /* 작성해보기 */
    }

    public void addNodeInside(T data, T isData) {
        /* 작성해보기 */
    }

    public static void main(String[] args) {

        SingleLinkedList<Integer> MyLinkedList = new SingleLinkedList<Integer>();

        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);

        MyLinkedList.printAll();
    }
}