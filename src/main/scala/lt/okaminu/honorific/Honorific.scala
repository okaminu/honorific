package lt.okaminu.honorific

object Honorific extends App{
    val person = Person("Jonas", "Jonaitis", 19, Some(Female), Some(Married))

    person match {
        case Person(firstName, lastName, _ , Some(Male), _) => println(s"Mr $firstName $lastName")
        case Person(firstName, lastName, _ , Some(Female), status) => status.map {
            case Married => println(s"Mrs $firstName $lastName")
            case Single => println(s"Miss $firstName $lastName")
        } getOrElse  { println(s"Ms $firstName $lastName") }
        case Person(firstName, lastName, _ , None, _) => println(s"Mx $firstName $lastName")
    }
}
