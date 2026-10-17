package androidx.compose.material3.internal;

import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.runtime.State;
import defpackage.bq;
import defpackage.gc;
import defpackage.hm;
import defpackage.iw;
import defpackage.iy;
import defpackage.jw;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1", f = "BasicEdgeToEdgeDialog.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 extends us0 implements my {
    final /* synthetic */ State<iy> $currentOnBack$delegate;
    final /* synthetic */ PredictiveBackState $state;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(PredictiveBackState predictiveBackState, State<? extends iy> state, hm hmVar) {
        super(2, hmVar);
        this.$state = predictiveBackState;
        this.$currentOnBack$delegate = state;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 = new BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(this.$state, this.$currentOnBack$delegate, hmVar);
        basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1.L$0 = obj;
        return basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1;
    }

    @Override // defpackage.my
    public final Object invoke(iw iwVar, hm hmVar) {
        return ((BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1) create(iwVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        iy PredictiveBackStateHandler$lambda$1;
        int i = this.label;
        try {
            if (i == 0) {
                p10.Q(obj);
                iw iwVar = (iw) this.L$0;
                final PredictiveBackState predictiveBackState = this.$state;
                jw jwVar = new jw() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1.1
                    @Override // defpackage.jw
                    public final Object emit(gc gcVar, hm hmVar) {
                        PredictiveBackStateImpl predictiveBackStateImpl = (PredictiveBackStateImpl) PredictiveBackState.this;
                        float f = gcVar.a;
                        float f2 = gcVar.b;
                        float f3 = gcVar.c;
                        int i2 = gcVar.d;
                        predictiveBackStateImpl.setValue(new BackEventProgress.InProgress(f, f2, f3, i2 != 0 ? i2 != 1 ? SwipeEdge.None : SwipeEdge.Right : SwipeEdge.Left));
                        return w01.a;
                    }
                };
                this.label = 1;
                Object collect = iwVar.collect(jwVar, this);
                vn vnVar = vn.d;
                if (collect == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            ((PredictiveBackStateImpl) this.$state).setValue(BackEventProgress.Completed.INSTANCE);
            PredictiveBackStateHandler$lambda$1 = BasicEdgeToEdgeDialogKt.PredictiveBackStateHandler$lambda$1(this.$currentOnBack$delegate);
            PredictiveBackStateHandler$lambda$1.invoke();
            return w01.a;
        } catch (CancellationException e) {
            ((PredictiveBackStateImpl) this.$state).setValue(BackEventProgress.NotRunning.INSTANCE);
            throw e;
        }
    }
}
