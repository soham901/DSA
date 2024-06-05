# 1. Sliding Window Maximum Problem in Python

I recently solved the sliding window maximum problem in DSA using Python. Here's my solution for the problem, along with a shoutout to [@ezsnippet](https://github.com/nwaliaez) for providing the question.

## Problem Statement

Given an array `nums` and an integer `k`, find the maximum value in each sliding window of size `k` moving from left to right.

## Example 1:
```python
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
```

## Example 2:
```python
Input: nums = [1], k = 1
Output: [1]
```

## Explanation
I iterate through the array using a sliding window of size `k`, and for each window, I print the window elements along with the maximum value in that window.

Feel free to use and modify this code as needed. If you find it helpful, solve this and post it, and don't forget to give a shoutout to [@ezsnippet](https://github.com/nwaliaez) for the question, and to me for the solution :P

### [My Solution](/main.py)

## Connect with me
[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/soham-sagathiya-898b6a254/)
[![Twitter](https://img.shields.io/badge/Twitter-%231DA1F2.svg?logo=Twitter&logoColor=white)](https://twitter.com/soham901x)
[![Discord](https://img.shields.io/badge/Discord-%237289DA.svg?logo=discord&logoColor=white)](https://discord.com/users/789082473639706666)
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?logo=Instagram&logoColor=white)](https://instagram.com/soham901ig)

Thanks for reading!