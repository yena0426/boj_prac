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


v = int(si())
planets = [list(map(int, si().split())) for _ in range(v)]
p = [i for i in range(v)]

x = [(planets[i][0], i) for i in range(v)]
y = [(planets[i][1], i) for i in range(v)]
z = [(planets[i][2], i) for i in range(v)]

x.sort()
y.sort()
z.sort()

edges = []
res = 0

for i in range(v-1):
    edges.append((x[i+1][0] - x[i][0], x[i][1], x[i+1][1]))
    edges.append((y[i+1][0] - y[i][0], y[i][1], y[i+1][1]))
    edges.append((z[i+1][0] - z[i][0], z[i][1], z[i+1][1]))

edges.sort()

for edge in edges:
    cost, a, b = edge
    if find_p(p, a) != find_p(p, b):
        union_p(p, a, b)
        res += cost

print(res)