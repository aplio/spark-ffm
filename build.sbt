name := "Spark-FFM"

version := "0.0.1"

scalaVersion := "2.12.17"

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.2"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "3.1.2" % "provided"
libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.12.17"

resolvers += Resolver.sonatypeRepo("public")

