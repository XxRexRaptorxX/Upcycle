package xxrexraptorxx.upcycle.main;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
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

        ComposterBlock.COMPOSTABLES.put(Items.ROTTEN_FLESH, 0.3F);
        ComposterBlock.COMPOSTABLES.put(Items.SPIDER_EYE, 0.3F);
        ComposterBlock.COMPOSTABLES.put(Items.FERMENTED_SPIDER_EYE, 0.3F);
        ComposterBlock.COMPOSTABLES.put(Items.POISONOUS_POTATO, 0.3F);
        ComposterBlock.COMPOSTABLES.put(Items.RABBIT_FOOT, 0.65F);


        MinecraftForge.EVENT_BUS.register(this);
    }
}