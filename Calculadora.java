// Clase base Calculadora con sobrecarga de métodos (polimorfismo en tiempo de compilación)
class Calculadora {
    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para sumar dos números de punto flotante
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos enteros
    public int restar(int a, int b) {
        return a - b;
    }

    // Método para restar dos números de punto flotante
    public double restar(double a, double b) {
        return a - b;
    }
}

// Clase CalculadoraAvanzada que hereda de Calculadora y sobrescribe un método (polimorfismo en tiempo de ejecución)
class CalculadoraAvanzada extends Calculadora {
    // Sobrescritura del método sumar para manejar la suma de tres números enteros
    @Override
    public int sumar(int a, int b) {
        System.out.println("Usando la calculadora avanzada para sumar enteros");
        return super.sumar(a, b);
    }

    // Método adicional para multiplicar dos números enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método adicional para dividir dos números enteros
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

// Clase principal para probar la calculadora

