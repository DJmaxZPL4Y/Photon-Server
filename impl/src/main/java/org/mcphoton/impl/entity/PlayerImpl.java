package org.mcphoton.impl.entity;

import java.util.UUID;
import org.mcphoton.entity.EntityType;
import org.mcphoton.entity.living.AbstractLivingEntity;
import org.mcphoton.entity.living.Player;
import org.mcphoton.inventory.Inventory;
import org.mcphoton.messaging.ChatMessage;
import org.mcphoton.utils.Location;

/**
 * @author TheElectronWill
 */
public class PlayerImpl extends AbstractLivingEntity implements Player {
	private final UUID accoundId;
	private final String name;
	private volatile String nameInChat, nameInList;
	private volatile Location compassTarget;

	public PlayerImpl(String name, UUID accoundId) {
		this.name = name;
		this.accoundId = accoundId;
		this.nameInChat = name;
	}

	@Override
	public Player asPlayer() {
		return this;
	}

	@Override
	public UUID getAccountId() {
		return accoundId;
	}

	@Override
	public Location getCompassTarget() {
		return compassTarget;
	}

	@Override
	public void setCompassTarget(Location target) {
		this.compassTarget = target;
	}

	@Override
	public Inventory getInventory() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setLocation(Location l) {
		throw new UnsupportedOperationException();
	}

	@Override
	public float getMaxHealth() {
		return 20f;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getNameInChat() {
		return nameInChat;
	}

	@Override
	public void setNameInChat(String name) {
		this.nameInChat = name;
	}

	@Override
	public String getNameInPlayerList() {
		return nameInList;
	}

	@Override
	public void setNameInPlayerList(String name) {
		this.nameInList = name;
	}

	@Override
	public EntityType getType() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isPermissionSet(String permission) {
		return false;// TODO
	}

	@Override
	public boolean hasPermission(String permission, boolean ifNotSet) {
		return false;// TODO
	}

	@Override
	public void kickPlayer(String message) {
		; //TODO
	}

	@Override
	public void sendMessage(CharSequence msg) {
		; //TODO
	}

	@Override
	public void sendMessage(ChatMessage msg) {
		; //TODO
	}

	@Override
	public void sendRawMessage(String rawMessage) {
		; //TODO
	}

	@Override
	public boolean teleport(Location location) {
		throw new UnsupportedOperationException(); //TODO
	}

	@Override
	public String toString() {
		return "PhotonPlayer{" + "name=" + name + ", accoundId=" + accoundId + '}';
	}
}