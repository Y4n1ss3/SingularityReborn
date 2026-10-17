package defpackage;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class qk0 {
    public static final go0 a = new sf0(ki0.a(CharSequence.class)).c();
    public static final go0 b = new sf0(ki0.a(Parcelable.class)).c();
    public static final go0 c = new sf0(ki0.a(Serializable.class)).c();
    public static final go0 d = new sf0(ki0.a(IBinder.class)).c();
    public static final pb e;
    public static final pb f;
    public static final pb g;
    public static final pb h;
    public static final pb i;
    public static final pb j;
    public static final pb k;
    public static final pb l;
    public static final go0 m;
    public static final go0 n;
    public static final go0 o;

    static {
        mq mqVar = mq.b;
        ki0.a(Parcelable.class);
        mqVar.getClass();
        e = new pb(mqVar.c(), 0);
        sf0 sf0Var = new sf0(ki0.a(Parcelable.class));
        ki0.a(Parcelable.class);
        go0 c2 = sf0Var.c();
        c2.getClass();
        f = new pb(c2, 0);
        g = new pb(mqVar.c(), 1);
        go0 c3 = new sf0(ki0.a(Parcelable.class)).c();
        c3.getClass();
        h = new pb(c3, 1);
        ph phVar = ph.a;
        ki0.a(CharSequence.class);
        go0 c4 = phVar.c();
        c4.getClass();
        i = new pb(c4, 0);
        sf0 sf0Var2 = new sf0(ki0.a(CharSequence.class));
        ki0.a(CharSequence.class);
        go0 c5 = sf0Var2.c();
        c5.getClass();
        j = new pb(c5, 0);
        io0 io0Var = ph.b;
        io0Var.getClass();
        k = new pb(io0Var, 1);
        go0 c6 = new sf0(ki0.a(CharSequence.class)).c();
        c6.getClass();
        l = new pb(c6, 1);
        mr0 mr0Var = nr0.Companion;
        m = mr0Var.serializer(mqVar).c();
        n = mr0Var.serializer(new sf0(ki0.a(Parcelable.class))).c();
        o = mr0Var.serializer(cq.t(new sf0(ki0.a(Parcelable.class)))).c();
    }
}
