package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1", f = "WideNavigationRail.kt", l = {531, 533}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1 extends us0 implements ky {
    final /* synthetic */ ModalWideNavigationRailState $modalState;
    final /* synthetic */ ModalWideNavigationRailOverrideScope $this_ModalWideNavigationRail;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1(ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, ModalWideNavigationRailState modalWideNavigationRailState, hm hmVar) {
        super(1, hmVar);
        this.$this_ModalWideNavigationRail = modalWideNavigationRailOverrideScope;
        this.$modalState = modalWideNavigationRailState;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1(this.$this_ModalWideNavigationRail, this.$modalState, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$animateToDismiss$1$1) create(hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r5.collapse(r4) == r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r5.collapse(r4) == r3) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            if (this.$this_ModalWideNavigationRail.getShouldHideOnCollapse()) {
                ModalWideNavigationRailState modalWideNavigationRailState = this.$modalState;
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    p10.Q(obj);
                    return w01.a;
                }
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        WideNavigationRailState state = this.$this_ModalWideNavigationRail.getState();
        this.label = 2;
    }
}
