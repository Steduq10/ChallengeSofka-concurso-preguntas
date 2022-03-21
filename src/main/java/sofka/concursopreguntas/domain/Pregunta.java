package sofka.concursopreguntas.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pregunta {
    static List<String> preguntas1 = Arrays.asList(
            "MySQL es una base de datos de tipo...\n"
                    + "A: Relacional\n"
                    + "B: No-Relacional\n"
                    + "C: Ninguna de las anteriores\n"
                    + "D: A y B\n",


            "Una abstracción es...\n"
                    + "A: Es una herencia de una clase maestra\n"
                    + "B: Es una herencia de multiples comportamientos\n"
                    + "C: Es una implementación de una interfaz\n"
                    + "D: Es una herencia de una clase abstracta",
            "Qué ciclo de control usamos para iterar hasta 1000?\n"
                    + "A: foreach(1:1000){}\n"
                    + "B: for(i=0,i<999){}\n"
                    + "C: for(i=1,i<=1000,i++){}\n"
                    + "D: for(i=0,i<999,j++){}",
            "Un IDE conocido es...\n"
                    + "A: Netbeans\n"
                    + "B: Visual Studio Code\n"
                    + "C: Notepad\n"
                    + "D: World",
            "Cuando hablamos de python, hablamos de un lenguaje...\n"
                    + "A: Compilado\n"
                    + "B: No compilado\n"
                    + "C: Interpretados\n"
                    + "D: No interpretados"

    );
    static List<String> preguntas2 = Arrays.asList(
            "Cuando hablamos de java, hablamos de un lenguaje...\n"
                    + "A: Compilado\n"
                    + "B: No compilado\n"
                    + "C: Interpretados\n"
                    + "D: No interpretado",
            "Con java ¿qué paradigmas puede trabajar?\n"
                    + "A: Programación orientada a objetos\n"
                    + "B: Programación estructurada\n"
                    + "C: Programación funcional\n"
                    + "D: Programación orientada a etiquetas",
            "nodejs es un framework o tecnologia para...\n"
                    + "A: Python\n"
                    + "B: Javascript\n"
                    + "C: Java\n"
                    + "D: SQL",
            "Cuando hablamos de un backend developer, nos referimos a...\n"
                    + "A: Un perfil enfocado a la capa de presentación\n"
                    + "B: Un perfil mas de gestión de datos\n"
                    + "C: Un perfil orientado a los servidores\n"
                    + "D: Un perfil mas administrativo",
            "Un modelo Entidad Relación (MER) nos referimos a...\n"
                    + "A: Clases relacionadas\n"
                    + "B: Entidades de datos relacionadas\n"
                    + "C: Objetos relacionados\n"
                    + "D: Entidades de clases relacionados"
            );
    static List<String> preguntas3 = Arrays.asList(

            "Cuando hablamos de un frontend developer, nos referimos a...\n"
                    + "A: Un perfil que se dedica a los elementos visuales como la UI\n"
                    + "B: Un perfil que solo se dedica a trabajar HTML+CSS+Javascript\n"
                    + "C: Un perfil que se orientas tanto el frontend como el backend\n"
                    + "D: Ninguna de las anteriores",
            "Que combinaciones de join podemos hacer? para una base de datos relacional...\n"
                    + "A: join, add joins, merge join\n"
                    + "B: join reverse, join combination, inner joint\n"
                    + "C: inner, full, left y right\n"
                    + "D: Ninguna de las anteriores",
            "Todas las tablas de una base de datos relacional deberia tener...\n"
                    + "A: Llaves de partición\n"
                    + "B: Llaves primarias\n"
                    + "C: Llaves compuestas\n"
                    + "D: LLaves foraneas",
            "Una de las buenas practicas de programación es poder crear código mas...\n"
                    + "A: fácil de ejecutar\n"
                    + "B: fácil de transportar\n"
                    + "C: fácil de mantener\n"
                    + "D: fácil de probar",
            "Qué tipos de tipos de base de datos existen\n"
                    + "A: Referenciales\n"
                    + "B: Relacionales\n"
                    + "C: No-relacionales\n"
                    + "D: No-referenciales"
    );

    static List<String> preguntas4 = Arrays.asList(

            "Una caracteristica de los métodos estáticos es...\n"
                    + "A: Comparte el mismo espacio de memoria\n"
                    + "B: No necesita nombrar la clase\n"
                    + "C: Depende de que la clase se final\n"
                    + "D: No requiere tener una instancia para poder acceder",
            "Una clase final no permite...\n"
                    + "A: Crear una instancia\n"
                    + "B: Cambiar los estados a la interna de la clase\n"
                    + "C: Usar los métodos de la clase\n"
                    + "D: Extender o heredar",
            "En javascript ¿qué objeto es clave para poder acceder a las elementos del navegador...\n"
                    + "A: Windows\n"
                    + "B: elements\n"
                    + "C: document\n"
                    + "D: objects",
            "La diferencia mas clara del do-while y el while es...\n"
                    + "A: El while evalua primero la condicion y luego itera\n"
                    + "B: El do-while evalua primero la condicion y luego la itera\n"
                    + "C: El do-while ejecuta la instrucción y luego evalua la expresión booleana\n"
                    + "D: El while ejecuta la instrucción y luego evalua la expresión booleana",
            "Un comando que se usa para poder subir cambios a un repositorio de git 1/1 de manera remoto es...\n"
                    + "A: commit\n"
                    + "B: publish\n"
                    + "C: push\n"
                    + "D: upload"
    );
    static List<String> preguntas5 = Arrays.asList(

            "Para una clase que tenga métodos get y set pero con atributos privados,¿qué pilar de la programación se está aplicando?\n"
                    + "A: Programación funcional\n"
                    + "B: Evita efectos secundarios\n"
                    + "C: Encapsulamiento\n"
                    + "D: Abstracciones por métodos",
            "¿Qué es una base de datos?\n"
                    + "A: Es un servidor que permite persistir información o datos concretos\n"
                    + "B: Es un grupo de datos efimeros\n"
                    + "C: Es una colección de datos o información concreta\n"
                    + "D: un repositorio de datos",
            "Que lenguajes usamos más al lado del navegador?\n"
                    + "A: Java\n"
                    + "B: JavaScript\n"
                    + "C: CSS\n"
                    + "D: HTML",
            "El servidor es un proveedor de información y el cliente es un consumidor de información, nos referimos a...\n"
                    + "A: Cliente-Servidor\n"
                    + "B: Servidor-Servidor\n"
                    + "C: Servidor-Cliente\n"
                    + "D: Servidor",
            "Qué es un algoritmo\n"
                    + "A: Una estructura programada orientada a una sintaxis\n"
                    + "B: Una función matemática\n"
                    + "C: Instrucciones lógicas con un propósito especifico\n"
                    + "D: Código fuente"
    );


    public static void main(String[] args) {
        for (String items: preguntas1){
            System.out.println(items);
        }
    }
}
