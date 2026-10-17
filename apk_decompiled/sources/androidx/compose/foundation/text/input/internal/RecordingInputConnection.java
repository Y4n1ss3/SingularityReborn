package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import defpackage.dq;
import defpackage.iy;
import defpackage.mb0;
import defpackage.w01;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final List<EditCommand> editCommands;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive;
    private final LegacyTextFieldState legacyTextFieldState;
    private final TextFieldSelectionManager textFieldSelectionManager;
    private TextFieldValue textFieldValue;
    private final ViewConfiguration viewConfiguration;

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
        this.viewConfiguration = viewConfiguration;
        this.textFieldValue = textFieldValue;
        this.editCommands = new ArrayList();
        this.isActive = true;
    }

    private final void addEditCommandWithBatch(EditCommand editCommand) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.onEditCommands(yi.J0(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean ensureActive(iy iyVar) {
        boolean z = this.isActive;
        if (z) {
            iyVar.invoke();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 performHandwritingGesture$lambda$0(RecordingInputConnection recordingInputConnection, EditCommand editCommand) {
        recordingInputConnection.addEditCommandWithBatch(editCommand);
        return w01.a;
    }

    private final void sendSynthesizedKeyEvent(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.isActive;
        return z ? beginBatchEditInternal() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.isActive;
        return z ? this.autoCorrect : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.textFieldValue.getText(), TextRange.m7058getMinimpl(this.textFieldValue.m7310getSelectiond9O1mEE()), i);
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        ExtractedText extractedText;
        boolean z = (i & 1) != 0;
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        extractedText = RecordingInputConnection_androidKt.toExtractedText(this.textFieldValue);
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i) {
        if (TextRange.m7054getCollapsedimpl(this.textFieldValue.m7310getSelectiond9O1mEE())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.textFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i, int i2) {
        return TextFieldValueKt.getTextAfterSelection(this.textFieldValue, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return TextFieldValueKt.getTextBeforeSelection(this.textFieldValue, i).toString();
    }

    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    public final TextFieldValue getTextFieldValue$foundation() {
        return this.textFieldValue;
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.textFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(277);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int m7241getDefaulteUduSuo;
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    m7241getDefaulteUduSuo = ImeAction.Companion.m7243getGoeUduSuo();
                    break;
                case 3:
                    m7241getDefaulteUduSuo = ImeAction.Companion.m7247getSearcheUduSuo();
                    break;
                case 4:
                    m7241getDefaulteUduSuo = ImeAction.Companion.m7248getSendeUduSuo();
                    break;
                case 5:
                    m7241getDefaulteUduSuo = ImeAction.Companion.m7244getNexteUduSuo();
                    break;
                case 6:
                    m7241getDefaulteUduSuo = ImeAction.Companion.m7242getDoneeUduSuo();
                    break;
                case 7:
                    m7241getDefaulteUduSuo = ImeAction.Companion.m7246getPreviouseUduSuo();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                    m7241getDefaulteUduSuo = ImeAction.Companion.m7241getDefaulteUduSuo();
                    break;
            }
        } else {
            m7241getDefaulteUduSuo = ImeAction.Companion.m7241getDefaulteUduSuo();
        }
        this.eventCallback.mo1306onImeActionKlQnJC8(m7241getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34LegacyPerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, handwritingGesture, this.viewConfiguration, executor, intConsumer, new mb0(this, 10));
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.isActive;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34LegacyPerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.isActive;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (i & 1) != 0;
        boolean z8 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            boolean z9 = (i & 16) != 0;
            boolean z10 = (i & 8) != 0;
            boolean z11 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z6 = true;
            }
            if (z9 || z10 || z11 || z6) {
                z2 = z6;
                z = z11;
                z4 = z10;
                z3 = z9;
            } else if (i2 >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z6;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        this.eventCallback.onRequestCursorAnchorInfo(z7, z8, z3, z4, z, z2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        this.eventCallback.onKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingRegionCommand(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new SetSelectionCommand(i, i2));
        return true;
    }

    public final void setTextFieldValue$foundation(TextFieldValue textFieldValue) {
        this.textFieldValue = textFieldValue;
    }

    public final void updateInputState(TextFieldValue textFieldValue, InputMethodManager inputMethodManager) {
        ExtractedText extractedText;
        if (this.isActive) {
            setTextFieldValue$foundation(textFieldValue);
            if (this.extractedTextMonitorMode) {
                int i = this.currentExtractedTextRequestToken;
                extractedText = RecordingInputConnection_androidKt.toExtractedText(textFieldValue);
                inputMethodManager.updateExtractedText(i, extractedText);
            }
            TextRange m7309getCompositionMzsxiRA = textFieldValue.m7309getCompositionMzsxiRA();
            int m7058getMinimpl = m7309getCompositionMzsxiRA != null ? TextRange.m7058getMinimpl(m7309getCompositionMzsxiRA.m7064unboximpl()) : -1;
            TextRange m7309getCompositionMzsxiRA2 = textFieldValue.m7309getCompositionMzsxiRA();
            inputMethodManager.updateSelection(TextRange.m7058getMinimpl(textFieldValue.m7310getSelectiond9O1mEE()), TextRange.m7057getMaximpl(textFieldValue.m7310getSelectiond9O1mEE()), m7058getMinimpl, m7309getCompositionMzsxiRA2 != null ? TextRange.m7057getMaximpl(m7309getCompositionMzsxiRA2.m7064unboximpl()) : -1);
        }
    }

    public /* synthetic */ RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, int i, dq dqVar) {
        this(textFieldValue, inputEventCallback2, z, (i & 8) != 0 ? null : legacyTextFieldState, (i & 16) != 0 ? null : textFieldSelectionManager, (i & 32) != 0 ? null : viewConfiguration);
    }

    private final void logDebug(String str) {
    }
}
