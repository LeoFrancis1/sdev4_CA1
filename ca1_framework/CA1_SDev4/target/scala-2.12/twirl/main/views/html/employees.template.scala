
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Employee],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee],employee: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employee",employee)/*2.27*/{_display_(Seq[Any](format.raw/*2.28*/("""
	"""),format.raw/*3.2*/("""<h1>Current Employees</h1>

	
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(employees:List[models.users.Employee],employee:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(employees,employee)

  def f:((List[models.users.Employee],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (employees,employee) => apply(employees,employee)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 21:41:36 GMT 2019
                  SOURCE: /home/wdd/sdev4ca1v2/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/employees.scala.html
                  HASH: f26ea43aa613dedf283e8bc595c5f9d3926eb594
                  MATRIX: 995->1|1161->75|1194->100|1232->101|1260->103|1320->134
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6
                  -- GENERATED --
              */
          