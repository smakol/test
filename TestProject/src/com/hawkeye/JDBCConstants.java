package com.hawkeye;

public class JDBCConstants
{
	public enum JdbcSourceMode
	{
		SELECT, SELECT_WITH_PARTITIONS, SELECT_WITH_BUCKETS;
	}
	
	public enum JdbcSinkMode
	{
		INSERT(451), UPDATE(55), UPSERT(9), BATCH_INSERT(95), BATCH_UPSERT(4599), MULTI_ROW_INSERT(11), MULTI_ROW_UPSERT(32);
		
		private int id;

		private JdbcSinkMode(int p)
		{
			id = p;
		}

		public int getID()
		{
			return id;
		}
	}
	
	
	public static final String START_KEY = "jdbc.%s.startkey";
	public static final String STOP_KEY = "jdbc.%s.stopkey";
	public static final String SOURCE_MODE = "jdbc.%s.source.mode";
	public static final String KEY_LIST = "jdbc.%s.key.list";
	public static final String VERSIONS = "jdbc.%s.versions";
	
}
