package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class g40 {
    public static final g40 d;
    public static final g40 e;
    public static final /* synthetic */ g40[] f;

    /* JADX INFO: Fake field, exist only in values array */
    g40 EF0;

    static {
        g40 g40Var = new g40("SYNCHRONIZED", 0);
        g40 g40Var2 = new g40("PUBLICATION", 1);
        d = g40Var2;
        g40 g40Var3 = new g40("NONE", 2);
        e = g40Var3;
        f = new g40[]{g40Var, g40Var2, g40Var3};
    }

    public static g40 valueOf(String str) {
        return (g40) Enum.valueOf(g40.class, str);
    }

    public static g40[] values() {
        return (g40[]) f.clone();
    }
}
