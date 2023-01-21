package funnymoditis.communitymodrofl.objects.items;

import funnymoditis.communitymodrofl.Main;
import funnymoditis.communitymodrofl.init.ItemInit;
import funnymoditis.communitymodrofl.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
