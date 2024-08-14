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
    
    
    //insertion
    
    public void insert1st(int val)   //insert at first
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
    
    public void insertatpos(int val,int pos)   //insert at desired position
    {
        Node newNode=new Node(val);
        if(pos==1)
        {
            newNode.next=head;
            head=newNode;
        }
        Node current=head;
        int currentindex=1;
        
        while(current!=null && currentindex<pos-1)
        {
            current=current.next;
            currentindex++;
        }
        if(current==null)
        {
            System.out.print("index out of bound");
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    public void insertlast(int val)   //insert at last 
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
    
    
    //deletion
    
    public void delfirst()
    {
        
    }
    
    
    public void display()      //display nodes
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
        
        ll.insertatpos(30,2);
        ll.insertatpos(40,3);
        
        ll.insertlast(70);
        ll.insertlast(80);

        ll.display();
    }
}
