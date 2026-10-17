package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class pn {
    public static final List a;

    static {
        try {
            Iterator it = Arrays.asList(new l5()).iterator();
            it.getClass();
            a = do0.X(new ml(new cc(it, 4)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
