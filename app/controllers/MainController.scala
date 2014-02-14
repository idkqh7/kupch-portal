package controllers

import play.api.mvc.{Action, Controller}


object MainController extends Controller {

  case class Contents(id: String, name:String)
  implicit def set(combined: (String, String)): Contents = combined match {
    case (id, name) => Contents(id, name)
  }

  val contents: Array[Contents]  = Array(
    ("redmine", "Redmine"),
    ("jenkins", "Jenkins"),
    ("ipython", "iPython"),
    ("owncloud", "OwnCloud")
  )
  def index() = Action {
    Ok(views.html.index(contents))
  }

}