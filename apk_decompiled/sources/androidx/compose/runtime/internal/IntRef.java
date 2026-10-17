package androidx.compose.runtime.internal;

import defpackage.cq;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IntRef {
    public static final int $stable = 8;
    private int element;

    public /* synthetic */ IntRef(int i, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int getElement() {
        return this.element;
    }

    public final void setElement(int i) {
        this.element = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        int hashCode = hashCode();
        cq.f(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        sb.append(num);
        return sb.toString();
    }

    public IntRef(int i) {
        this.element = i;
    }

    public IntRef() {
        this(0, 1, null);
    }
}
