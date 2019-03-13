
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
    """),format.raw/*5.5*/("""<h3>Sign In</h3>
    <!--Displays possible login errors-->
    """),_display_(/*7.6*/if(loginForm.hasGlobalErrors)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
            """),_display_(/*9.14*/for(e <- loginForm.globalErrors) yield /*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
                """),_display_(/*10.18*/e/*10.19*/.message),format.raw/*10.27*/("""<br/>
            """)))}),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""</p>
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""<!--the login form-->
    """),_display_(/*15.6*/helper/*15.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*15.76*/ {_display_(Seq[Any](format.raw/*15.78*/("""
        """),format.raw/*16.37*/("""
        """),format.raw/*18.85*/("""
        """),_display_(/*19.10*/CSRF/*19.14*/.formField),format.raw/*19.24*/("""

        """),format.raw/*21.9*/("""<div class="form-group">
            """),_display_(/*22.14*/inputText(loginForm("email"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*23.72*/("""
        """),format.raw/*24.9*/("""</div>
        <div class="form-group">
            """),_display_(/*26.14*/inputText(loginForm("password"), '_label -> "",
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*27.75*/("""
        """),format.raw/*28.9*/("""</div>

        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*33.23*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 10:42:10 GMT 2019
                  SOURCE: /home/wdd/sdev4ca1v2/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/login.scala.html
                  HASH: 296a178ae23f04899cd45d8ac056d3172c84e8a3
                  MATRIX: 966->1|1076->40|1120->56|1147->58|1168->71|1207->73|1238->78|1327->142|1364->171|1403->173|1438->182|1509->227|1556->259|1595->261|1640->279|1650->280|1679->288|1729->307|1765->316|1805->326|1837->331|1890->358|1905->364|1978->428|2018->430|2055->467|2092->628|2129->638|2142->642|2173->652|2210->662|2275->700|2412->816|2448->825|2528->878|2671->1000|2707->1009|2873->1161
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|45->14|46->15|46->15|46->15|46->15|47->16|48->18|49->19|49->19|49->19|51->21|52->22|53->23|54->24|56->26|57->27|58->28|63->33
                  -- GENERATED --
              */
          