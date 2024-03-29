package testPack;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.PotionMeta;

public class LootChest {
	
	Random rnd = new Random();

	public void open(Player player, Block block) {
		if(block.getType() == Material.WHITE_GLAZED_TERRACOTTA) {
			if(block.getX()==3619 && block.getY()==44 && block.getZ()==3792) {
				if(removeKey(player, "잊혀진 바다 신전 보상 열쇠")) {
					dungeon1(player);
					
					QuestBoard cb = new QuestBoard();
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===수련의 시작===")) {
						int qNum = cb.getNum(player);
						cb.mq2(player, qNum + 1);
					}
				}				
			}
			if(block.getX()==3470 && block.getY()==54 && block.getZ()==3751){
				if(removeKey(player, "숲의 유적 보상 열쇠")) {
					dungeon2(player);
					
					QuestBoard cb = new QuestBoard();
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===유적을 정화하는 자===")) {
						int qNum = cb.getNum(player);
						cb.q7(player, qNum + 1);
					}
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===숲 깊은 곳===")) {
						int qNum = cb.getNum(player);
						cb.q6(player, qNum + 1);
					}
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===촌장의 부탁2===")) {
						int qNum = cb.getNum(player);
						cb.mq5(player, qNum + 1);
					}
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===제사장의 기억1===")) {
						int qNum = cb.getNum(player);
						cb.eq3(player, qNum + 1);
					}
				}				
			}
			if(block.getX()==3775 && block.getY()==74 && block.getZ()==3561) {
				if(removeKey(player, "타락한 요정 왕국 보상 열쇠")) {
					dungeon3(player);
					
					QuestBoard cb = new QuestBoard();
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===진실을 아는 자4===")) {
						int qNum = cb.getNum(player);
						cb.mq20_1(player, qNum + 1);
					}
				}				
			}
			if(block.getX()==3724 && block.getY()==145 && block.getZ()==3194) {
				if(removeKey(player, "카루 던전 보상 열쇠")) {
					dungeon4(player);
				}				
			}
			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
				if(removeKey(player, "용도를 모르는 열쇠")) {
					dungeon4(player);
				}				
			}
			if(block.getX()==3329 && block.getY()==14 && block.getZ()==3782) {
				int num = 0;
				if(num == 0) {
					if(removeKey(player, "아덴의 저택 보상 열쇠")) {
						dungeon5(player);
						num++;
					}
				}
				if(num == 0) {
					if(removeKey(player, "숨겨진 아덴의 저택 보상 열쇠")) {
						dungeon6(player);
					}
				}
			}
			if(block.getX()==75 && block.getY()==240 && block.getZ()==-10) {
				if(removeKey(player, "죽음의 탑 1층 보상 열쇠")) {
					tower1(player);
				}				
			}
			if(block.getX()==69 && block.getY()==240 && block.getZ()==-10) {
				if(removeKey(player, "죽음의 탑 2층 보상 열쇠")) {
					tower2(player);
				}				
			}
			if(block.getX()==75 && block.getY()==240 && block.getZ()==-15) {
				if(removeKey(player, "죽음의 탑 3층 보상 열쇠")) {
					tower3(player);
					
					QuestBoard cb = new QuestBoard();
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===제사장의 기억2===")) {
						int qNum = cb.getNum(player);
						cb.eq3_1(player, qNum + 1);
					}
				}				
			}
			if(block.getX()==69 && block.getY()==240 && block.getZ()==-15) {
				if(removeKey(player, "죽음의 탑 4층 보상 열쇠")) {
					tower4(player);
				}				
			}
			if(block.getX()==75 && block.getY()==240 && block.getZ()==-20) {
				if(removeKey(player, "죽음의 탑 5층 보상 열쇠")) {
					tower5(player);
				}				
			}
			if(block.getX()==69 && block.getY()==240 && block.getZ()==-20) {
				if(removeKey(player, "죽음의 탑 6층 보상 열쇠")) {
					tower6(player);
				}				
			}
			if(block.getX()==75 && block.getY()==240 && block.getZ()==-25) {
				if(removeKey(player, "죽음의 탑 7층 보상 열쇠")) {
					tower7(player);
				}				
			}
			if(block.getX()==69 && block.getY()==240 && block.getZ()==-25) {
				if(removeKey(player, "죽음의 탑 8층 보상 열쇠")) {
					tower8(player);
				}				
			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "죽음의 탑 9층 보상 열쇠")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "죽음의 탑 10층 보상 열쇠")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "죽음의 탑 11층 보상 열쇠")) {
//					tower1(player);
//				}				
//			}
//			if(block.getX()==3713 && block.getY()==17 && block.getZ()==3156) {
//				if(removeKey(player, "죽음의 탑 12층 보상 열쇠")) {
//					tower1(player);
//				}				
//			}
			if(block.getX()==28 && block.getY()==62 && block.getZ()==689) {
				if(removeKey(player, "미궁 보상 열쇠")) {
					dungeon7(player);
				}				
			}
			if(block.getX()==709 && block.getY()==59 && block.getZ()==589) {
				if(removeKey(player, "아라크네의 저주 보상 열쇠")) {
					dungeon8(player);
					
					QuestBoard cb = new QuestBoard();
					if (cb.getQuestName(player).equals(ChatColor.LIGHT_PURPLE + "===아라크네의 저주===")) {
						int qNum = cb.getNum(player);
						cb.mq40(player, qNum + 1);
					}
				}				
			}
			if(block.getX()==3658 && block.getY()==100 && block.getZ()==2868) {
				if(removeKey(player, "고대의 암석 협곡 보상 열쇠")) {
					dungeon9(player);
				}				
			}
			if(block.getX()==118 && block.getY()==64 && block.getZ()==1958) {
				if(removeKey(player, "C급 투기장 보상 열쇠")) {
					dungeon10(player);
				}				
			}
			if(block.getX()==116 && block.getY()==64 && block.getZ()==1956) {
				if(removeKey(player, "B급 투기장 보상 열쇠")) {
					dungeon11(player);
				}				
			}
			if(block.getX()==116 && block.getY()==64 && block.getZ()==1954) {
				if(removeKey(player, "A급 투기장 보상 열쇠")) {
					dungeon12(player);
				}				
			}
			if(block.getX()==118 && block.getY()==64 && block.getZ()==1952) {
				if(removeKey(player, "S급 투기장 보상 열쇠")) {
					dungeon13(player);
				}				
			}
			if(block.getX()==3770 && block.getY()==135 && block.getZ()==2550) {
				if(removeKey(player, "깊숙한 점액 동굴 보상 열쇠")) {
					dungeon14(player);
				}				
			}
			if(block.getX()==3825 && block.getY()==135 && block.getZ()==4018) {
				if(removeKey(player, "잊혀진 바다 신전 하드 보상 열쇠")) {
					dungeon15(player);
				}				
			}
			if(block.getX()==3826 && block.getY()==83 && block.getZ()==4121) {
				if(removeKey(player, "숲의 유적 하드 보상 열쇠")) {
					dungeon16(player);
				}				
			}
			
		}
	}
	
	public void dungeon1(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(10);
		int num2 = rnd.nextInt(10);
		int num3 = rnd.nextInt(10);
		int num4 = rnd.nextInt(5);
		int num5 = rnd.nextInt(30);	
		int num6 = rnd.nextInt(20);	
		int num7 = rnd.nextInt(30) + 10;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);	
		int tokenPercent = rnd.nextInt(10);	
		
		ItemStack var1 = new ItemStack(Material.ACACIA_PLANKS);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("7,0,0,0,0,0,0,0,0,0,15");
		var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "섬광열권");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 15");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "평범하게 생긴 검");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.COBBLESTONE_WALL);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,7,15");
		var2Im.setDisplayName(ChatColor.LIGHT_PURPLE + "귀곡연권");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 15");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "워그닐 기사단이 사용하던 검");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta var3meta = (LeatherArmorMeta) var3.getItemMeta();
		var3meta.setColor(Color.fromRGB(255, 255, 255));
		var3.setItemMeta(var3meta);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,10,0,0,0,0,20");
		var3Im.setDisplayName(ChatColor.LIGHT_PURPLE + "백로");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 20");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "깃털로 만들어진 갑옷");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.addItemFlags(ItemFlag.HIDE_DYE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta var4meta = (LeatherArmorMeta) var4.getItemMeta();
		var4meta.setColor(Color.fromRGB(50, 75, 255));
		var4.setItemMeta(var4meta);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,0,0,0,0,5");
		var4Im.setDisplayName(ChatColor.YELLOW + "파도");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "심해의 특수한 광물로 만들어진 신발");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.addItemFlags(ItemFlag.HIDE_DYE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.BLACK_CARPET);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("20,0,0,0,5,0,0,0,0,0,25");
		var5Im.setDisplayName(ChatColor.AQUA + "귀풍문");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 25");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "바다의 분노가 담긴 도끼");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "퀘스트: 해적선의 보물");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'해적선의 보물' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);	
		
		ItemStack token = new ItemStack(Material.PRISMARINE_SHARD);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "바다의 파편");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.EMERALD, num7);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, scroll);
		}
		if(scrollPercent1<=100) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=1) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, token);
		}
		
		player.openInventory(inv);		
	}
	
	public void dungeon2(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(50);
		int num2 = rnd.nextInt(5);
		int num3 = rnd.nextInt(20);
		int num4 = rnd.nextInt(10);
		int num5 = rnd.nextInt(30);	
		int num6 = rnd.nextInt(15);	
		int num7 = rnd.nextInt(30) + 34;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.GREEN_CARPET);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("30,0,0,0,10,0,0,0,0,0,50");
		var1Im.setDisplayName(ChatColor.AQUA + "주마윤회");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 50");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "악마의 힘이 잠들어있는 도끼");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta var2meta = (LeatherArmorMeta) var2.getItemMeta();
		var2meta.setColor(Color.fromRGB(0, 155, 50));
		var2.setItemMeta(var2meta);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,60");
		var2Im.setDisplayName(ChatColor.GREEN + "숲의 가호가 담긴 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 60");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "싱그러운 느낌이 나는 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.addItemFlags(ItemFlag.HIDE_DYE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta var3meta = (LeatherArmorMeta) var3.getItemMeta();
		var3meta.setColor(Color.fromRGB(0, 155, 50));
		var3.setItemMeta(var3meta);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,60");
		var3Im.setDisplayName(ChatColor.GREEN + "숲의 가호가 담긴 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 60");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "싱그러운 느낌이 나는 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.addItemFlags(ItemFlag.HIDE_DYE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.LEATHER_LEGGINGS);
		LeatherArmorMeta var4meta = (LeatherArmorMeta) var4.getItemMeta();
		var4meta.setColor(Color.fromRGB(0, 155, 50));
		var4.setItemMeta(var4meta);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,60");
		var4Im.setDisplayName(ChatColor.GREEN + "숲의 가호가 담긴 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 60");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "싱그러운 느낌이 나는 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.addItemFlags(ItemFlag.HIDE_DYE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta var5meta = (LeatherArmorMeta) var5.getItemMeta();
		var5meta.setColor(Color.fromRGB(0, 155, 50));
		var5.setItemMeta(var5meta);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,60");
		var5Im.setDisplayName(ChatColor.GREEN + "숲의 가호가 담긴 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 60");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "싱그러운 느낌이 나는 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.addItemFlags(ItemFlag.HIDE_DYE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack scroll = new ItemStack(Material.GLOBE_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "퀘스트: 유적을 정화하는 자");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "'유적을 정화하는 자' 퀘스트를 진행할 수 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);		
		
		ItemStack token = new ItemStack(Material.KELP);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "숲의 바람");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.EMERALD, num7);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, scroll);
		}
		if(scrollPercent1<=150) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=2) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, token);
		}
		
		player.openInventory(inv);		
	}
	
	public void dungeon3(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(20);
		int num3 = rnd.nextInt(30);
		int num4 = rnd.nextInt(25);
		int num5 = rnd.nextInt(20);	
		int num6 = rnd.nextInt(10);	
		int num7 = rnd.nextInt(1000);	
		int num8 = rnd.nextInt(60);	
		int num9 = rnd.nextInt(20);	
		int num10 = rnd.nextInt(100);	
		int num11 = rnd.nextInt(30) + 20;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.STONE);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("250,100,0,100,10,200,100,100,100,200,200");
		var1Im.setDisplayName(ChatColor.AQUA + "요정왕의 검");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 200");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "요정왕이 사용하는 검이다.");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("100,0,0,0,0,0,0,0,0,0,210");
		var2Im.setDisplayName(ChatColor.GREEN + "루나 페어리 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 210");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "요정 가루의 힘으로 만들어진 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("100,0,0,0,0,0,0,0,0,0,210");
		var3Im.setDisplayName(ChatColor.GREEN + "루나 페어리 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 210");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "요정 가루의 힘으로 만들어진 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("100,0,0,0,0,0,0,0,0,0,210");
		var4Im.setDisplayName(ChatColor.GREEN + "루나 페어리 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 210");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "요정 가루의 힘으로 만들어진 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("100,0,0,0,0,0,0,0,0,0,210");
		var5Im.setDisplayName(ChatColor.GREEN + "루나 페어리 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 210");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "요정 가루의 힘으로 만들어진 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.POTION);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setDisplayName(ChatColor.LIGHT_PURPLE + "사랑의 묘약");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "눈 밑에 바르면 보이는 사람과 사랑에 빠지게 된다고 한다.");
		var6Lore.add(ChatColor.GRAY + "사용 시 자신 레벨 이하의 파티원에게 이동할 수도 있다.");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		PotionMeta pM = (PotionMeta) var6.getItemMeta();
		pM.setColor(Color.PURPLE);
		var6Im = (ItemMeta) pM;
		var6.setItemMeta(pM);
		
		ItemStack var7 = new ItemStack(Material.OAK_PLANKS);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("500,0,0,300,400,500,0,0,0,0,250");
		var7Im.setDisplayName(ChatColor.DARK_RED + "일루시데이터");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "레벨 제한: 250");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "부유성 50층 보스에게 드랍된 마검");
		var7Lore.add(ChatColor.GRAY + "평범한 마스터 클래스의 검보다도 성능이 좋다.");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("200,0,0,0,0,200,0,0,0,200,180");
		var8Im.setDisplayName(ChatColor.LIGHT_PURPLE + "어퓨즈");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "레벨 제한: 180");
		var8Lore.add(ChatColor.GRAY + " ");
		var8Lore.add(ChatColor.GRAY + "요정 대장장이가 만든 갑옷");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setLocalizedName("0,0,0,0,0,500,0,0,0,0,180");
		var9Im.setDisplayName(ChatColor.YELLOW + "무간나찰");
		ArrayList<String> var9Lore = new ArrayList();
		var9Lore.add(ChatColor.GRAY + "레벨 제한: 180");
		var9Lore.add(ChatColor.GRAY + " ");
		var9Lore.add(ChatColor.GRAY + "향신료의 나라에서 수입한 헬멧");
		var9Lore.add(ChatColor.GRAY + "금강불괴의 힘을 느낄 수 있다.");
		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var9Im.setUnbreakable(true);
		var9Im.setLore(var9Lore);
		var9.setItemMeta(var9Im);
		
		ItemStack var10 = new ItemStack(Material.CYAN_WOOL);
		ItemMeta var10Im = var10.getItemMeta();
		var10Im.setLocalizedName("250,100,0,100,10,200,100,100,100,200,200");
		var10Im.setDisplayName(ChatColor.AQUA + "요정여왕의 검");
		ArrayList<String> var10Lore = new ArrayList();
		var10Lore.add(ChatColor.GRAY + "레벨 제한: 200");
		var10Lore.add(ChatColor.GRAY + " ");
		var10Lore.add(ChatColor.GRAY + "요정여왕이 사용하는 검이다.");
		var10Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var10Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var10Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var10Im.setUnbreakable(true);
		var10Im.setLore(var10Lore);
		var10.setItemMeta(var10Im);
		
		ItemStack token = new ItemStack(Material.PRISMARINE_CRYSTALS);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "요정의 날개 조각");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.EMERALD_BLOCK, num11);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		if(num10==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var10);
		}
		if(scrollPercent1<=200) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=2) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, token);
		}
		player.openInventory(inv);	
	}
	
	public void dungeon4(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(20); // 귀팔문
		int num2 = rnd.nextInt(20); // 세트
		int num3 = rnd.nextInt(15); // 세트
		int num4 = rnd.nextInt(8); // 세트
		int num5 = rnd.nextInt(10);	// 세트
		int num6 = rnd.nextInt(50);	// 무간뇌신
		int num7 = rnd.nextInt(500); //크리스탈라이즈 주괴	
		int num8 = rnd.nextInt(50);	// 부조화의 검
		int num9 = rnd.nextInt(40);	// 얼음 활
		int num10 = rnd.nextInt(2) + 1;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.CYAN_WOOL);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("0,0,200,0,0,400,400,0,0,0,230");
		var1Im.setDisplayName(ChatColor.LIGHT_PURPLE + "귀팔문");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 230");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "냉기를 이용해 벌레들에게 피해를 주기 쉬운 검");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,250");
		var2Im.setDisplayName(ChatColor.GREEN + "냉혹한 미명의 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 250");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "차가운 기운이 느껴지는 헬멧");
		var2Lore.add(ChatColor.GRAY + "착용하면 추운 곳에서도 버틸 수 있을 것 같다.");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,250");
		var3Im.setDisplayName(ChatColor.GREEN + "냉혹한 미명의 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 250");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "차가운 기운이 느껴지는 갑옷");
		var3Lore.add(ChatColor.GRAY + "착용하면 추운 곳에서도 버틸 수 있을 것 같다.");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,250");
		var4Im.setDisplayName(ChatColor.GREEN + "냉혹한 미명의 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 250");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "차가운 기운이 느껴지는 각반");
		var4Lore.add(ChatColor.GRAY + "착용하면 추운 곳에서도 버틸 수 있을 것 같다.");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,250");
		var5Im.setDisplayName(ChatColor.GREEN + "냉혹한 미명의 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 250");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "차가운 기운이 느껴지는 신발");
		var5Lore.add(ChatColor.GRAY + "착용하면 추운 곳에서도 버틸 수 있을 것 같다.");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("1,1,1,1,1,1,1,1,1,1,250");
		var6Im.setDisplayName(ChatColor.AQUA + "무간뇌신");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "레벨 제한: 250");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "알 수 없는 재료로 만들어진 특별한 신발");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.NETHERITE_INGOT);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setDisplayName(ChatColor.DARK_RED + "크리스탈라이즈 주괴");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "부조화의 검의 초월 소재");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.BIRCH_LOG);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,0");
		var8Im.setDisplayName(ChatColor.LIGHT_PURPLE + "부조화의 검");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "아무 힘도 느껴지지 않는 검");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.DEAD_BRAIN_CORAL_BLOCK);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setLocalizedName("0");
		var9Im.setDisplayName(ChatColor.GOLD + "뫼비우스");
		ArrayList<String> var9Lore = new ArrayList();
		var9Lore.add(ChatColor.GRAY + "냉기가 느껴지는 활");
		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var9Im.setUnbreakable(true);
		var9Im.setLore(var9Lore);
		var9.setItemMeta(var9Im);
		
		ItemStack token = new ItemStack(Material.BLUE_ICE);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "한기의 정수");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num10);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		if(scrollPercent1<=300) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=3) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, token);
		}
		player.openInventory(inv);	
	}
	
	public void dungeon5(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(80); // 저주받은 검
		int num2 = rnd.nextInt(30); // 세트
		int num3 = rnd.nextInt(18); // 세트
		int num4 = rnd.nextInt(13); // 세트
		int num5 = rnd.nextInt(24);	// 세트
		int num6 = rnd.nextInt(13);	// 역린
		int num7 = rnd.nextInt(15); // 귀신멸열  
		int num8 = rnd.nextInt(20);	// 윤회
		int num9 = rnd.nextInt(10);	// 회향
		int num10 = rnd.nextInt(20) + 10;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.SPRUCE_LOG);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("30,100,50,0,0,0,0,0,0,0,100");
		var1Im.setDisplayName(ChatColor.AQUA + "저주받은 검");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 100");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "포보르들이 가지고 있던 저주가 느껴지는 검");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,100,120");
		var2Im.setDisplayName(ChatColor.GREEN + "잔혹한 동화의 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 120");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "누군가의 소원이 담긴 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,0,0,0,0,100,120");
		var3Im.setDisplayName(ChatColor.GREEN + "잔혹한 동화의 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 120");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "누군가의 소원이 담긴 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,0,0,0,0,100,120");
		var4Im.setDisplayName(ChatColor.GREEN + "잔혹한 동화의 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 120");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "누군가의 소원이 담긴 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,100,120");
		var5Im.setDisplayName(ChatColor.GREEN + "잔혹한 동화의 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 120");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "누군가의 소원이 담긴 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("10,0,0,0,0,80,0,0,0,0,110");
		var6Im.setDisplayName(ChatColor.YELLOW + "역린");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "레벨 제한: 110");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "포보르의 대장장이가 용의 역린을 이용해 만든 헬멧");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("0,0,0,0,50,0,0,0,0,50,110");
		var7Im.setDisplayName(ChatColor.YELLOW + "귀신멸열");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "레벨 제한: 110");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "공격 위주의 힘을 담은 갑옷");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("0,0,0,0,0,130,0,0,0,0,110");
		var8Im.setDisplayName(ChatColor.LIGHT_PURPLE + "윤회");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "레벨 제한: 110");
		var8Lore.add(ChatColor.GRAY + " ");
		var8Lore.add(ChatColor.GRAY + "울링님 여기에 윤회 설명 적어주시면 됩니다.");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setLocalizedName("0,0,0,0,0,40,40,40,40,0,110");
		var9Im.setDisplayName(ChatColor.YELLOW + "회향");
		ArrayList<String> var9Lore = new ArrayList();
		var9Lore.add(ChatColor.GRAY + "레벨 제한: 110");
		var9Lore.add(ChatColor.GRAY + " ");
		var9Lore.add(ChatColor.GRAY + "유명 브랜드를 모방한 신발");
		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var9Im.setUnbreakable(true);
		var9Im.setLore(var9Lore);
		var9.setItemMeta(var9Im);
		
		ItemStack token = new ItemStack(Material.POPPED_CHORUS_FRUIT);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "악의 덩어리");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.EMERALD_BLOCK, num10);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.YELLOW + "에메랄드 주머니");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		if(scrollPercent1<=150) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=2) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, token);
		}
		player.openInventory(inv);	
	}
	
	public void dungeon6(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(100); // 저주받은 검+
		int num2 = rnd.nextInt(40); // 세트
		int num3 = rnd.nextInt(21); // 세트
		int num4 = rnd.nextInt(17); // 세트
		int num5 = rnd.nextInt(28);	// 세트
		int num6 = rnd.nextInt(20);	// 타락한 역린
		int num7 = rnd.nextInt(20); // 타락한 귀신멸열  
		int num8 = rnd.nextInt(20);	// 타락한 윤회
		int num9 = rnd.nextInt(20);	// 타락한 회향
		int num10 = rnd.nextInt(2) + 3;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.SPRUCE_LOG);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("400,100,50,0,0,0,0,0,0,200,200");
		var1Im.setDisplayName(ChatColor.AQUA + "저주받은 검+");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 200");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "포보르들이 가지고 있던 저주가 느껴지는 검");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,220");
		var2Im.setDisplayName(ChatColor.GREEN + "우울한 절망의 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 220");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "누군가의 저주가 담긴 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,220");
		var3Im.setDisplayName(ChatColor.GREEN + "우울한 절망의 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 220");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "누군가의 저주가 담긴 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,220");
		var4Im.setDisplayName(ChatColor.GREEN + "우울한 절망의 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 220");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "누군가의 저주가 담긴 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,0,0,0,0,300,220");
		var5Im.setDisplayName(ChatColor.GREEN + "우울한 절망의 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 220");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "누군가의 저주가 담긴 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("310,0,0,0,0,180,0,0,0,0,210");
		var6Im.setDisplayName(ChatColor.LIGHT_PURPLE + "타락한 역린");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "레벨 제한: 210");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "포보르의 대장장이가 용의 역린을 이용해 만든 헬멧");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("0,0,0,0,150,0,0,0,0,350,210");
		var7Im.setDisplayName(ChatColor.LIGHT_PURPLE + "타락한 귀신멸열");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "레벨 제한: 210");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "공격 위주의 힘을 담은 갑옷");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("0,0,0,0,0,430,0,0,0,0,210");
		var8Im.setDisplayName(ChatColor.LIGHT_PURPLE + "타락한 윤회");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "레벨 제한: 210");
		var8Lore.add(ChatColor.GRAY + " ");
		var8Lore.add(ChatColor.GRAY + "김과장님 여기에 윤회 설명 적어주시면 됩니다.");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setLocalizedName("0,0,0,0,0,140,140,140,140,0,210");
		var9Im.setDisplayName(ChatColor.LIGHT_PURPLE + "타락한 회향");
		ArrayList<String> var9Lore = new ArrayList();
		var9Lore.add(ChatColor.GRAY + "레벨 제한: 210");
		var9Lore.add(ChatColor.GRAY + " ");
		var9Lore.add(ChatColor.GRAY + "유명 브랜드를 모방한 신발");
		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var9Im.setUnbreakable(true);
		var9Im.setLore(var9Lore);
		var9.setItemMeta(var9Im);
		
		ItemStack token = new ItemStack(Material.NAUTILUS_SHELL);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "요리사의 식재료");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num10);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, token);
		}
		if(scrollPercent1<=200) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=2) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		player.openInventory(inv);	
	}

	public void tower1(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(44); // 무기
		int num2 = rnd.nextInt(44); // 세트
		int num3 = rnd.nextInt(44); // 세트
		int num4 = rnd.nextInt(44); // 세트
		int num5 = rnd.nextInt(44);	// 세트
		int num6 = 4;
		
		ItemStack var1 = new ItemStack(Material.BIRCH_LOG);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("300,0,0,500,0,0,0,0,0,2000,300");
		var1Im.setDisplayName(ChatColor.AQUA + "탑의 초심자 검");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 300");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "죽음의 탑 1층에서 발견한 검");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("300,0,0,0,0,300,0,0,0,0,300");
		var2Im.setDisplayName(ChatColor.GREEN + "탑의 초심자 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 300");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "죽음의 탑 1층에서 발견한 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,300,0,0,0,300,0,0,0,0,300");
		var3Im.setDisplayName(ChatColor.GREEN + "탑의 초심자 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 300");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "죽음의 탑 1층에서 발견한 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,300,0,0,300,0,0,0,0,300");
		var4Im.setDisplayName(ChatColor.GREEN + "탑의 초심자 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 300");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "죽음의 탑 1층에서 발견한 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,300,0,300,0,0,0,0,300");
		var5Im.setDisplayName(ChatColor.GREEN + "탑의 초심자 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 300");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "죽음의 탑 1층에서 발견한 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num6);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		player.openInventory(inv);	
	}
	
	public void tower2(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(44); // 무기
		int num2 = rnd.nextInt(44); // 세트
		int num3 = rnd.nextInt(44); // 세트
		int num4 = rnd.nextInt(44); // 세트
		int num5 = rnd.nextInt(44);	// 세트
		int num6 = 8;
		
		ItemStack var1 = new ItemStack(Material.GREEN_CARPET);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("0,0,0,0,1000,0,0,0,0,0,350");
		var1Im.setDisplayName(ChatColor.AQUA + "탑의 도전자 도끼");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 350");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "죽음의 탑 2층에서 발견한 도끼");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("350,100,50,50,0,350,0,0,0,0,350");
		var2Im.setDisplayName(ChatColor.GREEN + "탑의 도전자 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 350");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "죽음의 탑 2층에서 발견한 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,350,100,100,100,0,350");
		var3Im.setDisplayName(ChatColor.GREEN + "탑의 도전자 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 350");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "죽음의 탑 2층에서 발견한 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,100,100,100,0,350,0,0,0,0,350");
		var4Im.setDisplayName(ChatColor.GREEN + "탑의 도전자 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 350");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "죽음의 탑 2층에서 발견한 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,350,0,0,0,1000,350");
		var5Im.setDisplayName(ChatColor.GREEN + "탑의 도전자 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 350");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "죽음의 탑 2층에서 발견한 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num6);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		player.openInventory(inv);	
	}
	
	public void tower3(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(44); // 초월템
		int num2 = 16;
		
		ItemStack var1 = new ItemStack(Material.CHARCOAL);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.AQUA + "화염의 돌");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "죽음의 탑 3층에서 발견한 보물");
		var1Lore.add(ChatColor.GRAY + "탑의 초심자, 탑의 도전자 아이템들을");
		var1Lore.add(ChatColor.GRAY + "초월시킬 수 있을 것 같다.");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num2);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		player.openInventory(inv);	
	}
	
	public void tower4(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(44); // 무기
		int num2 = rnd.nextInt(44); // 세트
		int num3 = rnd.nextInt(44); // 세트
		int num4 = rnd.nextInt(44); // 세트
		int num5 = rnd.nextInt(44);	// 세트
		int num6 = 32;
		
		ItemStack var1 = new ItemStack(Material.BEDROCK);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("1500,300,300,300,1000,0,0,0,0,0,450");
		var1Im.setDisplayName(ChatColor.AQUA + "탑의 조율자 검");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 450");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "죽음의 탑 4층에서 발견한 검");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.GOLDEN_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,1500,0,0,0,1500,450");
		var2Im.setDisplayName(ChatColor.GREEN + "탑의 조율자 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 450");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "죽음의 탑 4층에서 발견한 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.GOLDEN_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,1500,0,0,0,1500,450");
		var3Im.setDisplayName(ChatColor.GREEN + "탑의 조율자 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 450");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "죽음의 탑 4층에서 발견한 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.GOLDEN_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,1500,0,0,0,1500,450");
		var4Im.setDisplayName(ChatColor.GREEN + "탑의 조율자 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 450");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "죽음의 탑 4층에서 발견한 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.GOLDEN_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,1500,0,0,0,1500,450");
		var5Im.setDisplayName(ChatColor.GREEN + "탑의 조율자 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 450");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "죽음의 탑 4층에서 발견한 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num6);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		player.openInventory(inv);	
	}
	
	public void tower5(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(44); // 무기
		int num2 = rnd.nextInt(44); // 세트
		int num3 = rnd.nextInt(44); // 세트
		int num4 = rnd.nextInt(44); // 세트
		int num5 = rnd.nextInt(44);	// 세트
		int num6 = 64;
		
		ItemStack var1 = new ItemStack(Material.JUNGLE_SLAB);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("3000,0,0,0,0,0,0,0,0,0,500");
		var1Im.setDisplayName(ChatColor.AQUA + "탑의 강탈자 창");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 500");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "죽음의 탑 5층에서 발견한 창");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.GOLDEN_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("2000,0,0,0,0,0,0,0,0,0,500");
		var2Im.setDisplayName(ChatColor.GREEN + "탑의 강탈자 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 500");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "죽음의 탑 5층에서 발견한 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.GOLDEN_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("2000,0,0,0,0,0,0,0,0,0,500");
		var3Im.setDisplayName(ChatColor.GREEN + "탑의 강탈자 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 500");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "죽음의 탑 5층에서 발견한 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.GOLDEN_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("2000,0,0,0,0,0,0,0,0,0,500");
		var4Im.setDisplayName(ChatColor.GREEN + "탑의 강탈자 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 500");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "죽음의 탑 5층에서 발견한 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.GOLDEN_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("2000,0,0,0,0,0,0,0,0,0,500");
		var5Im.setDisplayName(ChatColor.GREEN + "탑의 강탈자 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 500");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "죽음의 탑 5층에서 발견한 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num6);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		player.openInventory(inv);	
	}
	
	public void tower6(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(44); // 초월템
		int num2 = 2;
		
		ItemStack var1 = new ItemStack(Material.CHARCOAL);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setDisplayName(ChatColor.AQUA + "운명의 돌");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "죽음의 탑 6층에서 발견한 보물");
		var1Lore.add(ChatColor.GRAY + "탑의 조율자, 탑의 강탈자 아이템들을");
		var1Lore.add(ChatColor.GRAY + "초월시킬 수 있을 것 같다.");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack emerald = new ItemStack(Material.RABBIT_HIDE, num2);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		player.openInventory(inv);	
	}
	
	public void tower7(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(44); // 무기
		int num2 = rnd.nextInt(44); // 세트
		int num3 = rnd.nextInt(44); // 세트
		int num4 = rnd.nextInt(44); // 세트
		int num5 = rnd.nextInt(44);	// 세트
		int num6 = 4;
		
		ItemStack var1 = new ItemStack(Material.COBBLESTONE_WALL);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("4000,1000,1000,1000,0,0,0,0,0,3000,600");
		var1Im.setDisplayName(ChatColor.AQUA + "탑의 척살자 검");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 600");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "죽음의 탑 7층에서 발견한 검");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.GOLDEN_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("3000,0,0,0,0,0,0,0,0,0,600");
		var2Im.setDisplayName(ChatColor.GREEN + "탑의 척살자 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 600");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "죽음의 탑 7층에서 발견한 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.GOLDEN_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("3000,0,0,0,0,0,0,0,0,0,600");
		var3Im.setDisplayName(ChatColor.GREEN + "탑의 척살자 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 600");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "죽음의 탑 7층에서 발견한 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.GOLDEN_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("3000,0,0,0,0,0,0,0,0,0,600");
		var4Im.setDisplayName(ChatColor.GREEN + "탑의 척살자 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 600");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "죽음의 탑 7층에서 발견한 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.GOLDEN_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("3000,0,0,0,0,0,0,0,0,0,600");
		var5Im.setDisplayName(ChatColor.GREEN + "탑의 척살자 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 600");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "죽음의 탑 7층에서 발견한 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack emerald = new ItemStack(Material.RABBIT_HIDE, num6);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		player.openInventory(inv);	
	}
	
	public void tower8(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(44); // 무기
		int num2 = rnd.nextInt(44); // 세트
		int num3 = rnd.nextInt(44); // 세트
		int num4 = rnd.nextInt(44); // 세트
		int num5 = rnd.nextInt(44);	// 세트
		int num6 = 8;
		
		ItemStack var1 = new ItemStack(Material.MUSIC_DISC_MELLOHI);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,650");
		var1Im.setDisplayName(ChatColor.AQUA + "탑의 학살자 스태프");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 650");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "죽음의 탑 8층에서 발견한 스태프");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.GOLDEN_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,2000,4000,2000,2000,2000,0,650");
		var2Im.setDisplayName(ChatColor.GREEN + "탑의 학살자 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 650");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "죽음의 탑 8층에서 발견한 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.GOLDEN_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,2000,4000,2000,2000,2000,0,650");
		var3Im.setDisplayName(ChatColor.GREEN + "탑의 학살자 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 650");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "죽음의 탑 8층에서 발견한 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.GOLDEN_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,2000,4000,2000,2000,2000,0,650");
		var4Im.setDisplayName(ChatColor.GREEN + "탑의 학살자 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 650");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "죽음의 탑 8층에서 발견한 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.GOLDEN_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,2000,4000,2000,2000,2000,0,650");
		var5Im.setDisplayName(ChatColor.GREEN + "탑의 학살자 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 650");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "죽음의 탑 8층에서 발견한 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack emerald = new ItemStack(Material.RABBIT_HIDE, num6);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		player.openInventory(inv);	
	}
	
	public void dungeon7(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(100); // 해골 지팡이
		int num2 = rnd.nextInt(30); // 세트
		int num3 = rnd.nextInt(30); // 세트
		int num4 = rnd.nextInt(30); // 세트
		int num5 = rnd.nextInt(30);	// 세트
		int num6 = rnd.nextInt(10);	// 광석1
		int num7 = rnd.nextInt(10); // 광석2  
		int num8 = rnd.nextInt(10);	// 광석3
		int num9 = rnd.nextInt(10);	// 광석4
		int num10 = rnd.nextInt(20) + 30;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.MUSIC_DISC_CAT);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,350");
		var1Im.setDisplayName(ChatColor.AQUA + "죽음의 서약");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 350");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "기분 나쁜 마나가 느껴지는 스태프");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,800,500,500,500,0,350");
		var2Im.setDisplayName(ChatColor.GREEN + "법술 -「유」");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 350");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "마법으로 구현된 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);

		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,800,500,500,500,0,350");
		var3Im.setDisplayName(ChatColor.GREEN + "법술 -「메」");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 350");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "마법으로 구현된 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);

		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,800,500,500,500,0,350");
		var4Im.setDisplayName(ChatColor.GREEN + "법술 -「하」");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 350");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "마법으로 구현된 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);

		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,800,500,500,500,0,350");
		var5Im.setDisplayName(ChatColor.GREEN + "법술 -「마」");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 350");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "마법으로 구현된 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.IRON_ORE, 64);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setDisplayName(ChatColor.YELLOW + "철광석");
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.COAL_ORE, 64);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setDisplayName(ChatColor.YELLOW + "깨끗한 석탄 광석");
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.GOLD_ORE, 64);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setDisplayName(ChatColor.YELLOW + "가치가 떨어진 금광석");
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.GOLD_ORE, 64);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setDisplayName(ChatColor.YELLOW + "가치가 떨어진 금광석");
		var9.setItemMeta(var9Im);
		
		ItemStack token = new ItemStack(Material.BOOK);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "지식의 창고");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num10);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		if(scrollPercent1<=400) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=10) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, token);
		}
		player.openInventory(inv);	
	}
	
	public void dungeon8(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(70); // 거미 여왕의 검
		int num2 = rnd.nextInt(30); // 세트
		int num3 = rnd.nextInt(18); // 세트
		int num4 = rnd.nextInt(13); // 세트
		int num5 = rnd.nextInt(24);	// 세트
		int num6 = rnd.nextInt(13);	// 리벨리온
		int num7 = rnd.nextInt(15); // 베놈 
		int num8 = rnd.nextInt(20);	// 오드아이즈
		int num9 = rnd.nextInt(10);	// 클리어윙
		int num10 = rnd.nextInt(14) + 50;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.JUNGLE_PLANKS);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("700,0,1000,0,500,0,0,0,0,0,390");
		var1Im.setDisplayName(ChatColor.GREEN + "거미 여왕의 검");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 390");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "아라크네의 이빨로 만든 검");
		var1Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("600,0,0,0,0,300,0,0,0,1000,390");
		var2Im.setDisplayName(ChatColor.GREEN + "거미 여왕의 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 390");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "아라크네의 껍질로 만든 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("600,0,0,0,0,300,0,0,0,1000,390");
		var3Im.setDisplayName(ChatColor.GREEN + "거미 여왕의 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 390");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "아라크네의 껍질로 만든 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("600,0,0,0,0,300,0,0,0,1000,390");
		var4Im.setDisplayName(ChatColor.GREEN + "거미 여왕의 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 390");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "아라크네의 껍질로 만든 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("600,0,0,0,0,300,0,0,0,1000,390");
		var5Im.setDisplayName(ChatColor.GREEN + "거미 여왕의 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 390");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "아라크네의 껍질로 만든 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.IRON_HELMET);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("250,300,300,0,0,200,500,500,500,500,390");
		var6Im.setDisplayName(ChatColor.YELLOW + "리벨리온");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "레벨 제한: 390");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "검은 용의 각인이 붙은 헬멧");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("280,0,0,0,0,200,0,0,0,1800,390");
		var7Im.setDisplayName(ChatColor.YELLOW + "베놈");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "레벨 제한: 390");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "보라빛 용의 각인이 붙은 갑옷");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("250,200,200,300,100,200,0,0,0,0,390");
		var8Im.setDisplayName(ChatColor.YELLOW + "오드아이즈");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "레벨 제한: 390");
		var8Lore.add(ChatColor.GRAY + " ");
		var8Lore.add(ChatColor.GRAY + "적색, 녹색 눈을 가진 용의 각인이 붙은 각반");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.IRON_BOOTS);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setLocalizedName("250,0,0,0,0,200,500,500,500,0,390");
		var9Im.setDisplayName(ChatColor.YELLOW + "클리어윙");
		ArrayList<String> var9Lore = new ArrayList();
		var9Lore.add(ChatColor.GRAY + "레벨 제한: 390");
		var9Lore.add(ChatColor.GRAY + " ");
		var9Lore.add(ChatColor.GRAY + "하얀 용의 각인이 붙은 신발");
		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var9Im.setUnbreakable(true);
		var9Im.setLore(var9Lore);
		var9.setItemMeta(var9Im);
		
		ItemStack token = new ItemStack(Material.STRING);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "아라크네의 거미줄");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.SCUTE, num10);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.LIGHT_PURPLE + "에메랄드 주머니+");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, token);
		}
		if(scrollPercent1<=500) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=20) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		player.openInventory(inv);	
	}
	
	public void dungeon9(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(100); // 창
		int num2 = rnd.nextInt(18); // 세트
		int num3 = rnd.nextInt(15); // 세트
		int num4 = rnd.nextInt(15); // 세트
		int num5 = rnd.nextInt(20);	// 세트
		int num6 = rnd.nextInt(50);	// 스태프 1 
		int num7 = rnd.nextInt(100); // 스태프 2
		int num8 = rnd.nextInt(200);	// 스태프 3
		int num9 = rnd.nextInt(1000);	// 스태프 4
		int num10 = rnd.nextInt(3) + 1;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.DARK_OAK_SLAB);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("1000,1000,0,1000,0,0,0,0,0,0,470");
		var1Im.setDisplayName(ChatColor.GREEN + "끓어오르는 대지의 창");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 470");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "고대에 잃어버렸던 힘이 개방된 무기");
		var1Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.GOLDEN_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("500,0,0,0,0,1500,500,500,0,0,470");
		var2Im.setDisplayName(ChatColor.GREEN + "끓어오르는 대지의 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 470");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "고대에 잃어버렸던 힘이 개방된 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.GOLDEN_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("500,0,0,0,0,1500,500,500,0,0,470");
		var3Im.setDisplayName(ChatColor.GREEN + "끓어오르는 대지의 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 470");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "고대에 잃어버렸던 힘이 개방된 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.GOLDEN_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("500,0,0,0,0,1500,500,500,0,0,470");
		var4Im.setDisplayName(ChatColor.GREEN + "끓어오르는 대지의 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 470");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "고대에 잃어버렸던 힘이 개방된 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.GOLDEN_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("500,0,0,0,0,1500,500,500,0,0,470");
		var5Im.setDisplayName(ChatColor.GREEN + "끓어오르는 대지의 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 470");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "고대에 잃어버렸던 힘이 개방된 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.MUSIC_DISC_CHIRP);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,450");
		var6Im.setDisplayName(ChatColor.YELLOW + "암석 스태프");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "레벨 제한: 450");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "대사막의 거대 암석에서 만들어낸 스태프");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.MUSIC_DISC_13);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,470");
		var7Im.setDisplayName(ChatColor.LIGHT_PURPLE + "대지의 스태프");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "레벨 제한: 470");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "대지의 기적을 담은 스태프");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.MUSIC_DISC_BLOCKS);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,480");
		var8Im.setDisplayName(ChatColor.AQUA + "에이션트 윙");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "레벨 제한: 480");
		var8Lore.add(ChatColor.GRAY + " ");
		var8Lore.add(ChatColor.GRAY + "고대 용의 날개뼈로 만든 스태프");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.MUSIC_DISC_CAT);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,500");
		var9Im.setDisplayName(ChatColor.DARK_RED + "트리니티 스태프");
		ArrayList<String> var9Lore = new ArrayList();
		var9Lore.add(ChatColor.GRAY + "레벨 제한: 500");
		var9Lore.add(ChatColor.GRAY + " ");
		var9Lore.add(ChatColor.GRAY + "삼속성의 마법을 다룰 수 있는 스태프");
		var9Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var9Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var9Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var9Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var9Im.setUnbreakable(true);
		var9Im.setLore(var9Lore);
		var9.setItemMeta(var9Im);
		
		ItemStack token = new ItemStack(Material.BREWING_STAND);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "거인 석상의 코어");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.RABBIT_HIDE, num10);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		if(scrollPercent1<=800) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=30) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, token);
		}
		player.openInventory(inv);	
	}
	
	public void dungeon10(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int tokenPercent = rnd.nextInt(3) + 1;
		
		ItemStack token = new ItemStack(Material.GOLD_BLOCK, tokenPercent);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "C급 검투사의 인장");
		token.setItemMeta(tokenIm);
		
		idx = rnd.nextInt(9);
		inv.setItem(idx, token);
		player.openInventory(inv);	
	}
	
	public void dungeon11(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int tokenPercent = rnd.nextInt(3) + 1;
		
		ItemStack token = new ItemStack(Material.GOLD_BLOCK, tokenPercent);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "B급 검투사의 인장");
		token.setItemMeta(tokenIm);
		
		idx = rnd.nextInt(9);
		inv.setItem(idx, token);
		player.openInventory(inv);	
	}
	
	public void dungeon12(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int tokenPercent = rnd.nextInt(3) + 1;
		
		ItemStack token = new ItemStack(Material.GOLD_BLOCK, tokenPercent);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "A급 검투사의 인장");
		token.setItemMeta(tokenIm);
		
		idx = rnd.nextInt(9);
		inv.setItem(idx, token);
		player.openInventory(inv);	
	}
	
	public void dungeon13(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int tokenPercent = rnd.nextInt(3) + 1;
		
		ItemStack token = new ItemStack(Material.GOLD_BLOCK, tokenPercent);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "S급 검투사의 인장");
		token.setItemMeta(tokenIm);
		
		idx = rnd.nextInt(9);
		inv.setItem(idx, token);
		player.openInventory(inv);	
	}
	
	public void dungeon14(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(50); // 세트 망치
		int num2 = rnd.nextInt(20); // 세트
		int num3 = rnd.nextInt(20); // 세트
		int num4 = rnd.nextInt(20); // 세트
		int num5 = rnd.nextInt(20);	// 세트
		int num6 = rnd.nextInt(50);	// 스태프
		int num7 = rnd.nextInt(1000); // 반지
		int num8 = rnd.nextInt(100);	// 말랑말랑 소드
		int num9 = rnd.nextInt(10);	// 다이아 원석
		int num10 = rnd.nextInt(15);	// 다이아 
		int num11 = rnd.nextInt(20);	// 피 64개
		int num12 = rnd.nextInt(40);	// 쓸개 64개
		int num13 = rnd.nextInt(80);	// 살점 64개
		int num14 = rnd.nextInt(160);	// 간 64개
		int numEme = rnd.nextInt(3) + 5;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.SANDSTONE);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("0,2000,2500,2500,1000,0,0,0,0,0,570");
		var1Im.setDisplayName(ChatColor.GREEN + "슬라임 망치");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 570");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "세트를 맞춰 입으면 슬라임이 될 것만 같은 무기");
		var1Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta var2meta = (LeatherArmorMeta) var2.getItemMeta();
		var2meta.setColor(Color.fromRGB(100, 255, 100));
		var2.setItemMeta(var2meta);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("0,0,0,0,0,3500,4000,2000,3000,0,570");
		var2Im.setDisplayName(ChatColor.GREEN + "슬라임 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 570");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "세트를 맞춰 입으면 슬라임이 될 것만 같은 헬멧");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.addItemFlags(ItemFlag.HIDE_DYE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta var3meta = (LeatherArmorMeta) var3.getItemMeta();
		var3meta.setColor(Color.fromRGB(100, 255, 100));
		var3.setItemMeta(var3meta);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("0,0,0,0,0,3500,4000,2000,3000,0,570");
		var3Im.setDisplayName(ChatColor.GREEN + "슬라임 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 570");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "세트를 맞춰 입으면 슬라임이 될 것만 같은 갑옷");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.addItemFlags(ItemFlag.HIDE_DYE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.LEATHER_LEGGINGS);
		LeatherArmorMeta var4meta = (LeatherArmorMeta) var4.getItemMeta();
		var4meta.setColor(Color.fromRGB(100, 255, 100));
		var4.setItemMeta(var4meta);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("0,0,0,0,0,3500,4000,2000,3000,0,570");
		var4Im.setDisplayName(ChatColor.GREEN + "슬라임 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 570");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "세트를 맞춰 입으면 슬라임이 될 것만 같은 각반");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.addItemFlags(ItemFlag.HIDE_DYE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta var5meta = (LeatherArmorMeta) var5.getItemMeta();
		var5meta.setColor(Color.fromRGB(100, 255, 100));
		var5.setItemMeta(var5meta);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("0,0,0,0,0,3500,4000,2000,3000,0,570");
		var5Im.setDisplayName(ChatColor.GREEN + "슬라임 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 570");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "세트를 맞춰 입으면 슬라임이 될 것만 같은 신발");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.addItemFlags(ItemFlag.HIDE_DYE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.MUSIC_DISC_13);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,560");
		var6Im.setDisplayName(ChatColor.LIGHT_PURPLE + "슬라임볼 스태프");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "레벨 제한: 560");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "슬라임의 정령이 깃든 스태프");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.MOSSY_STONE_BRICK_STAIRS);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,580");
		var7Im.setDisplayName(ChatColor.DARK_RED + "와우가 삼킨 반지");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "레벨 제한: 580");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "와우의 몸 안에서 극한의 독성을 흡수한 반지");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.BLUE + "-근접 공격 시 독 데미지 12");
		var7Lore.add(ChatColor.BLUE + "-원거리 공격 시 독 데미지 13");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		ItemStack var8 = new ItemStack(Material.SPRUCE_LOG);
		ItemMeta var8Im = var8.getItemMeta();
		var8Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,600");
		var8Im.setDisplayName(ChatColor.AQUA + "말랑말랑 소드");
		ArrayList<String> var8Lore = new ArrayList();
		var8Lore.add(ChatColor.GRAY + "레벨 제한: 600");
		var8Lore.add(ChatColor.GRAY + " ");
		var8Lore.add(ChatColor.GRAY + "슬라임의 독성에 의해 녹아버린 검");
		var8Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var8Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var8Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var8Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var8Im.setUnbreakable(true);
		var8Im.setLore(var8Lore);
		var8.setItemMeta(var8Im);
		
		ItemStack var9 = new ItemStack(Material.DIAMOND_ORE, 64);
		ItemMeta var9Im = var9.getItemMeta();
		var9Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드 원석");
		var9.setItemMeta(var9Im);
		
		ItemStack var10 = new ItemStack(Material.DIAMOND, 64);
		ItemMeta var10Im = var10.getItemMeta();
		var10Im.setDisplayName(ChatColor.LIGHT_PURPLE + "흠집이 난 다이아몬드");
		var10.setItemMeta(var10Im);
		
		ItemStack var11 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS, 64);
		ItemMeta var11Im = var11.getItemMeta();
		var11Im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 피");
		var11.setItemMeta(var11Im);
		
		ItemStack var12 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS, 64);
		ItemMeta var12Im = var12.getItemMeta();
		var12Im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 쓸개");
		var12.setItemMeta(var12Im);
		
		ItemStack var13 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, 64);
		ItemMeta var13Im = var13.getItemMeta();
		var13Im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 살점");
		var13.setItemMeta(var13Im);
		
		ItemStack var14 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB, 64);
		ItemMeta var14Im = var14.getItemMeta();
		var14Im.setDisplayName(ChatColor.LIGHT_PURPLE + "최상급 포보르의 간");
		var14.setItemMeta(var14Im);
		
		ItemStack token = new ItemStack(Material.SLIME_BLOCK);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.YELLOW + "슬라임 블럭");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.RABBIT_HIDE, numEme);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var9);
		}
		if(num10==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var10);
		}
		if(num11==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var11);
		}
		if(num12==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var12);
		}
		if(num13==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var13);
		}
		if(num14==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, var14);
		}
		if(scrollPercent1<=1000) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=50) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(9);
			inv.setItem(idx, token);
		}
		player.openInventory(inv);	
	}
	
	public void dungeon15(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(100); 	// 무기
		int num2 = rnd.nextInt(20); 	// 세트
		int num3 = rnd.nextInt(20);	 	// 세트
		int num4 = rnd.nextInt(20); 	// 세트
		int num5 = rnd.nextInt(20);		// 세트
		int num6 = rnd.nextInt(50);		// 스태프
		int num7 = rnd.nextInt(100); 	// 반지
		int num8 = rnd.nextInt(20);		// 상자1
		int num9 = rnd.nextInt(50);		// 상자2
		int num10 = rnd.nextInt(100);	// 상자3 
		int num11 = rnd.nextInt(10);	// 피 64개
		int num12 = rnd.nextInt(20);	// 쓸개 64개
		int num13 = rnd.nextInt(40);	// 살점 64개
		int num14 = rnd.nextInt(80);	// 간 64개
		int numEme = rnd.nextInt(10) + 5;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int scrollPercent3 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.DARK_OAK_PLANKS);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("5000,2000,2000,2000,1000,3000,5000,0,0,3000,700");
		var1Im.setDisplayName(ChatColor.AQUA + "만경창파");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "포세이돈의 아들이 소중히 여기던 바다의 보물");
		var1Lore.add(ChatColor.BLUE + " ");
		var1Lore.add(ChatColor.BLUE + "-회피 확률 10% 증가");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("2000,1000,1000,1000,1000,5000,5000,0,0,0,700");
		var2Im.setDisplayName(ChatColor.GREEN + "푸른 소용돌이의 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "푸른 기운이 느껴지는 갑옷");
		var2Lore.add(ChatColor.GRAY + "소용돌이 문양이 그려져있다.");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("2000,1000,1000,1000,1000,5000,5000,0,0,0,700");
		var3Im.setDisplayName(ChatColor.GREEN + "푸른 소용돌이의 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "푸른 기운이 느껴지는 갑옷");
		var3Lore.add(ChatColor.GRAY + "소용돌이 문양이 그려져있다.");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("2000,1000,1000,1000,1000,5000,5000,0,0,0,700");
		var4Im.setDisplayName(ChatColor.GREEN + "푸른 소용돌이의 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "푸른 기운이 느껴지는 각반");
		var4Lore.add(ChatColor.GRAY + "소용돌이 문양이 그려져있다.");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("2000,1000,1000,1000,1000,5000,5000,0,0,0,700");
		var5Im.setDisplayName(ChatColor.GREEN + "푸른 소용돌이의 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "푸른 기운이 느껴지는 신발");
		var5Lore.add(ChatColor.GRAY + "소용돌이 문양이 그려져있다.");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.MUSIC_DISC_FAR);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,700");
		var6Im.setDisplayName(ChatColor.LIGHT_PURPLE + "얼음꽃");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "극지방에서 드물게 피는 얼음꽃");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.SMOOTH_QUARTZ_STAIRS);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("0,0,0,0,0,0,0,0,0,0,700");
		var7Im.setDisplayName(ChatColor.AQUA + "얼음별");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "먼 우주의 얼음별과 같은 모양으로 빚은 장신구");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.BLUE + "-전투 경험치 10% 증가");
		var7Lore.add(ChatColor.BLUE + "-근접 공격 시 10% 확률로 10% 회복");
		var7Lore.add(ChatColor.BLUE + "-원거리 공격 시 8% 확률로 10% 회복");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		Location chestLoc = new Location(player.getWorld(), -1843, 92, 3043);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		ItemStack var8Pro = chest.getInventory().getItem(1).clone();
		ItemStack var8 = setStat(1, var8Pro, 700);
		
		ItemStack var9Pro = chest.getInventory().getItem(2).clone();
		ItemStack var9 = setStat(2, var9Pro, 700);
		
		ItemStack var10Pro = chest.getInventory().getItem(3).clone();
		ItemStack var10 = setStat(3, var10Pro, 700);
		
		ItemStack var11 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS, 64);
		ItemMeta var11Im = var11.getItemMeta();
		var11Im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var11.setItemMeta(var11Im);
		
		ItemStack var12 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS, 64);
		ItemMeta var12Im = var12.getItemMeta();
		var12Im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var12.setItemMeta(var12Im);
		
		ItemStack var13 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, 64);
		ItemMeta var13Im = var13.getItemMeta();
		var13Im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var13.setItemMeta(var13Im);
		
		ItemStack var14 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB, 64);
		ItemMeta var14Im = var14.getItemMeta();
		var14Im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 간");
		var14.setItemMeta(var14Im);
		
		ItemStack token = new ItemStack(Material.PRISMARINE_SHARD);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.LIGHT_PURPLE + "바다의 파편");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.RABBIT_HIDE, numEme);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var9);
		}
		if(num10==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var10);
		}
		if(num11==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var11);
		}
		if(num12==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var12);
		}
		if(num13==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var13);
		}
		if(num14==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var14);
		}
		if(scrollPercent1<=1500) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=100) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		if(scrollPercent3<=10) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, new Inheritance().sSet3());
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, token);
		}
		
		idx = rnd.nextInt(3) + 3;
		ItemStack metalware = new ItemStack(Material.BREWING_STAND, idx);
		ItemMeta metalwareIm = metalware.getItemMeta();
		metalwareIm.setDisplayName(ChatColor.LIGHT_PURPLE + "세공 도구 부품");
		ArrayList<String> metalwareLore = new ArrayList();
		metalwareLore.add(ChatColor.GRAY + "순도 높은 검은 흐름이 느껴지는 부품");
		metalwareLore.add(ChatColor.GRAY + "장인의 손길을 거친다면 검은 흐름의");
		metalwareLore.add(ChatColor.GRAY + "마력을 이용한 세공 도구를 만들 수 있다.");
		metalwareIm.setLore(metalwareLore);
		metalware.setItemMeta(metalwareIm);
		inv.setItem(8, metalware);
		
		player.openInventory(inv);	
	}
	
	public void dungeon16(Player player) {
		Inventory inv = Bukkit.createInventory(player, 9, "Dungeon Reward");
		int idx;
		int num1 = rnd.nextInt(100); 	// 무기
		int num2 = rnd.nextInt(20); 	// 세트
		int num3 = rnd.nextInt(20);	 	// 세트
		int num4 = rnd.nextInt(20); 	// 세트
		int num5 = rnd.nextInt(20);		// 세트
		int num6 = rnd.nextInt(1000);	// 영웅 무기
		int num7 = rnd.nextInt(700); 	// 영웅 신발
		int num8 = rnd.nextInt(20);		// 상자1
		int num9 = rnd.nextInt(50);		// 상자2
		int num10 = rnd.nextInt(100);	// 상자3 
		int num11 = rnd.nextInt(10);	// 피 64개
		int num12 = rnd.nextInt(20);	// 쓸개 64개
		int num13 = rnd.nextInt(40);	// 살점 64개
		int num14 = rnd.nextInt(80);	// 간 64개
		int numEme = rnd.nextInt(10) + 10;
		int scrollPercent1 = rnd.nextInt(10000);	
		int scrollPercent2 = rnd.nextInt(10000);
		int scrollPercent3 = rnd.nextInt(10000);
		int tokenPercent = rnd.nextInt(10);
		
		ItemStack var1 = new ItemStack(Material.STONE_BRICK_SLAB);
		ItemMeta var1Im = var1.getItemMeta();
		var1Im.setLocalizedName("0,4000,4000,4000,2000,8000,0,0,0,0,700");
		var1Im.setDisplayName(ChatColor.AQUA + "버려진 양털");
		ArrayList<String> var1Lore = new ArrayList();
		var1Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var1Lore.add(ChatColor.GRAY + " ");
		var1Lore.add(ChatColor.GRAY + "스피드와 공격, 방어를 모두 갖춘 자의 클로");
		var1Lore.add(ChatColor.BLUE + " ");
		var1Lore.add(ChatColor.BLUE + "-회피 확률 15% 증가");
		var1Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var1Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var1Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var1Im.setUnbreakable(true);
		var1Im.setLore(var1Lore);
		var1.setItemMeta(var1Im);
		
		ItemStack var2 = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta var2Im = var2.getItemMeta();
		var2Im.setLocalizedName("1415,926,5358,979,3238,4626,4338,2795,0,2884,700");
		var2Im.setDisplayName(ChatColor.GREEN + "척척박사의 헬멧");
		ArrayList<String> var2Lore = new ArrayList();
		var2Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var2Lore.add(ChatColor.GRAY + " ");
		var2Lore.add(ChatColor.GRAY + "입기만 해도 똑똑하게 보이는 갑옷");
		var2Lore.add(ChatColor.GRAY + "박사라고 해서 몸이 약한 건 아닌 듯하다.");
		var2Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var2Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var2Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var2Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var2Im.setUnbreakable(true);
		var2Im.setLore(var2Lore);
		var2.setItemMeta(var2Im);
		
		ItemStack var3 = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta var3Im = var3.getItemMeta();
		var3Im.setLocalizedName("1415,926,5358,979,3238,4626,4338,2795,0,2884,700");
		var3Im.setDisplayName(ChatColor.GREEN + "척척박사의 갑옷");
		ArrayList<String> var3Lore = new ArrayList();
		var3Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var3Lore.add(ChatColor.GRAY + " ");
		var3Lore.add(ChatColor.GRAY + "입기만 해도 똑똑하게 보이는 갑옷");
		var3Lore.add(ChatColor.GRAY + "박사라고 해서 몸이 약한 건 아닌 듯하다.");
		var3Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var3Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var3Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var3Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var3Im.setUnbreakable(true);
		var3Im.setLore(var3Lore);
		var3.setItemMeta(var3Im);
		
		ItemStack var4 = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta var4Im = var4.getItemMeta();
		var4Im.setLocalizedName("1415,926,5358,979,3238,4626,4338,2795,0,2884,700");
		var4Im.setDisplayName(ChatColor.GREEN + "척척박사의 각반");
		ArrayList<String> var4Lore = new ArrayList();
		var4Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var4Lore.add(ChatColor.GRAY + " ");
		var4Lore.add(ChatColor.GRAY + "입기만 해도 똑똑하게 보이는 각반");
		var4Lore.add(ChatColor.GRAY + "박사라고 해서 몸이 약한 건 아닌 듯하다.");
		var4Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var4Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var4Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var4Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var4Im.setUnbreakable(true);
		var4Im.setLore(var4Lore);
		var4.setItemMeta(var4Im);
		
		ItemStack var5 = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta var5Im = var5.getItemMeta();
		var5Im.setLocalizedName("1415,926,5358,979,3238,4626,4338,2795,0,2884,700");
		var5Im.setDisplayName(ChatColor.GREEN + "척척박사의 신발");
		ArrayList<String> var5Lore = new ArrayList();
		var5Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var5Lore.add(ChatColor.GRAY + " ");
		var5Lore.add(ChatColor.GRAY + "입기만 해도 똑똑하게 보이는 신발");
		var5Lore.add(ChatColor.GRAY + "박사라고 해서 몸이 약한 건 아닌 듯하다.");
		var5Lore.add(ChatColor.GRAY + "(세트 아이템)");
		var5Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var5Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var5Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var5Im.setUnbreakable(true);
		var5Im.setLore(var5Lore);
		var5.setItemMeta(var5Im);
		
		ItemStack var6 = new ItemStack(Material.GRAY_WOOL);
		ItemMeta var6Im = var6.getItemMeta();
		var6Im.setLocalizedName("7777,0,0,0,0,7777,0,0,0,0,700");
		var6Im.setDisplayName(ChatColor.DARK_RED + "미치광이 박사의 골든 해머");
		ArrayList<String> var6Lore = new ArrayList();
		var6Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var6Lore.add(ChatColor.GRAY + " ");
		var6Lore.add(ChatColor.GRAY + "보기만 해도 무거워 보이는 망치");
		var6Lore.add(ChatColor.GRAY + "미치광이 박사가 평생을 연구해온 결과로");
		var6Lore.add(ChatColor.GRAY + "최강의 금속, 최강의 디자인을 가지게 되었다.");
		var6Lore.add(ChatColor.BLUE + " ");
		var6Lore.add(ChatColor.BLUE + "-흡혈 1%");
		var6Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var6Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var6Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var6Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var6Im.setUnbreakable(true);
		var6Im.setLore(var6Lore);
		var6.setItemMeta(var6Im);
		
		ItemStack var7 = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta var7Im = var7.getItemMeta();
		var7Im.setLocalizedName("777,777,777,777,777,777,777,777,777,777,700");
		var7Im.setDisplayName(ChatColor.DARK_RED + "잭팟");
		ArrayList<String> var7Lore = new ArrayList();
		var7Lore.add(ChatColor.GRAY + "레벨 제한: 700");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.GRAY + "진심으로 기도하면 온 우주가 도울 것이다.");
		var7Lore.add(ChatColor.GRAY + " ");
		var7Lore.add(ChatColor.BLUE + "-의문의 상자 발견 확률 30% 증가");
		var7Lore.add(ChatColor.BLUE + "-회피 확률 5% 증가");
		var7Lore.add(ChatColor.BLUE + "-근접 공격 시 8% 확률로 10% 회복");
		var7Lore.add(ChatColor.BLUE + "-원거리 공격 시 8% 확률로 10% 회복");
		var7Im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		var7Im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		var7Im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		var7Im.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		var7Im.setUnbreakable(true);
		var7Im.setLore(var7Lore);
		var7.setItemMeta(var7Im);
		
		Location chestLoc = new Location(player.getWorld(), -1843, 92, 3043);
		Block block = chestLoc.getBlock();
		Chest chest = (Chest) block.getState();
		ItemStack var8Pro = chest.getInventory().getItem(1).clone();
		ItemStack var8 = setStat(1, var8Pro, 700);
		
		ItemStack var9Pro = chest.getInventory().getItem(2).clone();
		ItemStack var9 = setStat(2, var9Pro, 700);
		
		ItemStack var10Pro = chest.getInventory().getItem(3).clone();
		ItemStack var10 = setStat(3, var10Pro, 700);
		
		ItemStack var11 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS, 64);
		ItemMeta var11Im = var11.getItemMeta();
		var11Im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 피");
		var11.setItemMeta(var11Im);
		
		ItemStack var12 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_STAIRS, 64);
		ItemMeta var12Im = var12.getItemMeta();
		var12Im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 쓸개");
		var12.setItemMeta(var12Im);
		
		ItemStack var13 = new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, 64);
		ItemMeta var13Im = var13.getItemMeta();
		var13Im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 살점");
		var13.setItemMeta(var13Im);
		
		ItemStack var14 = new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_SLAB, 64);
		ItemMeta var14Im = var14.getItemMeta();
		var14Im.setDisplayName(ChatColor.AQUA + "심연의 포보르의 간");
		var14.setItemMeta(var14Im);
		
		ItemStack token = new ItemStack(Material.KELP);
		ItemMeta tokenIm = token.getItemMeta();
		tokenIm.setDisplayName(ChatColor.LIGHT_PURPLE + "숲의 바람");
		token.setItemMeta(tokenIm);
		
		ItemStack emerald = new ItemStack(Material.RABBIT_HIDE, numEme);
		ItemMeta im = emerald.getItemMeta();
		im.setDisplayName(ChatColor.AQUA + "에메랄드 결정");
		emerald.setItemMeta(im);
		inv.setItem(0, emerald);
		
		if(num1==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var1);
		}
		if(num2==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var2);
		}
		if(num3==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var3);
		}
		if(num4==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var4);
		}
		if(num5==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var5);
		}
		if(num6==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var6);
		}
		if(num7==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var7);
		}
		if(num8==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var8);
		}
		if(num9==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var9);
		}
		if(num10==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var10);
		}
		if(num11==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var11);
		}
		if(num12==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var12);
		}
		if(num13==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var13);
		}
		if(num14==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, var14);
		}
		if(scrollPercent1<=2000) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, new Inheritance().sSet1());
		}
		if(scrollPercent2<=200) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, new Inheritance().sSet2());
		}
		if(scrollPercent3<=20) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, new Inheritance().sSet3());
		}
		if(tokenPercent==0) {
			idx = rnd.nextInt(8);
			inv.setItem(idx, token);
		}
		
		idx = rnd.nextInt(3) + 3;
		ItemStack metalware = new ItemStack(Material.BREWING_STAND, idx);
		ItemMeta metalwareIm = metalware.getItemMeta();
		metalwareIm.setDisplayName(ChatColor.LIGHT_PURPLE + "세공 도구 부품");
		ArrayList<String> metalwareLore = new ArrayList();
		metalwareLore.add(ChatColor.GRAY + "순도 높은 검은 흐름이 느껴지는 부품");
		metalwareLore.add(ChatColor.GRAY + "장인의 손길을 거친다면 검은 흐름의");
		metalwareLore.add(ChatColor.GRAY + "마력을 이용한 세공 도구를 만들 수 있다.");
		metalwareIm.setLore(metalwareLore);
		metalware.setItemMeta(metalwareIm);
		inv.setItem(8, metalware);
		
		player.openInventory(inv);	
	}
	
	public boolean removeKey(Player player, String str) {
		try {
			for (ItemStack is : player.getInventory().getContents()) {
				if (is == null)
					continue;
				if (is.getItemMeta().getDisplayName().equals(ChatColor.YELLOW + str)) {
					is.setAmount(is.getAmount()-1);
					player.getWorld().playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 1.0f, 1.0f);
					return true;
				}
			}
		} catch(Exception e) {
			
		}
		return false;		
	}

	public ItemStack setStat(int num, ItemStack item, int lvl) {
		ItemMeta im = item.getItemMeta();
		if(num == 0) {
			im.setDisplayName(ChatColor.YELLOW + "의문의 상자");
		} else if(num == 1) {
			im.setDisplayName(ChatColor.LIGHT_PURPLE + "의문의 상자");
		} else if(num == 2) {
			im.setDisplayName(ChatColor.AQUA + "의문의 상자");
		} else if(num == 3) {
			im.setDisplayName(ChatColor.DARK_RED + "의문의 상자");
		} else if(num == 4) {
			im.setDisplayName(ChatColor.DARK_PURPLE + "의문의 상자");
		} else if(num == 5) {
			im.setDisplayName(ChatColor.DARK_GREEN + "의문의 상자");
		}
		
		int minLvl = ((int)(lvl/10)) * 10;
		int maxLvl = minLvl + 10;
		
		ArrayList<String> lore = new ArrayList();
		if(num == 5) {
			lore.add(ChatColor.GRAY + "신비한 힘으로 굳게 닫힌 상자");
			lore.add(ChatColor.GRAY + "요정의 테이블에서 열 수 있을 것 같다.");
		} else {
			lore.add(ChatColor.GRAY + "레벨 범위: " + ChatColor.WHITE + minLvl + "-" + maxLvl);
			lore.add(ChatColor.GRAY + " ");
			lore.add(ChatColor.GRAY + "신비한 힘으로 굳게 닫힌 상자");
			lore.add(ChatColor.GRAY + "요정의 테이블에서 열 수 있을 것 같다.");
		}
		im.setLore(lore);
		
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		im.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		
		item.setItemMeta(im);
		return item;
	}
	
}
