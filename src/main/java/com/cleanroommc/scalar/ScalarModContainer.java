package com.cleanroommc.scalar;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.ModMetadata;

public class ScalarModContainer extends DummyModContainer {
    public ScalarModContainer() {
        super(new ModMetadata() {{
            modId = "scalar";
            version = "3.0.2";
            name = "Scalar";
        }});
    }
}
