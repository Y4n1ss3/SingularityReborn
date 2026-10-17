package defpackage;

import androidx.compose.foundation.layout.ContextualFlowColumnOverflow;
import androidx.compose.foundation.layout.ContextualFlowRowOverflow;
import androidx.compose.foundation.layout.FlowColumnOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflowState;
import androidx.compose.foundation.layout.FlowRowOverflow;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bm implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ ny e;

    public /* synthetic */ bm(ny nyVar, int i) {
        this.d = i;
        this.e = nyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        my expandOrCollapseIndicator__jt2gSs$lambda$1$0;
        my expandOrCollapseIndicator__jt2gSs$lambda$1$1;
        my expandIndicator$lambda$0;
        my expandIndicator$lambda$02;
        my expandOrCollapseIndicator__jt2gSs$lambda$1$02;
        my expandOrCollapseIndicator__jt2gSs$lambda$1$12;
        my expandIndicator$lambda$03;
        my expandOrCollapseIndicator__jt2gSs$lambda$1$03;
        my expandOrCollapseIndicator__jt2gSs$lambda$1$13;
        my expandOrCollapseIndicator__jt2gSs$lambda$1$04;
        my expandOrCollapseIndicator__jt2gSs$lambda$1$14;
        my expandIndicator$lambda$04;
        int i = this.d;
        ny nyVar = this.e;
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) obj;
        switch (i) {
            case 0:
                expandOrCollapseIndicator__jt2gSs$lambda$1$0 = ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(nyVar, flowLayoutOverflowState);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$0;
            case 1:
                expandOrCollapseIndicator__jt2gSs$lambda$1$1 = ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(nyVar, flowLayoutOverflowState);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$1;
            case 2:
                expandIndicator$lambda$0 = ContextualFlowColumnOverflow.Companion.expandIndicator$lambda$0(nyVar, flowLayoutOverflowState);
                return expandIndicator$lambda$0;
            case 3:
                expandIndicator$lambda$02 = ContextualFlowRowOverflow.Companion.expandIndicator$lambda$0(nyVar, flowLayoutOverflowState);
                return expandIndicator$lambda$02;
            case 4:
                expandOrCollapseIndicator__jt2gSs$lambda$1$02 = ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(nyVar, flowLayoutOverflowState);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$02;
            case 5:
                expandOrCollapseIndicator__jt2gSs$lambda$1$12 = ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(nyVar, flowLayoutOverflowState);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$12;
            case 6:
                expandIndicator$lambda$03 = FlowColumnOverflow.Companion.expandIndicator$lambda$0(nyVar, flowLayoutOverflowState);
                return expandIndicator$lambda$03;
            case 7:
                expandOrCollapseIndicator__jt2gSs$lambda$1$03 = FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(nyVar, flowLayoutOverflowState);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$03;
            case 8:
                expandOrCollapseIndicator__jt2gSs$lambda$1$13 = FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(nyVar, flowLayoutOverflowState);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$13;
            case 9:
                expandOrCollapseIndicator__jt2gSs$lambda$1$04 = FlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0(nyVar, flowLayoutOverflowState);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$04;
            case 10:
                expandOrCollapseIndicator__jt2gSs$lambda$1$14 = FlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1(nyVar, flowLayoutOverflowState);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$14;
            default:
                expandIndicator$lambda$04 = FlowRowOverflow.Companion.expandIndicator$lambda$0(nyVar, flowLayoutOverflowState);
                return expandIndicator$lambda$04;
        }
    }
}
