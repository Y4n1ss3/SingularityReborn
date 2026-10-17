package androidx.compose.ui.platform;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DerivedSize {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final DerivedSize Zero = new DerivedSize(IntSize.Companion.m7787getZeroYbymL2g(), DpSize.Companion.m7719getZeroMYxV2XQ(), null);
    private final long dpSize;
    private final long pxSize;

    private DerivedSize(long j, long j2) {
        this.pxSize = j;
        this.dpSize = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivedSize)) {
            return false;
        }
        DerivedSize derivedSize = (DerivedSize) obj;
        return IntSize.m7780equalsimpl0(this.pxSize, derivedSize.pxSize) && DpSize.m7706equalsimpl0(this.dpSize, derivedSize.dpSize);
    }

    /* renamed from: getDpSize-MYxV2XQ, reason: not valid java name */
    public final long m6734getDpSizeMYxV2XQ() {
        return this.dpSize;
    }

    /* renamed from: getPxSize-YbymL2g, reason: not valid java name */
    public final long m6735getPxSizeYbymL2g() {
        return this.pxSize;
    }

    public int hashCode() {
        return DpSize.m7711hashCodeimpl(this.dpSize) + (IntSize.m7783hashCodeimpl(this.pxSize) * 31);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: fromDpSize-itqla9I, reason: not valid java name */
        public final DerivedSize m6736fromDpSizeitqla9I(long j, Density density) {
            return new DerivedSize(IntSizeKt.m7793toIntSizeuvyYCjk(density.mo368toSizeXkaWNTQ(j)), j, null);
        }

        /* renamed from: fromPxSize-viCIZxY, reason: not valid java name */
        public final DerivedSize m6737fromPxSizeviCIZxY(long j, Density density) {
            return new DerivedSize(j, density.mo365toDpSizekrfVVM(IntSizeKt.m7794toSizeozmzZPI(j)), null);
        }

        public final DerivedSize getZero() {
            return DerivedSize.Zero;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DerivedSize(long j, long j2, dq dqVar) {
        this(j, j2);
    }
}
