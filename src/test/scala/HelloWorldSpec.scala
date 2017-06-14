import org.scalatest.{MustMatchers, WordSpec}

class HelloWorldSpec extends WordSpec with MustMatchers {

  "HelloWorld" should {
    val expectedResult = "Hello world!"
    s"return $expectedResult when called" in {
      HelloWorld.message mustBe expectedResult
    }
  }

}
