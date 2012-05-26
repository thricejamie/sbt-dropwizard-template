import AssemblyKeys._

name:="sbt-dropwizard-template"

version:="0.1"

scalaVersion:="2.9.1"

resolvers ++= Seq(
   "Coda Hale repo" at "http://repo.codahale.com/"
 )

libraryDependencies ++= Seq(
  "com.yammer.dropwizard" % "dropwizard-core" % "0.4.0",
  "com.yammer.dropwizard" %% "dropwizard-scala" % "0.4.0",
  "javax.servlet" % "javax.servlet-api" % "3.0.1"
)

ivyXML :=
  <dependency org="org.eclipse.jetty.orbit" name="javax.servlet" rev="3.0.0.v201112011016">
    <artifact name="javax.servlet" type="orbit" ext="jar"/>
  </dependency>

assemblySettings

scalacOptions ++= Seq("-unchecked", "-deprecation")
