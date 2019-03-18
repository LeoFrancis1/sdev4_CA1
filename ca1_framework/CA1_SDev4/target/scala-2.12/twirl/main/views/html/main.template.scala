
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
		    <li """),_display_(/*26.12*/if(pagename == "Project")/*26.37*/{_display_(Seq[Any](format.raw/*26.38*/("""class ="active"""")))}),format.raw/*26.54*/(""">
				"""),_display_(/*27.6*/if((employee != null) && ("manager".equals(employee.getRole())))/*27.70*/ {_display_(Seq[Any](format.raw/*27.72*/("""
					"""),format.raw/*28.6*/("""<a href=""""),_display_(/*28.16*/routes/*28.22*/.ProjectController.addProject()),format.raw/*28.53*/("""">Project CRUD</a>
				""")))}/*29.7*/else if((employee != null) && ("employee".equals(employee.getRole())))/*29.78*/ {_display_(Seq[Any](format.raw/*29.80*/("""
					"""),format.raw/*30.6*/("""<a href=""""),_display_(/*30.16*/routes/*30.22*/.ProjectController.projects()),format.raw/*30.51*/("""">Projects</a>
				""")))}/*31.7*/else/*31.12*/{_display_(Seq[Any](format.raw/*31.13*/("""
					"""),format.raw/*32.6*/("""<a href=""""),_display_(/*32.16*/routes/*32.22*/.LoginController.login()),format.raw/*32.46*/("""">Projects</a>
				""")))}),format.raw/*33.6*/("""
		    """),format.raw/*34.7*/("""</li>
			<li """),_display_(/*35.9*/if(pagename == "Project")/*35.34*/{_display_(Seq[Any](format.raw/*35.35*/("""class ="active"""")))}),format.raw/*35.51*/(""">
				"""),_display_(/*36.6*/if((employee != null) && ("manager".equals(employee.getRole())))/*36.70*/ {_display_(Seq[Any](format.raw/*36.72*/("""
					"""),format.raw/*37.6*/("""<a href=""""),_display_(/*37.16*/routes/*37.22*/.ProjectController.projects()),format.raw/*37.51*/("""">Projects</a>
				""")))}),format.raw/*38.6*/("""
			"""),format.raw/*39.4*/("""</li>	
			<li """),_display_(/*40.9*/if(pagename == "Employees")/*40.36*/{_display_(Seq[Any](format.raw/*40.37*/("""class ="active"""")))}),format.raw/*40.53*/(""">
				"""),_display_(/*41.6*/if((employee != null) && ("manager".equals(employee.getRole())))/*41.70*/ {_display_(Seq[Any](format.raw/*41.72*/("""
					"""),format.raw/*42.6*/("""<a href=""""),_display_(/*42.16*/routes/*42.22*/.EmployeeCRUDController.addEmployee()),format.raw/*42.59*/("""">Employee CRUD</a>
				""")))}/*43.7*/else if((employee != null) && ("employee".equals(employee.getRole())))/*43.78*/ {_display_(Seq[Any](format.raw/*43.80*/("""
					"""),format.raw/*44.6*/("""<a href=""""),_display_(/*44.16*/routes/*44.22*/.EmployeeCRUDController.usersEmployee()),format.raw/*44.61*/("""">Employees</a>
				""")))}/*45.7*/else/*45.12*/{_display_(Seq[Any](format.raw/*45.13*/("""
					"""),format.raw/*46.6*/("""<a href=""""),_display_(/*46.16*/routes/*46.22*/.LoginController.login()),format.raw/*46.46*/("""">Employees</a>
				""")))}),format.raw/*47.6*/("""
			"""),format.raw/*48.4*/("""</li>
			<li """),_display_(/*49.9*/if(pagename == "Employees")/*49.36*/{_display_(Seq[Any](format.raw/*49.37*/("""class ="active"""")))}),format.raw/*49.53*/(""">
				"""),_display_(/*50.6*/if((employee != null) && ("manager".equals(employee.getRole())))/*50.70*/ {_display_(Seq[Any](format.raw/*50.72*/("""
					"""),format.raw/*51.6*/("""<a href=""""),_display_(/*51.16*/routes/*51.22*/.EmployeeCRUDController.usersEmployee()),format.raw/*51.61*/("""">Employees</a>
				""")))}),format.raw/*52.6*/("""
			"""),format.raw/*53.4*/("""</li>	
			<li """),_display_(/*54.9*/if(pagename == "Login")/*54.32*/{_display_(Seq[Any](format.raw/*54.33*/("""class ="active"""")))}),format.raw/*54.49*/(""">
				"""),_display_(/*55.6*/if(employee != null)/*55.26*/ {_display_(Seq[Any](format.raw/*55.28*/("""
					"""),format.raw/*56.6*/("""<a href=""""),_display_(/*56.16*/routes/*56.22*/.LoginController.logout()),format.raw/*56.47*/("""">Logout</a>
				""")))}/*57.7*/else/*57.12*/{_display_(Seq[Any](format.raw/*57.13*/("""
					"""),format.raw/*58.6*/("""<a href=""""),_display_(/*58.16*/routes/*58.22*/.LoginController.login()),format.raw/*58.46*/("""">Login</a>
				""")))}),format.raw/*59.6*/("""
			"""),format.raw/*60.4*/("""<li>
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
                """),_display_(/*76.18*/content),format.raw/*76.25*/("""
		    """),format.raw/*77.7*/("""</div>
		</div>
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>Next product launch!</h2>
			<h3>Countdown to our next product release!</h3>
			<p id="demo"></p>

    <script>
        var countDownDate = new Date("Jan 5, 2021 15:37:25").getTime();

        var x = setInterval(function() """),format.raw/*88.40*/("""{"""),format.raw/*88.41*/("""

        """),format.raw/*90.9*/("""var now = new Date().getTime();
    
        var distance = countDownDate - now;
    
        var days = Math.floor(distance / (1000 * 60 * 60 * 24));
        var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
        var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    
        document.getElementById("demo").innerHTML = days + "d " + hours + "h "
         + minutes + "m " + seconds + "s ";
    
        if (distance < 0) """),format.raw/*102.27*/("""{"""),format.raw/*102.28*/("""
         """),format.raw/*103.10*/("""clearInterval(x);
         document.getElementById("demo").innerHTML = "EXPIRED";
             """),format.raw/*105.14*/("""}"""),format.raw/*105.15*/("""
                """),format.raw/*106.17*/("""}"""),format.raw/*106.18*/(""", 1000);
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
	<script src=""""),_display_(/*119.16*/routes/*119.22*/.Assets.versioned("javascripts/main.js")),format.raw/*119.62*/(""""></script>
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
                  DATE: Mon Mar 18 21:01:12 GMT 2019
                  SOURCE: /home/wdd/ca1sDev18032019/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/main.scala.html
                  HASH: 2624d7e68ac7a3bc5c15d545401b8dae17b09058
                  MATRIX: 974->1|1134->68|1416->323|1444->324|1472->325|1557->383|1585->384|1618->390|1655->399|1684->400|1713->401|1789->449|1818->450|1851->456|1891->468|1920->469|1949->470|1996->489|2025->490|2058->496|2097->507|2126->508|2155->509|2239->565|2268->566|2301->572|2340->583|2369->584|2398->585|2464->623|2493->624|2526->630|2563->639|2592->640|2621->641|2661->653|2690->654|2719->656|3016->927|3047->949|3086->950|3133->966|3171->977|3186->983|3230->1006|3283->1032|3317->1057|3356->1058|3403->1074|3436->1081|3509->1145|3549->1147|3582->1153|3619->1163|3634->1169|3686->1200|3728->1225|3807->1296|3847->1298|3880->1304|3917->1314|3932->1320|3982->1349|4020->1370|4033->1375|4072->1376|4105->1382|4142->1392|4157->1398|4202->1422|4252->1442|4286->1449|4326->1463|4360->1488|4399->1489|4446->1505|4479->1512|4552->1576|4592->1578|4625->1584|4662->1594|4677->1600|4727->1629|4777->1649|4808->1653|4849->1668|4885->1695|4924->1696|4971->1712|5004->1719|5077->1783|5117->1785|5150->1791|5187->1801|5202->1807|5260->1844|5303->1870|5382->1941|5422->1943|5455->1949|5492->1959|5507->1965|5567->2004|5606->2026|5619->2031|5658->2032|5691->2038|5728->2048|5743->2054|5788->2078|5839->2099|5870->2103|5910->2117|5946->2144|5985->2145|6032->2161|6065->2168|6138->2232|6178->2234|6211->2240|6248->2250|6263->2256|6323->2295|6374->2316|6405->2320|6446->2335|6478->2358|6517->2359|6564->2375|6597->2382|6626->2402|6666->2404|6699->2410|6736->2420|6751->2426|6797->2451|6833->2470|6846->2475|6885->2476|6918->2482|6955->2492|6970->2498|7015->2522|7062->2539|7093->2543|7526->2949|7554->2956|7588->2963|7921->3268|7950->3269|7987->3279|8559->3822|8589->3823|8628->3833|8752->3928|8782->3929|8828->3946|8858->3947|9122->4183|9138->4189|9200->4229
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|63->32|64->33|65->34|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|70->39|71->40|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|77->46|78->47|79->48|80->49|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|82->51|83->52|84->53|85->54|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|91->60|107->76|107->76|108->77|119->88|119->88|121->90|133->102|133->102|134->103|136->105|136->105|137->106|137->106|150->119|150->119|150->119
                  -- GENERATED --
              */
          