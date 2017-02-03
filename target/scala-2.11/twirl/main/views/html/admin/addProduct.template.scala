
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

     object addProduct_Scope1 {
import helper._
import models.products.Product
import models.products.Category

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[Product],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(addProductForm: play.data.Form[Product], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.95*/("""

"""),format.raw/*8.102*/("""

"""),_display_(/*10.2*/admin/*10.7*/.adminMain("Add Product", user)/*10.38*/ {_display_(Seq[Any](format.raw/*10.40*/("""
	"""),format.raw/*11.2*/("""<h3>Add a new Product</h3>
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*13.3*/form(action = routes.AdminController.addProductSubmit(), 'class -> "form-horizontal",
		'role->"form", 'enctype -> "multipart/form-data")/*14.52*/ {_display_(Seq[Any](format.raw/*14.54*/("""
		
		"""),format.raw/*16.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*18.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*18.81*/("""
		"""),_display_(/*19.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*19.95*/("""

		"""),_display_(/*21.4*/for((value, name) <- Category.options) yield /*21.42*/ {_display_(Seq[Any](format.raw/*21.44*/("""
			"""),format.raw/*22.4*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*22.54*/value),format.raw/*22.59*/(""""/>
			"""),_display_(/*23.5*/if(addProductForm("id").value() != null)/*23.45*/ {_display_(Seq[Any](format.raw/*23.47*/("""
				"""),_display_(/*24.6*/if(Category.inCategory(value.toLong, addProductForm("id").value().toLong))),format.raw/*24.80*/("""
			"""),format.raw/*25.4*/("""{"""),format.raw/*25.5*/("""
				"""),format.raw/*26.5*/("""checked
		    """),format.raw/*27.7*/("""}"""),format.raw/*27.8*/("""
		  """)))}),format.raw/*28.6*/("""
			"""),_display_(/*29.5*/name),format.raw/*29.9*/("""<br>
        """)))}),format.raw/*30.10*/("""


		"""),_display_(/*33.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*33.83*/("""
		"""),_display_(/*34.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*34.83*/("""

		"""),format.raw/*36.3*/("""<!-- Image upload input -->
		<div class="container-fluid">
			<div class="row">
				<label>Image</label>
			</div>
			<div class="row">
				"""),_display_(/*42.6*/if(env.resource("public/images/productImages/thumbnails/" + addProductForm("id").value() + ".jpg").isDefined)/*42.115*/ {_display_(Seq[Any](format.raw/*42.117*/("""
					"""),format.raw/*43.6*/("""<p><img src="/assets/images/productImages/thumbnails/"""),_display_(/*43.60*/(addProductForm("id").value() + ".jpg")),format.raw/*43.99*/(""""/></p>
				""")))}/*44.7*/else/*44.12*/{_display_(Seq[Any](format.raw/*44.13*/("""
					"""),format.raw/*45.6*/("""<p><img src="/assets/images/productImages/thumbnails/noImage.png"/></p>
				""")))}),format.raw/*46.6*/("""
			"""),format.raw/*47.4*/("""</div>
			<div class="row">
				<input class="btn-sm btn-default" type="file" name="upload">
			</div>
		</div>

		<!-- Hidden ID field - required for product updates -->
		"""),_display_(/*54.4*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*54.71*/("""

	"""),format.raw/*56.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*59.14*/routes/*59.20*/.AdminController.products()),format.raw/*59.47*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*62.3*/(""" """),format.raw/*62.4*/("""<!-- End Form definition -->

""")))}),format.raw/*64.2*/(""" """),format.raw/*64.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[Product],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user,env)

  def f:((play.data.Form[Product],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user,env) => apply(addProductForm,user,env)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Fri Feb 03 12:34:14 GMT 2017
                  SOURCE: /home/wdd/webapps/Lab4-Inheritance-ManyToMany/app/views/admin/addProduct.scala.html
                  HASH: 76205a940ed827db717d727f686411f75c703b95
                  MATRIX: 929->174|1117->267|1147->370|1176->373|1189->378|1229->409|1269->411|1298->413|1417->506|1563->643|1603->645|1636->651|1757->746|1855->823|1885->827|1997->918|2028->923|2082->961|2122->963|2153->967|2230->1017|2256->1022|2290->1030|2339->1070|2379->1072|2411->1078|2506->1152|2537->1156|2565->1157|2597->1162|2638->1176|2666->1177|2702->1183|2733->1188|2757->1192|2802->1206|2834->1212|2934->1291|2964->1295|3064->1374|3095->1378|3263->1520|3382->1629|3423->1631|3456->1637|3537->1691|3597->1730|3628->1744|3641->1749|3680->1750|3713->1756|3820->1833|3851->1837|4051->2011|4139->2078|4169->2081|4327->2212|4342->2218|4390->2245|4491->2316|4519->2317|4580->2348|4608->2349
                  LINES: 32->6|37->6|39->8|41->10|41->10|41->10|41->10|42->11|44->13|45->14|45->14|47->16|49->18|49->18|50->19|50->19|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|56->25|56->25|57->26|58->27|58->27|59->28|60->29|60->29|61->30|64->33|64->33|65->34|65->34|67->36|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|77->46|78->47|85->54|85->54|87->56|90->59|90->59|90->59|93->62|93->62|95->64|95->64
                  -- GENERATED --
              */
          