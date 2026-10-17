package androidx.compose.foundation.pager;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface PageSize {
    int calculateMainAxisPageSize(Density density, int i, int i2);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Fixed implements PageSize {
        public static final int $stable = 0;
        private final float pageSize;

        private Fixed(float f) {
            this.pageSize = f;
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(Density density, int i, int i2) {
            return density.mo361roundToPx0680j_4(this.pageSize);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Fixed) {
                return Dp.m7616equalsimpl0(this.pageSize, ((Fixed) obj).pageSize);
            }
            return false;
        }

        /* renamed from: getPageSize-D9Ej5fM, reason: not valid java name */
        public final float m1001getPageSizeD9Ej5fM() {
            return this.pageSize;
        }

        public int hashCode() {
            return Dp.m7617hashCodeimpl(this.pageSize);
        }

        public /* synthetic */ Fixed(float f, dq dqVar) {
            this(f);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Fill implements PageSize {
        public static final int $stable = 0;
        public static final Fill INSTANCE = new Fill();

        private Fill() {
        }

        @Override // androidx.compose.foundation.pager.PageSize
        public int calculateMainAxisPageSize(Density density, int i, int i2) {
            return i;
        }
    }
}
