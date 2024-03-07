package HomeWork_1

fun main() {
    val contacts = mutableMapOf<String, String>()

    while (true) {
        print("Введите команду: ")
        val input = readLine()

        when {
            input == "exit" -> {
                println("Программа завершена.")
                break
            }
            input == "help" -> {
                println("Доступные команды:")
                println("exit - завершить программу")
                println("add <Имя> phone <Номер телефона> - добавить контакт с номером телефона")
                println("add <Имя> email <Адрес электронной почты> - добавить контакт с адресом электронной почты")
            }
            input != null -> {
                val parts = input.split(" ")
                if (parts.size >= 4 && parts[0] == "add") {
                    val name = parts[1]
                    val contactType = parts[2]
                    val contactInfo = parts.subList(3, parts.size).joinToString(" ")

                    when (contactType) {
                        "phone" -> {
                            contacts[name] = contactInfo
                            println("Контакт $name с номером телефона $contactInfo добавлен.")
                        }
                        "email" -> {
                            contacts[name] = contactInfo
                            println("Контакт $name с адресом электронной почты $contactInfo добавлен.")
                        }
                        else -> println("Неправильный формат команды.")
                    }
                } else {
                    println("Неправильный формат команды.")
                }
            }
        }
    }
}