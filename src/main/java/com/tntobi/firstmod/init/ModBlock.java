package com.tntobi.firstmod.init;

import com.tntobi.firstmod.block.BlockCompressor;
import com.tntobi.firstmod.block.BlockFM;
import com.tntobi.firstmod.reference.Names;
import com.tntobi.firstmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Tobias on 01.12.2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlock {

    public static final BlockFM compressor = new BlockCompressor();

    public static void init()
    {
        GameRegistry.registerBlock(compressor, Names.Blocks.COMPRESSOR);
    }
}

