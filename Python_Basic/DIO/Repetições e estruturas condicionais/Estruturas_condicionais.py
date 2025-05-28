valor = 400

opcao = int(input('Informe uma opção: [1] Sacar \n[2] Consultar Extrato: '))

if opcao == 1:
    sacar = float(input("Informe a quantia para o saque: "))
    if valor >= sacar:
        valor -= sacar
        print('Aqui o seu saque, sobrou ', valor)
    else:
        print('Saldo Insuficiente, tenta consultar antes ;) ')
elif opcao == 2:
    print('Exibindo seu Extrato... ')
    print(valor)
else:
    print('Opção invalida')
    SystemExit

saldo = 500
saque = 400

status = "sucesso" if saldo >= saque else "falha"

print(f"{status} ao realizar o saque")