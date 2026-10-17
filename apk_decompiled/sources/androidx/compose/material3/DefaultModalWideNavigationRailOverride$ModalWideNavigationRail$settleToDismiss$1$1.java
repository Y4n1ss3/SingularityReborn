package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1", f = "WideNavigationRail.kt", l = {538, 539}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 extends us0 implements my {
    final /* synthetic */ ModalWideNavigationRailState $modalState;
    final /* synthetic */ ModalWideNavigationRailOverrideScope $this_ModalWideNavigationRail;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(ModalWideNavigationRailOverrideScope modalWideNavigationRailOverrideScope, ModalWideNavigationRailState modalWideNavigationRailState, hm hmVar) {
        super(2, hmVar);
        this.$this_ModalWideNavigationRail = modalWideNavigationRailOverrideScope;
        this.$modalState = modalWideNavigationRailState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 = new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(this.$this_ModalWideNavigationRail, this.$modalState, hmVar);
        defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1.F$0 = ((Number) obj).floatValue();
        return defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1;
    }

    public final Object invoke(float f, hm hmVar) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1) create(Float.valueOf(f), hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r5.collapse(r4) == r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0.settle$material3(r5, r4) == r3) goto L19;
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
            float f = this.F$0;
            if (this.$this_ModalWideNavigationRail.getShouldHideOnCollapse()) {
                ModalWideNavigationRailState modalWideNavigationRailState = this.$modalState;
                this.label = 1;
            }
            return w01.a;
        }
        if (i != 1) {
            if (i == 2) {
                p10.Q(obj);
                return w01.a;
            }
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        if (!WideNavigationRailStateKt.isExpanded(this.$modalState.getTargetValue())) {
            WideNavigationRailState state = this.$this_ModalWideNavigationRail.getState();
            this.label = 2;
        }
        return w01.a;
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (hm) obj2);
    }
}
