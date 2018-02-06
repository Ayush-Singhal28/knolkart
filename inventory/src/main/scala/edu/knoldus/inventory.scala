package edu.knoldus

import edu.knoldus.inventoryService.Operation

trait Inventory {

  val inventoryDetails: List[Item]
  val idOfItem: Int
  val enteringInventory: Map[Int, Item] = Map()
  val operation = new Operation
  val item: Map[Int, Item] = operation.addInventoryDetails(enteringInventory)
 /* val newList: List[(Int, Item)] = item.toList
  val searchCategory: String = "Clothes"
    operation.searchItem(searchCategory, item)*/

}
