# Task 1
## Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
* ### ***Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.***
* ### ***Если преобразование не удалось, программа выдаёт сообщение об ошибке***
* ### **Your input is not a float number. Please, try again.**
* ### **и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.**

# Task 2
## Напишите программу, которая вычисляет значение выражения intArray[8] / d, где intArray- массив целых чисел, а d - делитель.
## Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
## Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.

## Программа должна выдавать следующие ошибки:

### ***Если длина массива меньше 9:***
* It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.

### В этом случае, если массив имеет меньше 9 элементов, программа сообщает, что не удается вычислить выражение, так как в массиве нет 8-го элемента.

### ***Если d равно 0:***
* It's not possible to evaluate the expression - intArray[8] / d as d = 0.

### ***Если d равно 0, программа сообщает, что не удается вычислить выражение, так как деление на 0 невозможно.***

### ***Если условия не выполняются и программа успешно вычисляет результат, то выводится сообщение:***
* intArray[8] / d = {значение} / {значение} = {результат}

### Где {значение} заменяется на соответствующие значения.

## **Примеры входных данных и соответствующих сообщений об ошибках:**

###  ***Входные аргументы: 1 2 3*** 
* It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.

### ***Входные аргументы: 1 2 3 4 5 6 7 8 9 0***
* It's not possible to evaluate the expression - intArray[8] / d as d = 0.

### ***Входные аргументы: 1 2 3 4 5 6 7 8 9 10***
* intArray[8] / d = 9 / 10 = 0.9


# Task 3
## Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
* ### ***При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.***
* ### ***Если b равен нулю, программа должна вернуть результат равный нулю.***
* ### ***После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.***
* ### ***Если аргументы не переданы через командную строку, используйте значения по умолчанию.***


# Task 4
## Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
* ### ***если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением "Пустая строка введена.".***
* ### ***В противном случае программа должна возвращать сообщение***
* ### ***"Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.***