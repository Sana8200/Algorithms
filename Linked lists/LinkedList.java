
public class LinkedList{
    Cell first;

    private class Cell {
        int head;
        Cell tail;

        Cell(int val, Cell tl) {
            head = val;
            tail = tl;
        }
    }

    public LinkedList(int n){
        Cell last = null;
        for(int i = 0; i < n ; i++ ){
            last = new Cell(i, last);
        }
        first = last;
    }


    //add the item as the first cell in the list
    void add(int item) {
        first = new Cell(item, first);
    }


    //return the length of the list
    int length() {
        int length = 0;
        Cell current = first;
        while (current != null) {
            length++;
            current = current.tail;
        }
        return length;
    }


    //return true or false depending on if the item can be found in the list
    boolean find(int item) {
        Cell current = first;
        while (current != null) {
            if (current.head == item) {
                return true;
            }
            current = current.tail;
        }
        return false;
    }


    //remove the item if it exits in the list
    void remove(int item) {
        if (first == null) return;

        if (first.head == item) {
            first = first.tail;
            return;
        }

        Cell current = first;
        while (current.tail.head == item) {
            current.tail = current.tail.tail;
            return;
        }
        current = current.tail;
    }



    //append a linked list to the end of another linked list
    //moving the last element in the linked list and making it point to the first element in the second list
    public void append(LinkedList list){
        Cell nxt = this.first;
        Cell prv = null;

        if(nxt == null) {
            this.first = list.first;
            return;
        } else {
            while(nxt.tail != null && nxt.tail != null) {
                prv = nxt;
                nxt = nxt.tail;
            }
            nxt.tail = list.first;
        }
        list.first = null;
    }



    public void printList(){
        Cell current = first;
        while (current != null) {
            System.out.print(current.head + " -> ");
            current = current.tail;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        System.out.println("Varying size of list a, and fixed size of list b");
        System.out.printf("%-10s   %-20s%n", "List a Size", "Time (ns)");

        //benchmark for varying sizes of list a
        for(int i = 1000; i <= 10000; i+= 1000){
            LinkedList a = new LinkedList(i);  //varying size of list a
            LinkedList b = new LinkedList(100);  //fixed size of list b

            long startTime = System.nanoTime();
            a.append(b);
            long endTime = System.nanoTime();

            long totalTime = endTime - startTime;

            System.out.printf("%-10d    %-20d%n", i, totalTime);
        }


        System.out.println("\n\nVarying size of list b, and fixed size of list a");
        System.out.printf("%-10s   %-20s%n", "List b Size", "Time (ns)");

        //benchmark for varying sizes of list b
        for (int i = 1000; i <= 10000; i += 1000) {
            LinkedList a = new LinkedList(100); //fixed size of list a
            LinkedList b = new LinkedList(i); //varying size of list b

            long startTime = System.nanoTime();
            a.append(b);
            long endTime = System.nanoTime();

            long totalTime = endTime - startTime;

            System.out.printf("%-10d    %-20d%n", i, totalTime);
        }
    }
}
