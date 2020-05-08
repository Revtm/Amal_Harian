package com.example.amalharian;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AmalanListOpenHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String AMALAN_TABLE = "amalan";
    private static final String DATABASE_NAME = "catatan_malan";

    //kolom
    public static final String KEY_ID = "id";
    public static final String TANGGAL = "tanggal";
    public static final String AMALAN1 =  "amalan1";
    public static final String AMALAN2 =  "amalan2";
    public static final String AMALAN3 =  "amalan3";
    public static final String AMALAN4 =  "amalan4";
    public static final String AMALAN5 =  "amalan5";
    public static final String AMALAN6 =  "amalan6";
    public static final String AMALAN7 =  "amalan7";
    public static final String AMALAN8 =  "amalan8";
    public static final String AMALAN9 =  "amalan9";
    public static final String AMALAN10 =  "amalan10";
    public static final String AMALAN11 =  "amalan11";
    public static final String AMALAN12 =  "amalan12";
    public static final String AMALAN13 =  "amalan13";
    public static final String AMALAN14 =  "amalan14";
    public static final String AMALAN15 =  "amalan15";
    public static final String AMALAN16 =  "amalan16";
    public static final String AMALAN17 =  "amalan17";
    public static final String AMALAN18 =  "amalan18";
    public static final String AMALAN19 =  "amalan19";
    public static final String AMALAN20 =  "amalan20";
    public static final String AMALAN21 =  "amalan21";
    public static final String AMALAN22 =  "amalan22";
    public static final String AMALAN23 =  "amalan23";

    private static final String queryBuatTabel ="CREATE TABLE " + AMALAN_TABLE +
            " (" +
            KEY_ID + " INTEGER PRIMARY KEY, "+
            TANGGAL + " TEXT, "+
            AMALAN1 + " INTEGER, "+ AMALAN2 + " INTEGER, "+ AMALAN3 + " INTEGER, "+
            AMALAN4 + " INTEGER, "+ AMALAN5 + " INTEGER, "+ AMALAN6 + " INTEGER, "+
            AMALAN7 + " INTEGER, "+ AMALAN8 + " INTEGER, "+ AMALAN9 + " INTEGER, "+
            AMALAN10 + " INTEGER, "+ AMALAN11 + " INTEGER, "+ AMALAN12 + " INTEGER, "+
            AMALAN13 + " INTEGER, "+ AMALAN14 + " INTEGER, "+ AMALAN15 + " INTEGER, "+
            AMALAN16 + " INTEGER, "+ AMALAN17 + " INTEGER, "+ AMALAN18 + " INTEGER, "+
            AMALAN19 + " INTEGER, "+ AMALAN20 + " INTEGER, "+ AMALAN21 + " INTEGER, "+
            AMALAN21 + " INTEGER, "+ AMALAN22 + " INTEGER, "+ AMALAN23 + " INTEGER); ";

    private SQLiteDatabase mWritableDB;
    private SQLiteDatabase mReadableDB;

    public AmalanListOpenHelper(Context context){
        super(context, DATABASE_NAME, null,DATABASE_VERSION);



    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(queryBuatTabel);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
