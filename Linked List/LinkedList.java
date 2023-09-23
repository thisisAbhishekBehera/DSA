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
        //base case
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
        size++;  //Size ++ is used to calculate size of LL 
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

    //Find and Remove n th Node    TC O(n)
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


    //detect Cycle in LL 
    //  Floyd's Cycle finding Algo
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast) {
                return true; //Cycle exists
            }
        }

        return false;  //Cycle doesnot exist
    }




    // Remove Cycle in a linkedlist
    public static void removeCycle() {
        //Detect Cycle 
         Node slow = head;
         Node fast = head;
         boolean cycle = false;
         while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
            
         }

         if(cycle == false) {
                return;
            }
            
        // Find meeting point
          slow = head;
          Node prev = null;//last node
          while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
          }
        // remove cycle -> last.next = null
        prev.next = null;
    }
 
    //    Merge Sort on LinkedList
        //    TC O(n logn)
    //    GetMid function
    public  Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //Mid Node

    }
     //merge function
    public   Node merge(Node head1, Node head2) {
        Node mergedLL =new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null ) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
        }

        return mergedLL.next;
    }


    public Node mergeSort(Node head) {
        // Base case 
        if(head == null || head.next == null) {
            return head;
        }
        //Find Mid
          Node mid = getMid(head);
        // Left and right Merge sort
         Node rightHead = mid.next;
         mid.next  = null;
         Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // Merge
        return  merge(newLeft, newRight);
    }


    // ZigZag LinkedList

    public void zigzag() {
        //find mid

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        Node mid = slow;

        //reverse 2nd half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL , nextR;
        
        //alternate merge zigzag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }



    public static void main(String args[]) {
          
    //     LinkedList ll = new LinkedList();
    //     ll.print();
    //     ll.addFirst(2); 
    //     ll.print();
    //     ll.addFirst(1);
    //     ll.print();
    //     ll.addLast(4);
    //     ll.print();
    //     ll.addLast(5);
    //    ll.add(2, 3);
    //    ll.print();
      
       //ll.removeFirst();
      // ll.print();

       //ll.removeLast();
       //ll.print();
     //System.out.println(ll.recursiveSearch(3));
     //System.out.println(ll.recursiveSearch(10));
     //ll.reverse();
     //ll.deleteNthfromEnd(3);
     //ll.print();
        //  ll.addLast(1);
        //  ll.addLast(2);
        //  ll.addLast(3);
        //  ll.addLast(1);

        //  ll.print();
        //  System.out.println(ll.checkPalindrome());
        


        //Create a LL with Cycle
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // //1 -> 2 -> 3 -> 2

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
    //    1>2>>3>4>5

        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();
        ll.print();
        ll.zigzag();
        ll.print();
    }
}
