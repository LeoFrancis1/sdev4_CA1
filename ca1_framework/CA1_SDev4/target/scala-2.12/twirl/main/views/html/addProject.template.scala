
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.project],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[models.project]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Project")/*5.21*/{_display_(Seq[Any](format.raw/*5.22*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add new Project</p>
    """),_display_(/*7.6*/form(action=routes.ProjectController.addItemSubmit(), 'class -> "form-horizontal", 'role -> "form")/*7.105*/ {_display_(Seq[Any](format.raw/*7.107*/("""
        """),format.raw/*8.37*/("""
        """),format.raw/*9.99*/("""
        """),_display_(/*10.10*/CRSF/*10.14*/.formField),format.raw/*10.24*/("""

        """),format.raw/*12.9*/("""<!-- """),_display_(/*12.15*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.87*/("""
        """),_display_(/*13.10*/select(
            itemForm("category.id")
        )),format.raw/*15.10*/(""" """),format.raw/*15.11*/("""-->

        """),_display_(/*17.10*/inputText(itemForm("Project Title"), '_label -> "Project Title", class -> "form-control")),format.raw/*17.99*/("""
        """),_display_(/*18.10*/inputText(itemForm("Start Date"), '_label -> "Start Date", class -> "form-control")),format.raw/*18.93*/("""
        """),_display_(/*19.10*/inputText(itemForm("End Date"), '_label -> "End Date", class -> "form-control")),format.raw/*19.89*/("""
        """),_display_(/*20.10*/inputText(itemForm("Allocated Budget"), '_label -> "Allocated Budget", class -> "form-control")),format.raw/*20.105*/("""

        """),format.raw/*22.9*/("""<div class="actions">

            <input type="submit" value="Add item" class="btn btn-primary">
            <a href=""""),_display_(/*25.23*/routes/*25.29*/.ProjectController.Project(0)),format.raw/*25.58*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
                </a>
             </div>

            

    """)))}),format.raw/*32.6*/("""   """),format.raw/*32.26*/("""
""")))}),format.raw/*33.2*/("""   """))
      }
    }
  }

  def render(itemForm:Form[models.project]): play.twirl.api.HtmlFormat.Appendable = apply(itemForm)

  def f:((Form[models.project]) => play.twirl.api.HtmlFormat.Appendable) = (itemForm) => apply(itemForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 18:39:41 GMT 2019
                  SOURCE: /home/wdd/sdevca/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/addProject.scala.html
                  HASH: a6ba2d55fbee5623b68aceee40a328e296fa7a72
                  MATRIX: 967->1|1072->36|1116->34|1143->52|1170->54|1197->73|1235->74|1266->79|1332->120|1440->219|1480->221|1516->258|1552->357|1589->367|1602->371|1633->381|1670->391|1703->397|1796->469|1833->479|1907->532|1936->533|1977->547|2087->636|2124->646|2228->729|2265->739|2365->818|2402->828|2519->923|2556->933|2703->1053|2718->1059|2768->1088|2940->1230|2971->1250|3003->1252
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|41->10|41->10|41->10|43->12|43->12|43->12|44->13|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|53->22|56->25|56->25|56->25|63->32|63->32|64->33
                  -- GENERATED --
              */
          