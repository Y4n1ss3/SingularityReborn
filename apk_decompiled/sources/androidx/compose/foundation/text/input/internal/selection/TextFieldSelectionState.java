package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarRequester;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviors;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.foundation.text.selection.SelectionLayoutKt;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextSelectionDelegateKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a90;
import defpackage.bu;
import defpackage.f1;
import defpackage.fo0;
import defpackage.gd;
import defpackage.hi0;
import defpackage.hm;
import defpackage.ii0;
import defpackage.iu0;
import defpackage.iw;
import defpackage.iy;
import defpackage.ju0;
import defpackage.jw;
import defpackage.ky;
import defpackage.m6;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.rn0;
import defpackage.rw;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldSelectionState {
    public static final int $stable = 8;
    private Clipboard clipboard;
    private ClipboardPasteState clipboardPasteState;
    private final un coroutineScope;
    private Density density;
    private final State derivedVisibleContentBounds$delegate;
    private final MutableState directDragGestureInitiator$delegate;
    private final MutableState draggingHandle$delegate;
    private boolean enabled;
    private HapticFeedback hapticFeedBack;
    private boolean isFocused;
    private final MutableState isInTouchMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private boolean isPassword;
    private final PlatformSelectionBehaviors platformSelectionBehaviors;
    private PressInteraction.Press pressInteraction;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private final MutableState rawHandleDragPosition$delegate;
    private boolean readOnly;
    private iy receiveContentConfiguration;
    private iy requestAutofillAction;
    private final MutableState showCursorHandle$delegate;
    private final MutableState startTextLayoutPositionInWindow$delegate;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private TextToolbarHandler textToolbarHandler;
    private final MutableState textToolbarShown$delegate;
    private final MutableState textToolbarState$delegate;
    private final ToolbarRequester toolbarRequester;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class InputType {
        private static final /* synthetic */ bu $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType None = new InputType("None", 0);
        public static final InputType Touch = new InputType("Touch", 1);
        public static final InputType Mouse = new InputType("Mouse", 2);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{None, Touch, Mouse};
        }

        static {
            InputType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = p01.k($values);
        }

        private InputType(String str, int i) {
        }

        public static bu getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition = Offset.Companion.m4531getUnspecifiedF1C5BW0();
        private boolean isDoubleOrTripleClickOnly = true;
        private final iy requestFocus;

        public TextFieldMouseSelectionObserver(iy iyVar) {
            this.requestFocus = iyVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onDragDone$lambda$0() {
            return "Mouse.onDragDone";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onDrag_3MmeM6k$lambda$0(long j) {
            return "Mouse.onDrag " + ((Object) Offset.m4524toStringimpl(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onExtendDrag_k_4lQ0M$lambda$0() {
            return "Mouse.onExtendDrag";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onExtend_k_4lQ0M$lambda$0() {
            return "Mouse.onExtend";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onStart_9KIMszo$lambda$0() {
            return "Mouse.onStart";
        }

        /* renamed from: updateSelection-12glfjA, reason: not valid java name */
        private final long m1411updateSelection12glfjA(long j, SelectionAdjustment selectionAdjustment, TextLayoutResult textLayoutResult, boolean z) {
            int length = textLayoutResult.getLayoutInput().getText().length();
            int i = this.dragBeginOffsetInText;
            if (i < 0 || i > length) {
                i = TextFieldSelectionState.this.getTextLayoutState$foundation().m1349getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
            }
            int i2 = i;
            int m1349getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.getTextLayoutState$foundation().m1349getOffsetForPosition3MmeM6k(j, false);
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long m1410updateSelectionSsLRf8$foundation = textFieldSelectionState.m1410updateSelectionSsLRf8$foundation(textFieldSelectionState.getTextFieldState$foundation().getVisualText(), i2, m1349getOffsetForPosition3MmeM6k, false, selectionAdjustment, false, z);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m7054getCollapsedimpl(m1410updateSelectionSsLRf8$foundation)) {
                this.dragBeginOffsetInText = TextRange.m7060getStartimpl(m1410updateSelectionSsLRf8$foundation);
            }
            if (TextRange.m7059getReversedimpl(m1410updateSelectionSsLRf8$foundation)) {
                m1410updateSelectionSsLRf8$foundation = TextFieldSelectionStateKt.m1417reverse5zctL8(m1410updateSelectionSsLRf8$foundation);
            }
            TextFieldSelectionState.this.getTextFieldState$foundation().m1366selectCharsIn5zctL8(m1410updateSelectionSsLRf8$foundation);
            TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            return m1410updateSelectionSsLRf8$foundation;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
        public boolean mo1412onDrag3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
            TextLayoutResult layoutResult = TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult();
            int i = 0;
            if (!TextFieldSelectionState.this.getEnabled() || layoutResult == null || TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new c(j, i));
            if (TextRange.m7053equalsimpl0(TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE(), m1411updateSelection12glfjA(j, selectionAdjustment, layoutResult, false))) {
                return true;
            }
            this.isDoubleOrTripleClickOnly = false;
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public void onDragDone() {
            TextFieldSelectionStateKt.logDebug(new b(2));
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
            if (this.isDoubleOrTripleClickOnly) {
                TextFieldSelectionState.this.maybeSuggestSelectionRange();
            }
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
        public boolean mo1413onExtendk4lQ0M(long j) {
            TextLayoutResult layoutResult = TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult();
            if (!TextFieldSelectionState.this.getEnabled() || layoutResult == null || TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().length() == 0) {
                return false;
            }
            TextFieldSelectionStateKt.logDebug(new b(1));
            this.isDoubleOrTripleClickOnly = false;
            this.requestFocus.invoke();
            m1411updateSelection12glfjA(j, SelectionAdjustment.Companion.getNone(), layoutResult, false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
        public boolean mo1414onExtendDragk4lQ0M(long j) {
            TextFieldSelectionStateKt.logDebug(new b(0));
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        /* renamed from: onStart-9KIMszo, reason: not valid java name */
        public boolean mo1415onStart9KIMszo(long j, SelectionAdjustment selectionAdjustment, int i) {
            TextLayoutResult layoutResult = TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult();
            if (!TextFieldSelectionState.this.getEnabled() || layoutResult == null || TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().length() == 0) {
                return false;
            }
            this.isDoubleOrTripleClickOnly = i >= 2;
            TextFieldSelectionStateKt.logDebug(new b(3));
            TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Mouse);
            this.requestFocus.invoke();
            TextFieldSelectionState.this.previousRawDragOffset = -1;
            this.dragBeginOffsetInText = -1;
            this.dragBeginPosition = j;
            this.dragBeginOffsetInText = TextRange.m7060getStartimpl(m1411updateSelection12glfjA(j, selectionAdjustment, layoutResult, true));
            return true;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextFieldSelectionState(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, Density density, boolean z, boolean z2, boolean z3, boolean z4, ToolbarRequester toolbarRequester, un unVar, PlatformSelectionBehaviors platformSelectionBehaviors, Clipboard clipboard) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.density = density;
        this.isFocused = z3;
        this.isPassword = z4;
        this.toolbarRequester = toolbarRequester;
        this.coroutineScope = unVar;
        this.platformSelectionBehaviors = platformSelectionBehaviors;
        this.clipboard = clipboard;
        this.enabled = z;
        this.readOnly = z2;
        Offset.Companion companion = Offset.Companion;
        this.startTextLayoutPositionInWindow$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4505boximpl(companion.m4531getUnspecifiedF1C5BW0()), null, 2, null);
        this.rawHandleDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4505boximpl(companion.m4531getUnspecifiedF1C5BW0()), null, 2, null);
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.directDragGestureInitiator$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(InputType.None, null, 2, null);
        Boolean bool = Boolean.FALSE;
        this.showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.textToolbarState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextToolbarState.None, null, 2, null);
        this.textToolbarShown$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.previousRawDragOffset = -1;
        this.derivedVisibleContentBounds$delegate = SnapshotStateKt.derivedStateOf(new gd(this, 4));
        this.clipboardPasteState = new ClipboardPasteState(this.clipboard);
    }

    private final Rect calculateCursorRect(TextLayoutResult textLayoutResult, TextFieldCharSequence textFieldCharSequence) {
        if (!TextRange.m7054getCollapsedimpl(textFieldCharSequence.m1239getSelectiond9O1mEE())) {
            return Rect.Companion.getZero();
        }
        Rect cursorRect = textLayoutResult.getCursorRect(TextRange.m7060getStartimpl(textFieldCharSequence.m1239getSelectiond9O1mEE()));
        float floor = (float) Math.floor(this.density.mo367toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()));
        if (floor < 1.0f) {
            floor = 1.0f;
        }
        float left = textLayoutResult.getLayoutInput().getLayoutDirection() == LayoutDirection.Ltr ? (floor / 2.0f) + cursorRect.getLeft() : cursorRect.getRight() - (floor / 2.0f);
        float f = floor / 2.0f;
        float m7031getSizeYbymL2g = ((int) (textLayoutResult.m7031getSizeYbymL2g() >> 32)) - f;
        if (left > m7031getSizeYbymL2g) {
            left = m7031getSizeYbymL2g;
        }
        if (left < f) {
            left = f;
        }
        float floor2 = ((int) floor) % 2 == 1 ? ((float) Math.floor(left)) + 0.5f : (float) Math.rint(left);
        return new Rect(floor2 - f, cursorRect.getTop(), floor2 + f, cursorRect.getBottom());
    }

    private final Rect calculateSelectionRect(TextLayoutResult textLayoutResult, TextFieldCharSequence textFieldCharSequence) {
        if (TextRange.m7054getCollapsedimpl(textFieldCharSequence.m1239getSelectiond9O1mEE())) {
            return Rect.Companion.getZero();
        }
        int lineForOffset = textLayoutResult.getLineForOffset(TextRange.m7060getStartimpl(textFieldCharSequence.m1239getSelectiond9O1mEE()));
        int lineForOffset2 = textLayoutResult.getLineForOffset(TextRange.m7055getEndimpl(textFieldCharSequence.m1239getSelectiond9O1mEE()));
        if (lineForOffset != lineForOffset2) {
            return textLayoutResult.getPathForRange(TextRange.m7058getMinimpl(textFieldCharSequence.m1239getSelectiond9O1mEE()), TextRange.m7057getMaximpl(textFieldCharSequence.m1239getSelectiond9O1mEE())).getBounds();
        }
        float horizontalPosition = textLayoutResult.getHorizontalPosition(TextRange.m7060getStartimpl(textFieldCharSequence.m1239getSelectiond9O1mEE()), true);
        float horizontalPosition2 = textLayoutResult.getHorizontalPosition(TextRange.m7055getEndimpl(textFieldCharSequence.m1239getSelectiond9O1mEE()), true);
        return new Rect(Math.min(horizontalPosition, horizontalPosition2), textLayoutResult.getLineTop(lineForOffset), Math.max(horizontalPosition, horizontalPosition2), textLayoutResult.getLineBottom(lineForOffset2));
    }

    public static /* synthetic */ Object copy$default(TextFieldSelectionState textFieldSelectionState, boolean z, hm hmVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return textFieldSelectionState.copy(z, hmVar);
    }

    public static /* synthetic */ AnnotatedString copyWithResult$foundation$default(TextFieldSelectionState textFieldSelectionState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return textFieldSelectionState.copyWithResult$foundation(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect derivedVisibleContentBounds_delegate$lambda$0(TextFieldSelectionState textFieldSelectionState) {
        LayoutCoordinates textLayoutCoordinates;
        boolean m7054getCollapsedimpl = TextRange.m7054getCollapsedimpl(textFieldSelectionState.textFieldState.getVisualText().m1239getSelectiond9O1mEE());
        if ((!(m7054getCollapsedimpl && textFieldSelectionState.getTextToolbarState() == TextToolbarState.Cursor) && (m7054getCollapsedimpl || textFieldSelectionState.getTextToolbarState() != TextToolbarState.Selection)) || textFieldSelectionState.getDraggingHandle() != null || !textFieldSelectionState.isInTouchMode() || (textLayoutCoordinates = textFieldSelectionState.getTextLayoutCoordinates()) == null) {
            return null;
        }
        Rect visibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates);
        Rect m4556Recttz77jQw = RectKt.m4556Recttz77jQw(textLayoutCoordinates.mo6245localToRootMKHz9U(visibleBounds.m4551getTopLeftF1C5BW0()), visibleBounds.m4549getSizeNHjbRc());
        Rect contentRect = textFieldSelectionState.getContentRect();
        if (contentRect.overlaps(m4556Recttz77jQw)) {
            return contentRect.intersect(m4556Recttz77jQw);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectCursorHandleDragGestures(PointerInputScope pointerInputScope, hm hmVar) {
        TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$1;
        int i;
        ii0 ii0Var;
        Throwable th;
        ii0 ii0Var2;
        if (hmVar instanceof TextFieldSelectionState$detectCursorHandleDragGestures$1) {
            textFieldSelectionState$detectCursorHandleDragGestures$1 = (TextFieldSelectionState$detectCursorHandleDragGestures$1) hmVar;
            int i2 = textFieldSelectionState$detectCursorHandleDragGestures$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$detectCursorHandleDragGestures$1.label = i2 - Integer.MIN_VALUE;
                TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$12 = textFieldSelectionState$detectCursorHandleDragGestures$1;
                Object obj = textFieldSelectionState$detectCursorHandleDragGestures$12.result;
                i = textFieldSelectionState$detectCursorHandleDragGestures$12.label;
                int i3 = 1;
                if (i != 0) {
                    p10.Q(obj);
                    ii0 ii0Var3 = new ii0();
                    Offset.Companion companion = Offset.Companion;
                    ii0Var3.d = companion.m4531getUnspecifiedF1C5BW0();
                    ii0 ii0Var4 = new ii0();
                    ii0Var4.d = companion.m4531getUnspecifiedF1C5BW0();
                    try {
                        f1 f1Var = new f1(ii0Var3, this, ii0Var4, 25);
                        iu0 iu0Var = new iu0(ii0Var3, ii0Var4, this, i3);
                        iu0 iu0Var2 = new iu0(ii0Var3, ii0Var4, this, 2);
                        m6 m6Var = new m6(ii0Var4, this, ii0Var3, 7);
                        textFieldSelectionState$detectCursorHandleDragGestures$12.L$0 = ii0Var3;
                        textFieldSelectionState$detectCursorHandleDragGestures$12.L$1 = ii0Var4;
                        textFieldSelectionState$detectCursorHandleDragGestures$12.label = 1;
                        Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, f1Var, iu0Var, iu0Var2, m6Var, textFieldSelectionState$detectCursorHandleDragGestures$12);
                        vn vnVar = vn.d;
                        if (detectDragGestures == vnVar) {
                            return vnVar;
                        }
                        ii0Var = ii0Var3;
                        ii0Var2 = ii0Var4;
                    } catch (Throwable th2) {
                        ii0Var = ii0Var3;
                        th = th2;
                        ii0Var2 = ii0Var4;
                        detectCursorHandleDragGestures$onDragStop(ii0Var, ii0Var2, this);
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ii0Var2 = (ii0) textFieldSelectionState$detectCursorHandleDragGestures$12.L$1;
                    ii0Var = (ii0) textFieldSelectionState$detectCursorHandleDragGestures$12.L$0;
                    try {
                        p10.Q(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        detectCursorHandleDragGestures$onDragStop(ii0Var, ii0Var2, this);
                        throw th;
                    }
                }
                detectCursorHandleDragGestures$onDragStop(ii0Var, ii0Var2, this);
                return w01.a;
            }
        }
        textFieldSelectionState$detectCursorHandleDragGestures$1 = new TextFieldSelectionState$detectCursorHandleDragGestures$1(this, hmVar);
        TextFieldSelectionState$detectCursorHandleDragGestures$1 textFieldSelectionState$detectCursorHandleDragGestures$122 = textFieldSelectionState$detectCursorHandleDragGestures$1;
        Object obj2 = textFieldSelectionState$detectCursorHandleDragGestures$122.result;
        i = textFieldSelectionState$detectCursorHandleDragGestures$122.label;
        int i32 = 1;
        if (i != 0) {
        }
        detectCursorHandleDragGestures$onDragStop(ii0Var, ii0Var2, this);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectCursorHandleDragGestures$lambda$0(ii0 ii0Var, TextFieldSelectionState textFieldSelectionState, ii0 ii0Var2, Offset offset) {
        ii0Var.d = SelectionHandlesKt.m1506getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.getCursorRect().m4543getBottomCenterF1C5BW0());
        ii0Var2.d = Offset.Companion.m4532getZeroF1C5BW0();
        textFieldSelectionState.setInTouchMode(true);
        textFieldSelectionState.markStartContentVisibleOffset();
        textFieldSelectionState.m1409updateHandleDraggingUv8p0NA(Handle.Cursor, ii0Var.d);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectCursorHandleDragGestures$lambda$1(ii0 ii0Var, ii0 ii0Var2, TextFieldSelectionState textFieldSelectionState) {
        detectCursorHandleDragGestures$onDragStop(ii0Var, ii0Var2, textFieldSelectionState);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectCursorHandleDragGestures$lambda$2(ii0 ii0Var, ii0 ii0Var2, TextFieldSelectionState textFieldSelectionState) {
        detectCursorHandleDragGestures$onDragStop(ii0Var, ii0Var2, textFieldSelectionState);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectCursorHandleDragGestures$lambda$3(ii0 ii0Var, TextFieldSelectionState textFieldSelectionState, ii0 ii0Var2, PointerInputChange pointerInputChange, Offset offset) {
        long m4521plusMKHz9U = Offset.m4521plusMKHz9U(ii0Var.d, offset.m4526unboximpl());
        ii0Var.d = m4521plusMKHz9U;
        textFieldSelectionState.m1409updateHandleDraggingUv8p0NA(Handle.Cursor, Offset.m4521plusMKHz9U(ii0Var2.d, m4521plusMKHz9U));
        if (textFieldSelectionState.m1408placeCursorAtNearestOffsetk4lQ0M(textFieldSelectionState.m1407getHandleDragPositionF1C5BW0())) {
            pointerInputChange.consume();
            HapticFeedback hapticFeedback = textFieldSelectionState.hapticFeedBack;
            if (hapticFeedback != null) {
                hapticFeedback.mo5532performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5549getTextHandleMove5zf0vsI());
            }
        }
        return w01.a;
    }

    private static final void detectCursorHandleDragGestures$onDragStop(ii0 ii0Var, ii0 ii0Var2, TextFieldSelectionState textFieldSelectionState) {
        if ((ii0Var.d & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            Offset.Companion companion = Offset.Companion;
            ii0Var.d = companion.m4531getUnspecifiedF1C5BW0();
            ii0Var2.d = companion.m4531getUnspecifiedF1C5BW0();
            textFieldSelectionState.clearHandleDragging();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object detectSelectionHandleDragGestures(PointerInputScope pointerInputScope, boolean z, hm hmVar) {
        TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$1;
        int i;
        ii0 ii0Var;
        ii0 ii0Var2;
        Handle handle;
        ii0 ii0Var3;
        ii0 ii0Var4;
        if (hmVar instanceof TextFieldSelectionState$detectSelectionHandleDragGestures$1) {
            textFieldSelectionState$detectSelectionHandleDragGestures$1 = (TextFieldSelectionState$detectSelectionHandleDragGestures$1) hmVar;
            int i2 = textFieldSelectionState$detectSelectionHandleDragGestures$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$detectSelectionHandleDragGestures$1.label = i2 - Integer.MIN_VALUE;
                TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$12 = textFieldSelectionState$detectSelectionHandleDragGestures$1;
                Object obj = textFieldSelectionState$detectSelectionHandleDragGestures$12.result;
                i = textFieldSelectionState$detectSelectionHandleDragGestures$12.label;
                int i3 = 3;
                if (i != 0) {
                    p10.Q(obj);
                    ii0 ii0Var5 = new ii0();
                    Offset.Companion companion = Offset.Companion;
                    ii0Var5.d = companion.m4531getUnspecifiedF1C5BW0();
                    ii0Var = new ii0();
                    ii0Var.d = companion.m4532getZeroF1C5BW0();
                    Handle handle2 = z ? Handle.SelectionStart : Handle.SelectionEnd;
                    try {
                        a90 a90Var = new a90(ii0Var5, ii0Var, handle2, this, z);
                        iu0 iu0Var = new iu0(ii0Var5, this, ii0Var, i3);
                        iu0 iu0Var2 = new iu0(ii0Var5, this, ii0Var, 0);
                        try {
                            ju0 ju0Var = new ju0(ii0Var, ii0Var5, handle2, this, z);
                            ii0Var4 = ii0Var;
                            ii0Var2 = ii0Var5;
                            handle = handle2;
                            try {
                                textFieldSelectionState$detectSelectionHandleDragGestures$12.L$0 = ii0Var2;
                                textFieldSelectionState$detectSelectionHandleDragGestures$12.L$1 = ii0Var4;
                                textFieldSelectionState$detectSelectionHandleDragGestures$12.L$2 = handle;
                                textFieldSelectionState$detectSelectionHandleDragGestures$12.label = 1;
                                Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, a90Var, iu0Var, iu0Var2, ju0Var, textFieldSelectionState$detectSelectionHandleDragGestures$12);
                                vn vnVar = vn.d;
                                if (detectDragGestures == vnVar) {
                                    return vnVar;
                                }
                                ii0Var = ii0Var4;
                                ii0Var3 = ii0Var2;
                            } catch (Throwable th) {
                                th = th;
                                ii0Var = ii0Var4;
                                ii0Var3 = ii0Var2;
                                TextFieldSelectionStateKt.logDebug(new rn0(i3, this, handle));
                                if (getDraggingHandle() == handle) {
                                    detectSelectionHandleDragGestures$onDragStop(ii0Var3, this, ii0Var);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ii0Var4 = ii0Var;
                            ii0Var2 = ii0Var5;
                            handle = handle2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        ii0Var2 = ii0Var5;
                        handle = handle2;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    handle = (Handle) textFieldSelectionState$detectSelectionHandleDragGestures$12.L$2;
                    ii0Var = (ii0) textFieldSelectionState$detectSelectionHandleDragGestures$12.L$1;
                    ii0Var3 = (ii0) textFieldSelectionState$detectSelectionHandleDragGestures$12.L$0;
                    try {
                        p10.Q(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        TextFieldSelectionStateKt.logDebug(new rn0(i3, this, handle));
                        if (getDraggingHandle() == handle) {
                        }
                        throw th;
                    }
                }
                TextFieldSelectionStateKt.logDebug(new rn0(i3, this, handle));
                if (getDraggingHandle() == handle) {
                    detectSelectionHandleDragGestures$onDragStop(ii0Var3, this, ii0Var);
                }
                return w01.a;
            }
        }
        textFieldSelectionState$detectSelectionHandleDragGestures$1 = new TextFieldSelectionState$detectSelectionHandleDragGestures$1(this, hmVar);
        TextFieldSelectionState$detectSelectionHandleDragGestures$1 textFieldSelectionState$detectSelectionHandleDragGestures$122 = textFieldSelectionState$detectSelectionHandleDragGestures$1;
        Object obj2 = textFieldSelectionState$detectSelectionHandleDragGestures$122.result;
        i = textFieldSelectionState$detectSelectionHandleDragGestures$122.label;
        int i32 = 3;
        if (i != 0) {
        }
        TextFieldSelectionStateKt.logDebug(new rn0(i32, this, handle));
        if (getDraggingHandle() == handle) {
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectSelectionHandleDragGestures$lambda$0(ii0 ii0Var, TextFieldSelectionState textFieldSelectionState, boolean z, Handle handle, ii0 ii0Var2, Offset offset) {
        long m1506getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1506getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.m1400getHandlePositiontuRUvjQ(z));
        ii0Var.d = m1506getAdjustedCoordinatesk4lQ0M;
        textFieldSelectionState.m1409updateHandleDraggingUv8p0NA(handle, m1506getAdjustedCoordinatesk4lQ0M);
        ii0Var2.d = Offset.Companion.m4532getZeroF1C5BW0();
        textFieldSelectionState.previousRawDragOffset = -1;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectSelectionHandleDragGestures$lambda$1(ii0 ii0Var, TextFieldSelectionState textFieldSelectionState, ii0 ii0Var2) {
        detectSelectionHandleDragGestures$onDragStop(ii0Var, textFieldSelectionState, ii0Var2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectSelectionHandleDragGestures$lambda$2(ii0 ii0Var, TextFieldSelectionState textFieldSelectionState, ii0 ii0Var2) {
        detectSelectionHandleDragGestures$onDragStop(ii0Var, textFieldSelectionState, ii0Var2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 detectSelectionHandleDragGestures$lambda$3(ii0 ii0Var, TextFieldSelectionState textFieldSelectionState, Handle handle, ii0 ii0Var2, boolean z, PointerInputChange pointerInputChange, Offset offset) {
        ii0Var.d = Offset.m4521plusMKHz9U(ii0Var.d, offset.m4526unboximpl());
        TextLayoutResult layoutResult = textFieldSelectionState.textLayoutState.getLayoutResult();
        w01 w01Var = w01.a;
        if (layoutResult == null) {
            return w01Var;
        }
        textFieldSelectionState.m1409updateHandleDraggingUv8p0NA(handle, Offset.m4521plusMKHz9U(ii0Var2.d, ii0Var.d));
        int m7030getOffsetForPositionk4lQ0M = z ? layoutResult.m7030getOffsetForPositionk4lQ0M(textFieldSelectionState.m1407getHandleDragPositionF1C5BW0()) : TextRange.m7060getStartimpl(textFieldSelectionState.textFieldState.getVisualText().m1239getSelectiond9O1mEE());
        int m7055getEndimpl = z ? TextRange.m7055getEndimpl(textFieldSelectionState.textFieldState.getVisualText().m1239getSelectiond9O1mEE()) : layoutResult.m7030getOffsetForPositionk4lQ0M(textFieldSelectionState.m1407getHandleDragPositionF1C5BW0());
        long m1239getSelectiond9O1mEE = textFieldSelectionState.textFieldState.getVisualText().m1239getSelectiond9O1mEE();
        long m1406updateSelectionSsLRf8$foundation$default = m1406updateSelectionSsLRf8$foundation$default(textFieldSelectionState, textFieldSelectionState.textFieldState.getVisualText(), m7030getOffsetForPositionk4lQ0M, m7055getEndimpl, z, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), false, false, 96, null);
        if (TextRange.m7054getCollapsedimpl(m1239getSelectiond9O1mEE) || !TextRange.m7054getCollapsedimpl(m1406updateSelectionSsLRf8$foundation$default)) {
            textFieldSelectionState.textFieldState.m1366selectCharsIn5zctL8(m1406updateSelectionSsLRf8$foundation$default);
        }
        return w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String detectSelectionHandleDragGestures$lambda$4(TextFieldSelectionState textFieldSelectionState, Handle handle) {
        return "Selection Handle drag cancelled for draggingHandle: " + textFieldSelectionState.getDraggingHandle() + " definedOn: " + handle;
    }

    private static final void detectSelectionHandleDragGestures$onDragStop(ii0 ii0Var, TextFieldSelectionState textFieldSelectionState, ii0 ii0Var2) {
        if ((ii0Var.d & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            textFieldSelectionState.clearHandleDragging();
            Offset.Companion companion = Offset.Companion;
            ii0Var.d = companion.m4531getUnspecifiedF1C5BW0();
            ii0Var2.d = companion.m4532getZeroF1C5BW0();
            textFieldSelectionState.previousRawDragOffset = -1;
        }
    }

    private final Rect getContentRect() {
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        if (textLayoutCoordinates == null) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("textLayoutCoordinates should not be null.");
            o.j();
            return null;
        }
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        if (TextRange.m7054getCollapsedimpl(visualText.m1239getSelectiond9O1mEE())) {
            Rect cursorRect = getCursorRect();
            return RectKt.m4556Recttz77jQw(textLayoutCoordinates.mo6245localToRootMKHz9U(cursorRect.m4551getTopLeftF1C5BW0()), cursorRect.m4549getSizeNHjbRc());
        }
        long mo6245localToRootMKHz9U = textLayoutCoordinates.mo6245localToRootMKHz9U(m1400getHandlePositiontuRUvjQ(true));
        long mo6245localToRootMKHz9U2 = textLayoutCoordinates.mo6245localToRootMKHz9U(m1400getHandlePositiontuRUvjQ(false));
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.Companion.getZero();
        }
        float top = layoutResult.getCursorRect(TextRange.m7060getStartimpl(visualText.m1239getSelectiond9O1mEE())).getTop();
        float intBitsToFloat = Float.intBitsToFloat((int) (textLayoutCoordinates.mo6245localToRootMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(top) & 4294967295L))) & 4294967295L));
        float top2 = layoutResult.getCursorRect(TextRange.m7055getEndimpl(visualText.m1239getSelectiond9O1mEE())).getTop();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (textLayoutCoordinates.mo6245localToRootMKHz9U(Offset.m4508constructorimpl((Float.floatToRawIntBits(top2) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))) & 4294967295L));
        int i = (int) (mo6245localToRootMKHz9U >> 32);
        int i2 = (int) (mo6245localToRootMKHz9U2 >> 32);
        return new Rect(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(intBitsToFloat, intBitsToFloat2), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat((int) (mo6245localToRootMKHz9U & 4294967295L)), Float.intBitsToFloat((int) (mo6245localToRootMKHz9U2 & 4294967295L))));
    }

    /* renamed from: getCurrentTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m1399getCurrentTextLayoutPositionInWindowF1C5BW0() {
        LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
        return textLayoutCoordinates != null ? LayoutCoordinatesKt.positionInWindow(textLayoutCoordinates) : Offset.Companion.m4531getUnspecifiedF1C5BW0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getHandlePosition-tuRUvjQ, reason: not valid java name */
    public final long m1400getHandlePositiontuRUvjQ(boolean z) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m4532getZeroF1C5BW0();
        }
        long m1239getSelectiond9O1mEE = this.textFieldState.getVisualText().m1239getSelectiond9O1mEE();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(layoutResult, z ? TextRange.m7060getStartimpl(m1239getSelectiond9O1mEE) : TextRange.m7055getEndimpl(m1239getSelectiond9O1mEE), z, TextRange.m7059getReversedimpl(m1239getSelectiond9O1mEE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getRawHandleDragPosition-F1C5BW0, reason: not valid java name */
    private final long m1401getRawHandleDragPositionF1C5BW0() {
        return ((Offset) this.rawHandleDragPosition$delegate.getValue()).m4526unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartTextLayoutPositionInWindow-F1C5BW0, reason: not valid java name */
    private final long m1402getStartTextLayoutPositionInWindowF1C5BW0() {
        return ((Offset) this.startTextLayoutPositionInWindow$delegate.getValue()).m4526unboximpl();
    }

    /* renamed from: getTextFieldSelection-qeG_v_k, reason: not valid java name */
    private final long m1403getTextFieldSelectionqeG_v_k(int i, int i2, TextRange textRange, boolean z, SelectionAdjustment selectionAdjustment) {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextRange.Companion.m7065getZerod9O1mEE();
        }
        if (textRange == null && q10.b(selectionAdjustment, SelectionAdjustment.Companion.getCharacter())) {
            return TextRangeKt.TextRange(i, i2);
        }
        SelectionLayout m1509getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m1509getTextFieldSelectionLayoutRcvTLA(layoutResult, i, i2, this.previousRawDragOffset, textRange != null ? textRange.m7064unboximpl() : TextRange.Companion.m7065getZerod9O1mEE(), textRange == null, z);
        if (textRange != null && !m1509getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return textRange.m7064unboximpl();
        }
        long m1501toTextRanged9O1mEE = selectionAdjustment.adjust(m1509getTextFieldSelectionLayoutRcvTLA).m1501toTextRanged9O1mEE();
        this.previousSelectionLayout = m1509getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = z ? i : i2;
        return m1501toTextRanged9O1mEE;
    }

    private final LayoutCoordinates getTextLayoutCoordinates() {
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates == null || !textLayoutNodeCoordinates.isAttached()) {
            return null;
        }
        return textLayoutNodeCoordinates;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final TextToolbarState getTextToolbarState() {
        return (TextToolbarState) this.textToolbarState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideTextToolbar() {
        if (ComposeFoundationFlags.isNewContextMenuEnabled) {
            this.toolbarRequester.hide();
            return;
        }
        TextToolbarHandler textToolbarHandler = this.textToolbarHandler;
        if (textToolbarHandler != null) {
            textToolbarHandler.hideTextToolbar();
        }
    }

    private final boolean isCursorHandleInVisibleBounds() {
        Rect visibleBounds;
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            long m4543getBottomCenterF1C5BW0 = getCursorRect().m4543getBottomCenterF1C5BW0();
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            if (textLayoutCoordinates == null || (visibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates)) == null) {
                return false;
            }
            return SelectionManagerKt.m1535containsInclusiveUv8p0NA(visibleBounds, m4543getBottomCenterF1C5BW0);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markStartContentVisibleOffset() {
        m1405setStartTextLayoutPositionInWindowk4lQ0M(m1399getCurrentTextLayoutPositionInWindowF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextChanges(hm hmVar) {
        iw snapshotFlow = SnapshotStateKt.snapshotFlow(new gd(this, 5));
        TextFieldSelectionState$observeTextChanges$3 textFieldSelectionState$observeTextChanges$3 = TextFieldSelectionState$observeTextChanges$3.INSTANCE;
        fo0 fo0Var = p01.b;
        textFieldSelectionState$observeTextChanges$3.getClass();
        p01.f(2, textFieldSelectionState$observeTextChanges$3);
        Object collect = p01.j(snapshotFlow, fo0Var, textFieldSelectionState$observeTextChanges$3).collect(new rw(0, new hi0(), new jw() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextChanges$4
            @Override // defpackage.jw
            public final Object emit(TextFieldCharSequence textFieldCharSequence, hm hmVar2) {
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.None);
                return w01.a;
            }
        }), hmVar);
        w01 w01Var = w01.a;
        vn vnVar = vn.d;
        if (collect != vnVar) {
            collect = w01Var;
        }
        return collect == vnVar ? collect : w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldCharSequence observeTextChanges$lambda$0(TextFieldSelectionState textFieldSelectionState) {
        return textFieldSelectionState.textFieldState.getVisualText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeTextToolbarVisibility(hm hmVar) {
        iw snapshotFlow = SnapshotStateKt.snapshotFlow(new gd(this, 3));
        if (ComposeFoundationFlags.isNewContextMenuEnabled) {
            snapshotFlow = p01.j(snapshotFlow, new fo0(28), p01.c);
        }
        Object collect = snapshotFlow.collect(new jw() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$observeTextToolbarVisibility$4
            @Override // defpackage.jw
            public final Object emit(Rect rect, hm hmVar2) {
                Object showTextToolbar;
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                w01 w01Var = w01.a;
                if (rect != null) {
                    showTextToolbar = textFieldSelectionState.showTextToolbar(rect, hmVar2);
                    return showTextToolbar == vn.d ? showTextToolbar : w01Var;
                }
                textFieldSelectionState.hideTextToolbar();
                return w01Var;
            }
        }, hmVar);
        return collect == vn.d ? collect : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean observeTextToolbarVisibility$lambda$1$0(Rect rect) {
        return rect == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r11 == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r11 == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pasteAsPlainText(hm hmVar) {
        TextFieldSelectionState$pasteAsPlainText$1 textFieldSelectionState$pasteAsPlainText$1;
        int i;
        ClipEntry clipEntry;
        if (hmVar instanceof TextFieldSelectionState$pasteAsPlainText$1) {
            textFieldSelectionState$pasteAsPlainText$1 = (TextFieldSelectionState$pasteAsPlainText$1) hmVar;
            int i2 = textFieldSelectionState$pasteAsPlainText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$pasteAsPlainText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = textFieldSelectionState$pasteAsPlainText$1.result;
                i = textFieldSelectionState$pasteAsPlainText$1.label;
                w01 w01Var = w01.a;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    Clipboard clipboard = this.clipboard;
                    textFieldSelectionState$pasteAsPlainText$1.label = 1;
                    obj = clipboard.getClipEntry(textFieldSelectionState$pasteAsPlainText$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        String str = (String) obj;
                        if (str != null) {
                            TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, str, false, TextFieldEditUndoBehavior.NeverMerge, false, 10, null);
                        }
                        return w01Var;
                    }
                    p10.Q(obj);
                }
                clipEntry = (ClipEntry) obj;
                if (clipEntry != null) {
                    textFieldSelectionState$pasteAsPlainText$1.label = 2;
                    obj = ClipboardUtils_androidKt.readText(clipEntry, textFieldSelectionState$pasteAsPlainText$1);
                }
                return w01Var;
            }
        }
        textFieldSelectionState$pasteAsPlainText$1 = new TextFieldSelectionState$pasteAsPlainText$1(this, hmVar);
        Object obj2 = textFieldSelectionState$pasteAsPlainText$1.result;
        i = textFieldSelectionState$pasteAsPlainText$1.label;
        w01 w01Var2 = w01.a;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        clipEntry = (ClipEntry) obj2;
        if (clipEntry != null) {
        }
        return w01Var2;
    }

    /* renamed from: setRawHandleDragPosition-k-4lQ0M, reason: not valid java name */
    private final void m1404setRawHandleDragPositionk4lQ0M(long j) {
        this.rawHandleDragPosition$delegate.setValue(Offset.m4505boximpl(j));
    }

    /* renamed from: setStartTextLayoutPositionInWindow-k-4lQ0M, reason: not valid java name */
    private final void m1405setStartTextLayoutPositionInWindowk4lQ0M(long j) {
        this.startTextLayoutPositionInWindow$delegate.setValue(Offset.m4505boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextToolbarState(TextToolbarState textToolbarState) {
        this.textToolbarState$delegate.setValue(textToolbarState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showTextToolbar(Rect rect, hm hmVar) {
        Object showTextToolbar;
        boolean z = ComposeFoundationFlags.isNewContextMenuEnabled;
        w01 w01Var = w01.a;
        if (z) {
            this.toolbarRequester.show();
        } else {
            TextToolbarHandler textToolbarHandler = this.textToolbarHandler;
            if (textToolbarHandler != null && (showTextToolbar = textToolbarHandler.showTextToolbar(this, rect, hmVar)) == vn.d) {
                return showTextToolbar;
            }
        }
        return w01Var;
    }

    /* renamed from: updateSelection-SsL-Rf8$foundation$default, reason: not valid java name */
    public static /* synthetic */ long m1406updateSelectionSsLRf8$foundation$default(TextFieldSelectionState textFieldSelectionState, TextFieldCharSequence textFieldCharSequence, int i, int i2, boolean z, SelectionAdjustment selectionAdjustment, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            z2 = false;
        }
        if ((i3 & 64) != 0) {
            z3 = false;
        }
        return textFieldSelectionState.m1410updateSelectionSsLRf8$foundation(textFieldCharSequence, i, i2, z, selectionAdjustment, z2, z3);
    }

    public final void autofill() {
        iy iyVar = this.requestAutofillAction;
        if (iyVar != null) {
            iyVar.invoke();
        }
    }

    public final boolean canShowAutofillMenuItem() {
        return getEditable$foundation() && TextRange.m7054getCollapsedimpl(this.textFieldState.getVisualText().m1239getSelectiond9O1mEE());
    }

    public final boolean canShowCopyMenuItem() {
        return (TextRange.m7054getCollapsedimpl(getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE()) || this.isPassword || !ClipboardUtils_androidKt.isWriteSupported(this.clipboard)) ? false : true;
    }

    public final boolean canShowCutMenuItem() {
        return !TextRange.m7054getCollapsedimpl(getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE()) && getEditable$foundation() && !this.isPassword && ClipboardUtils_androidKt.isWriteSupported(this.clipboard);
    }

    public final boolean canShowPasteMenuItem() {
        if (getEditable$foundation() && ClipboardUtils_androidKt.isReadSupported(this.clipboard)) {
            if (this.clipboardPasteState.getHasText()) {
                return true;
            }
            iy iyVar = this.receiveContentConfiguration;
            if ((iyVar != null ? (ReceiveContentConfiguration) iyVar.invoke() : null) != null && this.clipboardPasteState.getHasClip()) {
                return true;
            }
        }
        return false;
    }

    public final boolean canShowSelectAllMenuItem() {
        return TextRange.m7056getLengthimpl(this.textFieldState.getVisualText().m1239getSelectiond9O1mEE()) != this.textFieldState.getVisualText().length();
    }

    public final void clearHandleDragging() {
        setDraggingHandle(null);
        Offset.Companion companion = Offset.Companion;
        m1404setRawHandleDragPositionk4lQ0M(companion.m4531getUnspecifiedF1C5BW0());
        m1405setStartTextLayoutPositionInWindowk4lQ0M(companion.m4531getUnspecifiedF1C5BW0());
    }

    public final Object copy(boolean z, hm hmVar) {
        AnnotatedString copyWithResult$foundation = copyWithResult$foundation(z);
        w01 w01Var = w01.a;
        if (copyWithResult$foundation == null) {
            return w01Var;
        }
        Object clipEntry = this.clipboard.setClipEntry(ClipboardUtils_androidKt.toClipEntry(copyWithResult$foundation), hmVar);
        return clipEntry == vn.d ? clipEntry : w01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnnotatedString copyWithResult$foundation(boolean z) {
        List list = null;
        Object[] objArr = 0;
        if (TextRange.m7054getCollapsedimpl(getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE()) || this.isPassword) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(this.textFieldState.getVisualText()).toString(), list, 2, objArr == true ? 1 : 0);
        if (z) {
            this.textFieldState.collapseSelectionToMax();
        }
        return annotatedString;
    }

    public final Object cursorHandleGestures(PointerInputScope pointerInputScope, hm hmVar) {
        Object n = p10.n(new TextFieldSelectionState$cursorHandleGestures$2(this, pointerInputScope, null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    public final Object cut(hm hmVar) {
        AnnotatedString cutWithResult = cutWithResult();
        w01 w01Var = w01.a;
        if (cutWithResult == null) {
            return w01Var;
        }
        Object clipEntry = this.clipboard.setClipEntry(ClipboardUtils_androidKt.toClipEntry(cutWithResult), hmVar);
        return clipEntry == vn.d ? clipEntry : w01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnnotatedString cutWithResult() {
        List list = null;
        Object[] objArr = 0;
        if (TextRange.m7054getCollapsedimpl(getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE()) || !getEditable$foundation() || this.isPassword) {
            return null;
        }
        AnnotatedString annotatedString = new AnnotatedString(TextFieldCharSequenceKt.getSelectedText(this.textFieldState.getVisualText()).toString(), list, 2, objArr == true ? 1 : 0);
        this.textFieldState.deleteSelectedText();
        return annotatedString;
    }

    public final void deselect() {
        if (!TextRange.m7054getCollapsedimpl(this.textFieldState.getVisualText().m1239getSelectiond9O1mEE())) {
            this.textFieldState.collapseSelectionToEnd();
        }
        setShowCursorHandle(false);
        updateTextToolbarState(TextToolbarState.None);
    }

    public final Object detectTextFieldTapGestures(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, iy iyVar, iy iyVar2, hm hmVar) {
        Object detectTextFieldTapGestures = TextFieldSelectionState_androidKt.detectTextFieldTapGestures(this, pointerInputScope, mutableInteractionSource, iyVar, iyVar2, hmVar);
        return detectTextFieldTapGestures == vn.d ? detectTextFieldTapGestures : w01.a;
    }

    public final Object detectTouchMode(PointerInputScope pointerInputScope, hm hmVar) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new TextFieldSelectionState$detectTouchMode$2(this, null), hmVar);
        return awaitPointerEventScope == vn.d ? awaitPointerEventScope : w01.a;
    }

    public final void dispose() {
        hideTextToolbar();
        this.hapticFeedBack = null;
    }

    public final TextFieldHandleState getCursorHandleState$foundation(boolean z) {
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        boolean showCursorHandle = getShowCursorHandle();
        boolean z2 = getDirectDragGestureInitiator() == InputType.None;
        Handle draggingHandle = getDraggingHandle();
        if (showCursorHandle && z2 && TextRange.m7054getCollapsedimpl(visualText.m1239getSelectiond9O1mEE()) && visualText.shouldShowSelection() && visualText.length() > 0 && (draggingHandle == Handle.Cursor || isCursorHandleInVisibleBounds())) {
            return new TextFieldHandleState(true, z ? getCursorRect().m4543getBottomCenterF1C5BW0() : Offset.Companion.m4531getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);
        }
        return TextFieldHandleState.Companion.getHidden();
    }

    public final Rect getCursorRect() {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        return layoutResult == null ? Rect.Companion.getZero() : calculateCursorRect(layoutResult, this.textFieldState.getVisualText());
    }

    public final Rect getDerivedVisibleContentBounds$foundation() {
        return (Rect) this.derivedVisibleContentBounds$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputType getDirectDragGestureInitiator() {
        return (InputType) this.directDragGestureInitiator$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    public final boolean getEditable$foundation() {
        return this.enabled && !this.readOnly;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Rect getFocusRect() {
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Rect.Companion.getZero();
        }
        if (!this.isFocused) {
            return FocusProperties.Companion.getUnsetFocusRect();
        }
        TextFieldCharSequence visualText = this.textFieldState.getVisualText();
        return TextLayoutStateKt.fromTextLayoutToDecoration(this.textLayoutState, TextRange.m7054getCollapsedimpl(visualText.m1239getSelectiond9O1mEE()) ? calculateCursorRect(layoutResult, visualText) : calculateSelectionRect(layoutResult, visualText));
    }

    /* renamed from: getHandleDragPosition-F1C5BW0, reason: not valid java name */
    public final long m1407getHandleDragPositionF1C5BW0() {
        return (m1401getRawHandleDragPositionF1C5BW0() & InlineClassHelperKt.DualUnsignedFloatMask) == InlineClassHelperKt.UnspecifiedPackedFloats ? Offset.Companion.m4531getUnspecifiedF1C5BW0() : (m1402getStartTextLayoutPositionInWindowF1C5BW0() & InlineClassHelperKt.DualUnsignedFloatMask) == InlineClassHelperKt.UnspecifiedPackedFloats ? TextLayoutStateKt.m1354fromDecorationToTextLayoutUv8p0NA(this.textLayoutState, m1401getRawHandleDragPositionF1C5BW0()) : Offset.m4521plusMKHz9U(m1401getRawHandleDragPositionF1C5BW0(), Offset.m4520minusMKHz9U(m1402getStartTextLayoutPositionInWindowF1C5BW0(), m1399getCurrentTextLayoutPositionInWindowF1C5BW0()));
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final PlatformSelectionBehaviors getPlatformSelectionBehaviors$foundation() {
        return this.platformSelectionBehaviors;
    }

    public final PressInteraction.Press getPressInteraction() {
        return this.pressInteraction;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final iy getReceiveContentConfiguration() {
        return this.receiveContentConfiguration;
    }

    public final iy getRequestAutofillAction() {
        return this.requestAutofillAction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (((r0 == null || (r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r0)) == null) ? false : androidx.compose.foundation.text.selection.SelectionManagerKt.m1535containsInclusiveUv8p0NA(r0, r4)) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TextFieldHandleState getSelectionHandleState$foundation(boolean z, boolean z2) {
        Rect visibleBounds;
        Handle handle = z ? Handle.SelectionStart : Handle.SelectionEnd;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return TextFieldHandleState.Companion.getHidden();
        }
        long m1239getSelectiond9O1mEE = this.textFieldState.getVisualText().m1239getSelectiond9O1mEE();
        if (TextRange.m7054getCollapsedimpl(m1239getSelectiond9O1mEE)) {
            return TextFieldHandleState.Companion.getHidden();
        }
        long m1400getHandlePositiontuRUvjQ = m1400getHandlePositiontuRUvjQ(z);
        if (getDirectDragGestureInitiator() == InputType.None) {
            if (getDraggingHandle() != handle) {
                LayoutCoordinates textLayoutCoordinates = getTextLayoutCoordinates();
            }
            if (!this.textFieldState.getVisualText().shouldShowSelection()) {
                return TextFieldHandleState.Companion.getHidden();
            }
            ResolvedTextDirection bidiRunDirection = layoutResult.getBidiRunDirection(z ? TextRange.m7060getStartimpl(m1239getSelectiond9O1mEE) : Math.max(TextRange.m7055getEndimpl(m1239getSelectiond9O1mEE) - 1, 0));
            boolean m7059getReversedimpl = TextRange.m7059getReversedimpl(m1239getSelectiond9O1mEE);
            if (z2) {
                LayoutCoordinates textLayoutCoordinates2 = getTextLayoutCoordinates();
                if (textLayoutCoordinates2 != null && (visibleBounds = SelectionManagerKt.visibleBounds(textLayoutCoordinates2)) != null) {
                    m1400getHandlePositiontuRUvjQ = TextLayoutStateKt.m1353coerceIn3MmeM6k(m1400getHandlePositiontuRUvjQ, visibleBounds);
                }
            } else {
                m1400getHandlePositiontuRUvjQ = Offset.Companion.m4531getUnspecifiedF1C5BW0();
            }
            return new TextFieldHandleState(true, m1400getHandlePositiontuRUvjQ, TextLayoutHelperKt.getLineHeight(layoutResult, z ? TextRange.m7060getStartimpl(m1239getSelectiond9O1mEE) : TextRange.m7055getEndimpl(m1239getSelectiond9O1mEE)), bidiRunDirection, m7059getReversedimpl, null);
        }
        return TextFieldHandleState.Companion.getHidden();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    public final TransformedTextFieldState getTextFieldState$foundation() {
        return this.textFieldState;
    }

    public final TextLayoutState getTextLayoutState$foundation() {
        return this.textLayoutState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getTextToolbarShown() {
        return ((Boolean) this.textToolbarShown$delegate.getValue()).booleanValue();
    }

    public final boolean isCopyAllowed() {
        return (TextRange.m7054getCollapsedimpl(getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE()) || this.isPassword) ? false : true;
    }

    public final boolean isCutAllowed() {
        return (TextRange.m7054getCollapsedimpl(getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE()) || !getEditable$foundation() || this.isPassword) ? false : true;
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    public final boolean isPasteAllowed() {
        return getEditable$foundation();
    }

    public final void maybeSuggestSelectionRange() {
        PlatformSelectionBehaviors platformSelectionBehaviors = this.platformSelectionBehaviors;
        if (platformSelectionBehaviors == null) {
            return;
        }
        CharSequence text = this.textFieldState.getVisualText().getText();
        long m1239getSelectiond9O1mEE = this.textFieldState.getVisualText().m1239getSelectiond9O1mEE();
        if (text.length() <= 0 || TextRange.m7054getCollapsedimpl(m1239getSelectiond9O1mEE)) {
            return;
        }
        p01.t(this.coroutineScope, null, xn.g, new TextFieldSelectionState$maybeSuggestSelectionRange$1(platformSelectionBehaviors, text, m1239getSelectiond9O1mEE, this, null), 1);
    }

    public final void onPasteEvent$foundation(AnnotatedString annotatedString) {
        if (getEditable$foundation()) {
            TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, annotatedString.getText(), false, TextFieldEditUndoBehavior.NeverMerge, false, 10, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
    
        if (r1 == r9) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object paste(hm hmVar) {
        TextFieldSelectionState$paste$1 textFieldSelectionState$paste$1;
        int i;
        ReceiveContentConfiguration receiveContentConfiguration;
        ClipEntry clipEntry;
        String readPlainText;
        if (hmVar instanceof TextFieldSelectionState$paste$1) {
            textFieldSelectionState$paste$1 = (TextFieldSelectionState$paste$1) hmVar;
            int i2 = textFieldSelectionState$paste$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                textFieldSelectionState$paste$1.label = i2 - Integer.MIN_VALUE;
                Object obj = textFieldSelectionState$paste$1.result;
                i = textFieldSelectionState$paste$1.label;
                w01 w01Var = w01.a;
                Object obj2 = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    iy iyVar = this.receiveContentConfiguration;
                    if (iyVar == null || (receiveContentConfiguration = (ReceiveContentConfiguration) iyVar.invoke()) == null) {
                        textFieldSelectionState$paste$1.label = 1;
                        if (pasteAsPlainText(textFieldSelectionState$paste$1) != obj2) {
                            return w01Var;
                        }
                    } else {
                        Clipboard clipboard = this.clipboard;
                        textFieldSelectionState$paste$1.L$0 = receiveContentConfiguration;
                        textFieldSelectionState$paste$1.label = 2;
                        obj = clipboard.getClipEntry(textFieldSelectionState$paste$1);
                    }
                }
                if (i == 1) {
                    p10.Q(obj);
                    return w01Var;
                }
                if (i != 2) {
                    if (i == 3) {
                        p10.Q(obj);
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                receiveContentConfiguration = (ReceiveContentConfiguration) textFieldSelectionState$paste$1.L$0;
                p10.Q(obj);
                ClipEntry clipEntry2 = (ClipEntry) obj;
                if (clipEntry2 == null) {
                    textFieldSelectionState$paste$1.L$0 = null;
                    textFieldSelectionState$paste$1.label = 3;
                    return pasteAsPlainText(textFieldSelectionState$paste$1) == obj2 ? obj2 : w01Var;
                }
                TransferableContent onReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry2, clipEntry2.getClipMetadata(), TransferableContent.Source.Companion.m326getClipboardkB6V9T0(), null, 8, null));
                if (onReceive != null && (clipEntry = onReceive.getClipEntry()) != null && (readPlainText = TransferableContent_androidKt.readPlainText(clipEntry)) != null) {
                    TransformedTextFieldState.replaceSelectedText$default(this.textFieldState, readPlainText, false, TextFieldEditUndoBehavior.NeverMerge, false, 10, null);
                }
                return w01Var;
            }
        }
        textFieldSelectionState$paste$1 = new TextFieldSelectionState$paste$1(this, hmVar);
        Object obj3 = textFieldSelectionState$paste$1.result;
        i = textFieldSelectionState$paste$1.label;
        w01 w01Var2 = w01.a;
        Object obj22 = vn.d;
        if (i != 0) {
        }
    }

    /* renamed from: placeCursorAtNearestOffset-k-4lQ0M, reason: not valid java name */
    public final boolean m1408placeCursorAtNearestOffsetk4lQ0M(long j) {
        int m7030getOffsetForPositionk4lQ0M;
        int m7060getStartimpl;
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null || (m7030getOffsetForPositionk4lQ0M = layoutResult.m7030getOffsetForPositionk4lQ0M(j)) == -1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        long m1361mapFromTransformedjx7JFs = transformedTextFieldState.m1361mapFromTransformedjx7JFs(m7030getOffsetForPositionk4lQ0M);
        long m1364mapToTransformedGEjPoXI = transformedTextFieldState.m1364mapToTransformedGEjPoXI(m1361mapFromTransformedjx7JFs);
        int i = WhenMappings.$EnumSwitchMapping$0[((TextRange.m7054getCollapsedimpl(m1361mapFromTransformedjx7JFs) && TextRange.m7054getCollapsedimpl(m1364mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m7054getCollapsedimpl(m1361mapFromTransformedjx7JFs) || TextRange.m7054getCollapsedimpl(m1364mapToTransformedGEjPoXI)) ? (!TextRange.m7054getCollapsedimpl(m1361mapFromTransformedjx7JFs) || TextRange.m7054getCollapsedimpl(m1364mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        SelectionWedgeAffinity selectionWedgeAffinity = null;
        if (i == 1) {
            m7060getStartimpl = TextRange.m7060getStartimpl(m1361mapFromTransformedjx7JFs);
        } else if (i == 2) {
            m7060getStartimpl = TextRange.m7060getStartimpl(m1361mapFromTransformedjx7JFs);
        } else if (i == 3) {
            selectionWedgeAffinity = MathUtilsKt.m1308findClosestRect9KIMszo(j, layoutResult.getCursorRect(TextRange.m7060getStartimpl(m1364mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m7055getEndimpl(m1364mapToTransformedGEjPoXI))) < 0 ? new SelectionWedgeAffinity(WedgeAffinity.Start) : new SelectionWedgeAffinity(WedgeAffinity.End);
            m7060getStartimpl = TextRange.m7060getStartimpl(m1361mapFromTransformedjx7JFs);
        } else {
            if (i != 4) {
                o.n();
                return false;
            }
            m7060getStartimpl = MathUtilsKt.m1308findClosestRect9KIMszo(j, layoutResult.getCursorRect(TextRange.m7060getStartimpl(m1364mapToTransformedGEjPoXI)), layoutResult.getCursorRect(TextRange.m7055getEndimpl(m1364mapToTransformedGEjPoXI))) < 0 ? TextRange.m7060getStartimpl(m1361mapFromTransformedjx7JFs) : TextRange.m7055getEndimpl(m1361mapFromTransformedjx7JFs);
        }
        long TextRange = TextRangeKt.TextRange(m7060getStartimpl);
        if (TextRange.m7053equalsimpl0(TextRange, this.textFieldState.getUntransformedText().m1239getSelectiond9O1mEE()) && (selectionWedgeAffinity == null || selectionWedgeAffinity.equals(this.textFieldState.getSelectionWedgeAffinity()))) {
            return false;
        }
        this.textFieldState.m1367selectUntransformedCharsIn5zctL8(TextRange);
        if (selectionWedgeAffinity != null) {
            this.textFieldState.setSelectionWedgeAffinity(selectionWedgeAffinity);
        }
        return true;
    }

    public final void selectAll() {
        this.textFieldState.selectAll();
    }

    public final Object selectionHandleGestures(PointerInputScope pointerInputScope, boolean z, hm hmVar) {
        Object n = p10.n(new TextFieldSelectionState$selectionHandleGestures$2(this, pointerInputScope, z, null), hmVar);
        return n == vn.d ? n : w01.a;
    }

    public final void setDirectDragGestureInitiator(InputType inputType) {
        this.directDragGestureInitiator$delegate.setValue(inputType);
    }

    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    public final void setFocused(boolean z) {
        this.isFocused = z;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setInTouchMode(boolean z) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setPressInteraction(PressInteraction.Press press) {
        this.pressInteraction = press;
    }

    public final void setReceiveContentConfiguration(iy iyVar) {
        this.receiveContentConfiguration = iyVar;
    }

    public final void setRequestAutofillAction(iy iyVar) {
        this.requestAutofillAction = iyVar;
    }

    public final void setShowCursorHandle(boolean z) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTextToolbarShown$foundation(boolean z) {
        this.textToolbarShown$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startToolbarAndHandlesVisibilityObserver(hm hmVar) {
        TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1;
        int i;
        try {
            if (hmVar instanceof TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) {
                textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 = (TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) hmVar;
                int i2 = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.result;
                    i = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.label;
                    if (i != 0) {
                        p10.Q(obj);
                        TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 = new TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2(this, null);
                        textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.label = 1;
                        obj = p10.n(textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2, textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1);
                        vn vnVar = vn.d;
                        if (obj == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                    }
                    return w01.a;
                }
            }
            if (i != 0) {
            }
            return w01.a;
        } finally {
            setShowCursorHandle(false);
            if (getTextToolbarState() != TextToolbarState.None) {
                hideTextToolbar();
            }
        }
        textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 = new TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1(this, hmVar);
        Object obj2 = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.result;
        i = textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1.label;
    }

    public final Object textFieldSelectionGestures(PointerInputScope pointerInputScope, iy iyVar, hm hmVar) {
        Object textFieldSelectionGestures = TextFieldSelectionState_androidKt.textFieldSelectionGestures(this, pointerInputScope, new TextFieldMouseSelectionObserver(iyVar), new TextFieldTextDragObserver(iyVar), hmVar);
        return textFieldSelectionGestures == vn.d ? textFieldSelectionGestures : w01.a;
    }

    public final void update(HapticFeedback hapticFeedback, Clipboard clipboard, TextToolbarHandler textToolbarHandler, Density density, boolean z, boolean z2, boolean z3) {
        if (!z) {
            hideTextToolbar();
        }
        this.hapticFeedBack = hapticFeedback;
        this.clipboard = clipboard;
        this.textToolbarHandler = textToolbarHandler;
        this.density = density;
        this.enabled = z;
        this.readOnly = z2;
        this.isPassword = z3;
    }

    public final Object updateClipboardEntry(hm hmVar) {
        Object update = this.clipboardPasteState.update(hmVar);
        return update == vn.d ? update : w01.a;
    }

    /* renamed from: updateHandleDragging-Uv8p0NA, reason: not valid java name */
    public final void m1409updateHandleDraggingUv8p0NA(Handle handle, long j) {
        setDraggingHandle(handle);
        m1404setRawHandleDragPositionk4lQ0M(j);
    }

    /* renamed from: updateSelection-SsL-Rf8$foundation, reason: not valid java name */
    public final long m1410updateSelectionSsLRf8$foundation(TextFieldCharSequence textFieldCharSequence, int i, int i2, boolean z, SelectionAdjustment selectionAdjustment, boolean z2, boolean z3) {
        HapticFeedback hapticFeedback;
        TextRange m7048boximpl = TextRange.m7048boximpl(textFieldCharSequence.m1239getSelectiond9O1mEE());
        long m7064unboximpl = m7048boximpl.m7064unboximpl();
        if (z3 || (!z2 && TextRange.m7054getCollapsedimpl(m7064unboximpl))) {
            m7048boximpl = null;
        }
        long m1403getTextFieldSelectionqeG_v_k = m1403getTextFieldSelectionqeG_v_k(i, i2, m7048boximpl, z, selectionAdjustment);
        if (!TextRange.m7053equalsimpl0(m1403getTextFieldSelectionqeG_v_k, textFieldCharSequence.m1239getSelectiond9O1mEE())) {
            boolean z4 = TextRange.m7059getReversedimpl(m1403getTextFieldSelectionqeG_v_k) != TextRange.m7059getReversedimpl(textFieldCharSequence.m1239getSelectiond9O1mEE()) && TextRange.m7053equalsimpl0(TextRangeKt.TextRange(TextRange.m7055getEndimpl(m1403getTextFieldSelectionqeG_v_k), TextRange.m7060getStartimpl(m1403getTextFieldSelectionqeG_v_k)), textFieldCharSequence.m1239getSelectiond9O1mEE());
            if (isInTouchMode() && !z4 && (hapticFeedback = this.hapticFeedBack) != null) {
                hapticFeedback.mo5532performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5549getTextHandleMove5zf0vsI());
            }
        }
        return m1403getTextFieldSelectionqeG_v_k;
    }

    public final void updateTextToolbarState(TextToolbarState textToolbarState) {
        setTextToolbarState(textToolbarState);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class TextFieldTextDragObserver implements TextDragObserver {
        private Handle actingHandle;
        private int dragBeginOffsetInText = -1;
        private long dragBeginPosition;
        private long dragTotalDistance;
        private boolean isLongPressSelectionOnly;
        private final iy requestFocus;
        private SelectionAdjustment selectionAdjustmentMode;

        public TextFieldTextDragObserver(iy iyVar) {
            this.requestFocus = iyVar;
            Offset.Companion companion = Offset.Companion;
            this.dragBeginPosition = companion.m4531getUnspecifiedF1C5BW0();
            this.dragTotalDistance = companion.m4532getZeroF1C5BW0();
            this.actingHandle = Handle.SelectionEnd;
            this.isLongPressSelectionOnly = true;
            this.selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();
        }

        private final void onDragStop() {
            if ((this.dragBeginPosition & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                TextFieldSelectionStateKt.logDebug(new b(4));
                TextFieldSelectionState.this.clearHandleDragging();
                this.dragBeginOffsetInText = -1;
                Offset.Companion companion = Offset.Companion;
                this.dragBeginPosition = companion.m4531getUnspecifiedF1C5BW0();
                this.dragTotalDistance = companion.m4532getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                this.selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.None);
                this.requestFocus.invoke();
                if (this.isLongPressSelectionOnly) {
                    TextFieldSelectionState.this.maybeSuggestSelectionRange();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onDragStop$lambda$0() {
            return "Touch.onDragStop";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onDrag_k_4lQ0M$lambda$0(long j) {
            return "Touch.onDrag at " + ((Object) Offset.m4524toStringimpl(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onStart_3MmeM6k$lambda$0(long j) {
            return "Touch.onDragStart after longPress at " + ((Object) Offset.m4524toStringimpl(j));
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onCancel() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDrag-k-4lQ0M */
        public void mo1171onDragk4lQ0M(long j) {
            int intValue;
            int m1349getOffsetForPosition3MmeM6k;
            SelectionAdjustment selectionAdjustment;
            Handle handle;
            if (!TextFieldSelectionState.this.getEnabled() || TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult() == null || TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().length() == 0) {
                return;
            }
            long m4521plusMKHz9U = Offset.m4521plusMKHz9U(this.dragTotalDistance, j);
            this.dragTotalDistance = m4521plusMKHz9U;
            long m4521plusMKHz9U2 = Offset.m4521plusMKHz9U(this.dragBeginPosition, m4521plusMKHz9U);
            TextFieldSelectionStateKt.logDebug(new c(m4521plusMKHz9U2, 1));
            if (this.dragBeginOffsetInText >= 0 || TextFieldSelectionState.this.getTextLayoutState$foundation().m1350isPositionOnTextk4lQ0M(m4521plusMKHz9U2)) {
                int i = this.dragBeginOffsetInText;
                Integer valueOf = Integer.valueOf(i);
                if (i < 0) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : TextFieldSelectionState.this.getTextLayoutState$foundation().m1349getOffsetForPosition3MmeM6k(this.dragBeginPosition, false);
                m1349getOffsetForPosition3MmeM6k = TextFieldSelectionState.this.getTextLayoutState$foundation().m1349getOffsetForPosition3MmeM6k(m4521plusMKHz9U2, false);
                if (this.dragBeginOffsetInText < 0 && intValue == m1349getOffsetForPosition3MmeM6k) {
                    return;
                }
                selectionAdjustment = this.selectionAdjustmentMode;
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
            } else {
                intValue = TextLayoutState.m1346getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.getTextLayoutState$foundation(), this.dragBeginPosition, false, 2, null);
                m1349getOffsetForPosition3MmeM6k = TextLayoutState.m1346getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.getTextLayoutState$foundation(), m4521plusMKHz9U2, false, 2, null);
                selectionAdjustment = intValue == m1349getOffsetForPosition3MmeM6k ? SelectionAdjustment.Companion.getNone() : this.selectionAdjustmentMode;
            }
            int i2 = intValue;
            int i3 = m1349getOffsetForPosition3MmeM6k;
            SelectionAdjustment selectionAdjustment2 = selectionAdjustment;
            long m1239getSelectiond9O1mEE = TextFieldSelectionState.this.getTextFieldState$foundation().getVisualText().m1239getSelectiond9O1mEE();
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            long m1406updateSelectionSsLRf8$foundation$default = TextFieldSelectionState.m1406updateSelectionSsLRf8$foundation$default(textFieldSelectionState, textFieldSelectionState.getTextFieldState$foundation().getVisualText(), i2, i3, false, selectionAdjustment2, false, false, 64, null);
            if (this.dragBeginOffsetInText == -1 && !TextRange.m7054getCollapsedimpl(m1406updateSelectionSsLRf8$foundation$default)) {
                this.dragBeginOffsetInText = TextRange.m7060getStartimpl(m1406updateSelectionSsLRf8$foundation$default);
            }
            if (TextRange.m7059getReversedimpl(m1406updateSelectionSsLRf8$foundation$default)) {
                m1406updateSelectionSsLRf8$foundation$default = TextFieldSelectionStateKt.m1417reverse5zctL8(m1406updateSelectionSsLRf8$foundation$default);
            }
            if (!TextRange.m7053equalsimpl0(m1406updateSelectionSsLRf8$foundation$default, m1239getSelectiond9O1mEE)) {
                if (TextRange.m7060getStartimpl(m1406updateSelectionSsLRf8$foundation$default) != TextRange.m7060getStartimpl(m1239getSelectiond9O1mEE) && TextRange.m7055getEndimpl(m1406updateSelectionSsLRf8$foundation$default) == TextRange.m7055getEndimpl(m1239getSelectiond9O1mEE)) {
                    handle = Handle.SelectionStart;
                } else if (TextRange.m7060getStartimpl(m1406updateSelectionSsLRf8$foundation$default) != TextRange.m7060getStartimpl(m1239getSelectiond9O1mEE) || TextRange.m7055getEndimpl(m1406updateSelectionSsLRf8$foundation$default) == TextRange.m7055getEndimpl(m1239getSelectiond9O1mEE)) {
                    handle = ((float) (TextRange.m7055getEndimpl(m1406updateSelectionSsLRf8$foundation$default) + TextRange.m7060getStartimpl(m1406updateSelectionSsLRf8$foundation$default))) / 2.0f > ((float) (TextRange.m7055getEndimpl(m1239getSelectiond9O1mEE) + TextRange.m7060getStartimpl(m1239getSelectiond9O1mEE))) / 2.0f ? Handle.SelectionEnd : Handle.SelectionStart;
                } else {
                    handle = Handle.SelectionEnd;
                }
                this.actingHandle = handle;
                this.isLongPressSelectionOnly = false;
            }
            if (TextRange.m7054getCollapsedimpl(m1239getSelectiond9O1mEE) || !TextRange.m7054getCollapsedimpl(m1406updateSelectionSsLRf8$foundation$default)) {
                TextFieldSelectionState.this.getTextFieldState$foundation().m1366selectCharsIn5zctL8(m1406updateSelectionSsLRf8$foundation$default);
            }
            TextFieldSelectionState.this.m1409updateHandleDraggingUv8p0NA(this.actingHandle, m4521plusMKHz9U2);
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onStart-3MmeM6k */
        public void mo1172onStart3MmeM6k(long j, SelectionAdjustment selectionAdjustment) {
            if (TextFieldSelectionState.this.getEnabled()) {
                TextFieldSelectionStateKt.logDebug(new c(j, 2));
                TextFieldSelectionState.this.m1409updateHandleDraggingUv8p0NA(this.actingHandle, j);
                TextFieldSelectionState.this.setShowCursorHandle(false);
                TextFieldSelectionState.this.setDirectDragGestureInitiator(InputType.Touch);
                this.dragBeginPosition = j;
                this.dragTotalDistance = Offset.Companion.m4532getZeroF1C5BW0();
                TextFieldSelectionState.this.previousRawDragOffset = -1;
                this.isLongPressSelectionOnly = true;
                this.selectionAdjustmentMode = selectionAdjustment;
                if (TextFieldSelectionState.this.getTextLayoutState$foundation().getLayoutResult() == null) {
                    return;
                }
                boolean m1350isPositionOnTextk4lQ0M = TextFieldSelectionState.this.getTextLayoutState$foundation().m1350isPositionOnTextk4lQ0M(j);
                TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
                if (!m1350isPositionOnTextk4lQ0M) {
                    int m1346getOffsetForPosition3MmeM6k$default = TextLayoutState.m1346getOffsetForPosition3MmeM6k$default(textFieldSelectionState.getTextLayoutState$foundation(), j, false, 2, null);
                    HapticFeedback hapticFeedBack = TextFieldSelectionState.this.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        hapticFeedBack.mo5532performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m5549getTextHandleMove5zf0vsI());
                    }
                    TextFieldSelectionState.this.getTextFieldState$foundation().placeCursorBeforeCharAt(m1346getOffsetForPosition3MmeM6k$default);
                    TextFieldSelectionState.this.setShowCursorHandle(true);
                    this.isLongPressSelectionOnly = false;
                    TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Cursor);
                    return;
                }
                if (textFieldSelectionState.getTextFieldState$foundation().getVisualText().length() == 0) {
                    return;
                }
                int m1346getOffsetForPosition3MmeM6k$default2 = TextLayoutState.m1346getOffsetForPosition3MmeM6k$default(TextFieldSelectionState.this.getTextLayoutState$foundation(), j, false, 2, null);
                TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                long m1406updateSelectionSsLRf8$foundation$default = TextFieldSelectionState.m1406updateSelectionSsLRf8$foundation$default(textFieldSelectionState2, new TextFieldCharSequence(textFieldSelectionState2.getTextFieldState$foundation().getVisualText(), TextRange.Companion.m7065getZerod9O1mEE(), null, null, null, null, 60, null), m1346getOffsetForPosition3MmeM6k$default2, m1346getOffsetForPosition3MmeM6k$default2, false, this.selectionAdjustmentMode, false, false, 96, null);
                TextFieldSelectionState.this.getTextFieldState$foundation().m1366selectCharsIn5zctL8(m1406updateSelectionSsLRf8$foundation$default);
                TextFieldSelectionState.this.updateTextToolbarState(TextToolbarState.Selection);
                this.dragBeginOffsetInText = TextRange.m7060getStartimpl(m1406updateSelectionSsLRf8$foundation$default);
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onStop() {
            onDragStop();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public void onUp() {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        /* renamed from: onDown-k-4lQ0M */
        public void mo1170onDownk4lQ0M(long j) {
        }
    }
}
