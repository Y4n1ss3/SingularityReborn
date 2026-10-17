package androidx.compose.foundation.gestures;

import androidx.compose.runtime.ComposerKt;
import defpackage.bq;
import defpackage.co0;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.my;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", l = {ComposerKt.reuseKey}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$untilNull$1 extends ij0 implements my {
    final /* synthetic */ iy $builderAction;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$untilNull$1(iy iyVar, hm hmVar) {
        super(hmVar);
        this.$builderAction = iyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        MouseWheelScrollingLogic$untilNull$1 mouseWheelScrollingLogic$untilNull$1 = new MouseWheelScrollingLogic$untilNull$1(this.$builderAction, hmVar);
        mouseWheelScrollingLogic$untilNull$1.L$0 = obj;
        return mouseWheelScrollingLogic$untilNull$1;
    }

    @Override // defpackage.my
    public final Object invoke(co0 co0Var, hm hmVar) {
        return ((MouseWheelScrollingLogic$untilNull$1) create(co0Var, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:5:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        co0 co0Var;
        Object invoke;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            co0Var = (co0) this.L$0;
            invoke = this.$builderAction.invoke();
            if (invoke != null) {
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = this.L$1;
            co0Var = (co0) this.L$0;
            p10.Q(obj);
            if (obj2 == null) {
                return w01.a;
            }
            invoke = this.$builderAction.invoke();
            if (invoke != null) {
                this.L$0 = co0Var;
                this.L$1 = invoke;
                this.label = 1;
                co0Var.a(this, invoke);
                return vn.d;
            }
            obj2 = null;
            if (obj2 == null) {
            }
            invoke = this.$builderAction.invoke();
            if (invoke != null) {
            }
        }
    }
}
