<div align="center">
    <img width="25%" src="https://play-lh.googleusercontent.com/WVWBQ_vrWIgLJPtU-9O59VzaP4GS3Ns1IR6W2QajACWAEI7YoLUvmXjXFWSqLOfqF-Y">
    <h2>Corrigiendo examen programacion con Maximo</h2>
</div>

<div align="center">
    <a href="https://github.com/rconnolly2/Corrigiendo_examen_maximo/blob/main/LICENSE.txt">
      <img src="https://img.shields.io/badge/license-MIT-informational">
    </a>
</div>

<p align="center">
	<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
</p>
<div align="center">
	<img alt="GitHub last commit (by committer)" src="https://img.shields.io/github/last-commit/rconnolly2/Corrigiendo_examen_maximo/main">
</div>

Aqui explicare con pseudocodigo lo que hace cada funcion de las actividades situadas en la carpeta
actividades.


## Ejercicio 1

Crea una funcion que reciba un numero entero y que muestre en pantalla un numero binario, una cifra por linea.

```java
    // Metodo para convertir dec=>bin
    void decimalBinario(int n) {
        // creo un string vacio
        n_bin = "";

        // Mientras el numero sea mayor o igual a 1
        while (n >= 1) {
            // Añado resto a la cadena
            n_bin += n % 2;
            
            // Divido el numero por 2 para quitar numeros
            n = n / 2;
        }

        // Itero sobre el string para invertirlo
        for (int i = n_bin.length() - 1; i >= 0; i--) {
            // print cada letra
            print(n_bin.charAt(i));
        }
    }

```

## Ejercicio 2

Crea una funcion que reciba un numero binario y que muestre en pantalla un numero decimal.

```java
// Metodo para convertir un bin=>dec
public static void BinDec(int bin) {
    // creo variable para almacenar el resultado decimal
    int n_dec = 0;

    // creo variable para la posición del dígito binario
    int i = 0;

    // Mientras el numero binario sea mayor o igual a 1
    while (bin >= 1) {
        // Obtengo el último numero binario (resto de la division por 10)
        int ultimo_digito = bin % 10;

        // Añado numero decimal por 10 elevado a posicion
        n_dec += (Math.pow(2, i) * ultimo_digito);

        // Elimino el último dígito del bin
        bin = (bin / 10);

        // Incremento la posición del num bin
        i++;
    }

    // Imprimo resultado
    System.out.println(n_dec);
}
```

## Ejercicio 3

Crea una funcion que reciba un numero decimal y me devuelva un booleano si es par o impar.

```java
// Metodo para verificar si un numero es par
public static boolean esParell(int n) {
    // Si el resto de la division por 2 es igual a 0 es par sino es impar
    return n % 2 == 0;
}
```

## Ejercicio 4

Crea una funcion que reciba un numero decimal y me devuelva todos los pares del 0 al numero.

```java
// Metodo para imprimir los primeros numeros pares hasta el numero n
public static void primersNombresParells(int n) {
    print("Numeros pares: ");
    for (int i = 0; i < n; i++) {
        // Si el numero actual es par, imprimirlo
        if (esParell(i)) {
            print(i);
        }
    }
}
```

## Ejercicio 5

Crea una funcion que muestre un menu por pantalla y devuelva la opcion elegida.

```java
// Metodo para mostrar un menu y obtener la opcion seleccionada
public static int menu() {
    Scanner sc = new Scanner(System.in);

    print("Elige una de las siguientes opciones:");
    print("1. Decimal a binario");
    print("2. Binario a decimal");
    print("3. ¿Es par?");
    print("4. Calcular pares de 0 hasta n");
    print("0. Salir");

    return sc.nextInt();
}
```

## Ejercicio 6

Crea una funcion que implemente el menu y que si el usuario introduce un 0 se acaba el programa, si es una opcion invalida vuelve a preguntar, si es una opcion valida ejecuta las funcionea anteriores.

```java
// Metodo principal
public static void main(String[] args) {
    // creo un objeto Scanner
    Scanner sc = new Scanner(System.in);
    
    // creo variable para controlar bucle
    boolean prog_ejec = true;

    // creo variable para almacenar input
    int n = 0;

    // Bucle principal del programa
    while (prog_ejec) {
        // Muestro el menu y obtengo la opcion seleccionada
        int opcion = menu();

        // Verifico la opcion seleccionada
        switch (opcion) {
            case 0:
                // Salir del programa
                print("Programa terminado...");
                prog_ejec = false;
                break;

            case 1:
                // Convierto numero decimal a binario
                print("Numero decimal: ");
                n = sc.nextInt();
                decimalBinario(n);
                break;

            case 2:
                // Convierto numero binario a decimal
                print("Número binario: ");
                n = sc.nextInt();
                BinDec(n);
                break;

            case 3:
                // Numero es par?
                print("Dame un numero y te dire si es par: ");
                n = sc.nextInt();
                System.out.println(esParell(n));
                break;

            case 4:
                // Numeros pares de 0 hasta n
                print("Dame un numero y te mostrare los números pares del 0 al número: ");
                n = sc.nextInt();
                primersNombresParells(n);
                break;

            default:
                // Opciones no validas
                print("Opcion invalida. Por favor, intenta nuevamente...");
        }
    }
    
    // Fin del programa
    System.exit(0);
}
```

## Ejercicio 7

Crea 2 funciones para calcular el volumen de su cisterna cilindrica o cisterna rectangular.

```java
// Metodo para calcular el volumen de un cilindro
public static double volumCilindre(double radi, double longitud) {
    // Utilizo la formula del volumen del cilindro: π * radio^2 * longitud
    return Math.PI * Math.pow(radi, 2) * longitud;
}

// Metodo para calcular el volumen de un prisma rectangular
public static double volumPrismaRectangular(double costat1, double costat2, double costat3) {
    // Utilizo la formula del volumen del prisma rectangular: longitud * ancho * altura
    return costat1 * costat2 * costat3;
}

```

## Ejercicio 8

Crea en la funcion main un menu que pida tipo de carga luego los m2 requeridos y te dira cuantos viajes seran necesarios, si el usuario pone un tipo de carga invalido vuelve a preguntar.

```java
// Metodo principal
public static void main(String[] args) {
    // creo un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // creo una variable para el input
    int tipo_carga = 0;

    // Mientras la carga no sea 1 o 2 seguir pidiendo
    while (tipo_carga != 1 && tipo_carga != 2) {
        print("¿Que tipo de carga transportaras? 1. Liquidos 2. Solidos");
        tipo_carga = sc.nextInt();
        if (tipo_carga != 1 && tipo_carga != 2) {
            print("Tipo de carga no valido...");
        }
    }

    // Proceso tipo de carga seleccionado
    if (tipo_carga == 1) {
        // Liquidos (cilindro)
        print("¿Cuantos centimetros de radio tiene la cisterna?");
        // Pido al usuario los cm de radio de la cisterna

        double radio = sc.nextDouble();
        print("¿Cuantos centimetros de longitud tiene la cisterna?");
        // Pido al usuario la longitud de la cisterna

        double longitud = sc.nextDouble();
        print("¿Cuantos metros cubicos necesitas transportar?");
        // Pido al usuario los m2 requeridos

        double m3_necesarios = sc.nextDouble();

        // Calculo los m2 disponibles
        double m3_disponible = volumCilindre(radio, longitud) / 1000000;
        // Doy el resultado

        print("El camion tiene capacidad para: " + m3_disponible + " metros cubicos");
        print("Necesitaras hacer " + Math.round(m3_necesarios / m3_disponible) + " viajes");
    } else if (tipo_carga == 2) {
        // Solidos (prisma rectangular)
        print("Dame los 3 lados de la cisterna en cm: ");
        // Pido los lados al usuario

        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();
        double m3_disponible = volumPrismaRectangular(lado1, lado2, lado3) / 1000000;
        print("¿Cuantos metros cúbicos necesitas transportar?");
        // Pido al usuario los m2 requeridos

        double m3_necesarios = sc.nextDouble();
        // Doy el resultado
        
        print("El camion tiene capacidad para: " + m3_disponible + " metros cubicos");
        print("Necesitaras hacer " + Math.round(m3_necesarios / m3_disponible) + " viajes");
    }

    // Fin del programa
    System.exit(0);
}


```

<p align='center'><b>Made with ❤ by Robert Connolly</b></p>

