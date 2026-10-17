package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class rh0 {
    public static final rh0 d;
    public static final rh0 e;
    public static final rh0 f;
    public static final rh0 g;
    public static final rh0 h;
    public static final rh0 i;
    public static final /* synthetic */ rh0[] j;

    static {
        rh0 rh0Var = new rh0("QUEST_1", 0);
        d = rh0Var;
        rh0 rh0Var2 = new rh0("QUEST_2", 1);
        e = rh0Var2;
        rh0 rh0Var3 = new rh0("QUEST_PRO", 2);
        f = rh0Var3;
        rh0 rh0Var4 = new rh0("QUEST_3", 3);
        g = rh0Var4;
        rh0 rh0Var5 = new rh0("QUEST_3S", 4);
        h = rh0Var5;
        rh0 rh0Var6 = new rh0("UNKNOWN", 5);
        i = rh0Var6;
        j = new rh0[]{rh0Var, rh0Var2, rh0Var3, rh0Var4, rh0Var5, rh0Var6};
    }

    public static rh0 valueOf(String str) {
        return (rh0) Enum.valueOf(rh0.class, str);
    }

    public static rh0[] values() {
        return (rh0[]) j.clone();
    }
}
