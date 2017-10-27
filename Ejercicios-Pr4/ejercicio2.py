""""Rosario Valero Miranda - 1DAW - PRACTICA4 - EJERCICIO 2
Escriu un programa que demani dos nombres i escrigui quins nombres son parells i quins són
senars (=”impares”) des del primer fins al segon."""

print("Introduce un número")
num = int(input())
print("Introduce un segundo número")
num2 = int(input())

for i in range(num,num2+1):
    if i%2 == 0:
        print(i, "es par")
    else:
        print(i, "es impar")
