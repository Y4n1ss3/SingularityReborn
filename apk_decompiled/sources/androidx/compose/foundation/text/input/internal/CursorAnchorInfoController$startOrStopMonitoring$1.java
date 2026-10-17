package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.SnapshotStateKt;
import defpackage.bq;
import defpackage.fx;
import defpackage.hi0;
import defpackage.hm;
import defpackage.iw;
import defpackage.jw;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.rw;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", f = "CursorAnchorInfoController.android.kt", l = {154}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class CursorAnchorInfoController$startOrStopMonitoring$1 extends us0 implements my {
    int label;
    final /* synthetic */ CursorAnchorInfoController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnchorInfoController$startOrStopMonitoring$1(CursorAnchorInfoController cursorAnchorInfoController, hm hmVar) {
        super(2, hmVar);
        this.this$0 = cursorAnchorInfoController;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new CursorAnchorInfoController$startOrStopMonitoring$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((CursorAnchorInfoController$startOrStopMonitoring$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        w01 w01Var = w01.a;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                p10.Q(obj);
                return w01Var;
            }
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        iw snapshotFlow = SnapshotStateKt.snapshotFlow(new c(this.this$0, i2));
        final CursorAnchorInfoController cursorAnchorInfoController = this.this$0;
        jw jwVar = new jw() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1.2
            @Override // defpackage.jw
            public final Object emit(CursorAnchorInfo cursorAnchorInfo, hm hmVar) {
                ComposeInputMethodManager composeInputMethodManager;
                composeInputMethodManager = CursorAnchorInfoController.this.composeImm;
                composeInputMethodManager.updateCursorAnchorInfo(cursorAnchorInfo);
                return w01.a;
            }
        };
        this.label = 1;
        Object collect = snapshotFlow.collect(new rw(0, new hi0(), new fx(jwVar)), this);
        vn vnVar = vn.d;
        if (collect != vnVar) {
            collect = w01Var;
        }
        if (collect != vnVar) {
            collect = w01Var;
        }
        return collect == vnVar ? vnVar : w01Var;
    }
}
