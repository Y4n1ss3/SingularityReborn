package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.p10;
import defpackage.rr0;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {247}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2 extends us0 implements my {
    final /* synthetic */ ny $onPress;
    final /* synthetic */ ky $onTap;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    final /* synthetic */ PointerInputScope $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {251, 257}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ij0 implements my {
        final /* synthetic */ un $$this$coroutineScope;
        final /* synthetic */ ny $onPress;
        final /* synthetic */ ky $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {254}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00061 extends us0 implements my {
            final /* synthetic */ PointerInputChange $down;
            final /* synthetic */ ny $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00061(ny nyVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, hm hmVar) {
                super(2, hmVar);
                this.$onPress = nyVar;
                this.$pressScope = pressGestureScopeImpl;
                this.$down = pointerInputChange;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new C00061(this.$onPress, this.$pressScope, this.$down, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((C00061) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            @Override // defpackage.mc
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    p10.Q(obj);
                    ny nyVar = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    Offset m4505boximpl = Offset.m4505boximpl(this.$down.m6101getPositionF1C5BW0());
                    this.label = 1;
                    Object invoke = nyVar.invoke(pressGestureScopeImpl, m4505boximpl, this);
                    vn vnVar = vn.d;
                    if (invoke == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                return w01.a;
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends us0 implements my {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
                super(2, hmVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass2(this.$pressScope, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            @Override // defpackage.mc
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                this.$pressScope.cancel();
                return w01.a;
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends us0 implements my {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
                super(2, hmVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass3(this.$pressScope, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass3) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            @Override // defpackage.mc
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                this.$pressScope.release();
                return w01.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(un unVar, ny nyVar, ky kyVar, PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
            super(hmVar);
            this.$$this$coroutineScope = unVar;
            this.$onPress = nyVar;
            this.$onTap = kyVar;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x008a  */
        /* JADX WARN: Type inference failed for: r0v11, types: [z10] */
        /* JADX WARN: Type inference failed for: r0v15, types: [z10] */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            xn coroutineStartForCurrentDispatchBehavior;
            Object awaitFirstDown$default;
            rr0 rr0Var;
            ny nyVar;
            Object waitForUpOrCancellation$default;
            rr0 rr0Var2;
            PointerInputChange pointerInputChange;
            int i = this.label;
            vn vnVar = vn.d;
            if (i == 0) {
                p10.Q(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                un unVar = this.$$this$coroutineScope;
                coroutineStartForCurrentDispatchBehavior = TapGestureDetectorKt.getCoroutineStartForCurrentDispatchBehavior();
                rr0 t = p01.t(unVar, null, coroutineStartForCurrentDispatchBehavior, new TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1(this.$pressScope, null), 1);
                this.L$0 = awaitPointerEventScope;
                this.L$1 = t;
                this.label = 1;
                awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 3, null);
                if (awaitFirstDown$default != vnVar) {
                    rr0Var = t;
                }
                return vnVar;
            }
            if (i != 1) {
                if (i != 2) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r0 = (z10) this.L$0;
                p10.Q(obj);
                rr0Var2 = r0;
                waitForUpOrCancellation$default = obj;
                pointerInputChange = (PointerInputChange) waitForUpOrCancellation$default;
                if (pointerInputChange != null) {
                    TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var2, null, new AnonymousClass2(this.$pressScope, null), 2, null);
                } else {
                    pointerInputChange.consume();
                    TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var2, null, new AnonymousClass3(this.$pressScope, null), 2, null);
                    ky kyVar = this.$onTap;
                    if (kyVar != null) {
                        kyVar.invoke(Offset.m4505boximpl(pointerInputChange.m6101getPositionF1C5BW0()));
                    }
                }
                return w01.a;
            }
            ?? r02 = (z10) this.L$1;
            AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            p10.Q(obj);
            rr0Var = r02;
            awaitPointerEventScope = awaitPointerEventScope2;
            awaitFirstDown$default = obj;
            PointerInputChange pointerInputChange2 = (PointerInputChange) awaitFirstDown$default;
            pointerInputChange2.consume();
            ny nyVar2 = this.$onPress;
            nyVar = TapGestureDetectorKt.NoPressGesture;
            if (nyVar2 != nyVar) {
                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var, null, new C00061(this.$onPress, this.$pressScope, pointerInputChange2, null), 2, null);
            }
            this.L$0 = rr0Var;
            this.L$1 = null;
            this.label = 2;
            waitForUpOrCancellation$default = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
            if (waitForUpOrCancellation$default != vnVar) {
                rr0Var2 = rr0Var;
                pointerInputChange = (PointerInputChange) waitForUpOrCancellation$default;
                if (pointerInputChange != null) {
                }
                return w01.a;
            }
            return vnVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2(PointerInputScope pointerInputScope, ny nyVar, ky kyVar, PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
        super(2, hmVar);
        this.$this_detectTapAndPress = pointerInputScope;
        this.$onPress = nyVar;
        this.$onTap = kyVar;
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, hmVar);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar = (un) this.L$0;
            PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(unVar, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this);
            vn vnVar = vn.d;
            if (awaitEachGesture == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
