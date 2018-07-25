libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }
addSbtPlugin("com.geirsson"       % "sbt-scalafmt" % "1.6.0-RC3")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.2.1")