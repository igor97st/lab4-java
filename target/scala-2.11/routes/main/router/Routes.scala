
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Lab4-Inheritance-ManyToMany/conf/routes
// @DATE:Fri Feb 03 11:18:08 GMT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  HomeController_2: controllers.HomeController,
  // @LINE:22
  AdminController_0: controllers.AdminController,
  // @LINE:39
  LoginController_5: controllers.security.LoginController,
  // @LINE:46
  CountController_1: controllers.CountController,
  // @LINE:48
  AsyncController_3: controllers.AsyncController,
  // @LINE:51
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    HomeController_2: controllers.HomeController,
    // @LINE:22
    AdminController_0: controllers.AdminController,
    // @LINE:39
    LoginController_5: controllers.security.LoginController,
    // @LINE:46
    CountController_1: controllers.CountController,
    // @LINE:48
    AsyncController_3: controllers.AsyncController,
    // @LINE:51
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_2, AdminController_0, LoginController_5, CountController_1, AsyncController_3, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, AdminController_0, LoginController_5, CountController_1, AsyncController_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.HomeController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/products""", """controllers.AdminController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addproduct""", """controllers.AdminController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addProductSubmit""", """controllers.AdminController.addProductSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.security.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """######################
 Puvlic Site  Routes #
######################""",
      this.prefix + """"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_about1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about1_invoker = createInvoker(
    HomeController_2.about,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      """""",
      this.prefix + """about"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_products2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_products2_invoker = createInvoker(
    HomeController_2.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """ products accepts a parameter default to 0 (Long)""",
      this.prefix + """products"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_AdminController_products3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/products")))
  )
  private[this] lazy val controllers_AdminController_products3_invoker = createInvoker(
    AdminController_0.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """###############
 Admin Routes #
###############
 products accepts a parameter default to 0 (Long)""",
      this.prefix + """admin/products"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AdminController_addProduct4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addproduct")))
  )
  private[this] lazy val controllers_AdminController_addProduct4_invoker = createInvoker(
    AdminController_0.addProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProduct",
      Nil,
      "GET",
      """ Request to load the add product form""",
      this.prefix + """admin/addproduct"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AdminController_addProductSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminController_addProductSubmit5_invoker = createInvoker(
    AdminController_0.addProductSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProductSubmit",
      Nil,
      "POST",
      """ Data submitted by the form""",
      this.prefix + """admin/addProductSubmit"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_AdminController_deleteProduct6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteProduct6_invoker = createInvoker(
    AdminController_0.deleteProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      """ Delete a product by an id passed as a parameter""",
      this.prefix + """admin/delProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_AdminController_updateProduct7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateProduct7_invoker = createInvoker(
    AdminController_0.updateProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      """ Update a product by id""",
      this.prefix + """admin/updateProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_security_LoginController_login8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginController_login8_invoker = createInvoker(
    LoginController_5.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginController",
      "login",
      Nil,
      "GET",
      """###############
 Login routes #
###############""",
      this.prefix + """login"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_security_LoginController_loginSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_security_LoginController_loginSubmit9_invoker = createInvoker(
    LoginController_5.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_security_LoginController_logout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginController_logout10_invoker = createInvoker(
    LoginController_5.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_CountController_count11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count11_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_AsyncController_message12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message12_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index())
      }
  
    // @LINE:12
    case controllers_HomeController_about1_route(params) =>
      call { 
        controllers_HomeController_about1_invoker.call(HomeController_2.about)
      }
  
    // @LINE:15
    case controllers_HomeController_products2_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_products2_invoker.call(HomeController_2.products(cat))
      }
  
    // @LINE:22
    case controllers_AdminController_products3_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminController_products3_invoker.call(AdminController_0.products(cat))
      }
  
    // @LINE:25
    case controllers_AdminController_addProduct4_route(params) =>
      call { 
        controllers_AdminController_addProduct4_invoker.call(AdminController_0.addProduct)
      }
  
    // @LINE:28
    case controllers_AdminController_addProductSubmit5_route(params) =>
      call { 
        controllers_AdminController_addProductSubmit5_invoker.call(AdminController_0.addProductSubmit)
      }
  
    // @LINE:31
    case controllers_AdminController_deleteProduct6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_deleteProduct6_invoker.call(AdminController_0.deleteProduct(id))
      }
  
    // @LINE:34
    case controllers_AdminController_updateProduct7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateProduct7_invoker.call(AdminController_0.updateProduct(id))
      }
  
    // @LINE:39
    case controllers_security_LoginController_login8_route(params) =>
      call { 
        controllers_security_LoginController_login8_invoker.call(LoginController_5.login)
      }
  
    // @LINE:40
    case controllers_security_LoginController_loginSubmit9_route(params) =>
      call { 
        controllers_security_LoginController_loginSubmit9_invoker.call(LoginController_5.loginSubmit)
      }
  
    // @LINE:41
    case controllers_security_LoginController_logout10_route(params) =>
      call { 
        controllers_security_LoginController_logout10_invoker.call(LoginController_5.logout)
      }
  
    // @LINE:46
    case controllers_CountController_count11_route(params) =>
      call { 
        controllers_CountController_count11_invoker.call(CountController_1.count)
      }
  
    // @LINE:48
    case controllers_AsyncController_message12_route(params) =>
      call { 
        controllers_AsyncController_message12_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:51
    case controllers_Assets_versioned13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
