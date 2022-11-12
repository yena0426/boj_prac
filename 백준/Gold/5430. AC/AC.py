import sys
from collections import deque

t = int(sys.stdin.readline())
for i in range(t):
    func = list(sys.stdin.readline().strip())
    n = int(sys.stdin.readline())
    r = 0
    empty = 0
    nums = deque(sys.stdin.readline().strip('[]\n').split(','))
    for f in func:
        if f == 'R':
            r += 1
        elif f == 'D':
            if nums == deque(['']):
                empty = 1
                break
            try:
                if r % 2:
                    nums.pop()
                else:
                    nums.popleft()
            except:
                empty = 1
                break
    if empty:
        print('error')
    else:
        if r % 2:
            nums.reverse()
        print(f"[{','.join(nums)}]")

