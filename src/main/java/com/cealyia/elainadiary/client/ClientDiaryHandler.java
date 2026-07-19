package com.cealyia.elainadiary.client;  
  
import com.cealyia.elainadiary.client.DiaryScreen;  
import net.minecraft.client.Minecraft;  
import net.minecraft.world.entity.player.Player;  
import net.minecraft.world.item.ItemStack;  
import net.minecraftforge.api.distmarker.Dist;  
import net.minecraftforge.api.distmarker.OnlyIn;  
  
@OnlyIn(Dist.CLIENT)  
public class ClientDiaryHandler {  
    public static void openDiaryScreen(Player player, ItemStack stack) {  
        Minecraft.getInstance().setScreen(new DiaryScreen(player, stack));  
    }  
}