package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class mf {
    public static final mf d;
    public static final mf e;
    public static final mf f;
    public static final /* synthetic */ mf[] g;

    static {
        mf mfVar = new mf("SUSPEND", 0);
        d = mfVar;
        mf mfVar2 = new mf("DROP_OLDEST", 1);
        e = mfVar2;
        mf mfVar3 = new mf("DROP_LATEST", 2);
        f = mfVar3;
        g = new mf[]{mfVar, mfVar2, mfVar3};
    }

    public static mf valueOf(String str) {
        return (mf) Enum.valueOf(mf.class, str);
    }

    public static mf[] values() {
        return (mf[]) g.clone();
    }
}
