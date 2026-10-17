package defpackage;

import androidx.compose.material3.TabRowDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class dt0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ TabRowDefaults e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ float g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ dt0(TabRowDefaults tabRowDefaults, Modifier modifier, float f, long j, int i, int i2, int i3) {
        this.d = i3;
        this.e = tabRowDefaults;
        this.f = modifier;
        this.g = f;
        this.h = j;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Indicator_9IZ8Weo$lambda$0;
        w01 SecondaryIndicator_9IZ8Weo$lambda$2;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Indicator_9IZ8Weo$lambda$0 = TabRowDefaults.Indicator_9IZ8Weo$lambda$0(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, intValue);
                return Indicator_9IZ8Weo$lambda$0;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SecondaryIndicator_9IZ8Weo$lambda$2 = TabRowDefaults.SecondaryIndicator_9IZ8Weo$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, intValue2);
                return SecondaryIndicator_9IZ8Weo$lambda$2;
        }
    }
}
