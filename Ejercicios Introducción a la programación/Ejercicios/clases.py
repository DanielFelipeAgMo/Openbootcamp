#se crea la clase coche 
class coche:
    def __init__(self, num_puertas):
        self.num_puertas = num_puertas

    def incrementar_puertas(self, num_puertas_incrementar):
        self.num_puertas += num_puertas_incrementar

#Creamos el objeto mi coche de la clase coche
mi_coche = coche(1)
print(mi_coche.num_puertas) # 1

#Al nuevo coche le aumentamos el número de puertas
mi_coche.incrementar_puertas(1)
print(mi_coche.num_puertas) # 2