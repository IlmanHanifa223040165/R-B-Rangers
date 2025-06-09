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
import id.ac.unpas.r_bmanajementugas.model.KategoriTugas;
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
public final class KategoriTugasDao_Impl implements KategoriTugasDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<KategoriTugas> __insertionAdapterOfKategoriTugas;

  private final EntityDeletionOrUpdateAdapter<KategoriTugas> __deletionAdapterOfKategoriTugas;

  public KategoriTugasDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfKategoriTugas = new EntityInsertionAdapter<KategoriTugas>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `kategori_tugas` (`id`,`namaKategori`) VALUES (nullif(?, 0),?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final KategoriTugas entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getNamaKategori() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getNamaKategori());
        }
      }
    };
    this.__deletionAdapterOfKategoriTugas = new EntityDeletionOrUpdateAdapter<KategoriTugas>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `kategori_tugas` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final KategoriTugas entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object insert(final KategoriTugas kategori, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfKategoriTugas.insert(kategori);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertAll(final KategoriTugas[] kategori,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfKategoriTugas.insert(kategori);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final KategoriTugas kategori, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfKategoriTugas.handle(kategori);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<KategoriTugas>> loadAll() {
    final String _sql = "SELECT * FROM kategori_tugas ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"kategori_tugas"}, new Callable<List<KategoriTugas>>() {
      @Override
      @NonNull
      public List<KategoriTugas> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNamaKategori = CursorUtil.getColumnIndexOrThrow(_cursor, "namaKategori");
          final List<KategoriTugas> _result = new ArrayList<KategoriTugas>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final KategoriTugas _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNamaKategori;
            if (_cursor.isNull(_cursorIndexOfNamaKategori)) {
              _tmpNamaKategori = null;
            } else {
              _tmpNamaKategori = _cursor.getString(_cursorIndexOfNamaKategori);
            }
            _item = new KategoriTugas(_tmpId,_tmpNamaKategori);
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
