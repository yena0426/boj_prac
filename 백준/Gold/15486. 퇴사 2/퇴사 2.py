import sys

si = sys.stdin.readline

n = int(si())
reservations = [list(map(int, si().split())) for _ in range(n)]

money = [0] * (n+1)
maxmoney = 0
for i in range(n-1, -1, -1):
    time = i + reservations[i][0]
    if time <= n:
        money[i] = reservations[i][1] + money[time] if reservations[i][1] + money[time] > maxmoney else maxmoney
        maxmoney = money[i]
    else:
        money[i] = maxmoney

print(maxmoney)
