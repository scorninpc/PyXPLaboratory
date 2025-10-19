package io.github.scorninpc.pyxplaboratory.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.recipe.CraftingBookCategory;

import io.github.pylonmc.pylon.core.block.PylonBlock;
import io.github.pylonmc.pylon.core.block.base.PylonEntityHolderBlock;
import io.github.pylonmc.pylon.core.block.base.PylonInteractBlock;
import io.github.pylonmc.pylon.core.content.guide.PylonGuide;
import io.github.pylonmc.pylon.core.guide.pages.base.SimpleStaticGuidePage;
import io.github.pylonmc.pylon.core.item.base.PylonBlockInteractor;
import io.github.pylonmc.pylon.core.item.builder.ItemStackBuilder;
import io.github.pylonmc.pylon.core.recipe.RecipeType;
import io.github.scorninpc.pyxplaboratory.PyXPLaboratory;

public class XPLaboratoryItem extends PylonBlock implements PylonInteractBlock, PylonEntityHolderBlock, PylonBlockInteractor
{

	public static NamespacedKey itemKey = new NamespacedKey(PyXPLaboratory.getInstance(), "xplaboratory");

	public XPLaboratoryItem(Block block)
	{
		super(block);
		//TODO Auto-generated constructor stub
	}

	@Override
	public void onInteract(PlayerInteractEvent arg0)
	{
		Bukkit.getLogger().info("Unimplemented method 'onInteract'");
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'onInteract'");
	}

	@Override
	public void onUsedToClickBlock(PlayerInteractEvent arg0) {
		Bukkit.getLogger().info("Unimplemented method 'onUsedToClickBlock'");
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'onUsedToClickBlock'");
	}

	/**
	 * initialize the item
	 */
	public static void initialize()
	{
		// create the item
		ItemStack XPLABORATORY = ItemStackBuilder.pylon(Material.SCULK_SHRIEKER, XPLaboratoryItem.itemKey).build();

		// register the recipe
		ShapedRecipe r = new ShapedRecipe(XPLaboratoryItem.itemKey, XPLABORATORY);
			r.shape("   ", "BGB", "   ");
			r.setIngredient('B', Material.BRICK);
			r.setIngredient('G', Material.GLASS);
			r.setCategory(CraftingBookCategory.BUILDING);
			RecipeType.VANILLA_SHAPED.addRecipe(r);

		// add the item to the category
		SimpleStaticGuidePage XPLABORATORY_PAGE = new SimpleStaticGuidePage(PyXPLaboratory.pageKey, Material.SCULK_SENSOR);
		PylonGuide.getRootPage().addPage(XPLABORATORY_PAGE);
		XPLABORATORY_PAGE.addItem(XPLABORATORY);
	}
	
}
