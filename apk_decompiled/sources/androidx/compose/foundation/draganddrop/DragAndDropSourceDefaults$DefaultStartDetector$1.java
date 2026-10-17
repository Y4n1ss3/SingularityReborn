package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", f = "AndroidDragAndDropSource.android.kt", l = {UtilsKt.MUTABLE_BUFFER_SIZE}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends us0 implements my {
    private /* synthetic */ Object L$0;
    int label;

    public DragAndDropSourceDefaults$DefaultStartDetector$1(hm hmVar) {
        super(2, hmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, Offset offset) {
        dragAndDropStartDetectorScope.mo359requestDragAndDropTransferk4lQ0M(offset.m4526unboximpl());
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(hmVar);
        dragAndDropSourceDefaults$DefaultStartDetector$1.L$0 = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    @Override // defpackage.my
    public final Object invoke(DragAndDropStartDetectorScope dragAndDropStartDetectorScope, hm hmVar) {
        return ((DragAndDropSourceDefaults$DefaultStartDetector$1) create(dragAndDropStartDetectorScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            DragAndDropStartDetectorScope dragAndDropStartDetectorScope = (DragAndDropStartDetectorScope) this.L$0;
            a aVar = new a(dragAndDropStartDetectorScope, 0);
            this.label = 1;
            Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(dragAndDropStartDetectorScope, null, aVar, null, null, this, 13, null);
            vn vnVar = vn.d;
            if (detectTapGestures$default == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
