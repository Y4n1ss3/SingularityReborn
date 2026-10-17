package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import defpackage.bu;
import defpackage.ky;
import defpackage.p01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class MeasuringIntrinsics {
    public static final MeasuringIntrinsics INSTANCE = new MeasuringIntrinsics();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultIntrinsicMeasurable implements Measurable {
        private final IntrinsicMeasurable measurable;
        private final IntrinsicMinMax minMax;
        private final IntrinsicWidthHeight widthHeight;

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.measurable = intrinsicMeasurable;
            this.minMax = intrinsicMinMax;
            this.widthHeight = intrinsicWidthHeight;
        }

        public final IntrinsicMeasurable getMeasurable() {
            return this.measurable;
        }

        public final IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.measurable.getParentData();
        }

        public final IntrinsicWidthHeight getWidthHeight() {
            return this.widthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            return this.measurable.maxIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            return this.measurable.maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo6234measureBRTryo0(long j) {
            IntrinsicWidthHeight intrinsicWidthHeight = this.widthHeight;
            IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
            IntrinsicMinMax intrinsicMinMax = this.minMax;
            if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                IntrinsicMinMax intrinsicMinMax2 = IntrinsicMinMax.Max;
                IntrinsicMeasurable intrinsicMeasurable = this.measurable;
                return new EmptyPlaceable(intrinsicMinMax == intrinsicMinMax2 ? intrinsicMeasurable.maxIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j)) : intrinsicMeasurable.minIntrinsicWidth(Constraints.m7563getMaxHeightimpl(j)), Constraints.m7559getHasBoundedHeightimpl(j) ? Constraints.m7563getMaxHeightimpl(j) : 32767);
            }
            IntrinsicMinMax intrinsicMinMax3 = IntrinsicMinMax.Max;
            IntrinsicMeasurable intrinsicMeasurable2 = this.measurable;
            return new EmptyPlaceable(Constraints.m7560getHasBoundedWidthimpl(j) ? Constraints.m7564getMaxWidthimpl(j) : 32767, intrinsicMinMax == intrinsicMinMax3 ? intrinsicMeasurable2.maxIntrinsicHeight(Constraints.m7564getMaxWidthimpl(j)) : intrinsicMeasurable2.minIntrinsicHeight(Constraints.m7564getMaxWidthimpl(j)));
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            return this.measurable.minIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            return this.measurable.minIntrinsicWidth(i);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class IntrinsicMinMax {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ IntrinsicMinMax[] $VALUES;
        public static final IntrinsicMinMax Min = new IntrinsicMinMax("Min", 0);
        public static final IntrinsicMinMax Max = new IntrinsicMinMax("Max", 1);

        private static final /* synthetic */ IntrinsicMinMax[] $values() {
            return new IntrinsicMinMax[]{Min, Max};
        }

        static {
            IntrinsicMinMax[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private IntrinsicMinMax(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static IntrinsicMinMax valueOf(String str) {
            return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
        }

        public static IntrinsicMinMax[] values() {
            return (IntrinsicMinMax[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class IntrinsicWidthHeight {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ IntrinsicWidthHeight[] $VALUES;
        public static final IntrinsicWidthHeight Width = new IntrinsicWidthHeight("Width", 0);
        public static final IntrinsicWidthHeight Height = new IntrinsicWidthHeight("Height", 1);

        private static final /* synthetic */ IntrinsicWidthHeight[] $values() {
            return new IntrinsicWidthHeight[]{Width, Height};
        }

        static {
            IntrinsicWidthHeight[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private IntrinsicWidthHeight(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static IntrinsicWidthHeight valueOf(String str) {
            return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
        }

        public static IntrinsicWidthHeight[] values() {
            return (IntrinsicWidthHeight[]) $VALUES.clone();
        }
    }

    private MeasuringIntrinsics() {
    }

    public final int maxHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo1114measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo1114measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    public final int minHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo1114measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo1114measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int i, int i2) {
            m6301setMeasuredSizeozmzZPI(IntSize.m7777constructorimpl((i2 & 4294967295L) | (i << 32)));
        }

        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo6235placeAtf8xVGno(long j, float f, ky kyVar) {
        }
    }
}
