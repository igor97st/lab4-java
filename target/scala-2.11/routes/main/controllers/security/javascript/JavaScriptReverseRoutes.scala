
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Lab4-Inheritance-ManyToMany/conf/routes
// @DATE:Fri Feb 03 11:18:08 GMT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:39
package controllers.security.javascript {
  import ReverseRouteContext.empty

  // @LINE:39
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:41
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:39
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
