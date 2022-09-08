from itertools import combinations

h = [int(input()) for _ in range(9)]
h.sort()
for c in combinations(h, 7):
    if sum(c) == 100:
        print(*c, sep='\n')
        break