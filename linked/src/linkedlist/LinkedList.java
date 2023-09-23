package linkedlist;

class LinkedList {
    Cell first;

    public LinkedList() {

        first = null;
    }

    private class Cell {
        int head;
        Cell next;

        Cell(int value, Cell nxt) {
                head = value;
                next = nxt;
        }
    }

    public void add(int item) {
        Cell newCell = new Cell(item, first);
        first = newCell;
    }
    
    public int length() {
        int count = 0;
        Cell current = first;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;

    }

    public boolean find(int item) {

    }

    public void remove(int item) {

    }
    
}
