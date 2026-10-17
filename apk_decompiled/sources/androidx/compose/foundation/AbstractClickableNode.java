package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.dq;
import defpackage.hm;
import defpackage.iy;
import defpackage.m60;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.ra0;
import defpackage.ts;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, SemanticsModifierNode, TraversableNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, IndirectPointerInputModifierNode {
    private long centerOffset;
    private final ra0 currentKeyPressInteractions;
    private z10 delayJob;
    private boolean enabled;
    private final FocusableNode focusableNode;
    private HoverInteraction.Enter hoverInteraction;
    private DelegatableNode indicationNode;
    private IndicationNodeFactory indicationNodeFactory;
    private IndirectPointerClickDetector indirectPointerClickDetector;
    private Offset indirectPointerEventPressPosition;
    private PressInteraction.Press indirectPointerPressInteraction;
    private MutableInteractionSource interactionSource;
    private boolean lazilyCreateIndication;
    private IndicationNodeFactory localIndicationNodeFactory;
    private iy onClick;
    private String onClickLabel;
    private SuspendingPointerInputModifierNode pointerInputNode;
    private PressInteraction.Press pressInteraction;
    private Role role;
    private final boolean shouldAutoInvalidate;
    private final Object traverseKey;
    private boolean useLocalIndication;
    private MutableInteractionSource userProvidedInteractionSource;
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class IndirectPointerClickDetector {
        public static final int $stable = 8;
        private IndirectPointerInputChange downEvent;
        private final AbstractClickableNode node;

        public IndirectPointerClickDetector(AbstractClickableNode abstractClickableNode) {
            this.node = abstractClickableNode;
        }

        public final AbstractClickableNode getNode() {
            return this.node;
        }

        public final void processRawEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass, iy iyVar) {
            boolean changedToUp;
            boolean isMovingIgnoreConsumed;
            boolean changedToDownIgnoreConsumed;
            int i = 0;
            if (pointerEventPass != PointerEventPass.Main) {
                if (pointerEventPass != PointerEventPass.Final || this.downEvent == null) {
                    return;
                }
                List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
                int size = changes.size();
                while (i < size) {
                    IndirectPointerInputChange indirectPointerInputChange = changes.get(i);
                    if (indirectPointerInputChange.isConsumed() && indirectPointerInputChange != this.downEvent) {
                        resetDetector();
                        return;
                    }
                    i++;
                }
                return;
            }
            IndirectPointerInputChange indirectPointerInputChange2 = this.downEvent;
            if (indirectPointerInputChange2 == null) {
                List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
                int size2 = changes2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    changedToDownIgnoreConsumed = ClickableKt.changedToDownIgnoreConsumed(changes2.get(i2));
                    if (changedToDownIgnoreConsumed) {
                        IndirectPointerInputChange indirectPointerInputChange3 = indirectPointerEvent.getChanges().get(0);
                        this.downEvent = indirectPointerInputChange3;
                        this.node.m193handlePressInteractionStart3MmeM6k(indirectPointerInputChange3.m5605getPositionF1C5BW0(), true);
                        indirectPointerInputChange3.consume();
                        return;
                    }
                }
                return;
            }
            List<IndirectPointerInputChange> changes3 = indirectPointerEvent.getChanges();
            int size3 = changes3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                isMovingIgnoreConsumed = ClickableKt.isMovingIgnoreConsumed(changes3.get(i3));
                if (isMovingIgnoreConsumed) {
                    if (Math.abs(Offset.m4514getDistanceimpl(Offset.m4520minusMKHz9U(indirectPointerEvent.getChanges().get(0).m5605getPositionF1C5BW0(), indirectPointerInputChange2.m5605getPositionF1C5BW0()))) > ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.node, CompositionLocalsKt.getLocalViewConfiguration())).getTouchSlop()) {
                        resetDetector();
                        return;
                    }
                    return;
                }
            }
            List<IndirectPointerInputChange> changes4 = indirectPointerEvent.getChanges();
            int size4 = changes4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                changedToUp = ClickableKt.changedToUp(changes4.get(i4));
                if (!changedToUp) {
                    List<IndirectPointerInputChange> changes5 = indirectPointerEvent.getChanges();
                    int size5 = changes5.size();
                    while (i < size5) {
                        if (changes5.get(i).isConsumed()) {
                            resetDetector();
                            return;
                        }
                        i++;
                    }
                    return;
                }
            }
            indirectPointerEvent.getChanges().get(0).consume();
            this.node.m192handlePressInteractionRelease3MmeM6k(indirectPointerInputChange2.m5605getPositionF1C5BW0(), true);
            iyVar.invoke();
            this.downEvent = null;
        }

        public final void resetDetector() {
            if (this.downEvent != null) {
                this.downEvent = null;
                this.node.handlePressInteractionCancel(true);
            }
        }
    }

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, iy iyVar) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.useLocalIndication = z;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z2;
        this.onClick = iyVar;
        this.focusableNode = new FocusableNode(this.interactionSource, Focusability.Companion.m4452getSystemDefinedLCbbffg(), new AbstractClickableNode$focusableNode$1(this), null);
        ra0 ra0Var = m60.a;
        this.currentKeyPressInteractions = new ra0();
        this.centerOffset = Offset.Companion.m4532getZeroF1C5BW0();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
        this.traverseKey = TraverseKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applySemantics$lambda$0(AbstractClickableNode abstractClickableNode) {
        abstractClickableNode.onClick.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean delayPressInteraction() {
        return ClickableKt.hasScrollableContainer(this) || Clickable_androidKt.isComposeRootInScrollableContainer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverEnter() {
        if (this.hoverInteraction == null) {
            HoverInteraction.Enter enter = new HoverInteraction.Enter();
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, enter, null), 3);
            }
            this.hoverInteraction = enter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverExit() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, null), 3);
            }
            this.hoverInteraction = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 handlePressInteractionCancel$lambda$0$0$0(MutableInteractionSource mutableInteractionSource, PressInteraction.Cancel cancel, Throwable th) {
        mutableInteractionSource.tryEmit(cancel);
        return w01.a;
    }

    private final void initializeIndicationAndInteractionSourceIfNeeded() {
        if (this.indicationNode != null) {
            return;
        }
        IndicationNodeFactory indicationNodeFactory = this.useLocalIndication ? this.localIndicationNodeFactory : this.indicationNodeFactory;
        if (indicationNodeFactory != null) {
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource == null) {
                mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                this.interactionSource = mutableInteractionSource;
            }
            this.focusableNode.update(mutableInteractionSource);
            MutableInteractionSource mutableInteractionSource2 = this.interactionSource;
            mutableInteractionSource2.getClass();
            DelegatableNode create = indicationNodeFactory.create(mutableInteractionSource2);
            delegate(create);
            this.indicationNode = create;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange(boolean z) {
        if (z) {
            initializeIndicationAndInteractionSourceIfNeeded();
            return;
        }
        if (this.interactionSource != null) {
            ra0 ra0Var = this.currentKeyPressInteractions;
            Object[] objArr = ra0Var.c;
            long[] jArr = ra0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$onFocusChange$1$1(this, (PressInteraction.Press) objArr[(i << 3) + i3], null), 3);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            PressInteraction.Press press = this.indirectPointerPressInteraction;
            if (press != null) {
                p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$onFocusChange$2$1(this, press, null), 3);
            }
        }
        this.currentKeyPressInteractions.c();
        this.indirectPointerPressInteraction = null;
        onCancelKeyInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onObservedReadsChanged$lambda$0(AbstractClickableNode abstractClickableNode) {
        String unsupportedIndicationExceptionMessage;
        Indication indication = (Indication) CompositionLocalConsumerModifierNodeKt.currentValueOf(abstractClickableNode, IndicationKt.getLocalIndication());
        if (!(indication instanceof IndicationNodeFactory)) {
            unsupportedIndicationExceptionMessage = ClickableKt.unsupportedIndicationExceptionMessage(indication);
            InlineClassHelperKt.throwIllegalArgumentException(unsupportedIndicationExceptionMessage);
        }
        IndicationNodeFactory indicationNodeFactory = abstractClickableNode.localIndicationNodeFactory;
        IndicationNodeFactory indicationNodeFactory2 = (IndicationNodeFactory) indication;
        abstractClickableNode.localIndicationNodeFactory = indicationNodeFactory2;
        if (indicationNodeFactory != null && !q10.b(indicationNodeFactory2, indicationNodeFactory)) {
            abstractClickableNode.recreateIndicationIfNeeded();
        }
        return w01.a;
    }

    private final void recreateIndicationIfNeeded() {
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode == null && this.lazilyCreateIndication) {
            return;
        }
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
        initializeIndicationAndInteractionSourceIfNeeded();
    }

    private final boolean shouldLazilyCreateIndication() {
        return this.userProvidedInteractionSource == null;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, role.m6827unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new defpackage.f(this, 1));
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        applyAdditionalSemantics(semanticsPropertyReceiver);
    }

    public abstract SuspendingPointerInputModifierNode createPointerInputNodeIfNeeded();

    public final void disposeInteractions() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = this.pressInteraction;
            if (press != null) {
                mutableInteractionSource.tryEmit(new PressInteraction.Cancel(press));
            }
            PressInteraction.Press press2 = this.indirectPointerPressInteraction;
            if (press2 != null) {
                mutableInteractionSource.tryEmit(new PressInteraction.Cancel(press2));
            }
            HoverInteraction.Enter enter = this.hoverInteraction;
            if (enter != null) {
                mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enter));
            }
            ra0 ra0Var = this.currentKeyPressInteractions;
            Object[] objArr = ra0Var.c;
            long[] jArr = ra0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                mutableInteractionSource.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.pressInteraction = null;
        this.indirectPointerPressInteraction = null;
        this.indirectPointerEventPressPosition = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.c();
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final iy getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    public final Object m191handlePressInteractiond4ec7I(PressGestureScope pressGestureScope, long j, hm hmVar) {
        Object n;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (mutableInteractionSource == null || (n = p10.n(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j, mutableInteractionSource, this, null), hmVar)) != vn.d) ? w01.a : n;
    }

    public final void handlePressInteractionCancel(boolean z) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            z10 z10Var = this.delayJob;
            if (z10Var == null || !z10Var.isActive()) {
                PressInteraction.Press press = z ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (press != null) {
                    PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
                    z10 z10Var2 = (z10) getCoroutineScope().getCoroutineContext().get(ts.l);
                    p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionCancel$1$1$1(mutableInteractionSource, cancel, z10Var2 != null ? z10Var2.h(new defpackage.g(0, mutableInteractionSource, cancel)) : null, null), 3);
                }
            } else {
                z10 z10Var3 = this.delayJob;
                if (z10Var3 != null) {
                    z10Var3.cancel(null);
                }
            }
            if (z) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    /* renamed from: handlePressInteractionRelease-3MmeM6k, reason: not valid java name */
    public final void m192handlePressInteractionRelease3MmeM6k(long j, boolean z) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            z10 z10Var = this.delayJob;
            if (z10Var == null || !z10Var.isActive()) {
                PressInteraction.Press press = z ? this.indirectPointerPressInteraction : this.pressInteraction;
                if (press != null) {
                    p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$2$1(press, mutableInteractionSource, null), 3);
                }
            } else {
                z10Var.cancel(null);
                p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionRelease$1$1(z10Var, j, mutableInteractionSource, null), 3);
            }
            if (z) {
                this.indirectPointerPressInteraction = null;
            } else {
                this.pressInteraction = null;
            }
        }
    }

    /* renamed from: handlePressInteractionStart-3MmeM6k, reason: not valid java name */
    public final void m193handlePressInteractionStart3MmeM6k(long j, boolean z) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = new PressInteraction.Press(j, null);
            if (delayPressInteraction()) {
                this.delayJob = p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$1(mutableInteractionSource, press, z, this, null), 3);
                return;
            }
            if (z) {
                this.indirectPointerPressInteraction = press;
            } else {
                this.pressInteraction = press;
            }
            p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$handlePressInteractionStart$1$2(mutableInteractionSource, press, null), 3);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        if (!this.lazilyCreateIndication) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            delegate(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onCancelIndirectPointerInput() {
        IndirectPointerClickDetector indirectPointerClickDetector = this.indirectPointerClickDetector;
        if (indirectPointerClickDetector != null) {
            indirectPointerClickDetector.resetDetector();
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        HoverInteraction.Enter enter;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (enter = this.hoverInteraction) != null) {
            mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enter));
        }
        this.hoverInteraction = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    /* renamed from: onClickKeyDownEvent-ZmokQxo, reason: not valid java name */
    public abstract boolean mo194onClickKeyDownEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: onClickKeyUpEvent-ZmokQxo, reason: not valid java name */
    public abstract boolean mo195onClickKeyUpEventZmokQxo(KeyEvent keyEvent);

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled) {
            IndirectPointerClickDetector indirectPointerClickDetector = this.indirectPointerClickDetector;
            if (indirectPointerClickDetector == null) {
                indirectPointerClickDetector = new IndirectPointerClickDetector(this);
                this.indirectPointerClickDetector = indirectPointerClickDetector;
            }
            indirectPointerClickDetector.processRawEvent(indirectPointerEvent, pointerEventPass, this.onClick);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[RETURN] */
    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo196onKeyEventZmokQxo(KeyEvent keyEvent) {
        boolean m273isClickZmokQxo;
        boolean m275isPressZmokQxo;
        boolean z;
        initializeIndicationAndInteractionSourceIfNeeded();
        long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
        if (this.enabled) {
            m275isPressZmokQxo = ClickableKt.m275isPressZmokQxo(keyEvent);
            if (m275isPressZmokQxo) {
                if (this.currentKeyPressInteractions.a(m5932getKeyZmokQxo)) {
                    z = false;
                } else {
                    PressInteraction.Press press = new PressInteraction.Press(this.centerOffset, null);
                    this.currentKeyPressInteractions.h(m5932getKeyZmokQxo, press);
                    if (this.interactionSource != null) {
                        p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3);
                    }
                    z = true;
                }
                return mo194onClickKeyDownEventZmokQxo(keyEvent) || z;
            }
        }
        if (this.enabled) {
            m273isClickZmokQxo = ClickableKt.m273isClickZmokQxo(keyEvent);
            if (m273isClickZmokQxo) {
                PressInteraction.Press press2 = (PressInteraction.Press) this.currentKeyPressInteractions.g(m5932getKeyZmokQxo);
                if (press2 != null) {
                    if (this.interactionSource != null) {
                        p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2(this, press2, null), 3);
                    }
                    mo195onClickKeyUpEventZmokQxo(keyEvent);
                }
                if (press2 != null) {
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        if (this.useLocalIndication) {
            ObserverModifierNodeKt.observeReads(this, new defpackage.f(this, 0));
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        SuspendingPointerInputModifierNode createPointerInputNodeIfNeeded;
        long m7788getCenterozmzZPI = IntSizeKt.m7788getCenterozmzZPI(j);
        this.centerOffset = Offset.m4508constructorimpl((Float.floatToRawIntBits(IntOffset.m7739getXimpl(m7788getCenterozmzZPI)) << 32) | (Float.floatToRawIntBits(IntOffset.m7740getYimpl(m7788getCenterozmzZPI)) & 4294967295L));
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled && pointerEventPass == PointerEventPass.Main) {
            int m6034getType7fucELk = pointerEvent.m6034getType7fucELk();
            PointerEventType.Companion companion = PointerEventType.Companion;
            if (PointerEventType.m6041equalsimpl0(m6034getType7fucELk, companion.m6045getEnter7fucELk())) {
                p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
            } else if (PointerEventType.m6041equalsimpl0(m6034getType7fucELk, companion.m6046getExit7fucELk())) {
                p01.t(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
            }
        }
        if (this.pointerInputNode == null && (createPointerInputNodeIfNeeded = createPointerInputNodeIfNeeded()) != null) {
            this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(createPointerInputNodeIfNeeded);
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo198onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    public final w01 resetPointerInputHandler() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r2.indicationNode == null) goto L36;
     */
    /* renamed from: updateCommon-O2vRcR0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m199updateCommonO2vRcR0(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, iy iyVar) {
        boolean z3;
        boolean z4 = true;
        if (q10.b(this.userProvidedInteractionSource, mutableInteractionSource)) {
            z3 = false;
        } else {
            disposeInteractions();
            this.userProvidedInteractionSource = mutableInteractionSource;
            this.interactionSource = mutableInteractionSource;
            z3 = true;
        }
        if (!q10.b(this.indicationNodeFactory, indicationNodeFactory)) {
            this.indicationNodeFactory = indicationNodeFactory;
            z3 = true;
        }
        if (this.useLocalIndication != z) {
            this.useLocalIndication = z;
            if (z) {
                onObservedReadsChanged();
            }
            z3 = true;
        }
        if (this.enabled != z2) {
            FocusableNode focusableNode = this.focusableNode;
            if (z2) {
                delegate(focusableNode);
            } else {
                undelegate(focusableNode);
                disposeInteractions();
            }
            SemanticsModifierNodeKt.invalidateSemantics(this);
            this.enabled = z2;
        }
        if (!q10.b(this.onClickLabel, str)) {
            this.onClickLabel = str;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!q10.b(this.role, role)) {
            this.role = role;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.onClick = iyVar;
        if (this.lazilyCreateIndication != shouldLazilyCreateIndication()) {
            boolean shouldLazilyCreateIndication = shouldLazilyCreateIndication();
            this.lazilyCreateIndication = shouldLazilyCreateIndication;
            if (!shouldLazilyCreateIndication) {
            }
        }
        z4 = z3;
        if (z4) {
            recreateIndicationIfNeeded();
        }
        this.focusableNode.update(this.interactionSource);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(dq dqVar) {
            this();
        }

        private TraverseKey() {
        }
    }

    public void onCancelKeyInput() {
    }

    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, iy iyVar, dq dqVar) {
        this(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, iyVar);
    }
}
