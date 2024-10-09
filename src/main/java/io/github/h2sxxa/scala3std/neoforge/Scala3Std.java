package io.github.h2sxxa.scala3std.neoforge;

import cross.net.neoforged.fml.common.Mod;
import io.github.h2sxxa.scala3std.ModInfo;
import io.github.h2sxxa.scala3std.common.LibDetector;
import scala.collection.immutable.List;

import java.util.Properties;

@SuppressWarnings("unused")
@Mod(value = ModInfo.MODID)
public class Scala3Std {
    public static final List<Properties> properties = LibDetector.scan();
}
