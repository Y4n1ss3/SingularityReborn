package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.internal.PlatformUtils_androidKt;
import androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$1;
import androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$2;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.MenuItemsAvailability;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import defpackage.f1;
import defpackage.f6;
import defpackage.gu0;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void TextFieldSelectionHandle(final boolean z, ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1344558920);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(resolvedTextDirection.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(textFieldSelectionManager) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1344558920, i2, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1356)");
            }
            int i3 = i2 & 14;
            boolean changed = (i3 == 4) | startRestartGroup.changed(textFieldSelectionManager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = textFieldSelectionManager.handleDragObserver$foundation(z);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionManager) | (i3 == 4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1
                    @Override // androidx.compose.foundation.text.selection.OffsetProvider
                    /* renamed from: provide-F1C5BW0 */
                    public final long mo1072provideF1C5BW0() {
                        return TextFieldSelectionManager.this.m1560getHandlePositiontuRUvjQ$foundation(z);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            OffsetProvider offsetProvider = (OffsetProvider) rememberedValue2;
            boolean m7059getReversedimpl = TextRange.m7059getReversedimpl(textFieldSelectionManager.getValue$foundation().m7310getSelectiond9O1mEE());
            float handleLineHeight$foundation = textFieldSelectionManager.getHandleLineHeight$foundation(z);
            Modifier.Companion companion = Modifier.Companion;
            boolean changedInstance2 = startRestartGroup.changedInstance(textDragObserver);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                        Object detectDownAndDragGesturesWithObserver = LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, TextDragObserver.this, hmVar);
                        return detectDownAndDragGesturesWithObserver == vn.d ? detectDownAndDragGesturesWithObserver : w01.a;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AndroidSelectionHandles_androidKt.m1478SelectionHandlewLIcFTc(offsetProvider, z, resolvedTextDirection, m7059getReversedimpl, 0L, handleLineHeight$foundation, SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (PointerInputEventHandler) rememberedValue3), startRestartGroup, (i2 << 3) & 1008, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f6(z, resolvedTextDirection, textFieldSelectionManager, i, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TextFieldSelectionHandle$lambda$3(boolean z, ResolvedTextDirection resolvedTextDirection, TextFieldSelectionManager textFieldSelectionManager, int i, Composer composer, int i2) {
        TextFieldSelectionHandle(z, resolvedTextDirection, textFieldSelectionManager, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1567calculateSelectionMagnifierCenterAndroidO0kMr_c(TextFieldSelectionManager textFieldSelectionManager, long j) {
        int m7060getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextDelegate textDelegate;
        AnnotatedString text;
        Offset m1558getCurrentDragPosition_m7T9E = textFieldSelectionManager.m1558getCurrentDragPosition_m7T9E();
        if (m1558getCurrentDragPosition_m7T9E == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        long m4526unboximpl = m1558getCurrentDragPosition_m7T9E.m4526unboximpl();
        AnnotatedString transformedText$foundation = textFieldSelectionManager.getTransformedText$foundation();
        if (transformedText$foundation == null || transformedText$foundation.length() == 0) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = textFieldSelectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        if (i == 1 || i == 2) {
            m7060getStartimpl = TextRange.m7060getStartimpl(textFieldSelectionManager.getValue$foundation().m7310getSelectiond9O1mEE());
        } else {
            if (i != 3) {
                o.n();
                return 0L;
            }
            m7060getStartimpl = TextRange.m7055getEndimpl(textFieldSelectionManager.getValue$foundation().m7310getSelectiond9O1mEE());
        }
        LegacyTextFieldState state$foundation = textFieldSelectionManager.getState$foundation();
        if (state$foundation == null || (layoutResult = state$foundation.getLayoutResult()) == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        LegacyTextFieldState state$foundation2 = textFieldSelectionManager.getState$foundation();
        if (state$foundation2 == null || (textDelegate = state$foundation2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        int h = y80.h(textFieldSelectionManager.getOffsetMapping$foundation().originalToTransformed(m7060getStartimpl), 0, text.length());
        float intBitsToFloat = Float.intBitsToFloat((int) (layoutResult.m1204translateDecorationToInnerCoordinatesMKHz9U$foundation(m4526unboximpl) >> 32));
        TextLayoutResult value = layoutResult.getValue();
        int lineForOffset = value.getLineForOffset(h);
        float lineLeft = value.getLineLeft(lineForOffset);
        float lineRight = value.getLineRight(lineForOffset);
        float g = y80.g(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m7780equalsimpl0(j, IntSize.Companion.m7787getZeroYbymL2g()) && Math.abs(intBitsToFloat - g) > ((int) (j >> 32)) / 2) {
            return Offset.Companion.m4531getUnspecifiedF1C5BW0();
        }
        float lineTop = value.getLineTop(lineForOffset);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(g) << 32) | (Float.floatToRawIntBits(((value.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop) & 4294967295L));
    }

    public static final ky contextMenuBuilder(TextFieldSelectionManager textFieldSelectionManager, ContextMenuState contextMenuState, State<MenuItemsAvailability> state) {
        return new f1(state, textFieldSelectionManager, contextMenuState, 23);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuBuilder$lambda$0(State state, TextFieldSelectionManager textFieldSelectionManager, ContextMenuState contextMenuState, ContextMenuScope contextMenuScope) {
        int m1155unboximpl = ((MenuItemsAvailability) state.getValue()).m1155unboximpl();
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, TextContextMenuItems.Cut, MenuItemsAvailability.m1150getCanCutimpl(m1155unboximpl), new gu0(textFieldSelectionManager, 0));
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, TextContextMenuItems.Copy, MenuItemsAvailability.m1149getCanCopyimpl(m1155unboximpl), new gu0(textFieldSelectionManager, 1));
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, TextContextMenuItems.Paste, MenuItemsAvailability.m1151getCanPasteimpl(m1155unboximpl), new gu0(textFieldSelectionManager, 2));
        contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, TextContextMenuItems.SelectAll, MenuItemsAvailability.m1152getCanSelectAllimpl(m1155unboximpl), new gu0(textFieldSelectionManager, 3));
        if (PlatformUtils_androidKt.isAutofillAvailable()) {
            contextMenuBuilder$lambda$0$textFieldItem(contextMenuScope, contextMenuState, TextContextMenuItems.Autofill, MenuItemsAvailability.m1148getCanAutofillimpl(m1155unboximpl), new gu0(textFieldSelectionManager, 4));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuBuilder$lambda$0$0(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.cut$foundation();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuBuilder$lambda$0$1(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.copy$foundation(false);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuBuilder$lambda$0$2(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.paste$foundation();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuBuilder$lambda$0$3(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.selectAll$foundation();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 contextMenuBuilder$lambda$0$4(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.autofill$foundation();
        return w01.a;
    }

    private static final void contextMenuBuilder$lambda$0$textFieldItem(ContextMenuScope contextMenuScope, ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z, iy iyVar) {
        if (z) {
            ContextMenuScope.item$default(contextMenuScope, new CommonContextMenuAreaKt$TextItem$1(textContextMenuItems), null, false, null, new CommonContextMenuAreaKt$TextItem$2(iyVar, contextMenuState), 14, null);
        }
    }

    public static final boolean isSelectionHandleInVisibleBoundDefault(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        LayoutCoordinates layoutCoordinates;
        Rect visibleBounds;
        LegacyTextFieldState state$foundation = textFieldSelectionManager.getState$foundation();
        if (state$foundation == null || (layoutCoordinates = state$foundation.getLayoutCoordinates()) == null || (visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return SelectionManagerKt.m1535containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m1560getHandlePositiontuRUvjQ$foundation(z));
    }
}
