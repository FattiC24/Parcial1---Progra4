package com.example.parcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Ejercicio1()
        Ejercicio2()
        Ejercicio3()
    }
    private fun Ejercicio1() {
        var color = "Morado"

        if (color == "Negro"){
            println("El color es $color")
        }
        else if (color == "Verde"){
            println("El color es $color")
        }
        else if (color == "Rosa"){
            println("El color es $color")
        }
        else if (color == "Naranja"){
            println("El color es $color")
        }
        else if (color == "Gris"){
            println("El color es $color")
        }
        else{
            println("El color seleccionado no existe" )
        }



    }
    private fun Ejercicio2() {
        val tiposdecomida = "Pasteles"
        when (tiposdecomida) {
            "Pupusas" -> {
                println("Esta comida es de El Salvador")
            }
            "Enchiladas" -> {
                println("Esta comida es de El Salvador")
            }
            "Elotes Locos" -> {
                println("Esta comida es de El Salvador")
            }
            "Pizza" -> {
                println("Esta comida es de Italia")
            }
            "Bratwurst" -> {
                println("Esta comida es de Alemania")
            }
            "Papa a la huancaína" -> {
                println("Esta comida es de Peru")
            }
            "Tacos" -> {
                println("Esta comida es de Mexico")
            }
            "Mole" -> {
                println("Esta comida es de Mexico")
            }
            "Pozole" -> {
                println("Esta comida es de Mexico")
            }
            "Sushi" -> {
                println("Esta comida es de Japon")
            }
            else -> {
                println("No se conoce el tipo de comida")
            }
        }
        //when arupacion
        when (tiposdecomida) {
            "Pupusas", "Enchiladas", "Pozole" -> {
                println("Estas comidas son de Mexico")
            }
            "Tacos", "Mole", "Elotes locos" -> {
                println("Estas comidas son de El Salvador")
            }
            else -> {
                println("El pais de la comida seleccionada no existe")
            }


        }
    }
    private fun Ejercicio3() {
        //Imprimiendo valores X de 1 en 1
        for (x in 0..10){
            println(x)
        }

        //imprimiendo valores X de 2 en 2
        for (x in 0..20 step 2){
            println(x)
        }

        //imprimiendo valores X de 3 en 3
        for (x in 0..30 step 3){
            println(x)
        }

        }
}