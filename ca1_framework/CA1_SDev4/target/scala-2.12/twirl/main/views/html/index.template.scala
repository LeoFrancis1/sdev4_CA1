
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employee: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home",employee)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
	"""),format.raw/*3.2*/("""<h1>Welcome to the Jupiter Mining Corporation<br>Website</b></h1>
""")))}),format.raw/*4.2*/("""
"""))
      }
    }
  }

  def render(employee:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(employee)

  def f:((models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (employee) => apply(employee)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 21:28:20 GMT 2019
                  SOURCE: /home/wdd/sdev4ca1v2/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/index.scala.html
                  HASH: 976581202eb9eb20dc394aea2607aa4a8b56a48e
                  MATRIX: 963->1|1090->36|1119->57|1157->58|1185->60|1281->127
                  LINES: 28->1|33->2|33->2|33->2|34->3|35->4
                  -- GENERATED --
              */
          