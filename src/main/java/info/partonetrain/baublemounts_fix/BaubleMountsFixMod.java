package info.partonetrain.baublemounts_fix;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

@Mod(BaubleMountsFixMod.MODID)
public class BaubleMountsFixMod
{
    public static final String MODID = "baublemounts_fix";
    private static final Logger LOGGER = LogUtils.getLogger();
     public BaubleMountsFixMod(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
}
