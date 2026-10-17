package androidx.compose.ui.input.pointer;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.bq;
import defpackage.hm;
import defpackage.ij0;
import defpackage.ky;
import defpackage.my;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerInteropFilter_androidKt {
    public static final Modifier motionEventSpy(Modifier modifier, final ky kyVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, kyVar, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            @bq(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", l = {389}, m = "invokeSuspend", v = 1)
            /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends ij0 implements my {
                final /* synthetic */ ky $watcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(ky kyVar, hm hmVar) {
                    super(hmVar);
                    this.$watcher = kyVar;
                }

                @Override // defpackage.mc
                public final hm create(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$watcher, hmVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // defpackage.my
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, hm hmVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, hmVar)).invokeSuspend(w01.a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002a -> B:5:0x002d). Please report as a decompilation issue!!! */
                @Override // defpackage.mc
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                    /*
                        r3 = this;
                        int r0 = r3.label
                        r1 = 1
                        if (r0 == 0) goto L16
                        if (r0 != r1) goto Lf
                        java.lang.Object r0 = r3.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                        defpackage.p10.Q(r4)
                        goto L2d
                    Lf:
                        java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.o.f(r3)
                        r3 = 0
                        return r3
                    L16:
                        defpackage.p10.Q(r4)
                        java.lang.Object r4 = r3.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                        r0 = r4
                    L1e:
                        androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r3.L$0 = r0
                        r3.label = r1
                        java.lang.Object r4 = r0.awaitPointerEvent(r4, r3)
                        vn r2 = defpackage.vn.d
                        if (r4 != r2) goto L2d
                        return r2
                    L2d:
                        androidx.compose.ui.input.pointer.PointerEvent r4 = (androidx.compose.ui.input.pointer.PointerEvent) r4
                        android.view.MotionEvent r4 = r4.getMotionEvent()
                        if (r4 == 0) goto L1e
                        ky r2 = r3.$watcher
                        r2.invoke(r4)
                        goto L1e
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                pointerInputScope.setInterceptOutOfBoundsChildEvents(true);
                Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(ky.this, null), hmVar);
                return awaitPointerEventScope == vn.d ? awaitPointerEventScope : w01.a;
            }
        });
    }

    public static final Modifier pointerInteropFilter(Modifier modifier, AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new PointerInteropFilter_androidKt$pointerInteropFilter$3(androidViewHolder));
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static /* synthetic */ Modifier pointerInteropFilter$default(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, ky kyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, kyVar);
    }

    public static final Modifier pointerInteropFilter(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, ky kyVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1(requestDisallowInterceptTouchEvent, kyVar) : InspectableValueKt.getNoInspectorInfo(), new PointerInteropFilter_androidKt$pointerInteropFilter$2(kyVar, requestDisallowInterceptTouchEvent));
    }
}
