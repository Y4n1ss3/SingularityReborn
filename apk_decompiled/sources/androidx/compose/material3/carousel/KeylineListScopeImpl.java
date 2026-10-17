package androidx.compose.material3.carousel;

import androidx.compose.material3.carousel.CarouselAlignment;
import defpackage.d10;
import defpackage.j10;
import defpackage.q10;
import defpackage.uf;
import defpackage.y80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class KeylineListScopeImpl implements KeylineListScope {
    private float focalItemSize;
    private float pivotOffset;
    private int firstFocalIndex = -1;
    private int pivotIndex = -1;
    private final List<TmpKeyline> tmpKeylines = new ArrayList();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TmpKeyline {
        private final boolean isAnchor;
        private final float size;

        public TmpKeyline(float f, boolean z) {
            this.size = f;
            this.isAnchor = z;
        }

        public static /* synthetic */ TmpKeyline copy$default(TmpKeyline tmpKeyline, float f, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                f = tmpKeyline.size;
            }
            if ((i & 2) != 0) {
                z = tmpKeyline.isAnchor;
            }
            return tmpKeyline.copy(f, z);
        }

        public final float component1() {
            return this.size;
        }

        public final boolean component2() {
            return this.isAnchor;
        }

        public final TmpKeyline copy(float f, boolean z) {
            return new TmpKeyline(f, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) obj;
            return Float.compare(this.size, tmpKeyline.size) == 0 && this.isAnchor == tmpKeyline.isAnchor;
        }

        public final float getSize() {
            return this.size;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAnchor) + (Float.hashCode(this.size) * 31);
        }

        public final boolean isAnchor() {
            return this.isAnchor;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TmpKeyline(size=");
            sb.append(this.size);
            sb.append(", isAnchor=");
            return uf.e(sb, this.isAnchor, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<Keyline> createKeylinesWithPivot(int i, float f, int i2, int i3, float f2, float f3, float f4, List<TmpKeyline> list) {
        TmpKeyline tmpKeyline;
        float f5;
        float size;
        int i4;
        j10 j10Var;
        Iterator it;
        TmpKeyline tmpKeyline2 = list.get(i);
        ArrayList arrayList = new ArrayList();
        if (isCutoffLeft(tmpKeyline2.getSize(), f)) {
            size = f - (tmpKeyline2.getSize() / 2.0f);
        } else {
            if (!isCutoffRight(tmpKeyline2.getSize(), f, f3)) {
                tmpKeyline = tmpKeyline2;
                f5 = 0.0f;
                TmpKeyline tmpKeyline3 = tmpKeyline;
                float size2 = tmpKeyline3.getSize();
                boolean z = false;
                if (i2 <= i || i > i3) {
                    i4 = 0;
                } else {
                    i4 = 0;
                    z = true;
                }
                int i5 = i4;
                arrayList.add(new Keyline(size2, f, f, z, tmpKeyline3.isAnchor(), true, f5));
                float f6 = f2 / 2.0f;
                float f7 = (f - f6) - f4;
                int i6 = i - 1;
                j10Var = new j10(i6, q10.s(i6, i5, -1), -1);
                float f8 = f7;
                while (j10Var.f) {
                    int nextInt = j10Var.nextInt();
                    TmpKeyline tmpKeyline4 = list.get(nextInt);
                    float size3 = f7 - (tmpKeyline4.getSize() / 2.0f);
                    arrayList.add(i5, new Keyline(tmpKeyline4.getSize(), size3, f8 - f6, (i2 > nextInt || nextInt > i3) ? i5 : 1, tmpKeyline4.isAnchor(), false, isCutoffLeft(tmpKeyline4.getSize(), size3) ? Math.abs(size3 - (tmpKeyline4.getSize() / 2.0f)) : 0.0f));
                    f7 -= tmpKeyline4.getSize() + f4;
                    f8 -= f2 + f4;
                }
                float f9 = f + f6 + f4;
                it = y80.W(i + 1, list.size()).iterator();
                float f10 = f9;
                while (((j10) it).f) {
                    int nextInt2 = ((d10) it).nextInt();
                    TmpKeyline tmpKeyline5 = list.get(nextInt2);
                    float size4 = (tmpKeyline5.getSize() / 2.0f) + f9;
                    arrayList.add(new Keyline(tmpKeyline5.getSize(), size4, f10 + f6, (i2 > nextInt2 || nextInt2 > i3) ? i5 : 1, tmpKeyline5.isAnchor(), false, isCutoffRight(tmpKeyline5.getSize(), size4, f3) ? ((tmpKeyline5.getSize() / 2.0f) + size4) - f3 : 0.0f));
                    f9 += tmpKeyline5.getSize() + f4;
                    f10 += f2 + f4;
                }
                return arrayList;
            }
            size = ((tmpKeyline2.getSize() / 2.0f) + f) - f3;
        }
        f5 = size;
        tmpKeyline = tmpKeyline2;
        TmpKeyline tmpKeyline32 = tmpKeyline;
        float size22 = tmpKeyline32.getSize();
        boolean z2 = false;
        if (i2 <= i) {
        }
        i4 = 0;
        int i52 = i4;
        arrayList.add(new Keyline(size22, f, f, z2, tmpKeyline32.isAnchor(), true, f5));
        float f62 = f2 / 2.0f;
        float f72 = (f - f62) - f4;
        int i62 = i - 1;
        j10Var = new j10(i62, q10.s(i62, i52, -1), -1);
        float f82 = f72;
        while (j10Var.f) {
        }
        float f92 = f + f62 + f4;
        it = y80.W(i + 1, list.size()).iterator();
        float f102 = f92;
        while (((j10) it).f) {
        }
        return arrayList;
    }

    private final int findLastFocalIndex() {
        int i = this.firstFocalIndex;
        while (i < y80.v(this.tmpKeylines)) {
            int i2 = i + 1;
            if (this.tmpKeylines.get(i2).getSize() != this.focalItemSize) {
                break;
            }
            i = i2;
        }
        return i;
    }

    private final boolean isCutoffLeft(float f, float f2) {
        float f3 = f / 2.0f;
        return f2 - f3 < 0.0f && f2 + f3 > 0.0f;
    }

    private final boolean isCutoffRight(float f, float f2, float f3) {
        float f4 = f / 2.0f;
        return f2 - f4 < f3 && f2 + f4 > f3;
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public void add(float f, boolean z) {
        this.tmpKeylines.add(new TmpKeyline(f, z));
        if (f > this.focalItemSize) {
            this.firstFocalIndex = y80.v(this.tmpKeylines);
            this.focalItemSize = f;
        }
    }

    /* renamed from: createWithAlignment-waks0t8, reason: not valid java name */
    public final KeylineList m2876createWithAlignmentwaks0t8(float f, float f2, int i) {
        float f3;
        float f4;
        int findLastFocalIndex = findLastFocalIndex();
        int i2 = this.firstFocalIndex;
        int i3 = findLastFocalIndex - i2;
        this.pivotIndex = i2;
        CarouselAlignment.Companion companion = CarouselAlignment.Companion;
        if (CarouselAlignment.m2855equalsimpl0(i, companion.m2859getCenterNUL3oTo())) {
            float f5 = 0.0f;
            if (f2 != 0.0f) {
                int i4 = i3 % 2;
                if (i4 + ((((i4 ^ 2) & ((-i4) | i4)) >> 31) & 2) != 0) {
                    f5 = f2 / 2.0f;
                }
            }
            f3 = this.focalItemSize;
            f4 = ((f / 2.0f) - ((f3 / 2.0f) * i3)) - f5;
        } else {
            boolean m2855equalsimpl0 = CarouselAlignment.m2855equalsimpl0(i, companion.m2860getEndNUL3oTo());
            f3 = this.focalItemSize;
            f4 = m2855equalsimpl0 ? f - (f3 / 2.0f) : f3 / 2.0f;
        }
        float f6 = f3;
        float f7 = f4;
        this.pivotOffset = f7;
        return new KeylineList(createKeylinesWithPivot(this.pivotIndex, f7, this.firstFocalIndex, findLastFocalIndex, f6, f, f2, this.tmpKeylines));
    }

    public final KeylineList createWithPivot(float f, float f2, int i, float f3) {
        return new KeylineList(createKeylinesWithPivot(i, f3, this.firstFocalIndex, findLastFocalIndex(), this.focalItemSize, f, f2, this.tmpKeylines));
    }
}
