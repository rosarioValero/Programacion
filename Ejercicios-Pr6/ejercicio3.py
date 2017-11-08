"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA6 - EJERCICIO 3
Escribe un programa que permita crear una lista de palabras y que,
a continuación, pida dos
palabras y sustituya la primera por la segunda en la lista."""

print("Dime cuántas palabras tiene la lista: ")
num = int(input())

if num <1:
    print("No posible!")
else:
    lista=[]
    for i in range(num):
        print("Díme la palabra", str(i + 1) + ": ")
        palabra=input()
        lista +=[palabra]
    print("La lista creada es: ", lista)

    print("Sustituir la palabra: ")
    buscar=input()
    print("por la palabra: ")
    sustituir=input()
    for i in range(len(lista)):
        if lista[i] == buscar:
            lista[i] = sustituir
    print("La lista es ahora: ", lista)

