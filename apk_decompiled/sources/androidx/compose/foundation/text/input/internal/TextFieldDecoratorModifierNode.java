package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.AutofillHighlight_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.autofill.FillableData_androidKt;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import defpackage.bq;
import defpackage.hm;
import defpackage.iy;
import defpackage.jb0;
import defpackage.jw;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.pw;
import defpackage.q10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.w5;
import defpackage.wt0;
import defpackage.x6;
import defpackage.xn;
import defpackage.xt0;
import defpackage.z10;
import defpackage.zt0;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode, FocusPropertiesModifierNode {
    public static final int $stable = 8;
    private final MutableState autofillHighlightOn$delegate;
    private final ky clipboardKeyCommandsHandler;
    private final DragAndDropTargetModifierNode dragAndDropNode;
    private HoverInteraction.Enter dragEnterEvent;
    private boolean enabled;
    private InputTransformation filter;
    private final FocusableNode focusableNode;
    private z10 inputSessionJob;
    private MutableInteractionSource interactionSource;
    private boolean isPassword;
    private KeyboardActionHandler keyboardActionHandler;
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    private KeyboardOptions keyboardOptions;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private boolean readOnly;
    private final iy receiveContentConfigurationProvider;
    private boolean singleLine;
    private jb0 stylusHandwritingTrigger;
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private z10 toolbarAndHandlesVisibilityObserverJob;
    private WindowInfo windowInfo;

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSource mutableInteractionSource, boolean z4, jb0 jb0Var) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z3;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z4;
        this.stylusHandwritingTrigger = jb0Var;
        int i = 5;
        textFieldSelectionState.setRequestAutofillAction(new wt0(this, i));
        this.focusableNode = new FocusableNode(this.interactionSource, 0, new xt0(this, 0), 2, null);
        this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", l = {}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends us0 implements my {
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, PointerInputScope pointerInputScope, hm hmVar) {
                    super(2, hmVar);
                    this.this$0 = textFieldDecoratorModifierNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final w01 invokeSuspend$lambda$0$0(TextFieldSelectionState textFieldSelectionState, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
                    if (!textFieldSelectionState.isFocused()) {
                        textFieldDecoratorModifierNode.requestFocus();
                    }
                    return w01.a;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_SuspendingPointerInputModifierNode, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.my
                public final Object invoke(un unVar, hm hmVar) {
                    return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
                }

                @Override // defpackage.mc
                public final Object invokeSuspend(Object obj) {
                    if (this.label != 0) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    un unVar = (un) this.L$0;
                    TextFieldSelectionState textFieldSelectionState = this.this$0.getTextFieldSelectionState();
                    TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    f fVar = new f(1, textFieldSelectionState, textFieldDecoratorModifierNode);
                    TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 textFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 = new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1(textFieldSelectionState, pointerInputScope, null);
                    xn xnVar = xn.g;
                    p01.t(unVar, null, xnVar, textFieldDecoratorModifierNode$pointerInputNode$1$1$1$1, 1);
                    p01.t(unVar, null, xnVar, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(textFieldDecoratorModifierNode, textFieldSelectionState, pointerInputScope, fVar, null), 1);
                    p01.t(unVar, null, xnVar, new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3(textFieldSelectionState, pointerInputScope, fVar, null), 1);
                    return w01.a;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object n = p10.n(new AnonymousClass1(TextFieldDecoratorModifierNode.this, pointerInputScope, null), hmVar);
                return n == vn.d ? n : w01.a;
            }
        }));
        this.dragAndDropNode = (DragAndDropTargetModifierNode) delegate(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$default(new wt0(this, 7), new w5(this, 17), new xt0(this, 1), null, new xt0(this, 2), new xt0(this, 3), null, new xt0(this, 4), new xt0(this, i), 72, null));
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        int i2 = 6;
        this.clipboardKeyCommandsHandler = ClipboardKeyCommandsHandler.m1271constructorimpl(new xt0(this, i2));
        this.receiveContentConfigurationProvider = new wt0(this, i2);
        this.autofillHighlightOn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        DelegatableNodeKt.requestAutofill(textFieldDecoratorModifierNode);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$1(boolean z, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, FillableData fillableData) {
        if (!z) {
            return false;
        }
        CharSequence textValue = fillableData.getTextValue();
        if (textValue != null) {
            textFieldDecoratorModifierNode.textFieldState.replaceAll(textValue);
        }
        textFieldDecoratorModifierNode.setAutofillHighlightOn(true);
        p01.t(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$10(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        p01.t(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$11$1(textFieldDecoratorModifierNode, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$11(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        p01.t(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$12$1(textFieldDecoratorModifierNode, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, List list) {
        TextLayoutResult layoutResult = textFieldDecoratorModifierNode.textLayoutState.getLayoutResult();
        if (layoutResult != null) {
            return list.add(layoutResult);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$3(boolean z, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, AnnotatedString annotatedString) {
        if (!z) {
            return false;
        }
        textFieldDecoratorModifierNode.textFieldState.replaceAll(annotatedString);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$4(boolean z, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, AnnotatedString annotatedString) {
        if (!z) {
            return false;
        }
        TransformedTextFieldState.replaceSelectedText$default(textFieldDecoratorModifierNode.textFieldState, annotatedString, true, null, false, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$5(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i, int i2, boolean z) {
        TextFieldCharSequence untransformedText = z ? textFieldDecoratorModifierNode.textFieldState.getUntransformedText() : textFieldDecoratorModifierNode.textFieldState.getVisualText();
        long m1239getSelectiond9O1mEE = untransformedText.m1239getSelectiond9O1mEE();
        if (!textFieldDecoratorModifierNode.enabled || Math.min(i, i2) < 0 || Math.max(i, i2) > untransformedText.length()) {
            return false;
        }
        if (i == TextRange.m7060getStartimpl(m1239getSelectiond9O1mEE) && i2 == TextRange.m7055getEndimpl(m1239getSelectiond9O1mEE)) {
            return true;
        }
        long TextRange = TextRangeKt.TextRange(i, i2);
        if (z || i == i2) {
            textFieldDecoratorModifierNode.textFieldSelectionState.updateTextToolbarState(TextToolbarState.None);
        } else {
            textFieldDecoratorModifierNode.textFieldSelectionState.updateTextToolbarState(TextToolbarState.Selection);
        }
        TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.textFieldState;
        if (z) {
            transformedTextFieldState.m1367selectUntransformedCharsIn5zctL8(TextRange);
        } else {
            transformedTextFieldState.m1366selectCharsIn5zctL8(TextRange);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$6(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        textFieldDecoratorModifierNode.m1334onImeActionPerformedKlQnJC8(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$7(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        if (!textFieldDecoratorModifierNode.isFocused()) {
            textFieldDecoratorModifierNode.requestFocus();
            return true;
        }
        if (textFieldDecoratorModifierNode.readOnly) {
            return true;
        }
        textFieldDecoratorModifierNode.requireKeyboardController().show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$8(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        if (!textFieldDecoratorModifierNode.isFocused()) {
            textFieldDecoratorModifierNode.requestFocus();
        }
        textFieldDecoratorModifierNode.textFieldSelectionState.updateTextToolbarState(TextToolbarState.Selection);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$9(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        p01.t(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$10$1(textFieldDecoratorModifierNode, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 clipboardKeyCommandsHandler$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, KeyCommand keyCommand) {
        p01.t(textFieldDecoratorModifierNode.getCoroutineScope(), null, xn.g, new TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1(keyCommand, textFieldDecoratorModifierNode, null), 1);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: defaultKeyboardActionWithResult-KlQnJC8, reason: not valid java name */
    public final boolean m1333defaultKeyboardActionWithResultKlQnJC8(int i) {
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m7228equalsimpl0(i, companion.m7244getNexteUduSuo())) {
            ((FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager())).mo4403moveFocus3ESFkO8(FocusDirection.Companion.m4396getNextdhqQ8s());
            return true;
        }
        if (ImeAction.m7228equalsimpl0(i, companion.m7246getPreviouseUduSuo())) {
            ((FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager())).mo4403moveFocus3ESFkO8(FocusDirection.Companion.m4397getPreviousdhqQ8s());
            return true;
        }
        if (!ImeAction.m7228equalsimpl0(i, companion.m7242getDoneeUduSuo())) {
            return false;
        }
        requireKeyboardController().hide();
        return true;
    }

    private final void disposeInputSession() {
        z10 z10Var = this.inputSessionJob;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this.inputSessionJob = null;
        jb0 jb0Var = this.stylusHandwritingTrigger;
        if (jb0Var != null) {
            jb0Var.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set dragAndDropNode$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        Set set;
        Set set2;
        if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode) != null) {
            set2 = TextFieldDecoratorModifierKt.MediaTypesAll;
            return set2;
        }
        set = TextFieldDecoratorModifierKt.MediaTypesText;
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dragAndDropNode$lambda$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ClipEntry clipEntry, ClipMetadata clipMetadata) {
        ClipEntry clipEntry2;
        textFieldDecoratorModifierNode.emitDragExitEvent();
        textFieldDecoratorModifierNode.textFieldSelectionState.clearHandleDragging();
        String readPlainText = TransferableContent_androidKt.readPlainText(clipEntry);
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
        if (receiveContentConfiguration != null) {
            TransferableContent onReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.Companion.m327getDragAndDropkB6V9T0(), null, 8, null));
            readPlainText = (onReceive == null || (clipEntry2 = onReceive.getClipEntry()) == null) ? null : TransferableContent_androidKt.readPlainText(clipEntry2);
        }
        String str = readPlainText;
        if (str == null) {
            return true;
        }
        TransformedTextFieldState.replaceSelectedText$default(textFieldDecoratorModifierNode.textFieldState, str, false, null, false, 14, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 dragAndDropNode$lambda$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, DragAndDropEvent dragAndDropEvent) {
        if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode) != null) {
            DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(textFieldDecoratorModifierNode, dragAndDropEvent);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 dragAndDropNode$lambda$3(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, DragAndDropEvent dragAndDropEvent) {
        ReceiveContentListener receiveContentListener;
        HoverInteraction.Enter enter = new HoverInteraction.Enter();
        textFieldDecoratorModifierNode.interactionSource.tryEmit(enter);
        textFieldDecoratorModifierNode.dragEnterEvent = enter;
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
        if (receiveContentConfiguration != null && (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) != null) {
            receiveContentListener.onDragEnter();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 dragAndDropNode$lambda$4(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Offset offset) {
        long m1356fromWindowToDecorationUv8p0NA = TextLayoutStateKt.m1356fromWindowToDecorationUv8p0NA(textFieldDecoratorModifierNode.textLayoutState, offset.m4526unboximpl());
        int m1346getOffsetForPosition3MmeM6k$default = TextLayoutState.m1346getOffsetForPosition3MmeM6k$default(textFieldDecoratorModifierNode.textLayoutState, m1356fromWindowToDecorationUv8p0NA, false, 2, null);
        if (m1346getOffsetForPosition3MmeM6k$default >= 0) {
            textFieldDecoratorModifierNode.textFieldState.m1366selectCharsIn5zctL8(TextRangeKt.TextRange(m1346getOffsetForPosition3MmeM6k$default));
        }
        textFieldDecoratorModifierNode.textFieldSelectionState.m1409updateHandleDraggingUv8p0NA(Handle.Cursor, m1356fromWindowToDecorationUv8p0NA);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 dragAndDropNode$lambda$5(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, DragAndDropEvent dragAndDropEvent) {
        ReceiveContentListener receiveContentListener;
        textFieldDecoratorModifierNode.emitDragExitEvent();
        textFieldDecoratorModifierNode.textFieldSelectionState.clearHandleDragging();
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
        if (receiveContentConfiguration != null && (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) != null) {
            receiveContentListener.onDragExit();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 dragAndDropNode$lambda$6(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, DragAndDropEvent dragAndDropEvent) {
        textFieldDecoratorModifierNode.emitDragExitEvent();
        return w01.a;
    }

    private final void emitDragExitEvent() {
        HoverInteraction.Enter enter = this.dragEnterEvent;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.dragEnterEvent = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 focusableNode$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, boolean z) {
        boolean z2 = textFieldDecoratorModifierNode.enabled && !textFieldDecoratorModifierNode.readOnly;
        if (!z) {
            textFieldDecoratorModifierNode.disposeInputSession();
            TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.textFieldState;
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
            TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
            mainBuffer$foundation.commitComposition$foundation();
            transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
            textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
            textFieldDecoratorModifierNode.textFieldState.collapseSelectionToMax();
        } else if (z2) {
            textFieldDecoratorModifierNode.startInputSession(false);
        }
        textFieldDecoratorModifierNode.updateWindowFocus();
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAutofillHighlightOn() {
        return ((Boolean) this.autofillHighlightOn$delegate.getValue()).booleanValue();
    }

    private final boolean isFocused() {
        WindowInfo windowInfo;
        return this.focusableNode.getFocusState().isFocused() && (windowInfo = this.windowInfo) != null && windowInfo.isWindowFocused();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeUntransformedTextChanges(hm hmVar) {
        int i = 0;
        Object collect = new pw(new pw(SnapshotStateKt.snapshotFlow(new wt0(this, i)), i), 1).collect(new jw() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$observeUntransformedTextChanges$3
            @Override // defpackage.jw
            public final Object emit(String str, hm hmVar2) {
                TextFieldDecoratorModifierNode.this.setAutofillHighlightOn(false);
                return w01.a;
            }
        }, hmVar);
        return collect == vn.d ? collect : w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String observeUntransformedTextChanges$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        return textFieldDecoratorModifierNode.textFieldState.getUntransformedText().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final boolean m1334onImeActionPerformedKlQnJC8(int i) {
        KeyboardActionHandler keyboardActionHandler;
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m7228equalsimpl0(i, companion.m7245getNoneeUduSuo()) || ImeAction.m7228equalsimpl0(i, companion.m7241getDefaulteUduSuo()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            return m1333defaultKeyboardActionWithResultKlQnJC8(i);
        }
        keyboardActionHandler.onKeyboardAction(new zt0(this, i, 0));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onImeActionPerformed_KlQnJC8$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i) {
        textFieldDecoratorModifierNode.keyboardActionScope.mo1118defaultKeyboardActionKlQnJC8(i);
        return w01.a;
    }

    private final void onIsFocusedUpdated() {
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() && this.toolbarAndHandlesVisibilityObserverJob == null) {
            this.toolbarAndHandlesVisibilityObserverJob = p01.t(getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$onIsFocusedUpdated$1(this, null), 3);
        } else {
            if (isFocused()) {
                return;
            }
            z10 z10Var = this.toolbarAndHandlesVisibilityObserverJob;
            if (z10Var != null) {
                z10Var.cancel(null);
            }
            this.toolbarAndHandlesVisibilityObserverJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onKeyEvent_ZmokQxo$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        return textFieldDecoratorModifierNode.m1334onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.keyboardOptions.m1132getImeActionOrDefaulteUduSuo$foundation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestFocus() {
        if (this.focusableNode.isAttached()) {
            this.focusableNode.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        o.f("No software keyboard controller");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAutofillHighlightOn(boolean z) {
        this.autofillHighlightOn$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInputSession(boolean z) {
        if (z || this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation()) {
            this.inputSessionJob = p01.t(getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$startInputSession$1(this, ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 updateNode$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        DelegatableNodeKt.requestAutofill(textFieldDecoratorModifierNode);
        return w01.a;
    }

    private final void updateWindowFocus() {
        ObserverModifierNodeKt.observeReads(this, new wt0(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 updateWindowFocus$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
        textFieldDecoratorModifierNode.onIsFocusedUpdated();
        return w01.a;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setFocusRect(this.textFieldSelectionState.getFocusRect());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long m1239getSelectiond9O1mEE = outputText.m1239getSelectiond9O1mEE();
        final int i = 2;
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, new AnnotatedString(this.textFieldState.getUntransformedText().toString(), null, i, 0 == true ? 1 : 0));
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(outputText.toString(), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0));
        SemanticsPropertiesKt.m6849setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, m1239getSelectiond9O1mEE);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        final int i2 = 0;
        final int i3 = 1;
        final boolean z = this.enabled && !this.readOnly;
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z);
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getText());
        FillableData createFromText = FillableData_androidKt.createFromText(FillableData.Companion, outputText);
        if (createFromText != null) {
            SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, createFromText);
        }
        SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new ky() { // from class: yt0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                boolean applySemantics$lambda$1;
                int i4 = i2;
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this;
                boolean z2 = z;
                switch (i4) {
                    case 0:
                        applySemantics$lambda$1 = TextFieldDecoratorModifierNode.applySemantics$lambda$1(z2, textFieldDecoratorModifierNode, (FillableData) obj);
                        break;
                    case 1:
                        applySemantics$lambda$1 = TextFieldDecoratorModifierNode.applySemantics$lambda$3(z2, textFieldDecoratorModifierNode, (AnnotatedString) obj);
                        break;
                    default:
                        applySemantics$lambda$1 = TextFieldDecoratorModifierNode.applySemantics$lambda$4(z2, textFieldDecoratorModifierNode, (AnnotatedString) obj);
                        break;
                }
                return Boolean.valueOf(applySemantics$lambda$1);
            }
        }, 1, null);
        int m1133getKeyboardTypePjHm6EE = this.keyboardOptions.m1133getKeyboardTypePjHm6EE();
        KeyboardType.Companion companion = KeyboardType.Companion;
        if (KeyboardType.m7281equalsimpl0(m1133getKeyboardTypePjHm6EE, companion.m7297getEmailPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getEmailAddress());
        } else if (KeyboardType.m7281equalsimpl0(m1133getKeyboardTypePjHm6EE, companion.m7300getPasswordPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getPassword());
        } else if (KeyboardType.m7281equalsimpl0(m1133getKeyboardTypePjHm6EE, companion.m7299getNumberPasswordPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getPassword());
        } else if (KeyboardType.m7281equalsimpl0(m1133getKeyboardTypePjHm6EE, companion.m7301getPhonePjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getPhoneNumber());
        }
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new xt0(this, 7), 1, null);
        if (z) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new ky() { // from class: yt0
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    boolean applySemantics$lambda$1;
                    int i4 = i3;
                    TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this;
                    boolean z2 = z;
                    switch (i4) {
                        case 0:
                            applySemantics$lambda$1 = TextFieldDecoratorModifierNode.applySemantics$lambda$1(z2, textFieldDecoratorModifierNode, (FillableData) obj);
                            break;
                        case 1:
                            applySemantics$lambda$1 = TextFieldDecoratorModifierNode.applySemantics$lambda$3(z2, textFieldDecoratorModifierNode, (AnnotatedString) obj);
                            break;
                        default:
                            applySemantics$lambda$1 = TextFieldDecoratorModifierNode.applySemantics$lambda$4(z2, textFieldDecoratorModifierNode, (AnnotatedString) obj);
                            break;
                    }
                    return Boolean.valueOf(applySemantics$lambda$1);
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new ky() { // from class: yt0
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    boolean applySemantics$lambda$1;
                    int i4 = i;
                    TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this;
                    boolean z2 = z;
                    switch (i4) {
                        case 0:
                            applySemantics$lambda$1 = TextFieldDecoratorModifierNode.applySemantics$lambda$1(z2, textFieldDecoratorModifierNode, (FillableData) obj);
                            break;
                        case 1:
                            applySemantics$lambda$1 = TextFieldDecoratorModifierNode.applySemantics$lambda$3(z2, textFieldDecoratorModifierNode, (AnnotatedString) obj);
                            break;
                        default:
                            applySemantics$lambda$1 = TextFieldDecoratorModifierNode.applySemantics$lambda$4(z2, textFieldDecoratorModifierNode, (AnnotatedString) obj);
                            break;
                    }
                    return Boolean.valueOf(applySemantics$lambda$1);
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new x6(this, 13), 1, null);
        int m1132getImeActionOrDefaulteUduSuo$foundation = this.keyboardOptions.m1132getImeActionOrDefaulteUduSuo$foundation();
        SemanticsPropertiesKt.m6844onImeAction9UiTYpY$default(semanticsPropertyReceiver, m1132getImeActionOrDefaulteUduSuo$foundation, null, new zt0(this, m1132getImeActionOrDefaulteUduSuo$foundation, i3), 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new wt0(this, 10), 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new wt0(this, 11), 1, null);
        if (!TextRange.m7054getCollapsedimpl(m1239getSelectiond9O1mEE) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new wt0(this, i3), 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new wt0(this, i), 1, null);
            }
        }
        if (z) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new wt0(this, 9), 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (getAutofillHighlightOn()) {
            DrawScope.m5328drawRectAsUm42w$default(contentDrawScope, AutofillHighlightKt.m1061resolveAutofillHighlightWkMShQ((Brush) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AutofillHighlightKt.getLocalAutofillHighlightBrush()), ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AutofillHighlightKt.getLocalAutofillHighlightColor())).m4771unboximpl(), AutofillHighlight_androidKt.autofillHighlightColor()), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final InputTransformation getFilter() {
        return this.filter;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final jb0 getStylusHandwritingTrigger() {
        return this.stylusHandwritingTrigger;
    }

    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
        if (this.enabled) {
            delegate(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(layoutCoordinates);
        if (this.enabled) {
            this.focusableNode.onGloballyPositioned(layoutCoordinates);
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo196onKeyEventZmokQxo(KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo1265onKeyEvent8zsqlwg(keyEvent, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.clipboardKeyCommandsHandler, requireKeyboardController(), this.enabled && !this.readOnly, this.singleLine, new wt0(this, 8));
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateWindowFocus();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.dragAndDropNode.onPlaced(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.pointerInputNode.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo198onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.mo1266onPreKeyEventMyFupTE(keyEvent, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo356onRemeasuredozmzZPI(long j) {
        this.dragAndDropNode.mo356onRemeasuredozmzZPI(j);
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setFilter(InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void setKeyboardActionHandler(KeyboardActionHandler keyboardActionHandler) {
        this.keyboardActionHandler = keyboardActionHandler;
    }

    public final void setKeyboardOptions(KeyboardOptions keyboardOptions) {
        this.keyboardOptions = keyboardOptions;
    }

    public final void setPassword(boolean z) {
        this.isPassword = z;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public final void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    public final void setStylusHandwritingTrigger(jb0 jb0Var) {
        this.stylusHandwritingTrigger = jb0Var;
    }

    public final void setTextFieldSelectionState(TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final void setTextFieldState(TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final void setTextLayoutState(TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final void updateNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSource mutableInteractionSource, boolean z4, jb0 jb0Var) {
        TextFieldSelectionState textFieldSelectionState2;
        boolean z5;
        z10 z10Var;
        boolean z6 = this.enabled;
        boolean z7 = z6 && !this.readOnly;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState3 = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource2 = this.interactionSource;
        boolean z8 = this.isPassword;
        jb0 jb0Var2 = this.stylusHandwritingTrigger;
        if (!z || z2) {
            textFieldSelectionState2 = textFieldSelectionState3;
            z5 = false;
        } else {
            textFieldSelectionState2 = textFieldSelectionState3;
            z5 = true;
        }
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z3;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z4;
        this.stylusHandwritingTrigger = jb0Var;
        if (z5 != z7 || !q10.b(transformedTextFieldState, transformedTextFieldState2) || !q10.b(keyboardOptions, keyboardOptions2) || !q10.b(jb0Var, jb0Var2)) {
            if (z5 && (isFocused() || this.inputSessionJob != null)) {
                startInputSession(false);
            } else if (!z5) {
                disposeInputSession();
            }
        }
        if (z != z6 || z5 != z7 || !ImeAction.m7228equalsimpl0(keyboardOptions.m1132getImeActionOrDefaulteUduSuo$foundation(), keyboardOptions2.m1132getImeActionOrDefaulteUduSuo$foundation()) || z4 != z8) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!q10.b(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.resetPointerInputHandler();
            if (isAttached()) {
                textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
                if (isFocused() && (z10Var = this.toolbarAndHandlesVisibilityObserverJob) != null) {
                    z10Var.cancel(null);
                    this.toolbarAndHandlesVisibilityObserverJob = p01.t(getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$updateNode$1(textFieldSelectionState, null), 3);
                }
            }
            textFieldSelectionState.setRequestAutofillAction(new wt0(this, 4));
        }
        if (!q10.b(mutableInteractionSource, mutableInteractionSource2)) {
            this.pointerInputNode.resetPointerInputHandler();
            if (this.focusableNode.isAttached()) {
                this.focusableNode.update(mutableInteractionSource);
            }
        }
        if (z != z6) {
            FocusableNode focusableNode = this.focusableNode;
            if (!z) {
                undelegate(focusableNode);
            } else {
                delegate(focusableNode);
                this.focusableNode.update(mutableInteractionSource);
            }
        }
    }
}
