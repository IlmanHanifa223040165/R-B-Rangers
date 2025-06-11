package id.ac.unpas.r_bmanajementugas.persistences;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile TugasDao _tugasDao;

  private volatile KategoriTugasDao _kategoriTugasDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `tugas` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `judul` TEXT NOT NULL, `deskripsi` TEXT NOT NULL, `tanggal` TEXT NOT NULL, `kategori` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `kategori_tugas` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `namaKategori` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dbd63a9cdf9a4ba93343f7c49b1369ad')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `tugas`");
        db.execSQL("DROP TABLE IF EXISTS `kategori_tugas`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsTugas = new HashMap<String, TableInfo.Column>(5);
        _columnsTugas.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTugas.put("judul", new TableInfo.Column("judul", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTugas.put("deskripsi", new TableInfo.Column("deskripsi", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTugas.put("tanggal", new TableInfo.Column("tanggal", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTugas.put("kategori", new TableInfo.Column("kategori", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTugas = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTugas = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTugas = new TableInfo("tugas", _columnsTugas, _foreignKeysTugas, _indicesTugas);
        final TableInfo _existingTugas = TableInfo.read(db, "tugas");
        if (!_infoTugas.equals(_existingTugas)) {
          return new RoomOpenHelper.ValidationResult(false, "tugas(id.ac.unpas.r_bmanajementugas.model.Tugas).\n"
                  + " Expected:\n" + _infoTugas + "\n"
                  + " Found:\n" + _existingTugas);
        }
        final HashMap<String, TableInfo.Column> _columnsKategoriTugas = new HashMap<String, TableInfo.Column>(2);
        _columnsKategoriTugas.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsKategoriTugas.put("namaKategori", new TableInfo.Column("namaKategori", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysKategoriTugas = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesKategoriTugas = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoKategoriTugas = new TableInfo("kategori_tugas", _columnsKategoriTugas, _foreignKeysKategoriTugas, _indicesKategoriTugas);
        final TableInfo _existingKategoriTugas = TableInfo.read(db, "kategori_tugas");
        if (!_infoKategoriTugas.equals(_existingKategoriTugas)) {
          return new RoomOpenHelper.ValidationResult(false, "kategori_tugas(id.ac.unpas.r_bmanajementugas.model.KategoriTugas).\n"
                  + " Expected:\n" + _infoKategoriTugas + "\n"
                  + " Found:\n" + _existingKategoriTugas);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "dbd63a9cdf9a4ba93343f7c49b1369ad", "c182ac8044ac0eb7b7aeb662f9e23fe7");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "tugas","kategori_tugas");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `tugas`");
      _db.execSQL("DELETE FROM `kategori_tugas`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TugasDao.class, TugasDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(KategoriTugasDao.class, KategoriTugasDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public TugasDao tugasDao() {
    if (_tugasDao != null) {
      return _tugasDao;
    } else {
      synchronized(this) {
        if(_tugasDao == null) {
          _tugasDao = new TugasDao_Impl(this);
        }
        return _tugasDao;
      }
    }
  }

  @Override
  public KategoriTugasDao kategoriTugasDao() {
    if (_kategoriTugasDao != null) {
      return _kategoriTugasDao;
    } else {
      synchronized(this) {
        if(_kategoriTugasDao == null) {
          _kategoriTugasDao = new KategoriTugasDao_Impl(this);
        }
        return _kategoriTugasDao;
      }
    }
  }
}
