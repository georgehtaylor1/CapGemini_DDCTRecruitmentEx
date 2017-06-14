import org.scalatest.{MustMatchers, WordSpec}

/**
  * Created by george on 14/06/17.
  */
class BillingSpec extends WordSpec with MustMatchers {

  "Billing" should {
    val expectedResult = 3.5
    s"return $expectedResult when called" in {
      Billing.charge(List("Cola", "Coffee", "Cheese Sandwich")) mustBe expectedResult
    }
  }

}