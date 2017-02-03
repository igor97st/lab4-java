
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/Lab4-Inheritance-ManyToMany/conf/routes
// @DATE:Fri Feb 03 11:18:08 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
