package xxrexraptorxx.upcycle.main;

import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.magmacore.main.ModRegistry;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage <a href="https://www.curseforge.com/minecraft/mc-mods/upcycle">...</a>
 **/
@Mod(References.MODID)
public class Upcycle {

    public static final Logger LOGGER = LogManager.getLogger();

    public Upcycle(ModContainer container) {
        ModRegistry.register(References.MODID, References.NAME, References.URL);
    }
}