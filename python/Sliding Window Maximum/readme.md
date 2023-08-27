# 1. Sliding Window Maximum Problem in Python

I recently solved the sliding window maximum problem in DSA using Python. Here's my solution for the problem, along with a shoutout to [@ezsnippet](https://github.com/nwaliaez) for providing the question.

## Problem Statement

Given an array `nums` and an integer `k`, find the maximum value in each sliding window of size `k` moving from left to right.

## Solution

```python
nums = [1, 3, -1, -3, 5, 3, 6, 7]
k = 3

for a in range(len(nums)):
    if len(nums[a:a+k]) == k:
        print(nums[a:a+k], ':', max(nums[a:a+k]))
    else:
        break
```

## Explanation
I iterate through the array using a sliding window of size `k`, and for each window, I print the window elements along with the maximum value in that window.

Feel free to use and modify this code as needed. If you find it helpful, don't forget to give a shoutout to [@ezsnippet](https://github.com/nwaliaez) for the question! and me for the solution :P

## Connect with me
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/soham-sagathiya-898b6a254/)
[![Twitter](https://img.shields.io/badge/Twitter-%231DA1F2.svg?logo=Twitter&logoColor=white)](https://twitter.com/soham901x)
[![Discord](https://img.shields.io/badge/Discord-%237289DA.svg?logo=discord&logoColor=white)](https://discord.com/users/789082473639706666)
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/soham901ig)

Thanks for reading!
