package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import defpackage.dq;
import defpackage.f1;
import defpackage.fi0;
import defpackage.fo0;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldKeyInput {
    public static final int $stable = 8;
    private final boolean editable;
    private final int imeAction;
    private final DeadKeyCombiner keyCombiner;
    private final KeyMapping keyMapping;
    private final OffsetMapping offsetMapping;
    private final ky onValueChange;
    private final TextPreparedSelectionState preparedSelectionState;
    private final TextFieldSelectionManager selectionManager;
    private final boolean singleLine;
    private final LegacyTextFieldState state;
    private final UndoManager undoManager;
    private final TextFieldValue value;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[KeyCommand.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyCommand.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyCommand.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KeyCommand.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[KeyCommand.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[KeyCommand.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[KeyCommand.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[KeyCommand.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[KeyCommand.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[KeyCommand.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[KeyCommand.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[KeyCommand.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[KeyCommand.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[KeyCommand.CENTER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, ky kyVar, int i, int i2, dq dqVar) {
        this(legacyTextFieldState, textFieldSelectionManager, (i2 & 4) != 0 ? new TextFieldValue((String) null, 0L, (TextRange) null, 7, (dq) null) : textFieldValue, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, textPreparedSelectionState, (i2 & 64) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i2 & Fields.SpotShadowColor) != 0 ? null : undoManager, deadKeyCombiner, (i2 & Fields.RotationY) != 0 ? KeyMapping_androidKt.getPlatformDefaultKeyMapping() : keyMapping, (i2 & Fields.RotationZ) != 0 ? new fo0(24) : kyVar, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$0(TextFieldValue textFieldValue) {
        return w01.a;
    }

    private final void apply(List<? extends EditCommand> list) {
        EditProcessor processor = this.state.getProcessor();
        ArrayList J0 = yi.J0(list);
        J0.add(0, new FinishComposingTextCommand());
        this.onValueChange.invoke(processor.apply(J0));
    }

    private final void commandExecutionContext(ky kyVar) {
        TextFieldPreparedSelection textFieldPreparedSelection = new TextFieldPreparedSelection(this.value, this.offsetMapping, this.state.getLayoutResult(), this.preparedSelectionState);
        kyVar.invoke(textFieldPreparedSelection);
        if (TextRange.m7053equalsimpl0(textFieldPreparedSelection.m1480getSelectiond9O1mEE(), this.value.m7310getSelectiond9O1mEE()) && q10.b(textFieldPreparedSelection.getAnnotatedString(), this.value.getAnnotatedString())) {
            return;
        }
        this.onValueChange.invoke(textFieldPreparedSelection.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 process_ZmokQxo$lambda$1(KeyCommand keyCommand, TextFieldKeyInput textFieldKeyInput, fi0 fi0Var, TextFieldPreparedSelection textFieldPreparedSelection) {
        TextFieldValue undo;
        TextFieldValue redo;
        switch (WhenMappings.$EnumSwitchMapping$0[keyCommand.ordinal()]) {
            case 1:
                textFieldKeyInput.selectionManager.copy$foundation(false);
                break;
            case 2:
                textFieldKeyInput.selectionManager.paste$foundation();
                break;
            case 3:
                textFieldKeyInput.selectionManager.cut$foundation();
                break;
            case 4:
                textFieldPreparedSelection.collapseLeftOr(new fo0(16));
                break;
            case 5:
                textFieldPreparedSelection.collapseRightOr(new fo0(17));
                break;
            case 6:
                textFieldPreparedSelection.moveCursorLeftByWord();
                break;
            case 7:
                textFieldPreparedSelection.moveCursorRightByWord();
                break;
            case 8:
                textFieldPreparedSelection.moveCursorPrevByParagraph();
                break;
            case 9:
                textFieldPreparedSelection.moveCursorNextByParagraph();
                break;
            case 10:
                textFieldPreparedSelection.moveCursorUpByLine();
                break;
            case 11:
                textFieldPreparedSelection.moveCursorDownByLine();
                break;
            case Matrix.TranslateX /* 12 */:
                textFieldPreparedSelection.moveCursorUpByPage();
                break;
            case Matrix.TranslateY /* 13 */:
                textFieldPreparedSelection.moveCursorDownByPage();
                break;
            case Matrix.TranslateZ /* 14 */:
                textFieldPreparedSelection.moveCursorToLineStart();
                break;
            case 15:
                textFieldPreparedSelection.moveCursorToLineEnd();
                break;
            case 16:
                textFieldPreparedSelection.moveCursorToLineLeftSide();
                break;
            case 17:
                textFieldPreparedSelection.moveCursorToLineRightSide();
                break;
            case 18:
                textFieldPreparedSelection.moveCursorToHome();
                break;
            case 19:
                textFieldPreparedSelection.moveCursorToEnd();
                break;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                List<EditCommand> deleteIfSelectedOr = textFieldPreparedSelection.deleteIfSelectedOr(new fo0(18));
                if (deleteIfSelectedOr != null) {
                    textFieldKeyInput.apply(deleteIfSelectedOr);
                    break;
                }
                break;
            case 21:
                List<EditCommand> deleteIfSelectedOr2 = textFieldPreparedSelection.deleteIfSelectedOr(new fo0(19));
                if (deleteIfSelectedOr2 != null) {
                    textFieldKeyInput.apply(deleteIfSelectedOr2);
                    break;
                }
                break;
            case 22:
                List<EditCommand> deleteIfSelectedOr3 = textFieldPreparedSelection.deleteIfSelectedOr(new fo0(20));
                if (deleteIfSelectedOr3 != null) {
                    textFieldKeyInput.apply(deleteIfSelectedOr3);
                    break;
                }
                break;
            case 23:
                List<EditCommand> deleteIfSelectedOr4 = textFieldPreparedSelection.deleteIfSelectedOr(new fo0(21));
                if (deleteIfSelectedOr4 != null) {
                    textFieldKeyInput.apply(deleteIfSelectedOr4);
                    break;
                }
                break;
            case 24:
                List<EditCommand> deleteIfSelectedOr5 = textFieldPreparedSelection.deleteIfSelectedOr(new fo0(22));
                if (deleteIfSelectedOr5 != null) {
                    textFieldKeyInput.apply(deleteIfSelectedOr5);
                    break;
                }
                break;
            case RectListKt.BitOffsetForParentId /* 25 */:
                List<EditCommand> deleteIfSelectedOr6 = textFieldPreparedSelection.deleteIfSelectedOr(new fo0(23));
                if (deleteIfSelectedOr6 != null) {
                    textFieldKeyInput.apply(deleteIfSelectedOr6);
                    break;
                }
                break;
            case 26:
                if (!textFieldKeyInput.singleLine) {
                    textFieldKeyInput.apply(new CommitTextCommand("\n", 1));
                    break;
                } else {
                    fi0Var.d = ((Boolean) textFieldKeyInput.state.getOnImeActionPerformedWithResult().invoke(ImeAction.m7225boximpl(textFieldKeyInput.imeAction))).booleanValue();
                    break;
                }
            case 27:
                if (!textFieldKeyInput.singleLine) {
                    textFieldKeyInput.apply(new CommitTextCommand("\t", 1));
                    break;
                } else {
                    fi0Var.d = false;
                    break;
                }
            case 28:
                textFieldPreparedSelection.selectAll();
                break;
            case 29:
                textFieldPreparedSelection.moveCursorLeft().selectMovement();
                break;
            case 30:
                textFieldPreparedSelection.moveCursorRight().selectMovement();
                break;
            case 31:
                textFieldPreparedSelection.moveCursorLeftByWord().selectMovement();
                break;
            case 32:
                textFieldPreparedSelection.moveCursorRightByWord().selectMovement();
                break;
            case UtilsKt.MUTABLE_BUFFER_SIZE /* 33 */:
                textFieldPreparedSelection.moveCursorPrevByParagraph().selectMovement();
                break;
            case 34:
                textFieldPreparedSelection.moveCursorNextByParagraph().selectMovement();
                break;
            case 35:
                textFieldPreparedSelection.moveCursorToLineStart().selectMovement();
                break;
            case 36:
                textFieldPreparedSelection.moveCursorToLineEnd().selectMovement();
                break;
            case 37:
                textFieldPreparedSelection.moveCursorToLineLeftSide().selectMovement();
                break;
            case 38:
                textFieldPreparedSelection.moveCursorToLineRightSide().selectMovement();
                break;
            case 39:
                textFieldPreparedSelection.moveCursorUpByLine().selectMovement();
                break;
            case 40:
                textFieldPreparedSelection.moveCursorDownByLine().selectMovement();
                break;
            case 41:
                textFieldPreparedSelection.moveCursorUpByPage().selectMovement();
                break;
            case 42:
                textFieldPreparedSelection.moveCursorDownByPage().selectMovement();
                break;
            case 43:
                textFieldPreparedSelection.moveCursorToHome().selectMovement();
                break;
            case 44:
                textFieldPreparedSelection.moveCursorToEnd().selectMovement();
                break;
            case 45:
                textFieldPreparedSelection.deselect();
                break;
            case 46:
                UndoManager undoManager = textFieldKeyInput.undoManager;
                if (undoManager != null) {
                    undoManager.makeSnapshot(textFieldPreparedSelection.getValue());
                }
                UndoManager undoManager2 = textFieldKeyInput.undoManager;
                if (undoManager2 != null && (undo = undoManager2.undo()) != null) {
                    textFieldKeyInput.onValueChange.invoke(undo);
                    break;
                }
                break;
            case 47:
                UndoManager undoManager3 = textFieldKeyInput.undoManager;
                if (undoManager3 != null && (redo = undoManager3.redo()) != null) {
                    textFieldKeyInput.onValueChange.invoke(redo);
                    break;
                }
                break;
            case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                KeyEventHelpers_androidKt.showCharacterPalette();
                break;
            case 49:
                break;
            default:
                o.n();
                return null;
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 process_ZmokQxo$lambda$1$0(TextFieldPreparedSelection textFieldPreparedSelection) {
        textFieldPreparedSelection.moveCursorLeft();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 process_ZmokQxo$lambda$1$1(TextFieldPreparedSelection textFieldPreparedSelection) {
        textFieldPreparedSelection.moveCursorRight();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$2(TextFieldPreparedSelection textFieldPreparedSelection) {
        int precedingCodePointOrEmojiStartIndex = textFieldPreparedSelection.getPrecedingCodePointOrEmojiStartIndex();
        if (precedingCodePointOrEmojiStartIndex == -1) {
            return null;
        }
        return new DeleteSurroundingTextCommand(TextRange.m7055getEndimpl(textFieldPreparedSelection.m1480getSelectiond9O1mEE()) - precedingCodePointOrEmojiStartIndex, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$3(TextFieldPreparedSelection textFieldPreparedSelection) {
        int nextCharacterIndex = textFieldPreparedSelection.getNextCharacterIndex();
        if (nextCharacterIndex != -1) {
            return new DeleteSurroundingTextCommand(0, nextCharacterIndex - TextRange.m7055getEndimpl(textFieldPreparedSelection.m1480getSelectiond9O1mEE()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$4(TextFieldPreparedSelection textFieldPreparedSelection) {
        Integer previousWordOffset = textFieldPreparedSelection.getPreviousWordOffset();
        if (previousWordOffset == null) {
            return null;
        }
        return new DeleteSurroundingTextCommand(TextRange.m7055getEndimpl(textFieldPreparedSelection.m1480getSelectiond9O1mEE()) - previousWordOffset.intValue(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$5(TextFieldPreparedSelection textFieldPreparedSelection) {
        Integer nextWordOffset = textFieldPreparedSelection.getNextWordOffset();
        if (nextWordOffset != null) {
            return new DeleteSurroundingTextCommand(0, nextWordOffset.intValue() - TextRange.m7055getEndimpl(textFieldPreparedSelection.m1480getSelectiond9O1mEE()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$6(TextFieldPreparedSelection textFieldPreparedSelection) {
        Integer lineStartByOffset = textFieldPreparedSelection.getLineStartByOffset();
        if (lineStartByOffset == null) {
            return null;
        }
        return new DeleteSurroundingTextCommand(TextRange.m7055getEndimpl(textFieldPreparedSelection.m1480getSelectiond9O1mEE()) - lineStartByOffset.intValue(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand process_ZmokQxo$lambda$1$7(TextFieldPreparedSelection textFieldPreparedSelection) {
        Integer lineEndByOffset = textFieldPreparedSelection.getLineEndByOffset();
        if (lineEndByOffset != null) {
            return new DeleteSurroundingTextCommand(0, lineEndByOffset.intValue() - TextRange.m7055getEndimpl(textFieldPreparedSelection.m1480getSelectiond9O1mEE()));
        }
        return null;
    }

    /* renamed from: typedCommand-ZmokQxo, reason: not valid java name */
    private final CommitTextCommand m1186typedCommandZmokQxo(KeyEvent keyEvent) {
        Integer m1113consumeZmokQxo;
        if (TextFieldKeyInput_androidKt.m1191isTypedEventZmokQxo(keyEvent) && (m1113consumeZmokQxo = this.keyCombiner.m1113consumeZmokQxo(keyEvent)) != null) {
            return new CommitTextCommand(StringHelpers_jvmKt.appendCodePointX(new StringBuilder(), m1113consumeZmokQxo.intValue()).toString(), 1);
        }
        return null;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final TextPreparedSelectionState getPreparedSelectionState() {
        return this.preparedSelectionState;
    }

    public final TextFieldSelectionManager getSelectionManager() {
        return this.selectionManager;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    /* renamed from: process-ZmokQxo, reason: not valid java name */
    public final boolean m1187processZmokQxo(KeyEvent keyEvent) {
        KeyCommand mo1116mapZmokQxo;
        CommitTextCommand m1186typedCommandZmokQxo = m1186typedCommandZmokQxo(keyEvent);
        if (m1186typedCommandZmokQxo != null) {
            if (!this.editable) {
                return false;
            }
            apply(m1186typedCommandZmokQxo);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        if (!KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5929getKeyDownCS__XNY()) || (mo1116mapZmokQxo = this.keyMapping.mo1116mapZmokQxo(keyEvent)) == null) {
            return false;
        }
        if (mo1116mapZmokQxo.getEditsText() && !this.editable) {
            return false;
        }
        fi0 fi0Var = new fi0();
        fi0Var.d = true;
        commandExecutionContext(new f1(mo1116mapZmokQxo, this, fi0Var, 22));
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
        return fi0Var.d;
    }

    private final void apply(EditCommand editCommand) {
        apply(y80.D(editCommand));
    }

    private TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, ky kyVar, int i) {
        this.state = legacyTextFieldState;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = textPreparedSelectionState;
        this.offsetMapping = offsetMapping;
        this.undoManager = undoManager;
        this.keyCombiner = deadKeyCombiner;
        this.keyMapping = keyMapping;
        this.onValueChange = kyVar;
        this.imeAction = i;
    }

    public /* synthetic */ TextFieldKeyInput(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, TextPreparedSelectionState textPreparedSelectionState, OffsetMapping offsetMapping, UndoManager undoManager, DeadKeyCombiner deadKeyCombiner, KeyMapping keyMapping, ky kyVar, int i, dq dqVar) {
        this(legacyTextFieldState, textFieldSelectionManager, textFieldValue, z, z2, textPreparedSelectionState, offsetMapping, undoManager, deadKeyCombiner, keyMapping, kyVar, i);
    }
}
