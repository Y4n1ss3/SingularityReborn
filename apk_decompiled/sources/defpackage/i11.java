package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class i11 {
    public static final i11 d;
    public static final i11 e;
    public static final /* synthetic */ i11[] f;

    /* JADX INFO: Fake field, exist only in values array */
    i11 EF0;

    static {
        i11 i11Var = new i11("STRICT", 0);
        i11 i11Var2 = new i11("LOG", 1);
        d = i11Var2;
        i11 i11Var3 = new i11("QUIET", 2);
        e = i11Var3;
        f = new i11[]{i11Var, i11Var2, i11Var3};
    }

    public static i11 valueOf(String str) {
        return (i11) Enum.valueOf(i11.class, str);
    }

    public static i11[] values() {
        return (i11[]) f.clone();
    }
}
