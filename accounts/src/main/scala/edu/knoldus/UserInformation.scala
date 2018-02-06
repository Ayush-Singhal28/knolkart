package edu.knoldus

import org.apache.log4j.Logger

class UserInformation {
  val userName: String = "Ayush"
  val password: String = "qwerty"
  val mobileNumber: String = "9540342343"
  val operation = new Operations
  val logger = Logger.getLogger(this.getClass)
  logger.info(operation.checkValidUser(userName, password))
}




