package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ys0 implements g30, Serializable {
    public iy d;
    public volatile Object e;
    public final Object f;

    public ys0(iy iyVar) {
        iyVar.getClass();
        this.d = iyVar;
        this.e = ts.p;
        this.f = this;
    }

    @Override // defpackage.g30
    public final Object getValue() {
        Object obj;
        Object obj2 = this.e;
        ts tsVar = ts.p;
        if (obj2 != tsVar) {
            return obj2;
        }
        synchronized (this.f) {
            obj = this.e;
            if (obj == tsVar) {
                iy iyVar = this.d;
                iyVar.getClass();
                obj = iyVar.invoke();
                this.e = obj;
                this.d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.e != ts.p ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
