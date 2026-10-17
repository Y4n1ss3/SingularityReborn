package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1;
import androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.hm;
import defpackage.i3;
import defpackage.iy;
import defpackage.kn0;
import defpackage.ky;
import defpackage.l6;
import defpackage.ln0;
import defpackage.mn0;
import defpackage.ms;
import defpackage.my;
import defpackage.p01;
import defpackage.r4;
import defpackage.rc;
import defpackage.st;
import defpackage.te0;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;
import defpackage.y80;
import defpackage.yl;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionContainerKt {
    public static final void DisableSelection(my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1162635549);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 3;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162635549, i2, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:73)");
            }
            CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null), myVar, startRestartGroup, ((i2 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new rc(i, i3, myVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DisableSelection$lambda$0(my myVar, int i, Composer composer, int i2) {
        DisableSelection(myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final void SelectionContainer(Modifier modifier, Selection selection, ky kyVar, my myVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-917932944);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(selection) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i5 = 0;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917932944, i3, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:93)");
            }
            Object[] objArr = new Object[0];
            Saver<SelectionRegistrarImpl, Long> saver = SelectionRegistrarImpl.Companion.getSaver();
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new ms(29);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, startRestartGroup, 384);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new SelectionManager(selectionRegistrarImpl);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SelectionManager selectionManager = (SelectionManager) rememberedValue2;
            Clipboard clipboard = (Clipboard) startRestartGroup.consume(CompositionLocalsKt.getLocalClipboard());
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            un unVar = (un) rememberedValue3;
            selectionManager.setHapticFeedBack((HapticFeedback) startRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            boolean changed = startRestartGroup.changed(unVar) | startRestartGroup.changed(clipboard);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = ClipboardUtils_androidKt.isWriteSupported(clipboard) ? new te0(6, unVar, clipboard) : null;
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            selectionManager.setOnCopyHandler((ky) rememberedValue4);
            selectionManager.setTextToolbar((TextToolbar) startRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            selectionManager.setOnSelectionChange(kyVar);
            selectionManager.setSelection(selection);
            if (ComposeFoundationFlags.isSmartSelectionEnabled) {
                startRestartGroup.startReplaceGroup(-82280708);
                selectionManager.setPlatformSelectionBehaviors$foundation(PlatformSelectionBehaviors_androidKt.rememberPlatformSelectionBehaviors(SelectedTextType.StaticText, null, startRestartGroup, 54));
                selectionManager.setCoroutineScope$foundation(unVar);
            } else {
                startRestartGroup.startReplaceGroup(-86967598);
            }
            startRestartGroup.endReplaceGroup();
            selectionManager.isNonEmptySelection$foundation();
            ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1 clipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1 = ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1.INSTANCE;
            ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3 clipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3 = ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3.INSTANCE;
            SimpleLayoutKt.SimpleLayout(modifier3.then(selectionManager.getModifier()), ComposableLambdaKt.rememberComposableLambda(-1799563674, true, new ln0(selectionManager, selectionRegistrarImpl, myVar), startRestartGroup, 54), startRestartGroup, 48, 0);
            boolean changedInstance = startRestartGroup.changedInstance(selectionManager);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = new mn0(selectionManager, i5);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            EffectsKt.DisposableEffect(selectionManager, (ky) rememberedValue5, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new yl(modifier3, selection, kyVar, myVar, i, i2));
        }
    }

    private static final Selection SelectionContainer$lambda$1(MutableState<Selection> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SelectionContainer$lambda$10$0(final SelectionManager selectionManager, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$lambda$10$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SelectionManager.this.onRelease();
                SelectionManager.this.setHasFocus(false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionContainer$lambda$11(Modifier modifier, Selection selection, ky kyVar, my myVar, int i, int i2, Composer composer, int i3) {
        SelectionContainer(modifier, selection, kyVar, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionContainer$lambda$3$0(MutableState mutableState, Selection selection) {
        mutableState.setValue(selection);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionContainer$lambda$4(Modifier modifier, my myVar, int i, int i2, Composer composer, int i3) {
        SelectionContainer(modifier, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectionRegistrarImpl SelectionContainer$lambda$5$0() {
        return new SelectionRegistrarImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionContainer$lambda$7$0(un unVar, Clipboard clipboard, AnnotatedString annotatedString) {
        p01.t(unVar, null, xn.g, new SelectionContainerKt$SelectionContainer$3$1$1(clipboard, annotatedString, null), 1);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionContainer$lambda$9(SelectionManager selectionManager, SelectionRegistrarImpl selectionRegistrarImpl, my myVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1799563674, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:135)");
            }
            ContextMenu_androidKt.ContextMenuArea(selectionManager, ComposableLambdaKt.rememberComposableLambda(-284825865, true, new ln0(selectionRegistrarImpl, myVar, selectionManager), composer, 54), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionContainer$lambda$9$0(SelectionRegistrarImpl selectionRegistrarImpl, my myVar, SelectionManager selectionManager, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-284825865, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:136)");
            }
            CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(selectionRegistrarImpl), ComposableLambdaKt.rememberComposableLambda(610483127, true, new r4(9, myVar, selectionManager), composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionContainer$lambda$9$0$0(my myVar, SelectionManager selectionManager, Composer composer, int i) {
        int i2 = 0;
        int i3 = 1;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(610483127, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:137)");
            }
            myVar.invoke(composer, 0);
            if (selectionManager.isInTouchMode() && selectionManager.getHasFocus() && !selectionManager.isTriviallyCollapsedSelection$foundation()) {
                composer.startReplaceGroup(-1736224054);
                Selection selection = selectionManager.getSelection();
                if (selection == null) {
                    composer.startReplaceGroup(2011629175);
                } else {
                    composer.startReplaceGroup(2011629176);
                    composer.startReplaceGroup(-1736222526);
                    List E = y80.E(Boolean.TRUE, Boolean.FALSE);
                    int size = E.size();
                    int i4 = 0;
                    while (i4 < size) {
                        boolean booleanValue = ((Boolean) E.get(i4)).booleanValue();
                        boolean changed = composer.changed(booleanValue);
                        Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = selectionManager.handleDragObserver(booleanValue);
                            composer.updateRememberedValue(rememberedValue);
                        }
                        final TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
                        boolean changed2 = composer.changed(booleanValue);
                        Object rememberedValue2 = composer.rememberedValue();
                        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                            rememberedValue2 = booleanValue ? new kn0(selectionManager, i3) : new kn0(selectionManager, i2);
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        iy iyVar = (iy) rememberedValue2;
                        ResolvedTextDirection direction = booleanValue ? selection.getStart().getDirection() : selection.getEnd().getDirection();
                        float startHandleLineHeight = booleanValue ? selectionManager.getStartHandleLineHeight() : selectionManager.getEndHandleLineHeight();
                        int i5 = size;
                        SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 = new SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(iyVar);
                        int i6 = i4;
                        ResolvedTextDirection resolvedTextDirection = direction;
                        boolean handlesCrossed = selection.getHandlesCrossed();
                        Modifier.Companion companion = Modifier.Companion;
                        boolean changedInstance = composer.changedInstance(textDragObserver);
                        Object rememberedValue3 = composer.rememberedValue();
                        if (changedInstance || rememberedValue3 == Composer.Companion.getEmpty()) {
                            rememberedValue3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5$1$1$1$1$1$1
                                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                                    Object detectDownAndDragGesturesWithObserver = LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, TextDragObserver.this, hmVar);
                                    return detectDownAndDragGesturesWithObserver == vn.d ? detectDownAndDragGesturesWithObserver : w01.a;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        AndroidSelectionHandles_androidKt.m1478SelectionHandlewLIcFTc(selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0, booleanValue, resolvedTextDirection, handlesCrossed, 0L, startHandleLineHeight, SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (PointerInputEventHandler) rememberedValue3), composer, 0, 16);
                        i4 = i6 + 1;
                        size = i5;
                        i2 = 0;
                    }
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2005806539);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset SelectionContainer$lambda$9$0$0$0$0$1$0(SelectionManager selectionManager) {
        Offset m1526getStartHandlePosition_m7T9E = selectionManager.m1526getStartHandlePosition_m7T9E();
        return Offset.m4505boximpl(m1526getStartHandlePosition_m7T9E != null ? m1526getStartHandlePosition_m7T9E.m4526unboximpl() : Offset.Companion.m4531getUnspecifiedF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset SelectionContainer$lambda$9$0$0$0$0$1$1(SelectionManager selectionManager) {
        Offset m1525getEndHandlePosition_m7T9E = selectionManager.m1525getEndHandlePosition_m7T9E();
        return Offset.m4505boximpl(m1525getEndHandlePosition_m7T9E != null ? m1525getEndHandlePosition_m7T9E.m4526unboximpl() : Offset.Companion.m4531getUnspecifiedF1C5BW0());
    }

    public static final void SelectionContainer(Modifier modifier, my myVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(1949207773);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949207773, i3, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:56)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Selection SelectionContainer$lambda$1 = SelectionContainer$lambda$1(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new i3(mutableState, 20);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SelectionContainer(modifier3, SelectionContainer$lambda$1, (ky) rememberedValue2, myVar, startRestartGroup, (i3 & 14) | 384 | ((i3 << 6) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new l6(modifier2, myVar, i, i2, 2));
        }
    }
}
