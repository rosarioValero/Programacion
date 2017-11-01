"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 2
Escriu un programa que te demani nombres i els guardi en una llista.
Per a terminar d'introduir nombres, simplement pitja Enter.
El programa termina escrivint la llista de nombres"""

print("Introduce un número")
num=int(input())

lista=[]

while num!="":
    lista.append(num)
    print("Introduce otro número")
    num=input()
print(lista)
