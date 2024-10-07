package io.github.h2sxxa.scala3std.fabric

import cross.net.fabricmc.api.ModInitializer
import io.github.h2sxxa.scala3std.common.LibDetector

object Scala3Std extends ModInitializer {
  override def onInitialize(): Unit = LibDetector.scan()
}



