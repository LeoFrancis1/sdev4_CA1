
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.Employee,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String, employee: models.users.Employee)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*9.74*/("""}"""),format.raw/*9.75*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*10.65*/("""}"""),format.raw/*10.66*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""margin-top: 2em; text-align: center; font-weight: bold; """),format.raw/*12.75*/("""}"""),format.raw/*12.76*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: steelblue; """),format.raw/*13.57*/("""}"""),format.raw/*13.58*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: red; """),format.raw/*14.29*/("""}"""),format.raw/*14.30*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>JMC</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">Jupiter Mining Corporation</a>
		</div>
		<ul class="nav navbar-nav">
			<li """),_display_(/*25.9*/if(pagename == "Home")/*25.31*/{_display_(Seq[Any](format.raw/*25.32*/("""class ="active"""")))}),format.raw/*25.48*/("""><a href=""""),_display_(/*25.59*/routes/*25.65*/.HomeController.index()),format.raw/*25.88*/("""">Home</a><li>
		    <li """),_display_(/*26.12*/if(pagename == "Project")/*26.37*/{_display_(Seq[Any](format.raw/*26.38*/("""class ="active"""")))}),format.raw/*26.54*/("""><a href=""""),_display_(/*26.65*/routes/*26.71*/.HomeController.index()),format.raw/*26.94*/("""">Project</a><li>
			<li """),_display_(/*27.9*/if(pagename == "Contact")/*27.34*/{_display_(Seq[Any](format.raw/*27.35*/("""class ="active"""")))}),format.raw/*27.51*/("""><a href=""""),_display_(/*27.62*/routes/*27.68*/.HomeController.index()),format.raw/*27.91*/("""">Contact</a><li>
			<li """),_display_(/*28.9*/if(pagename == "Login")/*28.32*/{_display_(Seq[Any](format.raw/*28.33*/("""class ="active"""")))}),format.raw/*28.49*/(""">
				"""),_display_(/*29.6*/if(employee != null)/*29.26*/ {_display_(Seq[Any](format.raw/*29.28*/("""
					"""),format.raw/*30.6*/("""<a href=""""),_display_(/*30.16*/routes/*30.22*/.LoginController.logout()),format.raw/*30.47*/("""">Logout</a>
				""")))}/*31.7*/else/*31.12*/{_display_(Seq[Any](format.raw/*31.13*/("""
					"""),format.raw/*32.6*/("""<a href=""""),_display_(/*32.16*/routes/*32.22*/.LoginController.login()),format.raw/*32.46*/("""">Login</a>
				""")))}),format.raw/*33.6*/("""
			"""),format.raw/*34.4*/("""<li>
		</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>Employee notice:</h3>
			<p>Make sure to report to your website administrator if you experience any issues with this website or your account</p>
		    </div>
		</div>
		<div class="col-sm-6">
		    <div class="midcol">
                """),_display_(/*50.18*/content),format.raw/*50.25*/("""
		    """),format.raw/*51.7*/("""</div>
		</div>
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>Next product launch!</h2>
			<h3>Countdown to our next product release!</h3>
			<p id="demo"></p>

    <script>
        var countDownDate = new Date("Jan 5, 2021 15:37:25").getTime();

        var x = setInterval(function() """),format.raw/*62.40*/("""{"""),format.raw/*62.41*/("""

        """),format.raw/*64.9*/("""var now = new Date().getTime();
    
        var distance = countDownDate - now;
    
        var days = Math.floor(distance / (1000 * 60 * 60 * 24));
        var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
        var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    
        document.getElementById("demo").innerHTML = days + "d " + hours + "h "
         + minutes + "m " + seconds + "s ";
    
        if (distance < 0) """),format.raw/*76.27*/("""{"""),format.raw/*76.28*/("""
         """),format.raw/*77.10*/("""clearInterval(x);
         document.getElementById("demo").innerHTML = "EXPIRED";
             """),format.raw/*79.14*/("""}"""),format.raw/*79.15*/("""
                """),format.raw/*80.17*/("""}"""),format.raw/*80.18*/(""", 1000);
                </script>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by Kryten
		    </div>
		</div>
	    </div>
	</div>
    </body>
</html>


"""))
      }
    }
  }

  def render(pagename:String,employee:models.users.Employee,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,employee)(content)

  def f:((String,models.users.Employee) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,employee) => (content) => apply(pagename,employee)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 21:28:20 GMT 2019
                  SOURCE: /home/wdd/sdev4ca1v2/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/main.scala.html
                  HASH: c56bbbe400be29abcda597a5feda7630226c19dd
                  MATRIX: 974->1|1134->68|1416->323|1444->324|1472->325|1557->383|1585->384|1618->390|1655->399|1684->400|1713->401|1789->449|1818->450|1851->456|1891->468|1920->469|1949->470|1996->489|2025->490|2058->496|2097->507|2126->508|2155->509|2239->565|2268->566|2301->572|2340->583|2369->584|2398->585|2464->623|2493->624|2526->630|2563->639|2592->640|2621->641|2661->653|2690->654|2719->656|3016->927|3047->949|3086->950|3133->966|3171->977|3186->983|3230->1006|3283->1032|3317->1057|3356->1058|3403->1074|3441->1085|3456->1091|3500->1114|3552->1140|3586->1165|3625->1166|3672->1182|3710->1193|3725->1199|3769->1222|3821->1248|3853->1271|3892->1272|3939->1288|3972->1295|4001->1315|4041->1317|4074->1323|4111->1333|4126->1339|4172->1364|4208->1383|4221->1388|4260->1389|4293->1395|4330->1405|4345->1411|4390->1435|4437->1452|4468->1456|4901->1862|4929->1869|4963->1876|5296->2181|5325->2182|5362->2192|5933->2735|5962->2736|6000->2746|6123->2841|6152->2842|6197->2859|6226->2860
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|63->32|64->33|65->34|81->50|81->50|82->51|93->62|93->62|95->64|107->76|107->76|108->77|110->79|110->79|111->80|111->80
                  -- GENERATED --
              */
          