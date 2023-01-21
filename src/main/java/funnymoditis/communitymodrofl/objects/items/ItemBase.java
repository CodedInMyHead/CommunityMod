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
        CreativeTabs creativeTab = developer == Developer.MICHA ? Main.MICHA_TAB : CreativeTabs.MATERIALS;
        setCreativeTab(creativeTab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
