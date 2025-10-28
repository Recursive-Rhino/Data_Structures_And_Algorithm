package DoublyLinkedLIst;

public class Double_LinkedList {
    public static class node {
        int data;
        node next;
        node prev;

        public node(int data) {
            this.data = data;
            this.next = null;
            prev = null;
        }
    }
    static  node head=null;
    static node tail=null;
    public void AddFirst(int data) {
        node n=new node(data);
        if(head==null){
            head=tail=n;
            return;
        }
        head.prev=n;
        n.next=head;
        head=n;
    }
    public void AddLast(int data){
        node n=new node(data);
        if(tail==null) {
            head=n;
            tail=n;
            return;
        }
        tail.next=n;
        n.prev=tail;
        tail=n;
    }
    public void Show() {
        if(head==null) {
            System.out.println("Null");
            return;
        }
        node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public void Reverse() {
        node prev = null;
        node next;
        node curr=tail=head;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        Double_LinkedList l1=new Double_LinkedList();
        l1.AddFirst(10);
        l1.AddLast(20);
        l1.AddFirst(0);
        l1.AddFirst(50);
        l1.Show();
        l1.Reverse();
        l1.Show();
    }
}
