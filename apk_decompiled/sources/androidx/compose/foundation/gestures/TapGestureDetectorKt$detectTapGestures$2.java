package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.LongPressResult;
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
import defpackage.q10;
import defpackage.rr0;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapGestures$2 extends us0 implements my {
    final /* synthetic */ ky $onDoubleTap;
    final /* synthetic */ ky $onLongPress;
    final /* synthetic */ ny $onPress;
    final /* synthetic */ ky $onTap;
    final /* synthetic */ PointerInputScope $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ij0 implements my {
        final /* synthetic */ un $$this$coroutineScope;
        final /* synthetic */ ky $onDoubleTap;
        final /* synthetic */ ky $onLongPress;
        final /* synthetic */ ny $onPress;
        final /* synthetic */ ky $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {110}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00071 extends us0 implements my {
            final /* synthetic */ PointerInputChange $down;
            final /* synthetic */ ny $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00071(ny nyVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, hm hmVar) {
                super(2, hmVar);
                this.$onPress = nyVar;
                this.$pressScope = pressGestureScopeImpl;
                this.$down = pointerInputChange;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new C00071(this.$onPress, this.$pressScope, this.$down, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((C00071) create(unVar, hmVar)).invokeSuspend(w01.a);
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
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
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
                this.$pressScope.release();
                return w01.a;
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
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
                this.$pressScope.cancel();
                return w01.a;
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends us0 implements my {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
                super(2, hmVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass4(this.$pressScope, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass4) create(unVar, hmVar)).invokeSuspend(w01.a);
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

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {157, 158}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends us0 implements my {
            final /* synthetic */ z10 $cancelOrReleaseJob;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(z10 z10Var, PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
                super(2, hmVar);
                this.$cancelOrReleaseJob = z10Var;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass5(this.$cancelOrReleaseJob, this.$pressScope, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass5) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
            
                if (r5.reset(r4) == r3) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
            
                return r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
            
                if (r5.n(r4) == r3) goto L15;
             */
            @Override // defpackage.mc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                vn vnVar = vn.d;
                if (i == 0) {
                    p10.Q(obj);
                    z10 z10Var = this.$cancelOrReleaseJob;
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            p10.Q(obj);
                            return w01.a;
                        }
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                this.label = 2;
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {161}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
        public static final class AnonymousClass6 extends us0 implements my {
            final /* synthetic */ ny $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            final /* synthetic */ PointerInputChange $secondDown;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(ny nyVar, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, hm hmVar) {
                super(2, hmVar);
                this.$onPress = nyVar;
                this.$pressScope = pressGestureScopeImpl;
                this.$secondDown = pointerInputChange;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass6(this.$onPress, this.$pressScope, this.$secondDown, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass6) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            @Override // defpackage.mc
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    p10.Q(obj);
                    ny nyVar = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    Offset m4505boximpl = Offset.m4505boximpl(this.$secondDown.m6101getPositionF1C5BW0());
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
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends us0 implements my {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
                super(2, hmVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass7(this.$pressScope, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass7) create(unVar, hmVar)).invokeSuspend(w01.a);
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

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
        public static final class AnonymousClass8 extends us0 implements my {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
                super(2, hmVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass8(this.$pressScope, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass8) create(unVar, hmVar)).invokeSuspend(w01.a);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(un unVar, ny nyVar, ky kyVar, ky kyVar2, ky kyVar3, PressGestureScopeImpl pressGestureScopeImpl, hm hmVar) {
            super(hmVar);
            this.$$this$coroutineScope = unVar;
            this.$onPress = nyVar;
            this.$onLongPress = kyVar;
            this.$onDoubleTap = kyVar2;
            this.$onTap = kyVar3;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x01f9, code lost:
        
            if (r0 == r9) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x020f, code lost:
        
            if (r0 == r9) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0100, code lost:
        
            if (r0 == r9) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x00a7, code lost:
        
            if (r1 == r9) goto L84;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0286  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0166  */
        /* JADX WARN: Type inference failed for: r0v17, types: [z10] */
        /* JADX WARN: Type inference failed for: r0v33, types: [z10] */
        /* JADX WARN: Type inference failed for: r0v37, types: [z10] */
        /* JADX WARN: Type inference failed for: r0v72, types: [z10] */
        /* JADX WARN: Type inference failed for: r1v26, types: [z10] */
        /* JADX WARN: Type inference failed for: r2v19, types: [z10] */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            Object awaitFirstDown$default;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerInputChange pointerInputChange;
            xn coroutineStartForCurrentDispatchBehavior;
            rr0 t;
            ny nyVar;
            Object waitForLongPress$default;
            Object waitForUpOrCancellation$default;
            AwaitPointerEventScope awaitPointerEventScope3;
            PointerInputChange pointerInputChange2;
            z10 launchAwaitingReset$default;
            Object awaitSecondDown;
            PointerInputChange pointerInputChange3;
            z10 z10Var;
            AwaitPointerEventScope awaitPointerEventScope4;
            Object consumeUntilUp;
            rr0 rr0Var;
            PointerInputChange pointerInputChange4;
            xn coroutineStartForCurrentDispatchBehavior2;
            rr0 t2;
            ny nyVar2;
            Object waitForLongPress$default2;
            Object waitForUpOrCancellation$default2;
            PointerInputChange pointerInputChange5;
            Object consumeUntilUp2;
            rr0 rr0Var2;
            int i = this.label;
            w01 w01Var = w01.a;
            vn vnVar = vn.d;
            switch (i) {
                case 0:
                    p10.Q(obj);
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.L$0 = awaitPointerEventScope;
                    this.label = 1;
                    awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 3, null);
                    break;
                case 1:
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    awaitFirstDown$default = obj;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerInputChange = (PointerInputChange) awaitFirstDown$default;
                    pointerInputChange.consume();
                    un unVar = this.$$this$coroutineScope;
                    coroutineStartForCurrentDispatchBehavior = TapGestureDetectorKt.getCoroutineStartForCurrentDispatchBehavior();
                    t = p01.t(unVar, null, coroutineStartForCurrentDispatchBehavior, new TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1(this.$pressScope, null), 1);
                    ny nyVar3 = this.$onPress;
                    nyVar = TapGestureDetectorKt.NoPressGesture;
                    if (nyVar3 != nyVar) {
                        TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, t, null, new C00071(this.$onPress, this.$pressScope, pointerInputChange, null), 2, null);
                    }
                    if (this.$onLongPress != null) {
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.L$2 = t;
                        this.label = 3;
                        waitForLongPress$default = TapGestureDetectorKt.waitForLongPress$default(awaitPointerEventScope2, null, this, 1, null);
                        break;
                    } else {
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = t;
                        this.label = 2;
                        waitForUpOrCancellation$default = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope2, null, this, 1, null);
                        if (waitForUpOrCancellation$default != vnVar) {
                            awaitPointerEventScope3 = awaitPointerEventScope2;
                            pointerInputChange2 = (PointerInputChange) waitForUpOrCancellation$default;
                            rr0 rr0Var3 = t;
                            if (pointerInputChange2 == null) {
                                launchAwaitingReset$default = TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var3, null, new AnonymousClass3(this.$pressScope, null), 2, null);
                            } else {
                                pointerInputChange2.consume();
                                launchAwaitingReset$default = TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var3, null, new AnonymousClass4(this.$pressScope, null), 2, null);
                            }
                            if (pointerInputChange2 != null) {
                                if (this.$onDoubleTap != null) {
                                    this.L$0 = awaitPointerEventScope3;
                                    this.L$1 = pointerInputChange2;
                                    this.L$2 = launchAwaitingReset$default;
                                    this.label = 5;
                                    awaitSecondDown = TapGestureDetectorKt.awaitSecondDown(awaitPointerEventScope3, pointerInputChange2, this);
                                    if (awaitSecondDown != vnVar) {
                                        AwaitPointerEventScope awaitPointerEventScope5 = awaitPointerEventScope3;
                                        pointerInputChange3 = pointerInputChange2;
                                        z10Var = launchAwaitingReset$default;
                                        awaitPointerEventScope4 = awaitPointerEventScope5;
                                        pointerInputChange4 = (PointerInputChange) awaitSecondDown;
                                        if (pointerInputChange4 == null) {
                                            un unVar2 = this.$$this$coroutineScope;
                                            coroutineStartForCurrentDispatchBehavior2 = TapGestureDetectorKt.getCoroutineStartForCurrentDispatchBehavior();
                                            t2 = p01.t(unVar2, null, coroutineStartForCurrentDispatchBehavior2, new AnonymousClass5(z10Var, this.$pressScope, null), 1);
                                            ny nyVar4 = this.$onPress;
                                            nyVar2 = TapGestureDetectorKt.NoPressGesture;
                                            if (nyVar4 != nyVar2) {
                                                TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, t2, null, new AnonymousClass6(this.$onPress, this.$pressScope, pointerInputChange4, null), 2, null);
                                            }
                                            if (this.$onLongPress != null) {
                                                this.L$0 = awaitPointerEventScope4;
                                                this.L$1 = t2;
                                                this.L$2 = pointerInputChange3;
                                                this.L$3 = pointerInputChange4;
                                                this.label = 7;
                                                waitForLongPress$default2 = TapGestureDetectorKt.waitForLongPress$default(awaitPointerEventScope4, null, this, 1, null);
                                                break;
                                            } else {
                                                this.L$0 = t2;
                                                this.L$1 = pointerInputChange3;
                                                this.L$2 = null;
                                                this.label = 6;
                                                waitForUpOrCancellation$default2 = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope4, null, this, 1, null);
                                                break;
                                            }
                                        } else {
                                            ky kyVar = this.$onTap;
                                            if (kyVar != null) {
                                                kyVar.invoke(Offset.m4505boximpl(pointerInputChange3.m6101getPositionF1C5BW0()));
                                                return w01Var;
                                            }
                                        }
                                    }
                                } else {
                                    ky kyVar2 = this.$onTap;
                                    if (kyVar2 != null) {
                                        kyVar2.invoke(Offset.m4505boximpl(pointerInputChange2.m6101getPositionF1C5BW0()));
                                        return w01Var;
                                    }
                                }
                            }
                            return w01Var;
                        }
                    }
                    return vnVar;
                case 2:
                    ?? r0 = (z10) this.L$1;
                    awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    t = r0;
                    waitForUpOrCancellation$default = obj;
                    pointerInputChange2 = (PointerInputChange) waitForUpOrCancellation$default;
                    rr0 rr0Var32 = t;
                    if (pointerInputChange2 == null) {
                    }
                    if (pointerInputChange2 != null) {
                    }
                    return w01Var;
                case 3:
                    ?? r02 = (z10) this.L$2;
                    pointerInputChange = (PointerInputChange) this.L$1;
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    t = r02;
                    waitForLongPress$default = obj;
                    LongPressResult longPressResult = (LongPressResult) waitForLongPress$default;
                    if (q10.b(longPressResult, LongPressResult.Success.INSTANCE)) {
                        this.$onLongPress.invoke(Offset.m4505boximpl(pointerInputChange.m6101getPositionF1C5BW0()));
                        this.L$0 = t;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        consumeUntilUp = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope2, this);
                        if (consumeUntilUp != vnVar) {
                            rr0Var = t;
                            TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var, null, new AnonymousClass2(this.$pressScope, null), 2, null);
                            return w01Var;
                        }
                        return vnVar;
                    }
                    if (longPressResult instanceof LongPressResult.Released) {
                        pointerInputChange2 = ((LongPressResult.Released) longPressResult).getFinalUpChange();
                    } else {
                        if (!(longPressResult instanceof LongPressResult.Canceled)) {
                            defpackage.o.n();
                            return null;
                        }
                        pointerInputChange2 = null;
                    }
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    rr0 rr0Var322 = t;
                    if (pointerInputChange2 == null) {
                    }
                    if (pointerInputChange2 != null) {
                    }
                    return w01Var;
                case 4:
                    ?? r03 = (z10) this.L$0;
                    p10.Q(obj);
                    rr0Var = r03;
                    TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var, null, new AnonymousClass2(this.$pressScope, null), 2, null);
                    return w01Var;
                case 5:
                    z10Var = (z10) this.L$2;
                    pointerInputChange3 = (PointerInputChange) this.L$1;
                    awaitPointerEventScope4 = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    awaitSecondDown = obj;
                    pointerInputChange4 = (PointerInputChange) awaitSecondDown;
                    if (pointerInputChange4 == null) {
                    }
                    break;
                case 6:
                    PointerInputChange pointerInputChange6 = (PointerInputChange) this.L$1;
                    ?? r1 = (z10) this.L$0;
                    p10.Q(obj);
                    t2 = r1;
                    pointerInputChange3 = pointerInputChange6;
                    waitForUpOrCancellation$default2 = obj;
                    pointerInputChange5 = (PointerInputChange) waitForUpOrCancellation$default2;
                    rr0 rr0Var4 = t2;
                    if (pointerInputChange5 == null) {
                        pointerInputChange5.consume();
                        TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var4, null, new AnonymousClass7(this.$pressScope, null), 2, null);
                        this.$onDoubleTap.invoke(Offset.m4505boximpl(pointerInputChange5.m6101getPositionF1C5BW0()));
                        return w01Var;
                    }
                    TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var4, null, new AnonymousClass8(this.$pressScope, null), 2, null);
                    ky kyVar3 = this.$onTap;
                    if (kyVar3 != null) {
                        kyVar3.invoke(Offset.m4505boximpl(pointerInputChange3.m6101getPositionF1C5BW0()));
                        return w01Var;
                    }
                    return w01Var;
                case 7:
                    PointerInputChange pointerInputChange7 = (PointerInputChange) this.L$3;
                    pointerInputChange3 = (PointerInputChange) this.L$2;
                    ?? r2 = (z10) this.L$1;
                    AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) this.L$0;
                    p10.Q(obj);
                    t2 = r2;
                    awaitPointerEventScope4 = awaitPointerEventScope6;
                    pointerInputChange4 = pointerInputChange7;
                    waitForLongPress$default2 = obj;
                    LongPressResult longPressResult2 = (LongPressResult) waitForLongPress$default2;
                    if (q10.b(longPressResult2, LongPressResult.Success.INSTANCE)) {
                        this.$onLongPress.invoke(Offset.m4505boximpl(pointerInputChange4.m6101getPositionF1C5BW0()));
                        this.L$0 = t2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 8;
                        consumeUntilUp2 = TapGestureDetectorKt.consumeUntilUp(awaitPointerEventScope4, this);
                        if (consumeUntilUp2 != vnVar) {
                            rr0Var2 = t2;
                            TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var2, null, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null), 2, null);
                            return w01Var;
                        }
                        return vnVar;
                    }
                    if (longPressResult2 instanceof LongPressResult.Released) {
                        pointerInputChange5 = ((LongPressResult.Released) longPressResult2).getFinalUpChange();
                    } else {
                        if (!(longPressResult2 instanceof LongPressResult.Canceled)) {
                            defpackage.o.n();
                            return null;
                        }
                        pointerInputChange5 = null;
                    }
                    rr0 rr0Var42 = t2;
                    if (pointerInputChange5 == null) {
                    }
                    break;
                case 8:
                    ?? r04 = (z10) this.L$0;
                    p10.Q(obj);
                    rr0Var2 = r04;
                    TapGestureDetectorKt.launchAwaitingReset$default(this.$$this$coroutineScope, rr0Var2, null, new TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1(this.$pressScope, null), 2, null);
                    return w01Var;
                default:
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, ny nyVar, ky kyVar, ky kyVar2, ky kyVar3, hm hmVar) {
        super(2, hmVar);
        this.$this_detectTapGestures = pointerInputScope;
        this.$onPress = nyVar;
        this.$onLongPress = kyVar;
        this.$onDoubleTap = kyVar2;
        this.$onTap = kyVar3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, hmVar);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar = (un) this.L$0;
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            PointerInputScope pointerInputScope = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(unVar, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressGestureScopeImpl, null);
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
