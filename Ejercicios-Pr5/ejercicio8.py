"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 8
Escriu un programa que et demani primer un nombre i després et demani nombres
fins a què la suma dels nombres introduïts coincideixi amb el nombre inicial.
El programa termina escribint la llista de nombres."""

print("Introduce el número limite")
num=int(input())

print("Introduce un valor")
num1=int(input())


lista=[]

while num1>num:
    print(num1,"es más grande.Introduce otro valor")
    num1=int(input())
num=num-num1
lista.append(num1)

while num>0:
    print("Introduce otro valor")
    num1=int(input())
    
    while num1>num:
        print(num1,"es demasiado grande.Introduce otro valor")
        num1=int(input())
    num=num-num1
    lista.append(num1)

print("El limite a superar es", num, ".La lista creada és", lista)
