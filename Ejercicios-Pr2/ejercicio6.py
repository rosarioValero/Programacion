#Ejercicio6: Fer un programa que demani un nombre de com a máxim 3 xifres a un usuari
#(per exemple serien vàlids 1,99 i 213 però no 1001). Si l'usuari entra un nombre
# de més 3 xifres ha de donar error.

print("Introduce un número de tres cifras: ")
num = int(input())
if num<999:
    print("El número introducido es: ", num)
else:
    print("Número no es correcto, es de más de tres cifras")
