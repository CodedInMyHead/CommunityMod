package funnymoditis.communitymodrofl.util.handlers;

import funnymoditis.communitymodrofl.init.BlockInit;
import funnymoditis.communitymodrofl.init.ItemInit;
import funnymoditis.communitymodrofl.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {

        ItemInit.ITEMS.forEach(item -> {
            if(item instanceof IHasModel) {
                ((IHasModel)item).registerModels();
            }
        });

        BlockInit.BLOCKS.forEach(block -> {
            if(block instanceof IHasModel) {
                ((IHasModel)block).registerModels();
            }
        });

    }
}
