package goldenapple.rfdrills.client;

import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.FMLCommonHandler;
import goldenapple.rfdrills.CommonProxy;
import goldenapple.rfdrills.config.ConfigHandler;

public class ClientProxy extends CommonProxy {

    @Override
    public void init() {
        if (ConfigHandler.animationType == 1) MinecraftForge.EVENT_BUS.register(new PlayerRenderHandler()); // RenderPlayerEvents
                                                                                                            // are fired
                                                                                                            // on the
                                                                                                            // MinecraftForge
                                                                                                            // bus
        else if (ConfigHandler.animationType == 2) FMLCommonHandler.instance()
            .bus()
            .register(new PlayerRenderHandler()); // TickEvents are fired on the FML bus
    }
}
