package defpackage;

import androidx.compose.material3.ProgressIndicatorKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class r70 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;

    public /* synthetic */ r70(float f, int i) {
        this.d = i;
        this.e = f;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        float LinearProgressIndicator__5eSR_E$lambda$16$lambda$15;
        int i = this.d;
        float f = this.e;
        switch (i) {
            case 0:
                return Float.valueOf(f);
            case 1:
                LinearProgressIndicator__5eSR_E$lambda$16$lambda$15 = ProgressIndicatorKt.LinearProgressIndicator__5eSR_E$lambda$16$lambda$15(f);
                break;
            default:
                LinearProgressIndicator__5eSR_E$lambda$16$lambda$15 = ProgressIndicatorKt.CircularProgressIndicator_DUhRLBM$lambda$37$lambda$36(f);
                break;
        }
        return Float.valueOf(LinearProgressIndicator__5eSR_E$lambda$16$lambda$15);
    }
}
