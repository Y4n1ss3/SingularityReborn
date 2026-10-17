package defpackage;

import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class hx implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ ny e;

    public /* synthetic */ hx(ny nyVar, int i) {
        this.d = i;
        this.e = nyVar;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 FlowColumn$lambda$1$0;
        w01 FlowRow$lambda$1$0;
        int i = this.d;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        ny nyVar = this.e;
        switch (i) {
            case 0:
                FlowColumn$lambda$1$0 = FlowLayoutKt.FlowColumn$lambda$1$0(nyVar, composer, intValue);
                return FlowColumn$lambda$1$0;
            default:
                FlowRow$lambda$1$0 = FlowLayoutKt.FlowRow$lambda$1$0(nyVar, composer, intValue);
                return FlowRow$lambda$1$0;
        }
    }
}
