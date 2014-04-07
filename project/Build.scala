import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "myFirstApp"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    jdbc,
    anorm
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    javacOptions in Compile ++= Seq("-source", "1.6", "-target", "1.6")
  )

}
