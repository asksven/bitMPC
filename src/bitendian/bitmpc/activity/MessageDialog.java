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
package bitendian.bitmpc.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import bitendian.bitmpc_asksven.R;
import bitendian.bitmpc.activity.BitMPC;

public class MessageDialog extends AlertDialog
{

	public MessageDialog(BitMPC _context)
	{
		super(_context);
		setTitle(_context.getString(R.string.app_name));
		setButton(_context.getString(android.R.string.ok),
				new OnClickListener() {
					public void onClick(DialogInterface dialog, int which)
					{
						dismiss();
					}
				});
	}

}
