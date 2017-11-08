"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA6 - EJERCICIO 6
Escribe un programa que permita crear una lista de palabras y que,
a continuación, cree una
segunda lista igual a la primera, pero al revés (no se trata de escribir
la lista al revés, sino de crear una lista distinta). """

print("Dime cuántas palabras tiene la lista: ")
num=int(input())

if num <1:
    print("No es posible!")
else:
    lista=[]
    for i in range(num):
        print("Dime la palabra: ", str(i + 1) + ": ")
        pal=input()
        lista +=[pal]
    print("La lista creada es: ", lista)

    alreves=[]
    for i in lista:
        alreves=[i] + alreves
    print("La lista inversa es: ", alreves)
