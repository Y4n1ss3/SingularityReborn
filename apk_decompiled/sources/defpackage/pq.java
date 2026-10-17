package defpackage;

import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.material3.internal.FloatProducer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class pq implements FloatProducer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.material3.internal.FloatProducer
    public final float invoke() {
        float SingleRowTopAppBar$lambda$15$lambda$12$lambda$11;
        float TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                SingleRowTopAppBar$lambda$15$lambda$12$lambda$11 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$15$lambda$12$lambda$11((SingleRowTopAppBarOverrideScope) obj);
                return SingleRowTopAppBar$lambda$15$lambda$12$lambda$11;
            default:
                TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24((TwoRowsTopAppBarOverrideScope) obj);
                return TwoRowsTopAppBar$lambda$27$lambda$26$lambda$25$lambda$24;
        }
    }
}
