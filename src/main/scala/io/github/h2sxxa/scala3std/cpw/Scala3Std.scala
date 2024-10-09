package io.github.h2sxxa.scala3std.cpw

import cross.cpw.mods.fml.common.Mod
import io.github.h2sxxa.scala3std.common.LibDetector
import io.github.h2sxxa.scala3std.ModInfo

import scala.annotation.unused
import scala.util.Properties

@unused
@Mod(
  modid = ModInfo.MODID,
  name = ModInfo.NAME,
  version = ModInfo.VERSION,
  modLanguage = "scala",
)
object Scala3Std {
  val properties: List[java.util.Properties] = LibDetector.scan()
}