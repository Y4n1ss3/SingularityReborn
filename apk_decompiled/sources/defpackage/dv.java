package defpackage;

import java.util.Random;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class dv extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new Random();
    }
}
