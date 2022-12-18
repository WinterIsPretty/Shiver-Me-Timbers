
package net.mcreator.shivermetimbers.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.shivermetimbers.ShiverMeTimbersModElements;

@ShiverMeTimbersModElements.ModElement.Tag
public class StoneHammerItem extends ShiverMeTimbersModElements.ModElement {
	@ObjectHolder("shiver_me_timbers:stone_hammer")
	public static final Item block = null;

	public StoneHammerItem(ShiverMeTimbersModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 1;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("stone_hammer"));
	}
}
