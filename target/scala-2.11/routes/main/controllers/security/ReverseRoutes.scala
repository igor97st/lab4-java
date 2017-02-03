
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Lab4-Inheritance-ManyToMany/conf/routes
// @DATE:Fri Feb 03 11:18:08 GMT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:39
package controllers.security {

  // @LINE:39
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def loginSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:41
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:39
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
