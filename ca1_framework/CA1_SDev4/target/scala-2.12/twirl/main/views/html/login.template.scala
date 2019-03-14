
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: Form[models.users.Login],employee: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Login",employee)/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
    """),format.raw/*6.5*/("""<h3>Sign In</h3>
    <!--Displays possible login errors-->
    """),_display_(/*8.6*/if(loginForm.hasGlobalErrors)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
        """),format.raw/*9.9*/("""<p class="alert alert-warning">
            """),_display_(/*10.14*/for(e <- loginForm.globalErrors) yield /*10.46*/ {_display_(Seq[Any](format.raw/*10.48*/("""
                """),_display_(/*11.18*/e/*11.19*/.message),format.raw/*11.27*/("""<br/>
            """)))}),format.raw/*12.14*/("""
        """),format.raw/*13.9*/("""</p>
    """)))}),format.raw/*14.6*/("""
    """),format.raw/*15.5*/("""<!--the login form-->
    """),_display_(/*16.6*/helper/*16.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*16.76*/ {_display_(Seq[Any](format.raw/*16.78*/("""
        """),format.raw/*17.37*/("""
        """),format.raw/*19.85*/("""
        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""

        """),format.raw/*22.9*/("""<div class="form-group">
            """),_display_(/*23.14*/inputText(loginForm("email"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*24.72*/("""
        """),format.raw/*25.9*/("""</div>
        <div class="form-group">
            """),_display_(/*27.14*/inputText(loginForm("password"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*28.75*/("""
        """),format.raw/*29.9*/("""</div>

        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*34.23*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],employee:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,employee)

  def f:((Form[models.users.Login],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,employee) => apply(loginForm,employee)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 21:28:20 GMT 2019
                  SOURCE: /home/wdd/sdev4ca1v2/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/login.scala.html
                  HASH: 9faecf4748ddde54c176b6cce238b8bd2b0dd21a
                  MATRIX: 988->2|1130->73|1174->89|1201->91|1231->113|1270->115|1301->120|1390->184|1427->213|1466->215|1501->224|1573->269|1621->301|1661->303|1706->321|1716->322|1745->330|1795->349|1831->358|1871->368|1903->373|1956->400|1971->406|2044->470|2084->472|2121->509|2158->670|2195->680|2208->684|2239->694|2276->704|2341->742|2478->858|2514->867|2594->920|2737->1042|2773->1051|2939->1203
                  LINES: 28->2|31->3|34->4|35->5|35->5|35->5|36->6|38->8|38->8|38->8|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|43->13|44->14|45->15|46->16|46->16|46->16|46->16|47->17|48->19|49->20|49->20|49->20|51->22|52->23|53->24|54->25|56->27|57->28|58->29|63->34
                  -- GENERATED --
              */
          