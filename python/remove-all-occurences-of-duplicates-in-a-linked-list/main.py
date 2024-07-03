class Node:
    def __init__(self, val):
        self.data = val
        self.next = None


class Solution:
    def removeAllDuplicates(self, head):
        if not head or not head.next:
            return head

        dummy = Node(0)
        dummy.next = head
        prev = dummy
        current = head

        while current and current.next:
            if current.data == current.next.data:
                while current.next and current.data == current.next.data:
                    current = current.next
                prev.next = current.next
            else:
                prev = prev.next
            current = current.next

        return dummy.next


# Test Cases
# Input: Linked List = 23->28->28->35->49->49->53->53
# Output: 23 35

sol = Solution()

head = Node(23)
head.next = Node(28)
head.next.next = Node(28)
head.next.next.next = Node(35)
head.next.next.next.next = Node(49)
head.next.next.next.next.next = Node(49)
head.next.next.next.next.next.next = Node(53)
head.next.next.next.next.next.next.next = Node(53)

res = sol.removeAllDuplicates(head)

assert res.data == 23, "Test Case 1 Failed"

print("All test cases passed!")
