
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

object addNewEmployee extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.Employee],Form[models.users.Address],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(empForm: Form[models.users.Employee],aForm: Form[models.users.Address],employee: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add New Employee",employee)/*4.35*/ {_display_(Seq[Any](format.raw/*4.37*/("""
    """),format.raw/*5.5*/("""<h3>Add New Employee</h3>
    <!--Displays possible login errors-->
    """),_display_(/*7.6*/if(empForm.hasGlobalErrors)/*7.33*/ {_display_(Seq[Any](format.raw/*7.35*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
            """),_display_(/*9.14*/for(e <- empForm.globalErrors) yield /*9.44*/ {_display_(Seq[Any](format.raw/*9.46*/("""
                """),_display_(/*10.18*/e/*10.19*/.message),format.raw/*10.27*/("""<br/>
            """)))}),format.raw/*11.14*/("""
    """)))}),format.raw/*12.6*/("""
        """),format.raw/*13.9*/("""</p>
    """),_display_(/*14.6*/if(aForm.hasGlobalErrors)/*14.31*/ {_display_(Seq[Any](format.raw/*14.33*/("""
        """),format.raw/*15.9*/("""<p class="alert alert-warning">
            """),_display_(/*16.14*/for(e <- aForm.globalErrors) yield /*16.42*/ {_display_(Seq[Any](format.raw/*16.44*/("""
                """),_display_(/*17.18*/e/*17.19*/.message),format.raw/*17.27*/("""<br/>
            """)))}),format.raw/*18.14*/("""
        """),format.raw/*19.9*/("""</p>
    """)))}),format.raw/*20.6*/("""
    """),format.raw/*21.5*/("""<!--the login form-->
    
        """),_display_(/*23.10*/form(action =routes.EmployeeCRUDController.addEmployeeSubmit, 'class -> "form-horizontal", 'role -> "form")/*23.117*/ {_display_(Seq[Any](format.raw/*23.119*/("""
            """),format.raw/*24.41*/("""
            """),format.raw/*26.89*/("""
            """),_display_(/*27.14*/CSRF/*27.18*/.formField),format.raw/*27.28*/("""
    
            """),_display_(/*29.14*/inputText(empForm)/*29.32*/("email")),format.raw/*29.41*/(""", '_label -> "Email", 'class -> "form-control")
            """),_display_(/*30.14*/inputText(empForm)/*30.32*/("name")),format.raw/*30.40*/(""", '_label -> "Name", 'class -> "form-control")
            """),_display_(/*31.14*/inputText(aForm)/*31.30*/("address1")),format.raw/*31.42*/(""", '_label -> "Address 1", 'class -> "form-control")
            """),_display_(/*32.14*/inputText(aForm)/*32.30*/("address2")),format.raw/*32.42*/(""", '_label -> "Address 2", 'class -> "form-control")
            """),_display_(/*33.14*/inputText(aForm)/*33.30*/("town/city")),format.raw/*33.43*/(""", '_label -> "Town / City", 'class -> "form-control")
            """),_display_(/*34.14*/inputText(aForm)/*34.30*/("eircode")),format.raw/*34.41*/(""", '_label -> "Eircode", 'class -> "form-control")
            """),_display_(/*35.14*/inputText(empForm)/*35.32*/("jobTitle")),format.raw/*35.44*/(""", '_label -> "Job Title", 'class -> "form-control")
            """),_display_(/*36.14*/inputText(empForm)/*36.32*/("workPhone")),format.raw/*36.45*/(""", '_label -> "Work Phone", 'class -> "form-control")
            """),_display_(/*37.14*/inputText(empForm)/*37.32*/("salary")),format.raw/*37.42*/(""", '_label -> "Salary", 'class -> "form-control")
            """),_display_(/*38.14*/inputText(empForm)/*38.32*/("password")),format.raw/*38.44*/(""", '_label -> "Password", 'class -> "form-control")
    
            """),_display_(/*40.14*/inputText(empForm)/*40.32*/("role")/*40.40*/.copy(value=Some("employee"))),format.raw/*40.69*/(""", '_label -> "", 'hidden -> "hidden")
            """),_display_(/*41.14*/inputText(empForm)/*41.32*/("")),format.raw/*41.36*/(""", '_label -> "", 'hidden -> "hidden")
    
            <div class="actions">
                <input type="submit" value="Add/Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*45.27*/routes/*45.33*/.EmployeeCRUDController.usersEmployee()),format.raw/*45.72*/("""">
                    <button type="button" class="btn btn-warning"></button>
                </a>
            </div>
    """)))}),format.raw/*49.23*/("""
""")))}))
      }
    }
  }

  def render(empForm:Form[models.users.Employee],aForm:Form[models.users.Address],employee:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(empForm,aForm,employee)

  def f:((Form[models.users.Employee],Form[models.users.Address],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (empForm,aForm,employee) => apply(empForm,aForm,employee)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 21:41:36 GMT 2019
                  SOURCE: /home/wdd/sdev4ca1v2/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/addNewEmployee.scala.html
                  HASH: 8a38cdf96b1b8faf31da8809da8a3d61d71e1d62
                  MATRIX: 1027->1|1204->107|1248->123|1275->125|1316->158|1355->160|1386->165|1484->238|1519->265|1558->267|1593->276|1664->321|1709->351|1748->353|1793->371|1803->372|1832->380|1882->399|1918->405|1954->414|1990->424|2024->449|2064->451|2100->460|2172->505|2216->533|2256->535|2301->553|2311->554|2340->562|2390->581|2426->590|2466->600|2498->605|2561->641|2678->748|2719->750|2760->791|2801->960|2842->974|2855->978|2886->988|2932->1007|2959->1025|2989->1034|3077->1095|3104->1113|3133->1121|3220->1181|3245->1197|3278->1209|3370->1274|3395->1290|3428->1302|3520->1367|3545->1383|3579->1396|3673->1463|3698->1479|3730->1490|3820->1553|3847->1571|3880->1583|3972->1648|3999->1666|4033->1679|4126->1745|4153->1763|4184->1773|4273->1835|4300->1853|4333->1865|4429->1934|4456->1952|4473->1960|4523->1989|4601->2040|4628->2058|4653->2062|4873->2255|4888->2261|4948->2300|5103->2441
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|51->20|52->21|54->23|54->23|54->23|55->24|56->26|57->27|57->27|57->27|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|70->40|70->40|70->40|70->40|71->41|71->41|71->41|75->45|75->45|75->45|79->49
                  -- GENERATED --
              */
          