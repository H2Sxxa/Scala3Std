package io.github.h2sxxa.scala3std

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import org.apache.logging.log4j.LogManager

import scala.util.Properties


@Mod(
  modid = "scala3std",
  name = "Scala3Std",
  version = "1.0.0",
  modLanguage = "scala",
)
object Scala3Std {
  private val LOGGER = LogManager.getLogger("Scala3Std")

  @Mod.EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    LOGGER.info("ScalaStd Loaded, Scala Runtime is")
    LOGGER.info(Properties.versionString)
    for msg <- List("This msg is printed by Scala3 Indent Grammar")
      do
        LOGGER.info(msg)
  }
}