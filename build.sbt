organization := "com.mininglamp.ml"
name := "FM"

spShortDescription := "An implementation of Factorization Machines in Spark"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.6"

sparkVersion := "1.6.0"

sparkComponents ++= Seq("mllib", "sql", "graphx")
