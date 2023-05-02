package one.devos.nautical.creepermultidrop.mixins;


import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;


@Mixin(Creeper.class)
public abstract class CreeperMixin extends Entity {
    public CreeperMixin(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }
    
    /**
     * @author IMS
     * @reason Literally the whole mod.
     */
    @Overwrite
    public boolean canDropMobsSkull() {
        return this.isPowered();
    }
    
    @Shadow
    public abstract boolean isPowered();
}
