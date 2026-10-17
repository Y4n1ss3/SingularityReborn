package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", f = "SelectionGestures.kt", l = {111, 119, 122, 124}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SelectionGesturesKt$awaitSelectionGestures$2 extends ij0 implements my {
    final /* synthetic */ ClicksCounter $clicksCounter;
    final /* synthetic */ MouseSelectionObserver $mouseSelectionObserver;
    final /* synthetic */ TextDragObserver $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$awaitSelectionGestures$2(ClicksCounter clicksCounter, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, hm hmVar) {
        super(hmVar);
        this.$clicksCounter = clicksCounter;
        this.$mouseSelectionObserver = mouseSelectionObserver;
        this.$textDragObserver = textDragObserver;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SelectionGesturesKt$awaitSelectionGestures$2 selectionGesturesKt$awaitSelectionGestures$2 = new SelectionGesturesKt$awaitSelectionGestures$2(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, hmVar);
        selectionGesturesKt$awaitSelectionGestures$2.L$0 = obj;
        return selectionGesturesKt$awaitSelectionGestures$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((SelectionGesturesKt$awaitSelectionGestures$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(r0, r1, r2, r13, r12) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a2, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelectionFirstPress(r0, r7, r13, r12) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r12 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0037, code lost:
    
        if (r13 == r6) goto L37;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        Object obj2;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            obj = SelectionGesturesKt.awaitDown(awaitPointerEventScope, this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
        }
        PointerEvent pointerEvent = (PointerEvent) obj;
        this.$clicksCounter.update(pointerEvent);
        boolean isMouseOrTouchPad = SelectionGestures_androidKt.isMouseOrTouchPad(pointerEvent);
        if (isMouseOrTouchPad && PointerEvent_androidKt.m6071isPrimaryPressedaHzCxE(pointerEvent.m6032getButtonsry648PA())) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!changes.get(i2).isConsumed()) {
                }
            }
            MouseSelectionObserver mouseSelectionObserver = this.$mouseSelectionObserver;
            ClicksCounter clicksCounter = this.$clicksCounter;
            this.L$0 = null;
            this.label = 2;
        }
        if (!isMouseOrTouchPad) {
            int clicks = this.$clicksCounter.getClicks();
            TextDragObserver textDragObserver = this.$textDragObserver;
            if (clicks == 1) {
                this.L$0 = null;
                this.label = 3;
            } else {
                int clicks2 = this.$clicksCounter.getClicks();
                this.L$0 = null;
                this.label = 4;
                obj2 = SelectionGesturesKt.touchSelectionSubsequentPress(awaitPointerEventScope, textDragObserver, pointerEvent, clicks2, this);
            }
        }
        return w01.a;
    }
}
