package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.PreconditionsKt;
import defpackage.dq;
import defpackage.ma0;
import defpackage.q10;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrioritySet {
    private final ma0 list;

    private /* synthetic */ PrioritySet(ma0 ma0Var) {
        this.list = ma0Var;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m3950addimpl(ma0 ma0Var, int i) {
        if (ma0Var.b == 0 || !(ma0Var.b(0) == i || ma0Var.b(ma0Var.b - 1) == i)) {
            int i2 = ma0Var.b;
            ma0Var.e(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int b = ma0Var.b(i3);
                if (i <= b) {
                    break;
                }
                ma0Var.i(i2, b);
                i2 = i3;
            }
            ma0Var.i(i2, i);
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PrioritySet m3951boximpl(ma0 ma0Var) {
        return new PrioritySet(ma0Var);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ma0 m3953constructorimpl$default(ma0 ma0Var, int i, dq dqVar) {
        if ((i & 1) != 0) {
            ma0Var = new ma0();
        }
        return m3952constructorimpl(ma0Var);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3954equalsimpl(ma0 ma0Var, Object obj) {
        return (obj instanceof PrioritySet) && q10.b(ma0Var, ((PrioritySet) obj).m3963unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3955equalsimpl0(ma0 ma0Var, ma0 ma0Var2) {
        return q10.b(ma0Var, ma0Var2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3956hashCodeimpl(ma0 ma0Var) {
        return ma0Var.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3957isEmptyimpl(ma0 ma0Var) {
        return ma0Var.b == 0;
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m3958isNotEmptyimpl(ma0 ma0Var) {
        return ma0Var.b != 0;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final int m3959peekimpl(ma0 ma0Var) {
        if (ma0Var.b != 0) {
            return ma0Var.a[0];
        }
        throw new NoSuchElementException("IntList is empty.");
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m3960takeMaximpl(ma0 ma0Var) {
        int b;
        int i = ma0Var.b;
        int b2 = ma0Var.b(0);
        while (ma0Var.b != 0 && ma0Var.b(0) == b2) {
            ma0Var.i(0, ma0Var.c());
            ma0Var.g(ma0Var.b - 1);
            int i2 = ma0Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int b3 = ma0Var.b(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int b4 = ma0Var.b(i6);
                if (i5 >= i2 || (b = ma0Var.b(i5)) <= b4) {
                    if (b4 > b3) {
                        ma0Var.i(i4, b4);
                        ma0Var.i(i6, b3);
                        i4 = i6;
                    }
                } else if (b > b3) {
                    ma0Var.i(i4, b);
                    ma0Var.i(i5, b3);
                    i4 = i5;
                }
            }
        }
        return b2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3961toStringimpl(ma0 ma0Var) {
        return "PrioritySet(list=" + ma0Var + ')';
    }

    /* renamed from: validateHeap-impl, reason: not valid java name */
    public static final void m3962validateHeapimpl(ma0 ma0Var) {
        int i = ma0Var.b;
        int i2 = i / 2;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i3 + 1;
            int i5 = i4 * 2;
            boolean z = true;
            if (!(ma0Var.b(i3) >= ma0Var.b(i5 + (-1)))) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            if (i5 < i && ma0Var.b(i3) < ma0Var.b(i5)) {
                z = false;
            }
            if (!z) {
                PreconditionsKt.throwIllegalStateException("Check failed.");
            }
            i3 = i4;
        }
    }

    public boolean equals(Object obj) {
        return m3954equalsimpl(this.list, obj);
    }

    public int hashCode() {
        return m3956hashCodeimpl(this.list);
    }

    public String toString() {
        return m3961toStringimpl(this.list);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ma0 m3963unboximpl() {
        return this.list;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static ma0 m3952constructorimpl(ma0 ma0Var) {
        return ma0Var;
    }
}
