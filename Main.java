public class Main {
    public static void main(String[] args) {
        // Uso del polimorfismo en tiempo de compilación (sobrecarga)
        Calculadora calculadora = new Calculadora();
        System.out.println("Suma de enteros: " + calculadora.sumar(5, 3));
        System.out.println("Suma de doubles: " + calculadora.sumar(5.5, 3.2));

        // Uso del polimorfismo en tiempo de ejecución (sobreescritura)
        Calculadora calculadoraAvanzada = new CalculadoraAvanzada();
        System.out.println("Suma usando calculadora avanzada: " + calculadoraAvanzada.sumar(10, 7));

        // Usando los métodos adicionales de CalculadoraAvanzada
        CalculadoraAvanzada calcAvanzada = new CalculadoraAvanzada();
        System.out.println("Multiplicación: " + calcAvanzada.multiplicar(4, 6));
        System.out.println("División: " + calcAvanzada.dividir(10, 2));
    }
}