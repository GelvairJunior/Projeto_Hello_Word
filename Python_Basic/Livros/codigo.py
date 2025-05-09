A = [7, 4, 2, 6, 3, 5, 8, 9, 1]
for j in range(1, len(A)):
    chave = A[j]
    print(j)
    print(chave)
    j = j - 1
    print(j)
    while j >= 0 and A[j] > chave:
        A[j + 1] = A[j]
        j = j - 1
    A[j + 1] = chave
print(A)