package com.github.latokike.power;

import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.function.Predicate;

public class ModifyBehaviorPower extends Power {

    private final Predicate<LivingEntity> entityCondition;

    public ModifyBehaviorPower(PowerType<?> type, LivingEntity entity, Predicate<LivingEntity> entityCondition) {
        super(type, entity);
        this.entityCondition = entityCondition;
    }

    public boolean apply(Entity entity) {
        return entity instanceof LivingEntity && (entityCondition == null || entityCondition.test((LivingEntity)entity));
    }
}
