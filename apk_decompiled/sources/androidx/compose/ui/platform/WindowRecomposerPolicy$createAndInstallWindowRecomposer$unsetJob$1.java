package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {223}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends us0 implements my {
    final /* synthetic */ Recomposer $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(Recomposer recomposer, View view, hm hmVar) {
        super(2, hmVar);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.$newRecomposer, this.$rootView, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        View view;
        int i = this.label;
        try {
            if (i == 0) {
                p10.Q(obj);
                Recomposer recomposer = this.$newRecomposer;
                this.label = 1;
                Object join = recomposer.join(this);
                vn vnVar = vn.d;
                if (join == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            if (WindowRecomposer_androidKt.getCompositionContext(view) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
            return w01.a;
        } finally {
            if (WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
        }
    }
}
