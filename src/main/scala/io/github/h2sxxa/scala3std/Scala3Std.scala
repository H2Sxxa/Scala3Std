package io.github.h2sxxa.scala3std

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import org.apache.logging.log4j.LogManager

import scala.annotation.unused
import scala.util.Properties

@unused
@Mod(
  value = "scala3std",
  modid = "scala3std",
  name = "Scala3Std",
  version = "3.5.1+A",
  modLanguage = "scala",
)
object Scala3Std {
  private val LOGGER = LogManager.getLogger("Scala3Std")

  @unused
  @Mod.EventHandler
  def init(@unused event: FMLInitializationEvent): Unit = {
    val resources = classOf[Option[?]].getClassLoader.getResources("library.properties")
    LOGGER.info("Detecting Scala Libraries...")
    while resources.hasMoreElements
    do
      val element = resources.nextElement()
      try {
        val props = java.util.Properties()
        props.load(element.openStream())
        LOGGER.info(element.getPath + " version:" + props.getProperty("version.number"))
      } catch
        case _ =>
  }
}