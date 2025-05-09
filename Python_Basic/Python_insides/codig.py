#aqui iremos importar um codigo uma biblioteco do python que é o pyautogui 
#pip install Pyautogui

#Sempra faça um passo a passo da tarefa, sempre quando nao conseguir fazer um passo destrincha ele em passos menores

#a biblioteca do time vem no python nao precisa baixar

#link: https://dlp.hashtagtreinamentos.com/python/intensivao/login

import pyautogui
import time
import pandas

pyautogui.PAUSE = 1


#variaveis
link = "https://dlp.hashtagtreinamentos.com/python/intensivao/login"

#com o Pyautogui toda ação que queira fazer voce vai digitar pyautogui.ação
print("Hello Word! Python")

pyautogui.press("win")

#digitar o nome do chrome
pyautogui.write("chrome")

#clicando no enter
pyautogui.press("enter")

#clicando em uma posição especifica
pyautogui.click(x=1083, y=456)

pyautogui.write(link)
pyautogui.press("enter")

# Esperar pro computador 3 Segundos
time.sleep(3)

pyautogui.press("tab")

pyautogui.write("junior@gmail.com")
pyautogui.press("tab")
pyautogui.write("MinhaSenha")

pyautogui.press("tab")
pyautogui.press("enter")


# Importar base de dados dos produtos
# vamos baixar outra bibliotecas para instalar o pandas junto do openpyxl usando o seguinte comando
# pip install pandas openpyxl
# o pandas ele transforma o arquivo de dados como csv para facilitar de colocar em dados

#trabalhando com variaveis

# cadastrar produtos

#var para a tabela
tabela = pandas.read_csv("produtos.csv")
time.sleep(3)
#print(tabela)

#primeiro faça com um produto,entenda o processo e depois faz os outros produtos

#codigo,marca,tipo,categoria,preco_unitario,custo,obs
#MOLO000251,Logitech,Mouse,1,25.95,6.50,

#como fonciona o for
#for cadaiten in daminhatabela: ele fará

for linha in tabela.index: #para repetir tudo de novo ate terminar a tabela

    pyautogui.click(x=730, y=299) # clicar no primeiro passo

    #codigo   
    codigo = tabela.loc[linha, "codigo"] #sempre vai escrever assim o loc[numerodalinha(2), coluna(2)] aqui esta escrito exatamente como esta no produtos.csv 
    pyautogui.write(str(codigo)) #transformando caso for um numero transformar em str
    pyautogui.press("tab")

    #marca
    marca = tabela.loc[linha, "marca"]
    pyautogui.write(str(marca))
    pyautogui.press("tab")

    #tipo
    tipo = tabela.loc[linha, "tipo"]
    pyautogui.write(str(tipo))
    pyautogui.press("tab")

    #categoria
    categoria = tabela.loc[linha, "categoria"]
    pyautogui.write(str(categoria))
    pyautogui.press("tab")

    #preço unitario
    preco_unitario = tabela.loc[linha, "preco_unitario"]
    pyautogui.write(str(preco_unitario))
    pyautogui.press("tab")

    #custo
    custo = tabela.loc[linha, "custo"]
    pyautogui.write(str(custo))
    pyautogui.press("tab")

    #obs
    obs = tabela.loc[linha, "obs"]
    if obs != "nan": #if x for diferente (!=) = "nan":
        pyautogui.write(str(obs))

    pyautogui.press("tab")


    pyautogui.press("enter") #botão de enviar

    pyautogui.scroll(10000)#subir o maximo que der
    #passo 5 repetir

#nan = valor vazio (not a number)