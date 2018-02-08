object Partridge {

  private val terms = List(
    "Partridge",
    "PearTree",
    "Chat",
    "Dan",
    "Toblerone",
    "Lynn",
    "AlphaPapa",
    "Nomad"
  )

  // IMPORTANT: Do not change the signatures of the functions declared below.
  // See the README file for explanations of what each function should do.

  def part(args: Array[String]): String = {
    val found = args.flatMap(t =>
      if (terms.contains(t)) Some(t)
      else None
    )

    if (found.isEmpty) "Lynn, I've pierced my foot on a spike!!"
    else s"Mine's a Pint${"!"*found.length}"
  }

  def apple(x: Any): String = {
    ???
  }

  def london(args: Array[String]): String = {
    ???
  }

}
