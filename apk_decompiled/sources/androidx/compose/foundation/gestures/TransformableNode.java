package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import defpackage.bq;
import defpackage.d41;
import defpackage.hm;
import defpackage.ij0;
import defpackage.ji0;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;
import defpackage.zg;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TransformableNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    private ky canPan;
    private boolean enabled;
    private boolean lockRotationOnZoomPan;
    private PointerInputModifierNode pointerInputModifierMouse;
    private ScrollConfig scrollConfig;
    private TransformableState state;
    private final ky updatedCanPan = new p(this, 2);
    private final zg channel = d41.b(Integer.MAX_VALUE, 6, null);
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", l = {196}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends us0 implements my {
            final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransformableNode this$0;

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", l = {175, 178}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00081 extends us0 implements my {
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", l = {187}, m = "invokeSuspend", v = 1)
                /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00091 extends us0 implements my {
                    final /* synthetic */ ji0 $event;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;
                    final /* synthetic */ TransformableNode this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00091(ji0 ji0Var, TransformableNode transformableNode, hm hmVar) {
                        super(2, hmVar);
                        this.$event = ji0Var;
                        this.this$0 = transformableNode;
                    }

                    @Override // defpackage.mc
                    public final hm create(Object obj, hm hmVar) {
                        C00091 c00091 = new C00091(this.$event, this.this$0, hmVar);
                        c00091.L$0 = obj;
                        return c00091;
                    }

                    @Override // defpackage.my
                    public final Object invoke(TransformScope transformScope, hm hmVar) {
                        return ((C00091) create(transformScope, hmVar)).invokeSuspend(w01.a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0057 -> B:5:0x005a). Please report as a decompilation issue!!! */
                    @Override // defpackage.mc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        TransformScope transformScope;
                        Object obj2;
                        zg zgVar;
                        int i = this.label;
                        if (i == 0) {
                            p10.Q(obj);
                            transformScope = (TransformScope) this.L$0;
                            obj2 = this.$event.d;
                            if (obj2 instanceof TransformEvent.TransformStopped) {
                            }
                        } else {
                            if (i != 1) {
                                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ji0 ji0Var = (ji0) this.L$1;
                            transformScope = (TransformScope) this.L$0;
                            p10.Q(obj);
                            ji0Var.d = obj;
                            obj2 = this.$event.d;
                            if (obj2 instanceof TransformEvent.TransformStopped) {
                                return w01.a;
                            }
                            TransformEvent.TransformDelta transformDelta = obj2 instanceof TransformEvent.TransformDelta ? (TransformEvent.TransformDelta) obj2 : null;
                            if (transformDelta != null) {
                                transformScope.mo408transformByd4ec7I(transformDelta.getZoomChange(), transformDelta.m568getPanChangeF1C5BW0(), transformDelta.getRotationChange());
                            }
                            ji0Var = this.$event;
                            zgVar = this.this$0.channel;
                            this.L$0 = transformScope;
                            this.L$1 = ji0Var;
                            this.label = 1;
                            obj = zgVar.i(this);
                            vn vnVar = vn.d;
                            if (obj == vnVar) {
                                return vnVar;
                            }
                            ji0Var.d = obj;
                            obj2 = this.$event.d;
                            if (obj2 instanceof TransformEvent.TransformStopped) {
                            }
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00081(TransformableNode transformableNode, hm hmVar) {
                    super(2, hmVar);
                    this.this$0 = transformableNode;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    C00081 c00081 = new C00081(this.this$0, hmVar);
                    c00081.L$0 = obj;
                    return c00081;
                }

                @Override // defpackage.my
                public final Object invoke(un unVar, hm hmVar) {
                    return ((C00081) create(unVar, hmVar)).invokeSuspend(w01.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
                
                    if (r10.transform(r0, r7, r9) == r4) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007c -> B:9:0x0033). Please report as a decompilation issue!!! */
                @Override // defpackage.mc
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    un unVar;
                    un unVar2;
                    ji0 ji0Var;
                    ji0 ji0Var2;
                    TransformableState transformableState;
                    zg zgVar;
                    int i = this.label;
                    vn vnVar = vn.d;
                    if (i == 0) {
                        p10.Q(obj);
                        unVar = (un) this.L$0;
                    } else if (i == 1) {
                        ji0Var2 = (ji0) this.L$2;
                        ji0Var = (ji0) this.L$1;
                        unVar2 = (un) this.L$0;
                        p10.Q(obj);
                        ji0Var2.d = obj;
                        if (ji0Var.d instanceof TransformEvent.TransformStarted) {
                            transformableState = this.this$0.state;
                            MutatePriority mutatePriority = MutatePriority.UserInput;
                            C00091 c00091 = new C00091(ji0Var, this.this$0, null);
                            this.L$0 = unVar2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 2;
                        }
                        unVar = unVar2;
                    } else {
                        if (i != 2) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        un unVar3 = (un) this.L$0;
                        try {
                            p10.Q(obj);
                        } catch (CancellationException unused) {
                        }
                        unVar = unVar3;
                    }
                    if (!p10.x(unVar)) {
                        ji0Var2 = new ji0();
                        zgVar = this.this$0.channel;
                        this.L$0 = unVar;
                        this.L$1 = ji0Var2;
                        this.L$2 = ji0Var2;
                        this.label = 1;
                        Object i2 = zgVar.i(this);
                        if (i2 != vnVar) {
                            unVar2 = unVar;
                            obj = i2;
                            ji0Var = ji0Var2;
                            ji0Var2.d = obj;
                            if (ji0Var.d instanceof TransformEvent.TransformStarted) {
                            }
                            unVar = unVar2;
                            if (!p10.x(unVar)) {
                                return w01.a;
                            }
                        }
                        return vnVar;
                    }
                }
            }

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", l = {198}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends ij0 implements my {
                final /* synthetic */ un $$this$coroutineScope;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(TransformableNode transformableNode, un unVar, hm hmVar) {
                    super(hmVar);
                    this.this$0 = transformableNode;
                    this.$$this$coroutineScope = unVar;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$this$coroutineScope, hmVar);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // defpackage.my
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                    return ((AnonymousClass2) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                }

                @Override // defpackage.mc
                public final Object invokeSuspend(Object obj) {
                    zg zgVar;
                    boolean z;
                    zg zgVar2;
                    ky kyVar;
                    Object detectZoom;
                    int i = this.label;
                    try {
                        try {
                            if (i == 0) {
                                p10.Q(obj);
                                AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                z = this.this$0.lockRotationOnZoomPan;
                                zgVar2 = this.this$0.channel;
                                kyVar = this.this$0.updatedCanPan;
                                this.label = 1;
                                detectZoom = TransformableKt.detectZoom(awaitPointerEventScope, z, zgVar2, kyVar, this);
                                vn vnVar = vn.d;
                                if (detectZoom == vnVar) {
                                    return vnVar;
                                }
                            } else {
                                if (i != 1) {
                                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                p10.Q(obj);
                            }
                        } catch (CancellationException e) {
                            if (!p10.x(this.$$this$coroutineScope)) {
                                throw e;
                            }
                        }
                        return w01.a;
                    } finally {
                        zgVar = this.this$0.channel;
                        zgVar.m(TransformEvent.TransformStopped.INSTANCE);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, TransformableNode transformableNode, hm hmVar) {
                super(2, hmVar);
                this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                this.this$0 = transformableNode;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_SuspendingPointerInputModifierNode, this.this$0, hmVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            @Override // defpackage.mc
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    p10.Q(obj);
                    un unVar = (un) this.L$0;
                    p01.t(unVar, null, xn.g, new C00081(this.this$0, null), 1);
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, unVar, null);
                    this.label = 1;
                    Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass2, this);
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

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
            boolean z;
            z = TransformableNode.this.enabled;
            w01 w01Var = w01.a;
            if (!z) {
                return w01Var;
            }
            Object n = p10.n(new AnonymousClass1(pointerInputScope, TransformableNode.this, null), hmVar);
            return n == vn.d ? n : w01Var;
        }
    }));

    public TransformableNode(TransformableState transformableState, ky kyVar, boolean z, boolean z2) {
        this.state = transformableState;
        this.canPan = kyVar;
        this.lockRotationOnZoomPan = z;
        this.enabled = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updatedCanPan$lambda$0(TransformableNode transformableNode, Offset offset) {
        return ((Boolean) transformableNode.canPan.invoke(offset)).booleanValue();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        this.scrollConfig = AndroidScrollable_androidKt.platformScrollConfig(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        final ScrollConfig scrollConfig = this.scrollConfig;
        if (this.enabled) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!PointerType.m6174equalsimpl0(changes.get(i).m6104getTypeT8wyACA(), PointerType.Companion.m6179getMouseT8wyACA())) {
                    i++;
                } else if (scrollConfig != null && this.pointerInputModifierMouse == null) {
                    this.pointerInputModifierMouse = (PointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.gestures.TransformableNode$onPointerEvent$2
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                            zg zgVar;
                            Object detectZoomByCtrlMouseScroll;
                            zgVar = TransformableNode.this.channel;
                            detectZoomByCtrlMouseScroll = TransformableKt.detectZoomByCtrlMouseScroll(pointerInputScope, zgVar, scrollConfig, hmVar);
                            return detectZoomByCtrlMouseScroll == vn.d ? detectZoomByCtrlMouseScroll : w01.a;
                        }
                    }));
                }
            }
        }
        this.pointerInputNode.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        PointerInputModifierNode pointerInputModifierNode = this.pointerInputModifierMouse;
        if (pointerInputModifierNode != null) {
            pointerInputModifierNode.mo197onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
        }
    }

    public final void update(TransformableState transformableState, ky kyVar, boolean z, boolean z2) {
        this.canPan = kyVar;
        if (q10.b(this.state, transformableState) && this.enabled == z2 && this.lockRotationOnZoomPan == z) {
            return;
        }
        this.state = transformableState;
        this.enabled = z2;
        this.lockRotationOnZoomPan = z;
        this.pointerInputNode.resetPointerInputHandler();
    }
}
