package io.github.h2sxxa.scala3std.forge

import cross.net.minecraftforge.fml.common.Mod
import io.github.h2sxxa.scala3std.common.LibDetector

import scala.annotation.unused
import scala.util.Properties

@unused
@Mod(
  value = "scala3std",
  modid = "scala3std",
  name = "Scala3Std",
  version = "3.5.1+C",
  modLanguage = "scala",
)
object Scala3Std {
  LibDetector.scan()
}