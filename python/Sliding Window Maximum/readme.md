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
<div style="display: flex; justify-content: center; gap: .8rem;">
<a href="twitter.com/soham901x"><img src="https://cdn.jsdelivr.net/gh/dmhendricks/signature-social-icons@master/icons/round-flat-filled/45px/twitter.png" /></a>
<a href="https://www.linkedin.com/in/soham-sagathiya-898b6a254/"><img src="https://cdn.jsdelivr.net/gh/dmhendricks/signature-social-icons@master/icons/round-flat-filled/45px/linkedin.png" /></a>
<a href="https://discordapp.com/users/789082473639706666"><img src="https://cdn.jsdelivr.net/gh/dmhendricks/signature-social-icons@master/icons/round-flat-filled/45px/discord.png" /></a>
<a href="https://www.instagram.com/soham901ig/"><img src="https://cdn.jsdelivr.net/gh/dmhendricks/signature-social-icons@master/icons/round-flat-filled/45px/instagram.png" /></a>
<a href="soham901-portfolio.vercel.app/"><img src="https://cdn.jsdelivr.net/gh/dmhendricks/signature-social-icons@master/icons/round-flat-filled/45px/website.png" /></a>
</div>


<b style="display: flex; justify-content: center; margin-top: 2rem;">Thank you for reading!</b>