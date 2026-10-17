package androidx.compose.ui.semantics;

import defpackage.dq;
import defpackage.iy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final iy maxValue;
    private final boolean reverseScrolling;
    private final iy value;

    public ScrollAxisRange(iy iyVar, iy iyVar2, boolean z) {
        this.value = iyVar;
        this.maxValue = iyVar2;
        this.reverseScrolling = z;
    }

    public final iy getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final iy getValue() {
        return this.value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(((Number) this.value.invoke()).floatValue());
        sb.append(", maxValue=");
        sb.append(((Number) this.maxValue.invoke()).floatValue());
        sb.append(", reverseScrolling=");
        return uf.e(sb, this.reverseScrolling, ')');
    }

    public /* synthetic */ ScrollAxisRange(iy iyVar, iy iyVar2, boolean z, int i, dq dqVar) {
        this(iyVar, iyVar2, (i & 4) != 0 ? false : z);
    }
}
