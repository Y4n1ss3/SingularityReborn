package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class uk0 {
    public final Bundle a;
    public final rk0 b;
    public String c = "";
    public final w50 d;

    public uk0(Bundle bundle, rk0 rk0Var) {
        this.a = bundle;
        this.b = rk0Var;
        this.d = rk0Var.a;
    }

    public final uk0 a(go0 go0Var) {
        go0Var.getClass();
        if (q10.b(this.c, "")) {
            return this;
        }
        Bundle g = p10.g((xe0[]) Arrays.copyOf(new xe0[0], 0));
        String str = this.c;
        str.getClass();
        this.a.putBundle(str, g);
        return new uk0(g, this.b);
    }

    public final void b(boolean z) {
        String str = this.c;
        str.getClass();
        this.a.putBoolean(str, z);
    }

    public final void c(char c) {
        String str = this.c;
        str.getClass();
        this.a.putChar(str, c);
    }

    public final void d(double d) {
        String str = this.c;
        str.getClass();
        this.a.putDouble(str, d);
    }

    public final void e(go0 go0Var, int i) {
        go0Var.getClass();
        this.c = go0Var.f(i);
    }

    public final void f(float f) {
        String str = this.c;
        str.getClass();
        this.a.putFloat(str, f);
    }

    public final void g(int i) {
        String str = this.c;
        str.getClass();
        this.a.putInt(str, i);
    }

    public final void h(long j) {
        String str = this.c;
        str.getClass();
        this.a.putLong(str, j);
    }

    public final void i(go0 go0Var, int i, a30 a30Var, Object obj) {
        go0Var.getClass();
        a30Var.getClass();
        e(go0Var, i);
        j(a30Var, obj);
    }

    public final void j(a30 a30Var, Object obj) {
        a30Var.getClass();
        go0 c = a30Var.c();
        if (q10.b(c, qk0.a)) {
            ph phVar = ph.a;
            obj.getClass();
            ph.e(this, (CharSequence) obj);
            return;
        }
        if (q10.b(c, qk0.b)) {
            mq mqVar = mq.b;
            obj.getClass();
            mqVar.a(this, (Parcelable) obj);
            return;
        }
        if (q10.b(c, qk0.c)) {
            iq iqVar = iq.b;
            obj.getClass();
            iqVar.a(this, (Serializable) obj);
            return;
        }
        if (q10.b(c, qk0.d)) {
            io0 io0Var = zz.a;
            obj.getClass();
            IBinder iBinder = (IBinder) obj;
            iBinder.getClass();
            if (!(this instanceof uk0)) {
                o.c(d41.x(zz.a.a, this));
                return;
            }
            String str = this.c;
            str.getClass();
            this.a.putBinder(str, iBinder);
            return;
        }
        if (q10.b(c, qk0.i) || q10.b(c, qk0.j)) {
            io0 io0Var2 = nh.a;
            obj.getClass();
            CharSequence[] charSequenceArr = (CharSequence[]) obj;
            charSequenceArr.getClass();
            if (!(this instanceof uk0)) {
                o.c(d41.x(nh.a.a, this));
                return;
            }
            String str2 = this.c;
            str2.getClass();
            this.a.putCharSequenceArray(str2, charSequenceArr);
            return;
        }
        if (q10.b(c, qk0.k) || q10.b(c, qk0.l)) {
            oh ohVar = oh.a;
            obj.getClass();
            ohVar.a(this, (List) obj);
            return;
        }
        if (q10.b(c, qk0.e) || q10.b(c, qk0.f)) {
            io0 io0Var3 = ye0.a;
            obj.getClass();
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            parcelableArr.getClass();
            if (!(this instanceof uk0)) {
                o.c(d41.x(ye0.a.a, this));
                return;
            }
            String str3 = this.c;
            str3.getClass();
            this.a.putParcelableArray(str3, parcelableArr);
            return;
        }
        if (q10.b(c, qk0.g) || q10.b(c, qk0.h)) {
            ze0 ze0Var = ze0.a;
            obj.getClass();
            ze0Var.a(this, (List) obj);
            return;
        }
        if (q10.b(c, qk0.m) || q10.b(c, qk0.n) || q10.b(c, qk0.o)) {
            or0 or0Var = or0.a;
            obj.getClass();
            or0Var.a(this, (SparseArray) obj);
            return;
        }
        go0 c2 = a30Var.c();
        boolean b = q10.b(c2, pk0.a);
        Bundle bundle = this.a;
        if (b) {
            obj.getClass();
            String str4 = this.c;
            str4.getClass();
            bundle.putIntegerArrayList(str4, p01.E((List) obj));
            return;
        }
        if (q10.b(c2, pk0.b)) {
            obj.getClass();
            String str5 = this.c;
            str5.getClass();
            bundle.putStringArrayList(str5, p01.E((List) obj));
            return;
        }
        if (q10.b(c2, pk0.c)) {
            obj.getClass();
            String str6 = this.c;
            str6.getClass();
            bundle.putBooleanArray(str6, (boolean[]) obj);
            return;
        }
        if (q10.b(c2, pk0.d)) {
            obj.getClass();
            String str7 = this.c;
            str7.getClass();
            bundle.putCharArray(str7, (char[]) obj);
            return;
        }
        if (q10.b(c2, pk0.e)) {
            obj.getClass();
            String str8 = this.c;
            str8.getClass();
            bundle.putDoubleArray(str8, (double[]) obj);
            return;
        }
        if (q10.b(c2, pk0.f)) {
            obj.getClass();
            String str9 = this.c;
            str9.getClass();
            bundle.putFloatArray(str9, (float[]) obj);
            return;
        }
        if (q10.b(c2, pk0.g)) {
            obj.getClass();
            String str10 = this.c;
            str10.getClass();
            bundle.putIntArray(str10, (int[]) obj);
            return;
        }
        if (q10.b(c2, pk0.h)) {
            obj.getClass();
            String str11 = this.c;
            str11.getClass();
            bundle.putLongArray(str11, (long[]) obj);
            return;
        }
        if (!q10.b(c2, pk0.i)) {
            a30Var.a(this, obj);
            return;
        }
        obj.getClass();
        String str12 = this.c;
        str12.getClass();
        bundle.putStringArray(str12, (String[]) obj);
    }

    public final void k(String str) {
        String str2 = this.c;
        str2.getClass();
        this.a.putString(str2, str);
    }
}
