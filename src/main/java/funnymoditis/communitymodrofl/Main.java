package funnymoditis.communitymodrofl;

import funnymoditis.communitymodrofl.entity.EntityInit;
import funnymoditis.communitymodrofl.proxy.CommonProxy;
import funnymoditis.communitymodrofl.tabs.FlorianTab;
import funnymoditis.communitymodrofl.tabs.LegacyTab;
import funnymoditis.communitymodrofl.tabs.MichaTab;
import funnymoditis.communitymodrofl.tabs.ShanineTab;
import funnymoditis.communitymodrofl.util.handlers.RenderHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = Main.MOD_ID,
        name = Main.MOD_NAME,
        version = Main.VERSION
)
public class Main {

    public static final String MOD_ID = "communitymodrofl";
    public static final String CLIENT_PROXY = "funnymoditis." + MOD_ID + ".proxy.ClientProxy";
    public static final String COMMON_PROXY = "funnymoditis." + MOD_ID + ".proxy.CommonProxy";
    public static final String MOD_NAME = "BossFights";
    public static final String VERSION = "1.0";

    public static final CreativeTabs MICHA_TAB = new MichaTab();
    public static final CreativeTabs FLORIAN_TAB = new FlorianTab();
    public static final CreativeTabs SHANINE_TAB = new ShanineTab();
    public static final CreativeTabs LEGACY_TAB = new LegacyTab();

    @Mod.Instance(MOD_ID)
    public static Main instance;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        EntityInit.registerEntities();
        RenderHandler.registerEntityHandlers();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Blocks {
      /*
          public static final MySpecialBlock mySpecialBlock = null; // placeholder for special block below
      */
    }

    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Items {
      /*
          public static final ItemBlock mySpecialBlock = null; // itemblock for the block above
          public static final MySpecialItem mySpecialItem = null; // placeholder for special item below
      */
    }
}
