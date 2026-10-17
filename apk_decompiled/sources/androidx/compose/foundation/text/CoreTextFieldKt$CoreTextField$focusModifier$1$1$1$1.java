package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {350}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1 extends us0 implements my {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester;
    final /* synthetic */ TextLayoutResultProxy $layoutResult;
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ LegacyTextFieldState $state;
    final /* synthetic */ TextFieldValue $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, TextLayoutResultProxy textLayoutResultProxy, OffsetMapping offsetMapping, hm hmVar) {
        super(2, hmVar);
        this.$bringIntoViewRequester = bringIntoViewRequester;
        this.$value = textFieldValue;
        this.$state = legacyTextFieldState;
        this.$layoutResult = textLayoutResultProxy;
        this.$offsetMapping = offsetMapping;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            BringIntoViewRequester bringIntoViewRequester = this.$bringIntoViewRequester;
            TextFieldValue textFieldValue = this.$value;
            TextDelegate textDelegate = this.$state.getTextDelegate();
            TextLayoutResult value = this.$layoutResult.getValue();
            OffsetMapping offsetMapping = this.$offsetMapping;
            this.label = 1;
            Object bringSelectionEndIntoView = CoreTextFieldKt.bringSelectionEndIntoView(bringIntoViewRequester, textFieldValue, textDelegate, value, offsetMapping, this);
            vn vnVar = vn.d;
            if (bringSelectionEndIntoView == vnVar) {
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
