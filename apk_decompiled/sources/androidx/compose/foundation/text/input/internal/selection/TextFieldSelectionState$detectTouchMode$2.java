package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2", f = "TextFieldSelectionState.kt", l = {566}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectTouchMode$2 extends ij0 implements my {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectTouchMode$2(TextFieldSelectionState textFieldSelectionState, hm hmVar) {
        super(hmVar);
        this.this$0 = textFieldSelectionState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TextFieldSelectionState$detectTouchMode$2 textFieldSelectionState$detectTouchMode$2 = new TextFieldSelectionState$detectTouchMode$2(this.this$0, hmVar);
        textFieldSelectionState$detectTouchMode$2.L$0 = obj;
        return textFieldSelectionState$detectTouchMode$2;
    }

    @Override // defpackage.my
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
        return ((TextFieldSelectionState$detectTouchMode$2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002a -> B:5:0x002d). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L16
            if (r0 != r1) goto Lf
            java.lang.Object r0 = r3.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
            defpackage.p10.Q(r4)
            goto L2d
        Lf:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.o.f(r3)
            r3 = 0
            return r3
        L16:
            defpackage.p10.Q(r4)
            java.lang.Object r4 = r3.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
            r0 = r4
        L1e:
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            r3.L$0 = r0
            r3.label = r1
            java.lang.Object r4 = r0.awaitPointerEvent(r4, r3)
            vn r2 = defpackage.vn.d
            if (r4 != r2) goto L2d
            return r2
        L2d:
            androidx.compose.ui.input.pointer.PointerEvent r4 = (androidx.compose.ui.input.pointer.PointerEvent) r4
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = r3.this$0
            boolean r4 = androidx.compose.foundation.text.selection.SelectionGestures_androidKt.isMouseOrTouchPad(r4)
            r4 = r4 ^ r1
            r2.setInTouchMode(r4)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTouchMode$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
