import java.io.IOException;
import java.util.Scanner;

import com.sofka.Taller1.*;
import com.sofka.Taller2.*;
import com.sofka.Taller3.*;
import com.sofka.Taller4.*;
public class Consola {
    private static int opcion;
    private static boolean seleccion = true;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        elegirTaller();
    }

    private static void elegirTaller() {
        do {
            System.out.println("¿Qué taller desea ver?");
            System.out.println("1. Taller 1: Variables e Impresiones.");
            System.out.println("2. Taller 2: Condicionales.");
            System.out.println("3. Taller 3: Ciclos.");
            System.out.println("4. Taller 4: Arreglos.");
            System.out.println("5. Salir de la aplicación.");
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    ejerciciosTaller1();
                    break;
                case 2:
                    ejerciciosTaller2();
                    break;
                case 3:
                    ejerciciosTaller3();
                    break;
                case 4:
                    ejerciciosTaller4();
                    break;
                case 5:
                    System.out.println("Salió de la aplicación.");
                    seleccion = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (seleccion != false);
    }
    private static void Taller1(){
        System.out.println("¿Qué ejercicio de el Taller 1 desea ver?");
        System.out.println("1. Ejercicio 1.");
        System.out.println("2. Ejercicio 2.");
        System.out.println("3. Ejercicio 3.");
        System.out.println("4. Ejercicio 4.");
        System.out.println("5. Ejercicio 5.");
        System.out.println("6. Volver al menú principal.");
        System.out.println("7. Salir de la aplicación.");
        opcion = input.nextInt();
        input.nextLine();
    }
    private static void ejerciciosTaller1(){
        do {
            Taller1();
            switch (opcion) {
                case 1:
                    NombreyApellidos1 persona1 = new NombreyApellidos1();
                    persona1.nombreCompleto();
                    break;
                case 2:
                    InformacionPersonal2 persona = new InformacionPersonal2();
                    persona.informacion();
                case 3:
                    InformacionFamiliar3 informacion1 = new InformacionFamiliar3();
                    informacion1.informacionpadres();
                    break;
                case 5:
                    Mascota5 mascota = new Mascota5();
                    mascota.informacionMascota();
                    break;
                case 6:
                    System.out.println("Regresó al menú principal.");
                    elegirTaller();
                    break;
                case 7:
                    System.out.println("Salió de la aplicación.");
                    seleccion = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (seleccion != false);
    }
    private static void Taller2(){
        System.out.println("¿Qué ejercicio de el Taller 2 desea ver?");
        System.out.println("1. Ejercicio 1.");
        System.out.println("2. Ejercicio 2.");
        System.out.println("3. Ejercicio 3.");
        System.out.println("4. Ejercicio 4.");
        System.out.println("5. Ejercicio 5.");
        System.out.println("6. Ejercicio 6.");
        System.out.println("7. Ejercicio 7.");
        System.out.println("8. Ejercicio 8.");
        System.out.println("9. Ejercicio 9.");
        System.out.println("10. Ejercicio 10.");
        System.out.println("11. Volver al menú principal.");
        System.out.println("12. Salir de la aplicación.");
        opcion = input.nextInt();
        input.nextLine();
    }

    private static void ejerciciosTaller2(){
        do {
            Taller2();
            switch (opcion) {
                case 1:
                    Edad1 edad_persona1 = new Edad1();
                    edad_persona1.mayorDeEdad();
                    break;
                case 2:
                    Edad2 edad_persona2 = new Edad2();
                    edad_persona2.menorDeEdad();
                    break;
                case 3:
                    InfoEdad3 persona1 = new InfoEdad3();
                    persona1.mayoroMenorDeEdad();
                    break;
                case 4:
                    AlquilarPelicula4 pelicula1 = new AlquilarPelicula4();
                    pelicula1.ejecutarPrograma();
                    break;
                case 5:
                    DrogueriaMiSalud5 compra1 = new DrogueriaMiSalud5();
                    compra1.ejecutarProgramaDrogueria();
                    break;
                case 6:
                    TallerMotos6 moto1 = new TallerMotos6();
                    moto1.servicios();
                    break;
                case 7:
                    IndiceDeMasaCorporal7 persona_imc1 = new IndiceDeMasaCorporal7();
                    persona_imc1.rango();
                    break;
                case 8:
                    Pasteleria8 venta1 = new Pasteleria8();
                    venta1.ejecutarPrograma8();
                    break;
                case 9:
                    AreaFiguras9 figura1 = new AreaFiguras9();
                    figura1.seleccionFigura();
                    break;
                case 10:
                    Banco10 cuenta1 = new Banco10();
                    cuenta1.seleccionOpcion();
                    break;
                case 11:
                    System.out.println("Regresó al menú principal.");
                    elegirTaller();
                    break;
                case 12:
                    System.out.println("Salió de la aplicación.");
                    seleccion = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (seleccion != false);
    }

    private static void Taller3(){
        System.out.println("¿Qué ejercicio de el Taller 3 desea ver?");
        System.out.println("1. Ejercicio 1.");
        System.out.println("2. Ejercicio 2.");
        System.out.println("3. Ejercicio 3.");
        System.out.println("4. Ejercicio 4.");
        System.out.println("5. Ejercicio 5.");
        System.out.println("6. Ejercicio 6.");
        System.out.println("7. Ejercicio 7.");
        System.out.println("8. Ejercicio 8.");
        System.out.println("9. Volver al menú principal.");
        System.out.println("10. Salir de la aplicación.");
        opcion = input.nextInt();
        input.nextLine();
    }

    private static void ejerciciosTaller3(){
        do {
            Taller3();
            switch (opcion) {
                case 1:
                    Figura1 figura = new Figura1();
                    figura.mostrarFigura1();
                    break;
                case 2:
                    Figura2 figura2 = new Figura2();
                    figura2.mostrarFigura2();
                    break;
                case 3:
                    Figura3 figura3 = new Figura3();
                    figura3.mostrarFigura3();
                    break;
                case 4:
                    Multiplicacion4 multiplicacion1 = new Multiplicacion4();
                    multiplicacion1.TablaMultiplicar();
                    break;
                case 5:
                    Menu5 menu_usuario1 = new Menu5();
                    menu_usuario1.mostrarMenu();
                    break;
                case 6:
                    Contactos6 contacto = new Contactos6();
                    contacto.contactos();
                    break;
                case 7:
                    Parqueadero7 vehiculo1 = new Parqueadero7();
                    vehiculo1.vehiculosEstacionados();
                    break;
                case 8:
                    EscuelaDeConduccion8 curso1 = new EscuelaDeConduccion8();
                    curso1.ejecutarPrograma();
                    break;
                case 9:
                    System.out.println("Regresó al menú principal.");
                    elegirTaller();
                    break;
                case 10:
                    System.out.println("Salió de la aplicación.");
                    seleccion = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (seleccion != false);
    }

    private static void Taller4(){
        System.out.println("¿Qué ejercicio de el Taller 4 desea ver?");
        System.out.println("1. Ejercicio 1.");
        System.out.println("2. Ejercicio 2.");
        System.out.println("3. Ejercicio 3.");
        System.out.println("4. Ejercicio 4.");
        System.out.println("5. Ejercicio 5.");
        System.out.println("6. Volver al menú principal.");
        opcion = input.nextInt();
        input.nextLine();
    }
    private static void ejerciciosTaller4(){
        do {
            Taller4();
            switch (opcion){
                case 1:
                    Vector1 vector = new Vector1();
                    vector.imprimirIndice();
                    break;
                case 2:
                    Arreglo2 arreglo1 = new Arreglo2();
                    arreglo1.numerosParesEImpares();
                    break;
                case 3:
                    NumerosPrimos3 primos = new NumerosPrimos3();
                    primos.imprimirNumerosPrimos();
                    break;
                case 4:
                    MatrizBidimensional4 matriz1 = new MatrizBidimensional4();
                    matriz1.imprimirMatrices();
                    break;
                case 5:
                    TablaMultiplicar5 tabla = new TablaMultiplicar5();
                    tabla.mostrarTabladeMultiplicar();
                    break;
                case 6:
                    System.out.println("Regresó al menú principal.");
                    elegirTaller();
                    break;
                case 7:
                    System.out.println("Salió de la aplicación.");
                    seleccion = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (seleccion != false);

    }
}

