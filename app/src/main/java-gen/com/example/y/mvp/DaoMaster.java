package com.example.y.mvp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.identityscope.IdentityScopeType;

import com.example.y.mvp.NewsTabNameInfoDao;
import com.example.y.mvp.NewsListInfoDao;
import com.example.y.mvp.NewsDetailInfoDao;
import com.example.y.mvp.ImageTabNameInfoDao;
import com.example.y.mvp.ImageListInfoDao;
import com.example.y.mvp.ImageDetailInfoDao;
import com.example.y.mvp.JokePicInfoDao;
import com.example.y.mvp.JokeTextInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * Master of DAO (schema version 1): knows all DAOs.
*/
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 1;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(SQLiteDatabase db, boolean ifNotExists) {
        NewsTabNameInfoDao.createTable(db, ifNotExists);
        NewsListInfoDao.createTable(db, ifNotExists);
        NewsDetailInfoDao.createTable(db, ifNotExists);
        ImageTabNameInfoDao.createTable(db, ifNotExists);
        ImageListInfoDao.createTable(db, ifNotExists);
        ImageDetailInfoDao.createTable(db, ifNotExists);
        JokePicInfoDao.createTable(db, ifNotExists);
        JokeTextInfoDao.createTable(db, ifNotExists);
    }
    
    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(SQLiteDatabase db, boolean ifExists) {
        NewsTabNameInfoDao.dropTable(db, ifExists);
        NewsListInfoDao.dropTable(db, ifExists);
        NewsDetailInfoDao.dropTable(db, ifExists);
        ImageTabNameInfoDao.dropTable(db, ifExists);
        ImageListInfoDao.dropTable(db, ifExists);
        ImageDetailInfoDao.dropTable(db, ifExists);
        JokePicInfoDao.dropTable(db, ifExists);
        JokeTextInfoDao.dropTable(db, ifExists);
    }
    
    public static abstract class OpenHelper extends SQLiteOpenHelper {

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }
    
    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

    public DaoMaster(SQLiteDatabase db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(NewsTabNameInfoDao.class);
        registerDaoClass(NewsListInfoDao.class);
        registerDaoClass(NewsDetailInfoDao.class);
        registerDaoClass(ImageTabNameInfoDao.class);
        registerDaoClass(ImageListInfoDao.class);
        registerDaoClass(ImageDetailInfoDao.class);
        registerDaoClass(JokePicInfoDao.class);
        registerDaoClass(JokeTextInfoDao.class);
    }
    
    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }
    
    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }
    
}