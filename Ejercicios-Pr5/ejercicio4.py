"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 4
Escriu un programa que te demani dos nombres, de manera que el segon
sigui major que el primer.
El programa termina escrivint els dos nombre tal i com es demana. """

print("Introduce un número")
num1=int(input())
lista=[num1]

print("Introduce otro número")
num2=int(input())

while num1<=num2:
    print(num2, "es menor.Introduce otro número:")
    num2=int(input())

lista.append(num2)
print(lista)

