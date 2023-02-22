package hot100;

/**
 * @author:totoro
 * @createDate:2023/2/22
 * @description:
 */
public class Hot2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = 0;
        int b = 0;

        int i = 0;

        while ( l1!=null ){
            a = (int) (a + l1.val*Math.pow(10,i));
            i++;
            l1 = l1.next;
        }
        i = 0;
        while ( l2!=null ){
            b = (int) (b + l1.val*Math.pow(10,i));
            i++;
            l2 = l2.next;
        }

        ListNode head = new ListNode();
        ListNode curNode = head;


        int sum = a + b;

        while (true){
            int i1 = sum % 10;
            ListNode newNode = new ListNode(i1);
            curNode.next = newNode;
            curNode = newNode;

            sum = sum / 10;
            if (sum <= 0){
                break;
            }
        }
        return head;
    }



    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


}

