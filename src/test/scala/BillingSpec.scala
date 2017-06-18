import org.scalatest.{MustMatchers, WordSpec}

/**
  * Created by george on 14/06/17.
  */
class BillingSpec extends WordSpec with MustMatchers {

  /**
    * Test the charge without service charge (Step 1)
    */
  "Billing" should {
    val expectedResult = 3.5
    s"return $expectedResult when called" in {
      Billing.charge(List("Cola", "Coffee", "Cheese Sandwich")) mustBe expectedResult
    }
  }

  it should {
    val expectedResult = 1.5
    s"return $expectedResult when called" in {
      Billing.serviceCharge(List("Cola", "Coffee")) mustBe expectedResult
    }
  }

  it should {
    val expectedResult = 3.85
    s"return $expectedResult when called" in {
      Billing.serviceCharge(List("Cola", "Coffee", "Cheese Sandwich")) mustBe expectedResult
    }
  }

  it should {
    val expectedResult = 7.20
    s"return $expectedResult when called" in {
      Billing.serviceCharge(List("Cola", "Coffee", "Steak Sandwich")) mustBe expectedResult
    }
  }

}