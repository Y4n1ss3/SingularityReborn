package defpackage;

import android.window.BackEvent;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class gc {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public gc(BackEvent backEvent) {
        s6 s6Var = s6.a;
        float d = s6Var.d(backEvent);
        float e = s6Var.e(backEvent);
        float b = s6Var.b(backEvent);
        int c = s6Var.c(backEvent);
        this.a = d;
        this.b = e;
        this.c = b;
        this.d = c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return fc.e(sb, this.d, '}');
    }
}
