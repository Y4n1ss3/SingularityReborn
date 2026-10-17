package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldBufferKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.d41;
import defpackage.dq;
import defpackage.gg;
import defpackage.hm;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.rn0;
import defpackage.vn;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransformedTextFieldState {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private final CodepointTransformation codepointTransformation;
    private final State<TransformedText> codepointTransformedText;
    private InputTransformation inputTransformation;
    private final OutputTransformation outputTransformation;
    private final State<TransformedText> outputTransformedText;
    private final MutableState selectionWedgeAffinity$delegate;
    private final TextFieldState textFieldState;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TransformedText {
        private final OffsetMappingCalculator offsetMapping;
        private final TextFieldCharSequence text;

        public TransformedText(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }

        public static /* synthetic */ TransformedText copy$default(TransformedText transformedText, TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator, int i, Object obj) {
            if ((i & 1) != 0) {
                textFieldCharSequence = transformedText.text;
            }
            if ((i & 2) != 0) {
                offsetMappingCalculator = transformedText.offsetMapping;
            }
            return transformedText.copy(textFieldCharSequence, offsetMappingCalculator);
        }

        public final TextFieldCharSequence component1() {
            return this.text;
        }

        public final OffsetMappingCalculator component2() {
            return this.offsetMapping;
        }

        public final TransformedText copy(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            return new TransformedText(textFieldCharSequence, offsetMappingCalculator);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) obj;
            return q10.b(this.text, transformedText.text) && q10.b(this.offsetMapping, transformedText.offsetMapping);
        }

        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        public final TextFieldCharSequence getText() {
            return this.text;
        }

        public int hashCode() {
            return this.offsetMapping.hashCode() + (this.text.hashCode() * 31);
        }

        public String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }
    }

    public TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.outputTransformation = outputTransformation;
        this.outputTransformedText = outputTransformation != null ? SnapshotStateKt.derivedStateOf(new rn0(5, this, outputTransformation)) : null;
        this.codepointTransformedText = codepointTransformation != null ? SnapshotStateKt.derivedStateOf(new rn0(6, this, codepointTransformation)) : null;
        this.selectionWedgeAffinity$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SelectionWedgeAffinity(WedgeAffinity.Start), null, 2, null);
    }

    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, outputTransformation, selectionWedgeAffinity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText codepointTransformedText$lambda$0$0(TransformedTextFieldState transformedTextFieldState, CodepointTransformation codepointTransformation) {
        TextFieldCharSequence value$foundation;
        TransformedText value;
        Companion companion = Companion;
        State<TransformedText> state = transformedTextFieldState.outputTransformedText;
        if (state == null || (value = state.getValue()) == null || (value$foundation = value.getText()) == null) {
            value$foundation = transformedTextFieldState.textFieldState.getValue$foundation();
        }
        return companion.calculateTransformedText(value$foundation, codepointTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectImeNotifications$lambda$0(TextFieldState.NotifyImeListener notifyImeListener, TransformedTextFieldState transformedTextFieldState, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
        TextFieldCharSequence text;
        TransformedText calculateTransformedText = Companion.calculateTransformedText(textFieldCharSequence, transformedTextFieldState.outputTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
        if (calculateTransformedText != null && (text = calculateTransformedText.getText()) != null) {
            textFieldCharSequence = text;
        }
        notifyImeListener.onChange(textFieldCharSequence, transformedTextFieldState.getVisualText(), z);
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(TransformedTextFieldState transformedTextFieldState, boolean z, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        kyVar.invoke(mainBuffer$foundation);
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
    }

    /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
    private static final long m1357mapFromTransformedxdX6G0(long j, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m1370mapFromTransformedxdX6G0(j, offsetMappingCalculator);
    }

    /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
    private static final long m1358mapToTransformedXGyztTk(long j, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.m1371mapToTransformedXGyztTk(j, offsetMappingCalculator, selectionWedgeAffinity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText outputTransformedText$lambda$0$0(TransformedTextFieldState transformedTextFieldState, OutputTransformation outputTransformation) {
        return Companion.calculateTransformedText(transformedTextFieldState.textFieldState.getValue$foundation(), outputTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
    }

    public static /* synthetic */ void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, z, textFieldEditUndoBehavior, z2);
    }

    /* renamed from: replaceText-M8tDOmk$default, reason: not valid java name */
    public static /* synthetic */ void m1359replaceTextM8tDOmk$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = textFieldEditUndoBehavior;
        if ((i & 8) != 0) {
            z = true;
        }
        transformedTextFieldState.m1365replaceTextM8tDOmk(charSequence, j, textFieldEditUndoBehavior2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWedgeAffinity(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChangeTracker$foundation().getChangeCount() <= 0 || !TextRange.m7054getCollapsedimpl(textFieldBuffer.m1231getSelectiond9O1mEE())) {
            return;
        }
        setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.Start));
    }

    public final void collapseSelectionToEnd() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation, TextRange.m7055getEndimpl(mainBuffer$foundation.m1231getSelectiond9O1mEE()), 0, 2, null);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToMax() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation, TextRange.m7057getMaximpl(mainBuffer$foundation.m1231getSelectiond9O1mEE()), 0, 2, null);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collectImeNotifications(final TextFieldState.NotifyImeListener notifyImeListener, hm hmVar) {
        TransformedTextFieldState$collectImeNotifications$1 transformedTextFieldState$collectImeNotifications$1;
        int i;
        if (hmVar instanceof TransformedTextFieldState$collectImeNotifications$1) {
            transformedTextFieldState$collectImeNotifications$1 = (TransformedTextFieldState$collectImeNotifications$1) hmVar;
            int i2 = transformedTextFieldState$collectImeNotifications$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transformedTextFieldState$collectImeNotifications$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transformedTextFieldState$collectImeNotifications$1.result;
                i = transformedTextFieldState$collectImeNotifications$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    if (this.outputTransformation != null) {
                        notifyImeListener = new TextFieldState.NotifyImeListener(this) { // from class: gw0
                            public final /* synthetic */ TransformedTextFieldState b;

                            {
                                this.b = this;
                            }

                            @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                            public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
                                TransformedTextFieldState.collectImeNotifications$lambda$0(notifyImeListener, this.b, textFieldCharSequence, textFieldCharSequence2, z);
                            }
                        };
                    }
                    transformedTextFieldState$collectImeNotifications$1.L$0 = notifyImeListener;
                    transformedTextFieldState$collectImeNotifications$1.label = 1;
                    gg ggVar = new gg(1, d41.C(transformedTextFieldState$collectImeNotifications$1));
                    ggVar.u();
                    this.textFieldState.addNotifyImeListener$foundation(notifyImeListener);
                    ggVar.d(new ky() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
                        public final void invoke(Throwable th) {
                            TransformedTextFieldState.this.textFieldState.removeNotifyImeListener$foundation(notifyImeListener);
                        }

                        @Override // defpackage.ky
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((Throwable) obj2);
                            return w01.a;
                        }
                    });
                    Object s = ggVar.s();
                    vn vnVar = vn.d;
                    if (s == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                o.j();
                return null;
            }
        }
        transformedTextFieldState$collectImeNotifications$1 = new TransformedTextFieldState$collectImeNotifications$1(this, hmVar);
        Object obj2 = transformedTextFieldState$collectImeNotifications$1.result;
        i = transformedTextFieldState$collectImeNotifications$1.label;
        if (i != 0) {
        }
        o.j();
        return null;
    }

    public final void deleteSelectedText() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        TextFieldBufferKt.delete(mainBuffer$foundation, TextRange.m7058getMinimpl(mainBuffer$foundation.m1231getSelectiond9O1mEE()), TextRange.m7057getMaximpl(mainBuffer$foundation.m1231getSelectiond9O1mEE()));
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation, TextRange.m7058getMinimpl(mainBuffer$foundation.m1231getSelectiond9O1mEE()), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void editUntransformedTextAsUser(boolean z, ky kyVar) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        kyVar.invoke(mainBuffer$foundation);
        updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) obj;
        if (q10.b(this.textFieldState, transformedTextFieldState.textFieldState) && q10.b(this.codepointTransformation, transformedTextFieldState.codepointTransformation)) {
            return q10.b(this.outputTransformation, transformedTextFieldState.outputTransformation);
        }
        return false;
    }

    public final TextFieldCharSequence getOutputText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.outputTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getUntransformedText() : text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SelectionWedgeAffinity getSelectionWedgeAffinity() {
        return (SelectionWedgeAffinity) this.selectionWedgeAffinity$delegate.getValue();
    }

    public final TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getValue$foundation();
    }

    public final TextFieldCharSequence getVisualText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.codepointTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getOutputText() : text;
    }

    public int hashCode() {
        int hashCode = this.textFieldState.hashCode() * 31;
        CodepointTransformation codepointTransformation = this.codepointTransformation;
        int hashCode2 = (hashCode + (codepointTransformation != null ? codepointTransformation.hashCode() : 0)) * 31;
        OutputTransformation outputTransformation = this.outputTransformation;
        return hashCode2 + (outputTransformation != null ? outputTransformation.hashCode() : 0);
    }

    /* renamed from: highlightCharsIn-7RAjNK8, reason: not valid java name */
    public final void m1360highlightCharsIn7RAjNK8(int i, long j) {
        long m1362mapFromTransformedGEjPoXI = m1362mapFromTransformedGEjPoXI(j);
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        textFieldState.getMainBuffer$foundation().m1232setHighlightK7f2yys$foundation(i, TextRange.m7060getStartimpl(m1362mapFromTransformedGEjPoXI), TextRange.m7055getEndimpl(m1362mapFromTransformedGEjPoXI));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: mapFromTransformed--jx7JFs, reason: not valid java name */
    public final long m1361mapFromTransformedjx7JFs(int i) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMappingCalculator = null;
        OffsetMappingCalculator offsetMapping = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getOffsetMapping();
        }
        long m1311mapFromDestjx7JFs = offsetMappingCalculator != null ? offsetMappingCalculator.m1311mapFromDestjx7JFs(i) : TextRangeKt.TextRange(i);
        return offsetMapping != null ? Companion.m1370mapFromTransformedxdX6G0(m1311mapFromDestjx7JFs, offsetMapping) : m1311mapFromDestjx7JFs;
    }

    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m1362mapFromTransformedGEjPoXI(long j) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMappingCalculator = null;
        OffsetMappingCalculator offsetMapping = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getOffsetMapping();
        }
        if (offsetMappingCalculator != null) {
            j = Companion.m1370mapFromTransformedxdX6G0(j, offsetMappingCalculator);
        }
        return offsetMapping != null ? Companion.m1370mapFromTransformedxdX6G0(j, offsetMapping) : j;
    }

    /* renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m1363mapToTransformedjx7JFs(int i) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMappingCalculator = null;
        OffsetMappingCalculator offsetMapping = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getOffsetMapping();
        }
        long m1312mapFromSourcejx7JFs = offsetMapping != null ? offsetMapping.m1312mapFromSourcejx7JFs(i) : TextRangeKt.TextRange(i);
        return offsetMappingCalculator != null ? Companion.m1371mapToTransformedXGyztTk(m1312mapFromSourcejx7JFs, offsetMappingCalculator, getSelectionWedgeAffinity()) : m1312mapFromSourcejx7JFs;
    }

    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m1364mapToTransformedGEjPoXI(long j) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMappingCalculator = null;
        OffsetMappingCalculator offsetMapping = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getOffsetMapping();
        }
        if (offsetMapping != null) {
            j = Companion.m1372mapToTransformedXGyztTk$default(Companion, j, offsetMapping, null, 4, null);
        }
        return offsetMappingCalculator != null ? Companion.m1371mapToTransformedXGyztTk(j, offsetMappingCalculator, getSelectionWedgeAffinity()) : j;
    }

    public final void placeCursorBeforeCharAt(int i) {
        m1366selectCharsIn5zctL8(TextRangeKt.TextRange(i));
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public final void replaceAll(CharSequence charSequence) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        TextFieldBufferKt.delete(mainBuffer$foundation, 0, mainBuffer$foundation.getLength());
        mainBuffer$foundation.append(charSequence.toString());
        updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void replaceSelectedText(CharSequence charSequence, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z2) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        if (z) {
            mainBuffer$foundation.commitComposition$foundation();
        }
        long m1231getSelectiond9O1mEE = mainBuffer$foundation.m1231getSelectiond9O1mEE();
        mainBuffer$foundation.replace(TextRange.m7058getMinimpl(m1231getSelectiond9O1mEE), TextRange.m7057getMaximpl(m1231getSelectiond9O1mEE), charSequence);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation, charSequence.length() + TextRange.m7058getMinimpl(m1231getSelectiond9O1mEE), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, z2, textFieldEditUndoBehavior);
    }

    /* renamed from: replaceText-M8tDOmk, reason: not valid java name */
    public final void m1365replaceTextM8tDOmk(CharSequence charSequence, long j, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        long m1362mapFromTransformedGEjPoXI = m1362mapFromTransformedGEjPoXI(j);
        mainBuffer$foundation.replace(TextRange.m7058getMinimpl(m1362mapFromTransformedGEjPoXI), TextRange.m7057getMaximpl(m1362mapFromTransformedGEjPoXI), charSequence);
        TextFieldBufferKt.setSelectionCoerced$default(mainBuffer$foundation, charSequence.length() + TextRange.m7058getMinimpl(m1362mapFromTransformedGEjPoXI), 0, 2, null);
        updateWedgeAffinity(mainBuffer$foundation);
        textFieldState.commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
    }

    public final void selectAll() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
        TextFieldBufferKt.setSelectionCoerced(mainBuffer$foundation, 0, mainBuffer$foundation.getLength());
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1366selectCharsIn5zctL8(long j) {
        m1367selectUntransformedCharsIn5zctL8(m1362mapFromTransformedGEjPoXI(j));
    }

    /* renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1367selectUntransformedCharsIn5zctL8(long j) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
        TextFieldBufferKt.setSelectionCoerced(textFieldState.getMainBuffer$foundation(), TextRange.m7060getStartimpl(j), TextRange.m7055getEndimpl(j));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void setSelectionWedgeAffinity(SelectionWedgeAffinity selectionWedgeAffinity) {
        this.selectionWedgeAffinity$delegate.setValue(selectionWedgeAffinity);
    }

    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", outputTransformation=" + this.outputTransformation + ", outputTransformedText=" + this.outputTransformedText + ", codepointTransformation=" + this.codepointTransformation + ", codepointTransformedText=" + this.codepointTransformedText + ", outputText=\"" + ((Object) getOutputText()) + "\", visualText=\"" + ((Object) getVisualText()) + "\")";
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }

    public final void update(InputTransformation inputTransformation) {
        this.inputTransformation = inputTransformation;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[WedgeAffinity.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WedgeAffinity.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            TextRange textRange = null;
            Object[] objArr = 0 == true ? 1 : 0;
            TextFieldBuffer textFieldBuffer = new TextFieldBuffer(textFieldCharSequence, objArr, null, offsetMappingCalculator, 6, null);
            textFieldBuffer.setCanCallAddStyle$foundation(true);
            outputTransformation.transformOutput(textFieldBuffer);
            textFieldBuffer.setCanCallAddStyle$foundation(false);
            List<AnnotatedString.Range<AnnotatedString.Annotation>> outputTransformationAnnotations$foundation = textFieldBuffer.getOutputTransformationAnnotations$foundation();
            if (textFieldBuffer.getChanges().getChangeCount() == 0 && (outputTransformationAnnotations$foundation == null || outputTransformationAnnotations$foundation.isEmpty())) {
                return null;
            }
            long m1371mapToTransformedXGyztTk = m1371mapToTransformedXGyztTk(textFieldCharSequence.m1239getSelectiond9O1mEE(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange m1238getCompositionMzsxiRA = textFieldCharSequence.m1238getCompositionMzsxiRA();
            if (m1238getCompositionMzsxiRA != null) {
                textRange = TextRange.m7048boximpl(TransformedTextFieldState.Companion.m1371mapToTransformedXGyztTk(m1238getCompositionMzsxiRA.m7064unboximpl(), offsetMappingCalculator, selectionWedgeAffinity));
            }
            return new TransformedText(TextFieldBuffer.m1228toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer, m1371mapToTransformedXGyztTk, textRange, null, outputTransformationAnnotations$foundation, 4, null), offsetMappingCalculator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
        public final long m1370mapFromTransformedxdX6G0(long j, OffsetMappingCalculator offsetMappingCalculator) {
            long m1311mapFromDestjx7JFs = offsetMappingCalculator.m1311mapFromDestjx7JFs(TextRange.m7060getStartimpl(j));
            long m1311mapFromDestjx7JFs2 = TextRange.m7054getCollapsedimpl(j) ? m1311mapFromDestjx7JFs : offsetMappingCalculator.m1311mapFromDestjx7JFs(TextRange.m7055getEndimpl(j));
            int min = Math.min(TextRange.m7058getMinimpl(m1311mapFromDestjx7JFs), TextRange.m7058getMinimpl(m1311mapFromDestjx7JFs2));
            int max = Math.max(TextRange.m7057getMaximpl(m1311mapFromDestjx7JFs), TextRange.m7057getMaximpl(m1311mapFromDestjx7JFs2));
            return TextRange.m7059getReversedimpl(j) ? TextRangeKt.TextRange(max, min) : TextRangeKt.TextRange(min, max);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
        public final long m1371mapToTransformedXGyztTk(long j, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
            long TextRange;
            long m1312mapFromSourcejx7JFs = offsetMappingCalculator.m1312mapFromSourcejx7JFs(TextRange.m7060getStartimpl(j));
            long m1312mapFromSourcejx7JFs2 = TextRange.m7054getCollapsedimpl(j) ? m1312mapFromSourcejx7JFs : offsetMappingCalculator.m1312mapFromSourcejx7JFs(TextRange.m7055getEndimpl(j));
            WedgeAffinity wedgeAffinity = null;
            WedgeAffinity startAffinity = selectionWedgeAffinity != null ? selectionWedgeAffinity.getStartAffinity() : null;
            if (TextRange.m7054getCollapsedimpl(j)) {
                wedgeAffinity = startAffinity;
            } else if (selectionWedgeAffinity != null) {
                wedgeAffinity = selectionWedgeAffinity.getEndAffinity();
            }
            if (startAffinity != null && !TextRange.m7054getCollapsedimpl(m1312mapFromSourcejx7JFs)) {
                int i = WhenMappings.$EnumSwitchMapping$0[startAffinity.ordinal()];
                if (i == 1) {
                    m1312mapFromSourcejx7JFs = TextRangeKt.TextRange(TextRange.m7060getStartimpl(m1312mapFromSourcejx7JFs));
                } else {
                    if (i != 2) {
                        o.n();
                        return 0L;
                    }
                    m1312mapFromSourcejx7JFs = TextRangeKt.TextRange(TextRange.m7055getEndimpl(m1312mapFromSourcejx7JFs));
                }
            }
            if (wedgeAffinity != null && !TextRange.m7054getCollapsedimpl(m1312mapFromSourcejx7JFs2)) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
                if (i2 == 1) {
                    TextRange = TextRangeKt.TextRange(TextRange.m7060getStartimpl(m1312mapFromSourcejx7JFs2));
                } else {
                    if (i2 != 2) {
                        o.n();
                        return 0L;
                    }
                    TextRange = TextRangeKt.TextRange(TextRange.m7055getEndimpl(m1312mapFromSourcejx7JFs2));
                }
                m1312mapFromSourcejx7JFs2 = TextRange;
            }
            int min = Math.min(TextRange.m7058getMinimpl(m1312mapFromSourcejx7JFs), TextRange.m7058getMinimpl(m1312mapFromSourcejx7JFs2));
            int max = Math.max(TextRange.m7057getMaximpl(m1312mapFromSourcejx7JFs), TextRange.m7057getMaximpl(m1312mapFromSourcejx7JFs2));
            return TextRange.m7059getReversedimpl(j) ? TextRangeKt.TextRange(max, min) : TextRangeKt.TextRange(min, max);
        }

        /* renamed from: mapToTransformed-XGyztTk$default, reason: not valid java name */
        public static /* synthetic */ long m1372mapToTransformedXGyztTk$default(Companion companion, long j, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity, int i, Object obj) {
            if ((i & 4) != 0) {
                selectionWedgeAffinity = null;
            }
            return companion.m1371mapToTransformedXGyztTk(j, offsetMappingCalculator, selectionWedgeAffinity);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence visualText = CodepointTransformationKt.toVisualText(textFieldCharSequence, codepointTransformation, offsetMappingCalculator);
            TextRange textRange = null;
            if (visualText == textFieldCharSequence) {
                return null;
            }
            long m1371mapToTransformedXGyztTk = m1371mapToTransformedXGyztTk(textFieldCharSequence.m1239getSelectiond9O1mEE(), offsetMappingCalculator, selectionWedgeAffinity);
            TextRange m1238getCompositionMzsxiRA = textFieldCharSequence.m1238getCompositionMzsxiRA();
            if (m1238getCompositionMzsxiRA != null) {
                textRange = TextRange.m7048boximpl(TransformedTextFieldState.Companion.m1371mapToTransformedXGyztTk(m1238getCompositionMzsxiRA.m7064unboximpl(), offsetMappingCalculator, selectionWedgeAffinity));
            }
            return new TransformedText(new TextFieldCharSequence(visualText, m1371mapToTransformedXGyztTk, textRange, null, null, null, 56, null), offsetMappingCalculator);
        }
    }

    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, codepointTransformation, selectionWedgeAffinity);
    }

    public /* synthetic */ TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, int i, dq dqVar) {
        this(textFieldState, (i & 2) != 0 ? null : inputTransformation, (i & 4) != 0 ? null : codepointTransformation, (i & 8) != 0 ? null : outputTransformation);
    }
}
