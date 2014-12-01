package com.tntobi.firstmod.creative;

import com.tntobi.firstmod.init.ModBlock;
import com.tntobi.firstmod.init.ModItem;
import com.tntobi.firstmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Tobias on 01.12.2014.
 */
public class CreativeTabFM
{
    public static final CreativeTabs FM_TAB;

    static {
        FM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
            @Override
            public Item getTabIconItem() {
                return ModItem.compressorIcon;
            }
            @Override
        public String getTranslatedTabLabel(){
                return "First Mod";
            }
        };
    }
}
