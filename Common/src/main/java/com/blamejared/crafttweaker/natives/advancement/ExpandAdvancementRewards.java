package com.blamejared.crafttweaker.natives.advancement;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("vanilla/api/advancement/AdvancementRewards")
@NativeTypeRegistration(value = AdvancementRewards.class, zenCodeName = "crafttweaker.api.advancement.AdvancementRewards")
public class ExpandAdvancementRewards {
    
    @ZenCodeType.Method
    @ZenCodeType.Getter("recipes")
    public static ResourceLocation[] getRecipes(AdvancementRewards internal) {
        
        return internal.getRecipes();
    }
    
    @ZenCodeType.Method
    public static void grant(AdvancementRewards internal, ServerPlayer player) {
        
        internal.grant(player);
    }
    
}
