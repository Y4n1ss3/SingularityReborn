package androidx.compose.ui.platform;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class IndirectPointerNavigationGestureDetector {
    public static final int $stable = 8;
    private final GestureDetector gestureDetector;
    private boolean ignoreCurrentGestureStream;
    private final ky onMoveFocus;
    private int primaryDirectionalMotionAxis = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m5590getNonenZO2Niw();

    public IndirectPointerNavigationGestureDetector(Context context, ky kyVar) {
        this.onMoveFocus = kyVar;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.OnGestureListener() { // from class: androidx.compose.ui.platform.IndirectPointerNavigationGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z;
                ky kyVar2;
                ky kyVar3;
                z = IndirectPointerNavigationGestureDetector.this.ignoreCurrentGestureStream;
                if (z) {
                    return true;
                }
                int m6760getPrimaryDirectionalMotionAxisnZO2Niw = IndirectPointerNavigationGestureDetector.this.m6760getPrimaryDirectionalMotionAxisnZO2Niw();
                IndirectPointerEventPrimaryDirectionalMotionAxis.Companion companion = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion;
                if (IndirectPointerEventPrimaryDirectionalMotionAxis.m5586equalsimpl0(m6760getPrimaryDirectionalMotionAxisnZO2Niw, companion.m5591getXnZO2Niw())) {
                    if (Math.abs(f) > Math.abs(f2)) {
                        int m4396getNextdhqQ8s = f > 0.0f ? FocusDirection.Companion.m4396getNextdhqQ8s() : FocusDirection.Companion.m4397getPreviousdhqQ8s();
                        kyVar3 = IndirectPointerNavigationGestureDetector.this.onMoveFocus;
                        kyVar3.invoke(FocusDirection.m4385boximpl(m4396getNextdhqQ8s));
                    }
                } else if (IndirectPointerEventPrimaryDirectionalMotionAxis.m5586equalsimpl0(IndirectPointerNavigationGestureDetector.this.m6760getPrimaryDirectionalMotionAxisnZO2Niw(), companion.m5592getYnZO2Niw()) && Math.abs(f2) > Math.abs(f)) {
                    int m4396getNextdhqQ8s2 = f2 > 0.0f ? FocusDirection.Companion.m4396getNextdhqQ8s() : FocusDirection.Companion.m4397getPreviousdhqQ8s();
                    kyVar2 = IndirectPointerNavigationGestureDetector.this.onMoveFocus;
                    kyVar2.invoke(FocusDirection.m4385boximpl(m4396getNextdhqQ8s2));
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent motionEvent) {
            }
        });
    }

    public final void cancelCurrentEventStream() {
        this.primaryDirectionalMotionAxis = IndirectPointerEventPrimaryDirectionalMotionAxis.Companion.m5590getNonenZO2Niw();
        this.ignoreCurrentGestureStream = true;
    }

    /* renamed from: getPrimaryDirectionalMotionAxis-nZO2Niw, reason: not valid java name */
    public final int m6760getPrimaryDirectionalMotionAxisnZO2Niw() {
        return this.primaryDirectionalMotionAxis;
    }

    public final boolean onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, boolean z) {
        MotionEvent nativeEvent = AndroidIndirectPointerEvent_androidKt.getNativeEvent(indirectPointerEvent);
        int action = nativeEvent.getAction();
        if (action == 0) {
            this.primaryDirectionalMotionAxis = indirectPointerEvent.mo5579getPrimaryDirectionalMotionAxisnZO2Niw();
            this.ignoreCurrentGestureStream = false;
        } else if ((action == 1 || action == 2) && z) {
            cancelCurrentEventStream();
        }
        return this.gestureDetector.onTouchEvent(nativeEvent);
    }

    /* renamed from: setPrimaryDirectionalMotionAxis-WQKaTuc, reason: not valid java name */
    public final void m6761setPrimaryDirectionalMotionAxisWQKaTuc(int i) {
        this.primaryDirectionalMotionAxis = i;
    }
}
