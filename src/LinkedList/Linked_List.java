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
        size--;return val;
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
    public void RemoveFromEnd(int n) {
        node ptr=head;
        int counter=1;
        node prev=null;
        while(ptr!=null) {
            if(counter==(size-n+1)) {
                prev.next=ptr.next;
            }
            prev=ptr;
            ptr=ptr.next;
            counter++;
        }

    }
    public node FindMid(){
        node slow=head;
        node fast=head;
        node mid=null;
        while(fast!=null&& fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void Show(){
        node ptr=head;
        while(ptr!=null) {
            System.out.print(ptr.data+"->....");
            ptr=ptr.next;
        }
        System.out.print("null");
    }
    //sdfvb
    public void ReverseFromANode(node temp) {
        node prev = null;
        node next;
        node curr=tail=temp;
        while(curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        temp=prev;

    }
    public Boolean PalindromeChecker(node temp) {
        node right=head;
        node left=temp;
        boolean count=false;
        while(right!=null || left!=null) {
            if(right.data!= left.data) {
                return true;
            }
            right=right.next;
            left=left.next;
        }
        return false;
    }
    public void createLoopAtPosition(int position) {
        if(head == null) return;

        node temp = head;
        node loopNode = null;
        int count = 0;

        // Find the node at the given position
        while(temp.next != null) {
            if(count == position) {
                loopNode = temp;  // This is where loop will connect
            }
            temp = temp.next;
            count++;
        }

        // Connect last node to the loop position
        if(loopNode != null) {
            temp.next = loopNode;
            System.out.println("Loop created at position: " + position);
        }
    }
    public boolean DetectingCycle() {
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                return true;
            }
        }
        return false;
    }
    public void RemoveCycle(){
        node slow=head;
        node fast=head;
        node prev=null;
        boolean check=false;
        while(fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                check= true;
                break;
            }
        }
        if(check) {
            slow=head;
            while(slow!=fast) {
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
        }
        prev.next=null;
    }
    public static void main(String[] args) {
        Linked_List LL_1=new Linked_List();
//        LL_1.addFirst(30);
//        LL_1.addFirst(20);
//        LL_1.addFirst(10);
//        LL_1.addLast(50);
//        LL_1.addLast(60);
//        LL_1.addLast(70);
//        LL_1.AddMiddle(2,40);
        LL_1.addFirst(10);
        LL_1.addLast(20);
        LL_1.addLast(30);
        LL_1.addLast(40);
        LL_1.addLast(50);
        node mid=LL_1.FindMid();
        LL_1.Show();
        System.out.println();
//        System.out.println("Mid is "+mid.data);
//        LL_1.ReverseFromANode(mid);
//        System.out.println();
//        if(LL_1.PalindromeChecker(mid)) {
//            System.out.println("not a Palindrome");
//        } else {
//            System.out.println("It is a Palindrome");
//        }
        LL_1.createLoopAtPosition(2);
        if(LL_1.DetectingCycle()) {
            System.out.println("loop Detected");
            LL_1.RemoveCycle();
            System.out.println("Cycle Removed");
        } else {
            System.out.println("Loop Not detected");
        }
        LL_1.Show();
    }
}





















