
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMain_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object adminMain_Scope1 {
import controllers.security.LoginController
import controllers.security

class adminMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.57*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
    </head>
    <body>
    <!-- start of nav section -->
    <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
                <a class="navbar-brand" href="/admin/products">Product Admin</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*24.22*/if(title == "Products")/*24.45*/{_display_(Seq[Any](format.raw/*24.46*/("""class="active"""")))}),format.raw/*24.61*/(""">
                    <a href=""""),_display_(/*25.31*/routes/*25.37*/.AdminController.products()),format.raw/*25.64*/("""">Products</a>
                </li>
                <!-- Login/ Logout  Link - Check if user logged in-->
                <li """),_display_(/*28.22*/if(title == "Login")/*28.42*/{_display_(Seq[Any](format.raw/*28.43*/("""class="active"""")))}),format.raw/*28.58*/(""">
                    """),_display_(/*29.22*/if(user != null)/*29.38*/ {_display_(Seq[Any](format.raw/*29.40*/("""
                        """),format.raw/*30.25*/("""<a href=""""),_display_(/*30.35*/controllers/*30.46*/.security.routes.LoginController.logout()),format.raw/*30.87*/("""">Logout """),_display_(/*30.97*/user/*30.101*/.getName()),format.raw/*30.111*/("""</a>
                    """)))}/*31.23*/else/*31.28*/{_display_(Seq[Any](format.raw/*31.29*/("""
                        """),format.raw/*32.25*/("""<a href=""""),_display_(/*32.35*/controllers/*32.46*/.security.routes.LoginController.login()),format.raw/*32.86*/("""">Login</a>
                    """)))}),format.raw/*33.22*/("""
                """),format.raw/*34.17*/("""</li>
            </ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*40.32*/("""
        """),_display_(/*41.10*/content),format.raw/*41.17*/("""
    """),format.raw/*42.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*51.19*/routes/*51.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*51.66*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}
}

/**/
object adminMain extends adminMain_Scope0.adminMain_Scope1.adminMain
              /*
                  -- GENERATED --
                  DATE: Fri Feb 03 11:18:08 GMT 2017
                  SOURCE: /home/wdd/webapps/Lab4-Inheritance-ManyToMany/app/views/admin/adminMain.scala.html
                  HASH: 64b93bc221353fafd55a7c748126c19d6ebbbf11
                  MATRIX: 886->75|1036->130|1064->132|1143->237|1178->246|1212->254|1237->259|1512->507|1527->513|1590->554|1678->615|1693->621|1754->660|2171->1050|2203->1073|2242->1074|2288->1089|2347->1121|2362->1127|2410->1154|2565->1282|2594->1302|2633->1303|2679->1318|2729->1341|2754->1357|2794->1359|2847->1384|2884->1394|2904->1405|2966->1446|3003->1456|3017->1460|3049->1470|3094->1497|3107->1502|3146->1503|3199->1528|3236->1538|3256->1549|3317->1589|3381->1622|3426->1639|3536->1811|3573->1821|3601->1828|3633->1833|3995->2168|4010->2174|4072->2215
                  LINES: 31->3|36->3|38->5|41->8|42->9|42->9|42->9|45->12|45->12|45->12|46->13|46->13|46->13|57->24|57->24|57->24|57->24|58->25|58->25|58->25|61->28|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|63->30|63->30|63->30|63->30|64->31|64->31|64->31|65->32|65->32|65->32|65->32|66->33|67->34|72->40|73->41|73->41|74->42|83->51|83->51|83->51
                  -- GENERATED --
              */
          