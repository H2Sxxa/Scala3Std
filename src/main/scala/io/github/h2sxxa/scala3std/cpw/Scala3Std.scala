package io.github.h2sxxa.scala3std.cpw

import cross.cpw.mods.fml.common.Mod
import io.github.h2sxxa.scala3std.common.LibDetector

import scala.annotation.unused
import scala.util.Properties

@unused
@Mod(
  modid = "scala3std",
  name = "Scala3Std",
  version = "3.5.1+C",
  modLanguage = "scala",
)
object Scala3Std {
  LibDetector.scan()
}