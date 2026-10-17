package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class cv extends cq {
    public final Object f;
    public final String g;
    public final i11 h;
    public final p90 i;

    public cv(Object obj, String str, ts tsVar, i11 i11Var) {
        this.f = obj;
        this.g = str;
        this.h = i11Var;
        p90 p90Var = new p90(str + " value: " + obj);
        StackTraceElement[] stackTrace = p90Var.getStackTrace();
        stackTrace.getClass();
        p90Var.setStackTrace((StackTraceElement[]) ac.W(2, stackTrace).toArray(new StackTraceElement[0]));
        this.i = p90Var;
    }

    @Override // defpackage.cq
    public final Object i() {
        int ordinal = this.h.ordinal();
        if (ordinal == 0) {
            throw this.i;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return null;
            }
            o.n();
            return null;
        }
        Log.d("qp0", this.g + " value: " + this.f);
        return null;
    }

    @Override // defpackage.cq
    public final cq D(String str, ky kyVar) {
        return this;
    }
}
