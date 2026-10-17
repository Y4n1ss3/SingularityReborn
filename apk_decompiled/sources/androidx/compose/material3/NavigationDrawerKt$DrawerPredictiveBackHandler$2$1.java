package androidx.compose.material3;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.PredictiveBack;
import defpackage.bq;
import defpackage.gc;
import defpackage.gi0;
import defpackage.hm;
import defpackage.iw;
import defpackage.jw;
import defpackage.my;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1", f = "NavigationDrawer.kt", l = {957, 983, 983, 983}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 extends us0 implements my {
    final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
    final /* synthetic */ DrawerState $drawerState;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ gi0 $maxScaleXDistanceGrow;
    final /* synthetic */ gi0 $maxScaleXDistanceShrink;
    final /* synthetic */ gi0 $maxScaleYDistance;
    final /* synthetic */ un $scope;
    /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2", f = "NavigationDrawer.kt", l = {974}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ DrawerPredictiveBackState $drawerPredictiveBackState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DrawerPredictiveBackState drawerPredictiveBackState, hm hmVar) {
            super(2, hmVar);
            this.$drawerPredictiveBackState = drawerPredictiveBackState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 invokeSuspend$lambda$0(DrawerPredictiveBackState drawerPredictiveBackState, float f, float f2) {
            drawerPredictiveBackState.setScaleXDistance(f);
            return w01.a;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass2(this.$drawerPredictiveBackState, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            AnonymousClass2 anonymousClass2;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                float scaleXDistance = this.$drawerPredictiveBackState.getScaleXDistance();
                n nVar = new n(this.$drawerPredictiveBackState, 2);
                this.label = 1;
                anonymousClass2 = this;
                Object animate$default = SuspendAnimationKt.animate$default(scaleXDistance, 0.0f, 0.0f, null, nVar, anonymousClass2, 12, null);
                vn vnVar = vn.d;
                if (animate$default == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                anonymousClass2 = this;
            }
            anonymousClass2.$drawerPredictiveBackState.clear();
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(DrawerPredictiveBackState drawerPredictiveBackState, un unVar, DrawerState drawerState, boolean z, gi0 gi0Var, gi0 gi0Var2, gi0 gi0Var3, hm hmVar) {
        super(2, hmVar);
        this.$drawerPredictiveBackState = drawerPredictiveBackState;
        this.$scope = unVar;
        this.$drawerState = drawerState;
        this.$isRtl = z;
        this.$maxScaleXDistanceGrow = gi0Var;
        this.$maxScaleXDistanceShrink = gi0Var2;
        this.$maxScaleYDistance = gi0Var3;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(this.$drawerPredictiveBackState, this.$scope, this.$drawerState, this.$isRtl, this.$maxScaleXDistanceGrow, this.$maxScaleXDistanceShrink, this.$maxScaleYDistance, hmVar);
        navigationDrawerKt$DrawerPredictiveBackHandler$2$1.L$0 = obj;
        return navigationDrawerKt$DrawerPredictiveBackHandler$2$1;
    }

    @Override // defpackage.my
    public final Object invoke(iw iwVar, hm hmVar) {
        return ((NavigationDrawerKt$DrawerPredictiveBackHandler$2$1) create(iwVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r14.close(r13) == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        if (r14.collect(r7, r13) == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (r14.close(r13) != r6) goto L33;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        vn vnVar = vn.d;
        try {
            try {
            } catch (CancellationException unused) {
                this.$drawerPredictiveBackState.clear();
                if (this.$drawerPredictiveBackState.getSwipeEdgeMatchesDrawer()) {
                    p01.t(this.$scope, null, null, new AnonymousClass2(this.$drawerPredictiveBackState, null), 3);
                }
                DrawerState drawerState = this.$drawerState;
                this.label = 3;
            }
            if (i == 0) {
                p10.Q(obj);
                iw iwVar = (iw) this.L$0;
                final DrawerPredictiveBackState drawerPredictiveBackState = this.$drawerPredictiveBackState;
                final boolean z = this.$isRtl;
                final gi0 gi0Var = this.$maxScaleXDistanceGrow;
                final gi0 gi0Var2 = this.$maxScaleXDistanceShrink;
                final gi0 gi0Var3 = this.$maxScaleYDistance;
                jw jwVar = new jw() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.1
                    @Override // defpackage.jw
                    public final Object emit(gc gcVar, hm hmVar) {
                        DrawerPredictiveBackState.this.update(PredictiveBack.INSTANCE.transform$material3(gcVar.c), gcVar.d == 0, z, gi0Var.d, gi0Var2.d, gi0Var3.d);
                        return w01.a;
                    }
                };
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        p10.Q(obj);
                        return w01.a;
                    }
                    if (i != 4) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) this.L$0;
                    p10.Q(obj);
                    throw th;
                }
                p10.Q(obj);
            }
            if (this.$drawerPredictiveBackState.getSwipeEdgeMatchesDrawer()) {
                p01.t(this.$scope, null, null, new AnonymousClass2(this.$drawerPredictiveBackState, null), 3);
            }
            DrawerState drawerState2 = this.$drawerState;
            this.label = 2;
        } catch (Throwable th2) {
            if (this.$drawerPredictiveBackState.getSwipeEdgeMatchesDrawer()) {
                p01.t(this.$scope, null, null, new AnonymousClass2(this.$drawerPredictiveBackState, null), 3);
            }
            DrawerState drawerState3 = this.$drawerState;
            this.L$0 = th2;
            this.label = 4;
            if (drawerState3.close(this) != vnVar) {
                throw th2;
            }
        }
    }
}
