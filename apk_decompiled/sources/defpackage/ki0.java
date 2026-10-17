package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class ki0 {
    public static final li0 a;

    static {
        li0 li0Var = null;
        try {
            li0Var = (li0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (li0Var == null) {
            li0Var = new li0();
        }
        a = li0Var;
    }

    public static ji a(Class cls) {
        a.getClass();
        return new ji(cls);
    }
}
