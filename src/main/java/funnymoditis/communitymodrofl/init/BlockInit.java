package funnymoditis.communitymodrofl.init;

import funnymoditis.communitymodrofl.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final BlockBase BLOCK_COPPER = new BlockBase("block_copper", Material.SPONGE);
    public static final BlockBase ORE_GLITCH = new BlockBase("ore_glitch", Material.AIR);
}
