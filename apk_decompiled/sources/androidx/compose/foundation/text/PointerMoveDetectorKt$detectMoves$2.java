package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.bq;
import defpackage.cq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.ji0;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.yi;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", l = {41}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class PointerMoveDetectorKt$detectMoves$2 extends us0 implements my {
    final /* synthetic */ ky $onMove;
    final /* synthetic */ PointerEventPass $pointerEventPass;
    final /* synthetic */ PointerInputScope $this_detectMoves;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", l = {44}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ij0 implements my {
        final /* synthetic */ kn $currentContext;
        final /* synthetic */ ky $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kn knVar, PointerEventPass pointerEventPass, ky kyVar, hm hmVar) {
            super(hmVar);
            this.$currentContext = knVar;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = kyVar;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003d -> B:5:0x0040). Please report as a decompilation issue!!! */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ji0 ji0Var;
            AwaitPointerEventScope awaitPointerEventScope;
            Offset m4505boximpl;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ji0Var = new ji0();
                awaitPointerEventScope = awaitPointerEventScope2;
                if (cq.x(this.$currentContext)) {
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ji0Var = (ji0) this.L$1;
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                p10.Q(obj);
                PointerEvent pointerEvent = (PointerEvent) obj;
                int m6034getType7fucELk = pointerEvent.m6034getType7fucELk();
                PointerEventType.Companion companion = PointerEventType.Companion;
                if (!PointerEventType.m6041equalsimpl0(m6034getType7fucELk, companion.m6047getMove7fucELk()) || PointerEventType.m6041equalsimpl0(m6034getType7fucELk, companion.m6045getEnter7fucELk()) || PointerEventType.m6041equalsimpl0(m6034getType7fucELk, companion.m6046getExit7fucELk())) {
                    m4505boximpl = Offset.m4505boximpl(((PointerInputChange) yi.p0(pointerEvent.getChanges())).m6101getPositionF1C5BW0());
                    if (Offset.m4512equalsimpl(m4505boximpl.m4526unboximpl(), ji0Var.d)) {
                        m4505boximpl = null;
                    }
                    if (m4505boximpl != null) {
                        ky kyVar = this.$onMove;
                        long m4526unboximpl = m4505boximpl.m4526unboximpl();
                        ji0Var.d = Offset.m4505boximpl(m4526unboximpl);
                        kyVar.invoke(Offset.m4505boximpl(m4526unboximpl));
                    }
                }
                if (cq.x(this.$currentContext)) {
                    PointerEventPass pointerEventPass = this.$pointerEventPass;
                    this.L$0 = awaitPointerEventScope;
                    this.L$1 = ji0Var;
                    this.label = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, this);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    int m6034getType7fucELk2 = pointerEvent2.m6034getType7fucELk();
                    PointerEventType.Companion companion2 = PointerEventType.Companion;
                    if (!PointerEventType.m6041equalsimpl0(m6034getType7fucELk2, companion2.m6047getMove7fucELk())) {
                    }
                    m4505boximpl = Offset.m4505boximpl(((PointerInputChange) yi.p0(pointerEvent2.getChanges())).m6101getPositionF1C5BW0());
                    if (Offset.m4512equalsimpl(m4505boximpl.m4526unboximpl(), ji0Var.d)) {
                    }
                    if (m4505boximpl != null) {
                    }
                    if (cq.x(this.$currentContext)) {
                        return w01.a;
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerMoveDetectorKt$detectMoves$2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, ky kyVar, hm hmVar) {
        super(2, hmVar);
        this.$this_detectMoves = pointerInputScope;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((PointerMoveDetectorKt$detectMoves$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            kn context = getContext();
            PointerInputScope pointerInputScope = this.$this_detectMoves;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null);
            this.label = 1;
            Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(anonymousClass1, this);
            vn vnVar = vn.d;
            if (awaitPointerEventScope == vnVar) {
                return vnVar;
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
