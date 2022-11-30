import sys
input = sys.stdin.readline

n = int(input())
tri = list([0] * n for _ in range(n))
tri[0][0] = int(input())

for i in range(1, n):
    tmp = list(map(int, input().split()))
    for j in range(i+1):
        if j == 0:
            tri[i][j] = tri[i-1][j] + tmp[j]
        elif j == i:
            tri[i][j] = tri[i-1][j-1] + tmp[j]
        else:
            tri[i][j] = tri[i-1][j-1] + tmp[j] if tri[i-1][j-1] > tri[i-1][j] else tri[i-1][j] + tmp[j]

print(max(tri[n-1]))