package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class tv {
    public static final tv d;
    public static final tv e;
    public static final /* synthetic */ tv[] f;

    static {
        tv tvVar = new tv("TOP_DOWN", 0);
        d = tvVar;
        tv tvVar2 = new tv("BOTTOM_UP", 1);
        e = tvVar2;
        f = new tv[]{tvVar, tvVar2};
    }

    public static tv valueOf(String str) {
        return (tv) Enum.valueOf(tv.class, str);
    }

    public static tv[] values() {
        return (tv[]) f.clone();
    }
}
