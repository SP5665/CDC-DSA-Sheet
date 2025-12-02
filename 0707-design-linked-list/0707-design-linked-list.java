class MyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val){
            this.val = val;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        ListNode temp = head;
        int c=0;
        while (temp != null) {
            if (c==index) return temp.val;
            temp = temp.next;
            c++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index>size) return;
        else if (index == 0) {
            addAtHead(val);
            return;
        }
        else if (index == size) {
            addAtTail(val);
            return;
        }
        ListNode newNode = new ListNode(val);
        ListNode temp = head;
        int c=0;
        while (temp!=null) {
            if (c==index-1) break;
            temp = temp.next;
            c++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index>=size) return;
        if (index == 0) {
            head = head.next;
            size--;
            return;
        }
        ListNode temp = head;
        int c=0;
        while (temp!=null) {
            if (c==index-1) break;
            temp = temp.next;
            c++;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */