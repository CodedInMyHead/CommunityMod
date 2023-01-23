package funnymoditis.communitymodrofl.objects.items;

import funnymoditis.communitymodrofl.Main;
import funnymoditis.communitymodrofl.init.ItemInit;
import funnymoditis.communitymodrofl.tabs.MichaTab;
import funnymoditis.communitymodrofl.util.Developer;
import funnymoditis.communitymodrofl.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name, Developer developer) {
        setTranslationKey(name);
        setRegistryName(name);
        CreativeTabs creativeTab;
        switch (developer) {
            case FLORIAN:
                creativeTab = Main.FLORIAN_TAB;
                break;
            case SHANINE:
                creativeTab = Main.SHANINE_TAB;
                break;
            case LEGACY_DEV:
                creativeTab = Main.LEGACY_TAB;
                break;
            default: creativeTab = Main.MICHA_TAB;
        }
        setCreativeTab(creativeTab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
