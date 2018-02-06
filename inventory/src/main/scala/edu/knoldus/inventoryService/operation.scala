package edu.knoldus.inventoryService

import java.util.Scanner

import edu.knoldus.{Inventory, Item}
import org.apache.log4j.Logger

class Operation extends Inventory {

  def addInventoryDetails(enteringInventory: Map[Int, Item): Map[Int, Item] = {
    val input = new Scanner(System.in)
    val logger = Logger.getLogger(this.getClass)
    val idOfItem: Int = input.nextInt()
    val description: String = input.next()
    val vendorInformation: String = input.next()
    val rating: Int = input.nextInt()
    val price: Int = input.nextInt()
    val category: String = input.next()
    val itemInformation = Item(description, vendorInformation, rating, price, category)
    enteringInventory ++ Map(idOfItem -> itemInformation)
  }

 /* def searchItem(searchCategory: String, newList: List[Int, Item]): String = {
  }

  def sortItem(item: Map[Int, Item]): String = {

  }*/

}
