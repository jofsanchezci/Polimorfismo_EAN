
# Polimorfismo en Programación Orientada a Objetos (POO)

El polimorfismo es uno de los pilares fundamentales de la Programación Orientada a Objetos (POO). Se refiere a la capacidad de una función, método o un objeto de comportarse de diferentes maneras según el contexto en el que se utilice.

En términos simples, el polimorfismo permite que una misma interfaz o función pueda tener diferentes implementaciones. Existen dos tipos principales de polimorfismo en POO:

## 1. Polimorfismo en tiempo de compilación (sobrecarga)

También conocido como "sobrecarga de métodos", se refiere a la capacidad de definir múltiples métodos con el mismo nombre pero diferentes firmas (es decir, diferentes parámetros). El compilador decide cuál método utilizar según los argumentos que se pasen al momento de la llamada.

```java
class Calculadora {
    int sumar(int a, int b) {
        return a + b;
    }

    double sumar(double a, double b) {
        return a + b;
    }
}
```

En este ejemplo, el método `sumar` está sobrecargado con dos versiones: una que trabaja con enteros y otra que trabaja con números de punto flotante.

## 2. Polimorfismo en tiempo de ejecución (sobreescritura)

Se produce cuando una subclase proporciona una implementación específica de un método que ya está definido en su superclase. Esto permite que una referencia a una superclase pueda ejecutar diferentes versiones del método, dependiendo del objeto al que se esté haciendo referencia en tiempo de ejecución.

```java
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla");
    }
}
```

En este ejemplo, el método `hacerSonido` se comporta de manera diferente dependiendo del tipo de objeto (Perro o Gato), aunque se llame desde una referencia de tipo `Animal`.

## Beneficios del polimorfismo

El polimorfismo mejora la flexibilidad y la extensibilidad del código, permitiendo que diferentes tipos de objetos puedan ser tratados de manera uniforme mediante una interfaz común. Esto es útil para escribir código más genérico y modular.


# Implementación de una Calculadora usando Polimorfismo en Java

Este proyecto demuestra el uso del polimorfismo en Java a través de una implementación de una calculadora. Se utilizan tanto el polimorfismo en tiempo de compilación (sobrecarga de métodos) como el polimorfismo en tiempo de ejecución (sobreescritura).

## Implementación de la Calculadora en Java

```java
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
```

## Descripción de la Implementación

1. **Calculadora:** Esta es la clase base que implementa métodos para la suma y resta de enteros y doubles. Se utiliza la sobrecarga de métodos para definir versiones diferentes de `sumar` y `restar`, lo que demuestra el polimorfismo en tiempo de compilación.

2. **CalculadoraAvanzada:** Esta clase extiende la clase `Calculadora` y sobrescribe el método `sumar`. También añade métodos adicionales para la multiplicación y división, proporcionando una funcionalidad ampliada.

3. **Main:** En la clase principal, se muestra cómo se utiliza tanto el polimorfismo en tiempo de compilación como el de tiempo de ejecución. Se crea una instancia de `Calculadora` y se llama a los métodos sobrecargados, y se muestra el uso de la sobrescritura con una instancia de `CalculadoraAvanzada`.

## Beneficios del Polimorfismo

El polimorfismo mejora la flexibilidad y la extensibilidad del código, permitiendo que diferentes tipos de objetos puedan ser tratados de manera uniforme mediante una interfaz común. Esto es útil para escribir código más genérico y modular.

