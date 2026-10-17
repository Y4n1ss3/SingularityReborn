package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
interface SideCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i) {
                return Insets.of(i, insets.top, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo788consumedOffsetsMKHz9U(long j) {
                return Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo789consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(Velocity.m7849getXimpl(j) - f, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return f;
            }
        };
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i) {
                return Insets.of(insets.left, i, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo788consumedOffsetsMKHz9U(long j) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                return Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo789consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(0.0f, Velocity.m7850getYimpl(j) - f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return f2;
            }
        };
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i) {
                return Insets.of(insets.left, insets.top, i, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo788consumedOffsetsMKHz9U(long j) {
                return Offset.m4508constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo789consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(Velocity.m7849getXimpl(j) + f, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return -f;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.right;
            }
        };
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i) {
                return Insets.of(insets.left, insets.top, insets.right, i);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo788consumedOffsetsMKHz9U(long j) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                return Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo789consumedVelocityQWom1Mo(long j, float f) {
                return VelocityKt.Velocity(0.0f, Velocity.m7850getYimpl(j) + f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f, float f2) {
                return -f2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                return insets.bottom;
            }
        };

        private Companion() {
        }

        /* renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m790chooseCalculatorni1skBw(int i, LayoutDirection layoutDirection) {
            WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
            if (WindowInsetsSides.m842equalsimpl0(i, companion.m856getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m842equalsimpl0(i, companion.m859getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m842equalsimpl0(i, companion.m857getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m842equalsimpl0(i, companion.m853getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m842equalsimpl0(i, companion.m858getStartJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? LeftSideCalculator : RightSideCalculator;
            }
            if (WindowInsetsSides.m842equalsimpl0(i, companion.m854getEndJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? RightSideCalculator : LeftSideCalculator;
            }
            o.f("Only Left, Top, Right, Bottom, Start and End are allowed");
            return null;
        }
    }

    Insets adjustInsets(Insets insets, int i);

    /* renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo788consumedOffsetsMKHz9U(long j);

    /* renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo789consumedVelocityQWom1Mo(long j, float f);

    default float hideMotion(float f, float f2) {
        float motionOf = motionOf(f, f2);
        if (motionOf > 0.0f) {
            return 0.0f;
        }
        return motionOf;
    }

    float motionOf(float f, float f2);

    default float showMotion(float f, float f2) {
        float motionOf = motionOf(f, f2);
        if (motionOf < 0.0f) {
            return 0.0f;
        }
        return motionOf;
    }

    int valueOf(Insets insets);
}
