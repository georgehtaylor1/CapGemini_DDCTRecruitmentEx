/**
  * Created by george on 14/06/17.
  */

object Billing {

  val menu: Map[String, Double] = Map("Cola" -> 0.5, "Coffee" -> 1, "Cheese Sandwich" -> 2, "Steak Sandwich" -> 4.5)

  def charge(items: List[String]): Double = items.foldLeft(0.0)((b, i) => b + menu.apply(i))

}