import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play-mysql-template"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    "mysql" % "mysql-connector-java" % "5.1.18",
    "org.hibernate" % "hibernate-entitymanager" % "4.1.10.Final",
    "com.google.code.gson" % "gson" % "2.2.2",
    javaCore,
    javaJdbc,
    javaEbean,
    javaJpa
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
