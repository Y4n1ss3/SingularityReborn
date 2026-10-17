package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class yr0 {
    public static final yr0 d;
    public static final yr0 e;
    public static final yr0 f;
    public static final /* synthetic */ yr0[] g;

    static {
        yr0 yr0Var = new yr0("PREF_V0", 0);
        d = yr0Var;
        yr0 yr0Var2 = new yr0("PREF_V1", 1);
        e = yr0Var2;
        yr0 yr0Var3 = new yr0("BOOT_CONFIG", 2);
        f = yr0Var3;
        g = new yr0[]{yr0Var, yr0Var2, yr0Var3};
    }

    public static yr0 valueOf(String str) {
        return (yr0) Enum.valueOf(yr0.class, str);
    }

    public static yr0[] values() {
        return (yr0[]) g.clone();
    }
}
