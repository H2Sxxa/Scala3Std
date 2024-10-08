package io.github.h2sxxa.scala3std.neoforge

import cross.net.neoforged.fml.common.Mod
import io.github.h2sxxa.scala3std.common.LibDetector
import io.github.h2sxxa.scala3std.ModInfo
import scala.annotation.unused

@unused
@Mod(value = ModInfo.MODID)
object Scala3Std {
  LibDetector.scan()
}
