package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class xu0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static du a() {
        ThreadLocal threadLocal = a;
        du duVar = (du) threadLocal.get();
        if (duVar != null) {
            return duVar;
        }
        ee eeVar = new ee(Thread.currentThread());
        threadLocal.set(eeVar);
        return eeVar;
    }
}
