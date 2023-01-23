package funnymoditis.communitymodrofl.init;

import funnymoditis.communitymodrofl.objects.items.ItemBase;
import funnymoditis.communitymodrofl.util.Developer;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<>();


    // Test Data
    public static final Item COPPER_INGOT = new ItemBase("ingot_copper", Developer.MICHA);

    // Micha summoning
    public static final Item BIT = new ItemBase("bit", Developer.MICHA);
    public static final Item BYTE = new ItemBase("byte", Developer.MICHA);
    public static final Item LAPTOP = new ItemBase("laptop", Developer.MICHA);
    public static final Item POWER_SUPPLY = new ItemBase("psu", Developer.MICHA);
    public static final Item MATRIX = new ItemBase("matrix", Developer.MICHA);
    public static final Item ICE_SWORD = new ItemBase("sword_ice", Developer.MICHA);

    public static final Item GUY_FAWKES_MASK = new ItemBase("helmet_guy_fawkes", Developer.MICHA);
}
