
package views.html.admin

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
"""),_display_(/*6.2*/admin/*6.7*/.adminMain("Products", user)/*6.35*/ {_display_(Seq[Any](format.raw/*6.37*/("""
  """),format.raw/*7.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
          <h4>Categories</h4>
            <div class="list-group">
                <!-- A link to display all products -->
                <a href=""""),_display_(/*13.27*/routes/*13.33*/.AdminController.products(0)),format.raw/*13.61*/("""" class="list-group-item">All categories</a>

                <!-- Start of For loop - For each c in categories add a list item -->
                <!-- Also show the number of products in each category -->
                """),_display_(/*17.18*/for(c <- categories) yield /*17.38*/ {_display_(Seq[Any](format.raw/*17.40*/("""
                    """),format.raw/*18.21*/("""<a href=""""),_display_(/*18.31*/routes/*18.37*/.AdminController.products(c.getId)),format.raw/*18.71*/("""" class="list-group-item">"""),_display_(/*18.98*/c/*18.99*/.getName),format.raw/*18.107*/("""
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
			    """),format.raw/*46.8*/("""<tr>
                    <!-- Display each product field value in a column -->
                    """),_display_(/*48.22*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*48.110*/ {_display_(Seq[Any](format.raw/*48.112*/("""
                        """),format.raw/*49.25*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*49.80*/(p.getId)),format.raw/*49.89*/(""".jpg"/></td>
                    """)))}/*50.23*/else/*50.28*/{_display_(Seq[Any](format.raw/*50.29*/("""
                        """),format.raw/*51.25*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/></td>
                    """)))}),format.raw/*52.22*/("""
                  """),format.raw/*53.19*/("""<td>"""),_display_(/*53.24*/p/*53.25*/.getName),format.raw/*53.33*/("""</td>
                  <td>"""),_display_(/*54.24*/p/*54.25*/.getDescription),format.raw/*54.40*/("""</td>
                  <td>"""),_display_(/*55.24*/p/*55.25*/.getStock),format.raw/*55.34*/("""</td>
                  <td>&euro; """),_display_(/*56.31*/("%.2f".format(p.getPrice))),format.raw/*56.58*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*60.33*/routes/*60.39*/.AdminController.updateProduct(p.getId)),format.raw/*60.78*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*65.33*/routes/*65.39*/.AdminController.deleteProduct(p.getId)),format.raw/*65.78*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				</tr>
					""")))}),format.raw/*71.7*/(""" """),format.raw/*71.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*75.21*/routes/*75.27*/.AdminController.addProduct()),format.raw/*75.56*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*84.27*/("""{"""),format.raw/*84.28*/("""
        """),format.raw/*85.9*/("""return confirm('Are you sure?');
    """),format.raw/*86.5*/("""}"""),format.raw/*86.6*/("""
  """),format.raw/*87.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*90.2*/("""
"""))
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
                  SOURCE: /home/wdd/webapps/Lab4-Inheritance-ManyToMany/app/views/admin/products.scala.html
                  HASH: 754919d28d7e3ca2d3979a8cec6b57ce17e764d3
                  MATRIX: 912->66|1113->171|1141->173|1201->206|1229->207|1275->226|1303->227|1331->228|1378->250|1390->255|1426->283|1465->285|1494->288|1760->527|1775->533|1824->561|2075->785|2111->805|2151->807|2200->828|2237->838|2252->844|2307->878|2361->905|2371->906|2401->914|2452->937|2500->958|2510->959|2550->978|2631->1028|2672->1041|2761->1103|2802->1135|2842->1137|2885->1152|2961->1201|2975->1206|3011->1221|3054->1236|3103->1254|3142->1265|3607->1703|3641->1721|3681->1723|3716->1731|3843->1831|3941->1919|3982->1921|4035->1946|4117->2001|4147->2010|4200->2045|4213->2050|4252->2051|4305->2076|4431->2171|4478->2190|4510->2195|4520->2196|4549->2204|4605->2233|4615->2234|4651->2249|4707->2278|4717->2279|4747->2288|4810->2324|4858->2351|4994->2460|5009->2466|5069->2505|5328->2737|5343->2743|5403->2782|5656->3005|5684->3006|5804->3099|5819->3105|5869->3134|6132->3369|6161->3370|6197->3379|6261->3416|6289->3417|6319->3420|6396->3467
                  LINES: 31->3|36->3|38->5|38->5|38->5|38->5|38->5|38->5|39->6|39->6|39->6|39->6|40->7|46->13|46->13|46->13|50->17|50->17|50->17|51->18|51->18|51->18|51->18|51->18|51->18|51->18|52->19|52->19|52->19|52->19|54->21|55->22|59->26|59->26|59->26|60->27|61->28|61->28|61->28|62->29|63->30|64->31|78->45|78->45|78->45|79->46|81->48|81->48|81->48|82->49|82->49|82->49|83->50|83->50|83->50|84->51|85->52|86->53|86->53|86->53|86->53|87->54|87->54|87->54|88->55|88->55|88->55|89->56|89->56|93->60|93->60|93->60|98->65|98->65|98->65|104->71|104->71|108->75|108->75|108->75|117->84|117->84|118->85|119->86|119->86|120->87|123->90
                  -- GENERATED --
              */
          