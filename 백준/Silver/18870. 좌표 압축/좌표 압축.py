import sys

n = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split()))
nums2 = sorted(list(set(nums)))
numsdict = {nums2[i] : i for i in range(len(nums2))}
for num in nums:
    print(numsdict[num], end=' ')