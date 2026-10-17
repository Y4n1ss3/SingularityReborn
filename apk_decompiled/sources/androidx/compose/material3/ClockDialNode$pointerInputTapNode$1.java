package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.bq;
import defpackage.hm;
import defpackage.ny;
import defpackage.p01;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClockDialNode$pointerInputTapNode$1 implements PointerInputEventHandler {
    final /* synthetic */ ClockDialNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements ny {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ ClockDialNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClockDialNode clockDialNode, hm hmVar) {
            super(3, hmVar);
            this.this$0 = clockDialNode;
        }

        @Override // defpackage.ny
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m1739invoked4ec7I((PressGestureScope) obj, ((Offset) obj2).m4526unboximpl(), (hm) obj3);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m1739invoked4ec7I(PressGestureScope pressGestureScope, long j, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, hmVar);
            anonymousClass1.J$0 = j;
            return anonymousClass1.invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            long j = this.J$0;
            this.this$0.offsetX = Float.intBitsToFloat((int) (j >> 32));
            this.this$0.offsetY = Float.intBitsToFloat((int) (j & 4294967295L));
            return w01.a;
        }
    }

    public ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode) {
        this.this$0 = clockDialNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invoke$lambda$0(ClockDialNode clockDialNode, Offset offset) {
        p01.t(clockDialNode.getCoroutineScope(), null, null, new ClockDialNode$pointerInputTapNode$1$2$1(clockDialNode, offset, null), 3);
        return w01.a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
        Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new AnonymousClass1(this.this$0, null), new o(this.this$0, 0), hmVar, 3, null);
        return detectTapGestures$default == vn.d ? detectTapGestures$default : w01.a;
    }
}
