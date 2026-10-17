package defpackage;

import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class j8 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ty f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ j8(boolean z, ty tyVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = z;
        this.f = tyVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 PredictiveBackHandler$lambda$1;
        w01 BackHandler$lambda$0;
        int i = this.d;
        ty tyVar = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.g | 1);
                kb.c(this.e, (my) tyVar, (Composer) obj, updateChangedFlags, this.h);
                return w01.a;
            case 1:
                int intValue = ((Integer) obj2).intValue();
                PredictiveBackHandler$lambda$1 = BackHandler_androidKt.PredictiveBackHandler$lambda$1(this.e, (my) tyVar, this.g, this.h, (Composer) obj, intValue);
                return PredictiveBackHandler$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                BackHandler$lambda$0 = BackHandler_androidKt.BackHandler$lambda$0(this.e, (iy) tyVar, this.g, this.h, (Composer) obj, intValue2);
                return BackHandler$lambda$0;
        }
    }
}
