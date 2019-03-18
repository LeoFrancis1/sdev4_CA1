
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

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.Project],models.users.Employee,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pForm: Form[models.Project],employee: models.users.Employee, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Add Project",employee)/*5.30*/{_display_(Seq[Any](format.raw/*5.31*/("""
    """),format.raw/*6.5*/("""<p class="lead">Add new Project</p>
    """),_display_(/*7.6*/form(action=routes.ProjectController.addProjectSubmit(), 'class -> "form-horizontal",
    'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*8.75*/ {_display_(Seq[Any](format.raw/*8.77*/("""
        """),format.raw/*9.37*/("""
        """),format.raw/*10.99*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""

        """),_display_(/*13.10*/inputText(pForm("Project Title"), '_label -> "Project Title", 'class -> "form-control")),format.raw/*13.97*/("""
        """),_display_(/*14.10*/inputText(pForm("Start Date"), '_label -> "Start Date", 'class -> "form-control")),format.raw/*14.91*/("""
        """),_display_(/*15.10*/inputText(pForm("End Date"), '_label -> "End Date", 'class -> "form-control")),format.raw/*15.87*/("""
        """),_display_(/*16.10*/inputText(pForm("Allocated Budget"), '_label -> "Allocated Budget", 'class -> "form-control")),format.raw/*16.103*/("""

        """),format.raw/*18.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">

        <div class="actions">
            <input type="submit" value="Add Project" class="btn btn-primary">
            <a href=""""),_display_(/*23.23*/routes/*23.29*/.ProjectController.projects()),format.raw/*23.58*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>

            

    """)))}),format.raw/*30.6*/("""   """),format.raw/*30.26*/("""
""")))}),format.raw/*31.2*/("""   """))
      }
    }
  }

  def render(pForm:Form[models.Project],employee:models.users.Employee,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(pForm,employee,env)

  def f:((Form[models.Project],models.users.Employee,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (pForm,employee,env) => apply(pForm,employee,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 21:01:12 GMT 2019
                  SOURCE: /home/wdd/ca1sDev18032019/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/addProject.scala.html
                  HASH: 4044fad73912c293d94323d9439d5f90142bba4f
                  MATRIX: 1010->1|1171->92|1215->90|1242->108|1269->110|1305->138|1343->139|1374->144|1440->185|1608->345|1647->347|1683->384|1720->483|1757->493|1770->497|1801->507|1839->518|1947->605|1984->615|2086->696|2123->706|2221->783|2258->793|2373->886|2410->896|2665->1124|2680->1130|2730->1159|2893->1292|2924->1312|2956->1314
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|37->6|38->7|39->8|39->8|40->9|41->10|42->11|42->11|42->11|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|54->23|54->23|54->23|61->30|61->30|62->31
                  -- GENERATED --
              */
          