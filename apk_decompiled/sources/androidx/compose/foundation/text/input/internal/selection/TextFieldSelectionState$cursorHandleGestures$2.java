package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
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
@bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionState$cursorHandleGestures$2 extends us0 implements my {
    final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1", f = "TextFieldSelectionState.kt", l = {493}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, hm hmVar) {
            super(2, hmVar);
            this.this$0 = textFieldSelectionState;
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, hmVar);
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
                PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
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
    @bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2", f = "TextFieldSelectionState.kt", l = {494}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, hm hmVar) {
            super(2, hmVar);
            this.this$0 = textFieldSelectionState;
            this.$this_cursorHandleGestures = pointerInputScope;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            Object detectCursorHandleDragGestures;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                this.label = 1;
                detectCursorHandleDragGestures = textFieldSelectionState.detectCursorHandleDragGestures(pointerInputScope, this);
                vn vnVar = vn.d;
                if (detectCursorHandleDragGestures == vnVar) {
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
    @bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3", f = "TextFieldSelectionState.kt", l = {496}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cursorHandleGestures$2$3, reason: invalid class name */
    public static final class AnonymousClass3 extends us0 implements my {
        final /* synthetic */ PointerInputScope $this_cursorHandleGestures;
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PointerInputScope pointerInputScope, TextFieldSelectionState textFieldSelectionState, hm hmVar) {
            super(2, hmVar);
            this.$this_cursorHandleGestures = pointerInputScope;
            this.this$0 = textFieldSelectionState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 invokeSuspend$lambda$0(TextFieldSelectionState textFieldSelectionState, Offset offset) {
            TextToolbarState textToolbarState;
            textToolbarState = textFieldSelectionState.getTextToolbarState();
            TextToolbarState textToolbarState2 = TextToolbarState.Cursor;
            if (textToolbarState == textToolbarState2) {
                textToolbarState2 = TextToolbarState.None;
            }
            textFieldSelectionState.setTextToolbarState(textToolbarState2);
            return w01.a;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass3) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                PointerInputScope pointerInputScope = this.$this_cursorHandleGestures;
                d dVar = new d(this.this$0, 0);
                this.label = 1;
                Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, dVar, this, 7, null);
                vn vnVar = vn.d;
                if (detectTapGestures$default == vnVar) {
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
    public TextFieldSelectionState$cursorHandleGestures$2(TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldSelectionState;
        this.$this_cursorHandleGestures = pointerInputScope;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TextFieldSelectionState$cursorHandleGestures$2 textFieldSelectionState$cursorHandleGestures$2 = new TextFieldSelectionState$cursorHandleGestures$2(this.this$0, this.$this_cursorHandleGestures, hmVar);
        textFieldSelectionState$cursorHandleGestures$2.L$0 = obj;
        return textFieldSelectionState$cursorHandleGestures$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldSelectionState$cursorHandleGestures$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        un unVar = (un) this.L$0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_cursorHandleGestures, null);
        xn xnVar = xn.g;
        p01.t(unVar, null, xnVar, anonymousClass1, 1);
        p01.t(unVar, null, xnVar, new AnonymousClass2(this.this$0, this.$this_cursorHandleGestures, null), 1);
        return p01.t(unVar, null, xnVar, new AnonymousClass3(this.$this_cursorHandleGestures, this.this$0, null), 1);
    }
}
