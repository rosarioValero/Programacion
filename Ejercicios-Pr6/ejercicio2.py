"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA6 - EJERCICIO 2
Escribe un programa que permita crear una lista de palabras y que, a continuación,
pida una palabra y diga cuántas veces aparece esa palabra en la lista"""

print("Dime cuántas palabras tiene la lista: ")
num=int(input())

if num <1:
    print("No posible!")
else:
    lista=[]
    for i in range(num):
        print("Dígame la palabra", str(i + 1) + ": ")
        palabra = input()
        lista += [palabra]
    print("La lista creada es:", lista)

    print("Dime la palabra: ")
    buscar=input()
    cont = 0
    for i in lista:
        if i == buscar:
            cont+= 1;
    if cont == 0:
        print("La palabra '" + buscar + "' no aparece en la lista.")
    elif cont == 1:
        print("La palabra '" + buscar + "' aparece una vez en la lista.")
    else:
        print("La palabra '" + buscar + "' aparece", cont, "veces en la lista.")
