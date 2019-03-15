
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Employee],List[models.Department],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee], departments: List[models.Department], employee: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employee",employee)/*2.27*/{_display_(Seq[Any](format.raw/*2.28*/("""
	"""),format.raw/*3.2*/("""<h1>Current Employees</h1>
	<div class="col-sm-3">
		<h4>Departments</h4>
		<ul class="list-group">
			"""),_display_(/*7.5*/for(d <- departments) yield /*7.26*/{_display_(Seq[Any](format.raw/*7.27*/("""
				"""),format.raw/*8.5*/("""<li class=list-group-item catheight">"""),_display_(/*8.43*/d/*8.44*/.getDeptName),format.raw/*8.56*/("""
					"""),format.raw/*9.6*/("""<span class="badge">'d.getEmpList.size</span>
				</li>
			""")))}),format.raw/*11.5*/("""
		"""),format.raw/*12.3*/("""</ul>
	</div>
	<div class="col-sm-9">
		<table class="table table-bordered table-hover table-condensed">
			<thead>
				<tr>
					<th>Name</th>
					<th>Department</th>
					<th>Job Title</th>
					<th>Phone No.</th>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*25.6*/for(e<-employees) yield /*25.23*/{_display_(Seq[Any](format.raw/*25.24*/("""
				"""),format.raw/*26.5*/("""<tr>
					<td>"""),_display_(/*27.11*/e/*27.12*/.getName),format.raw/*27.20*/("""</td>
					<td>"""),_display_(/*28.11*/e/*28.12*/.getDepartment),format.raw/*28.26*/("""</td>
					<td>"""),_display_(/*29.11*/e/*29.12*/.getJobTitle),format.raw/*29.24*/("""</td>
					<td>"""),_display_(/*30.11*/e/*30.12*/.getWorkPhone),format.raw/*30.25*/("""</td>
				</tr>
				""")))}),format.raw/*32.6*/("""
			"""),format.raw/*33.4*/("""</tbody>
		</table>
	</div>
	
""")))}),format.raw/*37.2*/("""
"""))
      }
    }
  }

  def render(employees:List[models.users.Employee],departments:List[models.Department],employee:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(employees,departments,employee)

  def f:((List[models.users.Employee],List[models.Department],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (employees,departments,employee) => apply(employees,departments,employee)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 12:51:08 GMT 2019
                  SOURCE: /home/wdd/sdev4ca1v2/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/employees.scala.html
                  HASH: 97d843400f4b5ba3478e2f6ac4a2c4ff8c1a0b8e
                  MATRIX: 1019->1|1224->114|1257->139|1295->140|1323->142|1452->246|1488->267|1526->268|1557->273|1621->311|1630->312|1662->324|1694->330|1784->390|1814->393|2095->648|2128->665|2167->666|2199->671|2241->686|2251->687|2280->695|2323->711|2333->712|2368->726|2411->742|2421->743|2454->755|2497->771|2507->772|2541->785|2592->806|2623->810|2684->841
                  LINES: 28->1|33->2|33->2|33->2|34->3|38->7|38->7|38->7|39->8|39->8|39->8|39->8|40->9|42->11|43->12|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|63->32|64->33|68->37
                  -- GENERATED --
              */
          