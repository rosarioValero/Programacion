"""Rosario Valero Miranda - 1DAW - PRACTICA4 - EJERCICIO 3
Escriu un programa que demani 2 nombres i escrigi la suma de senecers des del
primer nombre fins al segon."""

print("Introduce un número")
num = int(input())
print("Introduce otro número mayor que", num)
num2 = int(input())
suma = 0
for i in range(num,num2+1):
    suma = suma + i
    
