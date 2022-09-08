import math


switches = int(input())

ons = list(map(int,input().split(' ')))

cnt = int(input())

def onoff(light): 
    if light == 1:
        return 0
    else:
        return 1  

for i in range(cnt):
    students = list(map(int,input().split(' ')))
    if students[0] == 1:
        for j in range(len(ons)):
            if (j+1) % students[1] == 0:
                ons[j] = onoff(ons[j])

    elif students[0] == 2:
        for k in range(math.ceil(len(ons)/2)):           
            if students[1]-1-(k+1) >= 0 and students[1]-1+(k+1) < len(ons) and ons[students[1]-1-(k+1)] == ons[students[1]-1+(k+1)]:
                ons[students[1]-1-(k+1)] = onoff(ons[students[1]-1-(k+1)])
                ons[students[1]-1+(k+1)] = onoff(ons[students[1]-1+(k+1)])
            else:
                break
        
        ons[students[1]-1] = onoff(ons[students[1]-1])

for i in range(math.ceil(len(ons)/20)):
    for j in range(20):
        try:
            print(ons[i*20+j],end=' ')
        except IndexError:
            break
    print()
