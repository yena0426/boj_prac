import sys
si = sys.stdin.readline

n, m = map(int, si().split())
floor = [list(si().strip()) for _ in range(n)]

cnt = 0

# 가로 탐색 
for i in range(n):
    tmp = '-'
    pre = 0
    for j in range(m):
        if floor[i][j] == tmp:
            pre = 1
        else:
            if pre:
                cnt += 1
            pre = 0
    if pre:
        cnt += 1

#새로 탐색 
for i in range(m):
    tmp = '|'
    pre = 0
    for j in range(n):
        if floor[j][i] == tmp:
            pre = 1
        else:
            if pre:
                cnt += 1
            pre = 0
    if pre:
        cnt += 1

print(cnt)