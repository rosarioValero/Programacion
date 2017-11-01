"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 6
Escriu un programa que demani primer dos nombres (màxim i mínim) i que després
te demani 2 nombres situats entre ells.
Per a terminar d'escriure nombres, escriu un nombre que no sigui
comprès entre els dos valors inicials. El programa termina escribint
la llista de nombres"""

print("Introduce un número")
num1=int(input())
lista=[]

print("Introduce otro número")
num2=int(input())

print("Introduce un numero entre", num1, "y", num2)
num3=int(input())

while num3<=num2 or num3<num1:
     print("Introduce un numero entre", num1, "y", num2)
     num3=input()
     lista.append(num1)
     
while num1>=num2:
    num1=num2
    print("Introduce otro número: ",num2)
    num2=int(input())
    
    while num1<=num3 and num2<=num3:
        print("Introduce un numero entre", num1, "y", num2)
        num3=int(input())
    lista.append(num1)

lista.pop()   
print(lista)
