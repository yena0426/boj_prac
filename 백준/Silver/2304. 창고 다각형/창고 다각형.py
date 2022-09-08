cnt = int(input())
con = {}
maxi = 0
maxv = 0
for _ in range(cnt):
    x, y = map(int, input().split())
    con[x] = y
    if y > maxv:
        maxi = x
        maxv = y

con = sorted(con.items())

ans = 0
stack = []
tmpi = con[0][0]
tmpmax = con[0][1]
for i, v in con:
    if i < maxi:
        ans += (i-tmpi) * tmpmax
        if v > tmpmax:
            tmpmax = v
        tmpi = i
    elif i == maxi:
        ans += (i - tmpi) * tmpmax + maxv
    else:
        stack.append((i, v))

tmpi = con[-1][0]
tmpmax = con[-1][1]
while stack:
    i, v = stack.pop()
    ans += (tmpi-i) * tmpmax
    tmpi = i
    if v > tmpmax:
        tmpmax = v
    if not stack:
        ans += (i-maxi) * tmpmax

print(ans)
