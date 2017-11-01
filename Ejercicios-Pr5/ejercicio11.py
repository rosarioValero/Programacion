"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA5 - EJERCICIO 11
Escriu un programa per a jugar a endivinar un nombre (l'ordinador “pensa”
el nombre i l'usuari l'ha d'endevinar). El programa comença demanant entre què
nombres està el nombre a endevinar,
s'”inventa” un nombre a l'atzar i després l'usuari va probant valors i
el programa va decidint si són massa grans o petits. Pista:
import random
import time
random.seed(time.time())
minim = int(raw_input("Vamor minim: "))
maxim = int(raw_input("Vamor maxim: "))
secret = random.randint(minim, maxim)  """

import random
import time

random.seed(time.time())

print("Valor minimo")
minim=input()

print("Valor máximo")
maximo=input()
print("A ver si adivinas un numero enteros entre", minim,"y", maximo)
secreto=int(input())

num=secreto
lista=[]
lista1=[]

while num<minim and num<maximo:
    print("Introduce un numero")
    num1=int((input())

    if num1<num:
        print("pequeño. Vuelve a intentarlo")
        num1=int(input())
    else num>num1:
        print("Demasiado grande. Vuelve a intentarlo")
        num1=int(input())
    lista.append(num)
    lista=[]
    
print("Correcto! Haz acertado lo has intentado",lista1)
