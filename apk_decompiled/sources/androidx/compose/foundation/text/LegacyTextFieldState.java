package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.hz;
import defpackage.ky;
import defpackage.q10;
import defpackage.ut;
import defpackage.w01;
import defpackage.xm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LegacyTextFieldState {
    public static final int $stable = 8;
    private LayoutCoordinates _layoutCoordinates;
    private final MutableState autofillHighlightOn$delegate;
    private final MutableState deletionPreviewHighlightRange$delegate;
    private final MutableState handleState$delegate;
    private final MutableState hasFocus$delegate;
    private final Paint highlightPaint;
    private TextInputSession inputSession;
    private final MutableState isInTouchMode$delegate;
    private boolean isLayoutResultStale;
    private final MutableState justAutofilled$delegate;
    private final KeyboardActionRunner keyboardActionRunner;
    private final SoftwareKeyboardController keyboardController;
    private final MutableState<TextLayoutResultProxy> layoutResultState;
    private final MutableState minHeightForSingleLineField$delegate;
    private final ky onImeActionPerformed;
    private final ky onImeActionPerformedWithResult;
    private final ky onValueChange;
    private ky onValueChangeOriginal;
    private final EditProcessor processor = new EditProcessor();
    private final RecomposeScope recomposeScope;
    private long selectionBackgroundColor;
    private final MutableState selectionPreviewHighlightRange$delegate;
    private final MutableState showCursorHandle$delegate;
    private final MutableState showFloatingToolbar$delegate;
    private final MutableState showSelectionHandleEnd$delegate;
    private final MutableState showSelectionHandleStart$delegate;
    private TextDelegate textDelegate;
    private AnnotatedString untransformedText;

    public LegacyTextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope, SoftwareKeyboardController softwareKeyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        Boolean bool = Boolean.FALSE;
        this.hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.minHeightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m7609boximpl(Dp.m7611constructorimpl(0.0f)), null, 2, null);
        this.layoutResultState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.handleState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
        this.showFloatingToolbar$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleStart$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showSelectionHandleEnd$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isLayoutResultStale = true;
        this.isInTouchMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.keyboardActionRunner = new KeyboardActionRunner(softwareKeyboardController);
        this.autofillHighlightOn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.justAutofilled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.onValueChangeOriginal = new hz(18);
        this.onValueChange = new xm(this, 2);
        this.onImeActionPerformed = new xm(this, 3);
        this.onImeActionPerformedWithResult = new xm(this, 4);
        this.highlightPaint = AndroidPaint_androidKt.Paint();
        this.selectionBackgroundColor = Color.Companion.m4797getUnspecified0d7_KjU();
        TextRange.Companion companion = TextRange.Companion;
        this.selectionPreviewHighlightRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m7048boximpl(companion.m7065getZerod9O1mEE()), null, 2, null);
        this.deletionPreviewHighlightRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m7048boximpl(companion.m7065getZerod9O1mEE()), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onImeActionPerformed$lambda$0(LegacyTextFieldState legacyTextFieldState, ImeAction imeAction) {
        legacyTextFieldState.keyboardActionRunner.m1119runActionKlQnJC8(imeAction.m7231unboximpl());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onImeActionPerformedWithResult$lambda$0(LegacyTextFieldState legacyTextFieldState, ImeAction imeAction) {
        return legacyTextFieldState.keyboardActionRunner.m1119runActionKlQnJC8(imeAction.m7231unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onValueChange$lambda$0(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue) {
        String text = textFieldValue.getText();
        AnnotatedString annotatedString = legacyTextFieldState.untransformedText;
        if (!q10.b(text, annotatedString != null ? annotatedString.getText() : null)) {
            legacyTextFieldState.setHandleState(HandleState.None);
            if (legacyTextFieldState.getJustAutofilled()) {
                legacyTextFieldState.setJustAutofilled(false);
            } else {
                legacyTextFieldState.setAutofillHighlightOn(false);
            }
        }
        TextRange.Companion companion = TextRange.Companion;
        legacyTextFieldState.m1141setSelectionPreviewHighlightRange5zctL8(companion.m7065getZerod9O1mEE());
        legacyTextFieldState.m1138setDeletionPreviewHighlightRange5zctL8(companion.m7065getZerod9O1mEE());
        legacyTextFieldState.onValueChangeOriginal.invoke(textFieldValue);
        legacyTextFieldState.recomposeScope.invalidate();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onValueChangeOriginal$lambda$0(TextFieldValue textFieldValue) {
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutofillHighlightOn() {
        return ((Boolean) this.autofillHighlightOn$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDeletionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m1134getDeletionPreviewHighlightRanged9O1mEE() {
        return ((TextRange) this.deletionPreviewHighlightRange$delegate.getValue()).m7064unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final Paint getHighlightPaint() {
        return this.highlightPaint;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getJustAutofilled() {
        return ((Boolean) this.justAutofilled$delegate.getValue()).booleanValue();
    }

    public final SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m1135getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m7625unboximpl();
    }

    public final ky getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final ky getOnImeActionPerformedWithResult() {
        return this.onImeActionPerformedWithResult;
    }

    public final ky getOnValueChange() {
        return this.onValueChange;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    /* renamed from: getSelectionBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m1136getSelectionBackgroundColor0d7_KjU() {
        return this.selectionBackgroundColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSelectionPreviewHighlightRange-d9O1mEE, reason: not valid java name */
    public final long m1137getSelectionPreviewHighlightRanged9O1mEE() {
        return ((TextRange) this.selectionPreviewHighlightRange$delegate.getValue()).m7064unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFloatingToolbar() {
        return ((Boolean) this.showFloatingToolbar$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final boolean hasHighlight() {
        return (TextRange.m7054getCollapsedimpl(m1137getSelectionPreviewHighlightRanged9O1mEE()) && TextRange.m7054getCollapsedimpl(m1134getDeletionPreviewHighlightRanged9O1mEE())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void setAutofillHighlightOn(boolean z) {
        this.autofillHighlightOn$delegate.setValue(Boolean.valueOf(z));
    }

    /* renamed from: setDeletionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m1138setDeletionPreviewHighlightRange5zctL8(long j) {
        this.deletionPreviewHighlightRange$delegate.setValue(TextRange.m7048boximpl(j));
    }

    public final void setHandleState(HandleState handleState) {
        this.handleState$delegate.setValue(handleState);
    }

    public final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    public final void setJustAutofilled(boolean z) {
        this.justAutofilled$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m1139setMinHeightForSingleLineField0680j_4(float f) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m7609boximpl(f));
    }

    /* renamed from: setSelectionBackgroundColor-8_81llA, reason: not valid java name */
    public final void m1140setSelectionBackgroundColor8_81llA(long j) {
        this.selectionBackgroundColor = j;
    }

    /* renamed from: setSelectionPreviewHighlightRange-5zc-tL8, reason: not valid java name */
    public final void m1141setSelectionPreviewHighlightRange5zctL8(long j) {
        this.selectionPreviewHighlightRange$delegate.setValue(TextRange.m7048boximpl(j));
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowFloatingToolbar(boolean z) {
        this.showFloatingToolbar$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleEnd(boolean z) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setShowSelectionHandleStart(boolean z) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    public final void setUntransformedText(AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* renamed from: update-fnh65Uc, reason: not valid java name */
    public final void m1142updatefnh65Uc(AnnotatedString annotatedString, AnnotatedString annotatedString2, TextStyle textStyle, boolean z, Density density, FontFamily.Resolver resolver, ky kyVar, KeyboardActions keyboardActions, FocusManager focusManager, long j) {
        this.onValueChangeOriginal = kyVar;
        this.selectionBackgroundColor = j;
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        this.untransformedText = annotatedString;
        TextDelegate m1169updateTextDelegaterm0N8CA$default = TextDelegateKt.m1169updateTextDelegaterm0N8CA$default(this.textDelegate, annotatedString2, textStyle, density, resolver, z, 0, 0, 0, ut.d, 448, null);
        if (this.textDelegate != m1169updateTextDelegaterm0N8CA$default) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = m1169updateTextDelegaterm0N8CA$default;
    }
}
