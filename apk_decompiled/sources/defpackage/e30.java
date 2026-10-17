package defpackage;

import androidx.compose.material3.carousel.Arrangement;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.KeylinesKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class e30 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Arrangement f;
    public final /* synthetic */ float g;

    public /* synthetic */ e30(float f, Arrangement arrangement, float f2, int i) {
        this.d = i;
        this.e = f;
        this.f = arrangement;
        this.g = f2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 createLeftAlignedKeylineList$lambda$10;
        w01 createCenterAlignedKeylineList$lambda$16;
        switch (this.d) {
            case 0:
                createLeftAlignedKeylineList$lambda$10 = KeylinesKt.createLeftAlignedKeylineList$lambda$10(this.e, this.f, this.g, (KeylineListScope) obj);
                return createLeftAlignedKeylineList$lambda$10;
            default:
                createCenterAlignedKeylineList$lambda$16 = KeylinesKt.createCenterAlignedKeylineList$lambda$16(this.e, this.f, this.g, (KeylineListScope) obj);
                return createCenterAlignedKeylineList$lambda$16;
        }
    }
}
