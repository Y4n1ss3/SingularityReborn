package defpackage;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.material3.ListItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class lk implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ lk(Transition transition, Transition.TransitionAnimationState transitionAnimationState, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, int i) {
        this.d = 2;
        this.f = transition;
        this.i = transitionAnimationState;
        this.g = obj;
        this.h = obj2;
        this.j = finiteAnimationSpec;
        this.e = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 invoke$lambda$3;
        w01 ListItemLayout$lambda$8;
        w01 UpdateInitialAndTargetValues$lambda$0;
        int i = this.d;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                invoke$lambda$3 = ComposableLambdaImpl.invoke$lambda$3((ComposableLambdaImpl) obj5, this.g, this.h, this.i, this.j, this.e, (Composer) obj, intValue);
                return invoke$lambda$3;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ListItemLayout$lambda$8 = ListItemKt.ListItemLayout$lambda$8((my) obj5, (my) this.g, (my) this.h, (my) obj4, (my) obj3, this.e, (Composer) obj, intValue2);
                return ListItemLayout$lambda$8;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                UpdateInitialAndTargetValues$lambda$0 = TransitionKt.UpdateInitialAndTargetValues$lambda$0((Transition) obj5, (Transition.TransitionAnimationState) obj4, this.g, this.h, (FiniteAnimationSpec) obj3, this.e, (Composer) obj, intValue3);
                return UpdateInitialAndTargetValues$lambda$0;
        }
    }

    public /* synthetic */ lk(my myVar, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.d = i2;
        this.f = myVar;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.e = i;
    }
}
