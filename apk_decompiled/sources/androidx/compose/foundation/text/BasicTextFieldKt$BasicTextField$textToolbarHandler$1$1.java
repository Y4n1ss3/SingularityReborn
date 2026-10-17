package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import defpackage.hm;
import defpackage.iy;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1 implements TextToolbarHandler {
    final /* synthetic */ un $coroutineScope;
    final /* synthetic */ TextToolbar $currentTextToolbar;

    public BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1(TextToolbar textToolbar, un unVar) {
        this.$currentTextToolbar = textToolbar;
        this.$coroutineScope = unVar;
    }

    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    public void hideTextToolbar() {
        if (this.$currentTextToolbar.getStatus() == TextToolbarStatus.Shown) {
            this.$currentTextToolbar.hide();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object showTextToolbar(final TextFieldSelectionState textFieldSelectionState, Rect rect, hm hmVar) {
        BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;
        int i;
        final un unVar;
        Rect rect2;
        TextToolbar textToolbar;
        if (hmVar instanceof BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) {
            basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 = (BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1) hmVar;
            int i2 = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.result;
                i = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    TextToolbar textToolbar2 = this.$currentTextToolbar;
                    unVar = this.$coroutineScope;
                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.L$0 = rect;
                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.L$1 = textToolbar2;
                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.L$2 = unVar;
                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.L$3 = textFieldSelectionState;
                    basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.label = 1;
                    Object updateClipboardEntry = textFieldSelectionState.updateClipboardEntry(basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1);
                    vn vnVar = vn.d;
                    if (updateClipboardEntry == vnVar) {
                        return vnVar;
                    }
                    rect2 = rect;
                    textToolbar = textToolbar2;
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    textFieldSelectionState = (TextFieldSelectionState) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.L$3;
                    unVar = (un) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.L$2;
                    TextToolbar textToolbar3 = (TextToolbar) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.L$1;
                    Rect rect3 = (Rect) basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.L$0;
                    p10.Q(obj);
                    textToolbar = textToolbar3;
                    rect2 = rect3;
                }
                boolean canShowCopyMenuItem = textFieldSelectionState.canShowCopyMenuItem();
                final TextToolbarState textToolbarState = TextToolbarState.None;
                iy iyVar = canShowCopyMenuItem ? null : new iy() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m1067invoke() {
                        p01.t(unVar, null, xn.g, new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$1$1(textFieldSelectionState, null), 1);
                        TextFieldSelectionState.this.updateTextToolbarState(textToolbarState);
                    }

                    @Override // defpackage.iy
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1067invoke();
                        return w01.a;
                    }
                };
                iy iyVar2 = textFieldSelectionState.canShowPasteMenuItem() ? null : new iy() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$2
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m1068invoke() {
                        p01.t(unVar, null, xn.g, new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$2$1(textFieldSelectionState, null), 1);
                        TextFieldSelectionState.this.updateTextToolbarState(textToolbarState);
                    }

                    @Override // defpackage.iy
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1068invoke();
                        return w01.a;
                    }
                };
                iy iyVar3 = textFieldSelectionState.canShowCutMenuItem() ? null : new iy() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$3
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m1069invoke() {
                        p01.t(unVar, null, xn.g, new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$2$3$1(textFieldSelectionState, null), 1);
                        TextFieldSelectionState.this.updateTextToolbarState(textToolbarState);
                    }

                    @Override // defpackage.iy
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1069invoke();
                        return w01.a;
                    }
                };
                boolean canShowSelectAllMenuItem = textFieldSelectionState.canShowSelectAllMenuItem();
                final TextToolbarState textToolbarState2 = TextToolbarState.Selection;
                textToolbar.showMenu(rect2, iyVar, iyVar2, iyVar3, canShowSelectAllMenuItem ? null : new iy() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$4
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m1070invoke() {
                        textFieldSelectionState.selectAll();
                        TextFieldSelectionState.this.updateTextToolbarState(textToolbarState2);
                    }

                    @Override // defpackage.iy
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1070invoke();
                        return w01.a;
                    }
                }, textFieldSelectionState.canShowAutofillMenuItem() ? new iy() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$5
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m1071invoke() {
                        textFieldSelectionState.autofill();
                        TextFieldSelectionState.this.updateTextToolbarState(textToolbarState);
                    }

                    @Override // defpackage.iy
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1071invoke();
                        return w01.a;
                    }
                } : null);
                return w01.a;
            }
        }
        basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1 = new BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1(this, hmVar);
        Object obj2 = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.result;
        i = basicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1.label;
        if (i != 0) {
        }
        boolean canShowCopyMenuItem2 = textFieldSelectionState.canShowCopyMenuItem();
        final TextToolbarState textToolbarState3 = TextToolbarState.None;
        if (canShowCopyMenuItem2) {
        }
        if (textFieldSelectionState.canShowPasteMenuItem()) {
        }
        if (textFieldSelectionState.canShowCutMenuItem()) {
        }
        boolean canShowSelectAllMenuItem2 = textFieldSelectionState.canShowSelectAllMenuItem();
        final TextToolbarState textToolbarState22 = TextToolbarState.Selection;
        textToolbar.showMenu(rect2, iyVar, iyVar2, iyVar3, canShowSelectAllMenuItem2 ? null : new iy() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$4
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m1070invoke() {
                textFieldSelectionState.selectAll();
                TextFieldSelectionState.this.updateTextToolbarState(textToolbarState22);
            }

            @Override // defpackage.iy
            public /* bridge */ /* synthetic */ Object invoke() {
                m1070invoke();
                return w01.a;
            }
        }, textFieldSelectionState.canShowAutofillMenuItem() ? new iy() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$lambda$0$$inlined$menuItem$5
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m1071invoke() {
                textFieldSelectionState.autofill();
                TextFieldSelectionState.this.updateTextToolbarState(textToolbarState3);
            }

            @Override // defpackage.iy
            public /* bridge */ /* synthetic */ Object invoke() {
                m1071invoke();
                return w01.a;
            }
        } : null);
        return w01.a;
    }
}
