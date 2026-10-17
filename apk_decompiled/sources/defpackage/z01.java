package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class z01 implements g30, Serializable {
    public iy d;
    public Object e;

    @Override // defpackage.g30
    public final Object getValue() {
        Object obj = this.e;
        if (obj != ts.p) {
            return obj;
        }
        iy iyVar = this.d;
        iyVar.getClass();
        Object invoke = iyVar.invoke();
        this.e = invoke;
        this.d = null;
        return invoke;
    }

    public final String toString() {
        return this.e != ts.p ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
