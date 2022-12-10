import sys
si = sys.stdin.readline

from collections import defaultdict

t = int(si())
for _ in range(t):
    n1 = int(si())
    note1 = defaultdict(int)
    for num in list(map(int, si().split())):
        note1[num] = 1
    n2 = int(si())
    for num in list(map(int, si().split())):
        print(note1[num])
        