package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 141. Linked List Cycle
 * Given a linked list, determine if it has a cycle in it.
 * To represent a cycle in the given linked list,
 * we use an integer pos which represents the position (0-indexed) in the linked list
 * where tail connects to. If pos is -1, then there is no cycle in the linked list.
 * @author Bmo
 * @date 2020/2/14 9:47
 */
public class LinkedListCycle {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x;}
    }
    // Time : O(n), Space: O(n)
    public boolean hasCycleWithHashSet(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        for (ListNode p = head; p != null; p = p.next) {
            if (set.contains(p)) return true;
            set.add(p);
        }
        return false;
    }
    // Time : O(n), Space: O(1)
    public boolean hasCycleWithTwoPointer(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
