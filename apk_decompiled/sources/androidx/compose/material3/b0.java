package androidx.compose.material3;

import androidx.compose.material.ripple.RippleAlpha;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ DelegatingThemeAwareRippleNode e;

    public /* synthetic */ b0(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i) {
        this.d = i;
        this.e = delegatingThemeAwareRippleNode;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 updateConfiguration$lambda$0;
        RippleAlpha attachNewRipple$lambda$1;
        int i = this.d;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.e;
        switch (i) {
            case 0:
                updateConfiguration$lambda$0 = DelegatingThemeAwareRippleNode.updateConfiguration$lambda$0(delegatingThemeAwareRippleNode);
                return updateConfiguration$lambda$0;
            default:
                attachNewRipple$lambda$1 = DelegatingThemeAwareRippleNode.attachNewRipple$lambda$1(delegatingThemeAwareRippleNode);
                return attachNewRipple$lambda$1;
        }
    }
}
