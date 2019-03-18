// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/temp4/sdev4_CA1/ca1_framework/CA1_SDev4/conf/routes
// @DATE:Mon Mar 18 12:46:56 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  CountController_0: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  LoginController_6: controllers.LoginController,
  // @LINE:18
  EmployeeCRUDController_2: controllers.EmployeeCRUDController,
  // @LINE:25
  ProjectController_4: controllers.ProjectController,
  // @LINE:32
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    CountController_0: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    LoginController_6: controllers.LoginController,
    // @LINE:18
    EmployeeCRUDController_2: controllers.EmployeeCRUDController,
    // @LINE:25
    ProjectController_4: controllers.ProjectController,
    // @LINE:32
    Assets_5: controllers.Assets
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_3, LoginController_6, EmployeeCRUDController_2, ProjectController_4, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_3, LoginController_6, EmployeeCRUDController_2, ProjectController_4, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.EmployeeCRUDController.usersEmployee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addNewEmployee""", """controllers.EmployeeCRUDController.addEmployee"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEmployeeSubmit""", """controllers.EmployeeCRUDController.addEmployeeSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeEmployee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeCRUDController.removeEmployee(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateEmployee/""" + "$" + """id<[^/]+>""", """controllers.EmployeeCRUDController.updateEmployee(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """projects""", """controllers.ProjectController.projects"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProject""", """controllers.ProjectController.addProject"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProjectSubmit""", """controllers.ProjectController.addProjectSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteProject/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.deleteProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProject/""" + "$" + """id<[^/]+>""", """controllers.ProjectController.updateProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_LoginController_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login3_invoker = createInvoker(
    LoginController_6.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """ login controller""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LoginController_loginSubmit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit4_invoker = createInvoker(
    LoginController_6.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_LoginController_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout5_invoker = createInvoker(
    LoginController_6.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_EmployeeCRUDController_usersEmployee6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_EmployeeCRUDController_usersEmployee6_invoker = createInvoker(
    EmployeeCRUDController_2.usersEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeCRUDController",
      "usersEmployee",
      Nil,
      "GET",
      this.prefix + """employees""",
      """employee""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_EmployeeCRUDController_addEmployee7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addNewEmployee")))
  )
  private[this] lazy val controllers_EmployeeCRUDController_addEmployee7_invoker = createInvoker(
    EmployeeCRUDController_2.addEmployee,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeCRUDController",
      "addEmployee",
      Nil,
      "GET",
      this.prefix + """addNewEmployee""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_EmployeeCRUDController_addEmployeeSubmit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEmployeeSubmit")))
  )
  private[this] lazy val controllers_EmployeeCRUDController_addEmployeeSubmit8_invoker = createInvoker(
    EmployeeCRUDController_2.addEmployeeSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeCRUDController",
      "addEmployeeSubmit",
      Nil,
      "POST",
      this.prefix + """addEmployeeSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_EmployeeCRUDController_removeEmployee9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeCRUDController_removeEmployee9_invoker = createInvoker(
    EmployeeCRUDController_2.removeEmployee(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeCRUDController",
      "removeEmployee",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_EmployeeCRUDController_updateEmployee10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateEmployee/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmployeeCRUDController_updateEmployee10_invoker = createInvoker(
    EmployeeCRUDController_2.updateEmployee(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmployeeCRUDController",
      "updateEmployee",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateEmployee/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ProjectController_projects11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("projects")))
  )
  private[this] lazy val controllers_ProjectController_projects11_invoker = createInvoker(
    ProjectController_4.projects,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "projects",
      Nil,
      "GET",
      this.prefix + """projects""",
      """project""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ProjectController_addProject12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProject")))
  )
  private[this] lazy val controllers_ProjectController_addProject12_invoker = createInvoker(
    ProjectController_4.addProject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "addProject",
      Nil,
      "GET",
      this.prefix + """addProject""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ProjectController_addProjectSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProjectSubmit")))
  )
  private[this] lazy val controllers_ProjectController_addProjectSubmit13_invoker = createInvoker(
    ProjectController_4.addProjectSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "addProjectSubmit",
      Nil,
      "POST",
      this.prefix + """addProjectSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ProjectController_deleteProject14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_deleteProject14_invoker = createInvoker(
    ProjectController_4.deleteProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ProjectController_updateProject15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProjectController_updateProject15_invoker = createInvoker(
    ProjectController_4.updateProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProjectController",
      "updateProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Assets_versioned16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned16_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_LoginController_login3_route(params@_) =>
      call { 
        controllers_LoginController_login3_invoker.call(LoginController_6.login)
      }
  
    // @LINE:14
    case controllers_LoginController_loginSubmit4_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit4_invoker.call(LoginController_6.loginSubmit)
      }
  
    // @LINE:15
    case controllers_LoginController_logout5_route(params@_) =>
      call { 
        controllers_LoginController_logout5_invoker.call(LoginController_6.logout)
      }
  
    // @LINE:18
    case controllers_EmployeeCRUDController_usersEmployee6_route(params@_) =>
      call { 
        controllers_EmployeeCRUDController_usersEmployee6_invoker.call(EmployeeCRUDController_2.usersEmployee)
      }
  
    // @LINE:19
    case controllers_EmployeeCRUDController_addEmployee7_route(params@_) =>
      call { 
        controllers_EmployeeCRUDController_addEmployee7_invoker.call(EmployeeCRUDController_2.addEmployee)
      }
  
    // @LINE:20
    case controllers_EmployeeCRUDController_addEmployeeSubmit8_route(params@_) =>
      call { 
        controllers_EmployeeCRUDController_addEmployeeSubmit8_invoker.call(EmployeeCRUDController_2.addEmployeeSubmit)
      }
  
    // @LINE:21
    case controllers_EmployeeCRUDController_removeEmployee9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EmployeeCRUDController_removeEmployee9_invoker.call(EmployeeCRUDController_2.removeEmployee(id))
      }
  
    // @LINE:22
    case controllers_EmployeeCRUDController_updateEmployee10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EmployeeCRUDController_updateEmployee10_invoker.call(EmployeeCRUDController_2.updateEmployee(id))
      }
  
    // @LINE:25
    case controllers_ProjectController_projects11_route(params@_) =>
      call { 
        controllers_ProjectController_projects11_invoker.call(ProjectController_4.projects)
      }
  
    // @LINE:26
    case controllers_ProjectController_addProject12_route(params@_) =>
      call { 
        controllers_ProjectController_addProject12_invoker.call(ProjectController_4.addProject)
      }
  
    // @LINE:27
    case controllers_ProjectController_addProjectSubmit13_route(params@_) =>
      call { 
        controllers_ProjectController_addProjectSubmit13_invoker.call(ProjectController_4.addProjectSubmit)
      }
  
    // @LINE:28
    case controllers_ProjectController_deleteProject14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_deleteProject14_invoker.call(ProjectController_4.deleteProject(id))
      }
  
    // @LINE:29
    case controllers_ProjectController_updateProject15_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProjectController_updateProject15_invoker.call(ProjectController_4.updateProject(id))
      }
  
    // @LINE:32
    case controllers_Assets_versioned16_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned16_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
