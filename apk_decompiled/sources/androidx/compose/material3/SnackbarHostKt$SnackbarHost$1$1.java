package androidx.compose.material3;

import androidx.compose.ui.platform.AccessibilityManager;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {231}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnackbarHostKt$SnackbarHost$1$1 extends us0 implements my {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ SnackbarData $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, hm hmVar) {
        super(2, hmVar);
        this.$currentSnackbarData = snackbarData;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.$currentSnackbarData, this.$accessibilityManager, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SnackbarHostKt$SnackbarHost$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            SnackbarData snackbarData = this.$currentSnackbarData;
            if (snackbarData != null) {
                long millis = SnackbarHostKt.toMillis(snackbarData.getVisuals().getDuration(), this.$currentSnackbarData.getVisuals().getActionLabel() != null, this.$accessibilityManager);
                this.label = 1;
                Object p = y80.p(millis, this);
                vn vnVar = vn.d;
                if (p == vnVar) {
                    return vnVar;
                }
            }
            return w01.a;
        }
        if (i != 1) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        this.$currentSnackbarData.dismiss();
        return w01.a;
    }
}
