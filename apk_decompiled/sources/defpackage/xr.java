package defpackage;

import androidx.compose.material3.DividerKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class xr implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;

    public /* synthetic */ xr(float f, long j, int i) {
        this.d = i;
        this.e = f;
        this.f = j;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 VerticalDivider_9IZ8Weo$lambda$4$lambda$3;
        w01 HorizontalDivider_9IZ8Weo$lambda$1$lambda$0;
        switch (this.d) {
            case 0:
                VerticalDivider_9IZ8Weo$lambda$4$lambda$3 = DividerKt.VerticalDivider_9IZ8Weo$lambda$4$lambda$3(this.e, this.f, (DrawScope) obj);
                return VerticalDivider_9IZ8Weo$lambda$4$lambda$3;
            default:
                HorizontalDivider_9IZ8Weo$lambda$1$lambda$0 = DividerKt.HorizontalDivider_9IZ8Weo$lambda$1$lambda$0(this.e, this.f, (DrawScope) obj);
                return HorizontalDivider_9IZ8Weo$lambda$1$lambda$0;
        }
    }
}
