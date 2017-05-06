/*
 * Copyright (c) 2016 MCPhoton <http://mcphoton.org> and contributors.
 *
 * This file is part of the Photon Server Implementation <https://github.com/mcphoton/Photon-Server>.
 *
 * The Photon Server Implementation is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Photon Server Implementation is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.mcphoton.impl.plugin;

import java.util.List;

/**
 *
 * @author TheElectronWill
 */
public class UnmetDependenciesException extends Exception {

	private final List<DependencyRequirement> dependencies;
	private final String pluginName;

	public UnmetDependenciesException(String pluginName, List<DependencyRequirement> dependencies) {
		this.pluginName = pluginName;
		this.dependencies = dependencies;
	}

	public List<DependencyRequirement> getDependencies() {
		return dependencies;
	}

	@Override
	public String getMessage() {
		return "The plugin " + pluginName + " has unmet dependencies: " + dependencies;
	}

	public String getPluginName() {
		return pluginName;
	}

}