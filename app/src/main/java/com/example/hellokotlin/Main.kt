/*
   Esto es un comentario largo
 */
// Hola Mundo, esto es un comentario corto
fun main() {
    println("Hola,Kotlin!")

    // Variables

    /*
     * val ---> declara variables inmutables, cuyo valor asignado no puede cambiar una vez asignado.
     *
     * var ---> declara variables mutables, cuyo valor si puede ser modificado posteriormente.
     */
    //Tipo de datos:  cadena de texto(String)
    var myString = "gitana"

    myString = "gitano"

    println(myString)

    //myString = 5 Error --> da error ya que kotlin es un lenguaje de fuerte tipado por lo que si
    // la variable se inicializo como String esta variable no puede cambiar su tipo de dato a un numero entero


    var myString2 = "Esto es otra cadena de texto"

    println(myString2)
    //Tipo de datos: Numero Enteros(Int)
    var myInt = 10 //esto es una variable con el numero entero de 10
    myInt =
        myInt + 23 //Ahora variamos la variable myInt sumando la cuanto vale anteriormente y sumandole 23, quedara como resultado 33
    println(myInt)
    println(myInt - 3) //Ahora le restamos 3 a la variable myInt(la cual actualmente tiene el valor 33) lo que da como resultado 30
    //cabe aclarar que la variable sigue valiendo 33 ya que solo se esta ejecutando dentro del println la operación y no asignadole
    //el valor que da como resultado, por lo que sigue siendo 33.


    //Tipo de datos:  Decimales(Double)
    var myDouble = 6.5
    println(myDouble)

    // myDouble = 6 ---> Error!! al que querer reasignarle un valor numerico a la variable myDouble, este debe ser decimal no entero
    myDouble = 6.0
    println(myDouble)

    var myDouble2: Double =
        6.6  //esto es bueno  ya que al decir el tipo de dato de la variable, nos referimos a la reserva de memoria que ocupara esta variable y
    // al especificar el tipo de dato este ya es capaz de inferirse
    println(myDouble2)

    // Decimales --> (Float)
    var myFloat: Float = 6.6f
    //por recomendacion ya que kotlin es un lenguaje de fuerte tipado y como ya infiere el tipo de dato da un poco igual el tipado de dato de la variable


    //Tipo de datos: Booleanos

    var myBool = false
    myBool = true
    println(myBool)


    //Constantes: val


    val myConst = "Mi propiedad constante"
    // myConst = "Mi nueva propiedad constante" Error!


    //Control de flujo

    myInt = 13
    if(myInt == 11){ //primera condicion
        println("El valor es 11!")


    }else if(myInt == 15){ //segunda condicion o condicion intermedia
        println("\nEl valor es 15!")
    }


    else{ // en caso contrario
        println("\nEl valor es distinto de 11 y 15!")
    }


    //Control de flujo con operadores logicos &&, ||

    var marcaAuto = "Mitsubishi" //aqui podemos variar el valor
    var annoAuto = 2011 //aqui podemos variar el valor
    if(marcaAuto == "Nissan" && annoAuto == 2010){ //si se cumple ambas condiciones se ejectura el mensaje correspondiente
        println("El auto es de marca Nissan y su año es 2010")
    }else if(marcaAuto == "Nissan" || annoAuto == 2010){ // si no se cumple ninguna de las dos condiciones no se ejecutar este else if
        println("El auto es de marca Nissan o  es el de año 2010!")

    }else{
        println("El auto no es de marca nissan y tampoco es del año 2010!")

    }



    println("\nClasificador de  números")
    //comenzamos a ejercitar con este ejercicio

    println("Ingresa un número entero: ")
    val numero = readLine()?.toIntOrNull()

    println("\n----Resultados-----")
    if (numero == null){

        println("Error! debes ingresar un número entero valido")
        return

    }else if(numero > 0){
        println("el número es positivo!")

    }else if(numero < 0 ){
        println("el nùmero es negativo!")
    }else{
        println("el número es cero!")

    }

    if(numero == null){
        println("Error! debe ingresar un número entero valido!")

    }else if(numero % 2 == 0){
        println("El número es par")
    }else{
        println("El número es impar")
    }

    if (numero == null){
        println("Error! debe ingresar un número entero valido!")
    }else if(numero >= 1 && numero <=10){
        println("El $numero es Pequeño")

    }else if(numero >= 11 && numero <= 100){
        println("El $numero es Mediano")


    }else if(numero > 100){
        println("El $numero es Grande")
    }else if(numero < 0){
        println("El $numero es Negativo")
    }
    // Listas


    // <> --> este simbolo es para especificar el tipo de dato en este caso una lista  con Strings
    var myList = listOf<String>("Dama","Alfil","Caballo")
    println("\nMi lista: $myList") //se muestra nuestra lista
    //2 ejemplo: var myList = listOf("Dama","Alfil","Caballo") --> si le quitaramos el tipado <String>, esto funcionaria de igual forma
    //ya que kotlin sigue infiriendo el tipo de dato

    //Ahora accederemos a un elemento de la lista myList en este caso al segundo elemento

    println("\nSegundo elemento de la lista: ${myList[1]}")

    //Ahora si queremos añadir elemento a la lista debemos hacer lo sgte:

    //para que nuestra lista pueda permitir nuevos elementos debemos hacer que nuestra lista sea mutable

    val miLista = mutableListOf("Torre","Peón","Rey Blanco") // mutableListOf esta funcionnos permite crear una lista mutable con elementos iniciales o vacía.
    println("Mi segunda lista: $miLista")

    miLista.add("Rey Negro")
    println("Mi segunda lista con un elemento nuevo: $miLista") // el elemento añadido se fue al final de la lista

    //el hecho la variable miLista sea val, esta variable es constante por lo tanto no puedo reasignarle o cambiar, ej: miLista = mutableListOf() Error! ya que es una constante
    //no se puede reasignar




    //Sets


    // el set para empezar no es ordenado, es una estructura que es super agil,super rapida y optima pero no nos ordena los datos dentro de el
    //set se utiliza para guardar datos que nos da igual el orden y esto hara que funcione más rapido pero sin saber donde estan estos datos
    //tambien el set es para cuando no queremos dar soporte a datos repetitivos.


    var mySet = setOf("Torre","Peón","Rey Blanco","Peón")
    println(mySet) //aca se puede ver que no imprime el elemento final Peón ya que este se repite anteriormente dentro del set
    //basicamente los sets no permiten duplicados
}



    //Mapas

    val myMap = mutableMapOf()