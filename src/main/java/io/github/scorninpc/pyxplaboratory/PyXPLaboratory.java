package io.github.scorninpc.pyxplaboratory;

import io.github.pylonmc.pylon.base.BaseKeys;
import io.github.pylonmc.pylon.base.BasePages;
import io.github.pylonmc.pylon.base.PylonBase;
import io.github.pylonmc.pylon.base.recipes.TableSawRecipe;
import io.github.pylonmc.pylon.core.addon.PylonAddon;
import io.github.pylonmc.pylon.core.content.guide.PylonGuide;
import io.github.pylonmc.pylon.core.guide.pages.base.SimpleStaticGuidePage;
import io.github.pylonmc.pylon.core.item.PylonItem;
import io.github.pylonmc.pylon.core.item.builder.ItemStackBuilder;
import io.github.pylonmc.pylon.core.recipe.PylonRecipe;
import io.github.pylonmc.pylon.core.recipe.RecipeType;
import io.github.scorninpc.pyxplaboratory.items.XPLaboratoryItem;
import io.papermc.paper.datacomponent.DataComponentTypes;
import io.papermc.paper.datacomponent.item.FoodProperties;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.bukkit.NamespacedKey;
import org.bukkit.Tag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.recipe.CraftingBookCategory;

import java.util.Locale;
import java.util.Set;

@SuppressWarnings("unused")
public class PyXPLaboratory extends JavaPlugin implements PylonAddon {

	// The `instance` field stores the instance of the addon (there's only ever one)
	@Getter private static PyXPLaboratory instance;

	// page/category item
	public static NamespacedKey pageKey;

	// Called when our plugin is enabled
	@Override
	public void onEnable() {
		instance = this;

		// Every Pylon addon must call this BEFORE doing anything Pylon-related
		registerWithPylon();

		// initialize the keys
		pageKey = new NamespacedKey(PyXPLaboratory.getInstance(), "xplaboratorypage");

		// initialize the itens
		XPLaboratoryItem.initialize();
	}

	@Override
	public @NotNull JavaPlugin getJavaPlugin() {
		return this;
	}

	@Override
	public @NotNull Set<@NotNull Locale> getLanguages() {
		return Set.of(Locale.ENGLISH);
	}

	@Override
	public @NotNull Material getMaterial() {
		return Material.DEAD_BUSH;
	}
}
