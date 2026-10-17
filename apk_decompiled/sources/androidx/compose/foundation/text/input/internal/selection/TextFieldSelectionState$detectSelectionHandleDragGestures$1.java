package androidx.compose.foundation.text.input.internal.selection;

import defpackage.bq;
import defpackage.hm;
import defpackage.im;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", l = {1137}, m = "detectSelectionHandleDragGestures", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectSelectionHandleDragGestures$1 extends im {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectSelectionHandleDragGestures$1(TextFieldSelectionState textFieldSelectionState, hm hmVar) {
        super(hmVar);
        this.this$0 = textFieldSelectionState;
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object detectSelectionHandleDragGestures;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        detectSelectionHandleDragGestures = this.this$0.detectSelectionHandleDragGestures(null, false, this);
        return detectSelectionHandleDragGestures;
    }
}
