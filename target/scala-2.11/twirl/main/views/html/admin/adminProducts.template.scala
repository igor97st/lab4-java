
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminProducts_Scope0 {
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

     object adminProducts_Scope1 {
import models.products.Category
import models.products.Product

class adminProducts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Product],List[Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(products: List[Product], categories: List[Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.80*/("""

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
            <th>ID</th>
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
			        """),format.raw/*46.12*/("""<tr>
                  <td>"""),_display_(/*47.24*/p/*47.25*/.getId),format.raw/*47.31*/("""</td>
                  <td>"""),_display_(/*48.24*/p/*48.25*/.getName),format.raw/*48.33*/("""</td>
                  <td>"""),_display_(/*49.24*/p/*49.25*/.getDescription),format.raw/*49.40*/("""</td>
                  <td>"""),_display_(/*50.24*/p/*50.25*/.getStock),format.raw/*50.34*/("""</td>
                  <td>&euro; """),_display_(/*51.31*/("%.2f".format(p.getPrice))),format.raw/*51.58*/("""</td>

                  <!-- Edit product button -->
                  <td>
                      <a href=""""),_display_(/*55.33*/routes/*55.39*/.AdminController.updateProduct(p.getId)),format.raw/*55.78*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                  </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*60.33*/routes/*60.39*/.AdminController.deleteProduct(p.getId)),format.raw/*60.78*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				    </tr>
					""")))}),format.raw/*66.7*/(""" """),format.raw/*66.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*70.21*/routes/*70.27*/.AdminController.addProduct()),format.raw/*70.56*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*79.27*/("""{"""),format.raw/*79.28*/("""
        """),format.raw/*80.9*/("""return confirm('Are you sure?');
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""
  """),format.raw/*82.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[Product],List[Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


}
}

/**/
object adminProducts extends adminProducts_Scope0.adminProducts_Scope1.adminProducts
              /*
                  -- GENERATED --
                  DATE: Fri Feb 03 11:18:08 GMT 2017
                  SOURCE: /home/wdd/webapps/Lab4-Inheritance-ManyToMany/app/views/admin/adminProducts.scala.html
                  HASH: 422de98f04bfd2acdbc703711a7c6c2fe8d87e59
                  MATRIX: 906->66|1079->144|1107->146|1167->179|1195->180|1241->199|1269->200|1297->201|1344->223|1356->228|1392->256|1431->258|1460->261|1726->500|1741->506|1790->534|2041->758|2077->778|2117->780|2166->801|2203->811|2218->817|2273->851|2327->878|2337->879|2367->887|2418->910|2466->931|2476->932|2516->951|2597->1001|2638->1014|2727->1076|2768->1108|2808->1110|2851->1125|2927->1174|2941->1179|2977->1194|3020->1209|3069->1227|3108->1238|3570->1673|3604->1691|3644->1693|3684->1705|3739->1733|3749->1734|3776->1740|3832->1769|3842->1770|3871->1778|3927->1807|3937->1808|3973->1823|4029->1852|4039->1853|4069->1862|4132->1898|4180->1925|4316->2034|4331->2040|4391->2079|4650->2311|4665->2317|4725->2356|4982->2583|5010->2584|5130->2677|5145->2683|5195->2712|5458->2947|5487->2948|5523->2957|5587->2994|5615->2995|5645->2998
                  LINES: 31->3|36->3|38->5|38->5|38->5|38->5|38->5|38->5|39->6|39->6|39->6|39->6|40->7|46->13|46->13|46->13|50->17|50->17|50->17|51->18|51->18|51->18|51->18|51->18|51->18|51->18|52->19|52->19|52->19|52->19|54->21|55->22|59->26|59->26|59->26|60->27|61->28|61->28|61->28|62->29|63->30|64->31|78->45|78->45|78->45|79->46|80->47|80->47|80->47|81->48|81->48|81->48|82->49|82->49|82->49|83->50|83->50|83->50|84->51|84->51|88->55|88->55|88->55|93->60|93->60|93->60|99->66|99->66|103->70|103->70|103->70|112->79|112->79|113->80|114->81|114->81|115->82
                  -- GENERATED --
              */
          