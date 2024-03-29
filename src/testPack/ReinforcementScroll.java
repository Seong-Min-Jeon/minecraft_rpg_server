package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ReinforcementScroll {

	public void openInv(Player player, ItemStack itemArg) {
		if (itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "강화 주문서")) {
			itemArg.setAmount(itemArg.getAmount()-1);
			Inventory inv = Bukkit.createInventory(player, 9, "Reinforcement table");
			ItemStack ok = new ItemStack(Material.SLIME_BALL);
			ItemMeta okIm = ok.getItemMeta();
			okIm.setDisplayName(ChatColor.GREEN + "강화하기");
			ArrayList<String> okLore = new ArrayList();
			okLore.add(ChatColor.GRAY + "왼쪽에 장비(생활 장비는 강화 불가), 오른쪽에 재료를 넣고 눌러주세요.");
			okIm.setLore(okLore);
			okIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			okIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			ok.setItemMeta(okIm);
			ItemStack no = new ItemStack(Material.SHULKER_SHELL);
			ItemMeta noIm = no.getItemMeta();
			noIm.setDisplayName(ChatColor.RED + "나가기");
			noIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			noIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			no.setItemMeta(noIm);
			ItemStack bar = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
			ItemMeta barIm = bar.getItemMeta();
			barIm.setDisplayName(ChatColor.RED + " ");
			barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			bar.setItemMeta(barIm);
			ItemStack image = new ItemStack(Material.STONE_AXE);
			ItemMeta imageIm = image.getItemMeta();
			imageIm.setDisplayName(ChatColor.RED + " ");
			imageIm.setCustomModelData(1);
			imageIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			imageIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			imageIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
			imageIm.addItemFlags(ItemFlag.HIDE_DYE);
			imageIm.addItemFlags(ItemFlag.HIDE_PLACED_ON);
			image.setItemMeta(imageIm);
			inv.setItem(2, bar);
			inv.setItem(3, bar);
			inv.setItem(4, image);
			inv.setItem(5, bar);
			inv.setItem(6, bar);
			inv.setItem(7, ok);
			inv.setItem(8, no);
			player.openInventory(inv);
		}
	}
	
}
