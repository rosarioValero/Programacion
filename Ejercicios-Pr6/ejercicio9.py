qq"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA6 - EJERCICIO 9
Escribe un programa que permita crear una lista de palabras y que, a continuación,
cree una segunda lista con las palabras de la primera,
pero sin palabras repetidas (el orden de las palabras
en la segunda lista no es importante). """

print("Dime cuántas palabras tiene la lista: ")
num=int(input())

if num <1:
    print("No es posible!")
else:
    lista=[]
    for i in range(num):
        print("Dime la palabra",str(i + 1) + ": ")
        pal=input()
        lista +=[pal]
    print("La lista creada es: ", lista)

    for i in range(len(lista)-1, -1, -1):
        if lista[i] in lista[:i]:
            del(lista[i])
    print("La lista sin repericiones es: ", lista)
