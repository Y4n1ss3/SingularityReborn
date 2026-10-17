package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.TopAppBarState;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d7 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ TopAppBarState e;

    public /* synthetic */ d7(TopAppBarState topAppBarState, int i) {
        this.d = i;
        this.e = topAppBarState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 adjustHeightOffsetLimit$lambda$38$lambda$37;
        w01 w01Var;
        int i = this.d;
        TopAppBarState topAppBarState = this.e;
        switch (i) {
            case 0:
                adjustHeightOffsetLimit$lambda$38$lambda$37 = AppBarKt.adjustHeightOffsetLimit$lambda$38$lambda$37(topAppBarState, (IntSize) obj);
                return adjustHeightOffsetLimit$lambda$38$lambda$37;
            default:
                w01Var = AppBarKt.settleAppBar$lambda$55(topAppBarState, (AnimationScope) obj);
                return w01Var;
        }
    }
}
