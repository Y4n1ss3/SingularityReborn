package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import defpackage.ky;
import defpackage.lu0;
import defpackage.vt;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@MeasureScopeMarker
/* loaded from: classes2.dex */
public interface MeasureScope extends IntrinsicMeasureScope {
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, ky kyVar, ky kyVar2, int i3, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: layout");
            return null;
        }
        if ((i3 & 4) != 0) {
            map = vt.d;
        }
        return measureScope.layout(i, i2, map, (i3 & 8) != 0 ? null : kyVar, kyVar2);
    }

    default MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final ky kyVar, final ky kyVar2) {
        if (!((i & (-16777216)) == 0 && ((-16777216) & i2) == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i, i2, map, kyVar, this, kyVar2) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
            final /* synthetic */ ky $placementBlock;
            final /* synthetic */ int $width;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final ky rulers;
            final /* synthetic */ MeasureScope this$0;
            private final int width;

            {
                this.$width = i;
                this.this$0 = this;
                this.$placementBlock = kyVar2;
                this.width = i;
                this.height = i2;
                this.alignmentLines = map;
                this.rulers = kyVar;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public ky getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                MeasureScope measureScope = this.this$0;
                boolean z = measureScope instanceof LookaheadCapablePlaceable;
                ky kyVar3 = this.$placementBlock;
                if (z) {
                    kyVar3.invoke(((LookaheadCapablePlaceable) measureScope).getPlacementScope());
                } else {
                    kyVar3.invoke(new SimplePlacementScope(this.$width, this.this$0.getLayoutDirection(), this.this$0.getDensity(), this.this$0.getFontScale()));
                }
            }
        };
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope measureScope) {
            return MeasureScope.super.isLookingAhead();
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i, int i2, Map<AlignmentLine, Integer> map, ky kyVar) {
            return MeasureScope.super.layout(i, i2, map, kyVar);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m6279roundToPxR2X_6o(MeasureScope measureScope, long j) {
            return MeasureScope.super.mo360roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m6280roundToPx0680j_4(MeasureScope measureScope, float f) {
            return MeasureScope.super.mo361roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6281toDpGaN1DYA(MeasureScope measureScope, long j) {
            return MeasureScope.super.mo362toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6282toDpu2uoSUM(MeasureScope measureScope, float f) {
            return MeasureScope.super.mo363toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m6284toDpSizekrfVVM(MeasureScope measureScope, long j) {
            return MeasureScope.super.mo365toDpSizekrfVVM(j);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m6285toPxR2X_6o(MeasureScope measureScope, long j) {
            return MeasureScope.super.mo366toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m6286toPx0680j_4(MeasureScope measureScope, float f) {
            return MeasureScope.super.mo367toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect dpRect) {
            return MeasureScope.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m6287toSizeXkaWNTQ(MeasureScope measureScope, long j) {
            return MeasureScope.super.mo368toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6288toSp0xMU5do(MeasureScope measureScope, float f) {
            return MeasureScope.super.mo369toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6289toSpkPz2Gy4(MeasureScope measureScope, float f) {
            return MeasureScope.super.mo370toSpkPz2Gy4(f);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i, int i2, Map<AlignmentLine, Integer> map, ky kyVar, ky kyVar2) {
            return MeasureScope.super.layout(i, i2, map, kyVar, kyVar2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6283toDpu2uoSUM(MeasureScope measureScope, int i) {
            return MeasureScope.super.mo364toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6290toSpkPz2Gy4(MeasureScope measureScope, int i) {
            return MeasureScope.super.mo371toSpkPz2Gy4(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, ky kyVar, int i3, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: layout");
            return null;
        }
        if ((i3 & 4) != 0) {
            map = vt.d;
        }
        return measureScope.layout(i, i2, map, kyVar);
    }

    default MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, ky kyVar) {
        return layout(i, i2, map, null, kyVar);
    }
}
