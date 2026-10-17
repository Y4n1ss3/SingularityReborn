package defpackage;

import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ge0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ FloatProducer e;

    public /* synthetic */ ge0(FloatProducer floatProducer, int i) {
        this.d = i;
        this.e = floatProducer;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        Dp OutlinedTextFieldLayout$lambda$19$lambda$16$lambda$15;
        float CircularArrowProgressIndicator_RPmYEkk$lambda$7$lambda$6;
        Dp TextFieldLayout$lambda$19$lambda$15$lambda$14;
        int i = this.d;
        FloatProducer floatProducer = this.e;
        switch (i) {
            case 0:
                OutlinedTextFieldLayout$lambda$19$lambda$16$lambda$15 = OutlinedTextFieldKt.OutlinedTextFieldLayout$lambda$19$lambda$16$lambda$15(floatProducer);
                return OutlinedTextFieldLayout$lambda$19$lambda$16$lambda$15;
            case 1:
                CircularArrowProgressIndicator_RPmYEkk$lambda$7$lambda$6 = PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$7$lambda$6(floatProducer);
                return Float.valueOf(CircularArrowProgressIndicator_RPmYEkk$lambda$7$lambda$6);
            default:
                TextFieldLayout$lambda$19$lambda$15$lambda$14 = TextFieldKt.TextFieldLayout$lambda$19$lambda$15$lambda$14(floatProducer);
                return TextFieldLayout$lambda$19$lambda$15$lambda$14;
        }
    }
}
