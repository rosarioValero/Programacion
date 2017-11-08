"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA6 - EJERCICIO 8
Escribe un programa que permita crear una lista de palabras y que, a continuación,
ordene la lista por orden alfabético. """

print("Dime cuántas palabras tiene la lista: ")
num=int(input())

if num <1:
    print("No es posible!")
else:
    lista=[]
    for i in range(num):
        print("Dime la palabra", str(i + 1) + ": ")
        pal=input()
        lista +=[pal]
    print("La lista creada es: ", lista)

    
    lista.sort()
    print("La lista inversa es: ",lista)
