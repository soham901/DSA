def two_sum(array, target):
    ans = []
    p1, p2 = 0, len(array)
    for a in range(p1, p2):
        print(a)
    return ans


# Test cases
print(two_sum([2, 7, 11, 15], 9))  # Output: [0, 1]
print(two_sum([3, 2, 4], 6))       # Output: [1, 2]
print(two_sum([3, 3], 6))          # Output: [0, 1]