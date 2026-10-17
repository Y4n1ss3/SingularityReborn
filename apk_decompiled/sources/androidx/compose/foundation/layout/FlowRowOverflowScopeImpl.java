package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowRowOverflowScopeImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import defpackage.g30;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlowRowOverflowScopeImpl implements FlowRowScope, FlowRowOverflowScope {
    public static final int $stable = 0;
    private final /* synthetic */ FlowRowScopeInstance $$delegate_0 = FlowRowScopeInstance.INSTANCE;
    private final g30 shownItemCount$delegate;
    private final FlowLayoutOverflowState state;
    private final g30 totalItemCount$delegate;

    public FlowRowOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.state = flowLayoutOverflowState;
        final int i = 0;
        iy iyVar = new iy(this) { // from class: nx
            public final /* synthetic */ FlowRowOverflowScopeImpl e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                int i2;
                int i3 = i;
                FlowRowOverflowScopeImpl flowRowOverflowScopeImpl = this.e;
                switch (i3) {
                    case 0:
                        i2 = FlowRowOverflowScopeImpl.totalItemCount_delegate$lambda$0(flowRowOverflowScopeImpl);
                        break;
                    default:
                        i2 = FlowRowOverflowScopeImpl.shownItemCount_delegate$lambda$0(flowRowOverflowScopeImpl);
                        break;
                }
                return Integer.valueOf(i2);
            }
        };
        final int i2 = 1;
        this.totalItemCount$delegate = FlowLayoutOverflowKt.lazyInt$default(null, iyVar, 1, null);
        this.shownItemCount$delegate = FlowLayoutOverflowKt.lazyInt(flowLayoutOverflowState.getShownItemLazyErrorMessage$foundation_layout(), new iy(this) { // from class: nx
            public final /* synthetic */ FlowRowOverflowScopeImpl e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                int i22;
                int i3 = i2;
                FlowRowOverflowScopeImpl flowRowOverflowScopeImpl = this.e;
                switch (i3) {
                    case 0:
                        i22 = FlowRowOverflowScopeImpl.totalItemCount_delegate$lambda$0(flowRowOverflowScopeImpl);
                        break;
                    default:
                        i22 = FlowRowOverflowScopeImpl.shownItemCount_delegate$lambda$0(flowRowOverflowScopeImpl);
                        break;
                }
                return Integer.valueOf(i22);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int shownItemCount_delegate$lambda$0(FlowRowOverflowScopeImpl flowRowOverflowScopeImpl) {
        return flowRowOverflowScopeImpl.state.getItemShown$foundation_layout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int totalItemCount_delegate$lambda$0(FlowRowOverflowScopeImpl flowRowOverflowScopeImpl) {
        return flowRowOverflowScopeImpl.state.getItemCount$foundation_layout();
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier align(Modifier modifier, Alignment.Vertical vertical) {
        return this.$$delegate_0.align(modifier, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, ky kyVar) {
        return this.$$delegate_0.alignBy(modifier, kyVar);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignByBaseline(Modifier modifier) {
        return this.$$delegate_0.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.FlowRowScope
    public Modifier fillMaxRowHeight(Modifier modifier, float f) {
        return this.$$delegate_0.fillMaxRowHeight(modifier, f);
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getShownItemCount() {
        return ((Number) this.shownItemCount$delegate.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.FlowRowOverflowScope
    public int getTotalItemCount() {
        return ((Number) this.totalItemCount$delegate.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier weight(Modifier modifier, float f, boolean z) {
        return this.$$delegate_0.weight(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine horizontalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, horizontalAlignmentLine);
    }
}
