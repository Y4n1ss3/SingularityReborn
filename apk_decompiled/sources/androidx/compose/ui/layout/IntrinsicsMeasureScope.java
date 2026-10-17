package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ky;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ IntrinsicMeasureScope $$delegate_0;
    private final LayoutDirection layoutDirection;

    public IntrinsicsMeasureScope(IntrinsicMeasureScope intrinsicMeasureScope, LayoutDirection layoutDirection) {
        this.$$delegate_0 = intrinsicMeasureScope;
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final ky kyVar, ky kyVar2) {
        boolean z = false;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.layout.IntrinsicsMeasureScope$layout$1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return i2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public ky getRulers() {
                return kyVar;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return i;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
            }
        };
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo360roundToPxR2X_6o(long j) {
        return this.$$delegate_0.mo360roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo361roundToPx0680j_4(float f) {
        return this.$$delegate_0.mo361roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo362toDpGaN1DYA(long j) {
        return this.$$delegate_0.mo362toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo363toDpu2uoSUM(float f) {
        return this.$$delegate_0.mo363toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo365toDpSizekrfVVM(long j) {
        return this.$$delegate_0.mo365toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo366toPxR2X_6o(long j) {
        return this.$$delegate_0.mo366toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo367toPx0680j_4(float f) {
        return this.$$delegate_0.mo367toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo368toSizeXkaWNTQ(long j) {
        return this.$$delegate_0.mo368toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo369toSp0xMU5do(float f) {
        return this.$$delegate_0.mo369toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo370toSpkPz2Gy4(float f) {
        return this.$$delegate_0.mo370toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo364toDpu2uoSUM(int i) {
        return this.$$delegate_0.mo364toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo371toSpkPz2Gy4(int i) {
        return this.$$delegate_0.mo371toSpkPz2Gy4(i);
    }
}
