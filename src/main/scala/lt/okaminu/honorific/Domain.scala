package lt.okaminu.honorific

sealed trait Gender
case object Male extends Gender
case object Female extends Gender

sealed trait MaritalStatus
case object Single extends MaritalStatus
case object Married extends MaritalStatus
case object Divorced extends MaritalStatus
case object Widowed extends MaritalStatus

case class Person(firstName: String,
                  lastName: String,
                  age: Int,
                  gender: Option[Gender],
                  maritalStatus: Option[MaritalStatus])