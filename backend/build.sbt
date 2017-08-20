name := "backend"

version := "1.0"

scalaVersion := "2.12.3"

val akkaVersion = "2.5.4"
val akkaHttpVersion = "10.0.9"
val scalaTest = "3.0.1"
val logbackV = "1.1.7"
val scalaLoggingV = "3.5.0"


val dbDependencies = Seq(
  "com.h2database" % "h2" % "1.4.195"
)

val akkaDependencies = Seq(
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "io.igl" %% "jwt" % "1.2.2"
)

val testDependencies = Seq(
  "org.scalactic" %% "scalactic" % scalaTest,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
  "org.scalatest" %% "scalatest" % scalaTest % "test"
)

val loggingDeps = Seq(
  "ch.qos.logback" % "logback-classic" % logbackV,
  "com.typesafe.scala-logging" %% "scala-logging" % scalaLoggingV
)

libraryDependencies ++= dbDependencies ++ akkaDependencies ++ testDependencies ++ loggingDeps