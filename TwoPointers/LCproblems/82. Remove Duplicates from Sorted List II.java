class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        ListNode q = head;
        while(q!= null){
            if(q.next!=null&&q.val == q.next.val) {
                while(q.next!=null&&q.val == q.next.val) {
                    q = q.next;
                }
                 q = q.next;
                 if (q == null) {
                    p.next = null;
                }
             }else{
                p.next =q;
                p = p.next;
                q= q.next;
            }
            
        }
        return dummy.next;
    }
}
