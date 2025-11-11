package Linkedlist;
//

//
public class link {
//    Node head;
//    Node tail;
//    int size;
//    link()
//    {
//        this.size = 0 ;
//    }
//    public  void insert(int val)
//    {
//        Node node = new Node(val);
//        node.next = head;
//        head = node;
//        if(tail ==  null)
//        {
//            tail = head ;
//        }
//        size +=1;
//    }
//    public void inserrtLast(int val)
//    {
//        Node node = new Node(val);
//        tail.next = node;
//        tail = node;
//        size +=1;
//    }
//    public void insertMiddele(int val,int index)
//    {
//        Node temp = getaddress(index-1);
//        Node node = new Node(val);
//        node.next = temp.next;
//        temp.next = node ;
//
//        size +=1;
//    }
//    public void insertrev(int val,int index)
//    {
//        head  = insertrev(val,index,head);
//    }
//    private Node insertrev(int val,int index,Node node)
//    {
//
//        if(index == 0)
//        {
//            Node temp = new Node(val,node);
//            size++;
//            return temp;
//        }
////        if(node == null)
////        {
////            return null;
////        }
//        node.next = insertrev(val,index -1 ,node.next);
//        return node;
//    }
//    public Node getaddress(int index){
//        Node pre = head;
//        for(int i = 0; i < index; i++)
//        {
//            pre = pre.next;
//        }
//        return pre;
//    }
//
//    public void disply()
//    {
//        Node temp ;
//        temp = head ;
//        while(temp != null)
//        {
//            System.out.print(temp.value + " -> " );
//            temp = temp.next ;
//        }
//        System.out.println("END");
//    }
//    class Node {
//        int value;
//        Node next ;
//        Node(int val)
//        {
//            this.value = val ;
//        }
//
//        public Node(int value,Node next) {
//            this.value= value;
//            this.next = next;
//        }
//    }
//}
Node head;
Node tail;
int size;

link()
{
    this.size =0;
}
    public void display()
    {
        Node temp ;
        temp = head;
        while(temp != null)
        {
            System.out.print(temp.value +"->");
            temp = temp.poinNext;
        }
        System.out.println("EnD");
    }
public void insert(int val)
{
    Node node = new Node(val);
    node.poinNext = head;
    head = node ;
    if (tail ==null)
    {
        tail = head;
    }
    size++;
}

public void inerstFirst(int val)
{
    Node node = new Node(val);
    node.poinNext = head ;
    head = node;

}
public void insertLast(int val)
{
    Node node = new Node(val);
    tail.poinNext = node;
    tail = node;
}
    class Node{
    int value;
    Node poinNext;

    public Node(int val) {
        this.value = val;
    }

    public Node(int val,Node poinNext) {
        this.value = val;
        this.poinNext = poinNext;
    }
}
}
