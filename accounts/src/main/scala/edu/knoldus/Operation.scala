package edu.knoldus

class Operations {

    def checkValidUser(username: String, password: String): Boolean = {
      (username, password) match {
        case ("Ayush", "qwerty") => true
        case _ => false
      }
    }

  }


