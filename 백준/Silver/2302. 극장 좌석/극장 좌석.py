import sys

def perm(num):
    if num <= 3:
        return num
    else:
        return perm(num-1) + perm(num-2)

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

ans = 1
s = 0
for i in range(m):
    tmp = int(sys.stdin.readline())
    tmpl = tmp-s-1
    if tmpl:
        ans *= perm(tmpl)
    s = tmp
ans *= perm(n-s) if n-s else 1

print(ans)