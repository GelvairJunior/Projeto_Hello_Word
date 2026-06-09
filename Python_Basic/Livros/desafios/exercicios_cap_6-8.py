import re

def hypot(a,b):
    print(a)
    print(b)
    hipotenusa = round((a**2 + b**2)**0.5)
    print(hipotenusa)

    return 0

print(hypot(3, 4))

def is_between(x,y,z):
    if(x<y<z or z<y<x):
        return True
    else:
        return False

print(is_between(3,4,2))

def ackermann(m,n):
    if m==0:
        return n+1
    if(m > 0 and n==0):
        return ackermann(m-1,1)
    if(m>0 and n>0):
        return ackermann(m-1,ackermann(m,n-1))

print(ackermann(2,5))


def gcd(a,b):
    r = a % b
    if b == 0:
        return a
    if a == 0:
        return b

print(gcd(9,18))

def uses_none(word):
    """
            >>> uses_none('banana')
            False

            >>> uses_none('feira')
            True
    """
    strings_proibidas = "Python"

    for world in word.upper():
        if world in strings_proibidas.upper():
            return False

    return True
print(uses_none('feixe'))

def uses_only(word, strings_liberadas):

    for world in word.upper():
        if world not in strings_liberadas.upper():
            return False
    return True

print(uses_only('PIPA', "FIPERAM"))

def uses_all(word, letter_all):

    for world in word.upper():
        if world in letter_all.upper():
            return True
    return False

print(uses_all('fifa', "python"))


def respost(world):
    serie = "acdlort"
    if (len(world) > 7) or (len(world) < 4):
        return False

    for word in world.upper():
        if word in serie.upper():
            return True
    return False

print(respost("python"))

def score(world):
    serie = "acdlort"
    scores = 0
    p = 0
    if (len(world) > 7) or (len(world) < 4):
        return 0

    scores = len(world) - 3

    for word in world.upper():
        if word in serie.upper():
            p += 1

    if p == 0:
        return 0

    if p == 7:
        return (scores+p)

    return scores

print(score("acdlort"))

def uses_all_uses_only(world):
    serie = "acdlort"
    if uses_only(world, serie):
        return False
    return True

def uses_only_uses_all(world):
    serie = "acdlort"
    if uses_all(world, serie):
        return False
    return True

print(uses_only_uses_all("acido"))
print(uses_all_uses_only("acido"))

text = "texto.txt"
def head(text, lines, nameText):
    if(nameText == None):
        nameText = ""
        for world in text:
            if world in ".":
                nameText += "_"+str(lines)
            nameText += str(world)

    print(nameText)
    newText = open(nameText, "w", encoding="utf-8")
    for line in open(text, "r", encoding="utf-8"):
        if lines > 0:
            newText.write(line)
            lines -= 1
        else:
            break
    newText.close()

head(text, 3, None)

def has_pale(text):
    count = 0
    pales = ("PAL((E(S|D|NESS)|ING|LOR))")
    for line in open(text, "r", encoding="utf-8"):
        if (re.search(pales, line.upper()) != None):
            count += 1
    return count

print(has_pale(text))

def check_word(word):
    letter_Posicao_certa = 0
    letter_Posicao_errada = 0
    letter_faltante = 0

    correct = "PIANO"
    if(word == None or len(word) != len(correct)):
        return False
    
    for i in range(len(word)):
        if word[i] == correct[i]:
            letter_Posicao_certa += 1
            print(word[i], "esta na posicao certa")
        elif word[i] in correct:
            letter_Posicao_errada += 1
            print(word[i], "nao esta na posicao errada")
        else:
            letter_faltante += 1
            print(word[i], "nao esta na palavra")
    
    print(f"Letra faltante: {letter_faltante}")
    print(f"Posição certa: {letter_Posicao_certa}")
    print(f"Posição errada: {letter_Posicao_errada}")      
    
print(check_word("PLNIA"))

