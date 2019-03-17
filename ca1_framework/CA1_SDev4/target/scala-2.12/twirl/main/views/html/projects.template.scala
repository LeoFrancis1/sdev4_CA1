
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

object projects extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Project],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projects: List[models.Project],
employee: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("projects",employee)/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""
    
    
    """),format.raw/*6.74*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

   

    """),format.raw/*15.5*/("""<div class="col-sm-9">
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <tr>
            
            <th>ID</th>
            <th>Project Name</th>
            <th>Start Date</th>
            <th>Finish Date</th>
            <th>Allocated Budget</th>
            
            
        </tr>
        </thead>
        <tbody>
       
            """),format.raw/*31.68*/("""
            """),_display_(/*32.14*/for(p<-projects) yield /*32.30*/ {_display_(Seq[Any](format.raw/*32.32*/("""
               """),format.raw/*33.16*/("""<tr>
                   

                  <td>"""),_display_(/*36.24*/p/*36.25*/.getId),format.raw/*36.31*/("""</td>
                  <td>"""),_display_(/*37.24*/p/*37.25*/.getProjectName),format.raw/*37.40*/("""</td>
                  <td>"""),_display_(/*38.24*/p/*38.25*/.getStartDate),format.raw/*38.38*/("""</td>
                  <td>"""),_display_(/*39.24*/p/*39.25*/.getFinishDate),format.raw/*39.39*/("""</td>
                  <td>"""),_display_(/*40.24*/p/*40.25*/.getAllocatedBudget),format.raw/*40.44*/("""</td>
                  

                  """),_display_(/*43.20*/if((employee != null) && ("manager".equals(employee.getRole())))/*43.84*/ {_display_(Seq[Any](format.raw/*43.86*/("""
						"""),format.raw/*44.7*/("""<td>
							<a href=""""),_display_(/*45.18*/routes/*45.24*/.ProjectController.updateProject(p.getId)),format.raw/*45.65*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
						<td>
							<a href=""""),_display_(/*50.18*/routes/*50.24*/.ProjectController.deleteProject(p.getId)),format.raw/*50.65*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                  """)))}),format.raw/*54.20*/("""
                  
               """),format.raw/*56.16*/("""</tr>
            """)))}),format.raw/*57.14*/("""
        
        """),format.raw/*59.9*/("""</tbody>
    </table>
    """),_display_(/*61.6*/if((employee != null) && ("manager".equals(employee.getRole())))/*61.70*/ {_display_(Seq[Any](format.raw/*61.72*/("""
    """),format.raw/*62.5*/("""<p>
        <a href=""""),_display_(/*63.19*/routes/*63.25*/.ProjectController.addProject()),format.raw/*63.56*/("""">
            <button class="btn btn-primary">Add a project/button>
        </a>
    </p>
    """)))}),format.raw/*67.6*/("""
"""),format.raw/*68.1*/("""</div>
</span>
 """)))}))
      }
    }
  }

  def render(projects:List[models.Project],employee:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(projects,employee)

  def f:((List[models.Project],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (projects,employee) => apply(projects,employee)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 20:21:26 GMT 2019
                  SOURCE: /home/wdd/ca1SDev16032019/sdev4_CA1/ca1_framework/CA1_SDev4/app/views/projects.scala.html
                  HASH: f48e14b88f3476a9b93fa78a00bc84fd08a390ab
                  MATRIX: 987->1|1146->68|1179->93|1217->94|1259->178|1287->181|1327->213|1366->215|1395->218|1458->256|1471->261|1506->276|1536->279|1574->287|1612->298|2036->749|2077->763|2109->779|2149->781|2193->797|2269->846|2279->847|2306->853|2362->882|2372->883|2408->898|2464->927|2474->928|2508->941|2564->970|2574->971|2609->985|2665->1014|2675->1015|2715->1034|2787->1079|2860->1143|2900->1145|2934->1152|2983->1174|2998->1180|3060->1221|3246->1380|3261->1386|3323->1427|3534->1607|3597->1642|3647->1661|3692->1679|3745->1706|3818->1770|3858->1772|3890->1777|3939->1799|3954->1805|4006->1836|4132->1932|4160->1933
                  LINES: 28->1|34->3|34->3|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|46->15|62->31|63->32|63->32|63->32|64->33|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|74->43|74->43|74->43|75->44|76->45|76->45|76->45|81->50|81->50|81->50|85->54|87->56|88->57|90->59|92->61|92->61|92->61|93->62|94->63|94->63|94->63|98->67|99->68
                  -- GENERATED --
              */
          