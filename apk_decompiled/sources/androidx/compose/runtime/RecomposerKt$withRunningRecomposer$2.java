package androidx.compose.runtime;

import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.ny;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2", f = "Recomposer.kt", l = {100, 102}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class RecomposerKt$withRunningRecomposer$2 extends us0 implements my {
    final /* synthetic */ ny $block;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1", f = "Recomposer.kt", l = {99}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.runtime.RecomposerKt$withRunningRecomposer$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ Recomposer $recomposer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Recomposer recomposer, hm hmVar) {
            super(2, hmVar);
            this.$recomposer = recomposer;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$recomposer, hmVar);
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
                Recomposer recomposer = this.$recomposer;
                this.label = 1;
                Object runRecomposeAndApplyChanges = recomposer.runRecomposeAndApplyChanges(this);
                vn vnVar = vn.d;
                if (runRecomposeAndApplyChanges == vnVar) {
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
    public RecomposerKt$withRunningRecomposer$2(ny nyVar, hm hmVar) {
        super(2, hmVar);
        this.$block = nyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        RecomposerKt$withRunningRecomposer$2 recomposerKt$withRunningRecomposer$2 = new RecomposerKt$withRunningRecomposer$2(this.$block, hmVar);
        recomposerKt$withRunningRecomposer$2.L$0 = obj;
        return recomposerKt$withRunningRecomposer$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((RecomposerKt$withRunningRecomposer$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r8 == r4) goto L16;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Recomposer recomposer;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            un unVar = (un) this.L$0;
            recomposer = new Recomposer(unVar.getCoroutineContext());
            p01.t(unVar, null, null, new AnonymousClass1(recomposer, null), 3);
            ny nyVar = this.$block;
            this.L$0 = recomposer;
            this.label = 1;
            obj = nyVar.invoke(unVar, recomposer, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = this.L$0;
                p10.Q(obj);
                return obj2;
            }
            recomposer = (Recomposer) this.L$0;
            p10.Q(obj);
        }
        recomposer.close();
        this.L$0 = obj;
        this.label = 2;
        return recomposer.join(this) == vnVar ? vnVar : obj;
    }
}
