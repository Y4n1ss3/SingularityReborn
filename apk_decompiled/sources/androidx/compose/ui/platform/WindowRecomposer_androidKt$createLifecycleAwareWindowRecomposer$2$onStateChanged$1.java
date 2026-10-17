package androidx.compose.ui.platform;

import androidx.compose.runtime.Recomposer;
import defpackage.bq;
import defpackage.hm;
import defpackage.ji0;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y40;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {379}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends us0 implements my {
    final /* synthetic */ ji0 $motionDurationScaleImpl;
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 $self;
    final /* synthetic */ y40 $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(ji0 ji0Var, Recomposer recomposer, y40 y40Var, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, hm hmVar) {
        super(2, hmVar);
        this.$motionDurationScaleImpl = ji0Var;
        this.$recomposer = recomposer;
        this.$source = y40Var;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$motionDurationScaleImpl, this.$recomposer, this.$source, this.$self, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, w01] */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                p10.Q(obj);
                MotionDurationScaleImpl motionDurationScaleImpl = (MotionDurationScaleImpl) this.$motionDurationScaleImpl.d;
                if (motionDurationScaleImpl != null) {
                    motionDurationScaleImpl.setCoroutineScope(p10.a(this.$recomposer.getEffectCoroutineContext()));
                }
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
            this.$source.getLifecycle().b(this.$self);
            this = w01.a;
            return this;
        } catch (Throwable th) {
            this.$source.getLifecycle().b(this.$self);
            throw th;
        }
    }
}
