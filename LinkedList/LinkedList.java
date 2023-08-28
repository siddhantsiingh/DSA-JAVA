package LinkedList;

public class LinkedList {
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
    public static int size;

    public void addFirst(int data){
        
        //step 1=create new node
        Node newNode= new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
            return;
        }

        //step 2 next - point head
        newNode.next=head;
        //step3 -head -newNode

        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;

        if(head==null){
            head=tail=newNode;
        }

        //step2
        tail.next= newNode;
        tail=newNode;
    } 

    public void add(int idx, int data){
       
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;

        int i=0;
        while(i<idx-1){

            temp=temp.next;
            i++;

        }

        newNode.next=temp.next;
        temp.next= newNode;

    }
    
    public void print(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
             
        }
        System.out.println("null");
    }

    public int removeFirst()
    
    {
        if(head==null){
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val= head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val= head.data;
            head=tail=null;
            size--;
            return val;
        }
        //prev idx=size-2
        Node prev=head;
        int i=0;
        while(i<size-2){
            prev=prev.next;
            i++;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }


    public int iterativeSearch(int key){ //O(n)
        Node temp=head;
        int i=0;
        while(temp.next!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            temp=temp.next;

        }
        return -1;
    }
    //rECURSIVE sEARCH
    public int helper(Node head, int key){
        if(head==null){
            return -1;

        }
        if(head.data==key){
            return 0;
        }
        int i= helper(head.next, key);
        if(i==-1){
            return -1;

        }
        else{
            return i+1;
        }
    }
    public int recSearchz(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev=null;
        Node cur=tail=head;
        Node next;
 
        while(cur!=null){
            next= cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        head=prev;
    }

    public Node middleNode(Node head){
        Node slow=head;
        Node fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print();
     
        System.out.println(ll.size);

        System.out.println(ll.iterativeSearch(2));

        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        System.out.println(ll.recSearchz(3));
        ll.reverse();
        ll.print();

    }
}
