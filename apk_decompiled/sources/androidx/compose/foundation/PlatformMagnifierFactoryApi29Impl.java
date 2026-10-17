package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 8;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo316updateWko1d7g(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                getMagnifier().setZoom(f);
            }
            if ((InlineClassHelperKt.DualUnsignedFloatMask & j2) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                getMagnifier().show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            } else {
                getMagnifier().show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo317createnHHXs2Y(View view, boolean z, long j, float f, float f2, boolean z2, Density density, float f3) {
        if (z) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long mo368toSizeXkaWNTQ = density.mo368toSizeXkaWNTQ(j);
        float mo367toPx0680j_4 = density.mo367toPx0680j_4(f);
        float mo367toPx0680j_42 = density.mo367toPx0680j_4(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (mo368toSizeXkaWNTQ != InlineClassHelperKt.UnspecifiedPackedFloats) {
            builder.setSize(y80.P(Float.intBitsToFloat((int) (mo368toSizeXkaWNTQ >> 32))), y80.P(Float.intBitsToFloat((int) (mo368toSizeXkaWNTQ & 4294967295L))));
        }
        if (!Float.isNaN(mo367toPx0680j_4)) {
            builder.setCornerRadius(mo367toPx0680j_4);
        }
        if (!Float.isNaN(mo367toPx0680j_42)) {
            builder.setElevation(mo367toPx0680j_42);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new PlatformMagnifierImpl(builder.build());
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }
}
