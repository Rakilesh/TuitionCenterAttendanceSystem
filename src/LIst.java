public class LIst {


    Node head;
    Node tail;
    int size;
    LIst()
    {
        this.size= 0;
    }
    public void insert(int val)
    {
        Node node = new Node(val);
        node.nextpointer = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size++;
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + "->");
            temp = temp.nextpointer;
        }
        System.out.println("END");
    }

    class Node {
        int val;
        Node nextpointer;

        Node(int val)
        {
            this.val = val ;
        }
    }
}
