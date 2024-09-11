//{ Driver Code Starts
import java.util.*;

class StackNode {
    int data;
    StackNode next;

    StackNode(int a) {
        data = a;
        next = null;
    }
}

class GfG {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Flush the newline character left by nextInt
        while (T-- > 0) {
            MyStack sq = new MyStack();
            String line = scanner.nextLine();
            Scanner ss = new Scanner(line);
            List<Integer> nums = new ArrayList<>();
            while (ss.hasNextInt()) {
                int num = ss.nextInt();
                nums.add(num);
            }
            int n = nums.size();
            int i = 0;
            while (i < n) {
                int QueryType = nums.get(i++);
                if (QueryType == 1) {
                    int a = nums.get(i++);
                    sq.push(a);
                } else if (QueryType == 2) {
                    System.out.print(sq.pop() + " ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

// } Driver Code Ends


class MyStack {
    class StackNode {
        int data; // element
        StackNode next; // Adrress
        StackNode(int a) {
            data = a;
            next = null;
        }
    }
    StackNode top;
    // Input: im given a LinkedlIst
    // i have to perform push and pop operations 
    // to show linkedlist behaves as a Stack

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        // i have to add a node at the head
        // how can i add the Node at the head
        // create a new node with the given value val
        // connecting the newNode to the prevNode
        // assign the head to newly created Node
        StackNode one = new StackNode(a);
        one.next = top;
        top = one;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        // The main intuition is to remove the headNode and point the head to the prevNode
        // to get the updated linked list.
        // Problem : what if pop operation comes twice in testCase
        if (top == null) return -1;
    //int topData = top.data;
   StackNode temp = top;
    top = top.next;
    return temp.data;
    }
}
