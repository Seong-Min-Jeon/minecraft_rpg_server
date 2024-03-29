package testPack;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Bukkit;

public class ThreadForDamage {

	private static Map<UUID, Integer> TRAILS = new HashMap<>();
	private final UUID uuid;
	
	public ThreadForDamage(UUID uuid) {
		this.uuid = uuid;
	}
	
	public void setID(int id) {
		TRAILS.put(uuid,id);
	}
	
	public int getID() {
		return TRAILS.get(uuid);
	}
	
	public boolean hasID() {
		if(TRAILS.containsKey(uuid)) {
			return true;
		}
		return false;
	}
	
	public void removeID() {
		TRAILS.remove(uuid);
	}
	
	public void endTask() {
		if(getID() == 1) {
			return;
		}
		Bukkit.getScheduler().cancelTask(getID());
	}
	
	public static boolean hasFakeID(UUID uuid) {
		if(TRAILS.containsKey(uuid)) {
			if(TRAILS.get(uuid) == 1) {
				return true;
			}
		}
		return false;
	}
	
	
}
