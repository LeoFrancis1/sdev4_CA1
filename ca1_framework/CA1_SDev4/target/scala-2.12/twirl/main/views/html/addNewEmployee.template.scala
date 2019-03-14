
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
    
        """),_display_(/*23.10*/form(action=routes.EmployeeCRUDController.addEmployeeSubmit, 'class -> "form-horizontal",
         'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*24.80*/ {_display_(Seq[Any](format.raw/*24.82*/("""
            """),format.raw/*25.41*/("""
            """),format.raw/*27.89*/("""
            """),_display_(/*28.14*/CSRF/*28.18*/.formField),format.raw/*28.28*/("""
    
            """),_display_(/*30.14*/select(
                empForm("department.id"),
                options(Department.options),
                '_label -> "Department", '_default -> "--Choose a Department--",
                '_showConstraints -> false, 'class -> "form-control"
            )),format.raw/*35.14*/("""
            """),_display_(/*36.14*/inputText(empForm)/*36.32*/("email")),format.raw/*36.41*/(""", '_label -> "Email", 'class -> "form-control")
            """),_display_(/*37.14*/inputText(empForm)/*37.32*/("name")),format.raw/*37.40*/(""", '_label -> "Name", 'class -> "form-control")
            """),_display_(/*38.14*/inputText(aForm)/*38.30*/("address1")),format.raw/*38.42*/(""", '_label -> "Address 1", 'class -> "form-control")
            """),_display_(/*39.14*/inputText(aForm)/*39.30*/("address2")),format.raw/*39.42*/(""", '_label -> "Address 2", 'class -> "form-control")
            """),_display_(/*40.14*/inputText(aForm)/*40.30*/("town/city")),format.raw/*40.43*/(""", '_label -> "Town / City", 'class -> "form-control")
            """),_display_(/*41.14*/inputText(aForm)/*41.30*/("eircode")),format.raw/*41.41*/(""", '_label -> "Eircode", 'class -> "form-control")
            """),_display_(/*42.14*/inputText(empForm)/*42.32*/("jobTitle")),format.raw/*42.44*/(""", '_label -> "Job Title", 'class -> "form-control")
            """),_display_(/*43.14*/inputText(empForm)/*43.32*/("workPhone")),format.raw/*43.45*/(""", '_label -> "Work Phone", 'class -> "form-control")
            """),_display_(/*44.14*/inputText(empForm)/*44.32*/("salary")),format.raw/*44.42*/(""", '_label -> "Salary", 'class -> "form-control")
            """),_display_(/*45.14*/inputText(empForm)/*45.32*/("password")),format.raw/*45.44*/(""", '_label -> "Password", 'class -> "form-control")
    
            <label>Image Upload</label>
            <input class="btn-sm btn-default" type="file" name="upload">

            """),_display_(/*50.14*/inputText(empForm)/*50.32*/("role")/*50.40*/.copy(value=Some("employee"))),format.raw/*50.69*/(""", '_label -> "", 'hidden -> "hidden")
            """),_display_(/*51.14*/inputText(empForm)/*51.32*/("email")),format.raw/*51.41*/(""", '_label -> "", 'hidden -> "hidden")
    
            <div class="actions">
                <input type="submit" value="Add/Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*55.27*/routes/*55.33*/.EmployeeCRUDController.usersEmployee()),format.raw/*55.72*/("""">
                    <button type="button" class="btn btn-warning"></button>
                </a>
            </div>
    """)))}),format.raw/*59.23*/("""
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
                  DATE: Thu Mar 14 21:28:20 GMT 2019
                  SOURCE: /home/wdd/sdev4ca1v2/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/addNewEmployee.scala.html
                  HASH: 98accdb0d6728ce8c04a628e120e1a1c3a990883
                  MATRIX: 1027->1|1204->107|1248->123|1275->125|1316->158|1355->160|1386->165|1484->238|1519->265|1558->267|1593->276|1664->321|1709->351|1748->353|1793->371|1803->372|1832->380|1882->399|1918->405|1954->414|1990->424|2024->449|2064->451|2100->460|2172->505|2216->533|2256->535|2301->553|2311->554|2340->562|2390->581|2426->590|2466->600|2498->605|2561->641|2739->810|2779->812|2820->853|2861->1022|2902->1036|2915->1040|2946->1050|2992->1069|3271->1327|3312->1341|3339->1359|3369->1368|3457->1429|3484->1447|3513->1455|3600->1515|3625->1531|3658->1543|3750->1608|3775->1624|3808->1636|3900->1701|3925->1717|3959->1730|4053->1797|4078->1813|4110->1824|4200->1887|4227->1905|4260->1917|4352->1982|4379->2000|4413->2013|4506->2079|4533->2097|4564->2107|4653->2169|4680->2187|4713->2199|4923->2382|4950->2400|4967->2408|5017->2437|5095->2488|5122->2506|5152->2515|5372->2708|5387->2714|5447->2753|5602->2894
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|51->20|52->21|54->23|55->24|55->24|56->25|57->27|58->28|58->28|58->28|60->30|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|80->50|80->50|80->50|80->50|81->51|81->51|81->51|85->55|85->55|85->55|89->59
                  -- GENERATED --
              */
          