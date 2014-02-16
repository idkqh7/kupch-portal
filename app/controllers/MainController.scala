package controllers

import play.api.mvc.{Action, Controller}


object MainController extends Controller {

  case class Contents(id: String, name:String, url:String)
  implicit def set(combined: (String, String, String)): Contents = combined match {
    case (id, name, url) => Contents(id, name, url)
  }

  val contents: Array[Contents]  = Array(
    ("redmine", "Redmine" ,""),
    ("jenkins", "Jenkins", ""),
    ("ipython", "iPython", "ipython/notebooks/console.ipynb"),
    ("owncloud", "OwnCloud", "")
  )
  def index() = Action {
    Ok(views.html.index(contents))
  }

}