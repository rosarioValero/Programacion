"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA6 - EJERCICIO 7
Escribe un programa que permita crear dos listas de palabras y que,
a continuación, escriba las siguientes listas (en las que no
debe haber repeticiones):
• Lista de palabras que aparecen en las dos listas
• Lista de palabras que aparecen en la primera lista, pero no en la segunda
• Lista de palabras que aparecen en la segunda lista, pero no en la primera
• Lista de palabras que aparecen en ambas listas. """

print("Dime cuántas palabras tiene la primera lista: ")
num=int(input())

if num < 1:
    print("¡Imposible!")
else:
    lista=[]
    for i in range(num):
        print("Dime la palabra", str(i + 1) + ": ")
        pal=input()
        lista +=[pal]
    print("La primera lista es: ", lista)

    for i in range(len(lista)-1, -1, -1):
        if lista[i] in lista[:i]:
            del(lista[i])

            
    print("Dime cuántas palabras tiene la segunda lista: ")
    num2=int(input())

    if num2< 1:
        print("¡Imposible!")
    else:
        lista2=[]
        for i in range(num2):
            print("Dime la palabra", str(i + 1) + ": ")
            pal=input()
            lista2 +=[pal]
        print("La segunda lista es: ", lista2)

        for i in range(len(lista2)-1, -1, -1):
            if lista2[i] in lista2[:i]:
                del(lista2[i])


        comun=[]
        for i in lista:
            if i in lista2:
                comun +=[i]
        print("Palabras que aparecen en las dos listas: ", comun)

        soloLista=[]
        for i in lista:
            if i not in lista2:
                soloLista +=[i]
        print("Palabras que sólo aparecen en la primera lista: ", soloLista)

        soloLista2=[]
        for i in lista2:
            if i not in lista:
                soloLista2 +=[i]
        print("Palabras que sólo aparecen en la segunda lista: ", soloLista2)

        todas= comun + soloLista + soloLista2
        print("Todas las palabras: ", todas)
        
    
