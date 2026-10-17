package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vo extends ContentObserver {
    public final /* synthetic */ os0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(os0 os0Var) {
        super(new Handler());
        this.a = os0Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        os0 os0Var = this.a;
        if (!os0Var.b || (cursor = os0Var.c) == null || cursor.isClosed()) {
            return;
        }
        os0Var.a = os0Var.c.requery();
    }
}
