package LinkedList;

public class Linked_List {
    public static class node {
        int data;
        node next;

         node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static node head;
    static node tail;
    static int size;
    public void addFirst(int data) {
        node newNode=new node(data);
        if(head==null) { //LL is empty
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void addLast(int data) {
        node newNode=new node(data);
        if(head==null) { //LL is empty
            head=tail=newNode;
            size++;
            return;
        }
        size++;
        tail.next=newNode;
        //newNode.next=null;
        tail=newNode;
    }
    public void AddMiddle(int index,int data) {
        node n1=new node(data);
        node ptr=head;
        if(ptr==null) {
            head=tail=n1;
            size++;
            return;
        }
        int counter=0;
        while(counter<index) {//Traverse Up-to Before Desire Index
            ptr=ptr.next;
            counter++;
        }
        n1.next=ptr.next;
        ptr.next=n1;
        size++;
    }
    public int RemoveFirst() {
        if(head==null) {
            return Integer.MIN_VALUE;
        }
        if(size==1) {
            int val= head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;
    }
    public int RemoveLast () {
        node ptr=head;
        node prev = null;
        if(ptr==null) {
            return Integer.MIN_VALUE;
        }
        if(size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        while(ptr.next!=null) {
            prev=ptr;
            ptr=ptr.next;
        }
        int val = ptr.data;
        tail = prev;
        prev.next = null;
        size--;
        return val;
    }
    public void Reverse(){
        node prev = null;
        node next;
        node curr=tail=head;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        Linked_List LL_1=new Linked_List();
        LL_1.addFirst(30);
        LL_1.addFirst(20);
        LL_1.addFirst(10);
        LL_1.addLast(50);
        LL_1.addLast(60);
        LL_1.addLast(70);
        LL_1.AddMiddle(2,40);
        node ptr=head;
        while(ptr!=null) {
            System.out.print(ptr.data+"->....");
            ptr=ptr.next;
        }
        System.out.print("null");
        System.out.println();
        LL_1.Reverse();
        node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"->....");
            temp=temp.next;
        }

    }
}





















