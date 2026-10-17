package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import defpackage.dq;
import defpackage.iy;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class ClickableNode extends AbstractClickableNode {
    public static final int $stable = 8;
    private PointerInputChange downEvent;
    private final boolean isSuspendingPointerInputEnabled;

    private ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, iy iyVar) {
        super(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, iyVar, null);
        this.isSuspendingPointerInputEnabled = (ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled && ComposeFoundationFlags.isNonSuspendingPointerInputInClickableEnabled) ? false : true;
    }

    /* renamed from: getExtendedTouchPadding-hWWAJMo, reason: not valid java name */
    private final long m276getExtendedTouchPaddinghWWAJMo(long j) {
        long mo368toSizeXkaWNTQ = DelegatableNodeKt.requireDensity(this).mo368toSizeXkaWNTQ(((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).mo6474getMinimumTouchTargetSizeMYxV2XQ());
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (mo368toSizeXkaWNTQ >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (mo368toSizeXkaWNTQ & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return Size.m4576constructorimpl((Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32));
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public SuspendingPointerInputModifierNode createPointerInputNodeIfNeeded() {
        if (this.isSuspendingPointerInputEnabled) {
            return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new ClickableNode$createPointerInputNodeIfNeeded$1(this));
        }
        return null;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        super.onCancelPointerInput();
        if (this.downEvent != null) {
            this.downEvent = null;
            handlePressInteractionCancel(false);
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    public final boolean mo194onClickKeyDownEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public final boolean mo195onClickKeyUpEventZmokQxo(KeyEvent keyEvent) {
        getOnClick().invoke();
        return true;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        super.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        if (this.isSuspendingPointerInputEnabled) {
            return;
        }
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.downEvent == null) {
                return;
            }
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = changes.get(i);
                if (pointerInputChange.isConsumed() && pointerInputChange != this.downEvent) {
                    this.downEvent = null;
                    handlePressInteractionCancel(false);
                    return;
                }
            }
            return;
        }
        PointerInputChange pointerInputChange2 = this.downEvent;
        if (pointerInputChange2 == null) {
            if (TapGestureDetectorKt.isChangedToDown$default(pointerEvent, true, false, 2, null)) {
                PointerInputChange pointerInputChange3 = pointerEvent.getChanges().get(0);
                pointerInputChange3.consume();
                this.downEvent = pointerInputChange3;
                if (getEnabled()) {
                    m193handlePressInteractionStart3MmeM6k(pointerInputChange3.m6101getPositionF1C5BW0(), false);
                    return;
                }
                return;
            }
            return;
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!PointerEventKt.changedToUp(changes2.get(i2))) {
                long m276getExtendedTouchPaddinghWWAJMo = m276getExtendedTouchPaddinghWWAJMo(j);
                List<PointerInputChange> changes3 = pointerEvent.getChanges();
                int size3 = changes3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    PointerInputChange pointerInputChange4 = changes3.get(i3);
                    if (pointerInputChange4.isConsumed() || PointerEventKt.m6037isOutOfBoundsjwHxaWs(pointerInputChange4, j, m276getExtendedTouchPaddinghWWAJMo)) {
                        this.downEvent = null;
                        handlePressInteractionCancel(false);
                        return;
                    }
                }
                return;
            }
        }
        pointerEvent.getChanges().get(0).consume();
        if (getEnabled()) {
            m192handlePressInteractionRelease3MmeM6k(pointerInputChange2.m6101getPositionF1C5BW0(), false);
            getOnClick().invoke();
        }
        this.downEvent = null;
    }

    /* renamed from: update-O2vRcR0, reason: not valid java name */
    public final void m277updateO2vRcR0(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, iy iyVar) {
        m199updateCommonO2vRcR0(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, iyVar);
    }

    private static /* synthetic */ void isSuspendingPointerInputEnabled$annotations() {
    }

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, iy iyVar, dq dqVar) {
        this(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, iyVar);
    }
}
