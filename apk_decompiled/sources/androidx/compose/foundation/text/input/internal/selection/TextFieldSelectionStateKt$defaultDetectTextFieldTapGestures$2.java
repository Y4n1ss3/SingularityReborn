package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.hm;
import defpackage.ny;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2", f = "TextFieldSelectionState.kt", l = {1795}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 extends us0 implements ny {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TextFieldSelectionState $this_defaultDetectTextFieldTapGestures;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(MutableInteractionSource mutableInteractionSource, TextFieldSelectionState textFieldSelectionState, hm hmVar) {
        super(3, hmVar);
        this.$interactionSource = mutableInteractionSource;
        this.$this_defaultDetectTextFieldTapGestures = textFieldSelectionState;
    }

    @Override // defpackage.ny
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m1419invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m4526unboximpl(), (hm) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m1419invoked4ec7I(PressGestureScope pressGestureScope, long j, hm hmVar) {
        TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2 = new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(this.$interactionSource, this.$this_defaultDetectTextFieldTapGestures, hmVar);
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.L$0 = pressGestureScope;
        textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.J$0 = j;
        return textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2.invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
            long j = this.J$0;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            if (mutableInteractionSource != null) {
                TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1 = new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1(pressGestureScope, this.$this_defaultDetectTextFieldTapGestures, j, mutableInteractionSource, null);
                this.label = 1;
                Object n = p10.n(textFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2$1$1, this);
                vn vnVar = vn.d;
                if (n == vnVar) {
                    return vnVar;
                }
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
