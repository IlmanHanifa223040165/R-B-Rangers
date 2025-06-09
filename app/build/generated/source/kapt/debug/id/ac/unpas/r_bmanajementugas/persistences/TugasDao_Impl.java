package id.ac.unpas.r_bmanajementugas.persistences;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import id.ac.unpas.r_bmanajementugas.model.Tugas;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TugasDao_Impl implements TugasDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Tugas> __insertionAdapterOfTugas;

  private final EntityDeletionOrUpdateAdapter<Tugas> __deletionAdapterOfTugas;

  public TugasDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTugas = new EntityInsertionAdapter<Tugas>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `tugas` (`id`,`judul`,`deskripsi`,`tanggal`,`kategori`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Tugas entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getJudul() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getJudul());
        }
        if (entity.getDeskripsi() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDeskripsi());
        }
        if (entity.getTanggal() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getTanggal());
        }
        if (entity.getKategori() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getKategori());
        }
      }
    };
    this.__deletionAdapterOfTugas = new EntityDeletionOrUpdateAdapter<Tugas>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `tugas` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Tugas entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object insert(final Tugas tugas, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTugas.insert(tugas);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final Tugas[] items, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTugas.insert(items);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final Tugas item, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfTugas.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<Tugas>> loadAll() {
    final String _sql = "SELECT * FROM tugas ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"tugas"}, new Callable<List<Tugas>>() {
      @Override
      @NonNull
      public List<Tugas> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfJudul = CursorUtil.getColumnIndexOrThrow(_cursor, "judul");
          final int _cursorIndexOfDeskripsi = CursorUtil.getColumnIndexOrThrow(_cursor, "deskripsi");
          final int _cursorIndexOfTanggal = CursorUtil.getColumnIndexOrThrow(_cursor, "tanggal");
          final int _cursorIndexOfKategori = CursorUtil.getColumnIndexOrThrow(_cursor, "kategori");
          final List<Tugas> _result = new ArrayList<Tugas>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Tugas _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpJudul;
            if (_cursor.isNull(_cursorIndexOfJudul)) {
              _tmpJudul = null;
            } else {
              _tmpJudul = _cursor.getString(_cursorIndexOfJudul);
            }
            final String _tmpDeskripsi;
            if (_cursor.isNull(_cursorIndexOfDeskripsi)) {
              _tmpDeskripsi = null;
            } else {
              _tmpDeskripsi = _cursor.getString(_cursorIndexOfDeskripsi);
            }
            final String _tmpTanggal;
            if (_cursor.isNull(_cursorIndexOfTanggal)) {
              _tmpTanggal = null;
            } else {
              _tmpTanggal = _cursor.getString(_cursorIndexOfTanggal);
            }
            final String _tmpKategori;
            if (_cursor.isNull(_cursorIndexOfKategori)) {
              _tmpKategori = null;
            } else {
              _tmpKategori = _cursor.getString(_cursorIndexOfKategori);
            }
            _item = new Tugas(_tmpId,_tmpJudul,_tmpDeskripsi,_tmpTanggal,_tmpKategori);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
