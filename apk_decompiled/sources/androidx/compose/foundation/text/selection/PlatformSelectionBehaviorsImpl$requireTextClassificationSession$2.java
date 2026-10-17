package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import defpackage.bq;
import defpackage.d41;
import defpackage.hm;
import defpackage.lb0;
import defpackage.my;
import defpackage.o;
import defpackage.ob0;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 273, 282}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2 extends us0 implements my {
    final /* synthetic */ my $block;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {283}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ my $block;
        final /* synthetic */ TextClassifier $textClassificationSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextClassifier textClassifier, my myVar, hm hmVar) {
            super(2, hmVar);
            this.$textClassificationSession = textClassifier;
            this.$block = myVar;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$textClassificationSession, this.$block, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    p10.Q(obj);
                    return obj;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            TextClassifier textClassifier = this.$textClassificationSession;
            if (textClassifier == null) {
                return null;
            }
            my myVar = this.$block;
            this.label = 1;
            Object invoke = myVar.invoke(textClassifier, this);
            vn vnVar = vn.d;
            return invoke == vnVar ? vnVar : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, my myVar, hm hmVar) {
        super(2, hmVar);
        this.this$0 = platformSelectionBehaviorsImpl;
        this.$block = myVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this.this$0, this.$block, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0049, code lost:
    
        if (r10.d(r9) == r5) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15, types: [lb0] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v8, types: [lb0] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lb0 lb0Var;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        ob0 ob0Var;
        ?? r0;
        TextClassifier textClassifier;
        int i = this.label;
        vn vnVar = vn.d;
        try {
            if (i == 0) {
                p10.Q(obj);
                lb0Var = this.this$0.mutex;
                platformSelectionBehaviorsImpl = this.this$0;
                this.L$0 = lb0Var;
                this.L$1 = platformSelectionBehaviorsImpl;
                this.label = 1;
                ob0Var = (ob0) lb0Var;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            p10.Q(obj);
                            return obj;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r0 = (lb0) this.L$0;
                    try {
                        p10.Q(obj);
                        r0 = r0;
                        textClassifier = (TextClassifier) obj;
                        ob0Var = r0;
                        ob0Var.f(null);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(textClassifier, this.$block, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        Object R = d41.R(200L, anonymousClass1, this);
                        return R == vnVar ? vnVar : R;
                    } catch (Throwable th) {
                        th = th;
                        ((ob0) r0).f(null);
                        throw th;
                    }
                }
                platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.L$1;
                ?? r3 = (lb0) this.L$0;
                p10.Q(obj);
                ob0Var = r3;
            }
            textClassifier = platformSelectionBehaviorsImpl.textClassificationSession;
            if (textClassifier != null) {
                if (textClassifier.isDestroyed()) {
                }
                ob0Var.f(null);
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(textClassifier, this.$block, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                Object R2 = d41.R(200L, anonymousClass12, this);
                if (R2 == vnVar) {
                }
            }
            PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 platformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 = new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(platformSelectionBehaviorsImpl, null);
            this.L$0 = ob0Var;
            this.L$1 = null;
            this.label = 2;
            Object R3 = d41.R(300L, platformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1, this);
            if (R3 != vnVar) {
                r0 = ob0Var;
                obj = R3;
                textClassifier = (TextClassifier) obj;
                ob0Var = r0;
                ob0Var.f(null);
                AnonymousClass1 anonymousClass122 = new AnonymousClass1(textClassifier, this.$block, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                Object R22 = d41.R(200L, anonymousClass122, this);
                if (R22 == vnVar) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            r0 = ob0Var;
            ((ob0) r0).f(null);
            throw th;
        }
    }
}
