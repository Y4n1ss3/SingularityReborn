package androidx.compose.material3;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.hd0;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ ModalWideNavigationRailDialogWrapper e;

    public /* synthetic */ p0(ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper, int i) {
        this.d = i;
        this.e = modalWideNavigationRailDialogWrapper;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 _init_$lambda$3;
        DisposableEffectResult ModalWideNavigationRailDialog$lambda$7$lambda$6;
        int i = this.d;
        ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper = this.e;
        switch (i) {
            case 0:
                _init_$lambda$3 = ModalWideNavigationRailDialogWrapper._init_$lambda$3(modalWideNavigationRailDialogWrapper, (hd0) obj);
                return _init_$lambda$3;
            default:
                ModalWideNavigationRailDialog$lambda$7$lambda$6 = WideNavigationRail_androidKt.ModalWideNavigationRailDialog$lambda$7$lambda$6(modalWideNavigationRailDialogWrapper, (DisposableEffectScope) obj);
                return ModalWideNavigationRailDialog$lambda$7$lambda$6;
        }
    }
}
