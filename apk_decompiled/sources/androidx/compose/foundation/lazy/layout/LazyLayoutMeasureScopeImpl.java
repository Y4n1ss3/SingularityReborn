package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.er;
import defpackage.gy;
import defpackage.h10;
import defpackage.ky;
import defpackage.na0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public static final int $stable = 0;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final LazyLayoutItemProvider itemProvider;
    private final na0 measurablesCache;
    private final na0 placeablesCache;
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = (LazyLayoutItemProvider) lazyLayoutItemContentFactory.getItemProvider().invoke();
        na0 na0Var = h10.a;
        this.placeablesCache = new na0();
        this.measurablesCache = new na0();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    public List<Measurable> compose(int i) {
        List<Measurable> list = (List) this.measurablesCache.b(i);
        if (list != null) {
            return list;
        }
        Object key = this.itemProvider.getKey(i);
        List<Measurable> subcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i, key, this.itemProvider.getContentType(i)));
        this.measurablesCache.i(i, subcompose);
        return subcompose;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, ky kyVar) {
        return this.subcomposeMeasureScope.layout(i, i2, map, kyVar);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    @er
    /* renamed from: measure-0kLqBqw */
    public List<Placeable> mo928measure0kLqBqw(int i, long j) {
        List<Placeable> list = (List) this.placeablesCache.b(i);
        if (list != null) {
            return list;
        }
        Object key = this.itemProvider.getKey(i);
        List<Measurable> subcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i, key, this.itemProvider.getContentType(i)));
        int size = subcompose.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 0;
        while (i2 < size) {
            i2 = gy.a(subcompose.get(i2), j, arrayList, i2, 1);
        }
        this.placeablesCache.i(i, arrayList);
        return arrayList;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public int mo360roundToPxR2X_6o(long j) {
        return this.subcomposeMeasureScope.mo360roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public int mo361roundToPx0680j_4(float f) {
        return this.subcomposeMeasureScope.mo361roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public float mo362toDpGaN1DYA(long j) {
        return this.subcomposeMeasureScope.mo362toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo364toDpu2uoSUM(int i) {
        return this.subcomposeMeasureScope.mo364toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public long mo365toDpSizekrfVVM(long j) {
        return this.subcomposeMeasureScope.mo365toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public float mo366toPxR2X_6o(long j) {
        return this.subcomposeMeasureScope.mo366toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public float mo367toPx0680j_4(float f) {
        return this.subcomposeMeasureScope.mo367toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public long mo368toSizeXkaWNTQ(long j) {
        return this.subcomposeMeasureScope.mo368toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public long mo369toSp0xMU5do(float f) {
        return this.subcomposeMeasureScope.mo369toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo370toSpkPz2Gy4(float f) {
        return this.subcomposeMeasureScope.mo370toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, ky kyVar, ky kyVar2) {
        return this.subcomposeMeasureScope.layout(i, i2, map, kyVar, kyVar2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public float mo363toDpu2uoSUM(float f) {
        return this.subcomposeMeasureScope.mo363toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public long mo371toSpkPz2Gy4(int i) {
        return this.subcomposeMeasureScope.mo371toSpkPz2Gy4(i);
    }
}
