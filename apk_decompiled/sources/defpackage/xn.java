package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class xn {
    public static final xn d;
    public static final xn e;
    public static final xn f;
    public static final xn g;
    public static final /* synthetic */ xn[] h;

    static {
        xn xnVar = new xn("DEFAULT", 0);
        d = xnVar;
        xn xnVar2 = new xn("LAZY", 1);
        e = xnVar2;
        xn xnVar3 = new xn("ATOMIC", 2);
        f = xnVar3;
        xn xnVar4 = new xn("UNDISPATCHED", 3);
        g = xnVar4;
        h = new xn[]{xnVar, xnVar2, xnVar3, xnVar4};
    }

    public static xn valueOf(String str) {
        return (xn) Enum.valueOf(xn.class, str);
    }

    public static xn[] values() {
        return (xn[]) h.clone();
    }
}
