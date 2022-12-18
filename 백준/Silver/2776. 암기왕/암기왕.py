import sys
si = sys.stdin.readline

t = int(si())
for _ in range(t):
    n1 = int(si())
    note = set(map(int, si().split()))
    n2 = int(si())
    for i in map(int, si().split()):
        if i in note:
            print(1)
        else:
            print(0)
        