package io.github.h2sxxa.scala3std.fabric;

import cross.net.fabricmc.api.ModInitializer;
import io.github.h2sxxa.scala3std.common.LibDetector;
import scala.collection.immutable.List;

import java.util.Properties;

@SuppressWarnings("unused")
public class Scala3Std implements ModInitializer {
    public final static List<Properties> properties = LibDetector.scan();

    @Override
    public void onInitialize() {
    }
}
