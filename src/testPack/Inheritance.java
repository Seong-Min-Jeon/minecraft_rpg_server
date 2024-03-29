package testPack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import com.nametagedit.plugin.NametagEdit;

import xyz.haoshoku.nick.api.NickAPI;

public class Inheritance {
	
	// 1:포션 회복량 1.2배  2:포션 회복량 1.5배  3:포션 회복량 2배  4:회피 확률 5% 증가(한돌) 5:회피 확률 10% 증가(한돌) 
	// 6:의문의 상자 10% 증가  7:의문의 상자 20% 증가  8:의문의 상자 30% 증가  9:의문의 상자 40% 증가  10:의문의 상자 50% 증가
	// 11:전투 경험치 5% 증가  12:전투 경험치 10% 증가  13:전투 경험치 15% 증가  14:전투 경험치 20% 증가  15:흡혈 0.5%
	// 16:흡혈 1%  17:화염 피해 10% 감소  18:화염 피해 20% 감소  19:화염 피해 30% 감소  20:폭발 피해 10% 감소
	// 21:폭발 피해 20% 감소  22:폭발 피해 30% 감소  23:근접 공격 데미지 5% 증가  24:근접 공격 데미지 10% 증가  25:근접 공격 데미지 15% 증가
	// 26:근접 공격 데미지 20% 증가  27:근접 공격 데미지 25% 증가  28:근접 공격 데미지 30% 증가  29:근접 공격 데미지 35% 증가  30:근접 공격 데미지 40% 증가
	// 31:근접 공격 데미지 45% 증가  32:근접 공격 데미지 50% 증가  33:원거리 공격 데미지 10% 증가  34:원거리 공격 데미지 15% 증가  35:원거리 공격 데미지 20% 증가
	// 36:원거리 공격 데미지 25% 증가  37:원거리 공격 데미지 30% 증가  38:원거리 공격 데미지 35% 증가  39:원거리 공격 데미지 40% 증가  40:원거리 공격 데미지 45% 증가
	// 41:원거리 공격 데미지 50% 증가  42:본 체스트 강화  43:뼈 던지기  44:차지 어택 강화  45:증원 강화
	// 46:자폭 강화  47:넬의 사랑 강화  48:딘의 화염 강화  49:열귀각 강화  50:마인권 강화
	// 51:도박사의 판  52:연어 인형 강화  53:인페르노 강화  54:천사의 기사단 강화  55:천사의 축복 강화
	// 56:창조의 대행 강화  57:신들의 풍악 강화  58:발도 강화  59:나이트메어 강화  60:화둔 강화
	// 61:엘·초펠 강화  62:엘·예브른 강화  63:수류탄 강화  64:구급법 강화  65:영혼 흡착 강화  
	// 66:칼라수트라 강화  67:카르마 강화  68:에로우 스톰 강화  69:밤 에로우 강화  70:독 데미지 10% 감소
	// 71:독 데미지 20% 감소  72:독 데미지 30% 감소  73:독 데미지 40% 감소  74:독 데미지 50% 감소  75:위더 데미지 10% 감소
	// 76:위더 데미지 20% 감소  77:위더 데미지 30% 감소  78:위더 데미지 40% 감소  79:위더 데미지 50% 감소  80:광물 채광 강화
	// 81:밀 수확 강화  82:고기 채집 강화  83:장비 제작 강화I  84:장비 제작 강화II  85:장비 제작 강화III
	// 86:포션 제조 강화I  87:포션 제조 강화II  88:포션 제조 강화III  89:음식 제작 강화I  90:음식 제작 강화II
	// 91:음식 제작 강화III	 92:에메랄드 획득I  93:에메랄드 획득II  94:에메랄드 획득III  95:에메랄드 획득IV
	// 96:에메랄드 획득V  97:보석 확률 증가I  98:보석 확률 증가II  99:보석 확률 증가III  100:태양 강화
	// 101:달 강화
	
	private static HashMap<Player, Integer> map = new HashMap<>();
	static File folder = null;
	Random rnd = new Random();
	Cmd25InheritanceToggle it = new Cmd25InheritanceToggle();
	
	public void setFolder(File f) {
		folder = f;
	}
	
	public void useScroll(Player player, ItemStack itemArg) {
		
		if(!it.isOn(player)) {
			if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "약쟁이의 계승자 스크롤")) {
				changeInheritance(player, 1, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "마녀의 계승자 스크롤")) {
				changeInheritance(player, 2, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "술꾼의 계승자 스크롤")) {
				changeInheritance(player, 3, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "미꾸라지의 계승자 스크롤")) {
				changeInheritance(player, 4, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "연기의 계승자 스크롤")) {
				changeInheritance(player, 5, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "기쁨의 계승자 스크롤")) {
				changeInheritance(player, 6, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "행운의 계승자 스크롤")) {
				changeInheritance(player, 7, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "일꾼의 계승자 스크롤")) {
				changeInheritance(player, 8, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "럭키의 계승자 스크롤")) {
				changeInheritance(player, 9, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "기적의 계승자 스크롤")) {
				changeInheritance(player, 10, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "씨앗의 계승자 스크롤")) {
				changeInheritance(player, 11, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "떡잎의 계승자 스크롤")) {
				changeInheritance(player, 12, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "풀잎의 계승자 스크롤")) {
				changeInheritance(player, 13, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "거목의 계승자 스크롤")) {
				changeInheritance(player, 14, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "모기의 계승자 스크롤")) {
				changeInheritance(player, 15, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "흡혈귀의 계승자 스크롤")) {
				changeInheritance(player, 16, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "불의 계승자 스크롤")) {
				changeInheritance(player, 17, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "화염의 계승자 스크롤")) {
				changeInheritance(player, 18, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "용암의 계승자 스크롤")) {
				changeInheritance(player, 19, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "파동의 계승자 스크롤")) {
				changeInheritance(player, 20, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "TNTZ의 계승자 스크롤")) {
				changeInheritance(player, 21, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "크리퍼의 계승자 스크롤")) {
				changeInheritance(player, 22, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "검의 계승자 스크롤")) {
				changeInheritance(player, 23, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "초보 전사의 계승자 스크롤")) {
				changeInheritance(player, 24, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "용병 전사의 계승자 스크롤")) {
				changeInheritance(player, 25, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "상급 전사의 계승자 스크롤")) {
				changeInheritance(player, 26, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "일류 전사의 계승자 스크롤")) {
				changeInheritance(player, 27, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "대 전사의 계승자 스크롤")) {
				changeInheritance(player, 28, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "마스터 전사의 계승자 스크롤")) {
				changeInheritance(player, 29, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "챌린저 전사의 계승자 스크롤")) {
				changeInheritance(player, 30, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "투왕의 계승자 스크롤")) {
				changeInheritance(player, 31, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "아레스의 계승자 스크롤")) {
				changeInheritance(player, 32, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "초보 헌터의 계승자 스크롤")) {
				changeInheritance(player, 33, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "용병 헌터의 계승자 스크롤")) {
				changeInheritance(player, 34, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "상급 헌터의 계승자 스크롤")) {
				changeInheritance(player, 35, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "일류 헌터의 계승자 스크롤")) {
				changeInheritance(player, 36, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "대 헌터의 계승자 스크롤")) {
				changeInheritance(player, 37, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "마스터 헌터의 계승자 스크롤")) {
				changeInheritance(player, 38, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "챌린저 헌터의 계승자 스크롤")) {
				changeInheritance(player, 39, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "패왕의 계승자 스크롤")) {
				changeInheritance(player, 40, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "아르테미스의 계승자 스크롤")) {
				changeInheritance(player, 41, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "무덤의 계승자 스크롤")) {
				changeInheritance(player, 42, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "원시의 계승자 스크롤")) {
				changeInheritance(player, 43, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "멧돼지의 계승자 스크롤")) {
				changeInheritance(player, 44, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "철의 계승자 스크롤")) {
				changeInheritance(player, 45, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "원자력의 계승자 스크롤")) {
				changeInheritance(player, 46, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "넬의 계승자 스크롤")) {
				changeInheritance(player, 47, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "딘의 계승자 스크롤")) {
				changeInheritance(player, 48, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "야수의 계승자 스크롤")) {
				changeInheritance(player, 49, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "마수의 계승자 스크롤")) {
				changeInheritance(player, 50, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "도박사의 계승자 스크롤")) {
				changeInheritance(player, 51, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "어부의 계승자 스크롤")) {
				changeInheritance(player, 52, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "화신의 계승자 스크롤")) {
				changeInheritance(player, 53, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "대천사장의 계승자 스크롤")) {
				changeInheritance(player, 54, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "날개의 계승자 스크롤")) {
				changeInheritance(player, 55, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "주사위의 계승자 스크롤")) {
				changeInheritance(player, 56, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "흥의 계승자 스크롤")) {
				changeInheritance(player, 57, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "까마귀의 계승자 스크롤")) {
				changeInheritance(player, 58, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "그림자의 계승자 스크롤")) {
				changeInheritance(player, 59, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "호흡의 계승자 스크롤")) {
				changeInheritance(player, 60, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "투창의 계승자 스크롤")) {
				changeInheritance(player, 61, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "포식의 계승자 스크롤")) {
				changeInheritance(player, 62, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "파편의 계승자 스크롤")) {
				changeInheritance(player, 63, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "붕대의 계승자 스크롤")) {
				changeInheritance(player, 64, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "푸른 영혼의 계승자 스크롤")) {
				changeInheritance(player, 65, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "붉은 영혼의 계승자 스크롤")) {
				changeInheritance(player, 66, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "영혼의 계승자 스크롤")) {
				changeInheritance(player, 67, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "속사의 계승자 스크롤")) {
				changeInheritance(player, 68, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "집중의 계승자 스크롤")) {
				changeInheritance(player, 69, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "거미 눈의 계승자 스크롤")) {
				changeInheritance(player, 70, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "거미 이빨의 계승자 스크롤")) {
				changeInheritance(player, 71, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "거미 갑주의 계승자 스크롤")) {
				changeInheritance(player, 72, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "산성의 계승자 스크롤")) {
				changeInheritance(player, 73, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "독의 계승자 스크롤")) {
				changeInheritance(player, 74, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "포보르 피의 계승자 스크롤")) {
				changeInheritance(player, 75, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "포보르 쓸개의 계승자 스크롤")) {
				changeInheritance(player, 76, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "포보르 살점의 계승자 스크롤")) {
				changeInheritance(player, 77, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "포보르 간의 계승자 스크롤")) {
				changeInheritance(player, 78, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "위더의 계승자 스크롤")) {
				changeInheritance(player, 79, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "광부의 계승자 스크롤")) {
				changeInheritance(player, 80, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "농부의 계승자 스크롤")) {
				changeInheritance(player, 81, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "도살자의 계승자 스크롤")) {
				changeInheritance(player, 82, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "상급 대장장이의 계승자 스크롤")) {
				changeInheritance(player, 83, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "일류 대장장이의 계승자 스크롤")) {
				changeInheritance(player, 84, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "신의 대장장이의 계승자 스크롤")) {
				changeInheritance(player, 85, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "상급 약사의 계승자 스크롤")) {
				changeInheritance(player, 86, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "일류 약사의 계승자 스크롤")) {
				changeInheritance(player, 87, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "신의 약사의 계승자 스크롤")) {
				changeInheritance(player, 88, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "상급 요리사의 계승자 스크롤")) {
				changeInheritance(player, 89, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "일류 요리사의 계승자 스크롤")) {
				changeInheritance(player, 90, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "신의 요리사의 계승자 스크롤")) {
				changeInheritance(player, 91, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "고블린의 계승자 스크롤")) {
				changeInheritance(player, 92, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "상인 고블린의 계승자 스크롤")) {
				changeInheritance(player, 93, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "거상 고블린의 계승자 스크롤")) {
				changeInheritance(player, 94, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "갑부 고블린의 계승자 스크롤")) {
				changeInheritance(player, 95, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "탐욕의 계승자 스크롤")) {
				changeInheritance(player, 96, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "유혹의 계승자 스크롤")) {
				changeInheritance(player, 97, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "매혹의 계승자 스크롤")) {
				changeInheritance(player, 98, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "고혹의 계승자 스크롤")) {
				changeInheritance(player, 99, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "태양의 계승자 스크롤")) {
				changeInheritance(player, 100, itemArg);
			} else if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "달의 계승자 스크롤")) {
				changeInheritance(player, 101, itemArg);
			}
			
			if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "계승 반환 스크롤")) {
				boolean ok = false;
				if(getInheritance(player) != 0) {
					itemArg.setAmount(itemArg.getAmount()-1);
					if(getInheritance(player) == 1 || getInheritance(player) == 2 || getInheritance(player) == 4 || getInheritance(player) == 6
							 || getInheritance(player) == 7 || getInheritance(player) == 11 || getInheritance(player) == 12 || getInheritance(player) == 17
							 || getInheritance(player) == 18 || getInheritance(player) == 19 || getInheritance(player) == 20 || getInheritance(player) == 21
							 || getInheritance(player) == 22 || getInheritance(player) == 23 || getInheritance(player) == 24 || getInheritance(player) == 33
							 || getInheritance(player) == 51 || getInheritance(player) == 70 || getInheritance(player) == 71 || getInheritance(player) == 75
							 || getInheritance(player) == 76) {
						if(rnd.nextInt(4) == 0) {
							ok = true;
						}
					} else if(getInheritance(player) == 3 || getInheritance(player) == 5 || getInheritance(player) == 8 || getInheritance(player) == 9
							 || getInheritance(player) == 13 || getInheritance(player) == 14 || getInheritance(player) == 15 || getInheritance(player) == 25
							 || getInheritance(player) == 26 || getInheritance(player) == 27 || getInheritance(player) == 34 || getInheritance(player) == 35
							 || getInheritance(player) == 36 || getInheritance(player) == 42 || getInheritance(player) == 44 || getInheritance(player) == 45
							 || getInheritance(player) == 47 || getInheritance(player) == 48 || getInheritance(player) == 49 || getInheritance(player) == 50
							 || getInheritance(player) == 53 || getInheritance(player) == 54 || getInheritance(player) == 59 || getInheritance(player) == 60
							 || getInheritance(player) == 61 || getInheritance(player) == 62 || getInheritance(player) == 64 || getInheritance(player) == 65
							 || getInheritance(player) == 66 || getInheritance(player) == 72 || getInheritance(player) == 73 || getInheritance(player) == 77
							 || getInheritance(player) == 78 || getInheritance(player) == 83 || getInheritance(player) == 86 || getInheritance(player) == 89
							 || getInheritance(player) == 92 || getInheritance(player) == 93) {
						if(rnd.nextInt(5) == 0) {
							ok = true;
						}
					} else if(getInheritance(player) == 10 || getInheritance(player) == 16 || getInheritance(player) == 28 || getInheritance(player) == 29
							 || getInheritance(player) == 37 || getInheritance(player) == 38 || getInheritance(player) == 43 || getInheritance(player) == 46
							 || getInheritance(player) == 56 || getInheritance(player) == 58 || getInheritance(player) == 63 || getInheritance(player) == 67
							 || getInheritance(player) == 68 || getInheritance(player) == 69 || getInheritance(player) == 74 || getInheritance(player) == 79
							 || getInheritance(player) == 80 || getInheritance(player) == 81 || getInheritance(player) == 82 || getInheritance(player) == 84
							 || getInheritance(player) == 87 || getInheritance(player) == 90 || getInheritance(player) == 94 || getInheritance(player) == 95
							 || getInheritance(player) == 97 || getInheritance(player) == 98) {
						if(rnd.nextInt(10) == 0) {
							ok = true;
						}
					} else if(getInheritance(player) == 30 || getInheritance(player) == 31 || getInheritance(player) == 39 || getInheritance(player) == 40
							 || getInheritance(player) == 52 || getInheritance(player) == 55 || getInheritance(player) == 57 || getInheritance(player) == 85
							 || getInheritance(player) == 88 || getInheritance(player) == 91 || getInheritance(player) == 96 || getInheritance(player) == 99) {
						if(rnd.nextInt(20) == 0) {
							ok = true;
						}
					} else if(getInheritance(player) == 32 || getInheritance(player) == 41 || getInheritance(player) == 100 || getInheritance(player) == 101) {
						if(rnd.nextInt(50) == 0) {
							ok = true;
						}
					}
				} else {
					ok = true;
				}
				
				if(ok) {
					boolean ret = returnInheritance(player);
					if(!ret) {
						player.sendMessage(ChatColor.RED + "현재 계승 중인 힘이 없습니다.");
					} else {
						player.sendMessage(ChatColor.GREEN + "계승 반환에 성공하였습니다.");
					}
				} else {
					player.sendMessage(ChatColor.RED + "계승 반환에 실패하였습니다.");
				}
			}
		}
		
		if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.LIGHT_PURPLE + "계승자 스크롤 묶음 I")) {
			int i = 0;
			Inventory inv = player.getInventory();
			for (int j = 0 ; j < 36 ; j++) {
				if(inv.getItem(j) == null) {
					i++;
				}
			}
			if(i != 0) {
				itemArg.setAmount(itemArg.getAmount()-1);
				new BukkitRunnable() {
					@Override
					public void run() {
						scrollSet1(player);
						this.cancel();
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
			
		}
		
		if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "계승자 스크롤 묶음 II")) {
			int i = 0;
			Inventory inv = player.getInventory();
			for (int j = 0 ; j < 36 ; j++) {
				if(inv.getItem(j) == null) {
					i++;
				}
			}
			if(i != 0) {
				itemArg.setAmount(itemArg.getAmount()-1);
				new BukkitRunnable() {
					@Override
					public void run() {
						scrollSet2(player);
						this.cancel();
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
		
		if(itemArg.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_RED + "계승자 스크롤 묶음 III")) {
			int i = 0;
			Inventory inv = player.getInventory();
			for (int j = 0 ; j < 36 ; j++) {
				if(inv.getItem(j) == null) {
					i++;
				}
			}
			if(i != 0) {
				itemArg.setAmount(itemArg.getAmount()-1);
				new BukkitRunnable() {
					@Override
					public void run() {
						scrollSet3(player);
						this.cancel();
					}
				}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
			}
		}
	}
	
	public void changeInheritance(Player player, int num, ItemStack itemArg) {
		map.put(player, num);
		if(itemArg != null) {
			itemArg.setAmount(itemArg.getAmount()-1);
			saveFile(player);
		}
 
		if(map.get(player) == 0) {
			setMomento(player, "");
		} else if(map.get(player) == 1) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[약쟁이] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 2) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[마녀] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 3) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[술꾼] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 4) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[미꾸라지] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 5) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[연기] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 6) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[기쁨] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 7) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[행운] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 8) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[일꾼] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 9) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[럭키] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 10) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[기적] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 11) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[씨앗] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 12) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[떡잎] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 13) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[풀잎] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 14) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[거목] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 15) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[모기] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 16) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[흡혈귀] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 17) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[불] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 18) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[화염] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 19) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[용암] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 20) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[파동] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 21) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[TNTZ] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 22) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[크리퍼] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 23) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[검] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 24) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[초보 전사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 25) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[용병 전사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 26) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[상급 전사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 27) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[일류 전사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 28) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[대 전사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 29) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[마스터 전사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 30) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[챌린저 전사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 31) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[투왕] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 32) {
			setMomento(player, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "[아레스] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 33) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[초보 헌터] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 34) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[용병 헌터] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 35) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[상급 헌터] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 36) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[일류 헌터] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 37) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[대 헌터] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 38) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[마스터 헌터] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 39) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[챌린저 헌터] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 40) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[패왕] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 41) {
			setMomento(player, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "[아르테미스] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 42) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[무덤] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 43) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[원시] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 44) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[멧돼지] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 45) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[철] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 46) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[원자력] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 47) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[넬] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 48) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[딘] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 49) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[야수] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 50) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[마수] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 51) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[도박사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 52) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[어부] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 53) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[화신] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 54) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[대천사장] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 55) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[날개] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 56) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[주사위] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 57) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[흥] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 58) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[까마귀] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 59) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[그림자] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 60) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[호흡] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 61) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[투창] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 62) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[포식] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 63) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[파편] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 64) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[붕대] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 65) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[푸른 영혼] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 66) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[붉은 영혼] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 67) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[영혼] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 68) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[속사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 69) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[집중] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 70) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[거미 눈] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 71) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[거미 이빨] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 72) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[거미 갑주] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 73) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[산성] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 74) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[독] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 75) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[포보르 피] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 76) {
			setMomento(player, ChatColor.YELLOW + "" + ChatColor.BOLD + "[포보르 쓸개] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 77) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[포보르 살점] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 78) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[포보르 간] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 79) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[위더] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 80) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[광부] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 81) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[농부] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 82) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[도살자] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 83) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[상급 대장장이] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 84) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[일류 대장장이] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 85) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[신의 대장장이] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 86) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[상급 약사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 87) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[일류 약사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 88) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[신의 약사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 89) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[상급 요리사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 90) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[일류 요리사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 91) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[신의 요리사] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 92) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[고블린] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 93) {
			setMomento(player, ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "[상인 고블린] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 94) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[거상 고블린] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 95) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[갑부 고블린] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 96) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[탐욕] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 97) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[유혹] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 98) {
			setMomento(player, ChatColor.AQUA + "" + ChatColor.BOLD + "[매혹] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 99) {
			setMomento(player, ChatColor.DARK_RED + "" + ChatColor.BOLD + "[고혹] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 100) {
			setMomento(player, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "[태양] " + ChatColor.RESET + "" + ChatColor.WHITE);
		} else if(map.get(player) == 101) {
			setMomento(player, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "[달] " + ChatColor.RESET + "" + ChatColor.WHITE);
		}
	}
	
    public boolean returnInheritance(Player player) {
		int num = getInheritance(player);
		
		if(num == 0) {
			return false;
		}
		
		new BukkitRunnable() {
			@Override
			public void run() {
				if(num == 1) {
					player.getInventory().addItem(s1());
				} else if(num == 2) {
					player.getInventory().addItem(s2());
				} else if(num == 3) {
					player.getInventory().addItem(s3());
				} else if(num == 4) {
					player.getInventory().addItem(s4());
				} else if(num == 5) {
					player.getInventory().addItem(s5());
				} else if(num == 6) {
					player.getInventory().addItem(s6());
				} else if(num == 7) {
					player.getInventory().addItem(s7());
				} else if(num == 8) {
					player.getInventory().addItem(s8());
				} else if(num == 9) {
					player.getInventory().addItem(s9());
				} else if(num == 10) {
					player.getInventory().addItem(s10());
				} else if(num == 11) {
					player.getInventory().addItem(s11());
				} else if(num == 12) {
					player.getInventory().addItem(s12());
				} else if(num == 13) {
					player.getInventory().addItem(s13());
				} else if(num == 14) {
					player.getInventory().addItem(s14());
				} else if(num == 15) {
					player.getInventory().addItem(s15());
				} else if(num == 16) {
					player.getInventory().addItem(s16());
				} else if(num == 17) {
					player.getInventory().addItem(s17());
				} else if(num == 18) {
					player.getInventory().addItem(s18());
				} else if(num == 19) {
					player.getInventory().addItem(s19());
				} else if(num == 20) {
					player.getInventory().addItem(s20());
				} else if(num == 21) {
					player.getInventory().addItem(s21());
				} else if(num == 22) {
					player.getInventory().addItem(s22());
				} else if(num == 23) {
					player.getInventory().addItem(s23());
				} else if(num == 24) {
					player.getInventory().addItem(s24());
				} else if(num == 25) {
					player.getInventory().addItem(s25());
				} else if(num == 26) {
					player.getInventory().addItem(s26());
				} else if(num == 27) {
					player.getInventory().addItem(s27());
				} else if(num == 28) {
					player.getInventory().addItem(s28());
				} else if(num == 29) {
					player.getInventory().addItem(s29());
				} else if(num == 30) {
					player.getInventory().addItem(s30());
				} else if(num == 31) {
					player.getInventory().addItem(s31());
				} else if(num == 32) {
					player.getInventory().addItem(s32());
				} else if(num == 33) {
					player.getInventory().addItem(s33());
				} else if(num == 34) {
					player.getInventory().addItem(s34());
				} else if(num == 35) {
					player.getInventory().addItem(s35());
				} else if(num == 36) {
					player.getInventory().addItem(s36());
				} else if(num == 37) {
					player.getInventory().addItem(s37());
				} else if(num == 38) {
					player.getInventory().addItem(s38());
				} else if(num == 39) {
					player.getInventory().addItem(s39());
				} else if(num == 40) {
					player.getInventory().addItem(s40());
				} else if(num == 41) {
					player.getInventory().addItem(s41());
				} else if(num == 42) {
					player.getInventory().addItem(s42());
				} else if(num == 43) {
					player.getInventory().addItem(s43());
				} else if(num == 44) {
					player.getInventory().addItem(s44());
				} else if(num == 45) {
					player.getInventory().addItem(s45());
				} else if(num == 46) {
					player.getInventory().addItem(s46());
				} else if(num == 47) {
					player.getInventory().addItem(s47());
				} else if(num == 48) {
					player.getInventory().addItem(s48());
				} else if(num == 49) {
					player.getInventory().addItem(s49());
				} else if(num == 50) {
					player.getInventory().addItem(s50());
				} else if(num == 51) {
					player.getInventory().addItem(s51());
				} else if(num == 52) {
					player.getInventory().addItem(s52());
				} else if(num == 53) {
					player.getInventory().addItem(s53());
				} else if(num == 54) {
					player.getInventory().addItem(s54());
				} else if(num == 55) {
					player.getInventory().addItem(s55());
				} else if(num == 56) {
					player.getInventory().addItem(s56());
				} else if(num == 57) {
					player.getInventory().addItem(s57());
				} else if(num == 58) {
					player.getInventory().addItem(s58());
				} else if(num == 59) {
					player.getInventory().addItem(s59());
				} else if(num == 60) {
					player.getInventory().addItem(s60());
				} else if(num == 61) {
					player.getInventory().addItem(s61());
				} else if(num == 62) {
					player.getInventory().addItem(s62());
				} else if(num == 63) {
					player.getInventory().addItem(s63());
				} else if(num == 64) {
					player.getInventory().addItem(s64());
				} else if(num == 65) {
					player.getInventory().addItem(s65());
				} else if(num == 66) {
					player.getInventory().addItem(s66());
				} else if(num == 67) {
					player.getInventory().addItem(s67());
				} else if(num == 68) {
					player.getInventory().addItem(s68());
				} else if(num == 69) {
					player.getInventory().addItem(s69());
				} else if(num == 70) {
					player.getInventory().addItem(s70());
				} else if(num == 71) {
					player.getInventory().addItem(s71());
				} else if(num == 72) {
					player.getInventory().addItem(s72());
				} else if(num == 73) {
					player.getInventory().addItem(s73());
				} else if(num == 74) {
					player.getInventory().addItem(s74());
				} else if(num == 75) {
					player.getInventory().addItem(s75());
				} else if(num == 76) {
					player.getInventory().addItem(s76());
				} else if(num == 77) {
					player.getInventory().addItem(s77());
				} else if(num == 78) {
					player.getInventory().addItem(s78());
				} else if(num == 79) {
					player.getInventory().addItem(s79());
				} else if(num == 80) {
					player.getInventory().addItem(s80());
				} else if(num == 81) {
					player.getInventory().addItem(s81());
				} else if(num == 82) {
					player.getInventory().addItem(s82());
				} else if(num == 83) {
					player.getInventory().addItem(s83());
				} else if(num == 84) {
					player.getInventory().addItem(s84());
				} else if(num == 85) {
					player.getInventory().addItem(s85());
				} else if(num == 86) {
					player.getInventory().addItem(s86());
				} else if(num == 87) {
					player.getInventory().addItem(s87());
				} else if(num == 88) {
					player.getInventory().addItem(s88());
				} else if(num == 89) {
					player.getInventory().addItem(s89());
				} else if(num == 90) {
					player.getInventory().addItem(s90());
				} else if(num == 91) {
					player.getInventory().addItem(s91());
				} else if(num == 92) {
					player.getInventory().addItem(s92());
				} else if(num == 93) {
					player.getInventory().addItem(s93());
				} else if(num == 94) {
					player.getInventory().addItem(s94());
				} else if(num == 95) {
					player.getInventory().addItem(s95());
				} else if(num == 96) {
					player.getInventory().addItem(s96());
				} else if(num == 97) {
					player.getInventory().addItem(s97());
				} else if(num == 98) {
					player.getInventory().addItem(s98());
				} else if(num == 99) {
					player.getInventory().addItem(s99());
				} else if(num == 100) {
					player.getInventory().addItem(s100());
				} else if(num == 101) {
					player.getInventory().addItem(s101());
				}
				this.cancel();
			}
		}.runTaskTimer(Main.getPlugin(Main.class), 0, 1);
		
		changeInheritance(player, 0, null);
		saveFile(player);
		return true;
	}
    
    public int getInheritance(Player player) {
    	if(map.containsKey(player)) {
    		return map.get(player);
    	}
    	return 0;
    }
	
    public void saveFile(Player player) {
    	
    	try {
			ItemStack mo = player.getInventory().getItem(7);
			if(mo == null) {
				return;
			}
			if(!mo.hasItemMeta()) {
				return;
			}
		} catch(Exception e) {
			
		}
    	
    	// 계승자
		try {
			int dataName = -1;
			if (player.getInventory().contains(Material.RED_DYE)) {
				dataName = 0;
			} else if (player.getInventory().contains(Material.GREEN_DYE)) {
				dataName = 1;
			} else if (player.getInventory().contains(Material.LAPIS_LAZULI)) {
				dataName = 2;
			} else if (player.getInventory().contains(Material.CYAN_DYE)) {
				dataName = 3;
			} else if (player.getInventory().contains(Material.LIGHT_GRAY_DYE)) {
				dataName = 4;
			} else if (player.getInventory().contains(Material.GRAY_DYE)) {
				dataName = 10;
			} else if (player.getInventory().contains(Material.PINK_DYE)) {
				dataName = 11;
			} else if (player.getInventory().contains(Material.LIME_DYE)) {
				dataName = 12;
			} else if (player.getInventory().contains(Material.YELLOW_DYE)) {
				dataName = 5;
			} else if (player.getInventory().contains(Material.LIGHT_BLUE_DYE)) {
				dataName = 6;
			} else if (player.getInventory().contains(Material.MAGENTA_DYE)) {
				dataName = 7;
			} else if (player.getInventory().contains(Material.ORANGE_DYE)) {
				dataName = 8;
			} else if (player.getInventory().contains(Material.BLUE_DYE)) {
				dataName = 13;
			} else if (player.getInventory().contains(Material.BROWN_DYE)) {
				dataName = 14;
			} else if (player.getInventory().contains(Material.BLACK_DYE)) {
				dataName = 15;
			} else if (player.getInventory().contains(Material.INK_SAC)) {
				dataName = 16;
			} else if (player.getInventory().contains(Material.CLAY_BALL)) {
				dataName = 9;
			} else if (player.getInventory().contains(Material.GLOWSTONE_DUST)) {
				dataName = 17;
			}
			
			if(dataName == -1) {
				return;
			}
			
			File dataFolder = folder;
            if(!dataFolder.exists()) {
                dataFolder.mkdir();
            } else {
            	File dir = new File(dataFolder + "/" + player.getUniqueId().toString());
            	if(!dir.exists()) {
            		try{
            		    dir.mkdir(); 
            		} catch(Exception e2) {
            		    e2.getStackTrace();
            		}
				}
				File file = new File(dir, "inheritance.dat");
				try {
					FileReader filereader = new FileReader(file);
    				BufferedReader bufReader = new BufferedReader(filereader);
    				String[] num = bufReader.readLine().split(" ");
    				num[dataName] = Integer.toString(getInheritance(player));
    				String str = "";
    				for(int j = 0 ; j < 17 ; j++) {
    					str += num[j] + " ";
    				}
    				str += num[17];
					BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
	                fw.write(str);
	                fw.close();
	                bufReader.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		} catch (Exception e2) {
			
		}
    }
    
    public void setMomento(Player player, String str) {

    	ItemStack mo = null;
    	
    	try {
    		mo = player.getInventory().getItem(7);
			if(mo == null) {
				return;
			}
			if(!mo.hasItemMeta()) {
				return;
			}
		} catch(Exception e) {
			
		}
    	
    	// 계승자 이름 추가
		try {
			ItemMeta im = mo.getItemMeta();
			String name = "§" + im.getDisplayName().split("§")[0] + im.getDisplayName().split("§")[1];
			Character c = name.charAt(name.length()-1);
			if(c.toString().equals(" ")) {
				im.setDisplayName(name + str);
			} else {
				im.setDisplayName(name + " " + str);
			}
			mo.setItemMeta(im);
			player.getInventory().setItem(7, mo);
		} catch (Exception e2) {
			
		}
    }
    
    public void scrollSet1(Player player) {
    	ItemStack item = s10000();
    	int num = rnd.nextInt(10000);
		
		if(num < 7000) {
			int num2 = rnd.nextInt(21);
			if(num2 == 0) {
				item = s1();
			} else if(num2 == 1) {
				item = s2();
			} else if(num2 == 2) {
				item = s4();
			} else if(num2 == 3) {
				item = s6();
			} else if(num2 == 4) {
				item = s7();
			} else if(num2 == 5) {
				item = s11();
			} else if(num2 == 6) {
				item = s12();
			} else if(num2 == 7) {
				item = s17();
			} else if(num2 == 8) {
				item = s18();
			} else if(num2 == 9) {
				item = s19();
			} else if(num2 == 10) {
				item = s20();
			} else if(num2 == 11) {
				item = s21();
			} else if(num2 == 12) {
				item = s22();
			} else if(num2 == 13) {
				item = s23();
			} else if(num2 == 14) {
				item = s24();
			} else if(num2 == 15) {
				item = s33();
			} else if(num2 == 16) {
				item = s51();
			} else if(num2 == 17) {
				item = s70();
			} else if(num2 == 18) {
				item = s71();
			} else if(num2 == 19) {
				item = s75();
			} else if(num2 == 20) {
				item = s76();
			}
		} else if(num < 8900) {
			int num2 = rnd.nextInt(38);
			if(num2 == 0) {
				item = s3();
			} else if(num2 == 1) {
				item = s5();
			} else if(num2 == 2) {
				item = s8();
			} else if(num2 == 3) {
				item = s9();
			} else if(num2 == 4) {
				item = s13();
			} else if(num2 == 5) {
				item = s14();
			} else if(num2 == 6) {
				item = s15();
			} else if(num2 == 7) {
				item = s25();
			} else if(num2 == 8) {
				item = s26();
			} else if(num2 == 9) {
				item = s27();
			} else if(num2 == 10) {
				item = s34();
			} else if(num2 == 11) {
				item = s35();
			} else if(num2 == 12) {
				item = s36();
			} else if(num2 == 13) {
				item = s42();
			} else if(num2 == 14) {
				item = s44();
			} else if(num2 == 15) {
				item = s45();
			} else if(num2 == 16) {
				item = s47();
			} else if(num2 == 17) {
				item = s48();
			} else if(num2 == 18) {
				item = s49();
			} else if(num2 == 19) {
				item = s50();
			} else if(num2 == 20) {
				item = s53();
			} else if(num2 == 21) {
				item = s54();
			} else if(num2 == 22) {
				item = s59();
			} else if(num2 == 23) {
				item = s60();
			} else if(num2 == 24) {
				item = s61();
			} else if(num2 == 25) {
				item = s62();
			} else if(num2 == 26) {
				item = s64();
			} else if(num2 == 27) {
				item = s65();
			} else if(num2 == 28) {
				item = s66();
			} else if(num2 == 29) {
				item = s72();
			} else if(num2 == 30) {
				item = s73();
			} else if(num2 == 31) {
				item = s77();
			} else if(num2 == 32) {
				item = s78();
			} else if(num2 == 33) {
				item = s83();
			} else if(num2 == 34) {
				item = s86();
			} else if(num2 == 35) {
				item = s89();
			} else if(num2 == 36) {
				item = s92();
			} else if(num2 == 37) {
				item = s93();
			}
		} else if(num < 8980) {
			int num2 = rnd.nextInt(26);
			if(num2 == 0) {
				item = s10();
			} else if(num2 == 1) {
				item = s16();
			} else if(num2 == 2) {
				item = s28();
			} else if(num2 == 3) {
				item = s29();
			} else if(num2 == 4) {
				item = s37();
			} else if(num2 == 5) {
				item = s38();
			} else if(num2 == 6) {
				item = s43();
			} else if(num2 == 7) {
				item = s46();
			} else if(num2 == 8) {
				item = s56();
			} else if(num2 == 9) {
				item = s58();
			} else if(num2 == 10) {
				item = s63();
			} else if(num2 == 11) {
				item = s67();
			} else if(num2 == 12) {
				item = s68();
			} else if(num2 == 13) {
				item = s69();
			} else if(num2 == 14) {
				item = s74();
			} else if(num2 == 15) {
				item = s79();
			} else if(num2 == 16) {
				item = s80();
			} else if(num2 == 17) {
				item = s81();
			} else if(num2 == 18) {
				item = s82();
			} else if(num2 == 19) {
				item = s84();
			} else if(num2 == 20) {
				item = s87();
			} else if(num2 == 21) {
				item = s90();
			} else if(num2 == 22) {
				item = s94();
			} else if(num2 == 23) {
				item = s95();
			} else if(num2 == 24) {
				item = s97();
			} else if(num2 == 25) {
				item = s98();
			}
		} else if(num < 8999) {
			int num2 = rnd.nextInt(12);
			if(num2 == 0) {
				item = s30();
			} else if(num2 == 1) {
				item = s31();
			} else if(num2 == 2) {
				item = s39();
			} else if(num2 == 3) {
				item = s40();
			} else if(num2 == 4) {
				item = s52();
			} else if(num2 == 5) {
				item = s55();
			} else if(num2 == 6) {
				item = s57();
			} else if(num2 == 7) {
				item = s85();
			} else if(num2 == 8) {
				item = s88();
			} else if(num2 == 9) {
				item = s91();
			} else if(num2 == 10) {
				item = s96();
			} else if(num2 == 11) {
				item = s99();
			}
		} else if(num < 9000) {
			int num2 = rnd.nextInt(4);
			if(num2 == 0) {
				item = s32();
			} else if(num2 == 1) {
				item = s41();
			} else if(num2 == 2) {
				item = s100();
			} else if(num2 == 3) {
				item = s101();
			}
		}
		
		System.out.println(player.getDisplayName() + "가 묶음 I을 사용해서 " + item.getItemMeta().getDisplayName() + "를 획득했다.");
		player.getInventory().addItem(item);
    }
    
    public void scrollSet2(Player player) {
    	ItemStack item = s10000();
    	int num = rnd.nextInt(10000);
		
		if(num < 5500) {
			int num2 = rnd.nextInt(21);
			if(num2 == 0) {
				item = s1();
			} else if(num2 == 1) {
				item = s2();
			} else if(num2 == 2) {
				item = s4();
			} else if(num2 == 3) {
				item = s6();
			} else if(num2 == 4) {
				item = s7();
			} else if(num2 == 5) {
				item = s11();
			} else if(num2 == 6) {
				item = s12();
			} else if(num2 == 7) {
				item = s17();
			} else if(num2 == 8) {
				item = s18();
			} else if(num2 == 9) {
				item = s19();
			} else if(num2 == 10) {
				item = s20();
			} else if(num2 == 11) {
				item = s21();
			} else if(num2 == 12) {
				item = s22();
			} else if(num2 == 13) {
				item = s23();
			} else if(num2 == 14) {
				item = s24();
			} else if(num2 == 15) {
				item = s33();
			} else if(num2 == 16) {
				item = s51();
			} else if(num2 == 17) {
				item = s70();
			} else if(num2 == 18) {
				item = s71();
			} else if(num2 == 19) {
				item = s75();
			} else if(num2 == 20) {
				item = s76();
			}
		} else if(num < 8500) {
			int num2 = rnd.nextInt(38);
			if(num2 == 0) {
				item = s3();
			} else if(num2 == 1) {
				item = s5();
			} else if(num2 == 2) {
				item = s8();
			} else if(num2 == 3) {
				item = s9();
			} else if(num2 == 4) {
				item = s13();
			} else if(num2 == 5) {
				item = s14();
			} else if(num2 == 6) {
				item = s15();
			} else if(num2 == 7) {
				item = s25();
			} else if(num2 == 8) {
				item = s26();
			} else if(num2 == 9) {
				item = s27();
			} else if(num2 == 10) {
				item = s34();
			} else if(num2 == 11) {
				item = s35();
			} else if(num2 == 12) {
				item = s36();
			} else if(num2 == 13) {
				item = s42();
			} else if(num2 == 14) {
				item = s44();
			} else if(num2 == 15) {
				item = s45();
			} else if(num2 == 16) {
				item = s47();
			} else if(num2 == 17) {
				item = s48();
			} else if(num2 == 18) {
				item = s49();
			} else if(num2 == 19) {
				item = s50();
			} else if(num2 == 20) {
				item = s53();
			} else if(num2 == 21) {
				item = s54();
			} else if(num2 == 22) {
				item = s59();
			} else if(num2 == 23) {
				item = s60();
			} else if(num2 == 24) {
				item = s61();
			} else if(num2 == 25) {
				item = s62();
			} else if(num2 == 26) {
				item = s64();
			} else if(num2 == 27) {
				item = s65();
			} else if(num2 == 28) {
				item = s66();
			} else if(num2 == 29) {
				item = s72();
			} else if(num2 == 30) {
				item = s73();
			} else if(num2 == 31) {
				item = s77();
			} else if(num2 == 32) {
				item = s78();
			} else if(num2 == 33) {
				item = s83();
			} else if(num2 == 34) {
				item = s86();
			} else if(num2 == 35) {
				item = s89();
			} else if(num2 == 36) {
				item = s92();
			} else if(num2 == 37) {
				item = s93();
			}
		} else if(num < 8700) {
			int num2 = rnd.nextInt(26);
			if(num2 == 0) {
				item = s10();
			} else if(num2 == 1) {
				item = s16();
			} else if(num2 == 2) {
				item = s28();
			} else if(num2 == 3) {
				item = s29();
			} else if(num2 == 4) {
				item = s37();
			} else if(num2 == 5) {
				item = s38();
			} else if(num2 == 6) {
				item = s43();
			} else if(num2 == 7) {
				item = s46();
			} else if(num2 == 8) {
				item = s56();
			} else if(num2 == 9) {
				item = s58();
			} else if(num2 == 10) {
				item = s63();
			} else if(num2 == 11) {
				item = s67();
			} else if(num2 == 12) {
				item = s68();
			} else if(num2 == 13) {
				item = s69();
			} else if(num2 == 14) {
				item = s74();
			} else if(num2 == 15) {
				item = s79();
			} else if(num2 == 16) {
				item = s80();
			} else if(num2 == 17) {
				item = s81();
			} else if(num2 == 18) {
				item = s82();
			} else if(num2 == 19) {
				item = s84();
			} else if(num2 == 20) {
				item = s87();
			} else if(num2 == 21) {
				item = s90();
			} else if(num2 == 22) {
				item = s94();
			} else if(num2 == 23) {
				item = s95();
			} else if(num2 == 24) {
				item = s97();
			} else if(num2 == 25) {
				item = s98();
			}
		} else if(num < 8750) {
			int num2 = rnd.nextInt(12);
			if(num2 == 0) {
				item = s30();
			} else if(num2 == 1) {
				item = s31();
			} else if(num2 == 2) {
				item = s39();
			} else if(num2 == 3) {
				item = s40();
			} else if(num2 == 4) {
				item = s52();
			} else if(num2 == 5) {
				item = s55();
			} else if(num2 == 6) {
				item = s57();
			} else if(num2 == 7) {
				item = s85();
			} else if(num2 == 8) {
				item = s88();
			} else if(num2 == 9) {
				item = s91();
			} else if(num2 == 10) {
				item = s96();
			} else if(num2 == 11) {
				item = s99();
			}
		} else if(num < 8755) {
			int num2 = rnd.nextInt(4);
			if(num2 == 0) {
				item = s32();
			} else if(num2 == 1) {
				item = s41();
			} else if(num2 == 2) {
				item = s100();
			} else if(num2 == 3) {
				item = s101();
			}
		}
		
		System.out.println(player.getDisplayName() + "가 묶음 II을 사용해서 " + item.getItemMeta().getDisplayName() + "를 획득했다.");
		player.getInventory().addItem(item);
    }
    
    public void scrollSet3(Player player) {
    	ItemStack item = s10000();
    	int num = rnd.nextInt(10000);
		
		if(num < 4000) {
			int num2 = rnd.nextInt(21);
			if(num2 == 0) {
				item = s1();
			} else if(num2 == 1) {
				item = s2();
			} else if(num2 == 2) {
				item = s4();
			} else if(num2 == 3) {
				item = s6();
			} else if(num2 == 4) {
				item = s7();
			} else if(num2 == 5) {
				item = s11();
			} else if(num2 == 6) {
				item = s12();
			} else if(num2 == 7) {
				item = s17();
			} else if(num2 == 8) {
				item = s18();
			} else if(num2 == 9) {
				item = s19();
			} else if(num2 == 10) {
				item = s20();
			} else if(num2 == 11) {
				item = s21();
			} else if(num2 == 12) {
				item = s22();
			} else if(num2 == 13) {
				item = s23();
			} else if(num2 == 14) {
				item = s24();
			} else if(num2 == 15) {
				item = s33();
			} else if(num2 == 16) {
				item = s51();
			} else if(num2 == 17) {
				item = s70();
			} else if(num2 == 18) {
				item = s71();
			} else if(num2 == 19) {
				item = s75();
			} else if(num2 == 20) {
				item = s76();
			}
		} else if(num < 7000) {
			int num2 = rnd.nextInt(38);
			if(num2 == 0) {
				item = s3();
			} else if(num2 == 1) {
				item = s5();
			} else if(num2 == 2) {
				item = s8();
			} else if(num2 == 3) {
				item = s9();
			} else if(num2 == 4) {
				item = s13();
			} else if(num2 == 5) {
				item = s14();
			} else if(num2 == 6) {
				item = s15();
			} else if(num2 == 7) {
				item = s25();
			} else if(num2 == 8) {
				item = s26();
			} else if(num2 == 9) {
				item = s27();
			} else if(num2 == 10) {
				item = s34();
			} else if(num2 == 11) {
				item = s35();
			} else if(num2 == 12) {
				item = s36();
			} else if(num2 == 13) {
				item = s42();
			} else if(num2 == 14) {
				item = s44();
			} else if(num2 == 15) {
				item = s45();
			} else if(num2 == 16) {
				item = s47();
			} else if(num2 == 17) {
				item = s48();
			} else if(num2 == 18) {
				item = s49();
			} else if(num2 == 19) {
				item = s50();
			} else if(num2 == 20) {
				item = s53();
			} else if(num2 == 21) {
				item = s54();
			} else if(num2 == 22) {
				item = s59();
			} else if(num2 == 23) {
				item = s60();
			} else if(num2 == 24) {
				item = s61();
			} else if(num2 == 25) {
				item = s62();
			} else if(num2 == 26) {
				item = s64();
			} else if(num2 == 27) {
				item = s65();
			} else if(num2 == 28) {
				item = s66();
			} else if(num2 == 29) {
				item = s72();
			} else if(num2 == 30) {
				item = s73();
			} else if(num2 == 31) {
				item = s77();
			} else if(num2 == 32) {
				item = s78();
			} else if(num2 == 33) {
				item = s83();
			} else if(num2 == 34) {
				item = s86();
			} else if(num2 == 35) {
				item = s89();
			} else if(num2 == 36) {
				item = s92();
			} else if(num2 == 37) {
				item = s93();
			}
		} else if(num < 7500) {
			int num2 = rnd.nextInt(26);
			if(num2 == 0) {
				item = s10();
			} else if(num2 == 1) {
				item = s16();
			} else if(num2 == 2) {
				item = s28();
			} else if(num2 == 3) {
				item = s29();
			} else if(num2 == 4) {
				item = s37();
			} else if(num2 == 5) {
				item = s38();
			} else if(num2 == 6) {
				item = s43();
			} else if(num2 == 7) {
				item = s46();
			} else if(num2 == 8) {
				item = s56();
			} else if(num2 == 9) {
				item = s58();
			} else if(num2 == 10) {
				item = s63();
			} else if(num2 == 11) {
				item = s67();
			} else if(num2 == 12) {
				item = s68();
			} else if(num2 == 13) {
				item = s69();
			} else if(num2 == 14) {
				item = s74();
			} else if(num2 == 15) {
				item = s79();
			} else if(num2 == 16) {
				item = s80();
			} else if(num2 == 17) {
				item = s81();
			} else if(num2 == 18) {
				item = s82();
			} else if(num2 == 19) {
				item = s84();
			} else if(num2 == 20) {
				item = s87();
			} else if(num2 == 21) {
				item = s90();
			} else if(num2 == 22) {
				item = s94();
			} else if(num2 == 23) {
				item = s95();
			} else if(num2 == 24) {
				item = s97();
			} else if(num2 == 25) {
				item = s98();
			}
		} else if(num < 7650) {
			int num2 = rnd.nextInt(12);
			if(num2 == 0) {
				item = s30();
			} else if(num2 == 1) {
				item = s31();
			} else if(num2 == 2) {
				item = s39();
			} else if(num2 == 3) {
				item = s40();
			} else if(num2 == 4) {
				item = s52();
			} else if(num2 == 5) {
				item = s55();
			} else if(num2 == 6) {
				item = s57();
			} else if(num2 == 7) {
				item = s85();
			} else if(num2 == 8) {
				item = s88();
			} else if(num2 == 9) {
				item = s91();
			} else if(num2 == 10) {
				item = s96();
			} else if(num2 == 11) {
				item = s99();
			}
		} else if(num < 7680) {
			int num2 = rnd.nextInt(4);
			if(num2 == 0) {
				item = s32();
			} else if(num2 == 1) {
				item = s41();
			} else if(num2 == 2) {
				item = s100();
			} else if(num2 == 3) {
				item = s101();
			}
		}
		
		System.out.println(player.getDisplayName() + "가 묶음 III을 사용해서 " + item.getItemMeta().getDisplayName() + "를 획득했다.");
		player.getInventory().addItem(item);
    }
    
    public ItemStack s1() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "약쟁이의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "약쟁이의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "포션 회복량 1.2배");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s2() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "마녀의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "마녀의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "포션 회복량 1.5배");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s3() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "술꾼의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "술꾼의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "포션 회복량 2배");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s4() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "미꾸라지의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "미꾸라지의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "회피 확률 5% 증가");
		scrollLore.add(ChatColor.BLUE + "위 효과는 회피의 상한(70%)을 넘어서 적용됩니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s5() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "연기의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "연기의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "회피 확률 10% 증가");
		scrollLore.add(ChatColor.BLUE + "위 효과는 회피의 상한(70%)을 넘어서 적용됩니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s6() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "기쁨의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "기쁨의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "의문의 상자 발견 확률 10% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s7() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "행운의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "행운의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "의문의 상자 발견 확률 20% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s8() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "일꾼의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "일꾼의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "의문의 상자 발견 확률 30% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s9() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "럭키의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "럭키의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "의문의 상자 발견 확률 40% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s10() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "기적의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "럭키의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "의문의 상자 발견 확률 50% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s11() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "씨앗의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "씨앗의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "전투 경험치 5% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s12() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "떡잎의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "떡잎의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "전투 경험치 10% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s13() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "풀잎의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "풀잎의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "전투 경험치 15% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s14() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "거목의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "거목의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "전투 경험치 20% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s15() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "모기의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "모기의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "흡혈 0.5%");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s16() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "흡혈귀의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "흡혈귀의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "흡혈 1%");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s17() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "불의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "불의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "화염 피해 10% 감소");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s18() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "화염의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "화염의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "화염 피해 20% 감소");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s19() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "용암의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "용암의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "화염 피해 30% 감소");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s20() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "파동의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "파동의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "폭발 피해 10% 감소");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s21() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "TNTZ의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "TNTZ의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "폭발 피해 20% 감소");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s22() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "크리퍼의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "크리퍼의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "폭발 피해 30% 감소");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s23() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "검의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "검의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "근접 공격 데미지 5% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s24() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "초보 전사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "초보 전사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "근접 공격 데미지 10% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s25() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "용병 전사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "용병 전사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "근접 공격 데미지 15% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s26() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "상급 전사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "상급 전사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "근접 공격 데미지 20% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s27() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "일류 전사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "일류 전사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "근접 공격 데미지 25% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s28() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "대 전사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "대 전사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "근접 공격 데미지 30% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s29() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "마스터 전사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "마스터 전사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "근접 공격 데미지 35% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s30() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "챌린저 전사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "챌린저 전사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "근접 공격 데미지 40% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s31() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "투왕의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "투왕의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "근접 공격 데미지 45% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s32() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_PURPLE + "아레스의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "아레스의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "근접 공격 데미지 50% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s33() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "초보 헌터의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "초보 헌터의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "원거리 공격 데미지 10% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s34() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "용병 헌터의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "용병 헌터의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "원거리 공격 데미지 15% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s35() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "상급 헌터의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "상급 헌터의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "원거리 공격 데미지 20% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s36() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "일류 헌터의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "일류 헌터의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "원거리 공격 데미지 25% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s37() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "대 헌터의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "대 헌터의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "원거리 공격 데미지 30% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s38() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "마스터 헌터의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "마스터 헌터의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "원거리 공격 데미지 35% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s39() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "챌린저 헌터의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "챌린저 헌터의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "원거리 공격 데미지 40% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s40() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "패왕의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "패왕의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "원거리 공격 데미지 45% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s41() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_PURPLE + "아르테미스의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "아르테미스의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "원거리 공격 데미지 50% 증가");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s42() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "무덤의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "무덤의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "본 체스트 효과 강화 (본 파이터)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s43() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "원시의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "원시의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "뼈 던지기 공격력 강화 (본 파이터)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s44() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "멧돼지의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "멧돼지의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "차지 어택 넉백 추가 (기사)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s45() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "철의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "철의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "증원 강화 (기사)");
		scrollLore.add(ChatColor.BLUE + "팬텀 나이트의 공격력이 증가합니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s46() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "원자력의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "원자력의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "자폭 공격력 강화 (기사)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s47() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "넬의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "넬의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "넬의 사랑 회복량 증가 (프리스트)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s48() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "딘의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "딘의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "딘의 화염 효과 강화 (프리스트)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s49() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "야수의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "야수의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "열귀각 자가 피해 감소 (광전사)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s50() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "마수의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "마수의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "마인권 공격력 강화 (광전사)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s51() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "도박사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "도박사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "도박사의 판 효과 강화 (도박사)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s52() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "어부의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "어부의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "악마의 장난의 효과 강화 (데빌)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s53() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "화신의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "화신의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "인페르노의 공격력 강화 (데빌)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s54() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "대천사장의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "대천사장의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "천사의 기사단 강화 (엔젤)");
		scrollLore.add(ChatColor.BLUE + "기사단장의 공격력이 증가합니다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s55() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "날개의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "날개의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "천사의 축복 회복량 증가 (엔젤)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s56() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "주사위의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "주사위의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "창조의 대행 회복량 증가 (대행자)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s57() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "흥의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "흥의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "신들의 풍악 효과 강화 (대행자)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s58() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "까마귀의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "까마귀의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "발도 범위 증가 (그림자 무사)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s59() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "그림자의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "그림자의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "나이트메어 자가 피해 감소 (그림자 무사)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s60() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "호흡의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "호흡의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "화둔 공격력 강화 (그림자 무사)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s61() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "투창의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "투창의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "엘·초펠 범위 증가 (버서커)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s62() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "포식의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "포식의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "엘·예브른 공격력 강화 (버서커)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s63() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "파편의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "파편의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "수류탄 투척 범위 증가 (군인)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s64() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "붕대의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "붕대의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "구급법 회복량 증가 (군인)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s65() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "푸른 영혼의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "푸른 영혼의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "영혼 흡착 효과 강화 (그림 리퍼)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s66() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "붉은 영혼의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "붉은 영혼의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "칼라수트라 효과 강화 (그림 리퍼)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s67() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "영혼의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "영혼의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "카르마 공격력 강화 (그림 리퍼)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s68() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "속사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "속사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "에로우 스톰 공격력 강화 (아처)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s69() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "집중의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "집중의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "밤 에로우 범위 증가 (아처)");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s70() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "거미 눈의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "거미 눈의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "독 데미지 10% 경감");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s71() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "거미 이빨의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "거미 이빨의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "독 데미지 20% 경감");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s72() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "거미 갑주의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "거미 갑주의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "독 데미지 30% 경감");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s73() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "산성의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "산성의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "독 데미지 40% 경감");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s74() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "독의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "독의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "독 데미지 50% 경감");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s75() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "포보르 피의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "포보르 피의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "위더 데미지 10% 경감");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s76() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.YELLOW + "포보르 쓸개의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "포보르 쓸개의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "위더 데미지 20% 경감");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s77() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "포보르 살점의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "포보르 살점의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "위더 데미지 30% 경감");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s78() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "포보르 간의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "포보르 간을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "위더 데미지 40% 경감");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s79() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "위더의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "위더의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "위더 데미지 50% 경감");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s80() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "광부의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "광부의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "광물 채광 무조건 성공");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s81() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "농부의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "농부의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "밀 수확 무조건 성공");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s82() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "도살자의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "도살자의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "고기 채집 무조건 성공");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s83() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "상급 대장장이의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "상급 대장장이의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "장비 제작 강화 I");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s84() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "일류 대장장이의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "일류 대장장이의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "장비 제작 강화 II");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s85() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "신의 대장장이의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "신의 대장장이의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "장비 제작 강화 III");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s86() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "상급 약사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "상급 약사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "포션 제조 강화 I");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s87() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "일류 약사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "일류 약사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "포션 제조 강화 II");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s88() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "신의 약사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "신의 약사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "포션 제조 강화 III");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s89() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "상급 요리사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "상급 요리사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "음식 제작 강화 I");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s90() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "일류 요리사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "일류 요리사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "음식 제작 강화 II");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s91() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "신의 요리사의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "신의 요리사의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "음식 제작 강화 III");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s92() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "고블린의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "고블린의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "10% 확률로 몬스터 드랍 에메랄드 2배");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s93() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "상인 고블린의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "상인 고블린의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "20% 확률로 몬스터 드랍 에메랄드 2배");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s94() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "거상 고블린의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "거상 고블린의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "30% 확률로 몬스터 드랍 에메랄드 2배");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s95() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "갑부 고블린의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "갑부 고블린의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "40% 확률로 몬스터 드랍 에메랄드 2배");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s96() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "탐욕의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "탐욕의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "50% 확률로 몬스터 드랍 에메랄드 2배");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s97() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "유혹의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "유혹의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "채광 시 보석 획득 확률 증가 I");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s98() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "매혹의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "매혹의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "채광 시 보석 획득 확률 증가 II");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s99() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "고혹의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "고혹의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "채광 시 보석 획득 확률 증가 III");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s100() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_PURPLE + "태양의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "태양의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "일정 시간대에 각종 버프 획득");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s101() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_PURPLE + "달의 계승자 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "달의 힘을 계승받을 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "사용하면 기존에 계승받던 힘이 사라지니 주의하자.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•───계승의 힘───•");
		scrollLore.add(ChatColor.BLUE + "일정 시간대에 각종 버프 획득");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack s10000() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "계승 반환 스크롤");
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "계승 중인 힘을 스크롤로 만들 수 있는 스크롤");
		scrollLore.add(ChatColor.GRAY + "계승 중인 힘이 강력할수록 반환 성공 확률이 낮아진다.");
		scrollLore.add(ChatColor.GRAY + "반환에 실패해도 다행히 계승 중인 힘이 사라지지 않는다고 한다.");
		scrollLore.add(ChatColor.GRAY + " ");
		scrollLore.add(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "•────반환 확률────•");
		scrollLore.add(ChatColor.YELLOW + "좋은 힘" + ChatColor.GRAY + "      25%");
		scrollLore.add(ChatColor.LIGHT_PURPLE + "희귀한 힘" + ChatColor.GRAY + "    20%");
		scrollLore.add(ChatColor.AQUA + "전설적인 힘" + ChatColor.GRAY + "  10%");
		scrollLore.add(ChatColor.DARK_RED + "영웅급 힘" + ChatColor.GRAY + "    5%");
		scrollLore.add(ChatColor.DARK_PURPLE + "신급 힘" + ChatColor.GRAY + "      2%");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack sSet1() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.LIGHT_PURPLE + "계승자 스크롤 묶음 I");
		scrollIm.setCustomModelData(1);
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "여러 종류의 계승자 스크롤이 묶여있는 아이템");
		scrollLore.add(ChatColor.GRAY + "사용 시 랜덤한 계승자 스크롤 한개를 얻을 수 있다.");
		scrollLore.add(ChatColor.GRAY + "확률적으로 계승자 스크롤이 아닌 계승 반환 스크롤을 얻을 수도 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack sSet2() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.AQUA + "계승자 스크롤 묶음 II");
		scrollIm.setCustomModelData(2);
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "여러 종류의 계승자 스크롤이 묶여있는 아이템");
		scrollLore.add(ChatColor.GRAY + "사용 시 랜덤한 계승자 스크롤 한개를 얻을 수 있다.");
		scrollLore.add(ChatColor.GRAY + "확률적으로 계승자 스크롤이 아닌 계승 반환 스크롤을 얻을 수도 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
    public ItemStack sSet3() {
    	ItemStack scroll = new ItemStack(Material.SKULL_BANNER_PATTERN);
		ItemMeta scrollIm = scroll.getItemMeta();
		scrollIm.setDisplayName(ChatColor.DARK_RED + "계승자 스크롤 묶음 III");
		scrollIm.setCustomModelData(3);
		ArrayList<String> scrollLore = new ArrayList();
		scrollLore.add(ChatColor.GRAY + "여러 종류의 계승자 스크롤이 묶여있는 아이템");
		scrollLore.add(ChatColor.GRAY + "사용 시 랜덤한 계승자 스크롤 한개를 얻을 수 있다.");
		scrollLore.add(ChatColor.GRAY + "확률적으로 계승자 스크롤이 아닌 계승 반환 스크롤을 얻을 수도 있다.");
		scrollIm.setLore(scrollLore);
		scrollIm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		scrollIm.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		scrollIm.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		scrollIm.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		scrollIm.setUnbreakable(true);
		scroll.setItemMeta(scrollIm);
		return scroll;
    }
    
}
