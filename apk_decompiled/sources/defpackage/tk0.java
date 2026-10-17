package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class tk0 extends d41 {
    public final Bundle k;
    public final rk0 l;
    public String m = "";
    public int n;
    public final w50 o;

    public tk0(Bundle bundle, rk0 rk0Var) {
        this.k = bundle;
        this.l = rk0Var;
        this.o = rk0Var.a;
    }

    @Override // defpackage.d41
    public final w50 A() {
        return this.o;
    }

    @Override // defpackage.d41
    public final d41 d(go0 go0Var) {
        go0Var.getClass();
        if (q10.b(this.m, "")) {
            return this;
        }
        return new tk0(q10.t(this.m, this.k), this.l);
    }

    @Override // defpackage.d41
    public final boolean h() {
        String str = this.m;
        str.getClass();
        Bundle bundle = this.k;
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return z;
        }
        y80.A(str);
        throw null;
    }

    @Override // defpackage.d41
    public final char i() {
        String str = this.m;
        str.getClass();
        Bundle bundle = this.k;
        char c = bundle.getChar(str, (char) 0);
        if (c != 0 || bundle.getChar(str, (char) 65535) != 65535) {
            return c;
        }
        y80.A(str);
        throw null;
    }

    @Override // defpackage.d41
    public final double j() {
        String str = this.m;
        str.getClass();
        Bundle bundle = this.k;
        double d = bundle.getDouble(str, Double.MIN_VALUE);
        if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d;
        }
        y80.A(str);
        throw null;
    }

    @Override // defpackage.d41
    public final int k(go0 go0Var) {
        go0Var.getClass();
        boolean b = q10.b(go0Var.d(), ls0.n);
        Bundle bundle = this.k;
        int size = (b || q10.b(go0Var.d(), ls0.o)) ? bundle.size() : go0Var.e();
        while (true) {
            int i = this.n;
            if (i >= size || !go0Var.h(i)) {
                break;
            }
            String f = go0Var.f(this.n);
            f.getClass();
            if (bundle.containsKey(f)) {
                break;
            }
            this.n++;
        }
        int i2 = this.n;
        if (i2 >= size) {
            return -1;
        }
        this.m = go0Var.f(i2);
        int i3 = this.n;
        this.n = i3 + 1;
        return i3;
    }

    @Override // defpackage.d41
    public final float l() {
        String str = this.m;
        str.getClass();
        Bundle bundle = this.k;
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f;
        }
        y80.A(str);
        throw null;
    }

    @Override // defpackage.d41
    public final int m() {
        return q10.r(this.m, this.k);
    }

    @Override // defpackage.d41
    public final long n() {
        String str = this.m;
        str.getClass();
        Bundle bundle = this.k;
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(str, SnapshotId_jvmKt.SnapshotIdMax) != SnapshotId_jvmKt.SnapshotIdMax) {
            return j;
        }
        y80.A(str);
        throw null;
    }

    @Override // defpackage.d41
    public final boolean o() {
        String str = this.m;
        str.getClass();
        Bundle bundle = this.k;
        return !(bundle.containsKey(str) && bundle.get(str) == null);
    }

    @Override // defpackage.d41
    public final Object q(a30 a30Var) {
        Object d;
        Object stringArray;
        a30Var.getClass();
        go0 c = a30Var.c();
        Object obj = null;
        if (q10.b(c, qk0.a)) {
            ph phVar = ph.a;
            d = ph.d(this);
        } else if (q10.b(c, qk0.b)) {
            d = mq.b.b(this);
        } else if (q10.b(c, qk0.c)) {
            d = iq.b.b(this);
        } else if (q10.b(c, qk0.d)) {
            d = zz.d(this);
        } else if (q10.b(c, qk0.i) || q10.b(c, qk0.j)) {
            d = nh.d(this);
        } else if (q10.b(c, qk0.k) || q10.b(c, qk0.l)) {
            d = oh.a.b(this);
        } else if (q10.b(c, qk0.e)) {
            Parcelable[] d2 = ye0.d(this);
            Object b = a30Var.b(rt.k);
            b.getClass();
            ji a = ki0.a(b.getClass());
            int length = d2.length;
            Class cls = a.d;
            cls.getClass();
            d = Arrays.copyOf(d2, length, cls);
        } else {
            d = q10.b(c, qk0.f) ? ye0.d(this) : (q10.b(c, qk0.g) || q10.b(c, qk0.h)) ? ze0.a.b(this) : (q10.b(c, qk0.m) || q10.b(c, qk0.n) || q10.b(c, qk0.o)) ? or0.a.b(this) : null;
        }
        if (d == null) {
            go0 c2 = a30Var.c();
            boolean b2 = q10.b(c2, pk0.a);
            Bundle bundle = this.k;
            if (b2) {
                String str = this.m;
                str.getClass();
                stringArray = bundle.getIntegerArrayList(str);
                if (stringArray == null) {
                    y80.A(str);
                    throw null;
                }
            } else if (q10.b(c2, pk0.b)) {
                String str2 = this.m;
                str2.getClass();
                stringArray = bundle.getStringArrayList(str2);
                if (stringArray == null) {
                    y80.A(str2);
                    throw null;
                }
            } else if (q10.b(c2, pk0.c)) {
                String str3 = this.m;
                str3.getClass();
                stringArray = bundle.getBooleanArray(str3);
                if (stringArray == null) {
                    y80.A(str3);
                    throw null;
                }
            } else if (q10.b(c2, pk0.d)) {
                String str4 = this.m;
                str4.getClass();
                stringArray = bundle.getCharArray(str4);
                if (stringArray == null) {
                    y80.A(str4);
                    throw null;
                }
            } else if (q10.b(c2, pk0.e)) {
                String str5 = this.m;
                str5.getClass();
                stringArray = bundle.getDoubleArray(str5);
                if (stringArray == null) {
                    y80.A(str5);
                    throw null;
                }
            } else if (q10.b(c2, pk0.f)) {
                String str6 = this.m;
                str6.getClass();
                stringArray = bundle.getFloatArray(str6);
                if (stringArray == null) {
                    y80.A(str6);
                    throw null;
                }
            } else if (q10.b(c2, pk0.g)) {
                String str7 = this.m;
                str7.getClass();
                stringArray = bundle.getIntArray(str7);
                if (stringArray == null) {
                    y80.A(str7);
                    throw null;
                }
            } else if (q10.b(c2, pk0.h)) {
                String str8 = this.m;
                str8.getClass();
                stringArray = bundle.getLongArray(str8);
                if (stringArray == null) {
                    y80.A(str8);
                    throw null;
                }
            } else if (q10.b(c2, pk0.i)) {
                String str9 = this.m;
                str9.getClass();
                stringArray = bundle.getStringArray(str9);
                if (stringArray == null) {
                    y80.A(str9);
                    throw null;
                }
            }
            obj = stringArray;
        } else {
            obj = d;
        }
        return obj == null ? a30Var.b(this) : obj;
    }

    @Override // defpackage.d41
    public final String r() {
        String str = this.m;
        str.getClass();
        String string = this.k.getString(str);
        if (string != null) {
            return string;
        }
        y80.A(str);
        throw null;
    }
}
