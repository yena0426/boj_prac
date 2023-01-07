import sys
si = sys.stdin.readline


def find_p(p, x):
    if p[x] != x:
        p[x] = find_p(p, p[x])
    return p[x]


def union_p(p, a, b):
    a = find_p(p, a)
    b = find_p(p, b)
    if a < b:
        p[b] = a
    else:
        p[a] = b


v, e = map(int, si().split())
p = [i for i in range(v+1)]

edges = []
res = 0

for _ in range(e):
    a, b, cost = map(int, si().split())
    edges.append((cost, a, b))

edges.sort()

tmp = 0
for edge in edges:
    cost, a, b = edge
    if find_p(p, a) != find_p(p, b):
        union_p(p, a, b)
        res += cost
        tmp = cost

print(res-tmp)