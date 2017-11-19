"""ROSARIO VALERO MIRANDA - 1º DAW - PRACTICA7 - EJERCICIO 6
Escribe un programa que lea una frase, y la pase como parámetro a un
procedimiento. El procedimiento contará el número de vocales (de cada una)
que aparecen, y lo imprimirá por pantalla"""

print("Escribe una frase")
frase=input()

def contar(frase):
    auxA=0
    auxE=0
    auxI=0
    auxO=0
    auxU=0
    for i in range(len(frase)):
        if frase[i] == 'a':
            auxA=auxA+1

        if frase[i] == 'e':
            auxE=auxE+1
            
        if frase[i] == 'i':
            auxI=auxI+1
            
        if frase[i] == 'o':
            auxO=auxO+1

        if frase[i] == 'u':
            auxU=auxU+1
            
    return "La vocal a aparece: " + str(auxA), "La vocal e aparece: " + str(auxE), "La vocal i aparece: " + str(auxI), "La vocal o aparece: " + str(auxO), "La vocal u aparece: " + str(auxU)
    
print(contar(frase))
