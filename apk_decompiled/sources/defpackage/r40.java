package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class r40 {
    public static final r40 d;
    public static final r40 e;
    public static final r40 f;
    public static final r40 g;
    public static final r40 h;
    public static final /* synthetic */ r40[] i;

    static {
        r40 r40Var = new r40("DESTROYED", 0);
        d = r40Var;
        r40 r40Var2 = new r40("INITIALIZED", 1);
        e = r40Var2;
        r40 r40Var3 = new r40("CREATED", 2);
        f = r40Var3;
        r40 r40Var4 = new r40("STARTED", 3);
        g = r40Var4;
        r40 r40Var5 = new r40("RESUMED", 4);
        h = r40Var5;
        i = new r40[]{r40Var, r40Var2, r40Var3, r40Var4, r40Var5};
    }

    public static r40 valueOf(String str) {
        return (r40) Enum.valueOf(r40.class, str);
    }

    public static r40[] values() {
        return (r40[]) i.clone();
    }
}
