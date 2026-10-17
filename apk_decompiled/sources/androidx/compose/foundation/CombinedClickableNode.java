package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.dq;
import defpackage.iy;
import defpackage.m60;
import defpackage.p01;
import defpackage.q10;
import defpackage.ra0;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class CombinedClickableNode extends AbstractClickableNode implements CompositionLocalConsumerModifierNode {
    private final ra0 doubleKeyClickStates;
    private boolean hapticFeedbackEnabled;
    private final ra0 longKeyPressJobs;
    private iy onDoubleClick;
    private iy onLongClick;
    private String onLongClickLabel;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DoubleKeyClickState {
        public static final int $stable = 8;
        private boolean doubleTapMinTimeMillisElapsed;
        private final z10 job;

        public DoubleKeyClickState(z10 z10Var) {
            this.job = z10Var;
        }

        public final boolean getDoubleTapMinTimeMillisElapsed() {
            return this.doubleTapMinTimeMillisElapsed;
        }

        public final z10 getJob() {
            return this.job;
        }

        public final void setDoubleTapMinTimeMillisElapsed(boolean z) {
            this.doubleTapMinTimeMillisElapsed = z;
        }
    }

    private CombinedClickableNode(iy iyVar, String str, iy iyVar2, iy iyVar3, boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, String str2, Role role) {
        super(mutableInteractionSource, indicationNodeFactory, z2, z3, str2, role, iyVar, null);
        this.onLongClickLabel = str;
        this.onLongClick = iyVar2;
        this.onDoubleClick = iyVar3;
        this.hapticFeedbackEnabled = z;
        ra0 ra0Var = m60.a;
        this.longKeyPressJobs = new ra0();
        this.doubleKeyClickStates = new ra0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applyAdditionalSemantics$lambda$0(CombinedClickableNode combinedClickableNode) {
        iy iyVar = combinedClickableNode.onLongClick;
        if (iyVar == null) {
            return true;
        }
        iyVar.invoke();
        return true;
    }

    private final void resetKeyPressState() {
        char c;
        long j;
        long j2;
        char c2;
        ra0 ra0Var = this.longKeyPressJobs;
        Object[] objArr = ra0Var.c;
        long[] jArr = ra0Var.a;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((z10) objArr[(i << 3) + i3]).cancel(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        ra0Var.c();
        ra0 ra0Var2 = this.doubleKeyClickStates;
        Object[] objArr2 = ra0Var2.c;
        long[] jArr2 = ra0Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((DoubleKeyClickState) objArr2[(i4 << 3) + i6]).getJob().cancel(null);
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length2) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        ra0Var2.c();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.onLongClick != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.onLongClickLabel, new e(0, this));
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public SuspendingPointerInputModifierNode createPointerInputNodeIfNeeded() {
        return SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new CombinedClickableNode$createPointerInputNodeIfNeeded$1(this));
    }

    public final boolean getHapticFeedbackEnabled() {
        return this.hapticFeedbackEnabled;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void onCancelKeyInput() {
        resetKeyPressState();
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    public boolean mo194onClickKeyDownEventZmokQxo(KeyEvent keyEvent) {
        boolean z;
        long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
        if (this.onLongClick == null || this.longKeyPressJobs.b(m5932getKeyZmokQxo) != null) {
            z = false;
        } else {
            this.longKeyPressJobs.h(m5932getKeyZmokQxo, p01.t(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3));
            z = true;
        }
        DoubleKeyClickState doubleKeyClickState = (DoubleKeyClickState) this.doubleKeyClickStates.b(m5932getKeyZmokQxo);
        if (doubleKeyClickState != null) {
            if (doubleKeyClickState.getJob().isActive()) {
                doubleKeyClickState.getJob().cancel(null);
                if (!doubleKeyClickState.getDoubleTapMinTimeMillisElapsed()) {
                    getOnClick().invoke();
                    this.doubleKeyClickStates.g(m5932getKeyZmokQxo);
                    return z;
                }
            } else {
                this.doubleKeyClickStates.g(m5932getKeyZmokQxo);
            }
        }
        return z;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public boolean mo195onClickKeyUpEventZmokQxo(KeyEvent keyEvent) {
        iy iyVar;
        long m5932getKeyZmokQxo = KeyEvent_androidKt.m5932getKeyZmokQxo(keyEvent);
        boolean z = false;
        if (this.longKeyPressJobs.b(m5932getKeyZmokQxo) != null) {
            z10 z10Var = (z10) this.longKeyPressJobs.b(m5932getKeyZmokQxo);
            if (z10Var != null) {
                if (z10Var.isActive()) {
                    z10Var.cancel(null);
                } else {
                    z = true;
                }
            }
            this.longKeyPressJobs.g(m5932getKeyZmokQxo);
        }
        if (this.onDoubleClick != null) {
            if (this.doubleKeyClickStates.b(m5932getKeyZmokQxo) != null) {
                if (!z && (iyVar = this.onDoubleClick) != null) {
                    iyVar.invoke();
                }
                this.doubleKeyClickStates.g(m5932getKeyZmokQxo);
                return true;
            }
            if (!z) {
                this.doubleKeyClickStates.h(m5932getKeyZmokQxo, new DoubleKeyClickState(p01.t(getCoroutineScope(), null, null, new CombinedClickableNode$onClickKeyUpEvent$2(this, m5932getKeyZmokQxo, null), 3)));
                return true;
            }
        } else if (!z) {
            getOnClick().invoke();
        }
        return true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        super.onReset();
        resetKeyPressState();
    }

    public final void setHapticFeedbackEnabled(boolean z) {
        this.hapticFeedbackEnabled = z;
    }

    /* renamed from: update-2tQrsxU, reason: not valid java name */
    public final void m279update2tQrsxU(iy iyVar, String str, iy iyVar2, iy iyVar3, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str2, Role role) {
        boolean z3;
        if (!q10.b(this.onLongClickLabel, str)) {
            this.onLongClickLabel = str;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if ((this.onLongClick == null) != (iyVar2 == null)) {
            disposeInteractions();
            SemanticsModifierNodeKt.invalidateSemantics(this);
            z3 = true;
        } else {
            z3 = false;
        }
        this.onLongClick = iyVar2;
        if ((this.onDoubleClick == null) != (iyVar3 == null)) {
            z3 = true;
        }
        this.onDoubleClick = iyVar3;
        boolean z4 = getEnabled() == z2 ? z3 : true;
        m199updateCommonO2vRcR0(mutableInteractionSource, indicationNodeFactory, z, z2, str2, role, iyVar);
        if (z4) {
            resetPointerInputHandler();
        }
    }

    public /* synthetic */ CombinedClickableNode(iy iyVar, String str, iy iyVar2, iy iyVar3, boolean z, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, boolean z3, String str2, Role role, dq dqVar) {
        this(iyVar, str, iyVar2, iyVar3, z, mutableInteractionSource, indicationNodeFactory, z2, z3, str2, role);
    }
}
