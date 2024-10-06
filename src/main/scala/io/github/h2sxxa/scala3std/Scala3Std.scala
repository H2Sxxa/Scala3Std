package io.github.h2sxxa.scala3std

import cross.net.minecraftforge.fml.common.Mod
import org.apache.logging.log4j.LogManager

import scala.annotation.unused
import scala.util.Properties

@unused
@Mod(
  value = "scala3std",
  modid = "scala3std",
  name = "Scala3Std",
  version = "3.5.1+B",
  modLanguage = "scala",
)
object Scala3Std {
  private val LOGGER = LogManager.getLogger("Scala3Std")


  private val resources = classOf[Option[?]].getClassLoader.getResources("library.properties")
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