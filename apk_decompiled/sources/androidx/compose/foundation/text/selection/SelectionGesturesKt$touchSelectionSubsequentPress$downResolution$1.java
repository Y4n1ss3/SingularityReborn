package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ii0;
import defpackage.ij0;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import defpackage.yi;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {195}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends ij0 implements my {
    final /* synthetic */ ii0 $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(long j, ii0 ii0Var, hm hmVar) {
        super(hmVar);
        this.$pointerId = j;
        this.$overSlop = ii0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(ii0 ii0Var, PointerInputChange pointerInputChange, Offset offset) {
        pointerInputChange.consume();
        ii0Var.d = offset.m4526unboximpl();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(this.$pointerId, this.$overSlop, hmVar);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.L$0 = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            long j = this.$pointerId;
            final ii0 ii0Var = this.$overSlop;
            my myVar = new my() { // from class: androidx.compose.foundation.text.selection.b
                @Override // defpackage.my
                public final Object invoke(Object obj2, Object obj3) {
                    w01 invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.invokeSuspend$lambda$0(ii0.this, (PointerInputChange) obj2, (Offset) obj3);
                    return invokeSuspend$lambda$0;
                }
            };
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            obj = DragGestureDetectorKt.m428awaitTouchSlopOrCancellationjO51t88(awaitPointerEventScope, j, myVar, this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
        }
        if (((PointerInputChange) obj) != null && (this.$overSlop.d & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            return DownResolution.Drag;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) yi.p0(awaitPointerEventScope.getCurrentEvent().getChanges());
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            return DownResolution.Cancel;
        }
        pointerInputChange.consume();
        return DownResolution.Up;
    }
}
