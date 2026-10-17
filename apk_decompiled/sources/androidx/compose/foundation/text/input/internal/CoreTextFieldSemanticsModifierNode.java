package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.autofill.FillableData_androidKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import defpackage.dq;
import defpackage.ds0;
import defpackage.fn;
import defpackage.ky;
import defpackage.q10;
import defpackage.w01;
import defpackage.x6;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean enabled;
    private FocusRequester focusRequester;
    private ImeOptions imeOptions;
    private boolean isPassword;
    private TextFieldSelectionManager manager;
    private OffsetMapping offsetMapping;
    private boolean readOnly;
    private LegacyTextFieldState state;
    private TransformedText transformedText;
    private TextFieldValue value;

    public CoreTextFieldSemanticsModifierNode(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z;
        this.enabled = z2;
        this.isPassword = z3;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        textFieldSelectionManager.setRequestAutofillAction$foundation(new fn(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$0(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        DelegatableNodeKt.requestAutofill(coreTextFieldSemanticsModifierNode);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$1(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, FillableData fillableData) {
        coreTextFieldSemanticsModifierNode.state.setJustAutofilled(true);
        coreTextFieldSemanticsModifierNode.state.setAutofillHighlightOn(true);
        LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.state;
        CharSequence textValue = fillableData.getTextValue();
        textValue.getClass();
        coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(legacyTextFieldState, (String) textValue, coreTextFieldSemanticsModifierNode.readOnly, coreTextFieldSemanticsModifierNode.enabled);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$10(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.manager.cut$foundation();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$11(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.manager.paste$foundation();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$2(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, List list) {
        if (coreTextFieldSemanticsModifierNode.state.getLayoutResult() == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = coreTextFieldSemanticsModifierNode.state.getLayoutResult();
        layoutResult.getClass();
        list.add(layoutResult.getValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$3(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, AnnotatedString annotatedString) {
        coreTextFieldSemanticsModifierNode.handleTextUpdateFromSemantics(coreTextFieldSemanticsModifierNode.state, annotatedString.getText(), coreTextFieldSemanticsModifierNode.readOnly, coreTextFieldSemanticsModifierNode.enabled);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$4(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        if (coreTextFieldSemanticsModifierNode.readOnly || !coreTextFieldSemanticsModifierNode.enabled) {
            return false;
        }
        androidx.compose.ui.text.input.TextInputSession inputSession = coreTextFieldSemanticsModifierNode.state.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onEditCommand$foundation(y80.E(new FinishComposingTextCommand(), new CommitTextCommand(annotatedString, 1)), coreTextFieldSemanticsModifierNode.state.getProcessor(), coreTextFieldSemanticsModifierNode.state.getOnValueChange(), inputSession);
            return true;
        }
        coreTextFieldSemanticsModifierNode.state.getOnValueChange().invoke(new TextFieldValue(ds0.u0(coreTextFieldSemanticsModifierNode.value.getText(), TextRange.m7060getStartimpl(coreTextFieldSemanticsModifierNode.value.m7310getSelectiond9O1mEE()), TextRange.m7055getEndimpl(coreTextFieldSemanticsModifierNode.value.m7310getSelectiond9O1mEE()), annotatedString).toString(), TextRangeKt.TextRange(annotatedString.length() + TextRange.m7060getStartimpl(coreTextFieldSemanticsModifierNode.value.m7310getSelectiond9O1mEE())), (TextRange) null, 4, (dq) null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$5(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, int i, int i2, boolean z) {
        if (!z) {
            i = coreTextFieldSemanticsModifierNode.offsetMapping.transformedToOriginal(i);
        }
        if (!z) {
            i2 = coreTextFieldSemanticsModifierNode.offsetMapping.transformedToOriginal(i2);
        }
        if (!coreTextFieldSemanticsModifierNode.enabled) {
            return false;
        }
        if (i == TextRange.m7060getStartimpl(coreTextFieldSemanticsModifierNode.value.m7310getSelectiond9O1mEE()) && i2 == TextRange.m7055getEndimpl(coreTextFieldSemanticsModifierNode.value.m7310getSelectiond9O1mEE())) {
            return false;
        }
        if (Math.min(i, i2) < 0 || Math.max(i, i2) > coreTextFieldSemanticsModifierNode.value.getAnnotatedString().length()) {
            coreTextFieldSemanticsModifierNode.manager.exitSelectionMode$foundation();
            return false;
        }
        if (z || i == i2) {
            coreTextFieldSemanticsModifierNode.manager.exitSelectionMode$foundation();
        } else {
            TextFieldSelectionManager.enterSelectionMode$foundation$default(coreTextFieldSemanticsModifierNode.manager, false, 1, null);
        }
        coreTextFieldSemanticsModifierNode.state.getOnValueChange().invoke(new TextFieldValue(coreTextFieldSemanticsModifierNode.value.getAnnotatedString(), TextRangeKt.TextRange(i, i2), (TextRange) null, 4, (dq) null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$6(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.state.getOnImeActionPerformed().invoke(ImeAction.m7225boximpl(coreTextFieldSemanticsModifierNode.imeOptions.m7257getImeActioneUduSuo()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$7(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        CoreTextFieldKt.tapToFocus(coreTextFieldSemanticsModifierNode.state, coreTextFieldSemanticsModifierNode.focusRequester, !coreTextFieldSemanticsModifierNode.readOnly);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$8(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        TextFieldSelectionManager.enterSelectionMode$foundation$default(coreTextFieldSemanticsModifierNode.manager, false, 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$9(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        TextFieldSelectionManager.copy$foundation$default(coreTextFieldSemanticsModifierNode.manager, false, 1, null);
        return true;
    }

    private final void handleTextUpdateFromSemantics(LegacyTextFieldState legacyTextFieldState, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        androidx.compose.ui.text.input.TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onEditCommand$foundation(y80.E(new DeleteAllCommand(), new CommitTextCommand(str, 1)), legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange(), inputSession);
        } else {
            legacyTextFieldState.getOnValueChange().invoke(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (dq) null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 updateNodeSemantics$lambda$0(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        DelegatableNodeKt.requestAutofill(coreTextFieldSemanticsModifierNode);
        return w01.a;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, this.value.getAnnotatedString());
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, this.transformedText.getText());
        SemanticsPropertiesKt.m6849setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, this.value.m7310getSelectiond9O1mEE());
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getText());
        FillableData createFromText = FillableData_androidKt.createFromText(FillableData.Companion, this.value.getAnnotatedString());
        if (createFromText != null) {
            SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, createFromText);
        }
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        final int i2 = 1;
        SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new ky(this) { // from class: gn
            public final /* synthetic */ CoreTextFieldSemanticsModifierNode e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                boolean applySemantics$lambda$1;
                int i3 = i;
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.e;
                switch (i3) {
                    case 0:
                        applySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$1(coreTextFieldSemanticsModifierNode, (FillableData) obj);
                        break;
                    case 1:
                        applySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$2(coreTextFieldSemanticsModifierNode, (List) obj);
                        break;
                    default:
                        applySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$3(coreTextFieldSemanticsModifierNode, (AnnotatedString) obj);
                        break;
                }
                return Boolean.valueOf(applySemantics$lambda$1);
            }
        }, 1, null);
        int m7258getKeyboardTypePjHm6EE = this.imeOptions.m7258getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion = KeyboardType.Companion;
        if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion.m7297getEmailPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getEmailAddress());
        } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion.m7300getPasswordPjHm6EE()) || KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion.m7299getNumberPasswordPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getPassword());
        } else if (KeyboardType.m7281equalsimpl0(m7258getKeyboardTypePjHm6EE, companion.m7301getPhonePjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getPhoneNumber());
        }
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        if (this.enabled && !this.readOnly) {
            z = true;
        }
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new ky(this) { // from class: gn
            public final /* synthetic */ CoreTextFieldSemanticsModifierNode e;

            {
                this.e = this;
            }

            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                boolean applySemantics$lambda$1;
                int i3 = i2;
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.e;
                switch (i3) {
                    case 0:
                        applySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$1(coreTextFieldSemanticsModifierNode, (FillableData) obj);
                        break;
                    case 1:
                        applySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$2(coreTextFieldSemanticsModifierNode, (List) obj);
                        break;
                    default:
                        applySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$3(coreTextFieldSemanticsModifierNode, (AnnotatedString) obj);
                        break;
                }
                return Boolean.valueOf(applySemantics$lambda$1);
            }
        }, 1, null);
        final int i3 = 2;
        if (z) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new ky(this) { // from class: gn
                public final /* synthetic */ CoreTextFieldSemanticsModifierNode e;

                {
                    this.e = this;
                }

                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    boolean applySemantics$lambda$1;
                    int i32 = i3;
                    CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.e;
                    switch (i32) {
                        case 0:
                            applySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$1(coreTextFieldSemanticsModifierNode, (FillableData) obj);
                            break;
                        case 1:
                            applySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$2(coreTextFieldSemanticsModifierNode, (List) obj);
                            break;
                        default:
                            applySemantics$lambda$1 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$3(coreTextFieldSemanticsModifierNode, (AnnotatedString) obj);
                            break;
                    }
                    return Boolean.valueOf(applySemantics$lambda$1);
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new defpackage.g(13, this, semanticsPropertyReceiver), 1, null);
        }
        int i4 = 3;
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new x6(this, i4), 1, null);
        SemanticsPropertiesKt.m6844onImeAction9UiTYpY$default(semanticsPropertyReceiver, this.imeOptions.m7257getImeActioneUduSuo(), null, new fn(this, 6), 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new fn(this, 7), 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new fn(this, i2), 1, null);
        if (!TextRange.m7054getCollapsedimpl(this.value.m7310getSelectiond9O1mEE()) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new fn(this, i3), 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new fn(this, i4), 1, null);
            }
        }
        if (!this.enabled || this.readOnly) {
            return;
        }
        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new fn(this, 5), 1, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final ImeOptions getImeOptions() {
        return this.imeOptions;
    }

    public final TextFieldSelectionManager getManager() {
        return this.manager;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public final TextFieldValue getValue() {
        return this.value;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setImeOptions(ImeOptions imeOptions) {
        this.imeOptions = imeOptions;
    }

    public final void setManager(TextFieldSelectionManager textFieldSelectionManager) {
        this.manager = textFieldSelectionManager;
    }

    public final void setOffsetMapping(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setPassword(boolean z) {
        this.isPassword = z;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public final void setState(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTransformedText(TransformedText transformedText) {
        this.transformedText = transformedText;
    }

    public final void setValue(TextFieldValue textFieldValue) {
        this.value = textFieldValue;
    }

    public final void updateNodeSemantics(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, boolean z3, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        boolean z4 = this.enabled;
        boolean z5 = false;
        boolean z6 = z4 && !this.readOnly;
        boolean z7 = this.isPassword;
        ImeOptions imeOptions2 = this.imeOptions;
        TextFieldSelectionManager textFieldSelectionManager2 = this.manager;
        if (z2 && !z) {
            z5 = true;
        }
        this.transformedText = transformedText;
        this.value = textFieldValue;
        this.state = legacyTextFieldState;
        this.readOnly = z;
        this.enabled = z2;
        this.offsetMapping = offsetMapping;
        this.manager = textFieldSelectionManager;
        this.imeOptions = imeOptions;
        this.focusRequester = focusRequester;
        if (z2 != z4 || z5 != z6 || !q10.b(imeOptions, imeOptions2) || z3 != z7 || !TextRange.m7054getCollapsedimpl(textFieldValue.m7310getSelectiond9O1mEE())) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (q10.b(textFieldSelectionManager, textFieldSelectionManager2)) {
            return;
        }
        textFieldSelectionManager.setRequestAutofillAction$foundation(new fn(this, 0));
    }
}
