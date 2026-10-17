package defpackage;

import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bs implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ int f;

    public /* synthetic */ bs(int i, int i2, iy iyVar) {
        this.d = i2;
        this.e = iyVar;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 OnPlatformWindowBoundsChange$lambda$1;
        int i = this.d;
        int i2 = this.f;
        iy iyVar = this.e;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                gs.a(iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return w01.a;
            default:
                OnPlatformWindowBoundsChange$lambda$1 = ExposedDropdownMenu_androidKt.OnPlatformWindowBoundsChange$lambda$1(iyVar, i2, composer, num.intValue());
                return OnPlatformWindowBoundsChange$lambda$1;
        }
    }
}
