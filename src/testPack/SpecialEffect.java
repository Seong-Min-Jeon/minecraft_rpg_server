package testPack;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SpecialEffect {
	
	Random rnd = new Random();
	
	public int a1(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "은반지")) {
				return 1;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a2(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "무지개 반사")) {
				return thorns;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a3(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "무한 반사")) {
				return thorns * 2;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a4(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "미라클 반사")) {
				return thorns * 3;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a5(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_RED + "블랙홀 반사")) {
				return thorns * 4;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a6(Player player, int thorns) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "우주 반사")) {
				return thorns * 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a7(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.LIGHT_PURPLE + "인피니티")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a8(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "타락한 반지")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a9(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "푸른 기운의 반지")) {
				return 3;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a10(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "녹슨 반지")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int a11(Player player) {
		try {
			if(player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "골든 임펙트")) {
				return 10;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int h1(Player player) {
		try {
			if(player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "삼보룡")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int h2(Player player) {
		try {
			if(player.getInventory().getHelmet().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "호크아이")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int c1(Player player) {
		try {
			if(player.getInventory().getChestplate().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "진월")) {
				return 1;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int l1(Player player) {
		try {
			if(player.getInventory().getLeggings().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "엑스에어리얼")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public int b1(Player player) {
		try {
			if(player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "질주하는 자극")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
	
	public int b2(Player player) {
		try {
			if(player.getInventory().getBoots().getItemMeta().getDisplayName().equals(ChatColor.AQUA + "스쿠트")) {
				return 5;
			}
		} catch(Exception e) {
			
		}
		return 0;
	}
}
