package funnymoditis.communitymodrofl.tabs;

import funnymoditis.communitymodrofl.init.ItemInit;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MichaTab extends CreativeTabs {


    public MichaTab() {
        super("micha");
    }

    @MethodsReturnNonnullByDefault
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.GUY_FAWKES_MASK);
    }
}
