import sys

def perm(num):
    if num <= 3:
        return permdict[num]
    else:
        try:
            return permdict[num]
        except:
            permdict[num] = perm(num-1) + perm(num-2)
        return permdict[num]

permdict = {
               0: 1,
               1: 1,
               2: 2,
               3: 3,
}

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

ans = 1
s = 0
for i in range(m):
    tmp = int(sys.stdin.readline())
    ans *= perm(tmp-s-1)
    s = tmp
ans *= perm(n-s)

print(ans)