
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Project],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pForm: Form[models.Project],employee: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Project",employee)/*5.30*/{_display_(Seq[Any](format.raw/*5.31*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add new Project</p>
    """),_display_(/*7.6*/form(action=routes.ProjectController.addProjectSubmit(), 'class -> "form-horizontal", 'role -> "form")/*7.108*/ {_display_(Seq[Any](format.raw/*7.110*/("""
        """),format.raw/*8.37*/("""
        """),format.raw/*9.99*/("""
        """),_display_(/*10.10*/CSRF/*10.14*/.formField),format.raw/*10.24*/("""

        """),_display_(/*12.10*/inputText(pForm("Project Title"), '_label -> "Project Title", 'class -> "form-control")),format.raw/*12.97*/("""
        """),_display_(/*13.10*/inputText(pForm("Start Date"), '_label -> "Start Date", 'class -> "form-control")),format.raw/*13.91*/("""
        """),_display_(/*14.10*/inputText(pForm("End Date"), '_label -> "End Date", 'class -> "form-control")),format.raw/*14.87*/("""
        """),_display_(/*15.10*/inputText(pForm("Allocated Budget"), '_label -> "Allocated Budget", 'class -> "form-control")),format.raw/*15.103*/("""

        """),format.raw/*17.9*/("""<div class="actions">

            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*20.23*/routes/*20.29*/.ProjectController.projects()),format.raw/*20.58*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
                </a>
             </div>

            

    """)))}),format.raw/*27.6*/("""   """),format.raw/*27.26*/("""
""")))}),format.raw/*28.2*/("""   """))
      }
    }
  }

  def render(pForm:Form[models.Project],employee:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(pForm,employee)

  def f:((Form[models.Project],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (pForm,employee) => apply(pForm,employee)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 18:39:03 GMT 2019
                  SOURCE: /home/wdd/ca1SDev16032019/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/addProject.scala.html
                  HASH: 05e6ea648d628a82df52d6fb7cd8bb40281f36e9
                  MATRIX: 989->1|1123->65|1167->63|1194->81|1221->83|1257->111|1295->112|1326->117|1392->158|1503->260|1543->262|1579->299|1615->398|1652->408|1665->412|1696->422|1734->433|1842->520|1879->530|1981->611|2018->621|2116->698|2153->708|2268->801|2305->811|2455->934|2470->940|2520->969|2692->1111|2723->1131|2755->1133
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|41->10|41->10|41->10|43->12|43->12|44->13|44->13|45->14|45->14|46->15|46->15|48->17|51->20|51->20|51->20|58->27|58->27|59->28
                  -- GENERATED --
              */
          