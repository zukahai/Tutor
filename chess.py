temp = input().split(" ")
m, n = (int)(temp[0]), (int)(temp[1])
temp = input().split(" ")
x1, y1 = (int)(temp[0]), (int)(temp[1])
temp = input().split(" ")
x2, y2 = (int)(temp[0]), (int)(temp[1])

a = []
for i in range(0, m + 1):
    b = [0] * (n + 1)
    a.append(b)
a[x1][y1] = 1

X = [2, 2, 1, 1, -1, -1, -2, -2]
Y = [1, -1, 2, -2, 2, -2, 1, -1]

def check(x, y):
    if x < 1 or x > m or y < 1 or y > n:
        return False
    return True

def bfs(x, y):
    queue = [[x, y]];
    while(len(queue) > 0):
        x = queue[0][0]
        y = queue[0][1]
        for i in range(len(X)):
            xt = x + X[i]
            yt = y + Y[i]
            if check(xt, yt) == True and a[xt][yt] == 0:
                a[xt][yt] = a[x][y] + 1
                queue.append([xt, yt])
        queue.pop(0)
        
bfs(x1, y1)
print(a[x2][y2] - 1)
