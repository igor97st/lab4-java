
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

     object products_Scope1 {
import models.products.Category
import models.products.Product

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[Product],List[Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(products: List[Product], categories: List[Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.107*/("""

"""),format.raw/*5.1*/("""<!-- Pass page title and content """),format.raw/*5.34*/("""{"""),format.raw/*5.35*/("""html between braces"""),format.raw/*5.54*/("""}"""),format.raw/*5.55*/(""" """),format.raw/*5.56*/("""to the main view -->
"""),_display_(/*6.2*/main("Products", user)/*6.24*/ {_display_(Seq[Any](format.raw/*6.26*/("""
  """),format.raw/*7.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*13.27*/routes/*13.33*/.HomeController.products(0)),format.raw/*13.60*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*17.18*/for(c <- categories) yield /*17.38*/ {_display_(Seq[Any](format.raw/*17.40*/("""
                    """),format.raw/*18.21*/("""<a href=""""),_display_(/*18.31*/routes/*18.37*/.HomeController.products(c.getId)),format.raw/*18.70*/("""" class="list-group-item">"""),_display_(/*18.97*/c/*18.98*/.getName),format.raw/*18.106*/("""
                      """),format.raw/*19.23*/("""<span class="badge">"""),_display_(/*19.44*/c/*19.45*/.getProducts.size()),format.raw/*19.64*/("""</span>
                    </a>
                """)))}),format.raw/*21.18*/("""
            """),format.raw/*22.13*/("""</div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*26.12*/if(flash.containsKey("success"))/*26.44*/ {_display_(Seq[Any](format.raw/*26.46*/("""
              """),format.raw/*27.15*/("""<div class="alert alert-success">
              """),_display_(/*28.16*/flash/*28.21*/.get("success")),format.raw/*28.36*/("""
              """),format.raw/*29.15*/("""</div>
          """)))}),format.raw/*30.12*/("""
          """),format.raw/*31.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>Image</th>
            <th>Name</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
          """),_display_(/*45.12*/for(p <- products) yield /*45.30*/ {_display_(Seq[Any](format.raw/*45.32*/("""
              """),format.raw/*46.15*/("""<tr>
                  <!-- Display each product field value in a column -->
                  """),_display_(/*48.20*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*48.108*/ {_display_(Seq[Any](format.raw/*48.110*/("""
                      """),format.raw/*49.23*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*49.78*/(p.getId + ".jpg")),format.raw/*49.96*/(""""/></td>
                  """)))}/*50.21*/else/*50.26*/{_display_(Seq[Any](format.raw/*50.27*/("""
                      """),format.raw/*51.23*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
                  """)))}),format.raw/*52.20*/("""
                  """),format.raw/*53.19*/("""<td>"""),_display_(/*53.24*/p/*53.25*/.getName),format.raw/*53.33*/("""</td>
                  <td>"""),_display_(/*54.24*/p/*54.25*/.getDescription),format.raw/*54.40*/("""</td>
                  <td>"""),_display_(/*55.24*/p/*55.25*/.getStock),format.raw/*55.34*/("""</td>
                  <td>&euro; """),_display_(/*56.31*/("%.2f".format(p.getPrice))),format.raw/*56.58*/("""</td>
              </tr>
					""")))}),format.raw/*58.7*/(""" """),format.raw/*58.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
      </div>
  </div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[Product],List[Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


}
}

/**/
object products extends products_Scope0.products_Scope1.products
              /*
                  -- GENERATED --
                  DATE: Fri Feb 03 11:18:08 GMT 2017
                  SOURCE: /home/wdd/webapps/Lab4-Inheritance-ManyToMany/app/views/products.scala.html
                  HASH: 0ea839b244f850468c45ff75659672f59af9cf04
                  MATRIX: 906->66|1107->171|1135->173|1195->206|1223->207|1269->226|1297->227|1325->228|1372->250|1402->272|1441->274|1470->277|1736->516|1751->522|1799->549|2050->773|2086->793|2126->795|2175->816|2212->826|2227->832|2281->865|2335->892|2345->893|2375->901|2426->924|2474->945|2484->946|2524->965|2605->1015|2646->1028|2735->1090|2776->1122|2816->1124|2859->1139|2935->1188|2949->1193|2985->1208|3028->1223|3077->1241|3116->1252|3581->1690|3615->1708|3655->1710|3698->1725|3821->1821|3919->1909|3960->1911|4011->1934|4093->1989|4132->2007|4179->2036|4192->2041|4231->2042|4282->2065|4406->2158|4453->2177|4485->2182|4495->2183|4524->2191|4580->2220|4590->2221|4626->2236|4682->2265|4692->2266|4722->2275|4785->2311|4833->2338|4895->2370|4923->2371
                  LINES: 31->3|36->3|38->5|38->5|38->5|38->5|38->5|38->5|39->6|39->6|39->6|40->7|46->13|46->13|46->13|50->17|50->17|50->17|51->18|51->18|51->18|51->18|51->18|51->18|51->18|52->19|52->19|52->19|52->19|54->21|55->22|59->26|59->26|59->26|60->27|61->28|61->28|61->28|62->29|63->30|64->31|78->45|78->45|78->45|79->46|81->48|81->48|81->48|82->49|82->49|82->49|83->50|83->50|83->50|84->51|85->52|86->53|86->53|86->53|86->53|87->54|87->54|87->54|88->55|88->55|88->55|89->56|89->56|91->58|91->58
                  -- GENERATED --
              */
          