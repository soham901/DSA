nums = [1, 3, -1, -3, 5, 3, 6, 7]
k = 3

for a in range(len(nums)):
    curWin = nums[a:a+k]
    if len(curWin) == k:
        print(curWin, ':', max(curWin))
    else:
        break
