package androidx.compose.material3.pulltorefresh;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.iy;
import defpackage.kp0;
import defpackage.q10;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PullToRefreshElement extends ModifierNodeElement<PullToRefreshModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean isRefreshing;
    private final iy onRefresh;
    private final PullToRefreshState state;
    private final float threshold;

    private PullToRefreshElement(boolean z, iy iyVar, boolean z2, PullToRefreshState pullToRefreshState, float f) {
        this.isRefreshing = z;
        this.onRefresh = iyVar;
        this.enabled = z2;
        this.state = pullToRefreshState;
        this.threshold = f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public PullToRefreshModifierNode create() {
        return new PullToRefreshModifierNode(this.isRefreshing, this.onRefresh, this.enabled, this.state, this.threshold, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.isRefreshing == pullToRefreshElement.isRefreshing && this.enabled == pullToRefreshElement.enabled && this.onRefresh == pullToRefreshElement.onRefresh && q10.b(this.state, pullToRefreshElement.state) && Dp.m7616equalsimpl0(this.threshold, pullToRefreshElement.threshold);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final iy getOnRefresh() {
        return this.onRefresh;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m2997getThresholdD9Ej5fM() {
        return this.threshold;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Dp.m7617hashCodeimpl(this.threshold) + ((this.state.hashCode() + ((this.onRefresh.hashCode() + kp0.c(Boolean.hashCode(this.isRefreshing) * 31, 31, this.enabled)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("PullToRefreshModifierNode");
        uf.d(this.isRefreshing, inspectorInfo.getProperties(), "isRefreshing", inspectorInfo).set("onRefresh", this.onRefresh);
        uf.d(this.enabled, inspectorInfo.getProperties(), "enabled", inspectorInfo).set("state", this.state);
        inspectorInfo.getProperties().set("threshold", Dp.m7609boximpl(this.threshold));
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(PullToRefreshModifierNode pullToRefreshModifierNode) {
        pullToRefreshModifierNode.setOnRefresh(this.onRefresh);
        pullToRefreshModifierNode.setEnabled(this.enabled);
        pullToRefreshModifierNode.setState(this.state);
        pullToRefreshModifierNode.m3006setThreshold0680j_4(this.threshold);
        boolean isRefreshing = pullToRefreshModifierNode.isRefreshing();
        boolean z = this.isRefreshing;
        if (isRefreshing != z) {
            pullToRefreshModifierNode.setRefreshing(z);
            pullToRefreshModifierNode.update();
        }
    }

    public /* synthetic */ PullToRefreshElement(boolean z, iy iyVar, boolean z2, PullToRefreshState pullToRefreshState, float f, dq dqVar) {
        this(z, iyVar, z2, pullToRefreshState, f);
    }
}
