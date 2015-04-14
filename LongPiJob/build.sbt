name := "LongPiJob"
 
version := "1.4"
 
scalaVersion := "2.10.4"

resolvers += "Job Server Bintray" at "https://dl.bintray.com/spark-jobserver/maven"

//% "provided"

libraryDependencies += "spark.jobserver" % "job-server-api" % "0.4.1" % "provided"

//libraryDependencies += "spark.jobserver" % "job-server-api" % "0.4.0" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.1.0"