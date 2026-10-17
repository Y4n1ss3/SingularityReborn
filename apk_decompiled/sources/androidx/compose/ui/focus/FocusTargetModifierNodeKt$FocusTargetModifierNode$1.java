package androidx.compose.ui.focus;

import defpackage.ky;
import defpackage.w01;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class FocusTargetModifierNodeKt$FocusTargetModifierNode$1 extends xy implements ky {
    public FocusTargetModifierNodeKt$FocusTargetModifierNode$1(Object obj) {
        super(1, obj, InvalidateSemantics.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((FocusTargetNode) obj);
        return w01.a;
    }

    public final void invoke(FocusTargetNode focusTargetNode) {
        ((InvalidateSemantics) this.receiver).onDispatchEventsCompleted(focusTargetNode);
    }
}
