package one.devos.nautical.creepermultidrop;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CreeperMultidropServer implements DedicatedServerModInitializer {
    public static final String MOD_ID = "creepermultidrop";
    public static final String VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getVersion().getFriendlyString();
    public static final String MOD_NAME = FabricLoader.getInstance().getModContainer(MOD_ID).get().getMetadata().getName();

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    @Override
    public void onInitializeServer() {
        LOGGER.info("[" + MOD_NAME + "] Version " + VERSION + " loaded." );
        LOGGER.info("[" + MOD_NAME + "] " + "Want head?");
    }
}
