package funnymoditis.communitymodrofl.tabs;

import funnymoditis.communitymodrofl.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ShanineTab extends CreativeTabs{

    public ShanineTab() {
        super("shanine");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.BIT);
    }
}
