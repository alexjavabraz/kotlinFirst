package br.com.bjbraz

data class Person(val name:String, val age: Int? = null)

fun main(args: Array<String>){
    val persons = listOf<Person>(Person("Alice"), Person("Bob", 17),
            Person("Ana", 20))

    val oldest = persons.maxBy { it.age ?: 0 }

    println("The oldest is: $oldest")
}