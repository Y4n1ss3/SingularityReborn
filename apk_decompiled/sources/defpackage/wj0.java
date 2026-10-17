package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class wj0 {
    public static final wj0 d;
    public static final wj0 e;
    public static final wj0 f;
    public static final wj0 g;
    public static final /* synthetic */ wj0[] h;

    static {
        wj0 wj0Var = new wj0("MAIN", 0);
        d = wj0Var;
        wj0 wj0Var2 = new wj0("MONITOR", 1);
        e = wj0Var2;
        wj0 wj0Var3 = new wj0("MOUNT_MASTER", 2);
        f = wj0Var3;
        wj0 wj0Var4 = new wj0("STATUS", 3);
        g = wj0Var4;
        h = new wj0[]{wj0Var, wj0Var2, wj0Var3, wj0Var4};
    }

    public static wj0 valueOf(String str) {
        return (wj0) Enum.valueOf(wj0.class, str);
    }

    public static wj0[] values() {
        return (wj0[]) h.clone();
    }
}
