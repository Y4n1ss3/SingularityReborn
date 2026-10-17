package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vn {
    public static final vn d;
    public static final vn e;
    public static final vn f;
    public static final /* synthetic */ vn[] g;

    static {
        vn vnVar = new vn("COROUTINE_SUSPENDED", 0);
        d = vnVar;
        vn vnVar2 = new vn("UNDECIDED", 1);
        e = vnVar2;
        vn vnVar3 = new vn("RESUMED", 2);
        f = vnVar3;
        g = new vn[]{vnVar, vnVar2, vnVar3};
    }

    public static vn valueOf(String str) {
        return (vn) Enum.valueOf(vn.class, str);
    }

    public static vn[] values() {
        return (vn[]) g.clone();
    }
}
