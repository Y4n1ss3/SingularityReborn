package defpackage;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ed0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ ed0(float f, float f2, int i) {
        this.d = i;
        this.e = f;
        this.f = f2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 absoluteOffset_VpY3zN4$lambda$0;
        w01 offset_VpY3zN4$lambda$0;
        w01 padding_VpY3zN4$lambda$0;
        switch (this.d) {
            case 0:
                absoluteOffset_VpY3zN4$lambda$0 = OffsetKt.absoluteOffset_VpY3zN4$lambda$0(this.e, this.f, (InspectorInfo) obj);
                return absoluteOffset_VpY3zN4$lambda$0;
            case 1:
                offset_VpY3zN4$lambda$0 = OffsetKt.offset_VpY3zN4$lambda$0(this.e, this.f, (InspectorInfo) obj);
                return offset_VpY3zN4$lambda$0;
            default:
                padding_VpY3zN4$lambda$0 = PaddingKt.padding_VpY3zN4$lambda$0(this.e, this.f, (InspectorInfo) obj);
                return padding_VpY3zN4$lambda$0;
        }
    }
}
