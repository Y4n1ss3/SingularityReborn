package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import defpackage.d41;
import defpackage.dq;
import defpackage.er;
import defpackage.fg;
import defpackage.gg;
import defpackage.hk0;
import defpackage.hm;
import defpackage.jj0;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.rr0;
import defpackage.st;
import defpackage.tj;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;
import defpackage.z10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public static final int $stable = 0;
    private my _deprecatedPointerInputHandler;
    private PointerInputEventHandler _pointerInputEventHandler;
    private long boundsSize;
    private PointerEvent currentEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    private Object key1;
    private Object key2;
    private Object[] keys;
    private PointerEvent lastPointerEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;
    private final Object pointerHandlersLock;
    private z10 pointerInputJob;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        PointerEvent pointerEvent;
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.currentEvent = pointerEvent;
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.pointerHandlers = mutableVector;
        this.pointerHandlersLock = mutableVector;
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m7787getZeroYbymL2g();
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        synchronized (this.pointerHandlersLock) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
            mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    pointerEventHandlerCoroutineArr[i2].offerPointerEvent(pointerEvent, pointerEventPass);
                }
            } else {
                if (i != 3) {
                    throw new tj();
                }
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize() - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = mutableVector3.content;
                if (size2 < pointerEventHandlerCoroutineArr2.length) {
                    while (size2 >= 0) {
                        pointerEventHandlerCoroutineArr2[size2].offerPointerEvent(pointerEvent, pointerEventPass);
                        size2--;
                    }
                }
            }
            this.dispatchingPointerHandlers.clear();
        } catch (Throwable th) {
            this.dispatchingPointerHandlers.clear();
            throw th;
        }
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass, ky kyVar) {
        synchronized (this.pointerHandlersLock) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
            mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
        }
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i == 1 || i == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    kyVar.invoke(pointerEventHandlerCoroutineArr[i2]);
                }
            } else {
                if (i != 3) {
                    throw new tj();
                }
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize() - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = mutableVector3.content;
                if (size2 < pointerEventHandlerCoroutineArr2.length) {
                    while (size2 >= 0) {
                        kyVar.invoke(pointerEventHandlerCoroutineArr2[size2]);
                        size2--;
                    }
                }
            }
            this.dispatchingPointerHandlers.clear();
        } catch (Throwable th) {
            this.dispatchingPointerHandlers.clear();
            throw th;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public <R> Object awaitPointerEventScope(my myVar, hm hmVar) {
        gg ggVar = new gg(1, d41.C(hmVar));
        ggVar.u();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(ggVar);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            myVar.getClass();
            new hk0(d41.C(d41.g(pointerEventHandlerCoroutine, pointerEventHandlerCoroutine, myVar))).resumeWith(w01.a);
        }
        ggVar.d(new SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        return ggVar.s();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo357getExtendedTouchPaddingNHjbRc() {
        long mo368toSizeXkaWNTQ = mo368toSizeXkaWNTQ(getViewConfiguration().mo6474getMinimumTouchTargetSizeMYxV2XQ());
        long mo358getSizeYbymL2g = mo358getSizeYbymL2g();
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (mo368toSizeXkaWNTQ >> 32)) - ((int) (mo358getSizeYbymL2g >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (mo368toSizeXkaWNTQ & 4294967295L)) - ((int) (mo358getSizeYbymL2g & 4294967295L))) / 2.0f;
        return Size.m4576constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public PointerInputEventHandler getPointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public my getPointerInputHandler() {
        my myVar = this._deprecatedPointerInputHandler;
        return myVar == null ? new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(null) : myVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getSize-YbymL2g */
    public long mo358getSizeYbymL2g() {
        return this.boundsSize;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).getPressed()) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    PointerInputChange pointerInputChange = changes2.get(i2);
                    arrayList.add(new PointerInputChange(pointerInputChange.m6098getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m6101getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m6101getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.m6104getTypeT8wyACA(), 0L, 0.0f, 0L, 7168, (dq) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        this.boundsSize = j;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = p01.t(getCoroutineScope(), null, xn.g, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerEvent = null;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        z10 z10Var = this.pointerInputJob;
        if (z10Var != null) {
            z10Var.cancel(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.interceptOutOfBoundsChildEvents = z;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputEventHandler(PointerInputEventHandler pointerInputEventHandler) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = null;
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(my myVar) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = myVar;
    }

    public final void update$ui(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        boolean z = !q10.b(this.key1, obj);
        this.key1 = obj;
        if (!q10.b(this.key2, obj2)) {
            z = true;
        }
        this.key2 = obj2;
        Object[] objArr2 = this.keys;
        if (objArr2 != null && objArr == null) {
            z = true;
        }
        if (objArr2 == null && objArr != null) {
            z = true;
        }
        if (objArr2 != null && objArr != null && !Arrays.equals(objArr, objArr2)) {
            z = true;
        }
        this.keys = objArr;
        if (getPointerInputEventHandler().getClass() == pointerInputEventHandler.getClass() ? z : true) {
            resetPointerInputHandler();
        }
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, hm {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;
        private final hm completion;
        private fg pointerAwaiter;
        private PointerEventPass awaitPass = PointerEventPass.Main;
        private final kn context = st.d;

        public PointerEventHandlerCoroutine(hm hmVar) {
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
            this.completion = hmVar;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pointerEventPass, hm hmVar) {
            gg ggVar = new gg(1, d41.C(hmVar));
            ggVar.u();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = ggVar;
            return ggVar.s();
        }

        public final void cancel(Throwable th) {
            fg fgVar = this.pointerAwaiter;
            if (fgVar != null) {
                fgVar.l(th);
            }
            this.pointerAwaiter = null;
        }

        @Override // defpackage.hm
        public kn getContext() {
            return this.context;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo5984getExtendedTouchPaddingNHjbRc() {
            return SuspendingPointerInputModifierNodeImpl.this.mo357getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo5985getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        public final void offerPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
            fg fgVar;
            if (pointerEventPass != this.awaitPass || (fgVar = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            fgVar.resumeWith(pointerEvent);
        }

        @Override // defpackage.hm
        public void resumeWith(Object obj) {
            Object obj2 = SuspendingPointerInputModifierNodeImpl.this.pointerHandlersLock;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (obj2) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.remove(this);
            }
            this.completion.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public int mo360roundToPxR2X_6o(long j) {
            return this.$$delegate_0.mo360roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public int mo361roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo361roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public float mo362toDpGaN1DYA(long j) {
            return this.$$delegate_0.mo362toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo363toDpu2uoSUM(float f) {
            return this.$$delegate_0.mo363toDpu2uoSUM(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public long mo365toDpSizekrfVVM(long j) {
            return this.$$delegate_0.mo365toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public float mo366toPxR2X_6o(long j) {
            return this.$$delegate_0.mo366toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public float mo367toPx0680j_4(float f) {
            return this.$$delegate_0.mo367toPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public long mo368toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.mo368toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public long mo369toSp0xMU5do(float f) {
            return this.$$delegate_0.mo369toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo370toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo370toSpkPz2Gy4(f);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public <T> Object withTimeout(long j, my myVar, hm hmVar) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1;
            int i;
            Throwable th;
            z10 z10Var;
            fg fgVar;
            if (hmVar instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) {
                suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) hmVar;
                int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.result;
                    i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
                    if (i != 0) {
                        p10.Q(obj);
                        if (j <= 0 && (fgVar = this.pointerAwaiter) != null) {
                            fgVar.resumeWith(new jj0(new PointerEventTimeoutCancellationException(j)));
                        }
                        rr0 t = p01.t(SuspendingPointerInputModifierNodeImpl.this.getCoroutineScope(), null, null, new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(j, this, null), 3);
                        try {
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0 = t;
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label = 1;
                            obj = myVar.invoke(this, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1);
                            Object obj2 = vn.d;
                            if (obj == obj2) {
                                return obj2;
                            }
                            z10Var = t;
                        } catch (Throwable th2) {
                            th = th2;
                            z10Var = t;
                            z10Var.cancel(CancelTimeoutCancellationException.INSTANCE);
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z10Var = (z10) suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.L$0;
                        try {
                            p10.Q(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            z10Var.cancel(CancelTimeoutCancellationException.INSTANCE);
                            throw th;
                        }
                    }
                    z10Var.cancel(CancelTimeoutCancellationException.INSTANCE);
                    return obj;
                }
            }
            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, hmVar);
            Object obj3 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.result;
            i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.label;
            if (i != 0) {
            }
            z10Var.cancel(CancelTimeoutCancellationException.INSTANCE);
            return obj3;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public <T> Object withTimeoutOrNull(long j, my myVar, hm hmVar) {
            SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
            int i;
            try {
                if (hmVar instanceof SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) hmVar;
                    int i2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
                        i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                        if (i == 0) {
                            if (i == 1) {
                                p10.Q(obj);
                                return obj;
                            }
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = 1;
                        Object withTimeout = withTimeout(j, myVar, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                        vn vnVar = vn.d;
                        return withTimeout == vnVar ? vnVar : withTimeout;
                    }
                }
                if (i == 0) {
                }
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, hmVar);
            Object obj2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.result;
            i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public float mo364toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo364toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public long mo371toSpkPz2Gy4(int i) {
            return this.$$delegate_0.mo371toSpkPz2Gy4(i);
        }
    }

    @er
    public static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    public /* synthetic */ SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i, dq dqVar) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    @er
    public SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, my myVar) {
        this(obj, obj2, objArr, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                return w01.a;
            }
        });
        this._deprecatedPointerInputHandler = myVar;
    }
}
