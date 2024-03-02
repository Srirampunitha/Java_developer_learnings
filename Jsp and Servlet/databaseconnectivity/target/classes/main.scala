package com.learning.databaseconnectivity

import pro.savant.circumflex._, core._, web._, freemarker._
import java.util.Date

class Main extends Router {
  val log = new Logger("com.learning.databaseconnectivity")

  'currentDate := new Date

  get("/test") = "I'm fine, thanks!"
  get("/") = ftl("index.ftl")

}