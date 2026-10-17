package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.oy;
import defpackage.ut;
import defpackage.xl;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRowImpl$1$scope$1$1 implements TabIndicatorScope, TabPositionsHolder {
    final /* synthetic */ FiniteAnimationSpec<Dp> $tabIndicatorAnimationSpec;
    private final MutableState<List<TabPosition>> tabPositions = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ut.d, null, 2, null);

    public TabRowKt$ScrollableTabRowImpl$1$scope$1$1(FiniteAnimationSpec<Dp> finiteAnimationSpec) {
        this.$tabIndicatorAnimationSpec = finiteAnimationSpec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult tabIndicatorLayout$lambda$0(oy oyVar, TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return (MeasureResult) oyVar.invoke(measureScope, measurable, constraints, tabRowKt$ScrollableTabRowImpl$1$scope$1$1.tabPositions.getValue());
    }

    public final MutableState<List<TabPosition>> getTabPositions() {
        return this.tabPositions;
    }

    @Override // androidx.compose.material3.TabPositionsHolder
    public void setTabPositions(List<TabPosition> list) {
        this.tabPositions.setValue(list);
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    public Modifier tabIndicatorLayout(Modifier modifier, oy oyVar) {
        return LayoutModifierKt.layout(modifier, new xl(6, oyVar, this));
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    public Modifier tabIndicatorOffset(Modifier modifier, int i, boolean z) {
        return modifier.then(new TabIndicatorModifier(this.tabPositions, i, z, this.$tabIndicatorAnimationSpec));
    }
}
