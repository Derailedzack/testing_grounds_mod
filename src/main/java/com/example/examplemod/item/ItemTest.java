package com.example.examplemod.item;

import com.mojang.authlib.GameProfile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.network.play.server.SEntityPacket;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.server.ServerMultiWorld;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.FakePlayer;

import java.util.Objects;
import java.util.UUID;

public class ItemTest extends Item {
    private ArmorStandEntity armorStandEntity;
    private PlayerEntity player;
    private ServerWorld serverWorld;
    public ItemTest(Properties properties) {
        super(properties);
       // this.setRegistryName("dev_item");
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
        armorStandEntity = new ArmorStandEntity(context.getWorld(),context.getPos().getX(),context.getPos().getY(),context.getPos().getZ());
        player = new FakePlayer(Objects.requireNonNull(context.getWorld().getServer()).getWorld(DimensionType.OVERWORLD),Objects.requireNonNull(new GameProfile(UUID.randomUUID(),"Ghostfreddy")));
       // serverWorld = new ServerMultiWorld();
        context.getWorld().addEntity(player);

        return ActionResultType.SUCCESS;
    }

    @Override
    public void onUse(World worldIn, LivingEntity livingEntityIn, ItemStack stack, int count) {
        super.onUse(worldIn, livingEntityIn, stack, count);
    }
}
