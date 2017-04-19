package io.scalajs.examples

import io.scalajs.nodejs.console
import io.scalajs.nodejs.global._

import scala.scalajs.js

/**
  * Node.js Builtin Variables
  * @author lawrence.daniels@gmail.com
  */
object BuiltinVariables extends js.JSApp {

  override def main(): Unit = {
    console.log(s"The current directory is ${__dirname}")
    console.log(s"The file we're excuting is ${__filename}")
  }

}
