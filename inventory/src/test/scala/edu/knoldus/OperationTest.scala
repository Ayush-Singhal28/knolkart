package edu.knoldus

import edu.knoldus.inventoryService.Operation
import org.scalatest.FunSuite

class OperationTest extends FunSuite {

    val operationTest = new Operation

    test("To check adding item information in inventory") {
      assert(operationTest.addInventoryDetails(Map() ++ Map(1,"jeans","sharma clothes",4,5,"clothes")) == Map(1,"jeans","sharma clothes",4,5,"clothes"))
    }

  }
