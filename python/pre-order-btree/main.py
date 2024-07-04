class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None


def pre_order(root):
    cur = root
    stack = []
    res = []

    while cur or stack:
        if cur:
            res.append(cur.data)
            stack.append(cur.right)
            cur = cur.left
        else:
            cur = stack.pop()

    return res


if __name__ == "__main__":
    root = Node(1)
    root.left = Node(2)
    root.right = Node(3)
    root.left.left = Node(4)
    root.left.right = Node(5)

    res = pre_order(root)
    print("Result:", res)
    assert res == [1, 2, 4, 5, 3], "Test Case 1 Failed"

    print("All test cases passed!")
