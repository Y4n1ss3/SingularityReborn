package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.PointerInputModifierNode;
import defpackage.hm;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class HoverableNode extends Modifier.Node implements PointerInputModifierNode {
    private HoverInteraction.Enter hoverInteraction;
    private MutableInteractionSource interactionSource;

    public HoverableNode(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitEnter(hm hmVar) {
        HoverableNode$emitEnter$1 hoverableNode$emitEnter$1;
        int i;
        HoverInteraction.Enter enter;
        if (hmVar instanceof HoverableNode$emitEnter$1) {
            hoverableNode$emitEnter$1 = (HoverableNode$emitEnter$1) hmVar;
            int i2 = hoverableNode$emitEnter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitEnter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hoverableNode$emitEnter$1.result;
                i = hoverableNode$emitEnter$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    if (this.hoverInteraction == null) {
                        HoverInteraction.Enter enter2 = new HoverInteraction.Enter();
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        hoverableNode$emitEnter$1.L$0 = enter2;
                        hoverableNode$emitEnter$1.label = 1;
                        Object emit = mutableInteractionSource.emit(enter2, hoverableNode$emitEnter$1);
                        vn vnVar = vn.d;
                        if (emit == vnVar) {
                            return vnVar;
                        }
                        enter = enter2;
                    }
                    return w01.a;
                }
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                enter = (HoverInteraction.Enter) hoverableNode$emitEnter$1.L$0;
                p10.Q(obj);
                this.hoverInteraction = enter;
                return w01.a;
            }
        }
        hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(this, hmVar);
        Object obj2 = hoverableNode$emitEnter$1.result;
        i = hoverableNode$emitEnter$1.label;
        if (i != 0) {
        }
        this.hoverInteraction = enter;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emitExit(hm hmVar) {
        HoverableNode$emitExit$1 hoverableNode$emitExit$1;
        int i;
        if (hmVar instanceof HoverableNode$emitExit$1) {
            hoverableNode$emitExit$1 = (HoverableNode$emitExit$1) hmVar;
            int i2 = hoverableNode$emitExit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitExit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hoverableNode$emitExit$1.result;
                i = hoverableNode$emitExit$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    HoverInteraction.Enter enter = this.hoverInteraction;
                    if (enter != null) {
                        HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
                        MutableInteractionSource mutableInteractionSource = this.interactionSource;
                        hoverableNode$emitExit$1.label = 1;
                        Object emit = mutableInteractionSource.emit(exit, hoverableNode$emitExit$1);
                        vn vnVar = vn.d;
                        if (emit == vnVar) {
                            return vnVar;
                        }
                    }
                    return w01.a;
                }
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                this.hoverInteraction = null;
                return w01.a;
            }
        }
        hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(this, hmVar);
        Object obj2 = hoverableNode$emitExit$1.result;
        i = hoverableNode$emitExit$1.label;
        if (i != 0) {
        }
        this.hoverInteraction = null;
        return w01.a;
    }

    private final void tryEmitExit() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.hoverInteraction = null;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        tryEmitExit();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        tryEmitExit();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            int m6034getType7fucELk = pointerEvent.m6034getType7fucELk();
            PointerEventType.Companion companion = PointerEventType.Companion;
            if (PointerEventType.m6041equalsimpl0(m6034getType7fucELk, companion.m6045getEnter7fucELk())) {
                p01.t(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3);
            } else if (PointerEventType.m6041equalsimpl0(m6034getType7fucELk, companion.m6046getExit7fucELk())) {
                p01.t(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3);
            }
        }
    }

    public final void updateInteractionSource(MutableInteractionSource mutableInteractionSource) {
        if (q10.b(this.interactionSource, mutableInteractionSource)) {
            return;
        }
        tryEmitExit();
        this.interactionSource = mutableInteractionSource;
    }
}
