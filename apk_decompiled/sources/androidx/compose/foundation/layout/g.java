package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(FlowMeasureLazyPolicy flowMeasureLazyPolicy, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.d = 1;
        this.e = flowMeasureLazyPolicy;
        this.f = subcomposeMeasureScope;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        List measure_0kLqBqw$lambda$1;
        Measurable measure_0kLqBqw$lambda$2;
        w01 BoxWithConstraints$lambda$0$0$0;
        int i = this.d;
        Object obj3 = this.e;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                measure_0kLqBqw$lambda$1 = FlowMeasureLazyPolicy.measure_0kLqBqw$lambda$1((SubcomposeMeasureScope) obj4, (FlowMeasureLazyPolicy) obj3, ((Integer) obj).intValue(), (FlowLineInfo) obj2);
                return measure_0kLqBqw$lambda$1;
            case 1:
                measure_0kLqBqw$lambda$2 = FlowMeasureLazyPolicy.measure_0kLqBqw$lambda$2((FlowMeasureLazyPolicy) obj3, (SubcomposeMeasureScope) obj4, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
                return measure_0kLqBqw$lambda$2;
            default:
                BoxWithConstraints$lambda$0$0$0 = BoxWithConstraintsKt.BoxWithConstraints$lambda$0$0$0((ny) obj4, (BoxWithConstraintsScopeImpl) obj3, (Composer) obj, ((Integer) obj2).intValue());
                return BoxWithConstraints$lambda$0$0$0;
        }
    }

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.d = i;
        this.f = obj;
        this.e = obj2;
    }
}
