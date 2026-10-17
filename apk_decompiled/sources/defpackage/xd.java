package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class xd implements iy {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ un e;
    public final /* synthetic */ BasicTooltipState f;

    public /* synthetic */ xd(un unVar, BasicTooltipState basicTooltipState) {
        this.e = unVar;
        this.f = basicTooltipState;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 TooltipPopup$lambda$0$0;
        boolean anchorSemantics$lambda$0$0;
        int i = this.d;
        BasicTooltipState basicTooltipState = this.f;
        un unVar = this.e;
        switch (i) {
            case 0:
                TooltipPopup$lambda$0$0 = BasicTooltipKt.TooltipPopup$lambda$0$0(basicTooltipState, unVar);
                return TooltipPopup$lambda$0$0;
            default:
                anchorSemantics$lambda$0$0 = BasicTooltipKt.anchorSemantics$lambda$0$0(unVar, basicTooltipState);
                return Boolean.valueOf(anchorSemantics$lambda$0$0);
        }
    }

    public /* synthetic */ xd(BasicTooltipState basicTooltipState, un unVar) {
        this.f = basicTooltipState;
        this.e = unVar;
    }
}
