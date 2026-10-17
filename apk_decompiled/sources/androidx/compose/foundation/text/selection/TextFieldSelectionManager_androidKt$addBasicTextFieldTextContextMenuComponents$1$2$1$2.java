package androidx.compose.foundation.text.selection;

import defpackage.bq;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2", f = "TextFieldSelectionManager.android.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2 extends us0 implements ky {
    final /* synthetic */ TextFieldSelectionManager $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        super(1, hmVar);
        this.$this_with = textFieldSelectionManager;
    }

    @Override // defpackage.mc
    public final hm create(hm hmVar) {
        return new TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2(this.$this_with, hmVar);
    }

    @Override // defpackage.ky
    public final Object invoke(hm hmVar) {
        return ((TextFieldSelectionManager_androidKt$addBasicTextFieldTextContextMenuComponents$1$2$1$2) create(hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        TextFieldSelectionManager textFieldSelectionManager = this.$this_with;
        textFieldSelectionManager.copy$foundation(textFieldSelectionManager.getTextToolbarShown$foundation());
        return w01.a;
    }
}
