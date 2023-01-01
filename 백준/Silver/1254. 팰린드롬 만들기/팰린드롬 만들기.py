import sys
si = sys.stdin.readline

s = si().strip()
cnt = len(s)

middle = len(s) // 2
tmp = s[middle]

while tmp != 'A':
    if len(s) % 2:
        for i in range(1, middle+1):
            if s[middle-i] != s[middle+i] and s[middle+i] != 'A':
                s += 'A'
                cnt += 1
                break
        if len(s) % 2 == 0:
            middle = len(s) // 2
            tmp = s[middle]
            continue

    else:
        for i in range(1, middle+1):
            if s[middle-i] != s[middle+i-1] and s[middle+i-1] != 'A':
                s += 'A'
                cnt += 1
                break
        if len(s) % 2:
            middle = len(s) // 2
            tmp = s[middle]
            continue

    break

print(cnt)