package io.github.h2sxxa.scala3std

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import org.apache.logging.log4j.LogManager

import scala.util.Properties

@Mod(
  modid = "scala3std",
  name = "Scala3Std",
  version = "3.5.1+A",
  modLanguage = "scala",
)
object Scala3Std {
  private val LOGGER = LogManager.getLogger("Scala3Std")

  @Mod.EventHandler
  def init(event: FMLInitializationEvent): Unit = {
    val resources = ClassLoader.getSystemClassLoader.getResources("library.properties")
    LOGGER.info("Detecting Scala Libraries...")
    while resources.hasMoreElements
    do
      val element = resources.nextElement()
      try {
        val props = java.util.Properties()
        props.load(element.openStream())
        LOGGER.info(element.getPath + " version:" + props.getProperty("version.number"))
      } catch
        case _ => ()
  }
}