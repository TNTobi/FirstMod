package com.tntobi.firstmod.init;

import com.tntobi.firstmod.item.ItemFM;
import com.tntobi.firstmod.item.ItemTabIcon;
import com.tntobi.firstmod.reference.Names;
import com.tntobi.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Tobias on 01.12.2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItem {
    public static final ItemFM compressorIcon = new ItemTabIcon();

    public static void init()
    {
        GameRegistry.registerItem(compressorIcon, Names.Items.COMPRESSORICON);
    }
}
