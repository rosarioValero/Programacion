"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA6 - EJERCICIO 4
Escribe un programa que permita crear una lista de palabras y que,
a continuación, pida una palabra y elimine esa palabra de la lista. """

print("Dime cuántas palabras tiene la lista: ")
num=int(input())

if num <1:
    print("No es posible!")
else:
    lista=[]
    for i in range(num):
        print("Dime la palabra:", str(i + 1) + ": ")
        palabra=input()
        lista +=[palabra]
    print("La lista creada es: ", lista)

    print("Dime la palabra: ")
    delete=input()
    for i in range(len(lista)-1, -1, -1):
        if lista[i] == delete:
            del(lista[i])
    print("La lista es ahora: ", lista)
