"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 7
Escriu un programa que demani un nombre (límit) i després et demani nombres
fins a què la suma dels nombres introduits superi un nombre inicial.
El programa termina escribint la llista de nombres"""

print("Introduce el número limite")
num=int(input())

print("Introduce un valor")
num1=int(input())

num2=num1
lista=[num1]

while num>num2:
    print("Introduce otro valor")
    num1=int(input())
    num2=num2+num1
    lista.append(num1)

lista.pop()   
print("El limite a superar es", num, ".La lista creada és", lista)

