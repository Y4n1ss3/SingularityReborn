package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ff0 {
    public static final ff0 d;
    public static final ff0 e;
    public static final ff0 f;
    public static final ff0 g;
    public static final ff0 h;
    public static final ff0 i;
    public static final ff0 j;
    public static final /* synthetic */ ff0[] k;

    static {
        ff0 ff0Var = new ff0("Move", 0);
        d = ff0Var;
        ff0 ff0Var2 = new ff0("Line", 1);
        e = ff0Var2;
        ff0 ff0Var3 = new ff0("Quadratic", 2);
        f = ff0Var3;
        ff0 ff0Var4 = new ff0("Conic", 3);
        g = ff0Var4;
        ff0 ff0Var5 = new ff0("Cubic", 4);
        h = ff0Var5;
        ff0 ff0Var6 = new ff0("Close", 5);
        i = ff0Var6;
        ff0 ff0Var7 = new ff0("Done", 6);
        j = ff0Var7;
        k = new ff0[]{ff0Var, ff0Var2, ff0Var3, ff0Var4, ff0Var5, ff0Var6, ff0Var7};
    }

    public static ff0 valueOf(String str) {
        return (ff0) Enum.valueOf(ff0.class, str);
    }

    public static ff0[] values() {
        return (ff0[]) k.clone();
    }
}
