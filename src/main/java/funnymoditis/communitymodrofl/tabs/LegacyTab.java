package funnymoditis.communitymodrofl.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import static funnymoditis.communitymodrofl.init.ItemInit.ICE_SWORD;

@SuppressWarnings("NullableProblems")
public class LegacyTab extends CreativeTabs{

    public LegacyTab() {
        super("legacy");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ICE_SWORD);
    }

}
