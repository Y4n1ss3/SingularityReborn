package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetector_androidKt;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.iy;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class StylusHandwritingNode extends DelegatingNode implements PointerInputModifierNode, FocusEventModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;
    private boolean focused;
    private iy onHandwritingSlopExceeded;
    private final SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {116, 144, 182}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends ij0 implements my {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ StylusHandwritingNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StylusHandwritingNode stylusHandwritingNode, hm hmVar) {
                super(hmVar);
                this.this$0 = stylusHandwritingNode;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, hmVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // defpackage.my
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                return ((AnonymousClass1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x019f, code lost:
            
                if (r4 != r8) goto L73;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x01a1, code lost:
            
                return r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
            
                if (r10 != r8) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x0057, code lost:
            
                if (r9 == r8) goto L72;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x019f -> B:7:0x01a2). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00f0 -> B:28:0x00f4). Please report as a decompilation issue!!! */
            @Override // defpackage.mc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                Object awaitFirstDown;
                boolean z;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerEventPass pointerEventPass;
                PointerInputChange pointerInputChange;
                Object awaitPointerEvent;
                vn vnVar;
                PointerInputChange pointerInputChange2;
                boolean z2;
                PointerInputChange pointerInputChange3;
                AwaitPointerEventScope awaitPointerEventScope3;
                Object awaitPointerEvent2;
                PointerInputChange pointerInputChange4;
                int i = this.label;
                int i2 = 2;
                w01 w01Var = w01.a;
                PointerInputChange pointerInputChange5 = null;
                vn vnVar2 = vn.d;
                if (i == 0) {
                    p10.Q(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    awaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, true, pointerEventPass2, this);
                } else if (i == 1) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    awaitFirstDown = obj;
                } else if (i == 2) {
                    pointerEventPass = (PointerEventPass) this.L$2;
                    pointerInputChange = (PointerInputChange) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    awaitPointerEvent = obj;
                    PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            vnVar = vnVar2;
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes.get(i3);
                        PointerInputChange pointerInputChange6 = pointerInputChange2;
                        if (!pointerInputChange6.isConsumed()) {
                            vnVar = vnVar2;
                            if (PointerId.m6080equalsimpl0(pointerInputChange6.m6098getIdJ3iCeTQ(), pointerInputChange.m6098getIdJ3iCeTQ()) && pointerInputChange6.getPressed()) {
                                break;
                            }
                        } else {
                            vnVar = vnVar2;
                        }
                        i3++;
                        vnVar2 = vnVar;
                    }
                    PointerInputChange pointerInputChange7 = pointerInputChange2;
                    if (pointerInputChange7 == null || pointerInputChange7.getUptimeMillis() - pointerInputChange.getUptimeMillis() >= awaitPointerEventScope2.getViewConfiguration().getLongPressTimeoutMillis() || TapGestureDetector_androidKt.isDeepPress(pointerEvent)) {
                        pointerInputChange7 = null;
                    } else if (Offset.m4514getDistanceimpl(Offset.m4520minusMKHz9U(pointerInputChange7.m6101getPositionF1C5BW0(), pointerInputChange.m6101getPositionF1C5BW0())) <= awaitPointerEventScope2.getViewConfiguration().getHandwritingSlop()) {
                        vnVar2 = vnVar;
                        i2 = 2;
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.L$2 = pointerEventPass;
                        this.label = i2;
                        awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                    }
                    if (pointerInputChange7 == null) {
                        return w01Var;
                    }
                    z2 = this.this$0.focused;
                    if (!z2) {
                        FocusRequesterModifierNodeKt.requestFocus(this.this$0);
                    }
                    this.this$0.getOnHandwritingSlopExceeded().invoke();
                    pointerInputChange7.consume();
                    pointerInputChange3 = pointerInputChange;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    PointerEventPass pointerEventPass3 = PointerEventPass.Initial;
                    this.L$0 = awaitPointerEventScope3;
                    this.L$1 = pointerInputChange3;
                    pointerInputChange5 = null;
                    this.L$2 = null;
                    this.label = 3;
                    awaitPointerEvent2 = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass3, this);
                    vnVar2 = vnVar;
                } else {
                    if (i != 3) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pointerInputChange3 = (PointerInputChange) this.L$1;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    awaitPointerEvent2 = obj;
                    List<PointerInputChange> changes2 = ((PointerEvent) awaitPointerEvent2).getChanges();
                    int size2 = changes2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            pointerInputChange4 = pointerInputChange5;
                            break;
                        }
                        pointerInputChange4 = changes2.get(i4);
                        PointerInputChange pointerInputChange8 = pointerInputChange4;
                        if (!pointerInputChange8.isConsumed() && PointerId.m6080equalsimpl0(pointerInputChange8.m6098getIdJ3iCeTQ(), pointerInputChange3.m6098getIdJ3iCeTQ()) && pointerInputChange8.getPressed()) {
                            break;
                        }
                        i4++;
                    }
                    PointerInputChange pointerInputChange9 = pointerInputChange4;
                    if (pointerInputChange9 == null) {
                        return w01Var;
                    }
                    pointerInputChange9.consume();
                    vnVar = vnVar2;
                    PointerEventPass pointerEventPass32 = PointerEventPass.Initial;
                    this.L$0 = awaitPointerEventScope3;
                    this.L$1 = pointerInputChange3;
                    pointerInputChange5 = null;
                    this.L$2 = null;
                    this.label = 3;
                    awaitPointerEvent2 = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass32, this);
                    vnVar2 = vnVar;
                }
                PointerInputChange pointerInputChange10 = (PointerInputChange) awaitFirstDown;
                int m6104getTypeT8wyACA = pointerInputChange10.m6104getTypeT8wyACA();
                PointerType.Companion companion = PointerType.Companion;
                if (!PointerType.m6174equalsimpl0(m6104getTypeT8wyACA, companion.m6180getStylusT8wyACA()) && !PointerType.m6174equalsimpl0(pointerInputChange10.m6104getTypeT8wyACA(), companion.m6178getEraserT8wyACA())) {
                    return w01Var;
                }
                boolean z3 = Float.intBitsToFloat((int) (pointerInputChange10.m6101getPositionF1C5BW0() >> 32)) >= 0.0f && Float.intBitsToFloat((int) (pointerInputChange10.m6101getPositionF1C5BW0() >> 32)) < ((float) ((int) (awaitPointerEventScope.mo5985getSizeYbymL2g() >> 32))) && Float.intBitsToFloat((int) (pointerInputChange10.m6101getPositionF1C5BW0() & 4294967295L)) >= 0.0f && Float.intBitsToFloat((int) (pointerInputChange10.m6101getPositionF1C5BW0() & 4294967295L)) < ((float) ((int) (awaitPointerEventScope.mo5985getSizeYbymL2g() & 4294967295L)));
                z = this.this$0.focused;
                awaitPointerEventScope2 = awaitPointerEventScope;
                pointerEventPass = (z || z3) ? PointerEventPass.Initial : PointerEventPass.Main;
                pointerInputChange = pointerInputChange10;
                this.L$0 = awaitPointerEventScope2;
                this.L$1 = pointerInputChange;
                this.L$2 = pointerEventPass;
                this.label = i2;
                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
            Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(StylusHandwritingNode.this, null), hmVar);
            return awaitEachGesture == vn.d ? awaitEachGesture : w01.a;
        }
    }));

    public StylusHandwritingNode(iy iyVar) {
        this.onHandwritingSlopExceeded = iyVar;
    }

    public final iy getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo1225getTouchBoundsExpansionRZrCHBk() {
        return StylusHandwritingKt.getHandwritingBoundsExpansion().m6452roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.suspendingPointerInputModifierNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.focused = focusState.isFocused();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.suspendingPointerInputModifierNode.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }

    public final void resetPointerInputHandler() {
        this.suspendingPointerInputModifierNode.resetPointerInputHandler();
    }

    public final void setOnHandwritingSlopExceeded(iy iyVar) {
        this.onHandwritingSlopExceeded = iyVar;
    }
}
