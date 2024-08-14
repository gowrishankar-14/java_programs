class LinkedList
{
    Node head;
    
    class Node
    {
    int data;
    Node next;
    
    Node(int val)
    {
        data=val;
        next=null;
    }
    }
    
    LinkedList()
    {
        head=null;
    }
    
    public void insert1st(int val)
    {
        Node new_node=new Node(val);
        
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }
    }
    
    public void insertlast(int val)
    {
        Node new_node=new Node(val);
        
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            Node current=head;
            
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=new_node;
        }
    }
    
    public void display()
    {
        Node current=head;
        
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        
        System.out.println("Null");
    }
}


public class Main
{
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        
        ll.insert1st(10);
        ll.insert1st(20);
        ll.insert1st(30);
        ll.insert1st(40);
        
        ll.insertlast(70);
        ll.insertlast(80);

        ll.display();
    }
}
