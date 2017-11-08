"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA6 - EJERCICIO 1
Escribe un programa que permita crear una lista de palabras.
Para ello, el programa
tiene que pedir un número y luego solicitar ese número de palabras para
crear la lista.Por último, el programa tiene que escribir la lista. """

print("Dime cuantas palabras tiene la lista: ")
num= int(input())

if num <1:
    print("No posible!")
else:
    list=[]
    for i in range(num):
        print("Dime la palabra: ")
        palabra=(input())
        i=i+1
        list +=[palabra]
    print("La lista creada es:", list)
