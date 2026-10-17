package defpackage;

import android.os.Build;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class hr {
    public static final ys0 a = new ys0(new e1(21));
    public static final Map b;
    public static final Map c;

    static {
        rh0 rh0Var = rh0.g;
        xe0 xe0Var = new xe0(rh0Var, 51943020036500520L);
        rh0 rh0Var2 = rh0.h;
        b = p80.M(xe0Var, new xe0(rh0Var2, 2921110037200610L), new xe0(rh0.e, 52106880032500150L), new xe0(rh0.f, 51360500027200340L));
        c = p80.M(new xe0(rh0Var, 52433670017700520L), new xe0(rh0Var2, 3814840019100610L));
    }

    public static boolean a() {
        Long l = (Long) b.get(b());
        if (l == null) {
            return true;
        }
        long longValue = l.longValue();
        String str = Build.VERSION.INCREMENTAL;
        str.getClass();
        Long f0 = ks0.f0(str);
        return f0 == null || f0.longValue() >= longValue;
    }

    public static rh0 b() {
        return (rh0) a.getValue();
    }

    public static boolean c() {
        return b() == rh0.d;
    }

    public static boolean d() {
        return b() == rh0.e || b() == rh0.f;
    }
}
