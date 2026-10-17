package androidx.compose.material3;

import defpackage.bq;
import defpackage.hm;
import defpackage.jh;
import defpackage.my;
import defpackage.nf;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1", f = "WideNavigationRail.kt", l = {561}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1 extends us0 implements my {
    final /* synthetic */ zg $channel;
    final /* synthetic */ ModalWideNavigationRailState $modalState;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1$1", f = "WideNavigationRail.kt", l = {565, 567}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ ModalWideNavigationRailState $modalState;
        final /* synthetic */ boolean $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, ModalWideNavigationRailState modalWideNavigationRailState, hm hmVar) {
            super(2, hmVar);
            this.$newTarget = z;
            this.$modalState = modalWideNavigationRailState;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$newTarget, this.$modalState, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            if (r0.expand(r4) == r3) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        
            if (r0.collapse(r4) == r3) goto L17;
         */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                boolean z = this.$newTarget;
                ModalWideNavigationRailState modalWideNavigationRailState = this.$modalState;
                vn vnVar = vn.d;
                if (z) {
                    this.label = 1;
                } else {
                    this.label = 2;
                }
            } else {
                if (i != 1 && i != 2) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1(zg zgVar, ModalWideNavigationRailState modalWideNavigationRailState, hm hmVar) {
        super(2, hmVar);
        this.$channel = zgVar;
        this.$modalState = modalWideNavigationRailState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1 defaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1 = new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1(this.$channel, this.$modalState, hmVar);
        defaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1.L$0 = obj;
        return defaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nf it;
        un unVar;
        vn vnVar;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar2 = (un) this.L$0;
            it = this.$channel.iterator();
            unVar = unVar2;
            this.L$0 = unVar;
            this.L$1 = it;
            this.label = 1;
            obj = it.b(this);
            vnVar = vn.d;
            if (obj == vnVar) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (nf) this.L$1;
            unVar = (un) this.L$0;
            p10.Q(obj);
            if (((Boolean) obj).booleanValue()) {
                boolean booleanValue = ((Boolean) it.c()).booleanValue();
                Object g = this.$channel.g();
                if (g instanceof jh) {
                    g = null;
                }
                Boolean bool = (Boolean) g;
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                }
                p01.t(unVar, null, null, new AnonymousClass1(booleanValue, this.$modalState, null), 3);
                this.L$0 = unVar;
                this.L$1 = it;
                this.label = 1;
                obj = it.b(this);
                vnVar = vn.d;
                if (obj == vnVar) {
                    return vnVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    return w01.a;
                }
            }
        }
    }
}
