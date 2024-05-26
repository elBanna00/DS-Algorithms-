import java.util.List;

public class LinkedList {
    private ListNode head;
        private static class ListNode{
            private int data;
            private ListNode next;
            public ListNode(int data){
                this.data =data;
                this.next = null;
            }
        }
        public void dispaly(){
            ListNode cur = this.head;
            while(cur != null){
                System.out.print(cur.data + "-->");
                cur = cur.next;
            }
            System.out.print("null");
        }

    public int length(){
        ListNode cur = this.head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void insertStart(int data){
        ListNode n = new ListNode(data);
        n.next = this.head;
        this.head = n;
    }
    public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ll.head = new ListNode(10);
      ListNode sec = new ListNode(20);
      ListNode thr = new ListNode(8);
      ListNode four = new ListNode(1);

      ll.head.next = sec;
      sec.next = thr;
      thr.next = four;
        ll.insertStart(50);
      ll.dispaly();
      System.out.println(ll.length());
    }

}
