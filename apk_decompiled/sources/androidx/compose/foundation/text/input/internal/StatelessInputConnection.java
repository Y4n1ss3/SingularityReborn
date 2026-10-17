package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import defpackage.j50;
import defpackage.ky;
import defpackage.r6;
import defpackage.s00;
import defpackage.t00;
import defpackage.u00;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StatelessInputConnection implements InputConnection {
    public static final int $stable = 8;
    private int batchDepth;
    private final InputConnection commitContentDelegateInputConnection;
    private final MutableVector<ky> editCommands = new MutableVector<>(new ky[16], 0);
    private final TextInputSession session;
    private final StatelessInputConnection$terminalInputConnection$1 terminalInputConnection;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1] */
    public StatelessInputConnection(TextInputSession textInputSession, EditorInfo editorInfo) {
        this.session = textInputSession;
        ?? r3 = new InputConnectionWrapper(this) { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1
            {
                super(this, false);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                return false;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean performPrivateCommand(String str, Bundle bundle) {
                return true;
            }
        };
        this.terminalInputConnection = r3;
        ?? r0 = new t00() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1
            @Override // defpackage.t00
            public boolean onCommitContent(u00 u00Var, int i, Bundle bundle) {
                TextInputSession textInputSession2;
                if ((i & 1) != 0) {
                    try {
                        ((InputContentInfo) u00Var.a.d).requestPermission();
                        InputContentInfo inputContentInfo = (InputContentInfo) u00Var.a.d;
                        bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", inputContentInfo);
                    } catch (Exception e) {
                        StatelessInputConnection.this.logDebug("Can't insert content from IME; requestPermission() failed, " + e);
                        return false;
                    }
                }
                textInputSession2 = StatelessInputConnection.this.session;
                return textInputSession2.onCommitContent(StatelessInputConnection_androidKt.toTransferableContent(u00Var, bundle));
            }
        };
        if (editorInfo == null) {
            throw new NullPointerException("editorInfo must be non-null");
        }
        this.commitContentDelegateInputConnection = new s00(r3, r0);
    }

    private final boolean beginBatchEditInternal() {
        return this.session.beginBatchEdit();
    }

    private final boolean endBatchEditInternal() {
        return this.session.endBatchEdit();
    }

    private final TextFieldCharSequence getText() {
        return this.session.getText();
    }

    private final void sendSynthesizedKeyEvent(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        logDebug("beginBatchEdit()");
        return beginBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        logDebug(r6.b("clearMetaKeyStates(", i, ')'));
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        logDebug("closeConnection()");
        this.editCommands.clear();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        StringBuilder sb = new StringBuilder("commitCompletion(");
        sb.append((Object) (completionInfo != null ? completionInfo.getText() : null));
        sb.append(')');
        logDebug(sb.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        logDebug("commitContent(" + inputContentInfo + ", " + i + ", " + bundle + ')');
        return Api25CommitContentImpl.INSTANCE.commitContent(this.commitContentDelegateInputConnection, inputContentInfo, i, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        logDebug("commitText(\"" + ((Object) charSequence) + "\", " + i + ')');
        if (charSequence == null) {
            return true;
        }
        ImeEditCommand_androidKt.commitText(this.session, charSequence.toString(), i);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        logDebug("deleteSurroundingText(" + i + ", " + i2 + ')');
        ImeEditCommand_androidKt.deleteSurroundingText(this.session, i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        logDebug("deleteSurroundingTextInCodePoints(" + i + ", " + i2 + ')');
        ImeEditCommand_androidKt.deleteSurroundingTextInCodePoints(this.session, i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        logDebug("endBatchEdit()");
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        logDebug("finishComposingText()");
        ImeEditCommand_androidKt.finishComposingText(this.session);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        logDebug(r6.b("getCursorCapsMode(", i, ')'));
        return TextUtils.getCapsMode(getText(), TextRange.m7058getMinimpl(getText().m1239getSelectiond9O1mEE()), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        ExtractedText extractedText;
        logDebug("getExtractedText(" + extractedTextRequest + ", " + i + ')');
        extractedText = StatelessInputConnection_androidKt.toExtractedText(getText());
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        logDebug("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i) {
        String obj = TextRange.m7054getCollapsedimpl(getText().m1239getSelectiond9O1mEE()) ? null : TextFieldCharSequenceKt.getSelectedText(getText()).toString();
        logDebug("getSelectedText(" + i + "): " + ((Object) obj));
        return obj;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i, int i2) {
        String obj = TextFieldCharSequenceKt.getTextAfterSelection(getText(), i).toString();
        StringBuilder j = j50.j("getTextAfterCursor(", i, ", ", i2, "): ");
        j.append(obj);
        logDebug(j.toString());
        return obj;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i, int i2) {
        String obj = TextFieldCharSequenceKt.getTextBeforeSelection(getText(), i).toString();
        StringBuilder j = j50.j("getTextBeforeCursor(", i, ", ", i2, "): ");
        j.append(obj);
        logDebug(j.toString());
        return obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        return false;
     */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performContextMenuAction(int i) {
        logDebug(r6.b("performContextMenuAction(", i, ')'));
        switch (i) {
            case R.id.selectAll:
                ImeEditCommand_androidKt.setSelection(this.session, 0, getText().length());
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

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int m7241getDefaulteUduSuo;
        logDebug(r6.b("performEditorAction(", i, ')'));
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
                    logDebug(j50.h(i, "IME sent an unrecognized editor action: "));
                    m7241getDefaulteUduSuo = ImeAction.Companion.m7241getDefaulteUduSuo();
                    break;
            }
        } else {
            m7241getDefaulteUduSuo = ImeAction.Companion.m7241getDefaulteUduSuo();
        }
        this.session.mo1269onImeActionKlQnJC8(m7241getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        logDebug("performHandwritingGesture(" + handwritingGesture + ", " + executor + ", " + intConsumer + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        Api34PerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.session, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        logDebug("performPrivateCommand(" + str + ", " + bundle + ')');
        return this.commitContentDelegateInputConnection.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        logDebug("previewHandwritingGesture(" + previewableHandwritingGesture + ", " + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return Api34PerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.session, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        logDebug("reportFullscreenMode(" + z + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        logDebug(r6.b("requestCursorUpdates(", i, ')'));
        this.session.requestCursorUpdates(i);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        logDebug("sendKeyEvent(" + keyEvent + ')');
        this.session.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        logDebug("setComposingRegion(" + i + ", " + i2 + ')');
        ImeEditCommand_androidKt.setComposingRegion(this.session, i, i2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        logDebug("setComposingText(\"" + ((Object) charSequence) + "\", " + i + ')');
        if (charSequence == null) {
            return true;
        }
        TextInputSession textInputSession = this.session;
        String obj = charSequence.toString();
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        ImeEditCommand_androidKt.setComposingText(textInputSession, obj, i, spanned != null ? StatelessInputConnection_androidKt.toAnnotationList(spanned) : null);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        logDebug("setSelection(" + i + ", " + i2 + ')');
        ImeEditCommand_androidKt.setSelection(this.session, i, i2);
        this.session.updateTouchMode(false);
        return true;
    }

    private static /* synthetic */ void getCommitContentDelegateInputConnection$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDebug(String str) {
    }
}
