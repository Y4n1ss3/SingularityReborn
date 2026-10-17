package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class le0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;

    public /* synthetic */ le0(float f, float f2, float f3, float f4, int i) {
        this.d = i;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 padding_qDBjuR0$lambda$0;
        w01 absolutePadding_qDBjuR0$lambda$0;
        switch (this.d) {
            case 0:
                padding_qDBjuR0$lambda$0 = PaddingKt.padding_qDBjuR0$lambda$0(this.e, this.f, this.g, this.h, (InspectorInfo) obj);
                return padding_qDBjuR0$lambda$0;
            default:
                absolutePadding_qDBjuR0$lambda$0 = PaddingKt.absolutePadding_qDBjuR0$lambda$0(this.e, this.f, this.g, this.h, (InspectorInfo) obj);
                return absolutePadding_qDBjuR0$lambda$0;
        }
    }
}
