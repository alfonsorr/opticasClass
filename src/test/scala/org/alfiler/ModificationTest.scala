package org.alfiler

import org.scalatest.{FlatSpecLike, Matchers}

class ModificationTest extends FlatSpecLike with Matchers{

  "The street" should "change the street name" in {
    val testClass = Employee("Alfonso", Company("Alfonso Inc.", Address("Pitis",Street(55, "inventada"))))
    val result = Action.capitalizeStreetName(testClass)
    result.company.address.street shouldBe "Inventada"
  }
}
