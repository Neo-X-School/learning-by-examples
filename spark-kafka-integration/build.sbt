name := "SparkKafkaStreaming"
version := "1.0"
val sparkVersion = "4.1.0"
scalaVersion := "2.13.18"

scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-streaming-kafka-0-10" %  sparkVersion 
)

libraryDependencies += "org.apache.kafka" %% "kafka" % "4.1.1"
