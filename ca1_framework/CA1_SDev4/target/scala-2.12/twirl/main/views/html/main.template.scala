
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
					"""),format.raw/*30.6*/("""<a href=""""),_display_(/*30.16*/routes/*30.22*/.ProjectController.projects()),format.raw/*30.51*/("""">Projects</a><li>
				""")))}/*31.7*/else/*31.12*/{_display_(Seq[Any](format.raw/*31.13*/("""
					"""),format.raw/*32.6*/("""<a href=""""),_display_(/*32.16*/routes/*32.22*/.LoginController.login()),format.raw/*32.46*/("""">Projects</a>
				""")))}),format.raw/*33.6*/("""
		    """),format.raw/*34.7*/("""</li>
				
			<li """),_display_(/*36.9*/if(pagename == "Employees")/*36.36*/{_display_(Seq[Any](format.raw/*36.37*/("""class ="active"""")))}),format.raw/*36.53*/(""">
				"""),_display_(/*37.6*/if((employee != null) && ("manager".equals(employee.getRole())))/*37.70*/ {_display_(Seq[Any](format.raw/*37.72*/("""
					"""),format.raw/*38.6*/("""<a href=""""),_display_(/*38.16*/routes/*38.22*/.EmployeeCRUDController.addEmployee()),format.raw/*38.59*/("""">Employee CRUD</a>
				""")))}/*39.7*/else if((employee != null) && ("employee".equals(employee.getRole())))/*39.78*/ {_display_(Seq[Any](format.raw/*39.80*/("""
					"""),format.raw/*40.6*/("""<a href=""""),_display_(/*40.16*/routes/*40.22*/.EmployeeCRUDController.usersEmployee()),format.raw/*40.61*/("""">Employees</a>
				""")))}/*41.7*/else/*41.12*/{_display_(Seq[Any](format.raw/*41.13*/("""
					"""),format.raw/*42.6*/("""<a href=""""),_display_(/*42.16*/routes/*42.22*/.LoginController.login()),format.raw/*42.46*/("""">Employees</a>
				""")))}),format.raw/*43.6*/("""
			"""),format.raw/*44.4*/("""</li>	
			<li """),_display_(/*45.9*/if(pagename == "Login")/*45.32*/{_display_(Seq[Any](format.raw/*45.33*/("""class ="active"""")))}),format.raw/*45.49*/(""">
				"""),_display_(/*46.6*/if(employee != null)/*46.26*/ {_display_(Seq[Any](format.raw/*46.28*/("""
					"""),format.raw/*47.6*/("""<a href=""""),_display_(/*47.16*/routes/*47.22*/.LoginController.logout()),format.raw/*47.47*/("""">Logout</a>
				""")))}/*48.7*/else/*48.12*/{_display_(Seq[Any](format.raw/*48.13*/("""
					"""),format.raw/*49.6*/("""<a href=""""),_display_(/*49.16*/routes/*49.22*/.LoginController.login()),format.raw/*49.46*/("""">Login</a>
				""")))}),format.raw/*50.6*/("""
			"""),format.raw/*51.4*/("""<li>
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
                """),_display_(/*67.18*/content),format.raw/*67.25*/("""
		    """),format.raw/*68.7*/("""</div>
		</div>
		<div class="col-sm-3">
		    <div class="well sidecol">
			<h2>Next product launch!</h2>
			<h3>Countdown to our next product release!</h3>
			<p id="demo"></p>

    <script>
        var countDownDate = new Date("Jan 5, 2021 15:37:25").getTime();

        var x = setInterval(function() """),format.raw/*79.40*/("""{"""),format.raw/*79.41*/("""

        """),format.raw/*81.9*/("""var now = new Date().getTime();
    
        var distance = countDownDate - now;
    
        var days = Math.floor(distance / (1000 * 60 * 60 * 24));
        var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
        var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    
        document.getElementById("demo").innerHTML = days + "d " + hours + "h "
         + minutes + "m " + seconds + "s ";
    
        if (distance < 0) """),format.raw/*93.27*/("""{"""),format.raw/*93.28*/("""
         """),format.raw/*94.10*/("""clearInterval(x);
         document.getElementById("demo").innerHTML = "EXPIRED";
             """),format.raw/*96.14*/("""}"""),format.raw/*96.15*/("""
                """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/(""", 1000);
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
	<script src=""""),_display_(/*110.16*/routes/*110.22*/.Assets.versioned("javascripts/main.js")),format.raw/*110.62*/(""""></script>
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
                  DATE: Mon Mar 18 15:21:32 GMT 2019
                  SOURCE: /home/wdd/ca1sDev18032019/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/main.scala.html
                  HASH: aeab918973a8e13b45ca227e7414f5136cee7ad0
                  MATRIX: 974->1|1134->68|1416->323|1444->324|1472->325|1557->383|1585->384|1618->390|1655->399|1684->400|1713->401|1789->449|1818->450|1851->456|1891->468|1920->469|1949->470|1996->489|2025->490|2058->496|2097->507|2126->508|2155->509|2239->565|2268->566|2301->572|2340->583|2369->584|2398->585|2464->623|2493->624|2526->630|2563->639|2592->640|2621->641|2661->653|2690->654|2719->656|3016->927|3047->949|3086->950|3133->966|3171->977|3186->983|3230->1006|3283->1032|3317->1057|3356->1058|3403->1074|3436->1081|3509->1145|3549->1147|3582->1153|3619->1163|3634->1169|3686->1200|3728->1225|3807->1296|3847->1298|3880->1304|3917->1314|3932->1320|3982->1349|4024->1374|4037->1379|4076->1380|4109->1386|4146->1396|4161->1402|4206->1426|4256->1446|4290->1453|4335->1472|4371->1499|4410->1500|4457->1516|4490->1523|4563->1587|4603->1589|4636->1595|4673->1605|4688->1611|4746->1648|4789->1674|4868->1745|4908->1747|4941->1753|4978->1763|4993->1769|5053->1808|5092->1830|5105->1835|5144->1836|5177->1842|5214->1852|5229->1858|5274->1882|5325->1903|5356->1907|5397->1922|5429->1945|5468->1946|5515->1962|5548->1969|5577->1989|5617->1991|5650->1997|5687->2007|5702->2013|5748->2038|5784->2057|5797->2062|5836->2063|5869->2069|5906->2079|5921->2085|5966->2109|6013->2126|6044->2130|6477->2536|6505->2543|6539->2550|6872->2855|6901->2856|6938->2866|7509->3409|7538->3410|7576->3420|7699->3515|7728->3516|7773->3533|7802->3534|8066->3770|8082->3776|8144->3816
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|63->32|64->33|65->34|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|74->43|75->44|76->45|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|80->49|81->50|82->51|98->67|98->67|99->68|110->79|110->79|112->81|124->93|124->93|125->94|127->96|127->96|128->97|128->97|141->110|141->110|141->110
                  -- GENERATED --
              */
          