lazy val app = project
  .in(file("."))
  .settings(
    name := "wartremover",
    wartremoverErrors in (Compile, compile) ++= Warts.all
  ).enablePlugins(ScalazPlugin)
