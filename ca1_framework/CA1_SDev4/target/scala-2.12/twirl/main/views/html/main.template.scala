
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
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
			<li """),_display_(/*28.9*/if(pagename == "Login")/*28.32*/{_display_(Seq[Any](format.raw/*28.33*/("""class ="active"""")))}),format.raw/*28.49*/("""><a href=""""),_display_(/*28.60*/routes/*28.66*/.LoginController.login()),format.raw/*28.90*/("""">Login</a><li>
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
                """),_display_(/*44.18*/content),format.raw/*44.25*/("""
		    """),format.raw/*45.7*/("""</div>
		</div>
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>Next product launch!</h2>
			<h3>Countdown to our next product release!</h3>
			<p id="demo"></p>

    <script>
        var countDownDate = new Date("Jan 5, 2021 15:37:25").getTime();

        var x = setInterval(function() """),format.raw/*56.40*/("""{"""),format.raw/*56.41*/("""

        """),format.raw/*58.9*/("""var now = new Date().getTime();
    
        var distance = countDownDate - now;
    
        var days = Math.floor(distance / (1000 * 60 * 60 * 24));
        var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
        var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    
        document.getElementById("demo").innerHTML = days + "d " + hours + "h "
         + minutes + "m " + seconds + "s ";
    
        if (distance < 0) """),format.raw/*70.27*/("""{"""),format.raw/*70.28*/("""
         """),format.raw/*71.10*/("""clearInterval(x);
         document.getElementById("demo").innerHTML = "EXPIRED";
             """),format.raw/*73.14*/("""}"""),format.raw/*73.15*/("""
                """),format.raw/*74.17*/("""}"""),format.raw/*74.18*/(""", 1000);
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

  def render(pagename:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename) => (content) => apply(pagename)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 10:53:26 GMT 2019
                  SOURCE: /home/wdd/sdev4ca1v2/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/main.scala.html
                  HASH: 41335bb808295dbc07652ec0f2be65e0fdb97d5b
                  MATRIX: 952->1|1079->35|1361->290|1389->291|1417->292|1502->350|1530->351|1563->357|1600->366|1629->367|1658->368|1734->416|1763->417|1796->423|1836->435|1865->436|1894->437|1941->456|1970->457|2003->463|2042->474|2071->475|2100->476|2184->532|2213->533|2246->539|2285->550|2314->551|2343->552|2409->590|2438->591|2471->597|2508->606|2537->607|2566->608|2606->620|2635->621|2664->623|2961->894|2992->916|3031->917|3078->933|3116->944|3131->950|3175->973|3228->999|3262->1024|3301->1025|3348->1041|3386->1052|3401->1058|3445->1081|3497->1107|3531->1132|3570->1133|3617->1149|3655->1160|3670->1166|3714->1189|3766->1215|3798->1238|3837->1239|3884->1255|3922->1266|3937->1272|3982->1296|4426->1713|4454->1720|4488->1727|4821->2032|4850->2033|4887->2043|5458->2586|5487->2587|5525->2597|5648->2692|5677->2693|5722->2710|5751->2711
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|75->44|75->44|76->45|87->56|87->56|89->58|101->70|101->70|102->71|104->73|104->73|105->74|105->74
                  -- GENERATED --
              */
          