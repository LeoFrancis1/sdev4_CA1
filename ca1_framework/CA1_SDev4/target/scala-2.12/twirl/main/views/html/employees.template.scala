
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Employee],List[models.Department],models.users.Employee,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee], departments: List[models.Department], employee: models.users.Employee, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employee",employee)/*2.27*/{_display_(Seq[Any](format.raw/*2.28*/("""
	"""),format.raw/*3.2*/("""<h1>Current Employees</h1>
	<div class="col-sm-3">
		<h4>Departments</h4>
		<ul class="list-group">
			"""),_display_(/*7.5*/for(d <- departments) yield /*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
				"""),format.raw/*8.5*/("""<li class="list-group-item catheight">"""),_display_(/*8.44*/d/*8.45*/.getDeptName),format.raw/*8.57*/("""
					"""),format.raw/*9.6*/("""<span class="badge">"""),_display_(/*9.27*/d/*9.28*/.getEmpList.size),format.raw/*9.44*/("""</span>
				</li>
			""")))}),format.raw/*11.5*/("""
		"""),format.raw/*12.3*/("""</ul>
	</div>
	<div class="col-sm-9">
		<table class="table table-bordered table-hover table-condensed">
			<thead>
				<tr>
					<th>Image</th>
					<th>Name</th>
					<th>Department</th>
					<th>Job Title</th>
					<th>Phone No.</th>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*26.6*/for(e<-employees) yield /*26.23*/{_display_(Seq[Any](format.raw/*26.24*/("""
				"""),format.raw/*27.5*/("""<tr>
					"""),_display_(/*28.7*/if(env.resource("public/images/employeeProfiles/"+e.getId +"thumb.jpg").isDefined)/*28.89*/{_display_(Seq[Any](format.raw/*28.90*/("""
						"""),format.raw/*29.7*/("""<td><img src="public/images/employeeProfiles/a(e.getId + "thumb.jpg")"/></td>
					""")))}/*30.8*/else/*30.13*/{_display_(Seq[Any](format.raw/*30.14*/("""
						"""),format.raw/*31.7*/("""<td><img src="public/images/employeeProfiles/noImage.jpg"/></td>
					""")))}),format.raw/*32.7*/("""
					"""),format.raw/*33.6*/("""<td>"""),_display_(/*33.11*/e/*33.12*/.getName),format.raw/*33.20*/("""</td>
					
					<td>"""),_display_(/*35.11*/e/*35.12*/.getDepartment.getDeptName),format.raw/*35.38*/("""</td>
					<td>"""),_display_(/*36.11*/e/*36.12*/.getJobTitle),format.raw/*36.24*/("""</td>
					<td>"""),_display_(/*37.11*/e/*37.12*/.getWorkPhone),format.raw/*37.25*/("""</td>
					<td>
						<a href=""""),_display_(/*39.17*/routes/*39.23*/.EmployeeCRUDController.updateEmployee(e.getId)),format.raw/*39.70*/("""" class ="button-xs btn-danger"onclick="return confirmDel();">
							<span class="glyphicon glyphicon-pencil"></span>
						</a>
					</td>
					<td>
						<a href=""""),_display_(/*44.17*/routes/*44.23*/.EmployeeCRUDController.removeEmployee(e.getId)),format.raw/*44.70*/("""" class ="button-xs btn-danger"onclick="return confirmDel();">
							<span class="glyphicon glyphicon-trash"></span>
						</a>
					</td>
				</tr>
				""")))}),format.raw/*49.6*/("""
			"""),format.raw/*50.4*/("""</tbody>
		</table>
	</div>
	
""")))}),format.raw/*54.2*/("""
"""))
      }
    }
  }

  def render(employees:List[models.users.Employee],departments:List[models.Department],employee:models.users.Employee,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(employees,departments,employee,env)

  def f:((List[models.users.Employee],List[models.Department],models.users.Employee,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (employees,departments,employee,env) => apply(employees,departments,employee,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 21:01:12 GMT 2019
                  SOURCE: /home/wdd/ca1sDev18032019/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/employees.scala.html
                  HASH: 3605b423dd488b0a12a3d074591cd3b64e90f3c2
                  MATRIX: 1040->1|1272->141|1305->166|1343->167|1371->169|1500->273|1536->294|1575->296|1606->301|1671->340|1680->341|1712->353|1744->359|1791->380|1800->381|1836->397|1888->419|1918->422|2219->697|2252->714|2291->715|2323->720|2360->731|2451->813|2490->814|2524->821|2626->906|2639->911|2678->912|2712->919|2813->990|2846->996|2878->1001|2888->1002|2917->1010|2966->1032|2976->1033|3023->1059|3066->1075|3076->1076|3109->1088|3152->1104|3162->1105|3196->1118|3255->1150|3270->1156|3338->1203|3532->1370|3547->1376|3615->1423|3800->1578|3831->1582|3892->1613
                  LINES: 28->1|33->2|33->2|33->2|34->3|38->7|38->7|38->7|39->8|39->8|39->8|39->8|40->9|40->9|40->9|40->9|42->11|43->12|57->26|57->26|57->26|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|64->33|64->33|64->33|64->33|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|70->39|70->39|70->39|75->44|75->44|75->44|80->49|81->50|85->54
                  -- GENERATED --
              */
          