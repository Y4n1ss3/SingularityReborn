package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.bq;
import defpackage.hm;
import defpackage.ny;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClickableNode$createPointerInputNodeIfNeeded$1 implements PointerInputEventHandler {
    final /* synthetic */ ClickableNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1$1", f = "Clickable.kt", l = {885}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.ClickableNode$createPointerInputNodeIfNeeded$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements ny {
        /* synthetic */ long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ClickableNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClickableNode clickableNode, hm hmVar) {
            super(3, hmVar);
            this.this$0 = clickableNode;
        }

        @Override // defpackage.ny
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m278invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m4526unboximpl(), (hm) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m278invoked4ec7I(PressGestureScope pressGestureScope, long j, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, hmVar);
            anonymousClass1.L$0 = pressGestureScope;
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                PressGestureScope pressGestureScope = (PressGestureScope) this.L$0;
                long j = this.J$0;
                if (this.this$0.getEnabled()) {
                    ClickableNode clickableNode = this.this$0;
                    this.label = 1;
                    Object m191handlePressInteractiond4ec7I = clickableNode.m191handlePressInteractiond4ec7I(pressGestureScope, j, this);
                    vn vnVar = vn.d;
                    if (m191handlePressInteractiond4ec7I == vnVar) {
                        return vnVar;
                    }
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            return w01.a;
        }
    }

    public ClickableNode$createPointerInputNodeIfNeeded$1(ClickableNode clickableNode) {
        this.this$0 = clickableNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$0(ClickableNode clickableNode, Offset offset) {
        if (clickableNode.getEnabled()) {
            clickableNode.getOnClick().invoke();
        }
        return w01.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new AnonymousClass1(this.this$0, null), new d(this.this$0, 0), hmVar);
        return detectTapAndPress == vn.d ? detectTapAndPress : w01.a;
    }
}
