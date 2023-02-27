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
        ListNode head = new ListNode(0);
        ListNode newList = head;

        int curr = 0;

        while (l1 != null || l2 != null){
            int x = l1 != null?l1.val:0;
            int y = l2 != null?l2.val:0;

            int sum = curr + x + y;

            curr = sum/10;
            newList.next = new ListNode(sum%10);

            newList = newList.next;

            if (l1 != null){
                l1 = l1.next;
            }

            if (l2 != null){
                l2 = l2.next;
            }
        }
        if (curr > 0){
            newList.next = new ListNode(curr);
        }
        return head.next;
    }



    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


}

