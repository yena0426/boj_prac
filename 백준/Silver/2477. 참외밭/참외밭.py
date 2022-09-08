from collections import deque

melon = int(input())
di_cnt = [0, 0, 0, 0]
q = deque()
for _ in range(6):
    x, y = map(int, input().split())
    q.append([x, y])
    di_cnt[x-1] += 1

big = 1
small = 1
s_cnt = 0
land = []

while q:
    tmp = q.popleft()
    if di_cnt[tmp[0]-1] == 1:
        big *= tmp[1]
        land.append(tmp)
        break
    else:
        q.append(tmp)

while q:
    tmp = q.popleft()
    if di_cnt[tmp[0]-1] == 1:
        big *= tmp[1]
    elif di_cnt[tmp[0]-1] == 2:
        s_cnt += 1
        if 2 <= s_cnt <= 3:
            small *= tmp[1]
    land.append(tmp)

print(melon*(big-small))