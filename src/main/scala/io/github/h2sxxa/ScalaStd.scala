package io.github.h2sxxa

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import org.apache.logging.log4j.LogManager

import scala.util.Properties


@Mod(
  modid = "scalastd",
  name = "ScalaStd",
  version = "1.0.0",
  modLanguageAdapter = "com.cleanroommc.scalar.ScalaLanguageAdapter",
)
object ScalaStd {
  private val LOGGER = LogManager.getLogger("ScalaStd")

  @Mod.EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    LOGGER.info("ScalaStd Loaded, Scala Runtime is")
    LOGGER.info(Properties.versionString)
    for msg <- List("This msg is printed by Scala3 Grammar")
    do
      LOGGER.info(msg)
  }
}