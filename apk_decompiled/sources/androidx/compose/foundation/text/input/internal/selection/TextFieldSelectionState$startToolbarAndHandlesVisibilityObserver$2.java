package androidx.compose.foundation.text.input.internal.selection;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2", f = "TextFieldSelectionState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 extends us0 implements my {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1", f = "TextFieldSelectionState.kt", l = {538}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextFieldSelectionState textFieldSelectionState, hm hmVar) {
            super(2, hmVar);
            this.this$0 = textFieldSelectionState;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.this$0, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            Object observeTextChanges;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                this.label = 1;
                observeTextChanges = textFieldSelectionState.observeTextChanges(this);
                vn vnVar = vn.d;
                if (observeTextChanges == vnVar) {
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
    @bq(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2", f = "TextFieldSelectionState.kt", l = {539}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        int label;
        final /* synthetic */ TextFieldSelectionState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TextFieldSelectionState textFieldSelectionState, hm hmVar) {
            super(2, hmVar);
            this.this$0 = textFieldSelectionState;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass2(this.this$0, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            Object observeTextToolbarVisibility;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                TextFieldSelectionState textFieldSelectionState = this.this$0;
                this.label = 1;
                observeTextToolbarVisibility = textFieldSelectionState.observeTextToolbarVisibility(this);
                vn vnVar = vn.d;
                if (observeTextToolbarVisibility == vnVar) {
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
    public TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2(TextFieldSelectionState textFieldSelectionState, hm hmVar) {
        super(2, hmVar);
        this.this$0 = textFieldSelectionState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 = new TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2(this.this$0, hmVar);
        textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2.L$0 = obj;
        return textFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        un unVar = (un) this.L$0;
        p01.t(unVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        return p01.t(unVar, null, null, new AnonymousClass2(this.this$0, null), 3);
    }
}
