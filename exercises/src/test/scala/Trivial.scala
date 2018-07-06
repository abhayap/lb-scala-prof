import org.scalatest.{Matchers, WordSpec}

class Trivial extends WordSpec with Matchers {
  "Running a trivial test" should {
    "succeed" in {
      val sum = 1 + 2
      sum shouldBe 3
    }
  }

}
