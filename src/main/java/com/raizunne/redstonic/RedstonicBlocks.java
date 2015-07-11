package com.raizunne.redstonic;

import com.raizunne.redstonic.Block.BlockCompressed;
import com.raizunne.redstonic.Block.DrillModifier;
import com.raizunne.redstonic.Block.Driller;
import com.raizunne.redstonic.Block.HyperSmelter;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Raizunne as a part of Redstonic
 * on 05/02/2015, 06:15 AM.
 */
public class RedstonicBlocks {

    public static Block Modifier = new DrillModifier(Material.ground);
    public static Block GlowSteel = new BlockCompressed(0);
    public static Block Vibrantium = new BlockCompressed(1);
    public static Block HyperSmelter = new HyperSmelter();

    public static Block Driller = new Driller(Material.ground);

    public static void init(){
        GameRegistry.registerBlock(Modifier, Modifier.getUnlocalizedName());
        GameRegistry.registerBlock(Vibrantium, Vibrantium.getUnlocalizedName());
        GameRegistry.registerBlock(GlowSteel, GlowSteel.getUnlocalizedName());

        GameRegistry.registerBlock(HyperSmelter, HyperSmelter.getUnlocalizedName());
        GameRegistry.registerBlock(Driller, Driller.getUnlocalizedName());
    }

}
