package defpackage;

import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.TopAppBarState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class k7 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;

    public /* synthetic */ k7(float f, float f2, float f3, int i) {
        this.d = i;
        this.e = f;
        this.f = f2;
        this.g = f3;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        BottomAppBarState BottomAppBarState;
        TopAppBarState rememberTopAppBarState$lambda$26$lambda$25;
        switch (this.d) {
            case 0:
                BottomAppBarState = AppBarKt.BottomAppBarState(this.e, this.f, this.g);
                return BottomAppBarState;
            default:
                rememberTopAppBarState$lambda$26$lambda$25 = AppBarKt.rememberTopAppBarState$lambda$26$lambda$25(this.e, this.f, this.g);
                return rememberTopAppBarState$lambda$26$lambda$25;
        }
    }
}
