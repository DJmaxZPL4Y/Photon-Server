package org.mcphoton.entity;

import org.mcphoton.utils.Location;
import org.mcphoton.utils.Vector;
import org.mcphoton.world.World;

/**
 * Abstract base class for entities.
 *
 * @author TheElectronWill
 */
public abstract class AbstractEntity implements Entity {
	private int id = -1;

	private String customName;
	private boolean customNameVisible;

	private int fireTicks;
	private boolean onGround, onFire, crouched, glowing, gravity, silent, sprinting;

	private World world;
	private Vector coordinates;
	private Vector velocity = new Vector();

	@Override
	public String getCustomName() {
		return customName;
	}

	@Override
	public void setCustomName(String customName) {
		this.customName = customName;
	}

	@Override
	public boolean isCustomNameVisible() {
		return customNameVisible;
	}

	@Override
	public void setCustomNameVisible(boolean visibility) {
		this.customNameVisible = visibility;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public int getFireTicks() {
		return fireTicks;
	}

	@Override
	public void setFireTicks(int ticks) {
		this.fireTicks = ticks;
	}

	@Override
	public void setGravity(boolean gravity) {
		this.gravity = gravity;
	}

	@Override
	public Location getLocation() {
		return coordinates.toLocation(world);
	}

	@Override
	public Vector getVelocity() {
		return velocity;
	}

	@Override
	public void setVelocity(Vector v) {
		this.velocity = v;
	}

	@Override
	public boolean hasGravity() {
		return gravity;
	}

	@Override
	public void init(int entityId, double x, double y, double z, World w) {
		if (this.id != -1) {
			throw new IllegalStateException("Entity id already initialized!");
		}
		this.id = entityId;
		this.coordinates = new Vector(x, y, z);
		this.world = w;
	}

	@Override
	public boolean isValid() {
		return id >= 0;
	}

	@Override
	public void invalidate() {
		id = -1;
	}

	@Override
	public boolean isCrouched() {
		return crouched;
	}

	@Override
	public void setCrouched(boolean crouched) {
		this.crouched = crouched;
	}

	@Override
	public boolean isGlowing() {
		return glowing;
	}

	@Override
	public void setGlowing(boolean glow) {
		this.glowing = glow;
	}

	@Override
	public boolean isOnFire() {
		return onFire;
	}

	@Override
	public void setOnFire(boolean onFire) {
		this.onFire = onFire;
	}

	@Override
	public boolean isOnGround() {
		return onGround;
	}

	@Override
	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}

	@Override
	public boolean isSilent() {
		return silent;
	}

	@Override
	public void setSilent(boolean silent) {
		this.silent = silent;
	}

	@Override
	public boolean isSprinting() {
		return sprinting;
	}

	@Override
	public void setSprinting(boolean sprinting) {
		this.sprinting = sprinting;
	}
}