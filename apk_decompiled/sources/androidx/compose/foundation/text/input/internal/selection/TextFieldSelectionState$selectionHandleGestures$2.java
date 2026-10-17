package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionState$selectionHandleGestures$2 extends us0 implements my {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1", f = "TextFieldSelectionState.kt", l = {506}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, hm hmVar) {
            super(2, hmVar);
            this.this$0 = textFieldSelectionState;
            this.$this_selectionHandleGestures = pointerInputScope;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, hmVar);
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
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                this.label = 1;
                Object detectTouchMode = textFieldSelectionState.detectTouchMode(pointerInputScope, this);
                vn vnVar = vn.d;
                if (detectTouchMode == vnVar) {
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

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2", f = "TextFieldSelectionState.kt", l = {508}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, boolean z, hm hmVar) {
            super(2, hmVar);
            this.$this_selectionHandleGestures = pointerInputScope;
            this.this$0 = textFieldSelectionState;
            this.$isStartHandle = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 invokeSuspend$lambda$0(TextFieldSelectionState textFieldSelectionState) {
            textFieldSelectionState.clearHandleDragging();
            return w01.a;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass2(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                p10.Q(obj);
                PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                final TextFieldSelectionState textFieldSelectionState = this.this$0;
                final boolean z = this.$isStartHandle;
                TapOnPosition tapOnPosition = new TapOnPosition() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.selectionHandleGestures.2.2.1
                    @Override // androidx.compose.foundation.text.input.internal.selection.TapOnPosition
                    /* renamed from: onEvent-k-4lQ0M */
                    public final void mo1388onEventk4lQ0M(long j) {
                        long m1400getHandlePositiontuRUvjQ;
                        TextFieldSelectionState.this.markStartContentVisibleOffset();
                        TextFieldSelectionState textFieldSelectionState2 = TextFieldSelectionState.this;
                        boolean z2 = z;
                        Handle handle = z2 ? Handle.SelectionStart : Handle.SelectionEnd;
                        m1400getHandlePositiontuRUvjQ = textFieldSelectionState2.m1400getHandlePositiontuRUvjQ(z2);
                        textFieldSelectionState2.m1409updateHandleDraggingUv8p0NA(handle, SelectionHandlesKt.m1506getAdjustedCoordinatesk4lQ0M(m1400getHandlePositiontuRUvjQ));
                    }
                };
                a aVar = new a(this.this$0, i2);
                this.label = 1;
                Object detectPressDownGesture = PressDownGestureKt.detectPressDownGesture(pointerInputScope, tapOnPosition, aVar, this);
                vn vnVar = vn.d;
                if (detectPressDownGesture == vnVar) {
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

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$4", f = "TextFieldSelectionState.kt", l = {526}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$selectionHandleGestures$2$4, reason: invalid class name */
    public static final class AnonymousClass4 extends us0 implements my {
        final /* synthetic */ boolean $isStartHandle;
        final /* synthetic */ PointerInputScope $this_selectionHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z, hm hmVar) {
            super(2, hmVar);
            this.this$0 = textFieldSelectionState;
            this.$this_selectionHandleGestures = pointerInputScope;
            this.$isStartHandle = z;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass4(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass4) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            Object detectSelectionHandleDragGestures;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                PointerInputScope pointerInputScope = this.$this_selectionHandleGestures;
                boolean z = this.$isStartHandle;
                this.label = 1;
                detectSelectionHandleDragGestures = textFieldSelectionState.detectSelectionHandleDragGestures(pointerInputScope, z, this);
                vn vnVar = vn.d;
                if (detectSelectionHandleDragGestures == vnVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$selectionHandleGestures$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, boolean z, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldSelectionState;
        this.$this_selectionHandleGestures = pointerInputScope;
        this.$isStartHandle = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(TextFieldSelectionState textFieldSelectionState, Throwable th) {
        textFieldSelectionState.clearHandleDragging();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TextFieldSelectionState$selectionHandleGestures$2 textFieldSelectionState$selectionHandleGestures$2 = new TextFieldSelectionState$selectionHandleGestures$2(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, hmVar);
        textFieldSelectionState$selectionHandleGestures$2.L$0 = obj;
        return textFieldSelectionState$selectionHandleGestures$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldSelectionState$selectionHandleGestures$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        un unVar = (un) this.L$0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_selectionHandleGestures, null);
        xn xnVar = xn.g;
        p01.t(unVar, null, xnVar, anonymousClass1, 1);
        p01.t(unVar, null, xnVar, new AnonymousClass2(this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle, null), 1).h(new d(this.this$0, 1));
        return p01.t(unVar, null, xnVar, new AnonymousClass4(this.this$0, this.$this_selectionHandleGestures, this.$isStartHandle, null), 1);
    }
}
