package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowColumnOverflowScopeImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import defpackage.g30;
import defpackage.iy;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlowColumnOverflowScopeImpl implements FlowColumnScope, FlowColumnOverflowScope {
    public static final int $stable = 0;
    private final /* synthetic */ FlowColumnScopeInstance $$delegate_0 = FlowColumnScopeInstance.INSTANCE;
    private final g30 shownItemCount$delegate;
    private final FlowLayoutOverflowState state;
    private final g30 totalItemCount$delegate;

    public FlowColumnOverflowScopeImpl(FlowLayoutOverflowState flowLayoutOverflowState) {
        this.state = flowLayoutOverflowState;
        final int i = 0;
        iy iyVar = new iy(this) { // from class: kw
            public final /* synthetic */ FlowColumnOverflowScopeImpl e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                int i2;
                int i3 = i;
                FlowColumnOverflowScopeImpl flowColumnOverflowScopeImpl = this.e;
                switch (i3) {
                    case 0:
                        i2 = FlowColumnOverflowScopeImpl.totalItemCount_delegate$lambda$0(flowColumnOverflowScopeImpl);
                        break;
                    default:
                        i2 = FlowColumnOverflowScopeImpl.shownItemCount_delegate$lambda$0(flowColumnOverflowScopeImpl);
                        break;
                }
                return Integer.valueOf(i2);
            }
        };
        final int i2 = 1;
        this.totalItemCount$delegate = FlowLayoutOverflowKt.lazyInt$default(null, iyVar, 1, null);
        this.shownItemCount$delegate = FlowLayoutOverflowKt.lazyInt(flowLayoutOverflowState.getShownItemLazyErrorMessage$foundation_layout(), new iy(this) { // from class: kw
            public final /* synthetic */ FlowColumnOverflowScopeImpl e;

            {
                this.e = this;
            }

            @Override // defpackage.iy
            public final Object invoke() {
                int i22;
                int i3 = i2;
                FlowColumnOverflowScopeImpl flowColumnOverflowScopeImpl = this.e;
                switch (i3) {
                    case 0:
                        i22 = FlowColumnOverflowScopeImpl.totalItemCount_delegate$lambda$0(flowColumnOverflowScopeImpl);
                        break;
                    default:
                        i22 = FlowColumnOverflowScopeImpl.shownItemCount_delegate$lambda$0(flowColumnOverflowScopeImpl);
                        break;
                }
                return Integer.valueOf(i22);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int shownItemCount_delegate$lambda$0(FlowColumnOverflowScopeImpl flowColumnOverflowScopeImpl) {
        return flowColumnOverflowScopeImpl.state.getItemShown$foundation_layout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int totalItemCount_delegate$lambda$0(FlowColumnOverflowScopeImpl flowColumnOverflowScopeImpl) {
        return flowColumnOverflowScopeImpl.state.getItemCount$foundation_layout();
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier align(Modifier modifier, Alignment.Horizontal horizontal) {
        return this.$$delegate_0.align(modifier, horizontal);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier alignBy(Modifier modifier, ky kyVar) {
        return this.$$delegate_0.alignBy(modifier, kyVar);
    }

    @Override // androidx.compose.foundation.layout.FlowColumnScope
    public Modifier fillMaxColumnWidth(Modifier modifier, float f) {
        return this.$$delegate_0.fillMaxColumnWidth(modifier, f);
    }

    @Override // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public int getShownItemCount() {
        return ((Number) this.shownItemCount$delegate.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public int getTotalItemCount() {
        return ((Number) this.totalItemCount$delegate.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier weight(Modifier modifier, float f, boolean z) {
        return this.$$delegate_0.weight(modifier, f, z);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, verticalAlignmentLine);
    }
}
