package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class fq {
    public static final yq a;

    static {
        String str;
        yq yqVar;
        int i = zs0.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            nq nqVar = nr.a;
            rz rzVar = f80.a;
            rz rzVar2 = rzVar.g;
            yqVar = rzVar;
            if (rzVar == null) {
                yqVar = eq.l;
            }
        } else {
            yqVar = eq.l;
        }
        a = yqVar;
    }
}
