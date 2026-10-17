package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ub0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableIntState e;

    public /* synthetic */ ub0(MutableIntState mutableIntState, int i) {
        this.d = i;
        this.e = mutableIntState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 NavigationBarItem$lambda$8$lambda$7;
        w01 NavigationItem_8Df7sds$lambda$4$lambda$3;
        w01 AnimatedNavigationItem_DQd_Gtc$lambda$15$lambda$14;
        int i = this.d;
        MutableIntState mutableIntState = this.e;
        IntSize intSize = (IntSize) obj;
        switch (i) {
            case 0:
                NavigationBarItem$lambda$8$lambda$7 = NavigationBarKt.NavigationBarItem$lambda$8$lambda$7(mutableIntState, intSize);
                return NavigationBarItem$lambda$8$lambda$7;
            case 1:
                NavigationItem_8Df7sds$lambda$4$lambda$3 = NavigationItemKt.NavigationItem_8Df7sds$lambda$4$lambda$3(mutableIntState, intSize);
                return NavigationItem_8Df7sds$lambda$4$lambda$3;
            default:
                AnimatedNavigationItem_DQd_Gtc$lambda$15$lambda$14 = NavigationItemKt.AnimatedNavigationItem_DQd_Gtc$lambda$15$lambda$14(mutableIntState, intSize);
                return AnimatedNavigationItem_DQd_Gtc$lambda$15$lambda$14;
        }
    }
}
