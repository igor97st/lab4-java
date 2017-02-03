
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.73*/("""
"""),_display_(/*5.2*/main("Login", user)/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
  """),format.raw/*6.3*/("""<!-- HTML content for the index view -->
    <div class="col-xs-4">
        <h3>Sign in</h3>
            <!-- Display login errors if they exist -->
        """),_display_(/*10.10*/if(loginForm.hasGlobalErrors)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
            """),format.raw/*11.13*/("""<p class="alert alert-warning">
            """),_display_(/*12.14*/loginForm/*12.23*/.globalError.message),format.raw/*12.43*/("""
            """),format.raw/*13.13*/("""</p>
        """)))}),format.raw/*14.10*/("""
        """),_display_(/*15.10*/if(flash.containsKey("error"))/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
            """),format.raw/*16.13*/("""<div class="alert alert-warning">
            """),_display_(/*17.14*/flash/*17.19*/.get("loginRequired")),format.raw/*17.40*/("""
            """),format.raw/*18.13*/("""</div>
        """)))}),format.raw/*19.10*/("""
            """),format.raw/*20.13*/("""<!-- The login form -->
        """),_display_(/*21.10*/helper/*21.16*/.form(action = controllers.security.routes.LoginController.loginSubmit())/*21.89*/ {_display_(Seq[Any](format.raw/*21.91*/("""

            """),format.raw/*23.13*/("""<div class="form-group">
                """),_display_(/*24.18*/inputText(loginForm("email"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*24.121*/("""
            """),format.raw/*25.13*/("""</div>
            <div class="form-group">
                """),_display_(/*27.18*/inputPassword(loginForm("password"), '_label -> "",'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*27.131*/("""
            """),format.raw/*28.13*/("""</div>

                <!-- Add a submit button -->
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Fri Feb 03 11:18:08 GMT 2017
                  SOURCE: /home/wdd/webapps/Lab4-Inheritance-ManyToMany/app/views/login.scala.html
                  HASH: eee31b84c6c2c86f0c296d5c8f85b529064e31b6
                  MATRIX: 781->1|953->63|980->81|1008->154|1035->156|1062->175|1101->177|1130->180|1315->338|1353->367|1393->369|1434->382|1506->427|1524->436|1565->456|1606->469|1651->483|1688->493|1727->523|1767->525|1808->538|1882->585|1896->590|1938->611|1979->624|2026->640|2067->653|2127->686|2142->692|2224->765|2264->767|2306->781|2375->823|2500->926|2541->939|2629->1000|2764->1113|2805->1126|3032->1322|3064->1327
                  LINES: 27->1|32->1|33->3|34->4|35->5|35->5|35->5|36->6|40->10|40->10|40->10|41->11|42->12|42->12|42->12|43->13|44->14|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|50->20|51->21|51->21|51->21|51->21|53->23|54->24|54->24|55->25|57->27|57->27|58->28|64->34|65->35
                  -- GENERATED --
              */
          