package funnymoditis.communitymodrofl.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import static funnymoditis.communitymodrofl.init.ItemInit.COPPER_INGOT;

@SuppressWarnings("NullableProblems")
public class FlorianTab extends CreativeTabs {


    public FlorianTab() {
        super("florian");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(COPPER_INGOT);
    }
}
