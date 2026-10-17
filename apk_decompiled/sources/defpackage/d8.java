package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class d8 {
    public static final d8 d;
    public static final d8 e;
    public static final d8 f;
    public static final /* synthetic */ d8[] g;

    static {
        d8 d8Var = new d8("AUTOMATIC", 0);
        d = d8Var;
        d8 d8Var2 = new d8("MANUAL_LINK", 1);
        e = d8Var2;
        d8 d8Var3 = new d8("FILE_PICKER", 2);
        f = d8Var3;
        g = new d8[]{d8Var, d8Var2, d8Var3};
    }

    public static d8 valueOf(String str) {
        return (d8) Enum.valueOf(d8.class, str);
    }

    public static d8[] values() {
        return (d8[]) g.clone();
    }
}
