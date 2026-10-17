package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.fc;
import defpackage.kp0;
import defpackage.mb;
import defpackage.my;
import defpackage.nb;
import defpackage.q10;
import defpackage.w4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Arrangement {
    public static final int $stable = 0;
    public static final Arrangement INSTANCE = new Arrangement();
    private static final Horizontal Start = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(i, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    };
    private static final Horizontal End = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    };
    private static final Vertical Top = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    };
    private static final Vertical Bottom = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(i, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    };
    private static final HorizontalOrVertical Center = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1
        private final float spacing = Dp.m7611constructorimpl(0.0f);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
        public float mo653getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#Center";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeCenter$foundation_layout(i, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceEvenly = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1
        private final float spacing = Dp.m7611constructorimpl(0.0f);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo653getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(i, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceBetween = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1
        private final float spacing = Dp.m7611constructorimpl(0.0f);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo653getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(i, iArr, iArr2, false);
        }
    };
    private static final HorizontalOrVertical SpaceAround = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1
        private final float spacing = Dp.m7611constructorimpl(0.0f);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout(i, iArr, iArr2, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout(i, iArr, iArr2, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo653getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout(i, iArr, iArr2, false);
        }
    };

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Horizontal {

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m655getSpacingD9Ej5fM(Horizontal horizontal) {
                return Horizontal.super.mo653getSpacingD9Ej5fM();
            }
        }

        void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        default float mo653getSpacingD9Ej5fM() {
            return Dp.m7611constructorimpl(0.0f);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m657getSpacingD9Ej5fM(HorizontalOrVertical horizontalOrVertical) {
                return HorizontalOrVertical.super.mo653getSpacingD9Ej5fM();
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        default float mo653getSpacingD9Ej5fM() {
            return Dp.m7611constructorimpl(0.0f);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Vertical {

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class DefaultImpls {
            @Deprecated
            /* renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m663getSpacingD9Ej5fM(Vertical vertical) {
                return Vertical.super.mo653getSpacingD9Ej5fM();
            }
        }

        void arrange(Density density, int i, int[] iArr, int[] iArr2);

        /* renamed from: getSpacing-D9Ej5fM */
        default float mo653getSpacingD9Ej5fM() {
            return Dp.m7611constructorimpl(0.0f);
        }
    }

    private Arrangement() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int aligned$lambda$0(Alignment.Horizontal horizontal, int i, LayoutDirection layoutDirection) {
        return horizontal.align(0, i, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int aligned$lambda$1(Alignment.Vertical vertical, int i, LayoutDirection layoutDirection) {
        return vertical.align(0, i);
    }

    private final void forEachIndexed(int[] iArr, boolean z, my myVar) {
        if (!z) {
            int length = iArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                myVar.invoke(Integer.valueOf(i2), Integer.valueOf(iArr[i]));
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            } else {
                myVar.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int spacedBy_0680j_4$lambda$0(int i, LayoutDirection layoutDirection) {
        return Alignment.Companion.getStart().align(0, i, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int spacedBy_D5KLDUw$lambda$0(Alignment.Horizontal horizontal, int i, LayoutDirection layoutDirection) {
        return horizontal.align(0, i, layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int spacedBy_D5KLDUw$lambda$1(Alignment.Vertical vertical, int i, LayoutDirection layoutDirection) {
        return vertical.align(0, i);
    }

    public final Vertical aligned(Alignment.Vertical vertical) {
        return new SpacedAligned(Dp.m7611constructorimpl(0.0f), false, new nb(vertical, 1), null);
    }

    public final Vertical getBottom() {
        return Bottom;
    }

    public final HorizontalOrVertical getCenter() {
        return Center;
    }

    public final Horizontal getEnd() {
        return End;
    }

    public final HorizontalOrVertical getSpaceAround() {
        return SpaceAround;
    }

    public final HorizontalOrVertical getSpaceBetween() {
        return SpaceBetween;
    }

    public final HorizontalOrVertical getSpaceEvenly() {
        return SpaceEvenly;
    }

    public final Horizontal getStart() {
        return Start;
    }

    public final Vertical getTop() {
        return Top;
    }

    public final void placeCenter$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    public final void placeLeftOrTop$foundation_layout(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    public final void placeRightOrBottom$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (!z) {
            int length = iArr.length;
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = i5;
            i5 += i8;
        }
    }

    public final void placeSpaceAround$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = !(iArr.length == 0) ? (i - i3) / iArr.length : 0.0f;
        float f = length / 2.0f;
        if (z) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7 + length;
            i2++;
            i6++;
        }
    }

    public final void placeSpaceBetween$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float max = (i - i3) / Math.max(iArr.length - 1, 1);
        float f = (z && iArr.length == 1) ? max : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i5 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7 + max;
            i2++;
            i6++;
        }
    }

    public final void placeSpaceEvenly$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z) {
            float f = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f2 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    /* renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m647spacedBy0680j_4(float f) {
        return new SpacedAligned(f, true, new w4(4), null);
    }

    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m648spacedByD5KLDUw(float f, Alignment.Horizontal horizontal) {
        return new SpacedAligned(f, true, new mb(horizontal, 0), null);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SpacedAligned implements HorizontalOrVertical {
        public static final int $stable = 0;
        private final my alignment;
        private final boolean rtlMirror;
        private final float space;
        private final float spacing;

        private SpacedAligned(float f, boolean z, my myVar) {
            this.space = f;
            this.rtlMirror = z;
            this.alignment = myVar;
            this.spacing = f;
        }

        /* renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m658copy8Feqmps$default(SpacedAligned spacedAligned, float f, boolean z, my myVar, int i, Object obj) {
            if ((i & 1) != 0) {
                f = spacedAligned.space;
            }
            if ((i & 2) != 0) {
                z = spacedAligned.rtlMirror;
            }
            if ((i & 4) != 0) {
                myVar = spacedAligned.alignment;
            }
            return spacedAligned.m660copy8Feqmps(f, z, myVar);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
            int i2;
            int i3;
            if (iArr.length == 0) {
                return;
            }
            int mo361roundToPx0680j_4 = density.mo361roundToPx0680j_4(this.space);
            boolean z = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (z) {
                i2 = 0;
                i3 = 0;
                for (int length = iArr.length - 1; -1 < length; length--) {
                    int i4 = iArr[length];
                    int min = Math.min(i2, i - i4);
                    iArr2[length] = min;
                    i3 = Math.min(mo361roundToPx0680j_4, (i - min) - i4);
                    i2 = iArr2[length] + i4 + i3;
                }
            } else {
                int length2 = iArr.length;
                int i5 = 0;
                i2 = 0;
                i3 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr[i5];
                    int min2 = Math.min(i2, i - i7);
                    iArr2[i6] = min2;
                    int min3 = Math.min(mo361roundToPx0680j_4, (i - min2) - i7);
                    int i8 = iArr2[i6] + i7 + min3;
                    i5++;
                    i3 = min3;
                    i2 = i8;
                    i6++;
                }
            }
            int i9 = i2 - i3;
            my myVar = this.alignment;
            if (myVar == null || i9 >= i) {
                return;
            }
            int intValue = ((Number) myVar.invoke(Integer.valueOf(i - i9), layoutDirection)).intValue();
            int length3 = iArr2.length;
            for (int i10 = 0; i10 < length3; i10++) {
                iArr2[i10] = iArr2[i10] + intValue;
            }
        }

        /* renamed from: component1-D9Ej5fM, reason: not valid java name */
        public final float m659component1D9Ej5fM() {
            return this.space;
        }

        public final boolean component2() {
            return this.rtlMirror;
        }

        public final my component3() {
            return this.alignment;
        }

        /* renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m660copy8Feqmps(float f, boolean z, my myVar) {
            return new SpacedAligned(f, z, myVar, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) obj;
            return Dp.m7616equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && q10.b(this.alignment, spacedAligned.alignment);
        }

        public final my getAlignment() {
            return this.alignment;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        /* renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m661getSpaceD9Ej5fM() {
            return this.space;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* renamed from: getSpacing-D9Ej5fM */
        public float mo653getSpacingD9Ej5fM() {
            return this.spacing;
        }

        public int hashCode() {
            int c = kp0.c(Dp.m7617hashCodeimpl(this.space) * 31, 31, this.rtlMirror);
            my myVar = this.alignment;
            return c + (myVar == null ? 0 : myVar.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(this.rtlMirror ? "" : "Absolute");
            sb.append("Arrangement#spacedAligned(");
            fc.i(this.space, sb, ", ");
            sb.append(this.alignment);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ SpacedAligned(float f, boolean z, my myVar, dq dqVar) {
            this(f, z, myVar);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(Density density, int i, int[] iArr, int[] iArr2) {
            arrange(density, i, iArr, LayoutDirection.Ltr, iArr2);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Absolute {
        public static final int $stable = 0;
        public static final Absolute INSTANCE = new Absolute();
        private static final Horizontal Left = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout(iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };
        private static final Horizontal Center = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeCenter$foundation_layout(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };
        private static final Horizontal Right = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };
        private static final Horizontal SpaceBetween = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };
        private static final Horizontal SpaceEvenly = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };
        private static final Horizontal SpaceAround = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout(i, iArr, iArr2, false);
            }

            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        private Absolute() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int aligned$lambda$0(Alignment.Horizontal horizontal, int i, LayoutDirection layoutDirection) {
            return horizontal.align(0, i, layoutDirection);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int spacedBy_D5KLDUw$lambda$0(Alignment.Horizontal horizontal, int i, LayoutDirection layoutDirection) {
            return horizontal.align(0, i, layoutDirection);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int spacedBy_D5KLDUw$lambda$1(Alignment.Vertical vertical, int i, LayoutDirection layoutDirection) {
            return vertical.align(0, i);
        }

        public final Horizontal aligned(Alignment.Horizontal horizontal) {
            return new SpacedAligned(Dp.m7611constructorimpl(0.0f), false, new mb(horizontal, 2), null);
        }

        public final Horizontal getCenter() {
            return Center;
        }

        public final Horizontal getLeft() {
            return Left;
        }

        public final Horizontal getRight() {
            return Right;
        }

        public final Horizontal getSpaceAround() {
            return SpaceAround;
        }

        public final Horizontal getSpaceBetween() {
            return SpaceBetween;
        }

        public final Horizontal getSpaceEvenly() {
            return SpaceEvenly;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m650spacedBy0680j_4(float f) {
            return new SpacedAligned(f, false, null, 0 == true ? 1 : 0);
        }

        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m651spacedByD5KLDUw(float f, Alignment.Horizontal horizontal) {
            return new SpacedAligned(f, false, new mb(horizontal, 3), null);
        }

        /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m652spacedByD5KLDUw(float f, Alignment.Vertical vertical) {
            return new SpacedAligned(f, false, new nb(vertical, 2), null);
        }

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getLeft$annotations() {
        }

        public static /* synthetic */ void getRight$annotations() {
        }

        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m649spacedByD5KLDUw(float f, Alignment.Vertical vertical) {
        return new SpacedAligned(f, 0 == true ? 1 : 0, new nb(vertical, 0), null);
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getCenter$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public final Horizontal aligned(Alignment.Horizontal horizontal) {
        return new SpacedAligned(Dp.m7611constructorimpl(0.0f), 1 == true ? 1 : 0, new mb(horizontal, 1), null);
    }
}
