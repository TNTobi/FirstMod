package com.tntobi.firstmod.block;

import com.tntobi.firstmod.creative.CreativeTabFM;
import com.tntobi.firstmod.reference.Names;

/**
 * Created by Tobias on 01.12.2014.
 */
public class BlockCompressor extends BlockFM {

    public BlockCompressor()
    {
        super();
        this.setBlockName(Names.Blocks.COMPRESSOR);
        this.setBlockTextureName(Names.Blocks.COMPRESSOR);
        this.setCreativeTab(CreativeTabFM.FM_TAB);
    }
}
