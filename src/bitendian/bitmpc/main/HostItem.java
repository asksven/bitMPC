/*
 * bitMPC
 *
 * Copyright 2010 BITENDIAN S.L.
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
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 * 
 * Author: Juanan Guerrero (jguerrero@bitendian.com)
 * 
 */
package bitendian.bitmpc.main;

import java.io.Serializable;

public class HostItem implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;

	//private String[] ip;
	private String host;

	private String password;

	private int port;

	private boolean auth;

	public HostItem(String _name, String _host, int _port, String _password,
			boolean _auth)
	{
		name = _name;
		//ip = _ip;
		host = _host;
		port = _port;
		password = _password;
		auth = _auth;
	}

	public String getHost()
	{
		return host;
	}
	
	public void setHost(String _host)
	{
		host = _host;
	}
	
	public int getPort()
	{
		return port;
	}
	
	public void setPort(int _port)
	{
		port = _port;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String _name)
	{
		name = _name;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String _password)
	{
		password = _password;
	}
	
	public boolean requiresAuth()
	{
		return auth;
	}
	
	public void setRequiresAuth(boolean _auth)
	{
		auth = _auth;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
