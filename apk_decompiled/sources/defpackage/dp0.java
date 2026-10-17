package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class dp0 {
    public static final dp0 d;
    public static final dp0 e;
    public static final dp0 f;
    public static final /* synthetic */ dp0[] g;

    static {
        dp0 dp0Var = new dp0("START", 0);
        d = dp0Var;
        dp0 dp0Var2 = new dp0("STOP", 1);
        e = dp0Var2;
        dp0 dp0Var3 = new dp0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f = dp0Var3;
        g = new dp0[]{dp0Var, dp0Var2, dp0Var3};
    }

    public static dp0 valueOf(String str) {
        return (dp0) Enum.valueOf(dp0.class, str);
    }

    public static dp0[] values() {
        return (dp0[]) g.clone();
    }
}
