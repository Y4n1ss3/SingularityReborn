package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import com.lumi.singularity.R;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class xo extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public vo e;
    public wo f;
    public yo g;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                vo voVar = this.e;
                if (voVar != null) {
                    cursor2.unregisterContentObserver(voVar);
                }
                wo woVar = this.f;
                if (woVar != null) {
                    cursor2.unregisterDataSetObserver(woVar);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                vo voVar2 = this.e;
                if (voVar2 != null) {
                    cursor.registerContentObserver(voVar2);
                }
                wo woVar2 = this.f;
                if (woVar2 != null) {
                    cursor.registerDataSetObserver(woVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            os0 os0Var = (os0) this;
            view = os0Var.j.inflate(os0Var.i, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        yo yoVar = this.g;
        if (yoVar != null) {
            return yoVar;
        }
        yo yoVar2 = new yo();
        yoVar2.a = this;
        this.g = yoVar2;
        return yoVar2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            o.f("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.c.moveToPosition(i)) {
            o.f(j50.h(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            os0 os0Var = (os0) this;
            view = os0Var.j.inflate(os0Var.h, viewGroup, false);
            view.setTag(new ns0(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(os0Var.o);
        }
        a(view, this.c);
        return view;
    }
}
