# Clase base Calculadora con métodos básicos
class Calculadora:
    def sumar(self, a, b):
        return a + b

    def restar(self, a, b):
        return a - b

# Clase CalculadoraAvanzada que hereda de Calculadora y sobrescribe métodos
class CalculadoraAvanzada(Calculadora):
    def sumar(self, a, b):
        print("Usando la calculadora avanzada para sumar")
        return super().sumar(a, b)

    def multiplicar(self, a, b):
        return a * b

    def dividir(self, a, b):
        if b == 0:
            raise ValueError("No se puede dividir por cero")
        return a / b

# Función principal para probar la calculadora
def main():
    # Uso del polimorfismo en tiempo de ejecución con la clase base Calculadora
    calculadora = Calculadora()
    print("Suma de enteros:", calculadora.sumar(5, 3))
    print("Resta de enteros:", calculadora.restar(8, 2))

    # Uso del polimorfismo en tiempo de ejecución con la clase derivada CalculadoraAvanzada
    calculadora_avanzada = CalculadoraAvanzada()
    print("Suma usando calculadora avanzada:", calculadora_avanzada.sumar(10, 7))
    print("Multiplicación:", calculadora_avanzada.multiplicar(4, 6))
    print("División:", calculadora_avanzada.dividir(10, 2))

if __name__ == "__main__":
    main()
