package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.dq;
import defpackage.g30;
import defpackage.g40;
import defpackage.hz;
import defpackage.i2;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {
    public static final int $stable = 8;
    private final g30 baseInputConnection$delegate;
    private final LegacyCursorAnchorInfoController cursorAnchorInfoController;
    private Rect focusedRect;
    private final InputMethodManager inputMethodManager;
    private LegacyTextFieldState legacyTextFieldState;
    private ky onEditCommand;
    private TextFieldSelectionManager textFieldSelectionManager;
    private final View view;
    private ViewConfiguration viewConfiguration;
    private ky onImeActionPerformed = new hz(20);
    private TextFieldValue state = new TextFieldValue("", TextRange.Companion.m7065getZerod9O1mEE(), (TextRange) null, 4, (dq) null);
    private ImeOptions imeOptions = ImeOptions.Companion.getDefault();
    private List<WeakReference<RecordingInputConnection>> ics = new ArrayList();

    public LegacyTextInputMethodRequest(View view, ky kyVar, InputMethodManager inputMethodManager) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        int i = 19;
        this.onEditCommand = new hz(i);
        this.baseInputConnection$delegate = y80.B(g40.e, new i2(this, i));
        this.cursorAnchorInfoController = new LegacyCursorAnchorInfoController(kyVar, inputMethodManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseInputConnection baseInputConnection_delegate$lambda$0(LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
        return new BaseInputConnection(legacyTextInputMethodRequest.view, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onEditCommand$lambda$0(List list) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onImeActionPerformed$lambda$0(ImeAction imeAction) {
        return w01.a;
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public RecordingInputConnection createInputConnection(EditorInfo editorInfo) {
        EditorInfo_androidKt.m1280updatepLxbY9I$default(editorInfo, this.state.getText(), this.state.m7310getSelectiond9O1mEE(), this.imeOptions, null, 8, null);
        LegacyPlatformTextInputServiceAdapter_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$createInputConnection$1
            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                List list;
                List list2;
                List list3;
                list = LegacyTextInputMethodRequest.this.ics;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list2 = LegacyTextInputMethodRequest.this.ics;
                    if (q10.b(((WeakReference) list2.get(i)).get(), recordingInputConnection2)) {
                        list3 = LegacyTextInputMethodRequest.this.ics;
                        list3.remove(i);
                        return;
                    }
                }
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                ky kyVar;
                kyVar = LegacyTextInputMethodRequest.this.onEditCommand;
                kyVar.invoke(list);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo1306onImeActionKlQnJC8(int i) {
                ky kyVar;
                kyVar = LegacyTextInputMethodRequest.this.onImeActionPerformed;
                kyVar.invoke(ImeAction.m7225boximpl(i));
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                BaseInputConnection baseInputConnection;
                baseInputConnection = LegacyTextInputMethodRequest.this.getBaseInputConnection();
                baseInputConnection.sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
                LegacyCursorAnchorInfoController legacyCursorAnchorInfoController;
                legacyCursorAnchorInfoController = LegacyTextInputMethodRequest.this.cursorAnchorInfoController;
                legacyCursorAnchorInfoController.requestUpdate(z, z2, z3, z4, z5, z6);
            }
        }, this.imeOptions.getAutoCorrect(), this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    public final Rect getFocusedRect$foundation() {
        return this.focusedRect;
    }

    public final TextFieldValue getState() {
        return this.state;
    }

    public final View getView() {
        return this.view;
    }

    public final void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(y80.P(rect.getLeft()), y80.P(rect.getTop()), y80.P(rect.getRight()), y80.P(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    public final void setFocusedRect$foundation(Rect rect) {
        this.focusedRect = rect;
    }

    public final void startInput(TextFieldValue textFieldValue, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, ImeOptions imeOptions, ky kyVar, ky kyVar2) {
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = kyVar;
        this.onImeActionPerformed = kyVar2;
        this.legacyTextFieldState = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getTextFieldSelectionManager() : null;
        this.viewConfiguration = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getViewConfiguration() : null;
    }

    public final void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z = (TextRange.m7053equalsimpl0(this.state.m7310getSelectiond9O1mEE(), textFieldValue2.m7310getSelectiond9O1mEE()) && q10.b(this.state.m7309getCompositionMzsxiRA(), textFieldValue2.m7309getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i = 0; i < size; i++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setTextFieldValue$foundation(textFieldValue2);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (q10.b(textFieldValue, textFieldValue2)) {
            if (z) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int m7058getMinimpl = TextRange.m7058getMinimpl(textFieldValue2.m7310getSelectiond9O1mEE());
                int m7057getMaximpl = TextRange.m7057getMaximpl(textFieldValue2.m7310getSelectiond9O1mEE());
                TextRange m7309getCompositionMzsxiRA = this.state.m7309getCompositionMzsxiRA();
                int m7058getMinimpl2 = m7309getCompositionMzsxiRA != null ? TextRange.m7058getMinimpl(m7309getCompositionMzsxiRA.m7064unboximpl()) : -1;
                TextRange m7309getCompositionMzsxiRA2 = this.state.m7309getCompositionMzsxiRA();
                inputMethodManager.updateSelection(m7058getMinimpl, m7057getMaximpl, m7058getMinimpl2, m7309getCompositionMzsxiRA2 != null ? TextRange.m7057getMaximpl(m7309getCompositionMzsxiRA2.m7064unboximpl()) : -1);
                return;
            }
            return;
        }
        if (textFieldValue != null && (!q10.b(textFieldValue.getText(), textFieldValue2.getText()) || (TextRange.m7053equalsimpl0(textFieldValue.m7310getSelectiond9O1mEE(), textFieldValue2.m7310getSelectiond9O1mEE()) && !q10.b(textFieldValue.m7309getCompositionMzsxiRA(), textFieldValue2.m7309getCompositionMzsxiRA())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i2).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
    }
}
