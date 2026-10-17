package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import androidx.compose.ui.text.TextRange;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$maybeSuggestSelectionRange$1", f = "TextFieldSelectionState.kt", l = {1095}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionState$maybeSuggestSelectionRange$1 extends us0 implements my {
    final /* synthetic */ PlatformSelectionBehaviors $platformSelectionBehaviors;
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$maybeSuggestSelectionRange$1(PlatformSelectionBehaviors platformSelectionBehaviors, CharSequence charSequence, long j, TextFieldSelectionState textFieldSelectionState, hm hmVar) {
        super(2, hmVar);
        this.$platformSelectionBehaviors = platformSelectionBehaviors;
        this.$text = charSequence;
        this.$selection = j;
        this.this$0 = textFieldSelectionState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new TextFieldSelectionState$maybeSuggestSelectionRange$1(this.$platformSelectionBehaviors, this.$text, this.$selection, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldSelectionState$maybeSuggestSelectionRange$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            PlatformSelectionBehaviors platformSelectionBehaviors = this.$platformSelectionBehaviors;
            CharSequence charSequence = this.$text;
            long j = this.$selection;
            this.label = 1;
            obj = platformSelectionBehaviors.mo1491suggestSelectionForLongPressOrDoubleClickpYaCww(charSequence, j, this);
            vn vnVar = vn.d;
            if (obj == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        TextRange textRange = (TextRange) obj;
        if (!this.this$0.isPassword && textRange != null && q10.b(this.this$0.getTextFieldState$foundation().getVisualText().getText(), this.$text) && TextRange.m7053equalsimpl0(this.this$0.getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE(), this.$selection)) {
            if (!TextRange.m7053equalsimpl0(textRange.m7064unboximpl(), this.this$0.getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE())) {
                this.this$0.getTextFieldState$foundation().m1366selectCharsIn5zctL8(textRange.m7064unboximpl());
            }
        }
        return w01.a;
    }
}
