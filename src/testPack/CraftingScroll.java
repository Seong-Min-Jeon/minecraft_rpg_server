package testPack;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CraftingScroll {

	public void openInv(Player player, Item itemArg) {
		if (itemArg.getItemStack().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "������ â�� ��ũ��")) {
			itemArg.remove();
			Inventory inv = Bukkit.createInventory(player, 45, "Crafting table");
			ItemStack ok = new ItemStack(Material.SLIME_BALL);
			ItemMeta okIm = ok.getItemMeta();
			okIm.setDisplayName(ChatColor.GREEN + "�����ϱ�");
			ArrayList<String> okLore = new ArrayList();
			okLore.add(ChatColor.GRAY + "���� ���̺��� ���� ���縦 �ְ� ��ư�� �����ּ���.");
			okIm.setLore(okLore);
			okIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			okIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			ok.setItemMeta(okIm);
			ItemStack no = new ItemStack(Material.SHULKER_SHELL);
			ItemMeta noIm = no.getItemMeta();
			noIm.setDisplayName(ChatColor.RED + "������");
			noIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			noIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			no.setItemMeta(noIm);
			ItemStack bar = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
			ItemMeta barIm = bar.getItemMeta();
			barIm.setDisplayName(ChatColor.RED + " ");
			barIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			barIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			bar.setItemMeta(barIm);
			ItemStack arrow = new ItemStack(Material.BLUE_STAINED_GLASS_PANE);
			ItemMeta arrowIm = arrow.getItemMeta();
			arrowIm.setDisplayName(ChatColor.RED + " ");
			arrowIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			arrowIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			arrow.setItemMeta(arrowIm);
			ItemStack arrow2 = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
			ItemMeta arrow2Im = arrow2.getItemMeta();
			arrow2Im.setDisplayName(ChatColor.RED + " ");
			arrow2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			arrow2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			arrow2.setItemMeta(arrow2Im);
			inv.setItem(5, bar);
			inv.setItem(6, bar);
			inv.setItem(7, bar);
			inv.setItem(8, bar);
			inv.setItem(14, bar);
			inv.setItem(15, bar);
			inv.setItem(16, bar);
			inv.setItem(17, bar);
			inv.setItem(23, arrow);
			inv.setItem(24, arrow2);
			inv.setItem(26, bar);
			inv.setItem(32, bar);
			inv.setItem(33, bar);
			inv.setItem(34, bar);
			inv.setItem(35, bar);
			inv.setItem(41, bar);
			inv.setItem(42, bar);
			inv.setItem(43, ok);
			inv.setItem(44, no);
			player.openInventory(inv);
		}
	}
	
}