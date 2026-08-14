def is_anagrama(s1, s2):
    return sorted(s1) == sorted(s2)
    
def reverse_word(s):
    return "".join(reversed(s))

def is_palindrome(s):
    reverse = reverse_word(s)
    return s == reverse

def reverse_sencence(sentence):
    words = sentence.split()
    reversed_sentence = " ".join(reversed(words))
    return reversed_sentence.capitalize()

def total_length(lista_words):
    total = 0
    for word in lista_words:
        total += len(word)
    return total

def tests_cap_9():
    print("Iniciando os testes do capitulo 9...")
    # 5 testes para is_anagrama
    print("5 testes para is_anagrama")
    print(is_anagrama("listen", "silent") == True)  # True
    print(is_anagrama("python", "java") == False)  # False
    print(is_anagrama("evil", "vile") == True)  # True
    print(is_anagrama("hello", "world") == False)  # False
    print(is_anagrama("cinema", "iceman") == True)  # True

    # 5 testes para is_palindrome
    print("5 testes para is_palindrome")
    print(is_palindrome("racecar") == True)  # True
    print(is_palindrome("hello") == False)  # False
    print(is_palindrome("madam") == True)  # True
    print(is_palindrome("step on no pets") == True)  # True
    print(is_palindrome("python") == False)  # False)

    # 3 testes para reverse_word
    print("3 testes para reverse_word")
    print(reverse_word("hello") == "olleh")  # True
    print(reverse_word("python") == "nohtyp")  # True
    print(reverse_word("world") == "dlrow")  # True

    # 3 testes para reverse_sencence
    print("3 testes para reverse_sencence")
    print(reverse_sencence("Hello word") == "Word hello")  # True
    print(reverse_sencence("Python programming") == "Programming python")
    print(reverse_sencence("Java é bem complicado") == "Complicado bem é java")

    # 1 teste para total_length
    print("1 teste para total_length")
    words_list = open("texto.txt", "r", encoding="utf-8").read()
    words = list(words_list)
    print(total_length(words) == 75175)  # True

    print("Todos os testes do capitulo 9 foram concluídos.")

def value_count_consi(string):
    counter = {}
    for letter in string:
       counter[letter] = counter.get(letter, 0) + 1
    return counter

def has_duplicate(lst):
    counter = value_count_consi(lst)
    for count in counter.values():
        if count > 1:
            return True
    return False

def find_repeats(dic):
    repeats = []
    for key, value in dic.items():
        if value > 1:
            repeats.append(key)
    return repeats

def add_counters(string1, string2):
    counter1 = value_count_consi(string1)
    counter2 = value_count_consi(string2)
    result = {}

    for key in counter1.keys():
        result[key] = counter1.get(key, 0)

    for key in counter2.keys():
        if key in result:
            result[key] += counter2[key]
        else:
            result[key] = counter2[key]
    
    return result

def is_interlocking(word1, word2, interlock_word):
    oneWord = interlock_word[::2]  
    twoWord = interlock_word[1::2]
    return oneWord == word1 and twoWord == word2
    

def tests_cap_10():
    print("Iniciando os testes do capitulo 10...")
    print("5 testes para value_count_consi")
    print(value_count_consi("hello") == {'h': 1, 'e': 1, 'l': 2, 'o': 1})  # True
    print(value_count_consi("python") == {'p': 1, 'y': 1, 't': 1, 'h': 1, 'o': 1, 'n': 1})  # True
    print(value_count_consi("world") == {'w': 1, 'o': 1, 'r': 1, 'l': 1, 'd': 1})  # True
    print(value_count_consi("aabbcc") == {'a': 2, 'b': 2, 'c': 2})  # True
    print(value_count_consi("") == {})  # True

    print("5 testes para has_duplicate")
    print(has_duplicate([1, 2, 3, 4, 5]) == False)  # True
    print(has_duplicate([1, 2, 3, 4, 5, 1]) == True)  # True
    print(has_duplicate(['a', 'b', 'c', 'd']) == False)  # True
    print(has_duplicate(['a', 'b', 'c', 'a']) == True)  # True
    print(has_duplicate([]) == False)  # True

    print("3 testes para find_repeats")
    print(find_repeats({'a': 2, 'b': 1, 'c': 2}) == ['a', 'c'])  # True
    print(find_repeats({'a': 1, 'b': 2, 'c': 1}) == ['b'])  # True
    print(find_repeats({}) == [])  # True

    print("3 testes para add_counters")
    print(add_counters("hello", "world") == {'h': 1, 'e': 1, 'l': 3, 'o': 2, 'w': 1, 'r': 1, 'd': 1})  # True
    print(add_counters("python", "java") == {'p': 1, 'y': 1, 't': 1, 'h': 1, 'o': 1, 'n': 1, 'j': 1, 'a': 2, 'v': 1})  # True
    print(add_counters("aabbcc", "abc") == {'a': 3, 'b': 3, 'c': 3})  # True

    print("3 testes para is_interlocking")
    print(is_interlocking("abc", "def", "adbecf") == True) # True
    print(is_interlocking("hello", "world", "hweolrllod") == True) # True
    print(is_interlocking("python", "java", "pjyavthon") == False) # True

def tup_in_list(list1, lst, additional_element):
    tuple1 = tuple()
    tuple1 = (list1, lst)
    list1.append(additional_element)
    return tuple1

def shift_word(word, num):
    letters = 'abcdefghijklmnopqrstuvwxyz'
    numbers = range(len(letters))
    letter_map = dict(zip(letters, numbers))
    shifted_word = ""
    for letter in word:
        if letter in letter_map:
            index = (letter_map[letter] + num) % len(letters)
            shifted_word += letters[index]
    return shifted_word

def most_freq_letters(string):
    counter = value_count_consi(string)
    counter = dict(sorted(counter.items(), key=lambda item: item[1], reverse=True))
    return counter

def tests_cap_11():
    print("Iniciando os testes do capitulo 11...")
    # Adicione aqui os testes para o capítulo 11
    print("3 testes para tup_in_list, enviando 2 listas e retornando uma tupla com listas modificaveis")
    print(tup_in_list([1, 2, 3], [4, 5, 6], 80) == ([1, 2, 3, 80], [4, 5, 6]))  # True
    print(tup_in_list(['a', 'b'], ['c', 'd'], 'e') == (['a', 'b', 'e'], ['c', 'd']))  # True
    print(tup_in_list([], [], 10) == ([10], []))  # True

    print("3 testes para shift_word, enviando uma palavra e um numero para deslocar a letra")
    print(shift_word("abc", 1) == "bcd")  # True
    print(shift_word("xyz", 3) == "abc")  # True
    print(shift_word("cheer", 7) == "jolly") # True

    print("3 testes para most_freq_letters, enviando uma palavra e retornando um dicionario com as letras mais frequentes")
    print(most_freq_letters("hello") == {'h': 1, 'e': 1, 'o': 1, 'l': 2})  # True
    print(most_freq_letters("aabbcc") == {'a': 2, 'b': 2, 'c': 2})  # True
    print(most_freq_letters("pythonnn") == {'p': 1, 'y': 1, 't': 1, 'h': 1, 'o': 1, 'n': 3})  # True

if __name__ == "__main__":
    tests_cap_9()
    tests_cap_10()  
    tests_cap_11()