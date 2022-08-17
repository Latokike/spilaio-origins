package com.github.latokike.registry;

import com.github.latokike.SpilaioOrigins;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
	public static final TagKey<Item> GOLDEN_ARMOR = TagKey.of(Registry.ITEM_KEY,new Identifier(SpilaioOrigins.MODID, "golden_armor"));
	public static final TagKey<Item> GOLDEN_TOOLS = TagKey.of(Registry.ITEM_KEY,new Identifier(SpilaioOrigins.MODID, "golden_tools"));
	public static final TagKey<Item> NETHERITE_GOLD_TOOLS = TagKey.of(Registry.ITEM_KEY,new Identifier(SpilaioOrigins.MODID, "netherite_gold_tools"));
	public static final TagKey<Item> ARMOR = TagKey.of(Registry.ITEM_KEY,new Identifier(SpilaioOrigins.MODID, "armor"));
	public static final TagKey<Item> IRON_TOOLS = TagKey.of(Registry.ITEM_KEY, new Identifier(SpilaioOrigins.MODID, "iron_tools"));
	public static final TagKey<Block> EDIBLE = TagKey.of(Registry.BLOCK_KEY, new Identifier(SpilaioOrigins.MODID, "edible"));
}
