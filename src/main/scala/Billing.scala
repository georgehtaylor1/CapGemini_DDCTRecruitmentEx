/**
  * Created by george on 14/06/17.
  */

object Billing {

  /**
    * The menu for the cafe
    */
  val menu: Map[String, ItemParams] = Map("Cola".->(new ItemParams(0.5, false, false)),
    "Coffee".->(new ItemParams(1, true, false)),
    "Cheese Sandwich".->(new ItemParams(2, false, true)),
    "Steak Sandwich".->(new ItemParams(4.5, true, true)))

  /**
    * Calculate the charge for a given bill (Step 1)
    * @param items The bill of items
    * @return Teh charge for the bill
    */
  def charge(items: List[String]): Double = return items.foldLeft(0.0)((b, i) => b.+(menu.apply(i).cost))

  /**
    * Calculate the charge for a bill with a service charge (Step 2)
    * @param items The bill
    * @return The charge for the bill with service charge
    */
  def serviceCharge(items:List[String]): Double = {
    val c: Double = Billing.charge(items)
    if (items.exists(s => menu.apply(s).hot.&&(menu.apply(s).food))){
      return c + (Math.round(Math.min(20, c * 0.2) * 100).toDouble / 100)
    }
    if (items.exists(s => menu.apply(s).food)){
      return c + (Math.round(Math.min(20, c * 0.1) * 100).toDouble / 100)
    }
    return c
  }

}