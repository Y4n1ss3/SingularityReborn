package defpackage;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class yg0 implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ long h;
    public final /* synthetic */ int i;
    public final /* synthetic */ float j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    public /* synthetic */ yg0(float f, Modifier modifier, long j, float f2, long j2, int i, int i2, int i3) {
        this.g = f;
        this.e = modifier;
        this.f = j;
        this.j = f2;
        this.h = j2;
        this.i = i;
        this.k = i2;
        this.l = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 CircularProgressIndicator_DUhRLBM$lambda$38;
        w01 CircularProgressIndicator_4lLiAd8$lambda$35;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CircularProgressIndicator_DUhRLBM$lambda$38 = ProgressIndicatorKt.CircularProgressIndicator_DUhRLBM$lambda$38(this.g, this.e, this.f, this.j, this.h, this.i, this.k, this.l, (Composer) obj, intValue);
                return CircularProgressIndicator_DUhRLBM$lambda$38;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                float f = this.g;
                Modifier modifier = this.e;
                long j = this.f;
                float f2 = this.j;
                CircularProgressIndicator_4lLiAd8$lambda$35 = ProgressIndicatorKt.CircularProgressIndicator_4lLiAd8$lambda$35(modifier, j, f, this.h, this.i, f2, this.k, this.l, (Composer) obj, intValue2);
                return CircularProgressIndicator_4lLiAd8$lambda$35;
        }
    }

    public /* synthetic */ yg0(Modifier modifier, long j, float f, long j2, int i, float f2, int i2, int i3) {
        this.e = modifier;
        this.f = j;
        this.g = f;
        this.h = j2;
        this.i = i;
        this.j = f2;
        this.k = i2;
        this.l = i3;
    }
}
