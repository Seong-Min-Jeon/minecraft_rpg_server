package testPack;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Cmd16class implements CommandExecutor {
	
	static File folder;
	private int sleep1;
	private int sleep2;
	private int sleep3;
	
	public void setFolder(File folder) {
		Cmd16class.folder = folder;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			// 대화 종료
			ThreadMessage t = new ThreadMessage(player.getUniqueId());
			sleep1 = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
				int time = 0;
				
				@Override
				public void run() {
					if (!t.hasID()) {
						t.setID(sleep1);
					}
					if(time >= 0) {
						t.endTask();
						t.removeID();
					}
					time++;
				}				
				
			}, 0, 1);
			
			// 항해 종료
			ThreadShip t1 = new ThreadShip(player.getUniqueId());
			sleep2 = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
				int time = 0;
				
				@Override
				public void run() {
					if (!t1.hasID()) {
						t1.setID(sleep2);
					}
					if(time >= 0) {
						t1.endTask();
						t1.removeID();
					}
					time++;
				}				
				
			}, 0, 1);
			
			// 스레드 종료
			ThreadData t2 = new ThreadData(player.getUniqueId());
			sleep3 = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(Main.class), new Runnable() {
				int time = 0;
				
				@Override
				public void run() {
					if (!t2.hasID()) {
						t2.setID(sleep3);
					}
					if(time >= 0) {
						t2.endTask();
						t2.removeID();
					}
					time++;
				}				
				
			}, 0, 1);
			
			// 보스바 관련
			try {
				new BossHealth().removePlayer(player);
			} catch (Exception e) {

			}
			
			// pity system
			new PitySystem().removePlayer(player);
			
			// Off in Dungeon
			new OffInDungeon(player);
			
			// 계승자 초기화
			new Inheritance().changeInheritance(player, 0, null);
			
			//저장
			new SaveAll(player, folder);
			
			//퀘 초기화
			player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
			
			//파티클 제거
			try {
				ParticleData pd = new ParticleData(player.getUniqueId());
				if(pd.hasID()) {
					pd.endTask();
					pd.removeID();
				}
			} catch(Exception e) {
				
			}
			
			//로비로 이동 & 캐릭터 선택창 활성화
			World world = player.getWorld();
			player.teleport(new Location(world,3665,41,3675.5,180,0));
			for(PotionEffect effect : player.getActivePotionEffects()){
		        player.removePotionEffect(effect.getType());
		    }
			player.setFireTicks(0);
			player.getInventory().clear();
			player.setLevel(0);
			player.setExp(0);
			player.setHealth(20);
			player.setFoodLevel(20);
			
		}	
		return true;
	}


}
