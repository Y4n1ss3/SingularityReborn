package androidx.compose.material3.internal;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fc;
import defpackage.q10;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WindowAlignmentMarginPosition {
    public static final int $stable = 0;
    public static final WindowAlignmentMarginPosition INSTANCE = new WindowAlignmentMarginPosition();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Horizontal implements MenuPosition.Horizontal {
        public static final int $stable = 0;
        private final Alignment.Horizontal alignment;
        private final int margin;

        public Horizontal(Alignment.Horizontal horizontal, int i) {
            this.alignment = horizontal;
            this.margin = i;
        }

        private final Alignment.Horizontal component1() {
            return this.alignment;
        }

        private final int component2() {
            return this.margin;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                horizontal2 = horizontal.alignment;
            }
            if ((i2 & 2) != 0) {
                i = horizontal.margin;
            }
            return horizontal.copy(horizontal2, i);
        }

        public final Horizontal copy(Alignment.Horizontal horizontal, int i) {
            return new Horizontal(horizontal, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Horizontal)) {
                return false;
            }
            Horizontal horizontal = (Horizontal) obj;
            return q10.b(this.alignment, horizontal.alignment) && this.margin == horizontal.margin;
        }

        public int hashCode() {
            return Integer.hashCode(this.margin) + (this.alignment.hashCode() * 31);
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Horizontal
        /* renamed from: position-95KtPRI */
        public int mo2877position95KtPRI(IntRect intRect, long j, int i, LayoutDirection layoutDirection) {
            int i2 = (int) (j >> 32);
            if (i >= i2 - (this.margin * 2)) {
                return Alignment.Companion.getCenterHorizontally().align(i, i2, layoutDirection);
            }
            int align = this.alignment.align(i, i2, layoutDirection);
            int i3 = this.margin;
            return y80.h(align, i3, (i2 - i3) - i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Horizontal(alignment=");
            sb.append(this.alignment);
            sb.append(", margin=");
            return fc.e(sb, this.margin, ')');
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Vertical implements MenuPosition.Vertical {
        public static final int $stable = 0;
        private final Alignment.Vertical alignment;
        private final int margin;

        public Vertical(Alignment.Vertical vertical, int i) {
            this.alignment = vertical;
            this.margin = i;
        }

        private final Alignment.Vertical component1() {
            return this.alignment;
        }

        private final int component2() {
            return this.margin;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, Alignment.Vertical vertical2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                vertical2 = vertical.alignment;
            }
            if ((i2 & 2) != 0) {
                i = vertical.margin;
            }
            return vertical.copy(vertical2, i);
        }

        public final Vertical copy(Alignment.Vertical vertical, int i) {
            return new Vertical(vertical, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Vertical)) {
                return false;
            }
            Vertical vertical = (Vertical) obj;
            return q10.b(this.alignment, vertical.alignment) && this.margin == vertical.margin;
        }

        public int hashCode() {
            return Integer.hashCode(this.margin) + (this.alignment.hashCode() * 31);
        }

        @Override // androidx.compose.material3.internal.MenuPosition.Vertical
        /* renamed from: position-JVtK1S4 */
        public int mo2878positionJVtK1S4(IntRect intRect, long j, int i) {
            int i2 = (int) (j & 4294967295L);
            if (i >= i2 - (this.margin * 2)) {
                return Alignment.Companion.getCenterVertically().align(i, i2);
            }
            int align = this.alignment.align(i, i2);
            int i3 = this.margin;
            return y80.h(align, i3, (i2 - i3) - i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Vertical(alignment=");
            sb.append(this.alignment);
            sb.append(", margin=");
            return fc.e(sb, this.margin, ')');
        }
    }

    private WindowAlignmentMarginPosition() {
    }
}
