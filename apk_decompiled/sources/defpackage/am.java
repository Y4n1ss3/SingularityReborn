package defpackage;

import androidx.compose.foundation.layout.ContextualFlowColumnOverflow;
import androidx.compose.foundation.layout.ContextualFlowRowOverflow;
import androidx.compose.foundation.layout.FlowColumnOverflow;
import androidx.compose.foundation.layout.FlowLayoutOverflowState;
import androidx.compose.foundation.layout.FlowRowOverflow;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class am implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ FlowLayoutOverflowState e;
    public final /* synthetic */ ny f;

    public /* synthetic */ am(FlowLayoutOverflowState flowLayoutOverflowState, ny nyVar, int i) {
        this.d = i;
        this.e = flowLayoutOverflowState;
        this.f = nyVar;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 expandOrCollapseIndicator__jt2gSs$lambda$1$0$0;
        w01 expandIndicator$lambda$0$0;
        w01 expandOrCollapseIndicator__jt2gSs$lambda$1$1$0;
        w01 expandIndicator$lambda$0$02;
        w01 expandOrCollapseIndicator__jt2gSs$lambda$1$1$02;
        w01 expandOrCollapseIndicator__jt2gSs$lambda$1$0$02;
        w01 expandIndicator$lambda$0$03;
        w01 expandOrCollapseIndicator__jt2gSs$lambda$1$0$03;
        w01 expandOrCollapseIndicator__jt2gSs$lambda$1$1$03;
        w01 expandOrCollapseIndicator__jt2gSs$lambda$1$0$04;
        w01 expandIndicator$lambda$0$04;
        w01 expandOrCollapseIndicator__jt2gSs$lambda$1$1$04;
        int i = this.d;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                expandOrCollapseIndicator__jt2gSs$lambda$1$0$0 = ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(this.e, this.f, composer, intValue);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$0$0;
            case 1:
                expandIndicator$lambda$0$0 = ContextualFlowColumnOverflow.Companion.expandIndicator$lambda$0$0(this.e, this.f, composer, intValue);
                return expandIndicator$lambda$0$0;
            case 2:
                expandOrCollapseIndicator__jt2gSs$lambda$1$1$0 = ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(this.e, this.f, composer, intValue);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$1$0;
            case 3:
                expandIndicator$lambda$0$02 = ContextualFlowRowOverflow.Companion.expandIndicator$lambda$0$0(this.e, this.f, composer, intValue);
                return expandIndicator$lambda$0$02;
            case 4:
                expandOrCollapseIndicator__jt2gSs$lambda$1$1$02 = ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(this.e, this.f, composer, intValue);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$1$02;
            case 5:
                expandOrCollapseIndicator__jt2gSs$lambda$1$0$02 = ContextualFlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(this.e, this.f, composer, intValue);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$0$02;
            case 6:
                expandIndicator$lambda$0$03 = FlowColumnOverflow.Companion.expandIndicator$lambda$0$0(this.e, this.f, composer, intValue);
                return expandIndicator$lambda$0$03;
            case 7:
                expandOrCollapseIndicator__jt2gSs$lambda$1$0$03 = FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(this.e, this.f, composer, intValue);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$0$03;
            case 8:
                expandOrCollapseIndicator__jt2gSs$lambda$1$1$03 = FlowColumnOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(this.e, this.f, composer, intValue);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$1$03;
            case 9:
                expandOrCollapseIndicator__jt2gSs$lambda$1$0$04 = FlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$0$0(this.e, this.f, composer, intValue);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$0$04;
            case 10:
                expandIndicator$lambda$0$04 = FlowRowOverflow.Companion.expandIndicator$lambda$0$0(this.e, this.f, composer, intValue);
                return expandIndicator$lambda$0$04;
            default:
                expandOrCollapseIndicator__jt2gSs$lambda$1$1$04 = FlowRowOverflow.Companion.expandOrCollapseIndicator__jt2gSs$lambda$1$1$0(this.e, this.f, composer, intValue);
                return expandOrCollapseIndicator__jt2gSs$lambda$1$1$04;
        }
    }
}
