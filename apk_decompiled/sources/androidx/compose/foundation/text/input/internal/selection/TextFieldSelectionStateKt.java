package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuStateKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.PlatformUtils_androidKt;
import androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$1;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.f1;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.sn0;
import defpackage.vn;
import defpackage.w01;
import defpackage.x4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldSelectionStateKt {
    private static final boolean DEBUG = false;
    private static final String DEBUG_TAG = "TextFieldSelectionState";

    public static final ky contextMenuBuilder(TextFieldSelectionState textFieldSelectionState, ContextMenuState contextMenuState, State<MenuItemsAvailability> state, my myVar) {
        return new x4(state, contextMenuState, myVar, textFieldSelectionState, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuBuilder$lambda$0(State state, ContextMenuState contextMenuState, my myVar, TextFieldSelectionState textFieldSelectionState, ContextMenuScope contextMenuScope) {
        int m1155unboximpl = ((MenuItemsAvailability) state.getValue()).m1155unboximpl();
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, myVar, textFieldSelectionState, TextContextMenuItems.Cut, MenuItemsAvailability.m1150getCanCutimpl(m1155unboximpl));
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, myVar, textFieldSelectionState, TextContextMenuItems.Copy, MenuItemsAvailability.m1149getCanCopyimpl(m1155unboximpl));
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, myVar, textFieldSelectionState, TextContextMenuItems.Paste, MenuItemsAvailability.m1151getCanPasteimpl(m1155unboximpl));
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, myVar, textFieldSelectionState, TextContextMenuItems.SelectAll, MenuItemsAvailability.m1152getCanSelectAllimpl(m1155unboximpl));
        if (PlatformUtils_androidKt.isAutofillAvailable()) {
            contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, myVar, textFieldSelectionState, TextContextMenuItems.Autofill, MenuItemsAvailability.m1148getCanAutofillimpl(m1155unboximpl));
        }
        return w01.a;
    }

    private static final void contextMenuBuilder$lambda$0$textFieldItem(ContextMenuScope contextMenuScope, final ContextMenuState contextMenuState, final my myVar, final TextFieldSelectionState textFieldSelectionState, final TextContextMenuItems textContextMenuItems, boolean z) {
        if (z) {
            ContextMenuScope.item$default(contextMenuScope, new CommonContextMenuAreaKt$TextItem$1(textContextMenuItems), null, false, null, new iy() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$contextMenuBuilder$lambda$0$textFieldItem$$inlined$TextItem$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m1418invoke() {
                    myVar.invoke(textFieldSelectionState, textContextMenuItems);
                    ContextMenuStateKt.close(ContextMenuState.this);
                }

                @Override // defpackage.iy
                public /* bridge */ /* synthetic */ Object invoke() {
                    m1418invoke();
                    return w01.a;
                }
            }, 14, null);
        }
    }

    public static final Object defaultDetectTextFieldTapGestures(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, iy iyVar, iy iyVar2, hm hmVar) {
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new TextFieldSelectionStateKt$defaultDetectTextFieldTapGestures$2(mutableInteractionSource, textFieldSelectionState, null), new f1(iyVar, (Object) textFieldSelectionState, (Object) iyVar2, 26), hmVar);
        return detectTapAndPress == vn.d ? detectTapAndPress : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 defaultDetectTextFieldTapGestures$lambda$0(iy iyVar, TextFieldSelectionState textFieldSelectionState, iy iyVar2, Offset offset) {
        logDebug(new sn0(9));
        iyVar.invoke();
        if (textFieldSelectionState.getEnabled() && textFieldSelectionState.isFocused()) {
            if (!textFieldSelectionState.getReadOnly()) {
                iyVar2.invoke();
                if (textFieldSelectionState.getTextFieldState$foundation().getVisualText().length() > 0) {
                    textFieldSelectionState.setShowCursorHandle(true);
                }
            }
            textFieldSelectionState.updateTextToolbarState(TextToolbarState.None);
            textFieldSelectionState.m1408placeCursorAtNearestOffsetk4lQ0M(TextLayoutStateKt.m1354fromDecorationToTextLayoutUv8p0NA(textFieldSelectionState.getTextLayoutState$foundation(), textFieldSelectionState.getTextLayoutState$foundation().m1347coercedInVisibleBoundsOfInputTextMKHz9U$foundation(offset.m4526unboximpl())));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String defaultDetectTextFieldTapGestures$lambda$0$0() {
        return "onTapTextField";
    }

    public static final Object defaultTextFieldSelectionGestures(PointerInputScope pointerInputScope, MouseSelectionObserver mouseSelectionObserver, TextDragObserver textDragObserver, hm hmVar) {
        Object awaitSelectionGestures = SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, mouseSelectionObserver, textDragObserver, hmVar);
        return awaitSelectionGestures == vn.d ? awaitSelectionGestures : w01.a;
    }

    public static final iy menuItem(final TextFieldSelectionState textFieldSelectionState, boolean z, final TextToolbarState textToolbarState, final iy iyVar) {
        if (z) {
            return new iy() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt$menuItem$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m1420invoke() {
                    iy.this.invoke();
                    textFieldSelectionState.updateTextToolbarState(textToolbarState);
                }

                @Override // defpackage.iy
                public /* bridge */ /* synthetic */ Object invoke() {
                    m1420invoke();
                    return w01.a;
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reverse-5zc-tL8, reason: not valid java name */
    public static final long m1417reverse5zctL8(long j) {
        return TextRangeKt.TextRange(TextRange.m7055getEndimpl(j), TextRange.m7060getStartimpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDebug(iy iyVar) {
    }
}
