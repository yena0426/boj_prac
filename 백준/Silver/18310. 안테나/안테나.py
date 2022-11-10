import sys

def antenna(n, arr):
    pos = arr[n]
    minp = 0
    for a in arr:
        minp += abs(pos-a)
    return minp

n = int(sys.stdin.readline())
houses = list(map(int, sys.stdin.readline().split()))
houses.sort()
if n % 2:
    print(houses[n//2])
else:
    ans = houses[(n//2)-1] if antenna((n//2)-1, houses) <= antenna(n//2, houses) else houses[n//2]
    print(ans)