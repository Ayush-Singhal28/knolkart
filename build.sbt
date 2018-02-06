import sbt.Keys._
import sbt._

lazy val commonSettings = Seq(
  name := "KnolKarteCommerce",

  version := "0.1",

  scalaVersion := "2.12.4",

  libraryDependencies += "log4j" % "log4j" % "1.2.17",

  libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test",

  coverageEnabled := true
)

lazy val root = project.in(file(".")).aggregate(accounts, inventory, checkout, notification, apiResources, dashboard)

lazy val accounts = (project in file("accounts"))
  .settings(
    commonSettings
  )

lazy val inventory = (project in file("inventory"))
  .settings(
    commonSettings
  )

lazy val checkout = (project in file("checkout"))
  .settings(
    commonSettings
  )

lazy val notification = (project in file("notification"))
  .settings(
    commonSettings
  )

lazy val apiResources = (project in file("apiResources"))
  .settings(
    commonSettings
  )


lazy val dashboard = (project in file("dashboard"))
  .settings(
    commonSettings
  )