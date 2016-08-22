/*
 * DummySystemLoader.java
 * Copyright 2011 Connor Petty <cpmeister@users.sourceforge.net>
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 * 
 * Created on Apr 20, 2011, 11:42:23 AM
 */
package pcgen.persistence;

import java.net.URI;
import java.util.Collections;
import java.util.List;

import pcgen.core.GameMode;

/**
 *
 * @author Connor Petty &lt;cpmeister@users.sourceforge.net&gt;
 */
public class DummySystemLoader implements SystemLoader
{

	private List<URI> chosenCamps = Collections.emptyList();

    @Override
	public void setChosenCampaignSourcefiles(List<URI> l, GameMode game)
	{
		chosenCamps = l;
	}

    @Override
	public List<URI> getChosenCampaignSourcefiles(GameMode game)
	{
		return chosenCamps;
	}

}
