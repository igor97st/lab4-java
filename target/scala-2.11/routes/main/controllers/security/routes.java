
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Lab4-Inheritance-ManyToMany/conf/routes
// @DATE:Fri Feb 03 11:18:08 GMT 2017

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginController LoginController = new controllers.security.ReverseLoginController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginController LoginController = new controllers.security.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
  }

}
