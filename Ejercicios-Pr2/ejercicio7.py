#Ejercicio7: Fer un programa que demani un nombre de només 3 xifres a un usuari
#(per exemple serien vàlids 201,999 i 113 però no 1001,99, 1 o 23). Si l'usuari
#entra un nombre que no sigui de 3 xifres ha de donar un error

print("Introduce un número: ")
num = int(input())
if num<999:
    print("El número que has introducido es: ", num)
elif num>999:
    print("El número es erroneo")

