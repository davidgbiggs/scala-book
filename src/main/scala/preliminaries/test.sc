val name = "Bill"
val c = 'a' // single quotes

val firstName = "John"
val mi = 'C'
val lastName = "Doe"

// val name = firstName + " " + mi + " " + lastName
val name = s"$firstName $mi $lastName"

println(s"Name: $firstName $mi $lastName")

println(s"Name: ${firstName} ${mi} ${lastName}")

println(s"1+1 = ${1+1}")

// you can also precede strings with the letter f to use printf style formatting
// the raw interpolator performs no escaping of literals (such as \n) within the string
// you can create your own string interpolators

val speech =
  """Four score and
    |seven years ago
    |our fathers ...
    |""".stripMargin

print("Hello without newline")
System.err.println("yikes, an error happened")