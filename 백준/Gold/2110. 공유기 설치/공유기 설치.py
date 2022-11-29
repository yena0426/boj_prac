import sys

N, C = map(int, sys.stdin.readline().split())
houses = sorted(list(int(sys.stdin.readline()) for _ in range(N)))

min_gap = 1
max_gap = houses[-1] - houses[0]
ans = 0

while min_gap <= max_gap:
    gap = (max_gap + min_gap) // 2
    tmp = houses[0]
    cnt = 1
    for house in houses:
        if house == tmp:
            continue
        else:
            if house >= tmp + gap:
                tmp = house
                cnt += 1
    if cnt >= C:
        ans = gap
        min_gap = gap + 1
    else:
        max_gap = gap - 1

print(ans)