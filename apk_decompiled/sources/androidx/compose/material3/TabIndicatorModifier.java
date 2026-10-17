package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.State;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.j50;
import defpackage.kp0;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabIndicatorModifier extends ModifierNodeElement<TabIndicatorOffsetNode> {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<Dp> animationSpec;
    private final boolean followContentSize;
    private final int selectedTabIndex;
    private final State<List<TabPosition>> tabPositionsState;

    /* JADX WARN: Multi-variable type inference failed */
    public TabIndicatorModifier(State<? extends List<TabPosition>> state, int i, boolean z, FiniteAnimationSpec<Dp> finiteAnimationSpec) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i;
        this.followContentSize = z;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabIndicatorModifier copy$default(TabIndicatorModifier tabIndicatorModifier, State state, int i, boolean z, FiniteAnimationSpec finiteAnimationSpec, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            state = tabIndicatorModifier.tabPositionsState;
        }
        if ((i2 & 2) != 0) {
            i = tabIndicatorModifier.selectedTabIndex;
        }
        if ((i2 & 4) != 0) {
            z = tabIndicatorModifier.followContentSize;
        }
        if ((i2 & 8) != 0) {
            finiteAnimationSpec = tabIndicatorModifier.animationSpec;
        }
        return tabIndicatorModifier.copy(state, i, z, finiteAnimationSpec);
    }

    public final State<List<TabPosition>> component1() {
        return this.tabPositionsState;
    }

    public final int component2() {
        return this.selectedTabIndex;
    }

    public final boolean component3() {
        return this.followContentSize;
    }

    public final FiniteAnimationSpec<Dp> component4() {
        return this.animationSpec;
    }

    public final TabIndicatorModifier copy(State<? extends List<TabPosition>> state, int i, boolean z, FiniteAnimationSpec<Dp> finiteAnimationSpec) {
        return new TabIndicatorModifier(state, i, z, finiteAnimationSpec);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TabIndicatorOffsetNode create() {
        return new TabIndicatorOffsetNode(this.tabPositionsState, this.selectedTabIndex, this.followContentSize, this.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return q10.b(this.tabPositionsState, tabIndicatorModifier.tabPositionsState) && this.selectedTabIndex == tabIndicatorModifier.selectedTabIndex && this.followContentSize == tabIndicatorModifier.followContentSize && q10.b(this.animationSpec, tabIndicatorModifier.animationSpec);
    }

    public final FiniteAnimationSpec<Dp> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.animationSpec.hashCode() + kp0.c(j50.b(this.selectedTabIndex, this.tabPositionsState.hashCode() * 31, 31), 31, this.followContentSize);
    }

    public String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.tabPositionsState + ", selectedTabIndex=" + this.selectedTabIndex + ", followContentSize=" + this.followContentSize + ", animationSpec=" + this.animationSpec + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TabIndicatorOffsetNode tabIndicatorOffsetNode) {
        tabIndicatorOffsetNode.setTabPositionsState(this.tabPositionsState);
        tabIndicatorOffsetNode.setSelectedTabIndex(this.selectedTabIndex);
        tabIndicatorOffsetNode.setFollowContentSize(this.followContentSize);
        tabIndicatorOffsetNode.setAnimationSpec(this.animationSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
