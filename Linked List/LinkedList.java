public class LinkedList {
    public static class Node {
            int data;
            Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Methods
    public void addFirst(int data) {      //TC O(1) constant time
        //step 1 = create new node
        Node newNode = new Node(data);
         size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step 2 - newNode next = head: assign the value of Head in the new node
        newNode.next = head; //Linking step

        //step 3 - head = new node
        head = newNode;
    }

    public void addLast(int data) {
        //step 1 = create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
        }
        //step 2
        tail.next = newNode;
        //step 3
        tail = newNode;
    }

    //Print LinkedList
    public void print() {  //TC O(n)
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Add in the middle
    public void add(int idx, int data) {
        if( idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Remove first in a LL
    public int removeFirst() {
        //special case
        if(size == 0) {// Null head
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {// Single node
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove last in a LL
    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size - 2
        Node prev = head;
        for(int i=0; i<size-2;i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //iterative search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if(temp.data == key) { // Key found case
                 return i;
            }
            temp = temp.next;
            i++;
        }

        //key not found case
        return -1;
    }

    //Recursive Search

    public int helper(Node head,int key) {// Linear TC O(n)
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }
    public int recursiveSearch(int key) {
        return helper(head, key);
    }


    //Reverse a LinkedList 
      //TC O(n)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
         head = prev;
    }

    //Find and Remove n th Node
    public void deleteNthfromEnd(int n) {
        //calculate size
        int size = 0;
        Node temp = head;
        while( temp != null) {
            temp = temp.next;
            size ++;
        }

        if(n == size) {
            head = head.next; // remove first operation
            return;
        }

        //size-n 
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return ;
    }

    //Check if LL is Palindrome or not

    //Find Middle using slow fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is my midNode
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        //Step 1- Find Mid
        Node midNode = findMid(head);

        //Step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //Right half head
        Node left = head;

        //Step 3 Check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }



    public static void main(String args[]) {
          
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2); 
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
       ll.add(2, 3);
       ll.print();
      
       //ll.removeFirst();
      // ll.print();

       //ll.removeLast();
       //ll.print();
     //System.out.println(ll.recursiveSearch(3));
     //System.out.println(ll.recursiveSearch(10));
     //ll.reverse();
     //ll.deleteNthfromEnd(3);
     //ll.print();
         ll.addLast(1);
         ll.addLast(2);
         ll.addLast(3);
         ll.addLast(1);

         ll.print();
         System.out.println(ll.checkPalindrome());

    }
}
