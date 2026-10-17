package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextUndoManager;
import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.dq;
import defpackage.ks0;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;
import defpackage.xe0;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldState {
    public static final int $stable = 0;
    private final MutableState isEditing$delegate;
    private TextFieldBuffer mainBuffer;
    private final MutableVector<NotifyImeListener> notifyImeListeners;
    private final TextUndoManager textUndoManager;
    private final UndoState undoState;
    private final MutableState value$delegate;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface NotifyImeListener {
        void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        public static final int $stable = 0;
        public static final Saver INSTANCE = new Saver();

        private Saver() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public TextFieldState restore(Object obj) {
            obj.getClass();
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object obj3 = list.get(1);
            Object obj4 = list.get(2);
            Object obj5 = list.get(3);
            obj2.getClass();
            String str = (String) obj2;
            obj3.getClass();
            int intValue = ((Integer) obj3).intValue();
            obj4.getClass();
            long TextRange = TextRangeKt.TextRange(intValue, ((Integer) obj4).intValue());
            TextUndoManager.Companion.Saver saver = TextUndoManager.Companion.Saver.INSTANCE;
            obj5.getClass();
            TextUndoManager restore = saver.restore(obj5);
            restore.getClass();
            return new TextFieldState(str, TextRange, restore, (dq) null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope, TextFieldState textFieldState) {
            return y80.E(textFieldState.getText().toString(), Integer.valueOf(TextRange.m7060getStartimpl(textFieldState.m1241getSelectiond9O1mEE())), Integer.valueOf(TextRange.m7055getEndimpl(textFieldState.m1241getSelectiond9O1mEE())), TextUndoManager.Companion.Saver.INSTANCE.save(saverScope, textFieldState.getTextUndoManager$foundation()));
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[TextFieldEditUndoBehavior.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldState(String str, long j, TextUndoManager textUndoManager) {
        this.textUndoManager = textUndoManager;
        ChangeTracker changeTracker = null;
        TextFieldCharSequence textFieldCharSequence = null;
        OffsetMappingCalculator offsetMappingCalculator = null;
        this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(str, TextRangeKt.m7066coerceIn8ffj60Q(j, 0, str.length()), null, null, null, null, 60, null), changeTracker, textFieldCharSequence, offsetMappingCalculator, 14, 0 == true ? 1 : 0);
        this.isEditing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldCharSequence(str, j, null, null, null, null, 60, null), null, 2, null);
        this.undoState = new UndoState(this);
        this.notifyImeListeners = new MutableVector<>(new NotifyImeListener[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitEditAsUser(InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        List m1243finalizeComposingAnnotationsitr0ztk;
        List m1243finalizeComposingAnnotationsitr0ztk2;
        TextFieldCharSequence value$foundation = getValue$foundation();
        if (this.mainBuffer.getChangeTracker$foundation().getChangeCount() == 0 && TextRange.m7053equalsimpl0(value$foundation.m1239getSelectiond9O1mEE(), this.mainBuffer.m1231getSelectiond9O1mEE())) {
            if (q10.b(value$foundation.m1238getCompositionMzsxiRA(), this.mainBuffer.m1229getCompositionMzsxiRA$foundation()) && q10.b(value$foundation.getHighlight(), this.mainBuffer.getHighlight$foundation()) && q10.b(value$foundation.getComposingAnnotations(), this.mainBuffer.getComposingAnnotations$foundation())) {
                return;
            }
            TextFieldCharSequence value$foundation2 = getValue$foundation();
            String textFieldBuffer = this.mainBuffer.toString();
            long m1231getSelectiond9O1mEE = this.mainBuffer.m1231getSelectiond9O1mEE();
            TextRange m1229getCompositionMzsxiRA$foundation = this.mainBuffer.m1229getCompositionMzsxiRA$foundation();
            xe0 highlight$foundation = this.mainBuffer.getHighlight$foundation();
            m1243finalizeComposingAnnotationsitr0ztk2 = TextFieldStateKt.m1243finalizeComposingAnnotationsitr0ztk(this.mainBuffer.m1229getCompositionMzsxiRA$foundation(), this.mainBuffer.getComposingAnnotations$foundation());
            updateValueAndNotifyListeners(value$foundation2, new TextFieldCharSequence(textFieldBuffer, m1231getSelectiond9O1mEE, m1229getCompositionMzsxiRA$foundation, highlight$foundation, m1243finalizeComposingAnnotationsitr0ztk2, null, 32, null), z);
            return;
        }
        boolean z2 = false;
        boolean z3 = this.mainBuffer.getChangeTracker$foundation().getChangeCount() != 0;
        String textFieldBuffer2 = this.mainBuffer.toString();
        long m1231getSelectiond9O1mEE2 = this.mainBuffer.m1231getSelectiond9O1mEE();
        TextRange m1229getCompositionMzsxiRA$foundation2 = this.mainBuffer.m1229getCompositionMzsxiRA$foundation();
        xe0 highlight$foundation2 = this.mainBuffer.getHighlight$foundation();
        m1243finalizeComposingAnnotationsitr0ztk = TextFieldStateKt.m1243finalizeComposingAnnotationsitr0ztk(this.mainBuffer.m1229getCompositionMzsxiRA$foundation(), this.mainBuffer.getComposingAnnotations$foundation());
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(textFieldBuffer2, m1231getSelectiond9O1mEE2, m1229getCompositionMzsxiRA$foundation2, highlight$foundation2, m1243finalizeComposingAnnotationsitr0ztk, null, 32, null);
        if (inputTransformation == null) {
            if (z3 && z) {
                z2 = true;
            }
            updateValueAndNotifyListeners(value$foundation, textFieldCharSequence, z2);
            recordEditForUndo(value$foundation, textFieldCharSequence, this.mainBuffer.getChangeTracker$foundation(), textFieldEditUndoBehavior);
            return;
        }
        TextFieldBuffer textFieldBuffer3 = new TextFieldBuffer(textFieldCharSequence, this.mainBuffer.getChangeTracker$foundation(), value$foundation, null, 8, null);
        inputTransformation.transformInput(textFieldBuffer3);
        boolean Y = ks0.Y(textFieldBuffer3.asCharSequence(), textFieldCharSequence);
        boolean z4 = !Y;
        boolean m7053equalsimpl0 = TextRange.m7053equalsimpl0(textFieldBuffer3.m1231getSelectiond9O1mEE(), textFieldCharSequence.m1239getSelectiond9O1mEE());
        boolean z5 = !m7053equalsimpl0;
        if (Y && m7053equalsimpl0) {
            updateValueAndNotifyListeners(value$foundation, TextFieldBuffer.m1228toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer3, 0L, textFieldCharSequence.m1238getCompositionMzsxiRA(), null, null, 13, null), z);
        } else {
            syncMainBufferToTemporaryBuffer$foundation(textFieldBuffer3, z4, z5);
        }
        recordEditForUndo(value$foundation, getValue$foundation(), textFieldBuffer3.getChanges(), textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void commitEditAsUser$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
    }

    public static /* synthetic */ void editAsUser$foundation$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, ky kyVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        kyVar.invoke(textFieldState.getMainBuffer$foundation());
        textFieldState.commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isEditing() {
        return ((Boolean) this.isEditing$delegate.getValue()).booleanValue();
    }

    private final void recordEditForUndo(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, TextFieldBuffer.ChangeList changeList, TextFieldEditUndoBehavior textFieldEditUndoBehavior) {
        int i = WhenMappings.$EnumSwitchMapping$0[textFieldEditUndoBehavior.ordinal()];
        if (i == 1) {
            this.textUndoManager.clearHistory();
            return;
        }
        if (i == 2) {
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, true);
        } else if (i == 3) {
            TextUndoManagerKt.recordChanges(this.textUndoManager, textFieldCharSequence, textFieldCharSequence2, changeList, false);
        } else {
            o.n();
        }
    }

    private final void setEditing(boolean z) {
        this.isEditing$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setValue(TextFieldCharSequence textFieldCharSequence) {
        this.value$delegate.setValue(textFieldCharSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateValueAndNotifyListeners(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
        setValue(textFieldCharSequence2);
        finishEditing();
        MutableVector<NotifyImeListener> mutableVector = this.notifyImeListeners;
        NotifyImeListener[] notifyImeListenerArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            notifyImeListenerArr[i].onChange(textFieldCharSequence, textFieldCharSequence2, (!z || textFieldCharSequence.contentEquals(textFieldCharSequence2) || textFieldCharSequence.m1238getCompositionMzsxiRA() == null) ? false : true);
        }
    }

    public final void addNotifyImeListener$foundation(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.add(notifyImeListener);
    }

    public final void commitEdit(TextFieldBuffer textFieldBuffer) {
        TextFieldBuffer textFieldBuffer2;
        boolean z = textFieldBuffer.getChanges().getChangeCount() > 0;
        boolean m7053equalsimpl0 = TextRange.m7053equalsimpl0(textFieldBuffer.m1231getSelectiond9O1mEE(), this.mainBuffer.m1231getSelectiond9O1mEE());
        boolean z2 = !m7053equalsimpl0;
        if (!z && m7053equalsimpl0) {
            textFieldBuffer.setCanCallAddStyle$foundation(true);
        }
        if (z) {
            textFieldBuffer2 = textFieldBuffer;
            recordEditForUndo(getValue$foundation(), TextFieldBuffer.m1228toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer2, 0L, null, null, null, 15, null), textFieldBuffer2.getChanges(), TextFieldEditUndoBehavior.NeverMerge);
        } else {
            textFieldBuffer2 = textFieldBuffer;
        }
        syncMainBufferToTemporaryBuffer$foundation(textFieldBuffer2, z, z2);
    }

    public final void edit(ky kyVar) {
        TextFieldBuffer startEdit = startEdit();
        try {
            kyVar.invoke(startEdit);
            commitEdit(startEdit);
        } finally {
            finishEditing();
        }
    }

    public final void editAsUser$foundation(InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, ky kyVar) {
        getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        kyVar.invoke(getMainBuffer$foundation());
        commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
    }

    public final void editWithNoSideEffects$foundation(ky kyVar) {
        getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        kyVar.invoke(getMainBuffer$foundation());
        updateValueAndNotifyListeners(getValue$foundation(), TextFieldBuffer.m1228toTextFieldCharSequencewFTz33Y$foundation$default(getMainBuffer$foundation(), 0L, null, null, null, 15, null), true);
    }

    public final void finishEditing() {
        setEditing(false);
    }

    /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m1240getCompositionMzsxiRA() {
        return getValue$foundation().m1238getCompositionMzsxiRA();
    }

    public final TextFieldBuffer getMainBuffer$foundation() {
        return this.mainBuffer;
    }

    /* renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1241getSelectiond9O1mEE() {
        return getValue$foundation().m1239getSelectiond9O1mEE();
    }

    public final CharSequence getText() {
        return getValue$foundation().getText();
    }

    public final TextUndoManager getTextUndoManager$foundation() {
        return this.textUndoManager;
    }

    public final UndoState getUndoState() {
        return this.undoState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldCharSequence getValue$foundation() {
        return (TextFieldCharSequence) this.value$delegate.getValue();
    }

    public final void removeNotifyImeListener$foundation(NotifyImeListener notifyImeListener) {
        this.notifyImeListeners.remove(notifyImeListener);
    }

    public final void setMainBuffer$foundation(TextFieldBuffer textFieldBuffer) {
        this.mainBuffer = textFieldBuffer;
    }

    public final TextFieldBuffer startEdit() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (isEditing()) {
                InlineClassHelperKt.throwIllegalStateException("TextFieldState does not support concurrent or nested editing.");
            }
            setEditing(true);
            return new TextFieldBuffer(getValue$foundation(), null, null, null, 14, null);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void syncMainBufferToTemporaryBuffer$foundation(TextFieldBuffer textFieldBuffer, boolean z, boolean z2) {
        TextFieldCharSequence m1228toTextFieldCharSequencewFTz33Y$foundation$default = TextFieldBuffer.m1228toTextFieldCharSequencewFTz33Y$foundation$default(this.mainBuffer, 0L, null, null, null, 15, null);
        if (z) {
            ChangeTracker changeTracker = null;
            TextFieldCharSequence textFieldCharSequence = null;
            OffsetMappingCalculator offsetMappingCalculator = null;
            this.mainBuffer = new TextFieldBuffer(new TextFieldCharSequence(textFieldBuffer.toString(), textFieldBuffer.m1231getSelectiond9O1mEE(), null, null, null, null, 60, null), changeTracker, textFieldCharSequence, offsetMappingCalculator, 14, 0 == true ? 1 : 0);
        } else if (z2) {
            this.mainBuffer.m1233setSelection5zctL8(TextRangeKt.TextRange(TextRange.m7060getStartimpl(textFieldBuffer.m1231getSelectiond9O1mEE()), TextRange.m7055getEndimpl(textFieldBuffer.m1231getSelectiond9O1mEE())));
        }
        if (z || z2 || !q10.b(m1228toTextFieldCharSequencewFTz33Y$foundation$default.m1238getCompositionMzsxiRA(), textFieldBuffer.m1229getCompositionMzsxiRA$foundation())) {
            this.mainBuffer.commitComposition$foundation();
        }
        updateValueAndNotifyListeners(m1228toTextFieldCharSequencewFTz33Y$foundation$default, TextFieldBuffer.m1228toTextFieldCharSequencewFTz33Y$foundation$default(this.mainBuffer, 0L, null, null, null, 15, null), true);
    }

    public String toString() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        ky readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            return "TextFieldState(selection=" + ((Object) TextRange.m7063toStringimpl(m1241getSelectiond9O1mEE())) + ", text=\"" + ((Object) getText()) + "\")";
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public static /* synthetic */ void getMainBuffer$foundation$annotations() {
    }

    public static /* synthetic */ void getUndoState$annotations() {
    }

    public /* synthetic */ TextFieldState(String str, long j, TextUndoManager textUndoManager, dq dqVar) {
        this(str, j, textUndoManager);
    }

    public /* synthetic */ TextFieldState(String str, long j, dq dqVar) {
        this(str, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextFieldState(String str, long j, int i, dq dqVar) {
        this(str, (i & 2) != 0 ? TextRangeKt.TextRange(str.length()) : j, (dq) null);
        str = (i & 1) != 0 ? "" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldState(String str, long j) {
        this(str, j, new TextUndoManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (dq) null);
    }
}
