package oneiros.eres;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Oneiros implements ModInitializer {
	public static final String MOD_ID = "oneiros";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Empezando a soñar");
	}
}