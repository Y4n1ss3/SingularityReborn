package defpackage;

import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.FloatProducer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class vq implements FloatProducer {
    public final /* synthetic */ int a;

    public /* synthetic */ vq(int i) {
        this.a = i;
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final float invoke() {
        float TwoRowsTopAppBar$lambda$27$lambda$26$lambda$23$lambda$22;
        float DrawerSheet_cm3T3N0$lambda$51$lambda$50;
        switch (this.a) {
            case 0:
                TwoRowsTopAppBar$lambda$27$lambda$26$lambda$23$lambda$22 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$27$lambda$26$lambda$23$lambda$22();
                return TwoRowsTopAppBar$lambda$27$lambda$26$lambda$23$lambda$22;
            default:
                DrawerSheet_cm3T3N0$lambda$51$lambda$50 = NavigationDrawerKt.DrawerSheet_cm3T3N0$lambda$51$lambda$50();
                return DrawerSheet_cm3T3N0$lambda$51$lambda$50;
        }
    }
}
