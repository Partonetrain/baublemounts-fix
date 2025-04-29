package info.partonetrain.baublemounts_fix.mixin;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.shadowking21.baublemounts.utils.Utils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Utils.class)
public class UtilsMixin {
    @Inject(method = "hasMountComponents", at = @At("RETURN"), cancellable = true)
    private static void baublemounts_fix$hasMountComponents(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir){
        if(!itemStack.is(BuiltInRegistries.ITEM.get(ResourceLocation.parse("baublemounts:mount_bauble")))) {
            cir.setReturnValue(true);
            cir.cancel();
        }
    }
}
