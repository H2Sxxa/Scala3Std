package io.github.h2sxxa.scala3std.common


object LibDetector {
  def scan(): List[java.util.Properties] = {
    var properties: List[java.util.Properties] = List()
    val resources = classOf[Option[?]].getClassLoader.getResources("library.properties")

    System.out.println("Detecting Scala Libraries...")
    while resources.hasMoreElements
    do
      val element = resources.nextElement()
      try {
        val props = java.util.Properties()
        props.load(element.openStream())
        System.out.println(element.getPath + " version:" + props.getProperty("version.number"))
        properties = properties :+ props
      } catch
        case _ =>

    properties
  }
}
