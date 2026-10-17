package defpackage;

import androidx.compose.material3.DividerKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class wr implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ wr(Modifier modifier, long j, float f, int i, int i2) {
        this.d = 3;
        this.e = modifier;
        this.g = j;
        this.f = f;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Divider_9IZ8Weo$lambda$6;
        w01 VerticalDivider_9IZ8Weo$lambda$5;
        w01 HorizontalDivider_9IZ8Weo$lambda$2;
        w01 CircularProgressIndicator_aM_cp0Q$lambda$40;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                Divider_9IZ8Weo$lambda$6 = DividerKt.Divider_9IZ8Weo$lambda$6(this.e, this.f, this.g, this.h, this.i, (Composer) obj, intValue);
                return Divider_9IZ8Weo$lambda$6;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                VerticalDivider_9IZ8Weo$lambda$5 = DividerKt.VerticalDivider_9IZ8Weo$lambda$5(this.e, this.f, this.g, this.h, this.i, (Composer) obj, intValue2);
                return VerticalDivider_9IZ8Weo$lambda$5;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                HorizontalDivider_9IZ8Weo$lambda$2 = DividerKt.HorizontalDivider_9IZ8Weo$lambda$2(this.e, this.f, this.g, this.h, this.i, (Composer) obj, intValue3);
                return HorizontalDivider_9IZ8Weo$lambda$2;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                Modifier modifier = this.e;
                float f = this.f;
                CircularProgressIndicator_aM_cp0Q$lambda$40 = ProgressIndicatorKt.CircularProgressIndicator_aM_cp0Q$lambda$40(modifier, this.g, f, this.h, this.i, (Composer) obj, intValue4);
                return CircularProgressIndicator_aM_cp0Q$lambda$40;
        }
    }

    public /* synthetic */ wr(Modifier modifier, float f, long j, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = f;
        this.g = j;
        this.h = i;
        this.i = i2;
    }
}
