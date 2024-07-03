from typing import List


class Solution:
    def duplicates(self, n: int, arr: List[int]) -> List[int]:
        seens = []
        for a in arr:
            if a not in seens:
                seens.append(a)
        return seens if seens.__len__() < 1 else [-1]
