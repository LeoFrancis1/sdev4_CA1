// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/sdevca/sdev4_CA1/ca1_framework/CA1_SDev4/conf/routes
// @DATE:Sat Mar 16 16:26:39 GMT 2019


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
