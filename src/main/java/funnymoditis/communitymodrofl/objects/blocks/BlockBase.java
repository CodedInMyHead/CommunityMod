package funnymoditis.communitymodrofl.objects.blocks;

import funnymoditis.communitymodrofl.Main;
import funnymoditis.communitymodrofl.init.BlockInit;
import funnymoditis.communitymodrofl.init.ItemInit;
import funnymoditis.communitymodrofl.util.Developer;
import funnymoditis.communitymodrofl.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material, Developer developer) {
        super(material);
        setRegistryName(name);
        setTranslationKey(name);
        CreativeTabs creativeTab = developer == Developer.MICHA ? Main.MICHA_TAB : CreativeTabs.MATERIALS;
        setCreativeTab(creativeTab);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
