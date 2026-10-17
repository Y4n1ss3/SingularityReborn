package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import defpackage.bu;
import defpackage.dq;
import defpackage.er;
import defpackage.g30;
import defpackage.g40;
import defpackage.j;
import defpackage.ji0;
import defpackage.ky;
import defpackage.o;
import defpackage.p01;
import defpackage.q10;
import defpackage.y80;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public final class TextInputServiceAndroid implements PlatformTextInputService {
    public static final int $stable = 8;
    private final g30 baseInputConnection$delegate;
    private final CursorAnchorInfoController cursorAnchorInfoController;
    private boolean editorHasFocus;
    private Rect focusedRect;
    private Runnable frameCallback;
    private List<WeakReference<RecordingInputConnection>> ics;
    private ImeOptions imeOptions;
    private final Executor inputCommandProcessorExecutor;
    private final InputMethodManager inputMethodManager;
    private ky onEditCommand;
    private ky onImeActionPerformed;
    private TextFieldValue state;
    private final MutableVector<TextInputCommand> textInputCommandQueue;
    private final View view;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TextInputCommand {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ TextInputCommand[] $VALUES;
        public static final TextInputCommand StartInput = new TextInputCommand("StartInput", 0);
        public static final TextInputCommand StopInput = new TextInputCommand("StopInput", 1);
        public static final TextInputCommand ShowKeyboard = new TextInputCommand("ShowKeyboard", 2);
        public static final TextInputCommand HideKeyboard = new TextInputCommand("HideKeyboard", 3);

        private static final /* synthetic */ TextInputCommand[] $values() {
            return new TextInputCommand[]{StartInput, StopInput, ShowKeyboard, HideKeyboard};
        }

        static {
            TextInputCommand[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private TextInputCommand(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static TextInputCommand valueOf(String str) {
            return (TextInputCommand) Enum.valueOf(TextInputCommand.class, str);
        }

        public static TextInputCommand[] values() {
            return (TextInputCommand[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputCommand.values().length];
            try {
                iArr[TextInputCommand.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputCommand.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextInputCommand.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextInputCommand.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = TextInputServiceAndroid$onEditCommand$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$onImeActionPerformed$1.INSTANCE;
        this.state = new TextFieldValue("", TextRange.Companion.m7065getZerod9O1mEE(), (TextRange) null, 4, (dq) null);
        this.imeOptions = ImeOptions.Companion.getDefault();
        this.ics = new ArrayList();
        this.baseInputConnection$delegate = y80.B(g40.e, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.cursorAnchorInfoController = new CursorAnchorInfoController(matrixPositionCalculator, inputMethodManager);
        this.textInputCommandQueue = new MutableVector<>(new TextInputCommand[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection$delegate.getValue();
    }

    private final void processInputCommands() {
        View findFocus;
        if (!this.view.isFocused() && (findFocus = this.view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
            this.textInputCommandQueue.clear();
            return;
        }
        ji0 ji0Var = new ji0();
        ji0 ji0Var2 = new ji0();
        MutableVector<TextInputCommand> mutableVector = this.textInputCommandQueue;
        TextInputCommand[] textInputCommandArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            processInputCommands$applyToState(textInputCommandArr[i], ji0Var, ji0Var2);
        }
        this.textInputCommandQueue.clear();
        if (q10.b(ji0Var.d, Boolean.TRUE)) {
            restartInputImmediately();
        }
        Boolean bool = (Boolean) ji0Var2.d;
        if (bool != null) {
            setKeyboardVisibleImmediately(bool.booleanValue());
        }
        if (q10.b(ji0Var.d, Boolean.FALSE)) {
            restartInputImmediately();
        }
    }

    private static final void processInputCommands$applyToState(TextInputCommand textInputCommand, ji0 ji0Var, ji0 ji0Var2) {
        int i = WhenMappings.$EnumSwitchMapping$0[textInputCommand.ordinal()];
        if (i == 1) {
            Boolean bool = Boolean.TRUE;
            ji0Var.d = bool;
            ji0Var2.d = bool;
        } else if (i == 2) {
            Boolean bool2 = Boolean.FALSE;
            ji0Var.d = bool2;
            ji0Var2.d = bool2;
        } else if (i != 3 && i != 4) {
            o.n();
        } else {
            if (q10.b(ji0Var.d, Boolean.FALSE)) {
                return;
            }
            ji0Var2.d = Boolean.valueOf(textInputCommand == TextInputCommand.ShowKeyboard);
        }
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }

    private final void sendInputCommand(TextInputCommand textInputCommand) {
        this.textInputCommandQueue.add(textInputCommand);
        if (this.frameCallback == null) {
            j jVar = new j(this, 11);
            this.inputCommandProcessorExecutor.execute(jVar);
            this.frameCallback = jVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendInputCommand$lambda$0(TextInputServiceAndroid textInputServiceAndroid) {
        textInputServiceAndroid.frameCallback = null;
        textInputServiceAndroid.processInputCommands();
    }

    private final void setKeyboardVisibleImmediately(boolean z) {
        InputMethodManager inputMethodManager = this.inputMethodManager;
        if (z) {
            inputMethodManager.showSoftInput();
        } else {
            inputMethodManager.hideSoftInput();
        }
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        if (!this.editorHasFocus) {
            return null;
        }
        TextInputServiceAndroid_androidKt.update(editorInfo, this.imeOptions, this.state);
        TextInputServiceAndroid_androidKt.updateWithEmojiCompat(editorInfo);
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(this.state, new InputEventCallback2() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1
            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onConnectionClosed(RecordingInputConnection recordingInputConnection2) {
                List list;
                List list2;
                List list3;
                list = TextInputServiceAndroid.this.ics;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list2 = TextInputServiceAndroid.this.ics;
                    if (q10.b(((WeakReference) list2.get(i)).get(), recordingInputConnection2)) {
                        list3 = TextInputServiceAndroid.this.ics;
                        list3.remove(i);
                        return;
                    }
                }
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onEditCommands(List<? extends EditCommand> list) {
                ky kyVar;
                kyVar = TextInputServiceAndroid.this.onEditCommand;
                kyVar.invoke(list);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            /* renamed from: onImeAction-KlQnJC8 */
            public void mo7260onImeActionKlQnJC8(int i) {
                ky kyVar;
                kyVar = TextInputServiceAndroid.this.onImeActionPerformed;
                kyVar.invoke(ImeAction.m7225boximpl(i));
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onKeyEvent(KeyEvent keyEvent) {
                BaseInputConnection baseInputConnection;
                baseInputConnection = TextInputServiceAndroid.this.getBaseInputConnection();
                baseInputConnection.sendKeyEvent(keyEvent);
            }

            @Override // androidx.compose.ui.text.input.InputEventCallback2
            public void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
                CursorAnchorInfoController cursorAnchorInfoController;
                cursorAnchorInfoController = TextInputServiceAndroid.this.cursorAnchorInfoController;
                cursorAnchorInfoController.requestUpdate(z, z2, z3, z4, z5, z6);
            }
        }, this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    public final TextFieldValue getState$ui() {
        return this.state;
    }

    public final View getView() {
        return this.view;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void hideSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.HideKeyboard);
    }

    public final boolean isEditorFocused() {
        return this.editorHasFocus;
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    @er
    public void notifyFocusedRect(androidx.compose.ui.geometry.Rect rect) {
        Rect rect2;
        this.focusedRect = new Rect(y80.P(rect.getLeft()), y80.P(rect.getTop()), y80.P(rect.getRight()), y80.P(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void showSoftwareKeyboard() {
        sendInputCommand(TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, ky kyVar, ky kyVar2) {
        this.editorHasFocus = true;
        this.state = textFieldValue;
        this.imeOptions = imeOptions;
        this.onEditCommand = kyVar;
        this.onImeActionPerformed = kyVar2;
        sendInputCommand(TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        this.editorHasFocus = false;
        this.onEditCommand = TextInputServiceAndroid$stopInput$1.INSTANCE;
        this.onImeActionPerformed = TextInputServiceAndroid$stopInput$2.INSTANCE;
        this.focusedRect = null;
        sendInputCommand(TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        boolean z = (TextRange.m7053equalsimpl0(this.state.m7310getSelectiond9O1mEE(), textFieldValue2.m7310getSelectiond9O1mEE()) && q10.b(this.state.m7309getCompositionMzsxiRA(), textFieldValue2.m7309getCompositionMzsxiRA())) ? false : true;
        this.state = textFieldValue2;
        int size = this.ics.size();
        for (int i = 0; i < size; i++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui(textFieldValue2);
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

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, ky kyVar, androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        this.cursorAnchorInfoController.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, kyVar, rect, rect2);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        sendInputCommand(TextInputCommand.StartInput);
    }

    public /* synthetic */ TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator, InputMethodManager inputMethodManager, Executor executor, int i, dq dqVar) {
        this(view, matrixPositionCalculator, inputMethodManager, (i & 8) != 0 ? TextInputServiceAndroid_androidKt.asExecutor(Choreographer.getInstance()) : executor);
    }

    public TextInputServiceAndroid(View view, MatrixPositionCalculator matrixPositionCalculator) {
        this(view, matrixPositionCalculator, new InputMethodManagerImpl(view), null, 8, null);
    }
}
