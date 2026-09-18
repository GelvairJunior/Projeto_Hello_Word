a = [16,7,6,2]
n = len(a)
b = 0
for j in range(n-1):
    for i in range(n-j-1):
        if a[i] > a[i+1]:
            print(b+1)
            a[i], a[i+1] = a[i+1], a[i]
            b += 1
