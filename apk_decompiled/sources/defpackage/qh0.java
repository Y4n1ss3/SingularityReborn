package defpackage;

import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class qh0 implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qh0(long j, my myVar, int i) {
        this.e = j;
        this.g = myVar;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 CircularArrowProgressIndicator_RPmYEkk$lambda$14;
        w01 Decoration_Iv8Zu3U$lambda$21;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                CircularArrowProgressIndicator_RPmYEkk$lambda$14 = PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$14((FloatProducer) this.g, this.e, this.f, (Composer) obj, intValue);
                return CircularArrowProgressIndicator_RPmYEkk$lambda$14;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                Decoration_Iv8Zu3U$lambda$21 = TextFieldImplKt.Decoration_Iv8Zu3U$lambda$21(this.e, (my) this.g, this.f, (Composer) obj, intValue2);
                return Decoration_Iv8Zu3U$lambda$21;
        }
    }

    public /* synthetic */ qh0(FloatProducer floatProducer, long j, int i) {
        this.g = floatProducer;
        this.e = j;
        this.f = i;
    }
}
