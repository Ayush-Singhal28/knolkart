package edu.knoldus

import org.scalatest.FunSuite

class UserInformationTest extends FunSuite {

  val operationTest = new Operations

  test("To check username and password") {
    assert(operationTest.checkValidUser("Ayush", "qwerty") === true)
  }


}
