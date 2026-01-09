public class linklist2 {
    
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
    public void addinmiddle(int data,int idx){
        Node newnode=new Node(data);
    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    newnode.next=temp.next;
    temp.next=newnode;


    }

    public static void main(String[] args) {
        linklist2 li=new linklist2();
        li.addfirst(2);
        li.addfirst(1);
        li.addlast(4);
        li.addlast(3);
        li.addinmiddle(88,2);
    li.print();
    }
}


