package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ku {
    public static final ku d;
    public static final ku e;
    public static final /* synthetic */ ku[] f;

    static {
        ku kuVar = new ku("FUGU", 0);
        d = kuVar;
        ku kuVar2 = new ku("CHEESE", 1);
        e = kuVar2;
        f = new ku[]{kuVar, kuVar2};
    }

    public static ku valueOf(String str) {
        return (ku) Enum.valueOf(ku.class, str);
    }

    public static ku[] values() {
        return (ku[]) f.clone();
    }
}
