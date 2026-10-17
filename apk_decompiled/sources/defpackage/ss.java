package defpackage;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ss implements Easing {
    public final /* synthetic */ int a;

    public /* synthetic */ ss(int i) {
        this.a = i;
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        float EaseInElastic$lambda$0;
        float EaseOutElastic$lambda$0;
        float EaseInOutElastic$lambda$0;
        float EaseOutBounce$lambda$0;
        float EaseInBounce$lambda$0;
        float EaseInOutBounce$lambda$0;
        float LinearEasing$lambda$0;
        switch (this.a) {
            case 0:
                EaseInElastic$lambda$0 = EasingFunctionsKt.EaseInElastic$lambda$0(f);
                return EaseInElastic$lambda$0;
            case 1:
                EaseOutElastic$lambda$0 = EasingFunctionsKt.EaseOutElastic$lambda$0(f);
                return EaseOutElastic$lambda$0;
            case 2:
                EaseInOutElastic$lambda$0 = EasingFunctionsKt.EaseInOutElastic$lambda$0(f);
                return EaseInOutElastic$lambda$0;
            case 3:
                EaseOutBounce$lambda$0 = EasingFunctionsKt.EaseOutBounce$lambda$0(f);
                return EaseOutBounce$lambda$0;
            case 4:
                EaseInBounce$lambda$0 = EasingFunctionsKt.EaseInBounce$lambda$0(f);
                return EaseInBounce$lambda$0;
            case 5:
                EaseInOutBounce$lambda$0 = EasingFunctionsKt.EaseInOutBounce$lambda$0(f);
                return EaseInOutBounce$lambda$0;
            default:
                LinearEasing$lambda$0 = EasingKt.LinearEasing$lambda$0(f);
                return LinearEasing$lambda$0;
        }
    }
}
