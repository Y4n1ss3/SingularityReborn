package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.fc;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PaddingValues {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: calculateBottomPadding-D9Ej5fM */
    float mo711calculateBottomPaddingD9Ej5fM();

    /* renamed from: calculateLeftPadding-u2uoSUM */
    float mo712calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateRightPadding-u2uoSUM */
    float mo713calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection);

    /* renamed from: calculateTopPadding-D9Ej5fM */
    float mo714calculateTopPaddingD9Ej5fM();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Absolute implements PaddingValues {
        public static final int $stable = 0;
        private final float bottom;
        private final float left;
        private final float right;
        private final float top;

        private Absolute(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
            if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
                InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
            }
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateBottomPadding-D9Ej5fM */
        public float mo711calculateBottomPaddingD9Ej5fM() {
            return this.bottom;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateLeftPadding-u2uoSUM */
        public float mo712calculateLeftPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.left;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateRightPadding-u2uoSUM */
        public float mo713calculateRightPaddingu2uoSUM(LayoutDirection layoutDirection) {
            return this.right;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* renamed from: calculateTopPadding-D9Ej5fM */
        public float mo714calculateTopPaddingD9Ej5fM() {
            return this.top;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) obj;
            return Dp.m7616equalsimpl0(this.left, absolute.left) && Dp.m7616equalsimpl0(this.top, absolute.top) && Dp.m7616equalsimpl0(this.right, absolute.right) && Dp.m7616equalsimpl0(this.bottom, absolute.bottom);
        }

        public int hashCode() {
            return Dp.m7617hashCodeimpl(this.bottom) + j50.a(this.right, j50.a(this.top, Dp.m7617hashCodeimpl(this.left) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("PaddingValues.Absolute(left=");
            fc.i(this.left, sb, ", top=");
            fc.i(this.top, sb, ", right=");
            fc.i(this.right, sb, ", bottom=");
            sb.append((Object) Dp.m7622toStringimpl(this.bottom));
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m775getBottomD9Ej5fM$annotations() {
        }

        /* renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m776getLeftD9Ej5fM$annotations() {
        }

        /* renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m777getRightD9Ej5fM$annotations() {
        }

        /* renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
        private static /* synthetic */ void m778getTopD9Ej5fM$annotations() {
        }

        public /* synthetic */ Absolute(float f, float f2, float f3, float f4, dq dqVar) {
            this(f, f2, f3, f4);
        }

        public /* synthetic */ Absolute(float f, float f2, float f3, float f4, int i, dq dqVar) {
            this((i & 1) != 0 ? Dp.m7611constructorimpl(0.0f) : f, (i & 2) != 0 ? Dp.m7611constructorimpl(0.0f) : f2, (i & 4) != 0 ? Dp.m7611constructorimpl(0.0f) : f3, (i & 8) != 0 ? Dp.m7611constructorimpl(0.0f) : f4, null);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PaddingValues Zero = new Absolute(0.0f, 0.0f, 0.0f, 0.0f, 15, null);

        private Companion() {
        }

        public final PaddingValues getZero() {
            return Zero;
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }
}
