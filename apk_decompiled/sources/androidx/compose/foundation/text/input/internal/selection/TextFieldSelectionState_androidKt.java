package androidx.compose.foundation.text.input.internal.selection;

import android.content.Context;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifier_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextRange;
import defpackage.f1;
import defpackage.gd;
import defpackage.hm;
import defpackage.hu0;
import defpackage.iy;
import defpackage.ky;
import defpackage.p01;
import defpackage.r4;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.x4;
import defpackage.xn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldSelectionState_androidKt {
    public static final Modifier addBasicTextFieldTextContextMenuComponents(Modifier modifier, TextFieldSelectionState textFieldSelectionState, un unVar) {
        return TextContextMenuModifier_androidKt.addTextContextMenuComponentsWithContext(modifier, new r4(12, textFieldSelectionState, unVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0(TextFieldSelectionState textFieldSelectionState, un unVar, TextContextMenuBuilderScope textContextMenuBuilderScope, Context context) {
        PlatformSelectionBehaviors_androidKt.m1499addPlatformTextContextMenuItems71BSaZU(textContextMenuBuilderScope, context, textFieldSelectionState.getEditable$foundation(), textFieldSelectionState.getTextFieldState$foundation().getVisualText().getText(), TextRange.m7048boximpl(textFieldSelectionState.getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE()), textFieldSelectionState.getPlatformSelectionBehaviors$foundation(), new f1(textFieldSelectionState, unVar, context, 27));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0$2(TextFieldSelectionState textFieldSelectionState, un unVar, Context context, TextContextMenuBuilderScope textContextMenuBuilderScope) {
        textContextMenuBuilderScope.separator();
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(textContextMenuBuilderScope, unVar, context, textFieldSelectionState, TextContextMenuItems.Cut, textFieldSelectionState.canShowCutMenuItem(), new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$1(textFieldSelectionState, null));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(textContextMenuBuilderScope, unVar, context, textFieldSelectionState, TextContextMenuItems.Copy, textFieldSelectionState.canShowCopyMenuItem(), new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$2(textFieldSelectionState, null));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(textContextMenuBuilderScope, unVar, context, textFieldSelectionState, TextContextMenuItems.Paste, textFieldSelectionState.canShowPasteMenuItem(), new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$1$1$3(textFieldSelectionState, null));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem(textContextMenuBuilderScope, context, textFieldSelectionState, TextContextMenuItems.SelectAll, textFieldSelectionState.canShowSelectAllMenuItem(), TextToolbarState.Selection, new gd(textFieldSelectionState, 6), new gd(textFieldSelectionState, 7));
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$default(textContextMenuBuilderScope, context, textFieldSelectionState, TextContextMenuItems.Autofill, textFieldSelectionState.canShowAutofillMenuItem(), null, null, new gd(textFieldSelectionState, 8), 48, null);
        textContextMenuBuilderScope.separator();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$0(TextFieldSelectionState textFieldSelectionState) {
        return !textFieldSelectionState.getTextToolbarShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$1(TextFieldSelectionState textFieldSelectionState) {
        textFieldSelectionState.selectAll();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0$2$0$2(TextFieldSelectionState textFieldSelectionState) {
        textFieldSelectionState.autofill();
        return w01.a;
    }

    private static final void addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, TextFieldSelectionState textFieldSelectionState, TextContextMenuItems textContextMenuItems, boolean z, TextToolbarState textToolbarState, iy iyVar, iy iyVar2) {
        ContextMenu_androidKt.textItem(textContextMenuBuilderScope, context.getResources(), textContextMenuItems, z, new x4(iyVar2, iyVar, textFieldSelectionState, textToolbarState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$0(iy iyVar, iy iyVar2, TextFieldSelectionState textFieldSelectionState, TextToolbarState textToolbarState, TextContextMenuSession textContextMenuSession) {
        iyVar.invoke();
        if (iyVar2 != null ? ((Boolean) iyVar2.invoke()).booleanValue() : true) {
            textContextMenuSession.close();
        }
        textFieldSelectionState.updateTextToolbarState(textToolbarState);
        return w01.a;
    }

    public static /* synthetic */ void addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$default(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, TextFieldSelectionState textFieldSelectionState, TextContextMenuItems textContextMenuItems, boolean z, TextToolbarState textToolbarState, iy iyVar, iy iyVar2, int i, Object obj) {
        if ((i & 16) != 0) {
            textToolbarState = TextToolbarState.None;
        }
        TextToolbarState textToolbarState2 = textToolbarState;
        if ((i & 32) != 0) {
            iyVar = null;
        }
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem(textContextMenuBuilderScope, context, textFieldSelectionState, textContextMenuItems, z, textToolbarState2, iyVar, iyVar2);
    }

    private static final void addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem(TextContextMenuBuilderScope textContextMenuBuilderScope, un unVar, Context context, TextFieldSelectionState textFieldSelectionState, TextContextMenuItems textContextMenuItems, boolean z, ky kyVar) {
        addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldItem$default(textContextMenuBuilderScope, context, textFieldSelectionState, textContextMenuItems, z, null, null, new hu0(unVar, kyVar, 1), 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addBasicTextFieldTextContextMenuComponents$lambda$0$textFieldSuspendItem$1(un unVar, ky kyVar) {
        p01.t(unVar, null, xn.g, new TextFieldSelectionState_androidKt$addBasicTextFieldTextContextMenuComponents$1$textFieldSuspendItem$1$1(kyVar, null), 1);
        return w01.a;
    }

    public static final Object detectTextFieldTapGestures(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, iy iyVar, iy iyVar2, hm hmVar) {
        Object defaultDetectTextFieldTapGestures = TextFieldSelectionStateKt.defaultDetectTextFieldTapGestures(textFieldSelectionState, pointerInputScope, mutableInteractionSource, iyVar, iyVar2, hmVar);
        return defaultDetectTextFieldTapGestures == vn.d ? defaultDetectTextFieldTapGestures : w01.a;
    }

    public static final Object textFieldSelectionGestures(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, hm hmVar) {
        Object defaultTextFieldSelectionGestures = TextFieldSelectionStateKt.defaultTextFieldSelectionGestures(pointerInputScope, mouseSelectionObserver, textDragObserver, hmVar);
        return defaultTextFieldSelectionGestures == vn.d ? defaultTextFieldSelectionGestures : w01.a;
    }
}
