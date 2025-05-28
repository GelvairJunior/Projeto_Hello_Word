Macacos = int(input('Quantos macacos tem nesse zoologico? '))
print('Agora eu vou contar de um á um ')
listm = []




while Macacos >= 0:
    listm.append(Macacos)
    Macacos -= 1


print(listm)

for quant in range(len(listm)):
    print(quant)


list(range(4))
print(list(range(4)))

#aqui vai pular de 5 em 5
for num in range(0, 51, 5):
    print(num, end=" ")

opcao = 1
while opcao != 0:
    opcao = int(input("\n[1] para Sacar \n[2] Extrato \n[0] Sair \n"))

    if opcao == 1:
        print("Sacando")
    elif opcao == 2:
        print("Exibindo o extrato")
    else:
        print("Não tem essa opção, tente outra")
else:
    print("Obrigado por usar nosso sitema bancário Até mais (:")


while True:
    opcao = int(input("Informe algum número, vamos ver se você acerta o numero: "))
    if opcao == 10:
        print(opcao)
        print(" Acertou")
        break

    print(f"{opcao} Ainda não acertou")

for numero in range(100):

    if numero == 12 or numero == 20:
        print("\naqui estou pulando esses numeros\n")
        continue
    print(numero, end=" ")




#aqui temos um algoritmo par reorganizar os numeros em ordem numerica com o for range e while
A = [7, 4, 2, 6, 3, 5, 8, 9, 1]
for j in range(1, len(A)):
    chave = A[j]
    j = j - 1
    while j >= 0 and A[j] > chave:
        A[j + 1] = A[j]
        j = j - 1
    A[j + 1] = chave
print(A)

