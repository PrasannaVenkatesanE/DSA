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
        tail.next = head
        if(k%l == 0):
            return head
        k = k % l
        def findkthnode(temp, pos):
            cnt = 1
            while(cnt != pos):
                if(cnt == pos): return temp
                temp = temp.next
                cnt+=1
            return temp
        newlastnode = findkthnode(head,l-k)
        head = newlastnode.next
        newlastnode.next = None

        return head