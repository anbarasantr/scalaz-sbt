package scalaz.build
import sbt.Keys._
import sbt._
import wartremover.WartRemover.autoImport.wartremoverErrors
import wartremover.Wart

object WartRemoverSettings {

  val buildSettings = Seq(
    wartremoverErrors in (Compile, compile) += Wart.Nothing
  )
}
