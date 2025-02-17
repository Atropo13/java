import random

def ordenador_decide_jugada():
    ''' 
    Elige aleatoriamente entre piedra, papel o tijeras y devuelve la elección.     
    '''
    opciones = ["piedra", "papel", "tijeras"]
    res = random.choice(opciones)
    return res
     
def usuario_decide_jugada():
    ''' 
    Pide al usuario que elija entre piedra, papel o tijeras y devuelve la elección.     
    '''
    eleccion_usuario = input("Elige piedra, papel o tijeras: ")

    while eleccion_usuario not in ["piedra", "papel", "tijeras"]:
        eleccion_usuario = input("Opción no válida, por favor elige piedra, papel o tijeras: ")
    return eleccion_usuario


def determina_ganador(jugada_usuario, jugada_ordenador):
    if jugada_usuario == jugada_ordenador:
        return "Empate"
    elif jugada_usuario == "piedra" and jugada_ordenador == "tijeras":
        return "Ganaste"
    elif jugada_usuario == "tijeras" and jugada_ordenador == "papel":
        return "Ganaste"
    elif  jugada_usuario == "papel" and jugada_ordenador == "piedra":
        return "Ganaste"
    else:
        return "Perdiste"
    

    




def torneo():
    puntuacion =+ 0 + puntuacion_final
    eleccion_ordenador = ordenador_decide_jugada()
    print(eleccion_ordenador)
    eleccion_jugador = usuario_decide_jugada()
    victoria = determina_ganador(eleccion_jugador, eleccion_ordenador)
    print(victoria)
    if victoria == "Ganaste" :
        puntuacion =+ 1 + puntuacion
    elif victoria == "Perdiste":
        puntuacion =- 1 + puntuacion
    
    return puntuacion

if __name__ == "__main__":
    puntuacion_final =+   0
    while puntuacion_final < 3 :
     puntuacion_final = torneo() 
     print(puntuacion_final)
    if puntuacion_final == 3:
        print("has ganado la partida")