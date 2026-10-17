package androidx.compose.foundation.text.input.internal.selection;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1", f = "TextFieldSelectionState.android.kt", l = {78}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1 extends us0 implements ky {
    final /* synthetic */ TextFieldSelectionState $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(TextFieldSelectionState textFieldSelectionState, hm hmVar) {
        super(1, hmVar);
        this.$this_with = textFieldSelectionState;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(this.$this_with, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            TextFieldSelectionState textFieldSelectionState = this.$this_with;
            this.label = 1;
            Object cut = textFieldSelectionState.cut(this);
            vn vnVar = vn.d;
            if (cut == vnVar) {
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
