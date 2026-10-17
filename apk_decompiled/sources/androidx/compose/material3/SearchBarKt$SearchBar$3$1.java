package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import defpackage.bq;
import defpackage.gc;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SearchBarKt$SearchBar$3$1", f = "SearchBar.kt", l = {559}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SearchBarKt$SearchBar$3$1 extends us0 implements my {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ MutableState<gc> $currentBackEvent;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<gc> $firstBackEvent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$3$1(Animatable<Float, AnimationVector1D> animatable, boolean z, MutableFloatState mutableFloatState, MutableState<gc> mutableState, MutableState<gc> mutableState2, hm hmVar) {
        super(2, hmVar);
        this.$animationProgress = animatable;
        this.$expanded = z;
        this.$finalBackProgress = mutableFloatState;
        this.$firstBackEvent = mutableState;
        this.$currentBackEvent = mutableState2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SearchBarKt$SearchBar$3$1(this.$animationProgress, this.$expanded, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SearchBarKt$SearchBar$3$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x007f  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SearchBarKt$SearchBar$3$1 searchBarKt$SearchBar$3$1;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            FiniteAnimationSpec finiteAnimationSpec = (this.$animationProgress.getValue().floatValue() <= 0.0f || this.$animationProgress.getValue().floatValue() >= 1.0f) ? this.$expanded ? SearchBarKt.AnimationEnterFloatSpec : SearchBarKt.AnimationExitFloatSpec : SearchBarKt.AnimationPredictiveBackExitFloatSpec;
            float f = this.$expanded ? 1.0f : 0.0f;
            if (this.$animationProgress.getValue().floatValue() != f) {
                Animatable<Float, AnimationVector1D> animatable = this.$animationProgress;
                Float f2 = new Float(f);
                this.label = 1;
                searchBarKt$SearchBar$3$1 = this;
                Object animateTo$default = Animatable.animateTo$default(animatable, f2, finiteAnimationSpec, null, null, searchBarKt$SearchBar$3$1, 12, null);
                vn vnVar = vn.d;
                if (animateTo$default == vnVar) {
                    return vnVar;
                }
                if (!searchBarKt$SearchBar$3$1.$expanded) {
                    searchBarKt$SearchBar$3$1.$finalBackProgress.setFloatValue(Float.NaN);
                    searchBarKt$SearchBar$3$1.$firstBackEvent.setValue(null);
                    searchBarKt$SearchBar$3$1.$currentBackEvent.setValue(null);
                }
                return w01.a;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        searchBarKt$SearchBar$3$1 = this;
        if (!searchBarKt$SearchBar$3$1.$expanded) {
        }
        return w01.a;
    }
}
