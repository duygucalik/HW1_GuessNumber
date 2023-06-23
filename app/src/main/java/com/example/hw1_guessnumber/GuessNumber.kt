package com.example.hw1_guessnumber
import java.util.Scanner
import kotlin.random.Random
import kotlin.system.exitProcess

fun main() {
    val rndNum = Random.nextInt(0, 101)
    val input = Scanner(System.`in`)
    println("Welcome to the Guess Game...")
    println("1-100 arasında bir sayı tahmin ettim. Bu sayıyı bulabilir misin ?")

    for (answer in 1..3) {
        print("$answer . Cevap : Tahmininizi girin: ")
        val guess = input.nextInt()
        if (guess == rndNum) {
            println("Congratulations !! Tahmin edilen sayıyı $answer denemede doğru bildiniz.\n Tahmin edilen sayı : $rndNum")
            exitProcess(0)
        }
        else if (guess != null) {
            if (guess < rndNum) {
                println("Daha büyük bir sayı giriniz.")
            }
            else {
                println("Daha küçük bir sayı giriniz.")
            }
        }
    }
    println("Üzgünüm, sayıyı 3 denemede tahmin edemediniz. Tahmin edilen sayı $rndNum.")
    println("Thank you for playing!")
}

