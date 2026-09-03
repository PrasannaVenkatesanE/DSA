# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head or k == 0:
            return head 
        l = 1
        tail = head
        while(tail.next != None):
            tail = tail.next
            l+=1
        
        if(k%l == 0):
            return head
        k = k % l
        tail.next = head

        newlastnode = head
        cnt = 1
        pos = l-k
        while(cnt < pos):
            newlastnode = newlastnode.next
            cnt+=1
        
        
        head = newlastnode.next
        newlastnode.next = None

        return head