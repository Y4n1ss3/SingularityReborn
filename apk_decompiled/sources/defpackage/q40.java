package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class q40 {
    private static final /* synthetic */ bu $ENTRIES;
    private static final /* synthetic */ q40[] $VALUES;
    public static final o40 Companion;
    public static final q40 ON_ANY;
    public static final q40 ON_CREATE;
    public static final q40 ON_DESTROY;
    public static final q40 ON_PAUSE;
    public static final q40 ON_RESUME;
    public static final q40 ON_START;
    public static final q40 ON_STOP;

    static {
        q40 q40Var = new q40("ON_CREATE", 0);
        ON_CREATE = q40Var;
        q40 q40Var2 = new q40("ON_START", 1);
        ON_START = q40Var2;
        q40 q40Var3 = new q40("ON_RESUME", 2);
        ON_RESUME = q40Var3;
        q40 q40Var4 = new q40("ON_PAUSE", 3);
        ON_PAUSE = q40Var4;
        q40 q40Var5 = new q40("ON_STOP", 4);
        ON_STOP = q40Var5;
        q40 q40Var6 = new q40("ON_DESTROY", 5);
        ON_DESTROY = q40Var6;
        q40 q40Var7 = new q40("ON_ANY", 6);
        ON_ANY = q40Var7;
        q40[] q40VarArr = {q40Var, q40Var2, q40Var3, q40Var4, q40Var5, q40Var6, q40Var7};
        $VALUES = q40VarArr;
        $ENTRIES = new cu(q40VarArr);
        Companion = new o40();
    }

    public static q40 valueOf(String str) {
        return (q40) Enum.valueOf(q40.class, str);
    }

    public static q40[] values() {
        return (q40[]) $VALUES.clone();
    }

    public final r40 a() {
        switch (p40.a[ordinal()]) {
            case 1:
            case 2:
                return r40.f;
            case 3:
            case 4:
                return r40.g;
            case 5:
                return r40.h;
            case 6:
                return r40.d;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                o.n();
                return null;
        }
    }
}
