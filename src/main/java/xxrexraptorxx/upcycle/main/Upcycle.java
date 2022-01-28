package xxrexraptorxx.upcycle.main;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xxrexraptorxx.upcycle.utils.Config;

/**
 * @author XxRexRaptorxX (RexRaptor)
 * @projectPage https://www.curseforge.com/minecraft/mc-mods/upcycle
 **/
@Mod(References.MODID)
public class Upcycle {

    public static final Logger LOGGER = LogManager.getLogger();

    public Upcycle() {
        Config.init();
        MinecraftForge.EVENT_BUS.register(this);

        try {
            for (String item : Config.COMPOSTABLE_ITEMS.get()) {
                ComposterBlock.COMPOSTABLES.put(ForgeRegistries.ITEMS.getValue(
                        new ResourceLocation(item.substring(0, item.indexOf(':')), item.substring(item.indexOf(':') + 1))), Config.UPCYCLE_CHANCE.get().floatValue());
                System.err.println(item);
            }
        } catch (Exception e) {
            LOGGER.error("[Upcycle] Invalid Compostable Item.");
        }
    }


}