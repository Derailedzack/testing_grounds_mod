package com.example.examplemod.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class BlockTest extends Block {
    public BlockTest() {
        super(Block.Properties.create(Material.MISCELLANEOUS));
        NonNullList<ItemStack> list =  NonNullList.create();
        //list.add(1,);

        //list.add(new ItemStack(Item.BLOCK_TO_ITEM.put(this,new Item(new Item.Properties()))));
        fillItemGroup(ItemGroup.HOTBAR, list);
    }

    @Override
    public void onBlockClicked(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
        super.onBlockClicked(state, worldIn, pos, player);
        player.jump();
    }

    @Override
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
        System.out.println(stack);
        super.harvestBlock(worldIn, player, pos, state, te, stack);
    }

  //  @Override
    //public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
      //  return false;
    //}
}