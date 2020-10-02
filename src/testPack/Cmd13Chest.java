package testPack;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Cmd13Chest implements CommandExecutor {
	
	private static HashMap<String, Integer> userAL = new HashMap<>();
	private static HashMap<String, Integer> selectAL = new HashMap<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			String uuid = player.getUniqueId().toString();
		
			if(cmd.getName().equalsIgnoreCase("chest")) {
				if(args.length == 0) {
					player.sendMessage(ChatColor.WHITE + "chest 1 / chest 2 ������ �� �� �ִ� ���� ���ڸ� ������ �� �ֽ��ϴ�. chest 1�� �⺻ �����Դϴ�.");
					return true;
				}
				try { 
					if(args[0].equalsIgnoreCase("1")) {
						player.sendMessage(ChatColor.GREEN + "You can open chest 1");
						putSelectAL(uuid, 1);
						return true;
					} else if(args[0].equalsIgnoreCase("2")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 2) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 2");
							putSelectAL(uuid, 2);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("3")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 3) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 3");
							putSelectAL(uuid, 3);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("4")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 4) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 4");
							putSelectAL(uuid, 4);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("5")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 5) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 5");
							putSelectAL(uuid, 5);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("6")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 6) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 6");
							putSelectAL(uuid, 6);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("7")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 7) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 7");
							putSelectAL(uuid, 7);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("8")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 8) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 8");
							putSelectAL(uuid, 8);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("9")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 9) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 9");
							putSelectAL(uuid, 9);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else if(args[0].equalsIgnoreCase("10")) {
						if(userAL.containsKey(player.getUniqueId().toString())) {
							if(userAL.get(player.getUniqueId().toString()) < 10) {
								player.sendMessage(ChatColor.RED + "Not available chest");
								return true;
							}
							player.sendMessage(ChatColor.GREEN + "You can open chest 10");
							putSelectAL(uuid, 10);
							return true;
						} else {
							player.sendMessage(ChatColor.RED + "Not available chest");
							return true;
						}
					} else {
						player.sendMessage(ChatColor.RED + "Wrong Input!");
						return true;
					}
				} catch(Exception e) {
					player.sendMessage(ChatColor.RED + "Wrong Input!");
					return true;
				}
			}
		}	
		return true;
	}

	public void putData(String uuid, Integer num) {
		userAL.put(uuid, num);
	}
	
	public void putSelectAL(String uuid, Integer num) {
		if(selectAL.containsKey(uuid)) {
			selectAL.remove(uuid);
		}
		selectAL.put(uuid, num);
	}
	
	public boolean isPlayerInSelectAL(String uuid) {
		if(selectAL.containsKey(uuid)) {
			return true;
		}
		return false;
	}
	
	public Integer getChestNum(String uuid) {
		if(selectAL.containsKey(uuid)) {
			return selectAL.get(uuid);
		} else {
			return 1;
		}
		
	}
}