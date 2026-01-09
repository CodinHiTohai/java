
public class linklist {
    public static class Node{
        int data;
        Node next;
         
        public Node(int data){
            this.data=data;
            this.next=null;
        }


    }

    public static Node head;
    public static Node tail;
    public void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;

        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;

        }
        tail.next=newnode;
        tail=newnode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        first f1=new first();
        f1.addfirst(2);
        f1.addfirst(1);
        f1.addlast(4);
        f1.addlast(3);
    f1.print();
    }
}
