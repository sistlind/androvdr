/*
 * Copyright (c) 2010-2011 by androvdr <androvdr@googlemail.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2 as
 * published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 * For more information on the GPL, please go to:
 * http://www.gnu.org/copyleft/gpl.html
 */

package de.androvdr;

public class ChannelsTable {
	public static final String TABLE_NAME = "channels";
	
	public static final String ID = "_id";
	public static final String VDR_ID = "vdrid";
	public static final String NUMBER = "number";
	public static final String NAME = "name";
	public static final String ZUSATZ = "zusatz";
	public static final String[] ALL_COLUMNS = new String[] { ID, VDR_ID, NUMBER, NAME, ZUSATZ };
	
	public static final String SQL_CLEAR =
		"DELETE FROM " + TABLE_NAME;
	
	public static final String SQL_CREATE = 
		"CREATE TABLE channels (" +
		ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
		VDR_ID + " INTEGER NOT NULL," +
		NUMBER + " INTEGER NOT NULL," +
		NAME + " TEXT," +
		ZUSATZ + " TEXT" +
		")";
	
	public static final String SQL_CREATE_INDEX =
		"CREATE INDEX channels_number_idx ON channels (vdrid, _id)";
	
	public static final String SQL_DROP =
		"DROP TABLE IF EXISTS " + TABLE_NAME;

}
