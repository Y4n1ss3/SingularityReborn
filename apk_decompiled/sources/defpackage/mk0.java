package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class mk0 implements g30, Serializable {
    public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(mk0.class, Object.class, "e");
    public volatile iy d;
    public volatile Object e;

    @Override // defpackage.g30
    public final Object getValue() {
        Object obj = this.e;
        ts tsVar = ts.p;
        if (obj != tsVar) {
            return obj;
        }
        iy iyVar = this.d;
        if (iyVar != null) {
            Object invoke = iyVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, tsVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != tsVar) {
                }
            }
            this.d = null;
            return invoke;
        }
        return this.e;
    }

    public final String toString() {
        return this.e != ts.p ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
