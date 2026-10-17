package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDragScope;
import defpackage.gi0;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ gi0 f;

    public /* synthetic */ q0(Object obj, gi0 gi0Var, int i) {
        this.d = i;
        this.e = obj;
        this.f = gi0Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invokeSuspend$lambda$0;
        w01 invokeSuspend$lambda$02;
        w01 invokeSuspend$lambda$03;
        int i = this.d;
        gi0 gi0Var = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                invokeSuspend$lambda$0 = ModalWideNavigationRailState$animateTo$2.invokeSuspend$lambda$0((AnchoredDragScope) obj3, gi0Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return invokeSuspend$lambda$0;
            case 1:
                invokeSuspend$lambda$02 = SheetState$animateTo$2.invokeSuspend$lambda$0((AnchoredDragScope) obj3, gi0Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return invokeSuspend$lambda$02;
            default:
                invokeSuspend$lambda$03 = DrawerState$animateTo$3.invokeSuspend$lambda$0((androidx.compose.foundation.gestures.AnchoredDragScope) obj3, gi0Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
                return invokeSuspend$lambda$03;
        }
    }
}
