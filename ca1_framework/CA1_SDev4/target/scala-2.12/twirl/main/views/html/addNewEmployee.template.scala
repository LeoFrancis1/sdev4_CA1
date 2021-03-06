
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
        'role -> "form", 'method -> "POST", 'enctype -> "multipart/form-data")/*24.79*/ {_display_(Seq[Any](format.raw/*24.81*/("""
            """),format.raw/*25.41*/("""
            """),format.raw/*27.89*/("""
            """),_display_(/*28.14*/CSRF/*28.18*/.formField),format.raw/*28.28*/("""
    
            

            """),_display_(/*32.14*/inputText(empForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*32.87*/("""
            
            """),_display_(/*34.14*/inputText(empForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*34.85*/("""
            """),_display_(/*35.14*/inputText(aForm("address1"), '_label -> "Address 1", 'class -> "form-control")),format.raw/*35.92*/("""
            """),_display_(/*36.14*/inputText(aForm("address2"), '_label -> "Address 2", 'class -> "form-control")),format.raw/*36.92*/("""
            """),_display_(/*37.14*/inputText(aForm("town/city"), '_label -> "Town / City", 'class -> "form-control")),format.raw/*37.95*/("""
            """),_display_(/*38.14*/inputText(aForm("eircode"), '_label -> "Eircode", 'class -> "form-control")),format.raw/*38.89*/("""
            """),_display_(/*39.14*/inputText(empForm("jobTitle"), '_label -> "Job Title", 'class -> "form-control")),format.raw/*39.94*/("""
            """),_display_(/*40.14*/inputText(empForm("workPhone"), '_label -> "Work Phone", 'class -> "form-control")),format.raw/*40.96*/("""
            """),_display_(/*41.14*/inputText(empForm("salary"), '_label -> "Salary", 'class -> "form-control")),format.raw/*41.89*/("""
            """),_display_(/*42.14*/inputText(empForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*42.93*/("""
    
            """),format.raw/*44.13*/("""<label>Image Upload</label>
            <input class="btn-sm btn-default" type="file" name="upload">

            """),_display_(/*47.14*/inputText(empForm("role").copy(value=Some("employee")), '_label -> "", 'hidden -> "hidden")),format.raw/*47.105*/("""
            """),_display_(/*48.14*/inputText(empForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*48.77*/("""
    
            """),format.raw/*50.13*/("""<div class="actions">
                <input type="submit" value="Add/Update Employee" class="btn btn-primary">
                <a href=""""),_display_(/*52.27*/routes/*52.33*/.EmployeeCRUDController.usersEmployee()),format.raw/*52.72*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*56.23*/("""
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
                  DATE: Mon Mar 18 21:01:12 GMT 2019
                  SOURCE: /home/wdd/ca1sDev18032019/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/addNewEmployee.scala.html
                  HASH: 82fc22086e902394b2ab5f73628d67ba4f49c2e1
                  MATRIX: 1027->1|1204->107|1248->123|1275->125|1316->158|1355->160|1386->165|1484->238|1519->265|1558->267|1593->276|1664->321|1709->351|1748->353|1793->371|1803->372|1832->380|1882->399|1918->405|1954->414|1990->424|2024->449|2064->451|2100->460|2172->505|2216->533|2256->535|2301->553|2311->554|2340->562|2390->581|2426->590|2466->600|2498->605|2561->641|2738->809|2778->811|2819->852|2860->1021|2901->1035|2914->1039|2945->1049|3005->1082|3099->1155|3153->1182|3245->1253|3286->1267|3385->1345|3426->1359|3525->1437|3566->1451|3668->1532|3709->1546|3805->1621|3846->1635|3947->1715|3988->1729|4091->1811|4132->1825|4228->1900|4269->1914|4369->1993|4415->2011|4557->2126|4670->2217|4711->2231|4795->2294|4841->2312|5006->2450|5021->2456|5081->2495|5242->2642
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|51->20|52->21|54->23|55->24|55->24|56->25|57->27|58->28|58->28|58->28|62->32|62->32|64->34|64->34|65->35|65->35|66->36|66->36|67->37|67->37|68->38|68->38|69->39|69->39|70->40|70->40|71->41|71->41|72->42|72->42|74->44|77->47|77->47|78->48|78->48|80->50|82->52|82->52|82->52|86->56
                  -- GENERATED --
              */
          