name := "maul"

version := "0.3"

organization := "com.jasonbaldridge"

scalaVersion := "2.10.4"

retrieveManaged := true

resolvers += "IESL Release" at "http://dev-iesl.cs.umass.edu/nexus/content/groups/public"

libraryDependencies ++= Seq(
  "cc.mallet" % "mallet" % "2.0.7",
  "org.rogach" %% "scallop" % "0.9.4",
  "cc.factorie" % "factorie" % "1.0"
)

scalacOptions ++= Seq(
  "-unchecked", "-deprecation",
  "-language:implicitConversions",
  "-language:higherKinds"
)

