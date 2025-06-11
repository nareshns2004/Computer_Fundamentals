public class DoubleLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void print(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
        
    }

    public void removeLast(){
        size--;
        if(head==null||head.next==null){
            head=tail=null;
        }

        Node temp = head;
        while(temp.next.next!=null){
            temp = head.next;
        }

        Node curr = head.next; 

        temp.next = null;
        curr.prev = null;
    }
    
    public static void main(String [] args){

        DoubleLL DLL = new DoubleLL();
        DLL.addFirst(1);
        DLL.addFirst(2);
        DLL.addFirst(3);
        DLL.print();
        System.out.println(DLL.size);
        DLL.removeLast();
        DLL.print();
        System.out.println(DLL.size);

    }
}
