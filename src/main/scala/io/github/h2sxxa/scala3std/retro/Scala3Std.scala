package io.github.h2sxxa.scala3std.retro

import cross.net.minecraftforge.fml.common.Mod
import io.github.h2sxxa.scala3std.common.LibDetector
import io.github.h2sxxa.scala3std.ModInfo
import scala.annotation.unused
import scala.util.Properties

@unused
@Mod(
  value = ModInfo.MODID,
  modid = ModInfo.MODID,
  name = ModInfo.NAME,
  version = ModInfo.VERSION,
  modLanguage = "scala",
)
object Scala3Std {
  val properties: List[java.util.Properties] = LibDetector.scan()
}