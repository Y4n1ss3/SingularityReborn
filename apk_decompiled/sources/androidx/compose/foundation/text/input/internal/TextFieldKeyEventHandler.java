package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.text.DeadKeyCombiner;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyEventHelpers_androidKt;
import androidx.compose.foundation.text.KeyMapping;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.foundation.text.StringHelpers_jvmKt;
import androidx.compose.foundation.text.TextFieldKeyInput_androidKt;
import androidx.compose.foundation.text.input.internal.selection.SelectionMovementDeletionContext;
import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import defpackage.fo0;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.sa0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class TextFieldKeyEventHandler {
    public static final int $stable = 8;
    private sa0 currentlyConsumedDownKeys;
    private final TextFieldPreparedSelectionState preparedSelectionState = new TextFieldPreparedSelectionState();
    private final DeadKeyCombiner deadKeyCombiner = new DeadKeyCombiner();
    private final KeyMapping keyMapping = KeyMapping_androidKt.getPlatformDefaultKeyMapping();

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

    private final float getVisibleTextLayoutHeight(TextLayoutState textLayoutState) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null) {
            return Float.NaN;
        }
        Rect rect = null;
        if (!textLayoutNodeCoordinates.isAttached()) {
            textLayoutNodeCoordinates = null;
        }
        if (textLayoutNodeCoordinates == null) {
            return Float.NaN;
        }
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        if (decoratorNodeCoordinates != null) {
            if (!decoratorNodeCoordinates.isAttached()) {
                decoratorNodeCoordinates = null;
            }
            if (decoratorNodeCoordinates != null) {
                rect = LayoutCoordinates.localBoundingBoxOf$default(decoratorNodeCoordinates, textLayoutNodeCoordinates, false, 2, null);
            }
        }
        if (rect != null) {
            return Float.intBitsToFloat((int) (rect.m4549getSizeNHjbRc() & 4294967295L));
        }
        return Float.NaN;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x023e  */
    /* renamed from: processKeyDownEvent-q0GpTC0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m1336processKeyDownEventq0GpTC0(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ky kyVar, SoftwareKeyboardController softwareKeyboardController, boolean z, boolean z2, iy iyVar) {
        WedgeAffinity wedgeAffinity;
        Integer m1113consumeZmokQxo;
        boolean z3 = false;
        if (TextFieldKeyInput_androidKt.m1191isTypedEventZmokQxo(keyEvent) && (m1113consumeZmokQxo = this.deadKeyCombiner.m1113consumeZmokQxo(keyEvent)) != null) {
            String sb = StringHelpers_jvmKt.appendCodePointX(new StringBuilder(2), m1113consumeZmokQxo.intValue()).toString();
            if (!z) {
                return false;
            }
            TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, sb, true, null, !TextFieldKeyEventHandler_androidKt.m1338isFromSoftKeyboardZmokQxo(keyEvent), 4, null);
            this.preparedSelectionState.resetCachedX();
            return true;
        }
        KeyCommand mo1116mapZmokQxo = this.keyMapping.mo1116mapZmokQxo(keyEvent);
        if (mo1116mapZmokQxo != null && (!mo1116mapZmokQxo.getEditsText() || z)) {
            SelectionMovementDeletionContext selectionMovementDeletionContext = new SelectionMovementDeletionContext(transformedTextFieldState, textLayoutState.getLayoutResult(), TextFieldKeyEventHandler_androidKt.m1338isFromSoftKeyboardZmokQxo(keyEvent), getVisibleTextLayoutHeight(textLayoutState), this.preparedSelectionState);
            switch (WhenMappings.$EnumSwitchMapping$0[mo1116mapZmokQxo.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    kyVar.invoke(mo1116mapZmokQxo);
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled && (mo1116mapZmokQxo == KeyCommand.UP || mo1116mapZmokQxo == KeyCommand.DOWN || mo1116mapZmokQxo == KeyCommand.LEFT_CHAR || mo1116mapZmokQxo == KeyCommand.RIGHT_CHAR)) {
                        z3 = !TextRange.m7053equalsimpl0(selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE(), selectionMovementDeletionContext.m1386getSelectiond9O1mEE());
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                        transformedTextFieldState.m1366selectCharsIn5zctL8(selectionMovementDeletionContext.m1386getSelectiond9O1mEE());
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null && (wedgeAffinity = selectionMovementDeletionContext.getWedgeAffinity()) != null) {
                        if (!TextRange.m7054getCollapsedimpl(transformedTextFieldState.getUntransformedText().m1239getSelectiond9O1mEE())) {
                            transformedTextFieldState.setSelectionWedgeAffinity(new SelectionWedgeAffinity(wedgeAffinity));
                            return z3;
                        }
                        transformedTextFieldState.setSelectionWedgeAffinity(SelectionWedgeAffinity.copy$default(selectionMovementDeletionContext.getInitialWedgeAffinity(), null, wedgeAffinity, 1, null));
                        break;
                    }
                    break;
                case 4:
                    selectionMovementDeletionContext.collapseLeftOr(new fo0(14));
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                        z3 = !TextRange.m7053equalsimpl0(selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE(), selectionMovementDeletionContext.m1386getSelectiond9O1mEE());
                        break;
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                        if (!TextRange.m7054getCollapsedimpl(transformedTextFieldState.getUntransformedText().m1239getSelectiond9O1mEE())) {
                        }
                        break;
                    }
                    break;
                case 5:
                    selectionMovementDeletionContext.collapseRightOr(new fo0(15));
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 6:
                    selectionMovementDeletionContext.moveCursorLeftByWord();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 7:
                    selectionMovementDeletionContext.moveCursorRightByWord();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 8:
                    selectionMovementDeletionContext.moveCursorPrevByParagraph();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 9:
                    selectionMovementDeletionContext.moveCursorNextByParagraph();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 10:
                    selectionMovementDeletionContext.moveCursorUpByLine();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 11:
                    selectionMovementDeletionContext.moveCursorDownByLine();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case Matrix.TranslateX /* 12 */:
                    selectionMovementDeletionContext.moveCursorUpByPage();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case Matrix.TranslateY /* 13 */:
                    selectionMovementDeletionContext.moveCursorDownByPage();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case Matrix.TranslateZ /* 14 */:
                    selectionMovementDeletionContext.moveCursorToLineStart();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 15:
                    selectionMovementDeletionContext.moveCursorToLineEnd();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 16:
                    selectionMovementDeletionContext.moveCursorToLineLeftSide();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 17:
                    selectionMovementDeletionContext.moveCursorToLineRightSide();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 18:
                    selectionMovementDeletionContext.moveCursorToHome();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 19:
                    selectionMovementDeletionContext.moveCursorToEnd();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                    selectionMovementDeletionContext.moveCursorPrevByCodePointOrEmoji().deleteMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 21:
                    selectionMovementDeletionContext.moveCursorNextByChar().deleteMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 22:
                    selectionMovementDeletionContext.moveCursorPrevByWord().deleteMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 23:
                    selectionMovementDeletionContext.moveCursorNextByWord().deleteMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 24:
                    selectionMovementDeletionContext.moveCursorToLineStart().deleteMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case RectListKt.BitOffsetForParentId /* 25 */:
                    selectionMovementDeletionContext.moveCursorToLineEnd().deleteMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 26:
                    if (z2) {
                        z3 = ((Boolean) iyVar.invoke()).booleanValue();
                        if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                        }
                        if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                        }
                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                        }
                    } else {
                        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, "\n", true, null, !TextFieldKeyEventHandler_androidKt.m1338isFromSoftKeyboardZmokQxo(keyEvent), 4, null);
                        z3 = true;
                        if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                        }
                        if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                        }
                        if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                        }
                    }
                    break;
                case 27:
                    if (!z2) {
                        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, "\t", true, null, !TextFieldKeyEventHandler_androidKt.m1338isFromSoftKeyboardZmokQxo(keyEvent), 4, null);
                        z3 = true;
                    }
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 28:
                    selectionMovementDeletionContext.selectAll();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 29:
                    selectionMovementDeletionContext.moveCursorLeftByChar().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 30:
                    selectionMovementDeletionContext.moveCursorRightByChar().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 31:
                    selectionMovementDeletionContext.moveCursorLeftByWord().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 32:
                    selectionMovementDeletionContext.moveCursorRightByWord().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case UtilsKt.MUTABLE_BUFFER_SIZE /* 33 */:
                    selectionMovementDeletionContext.moveCursorPrevByParagraph().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 34:
                    selectionMovementDeletionContext.moveCursorNextByParagraph().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 35:
                    selectionMovementDeletionContext.moveCursorToLineStart().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 36:
                    selectionMovementDeletionContext.moveCursorToLineEnd().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 37:
                    selectionMovementDeletionContext.moveCursorToLineLeftSide().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 38:
                    selectionMovementDeletionContext.moveCursorToLineRightSide().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 39:
                    selectionMovementDeletionContext.moveCursorUpByLine().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 40:
                    selectionMovementDeletionContext.moveCursorDownByLine().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 41:
                    selectionMovementDeletionContext.moveCursorUpByPage().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 42:
                    selectionMovementDeletionContext.moveCursorDownByPage().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 43:
                    selectionMovementDeletionContext.moveCursorToHome().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 44:
                    selectionMovementDeletionContext.moveCursorToEnd().selectMovement();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 45:
                    selectionMovementDeletionContext.deselect();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 46:
                    transformedTextFieldState.undo();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 47:
                    transformedTextFieldState.redo();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                    KeyEventHelpers_androidKt.showCharacterPalette();
                    z3 = true;
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                case 49:
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                        softwareKeyboardController.show();
                        z3 = true;
                    }
                    if (ComposeFoundationFlags.isTextFieldDpadNavigationEnabled) {
                    }
                    if (!TextRange.m7053equalsimpl0(selectionMovementDeletionContext.m1386getSelectiond9O1mEE(), selectionMovementDeletionContext.getInitialValue().m1239getSelectiond9O1mEE())) {
                    }
                    if (selectionMovementDeletionContext.getWedgeAffinity() != null) {
                    }
                    break;
                default:
                    o.n();
                    return false;
            }
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 processKeyDownEvent_q0GpTC0$lambda$0$0(SelectionMovementDeletionContext selectionMovementDeletionContext) {
        selectionMovementDeletionContext.moveCursorLeftByChar();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 processKeyDownEvent_q0GpTC0$lambda$0$1(SelectionMovementDeletionContext selectionMovementDeletionContext) {
        selectionMovementDeletionContext.moveCursorRightByChar();
        return w01.a;
    }

    /* renamed from: onKeyEvent-8zsqlwg */
    public boolean mo1265onKeyEvent8zsqlwg(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, ky kyVar, SoftwareKeyboardController softwareKeyboardController, boolean z, boolean z2, iy iyVar) {
        long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
        int m5933getTypeZmokQxo = KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent);
        KeyEventType.Companion companion = KeyEventType.Companion;
        if (KeyEventType.m5925equalsimpl0(m5933getTypeZmokQxo, companion.m5930getKeyUpCS__XNY())) {
            sa0 sa0Var = this.currentlyConsumedDownKeys;
            if (sa0Var == null || !sa0Var.a(m5932getKeyZmokQxo)) {
                return false;
            }
            sa0 sa0Var2 = this.currentlyConsumedDownKeys;
            if (sa0Var2 != null) {
                sa0Var2.e(m5932getKeyZmokQxo);
            }
            return true;
        }
        if (KeyEventType.m5925equalsimpl0(KeyEvent_androidKt.m5933getTypeZmokQxo(keyEvent), companion.m5931getUnknownCS__XNY()) && !TextFieldKeyInput_androidKt.m1191isTypedEventZmokQxo(keyEvent)) {
            return false;
        }
        boolean m1336processKeyDownEventq0GpTC0 = m1336processKeyDownEventq0GpTC0(keyEvent, transformedTextFieldState, textLayoutState, kyVar, softwareKeyboardController, z, z2, iyVar);
        if (m1336processKeyDownEventq0GpTC0) {
            sa0 sa0Var3 = this.currentlyConsumedDownKeys;
            if (sa0Var3 == null) {
                sa0Var3 = new sa0(3);
                this.currentlyConsumedDownKeys = sa0Var3;
            }
            sa0Var3.d(m5932getKeyZmokQxo);
        }
        return m1336processKeyDownEventq0GpTC0;
    }

    /* renamed from: onPreKeyEvent-MyFupTE */
    public boolean mo1266onPreKeyEventMyFupTE(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        if (TextRange.m7054getCollapsedimpl(transformedTextFieldState.getVisualText().m1239getSelectiond9O1mEE()) || !KeyEventHelpers_androidKt.m1115cancelsTextSelectionZmokQxo(keyEvent)) {
            return false;
        }
        textFieldSelectionState.deselect();
        return true;
    }
}
