"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA7 - EJERCICIO 9
Escribe un programa que pida dos palabras las pase como parámetro a un
procedimiento y diga si riman o no. Si coinciden las tres últimas letras
tiene que decir que riman.
Si coinciden sólo las dos últimas tiene que decir que riman un poco y si no,
que no riman. """

def pide_palabras():
    print("Dime una palabra")
    palabra1=input()
    return palabra1


def pide_segunda_pal():
    print("Dime otra palabra")
    palabra2=input()
    return palabra2

def palabras_mastres(palabra1,palabra2):
    aux=False
    if len(palabra1) < 4 or len(palabra2) < 4:
        aux=True
    return aux

def palabras_riman(palabra1,palabra2):
    auz=False
    if palabra1[-3:] == palabra2[-3:]:
        aux=True
    return aux
        
def riman_poco(palabra1,palabra2):
    aux=False
    if palabra1[-2:] == palabra2[-2:]:
        aux=True
    return aux

def imprimir():
    if palabras_mastres(texto, texto1):
        print("Tu palabra tiene menos de 4 letras")
    elif palabras_riman(texto,texto1):
        print("Las palabras riman")
    elif riman_poco(texto, texto1):
        print("Las palabras riman poco")
    else:
        print("Las palabras no riman")

        
texto=pide_palabras()
texto1=pide_segunda_pal()
texto2=palabras_mastres(texto, texto1)
texto3=palabras_riman(texto, texto1)
texto4=riman_poco(texto, texto1)
print(imprimir())
         
