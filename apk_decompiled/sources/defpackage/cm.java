package defpackage;

import androidx.compose.foundation.layout.ContextualFlowLayoutKt;
import androidx.compose.foundation.layout.FlowLineInfo;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class cm implements oy {
    public final /* synthetic */ int d;
    public final /* synthetic */ oy e;

    public /* synthetic */ cm(oy oyVar, int i) {
        this.d = i;
        this.e = oyVar;
    }

    @Override // defpackage.oy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        w01 ContextualFlowRow$lambda$2;
        w01 ContextualFlowColumn$lambda$2;
        int i = this.d;
        int intValue = ((Integer) obj).intValue();
        FlowLineInfo flowLineInfo = (FlowLineInfo) obj2;
        Composer composer = (Composer) obj3;
        int intValue2 = ((Integer) obj4).intValue();
        oy oyVar = this.e;
        switch (i) {
            case 0:
                ContextualFlowRow$lambda$2 = ContextualFlowLayoutKt.ContextualFlowRow$lambda$2(oyVar, intValue, flowLineInfo, composer, intValue2);
                return ContextualFlowRow$lambda$2;
            default:
                ContextualFlowColumn$lambda$2 = ContextualFlowLayoutKt.ContextualFlowColumn$lambda$2(oyVar, intValue, flowLineInfo, composer, intValue2);
                return ContextualFlowColumn$lambda$2;
        }
    }
}
