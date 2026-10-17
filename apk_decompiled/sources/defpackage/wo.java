package defpackage;

import android.database.DataSetObserver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class wo extends DataSetObserver {
    public final /* synthetic */ os0 a;

    public wo(os0 os0Var) {
        this.a = os0Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        os0 os0Var = this.a;
        os0Var.a = true;
        os0Var.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        os0 os0Var = this.a;
        os0Var.a = false;
        os0Var.notifyDataSetInvalidated();
    }
}
