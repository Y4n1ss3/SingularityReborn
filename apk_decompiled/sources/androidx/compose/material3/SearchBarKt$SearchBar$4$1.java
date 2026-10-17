package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import defpackage.bq;
import defpackage.gc;
import defpackage.hm;
import defpackage.iw;
import defpackage.jw;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1", f = "SearchBar.kt", l = {570}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SearchBarKt$SearchBar$4$1 extends us0 implements my {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
    final /* synthetic */ un $coroutineScope;
    final /* synthetic */ MutableState<gc> $currentBackEvent;
    final /* synthetic */ MutableFloatState $finalBackProgress;
    final /* synthetic */ MutableState<gc> $firstBackEvent;
    final /* synthetic */ MutatorMutex $mutatorMutex;
    final /* synthetic */ ky $onExpandedChange;
    /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1$1", f = "SearchBar.kt", l = {573}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SearchBarKt$SearchBar$4$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements ky {
        final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
        final /* synthetic */ un $coroutineScope;
        final /* synthetic */ MutableState<gc> $currentBackEvent;
        final /* synthetic */ MutableFloatState $finalBackProgress;
        final /* synthetic */ MutableState<gc> $firstBackEvent;
        final /* synthetic */ ky $onExpandedChange;
        final /* synthetic */ iw $progress;
        int label;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.material3.SearchBarKt$SearchBar$4$1$1$2", f = "SearchBar.kt", l = {585}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.SearchBarKt$SearchBar$4$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends us0 implements my {
            final /* synthetic */ Animatable<Float, AnimationVector1D> $animationProgress;
            final /* synthetic */ MutableState<gc> $currentBackEvent;
            final /* synthetic */ MutableFloatState $finalBackProgress;
            final /* synthetic */ MutableState<gc> $firstBackEvent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(Animatable<Float, AnimationVector1D> animatable, MutableFloatState mutableFloatState, MutableState<gc> mutableState, MutableState<gc> mutableState2, hm hmVar) {
                super(2, hmVar);
                this.$animationProgress = animatable;
                this.$finalBackProgress = mutableFloatState;
                this.$firstBackEvent = mutableState;
                this.$currentBackEvent = mutableState2;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass2(this.$animationProgress, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass2) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            @Override // defpackage.mc
            public final Object invokeSuspend(Object obj) {
                FiniteAnimationSpec finiteAnimationSpec;
                AnonymousClass2 anonymousClass2;
                int i = this.label;
                if (i == 0) {
                    p10.Q(obj);
                    Animatable<Float, AnimationVector1D> animatable = this.$animationProgress;
                    Float f = new Float(1.0f);
                    finiteAnimationSpec = SearchBarKt.AnimationPredictiveBackExitFloatSpec;
                    this.label = 1;
                    anonymousClass2 = this;
                    Object animateTo$default = Animatable.animateTo$default(animatable, f, finiteAnimationSpec, null, null, anonymousClass2, 12, null);
                    vn vnVar = vn.d;
                    if (animateTo$default == vnVar) {
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
                anonymousClass2.$finalBackProgress.setFloatValue(Float.NaN);
                anonymousClass2.$firstBackEvent.setValue(null);
                anonymousClass2.$currentBackEvent.setValue(null);
                return w01.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableFloatState mutableFloatState, iw iwVar, Animatable<Float, AnimationVector1D> animatable, ky kyVar, un unVar, MutableState<gc> mutableState, MutableState<gc> mutableState2, hm hmVar) {
            super(1, hmVar);
            this.$finalBackProgress = mutableFloatState;
            this.$progress = iwVar;
            this.$animationProgress = animatable;
            this.$onExpandedChange = kyVar;
            this.$coroutineScope = unVar;
            this.$firstBackEvent = mutableState;
            this.$currentBackEvent = mutableState2;
        }

        @Override // defpackage.mc
        public final hm create(hm hmVar) {
            return new AnonymousClass1(this.$finalBackProgress, this.$progress, this.$animationProgress, this.$onExpandedChange, this.$coroutineScope, this.$firstBackEvent, this.$currentBackEvent, hmVar);
        }

        @Override // defpackage.ky
        public final Object invoke(hm hmVar) {
            return ((AnonymousClass1) create(hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    p10.Q(obj);
                    this.$finalBackProgress.setFloatValue(Float.NaN);
                    iw iwVar = this.$progress;
                    final MutableState<gc> mutableState = this.$firstBackEvent;
                    final MutableState<gc> mutableState2 = this.$currentBackEvent;
                    final Animatable<Float, AnimationVector1D> animatable = this.$animationProgress;
                    jw jwVar = new jw() { // from class: androidx.compose.material3.SearchBarKt.SearchBar.4.1.1.1
                        @Override // defpackage.jw
                        public final Object emit(gc gcVar, hm hmVar) {
                            if (mutableState.getValue() == null) {
                                mutableState.setValue(gcVar);
                            }
                            mutableState2.setValue(gcVar);
                            Object snapTo = animatable.snapTo(new Float(1.0f - PredictiveBack.INSTANCE.transform$material3(gcVar.c)), hmVar);
                            return snapTo == vn.d ? snapTo : w01.a;
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
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                this.$finalBackProgress.setFloatValue(this.$animationProgress.getValue().floatValue());
                this.$onExpandedChange.invoke(Boolean.FALSE);
            } catch (CancellationException unused) {
                p01.t(this.$coroutineScope, null, null, new AnonymousClass2(this.$animationProgress, this.$finalBackProgress, this.$firstBackEvent, this.$currentBackEvent, null), 3);
            }
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$4$1(MutatorMutex mutatorMutex, MutableFloatState mutableFloatState, Animatable<Float, AnimationVector1D> animatable, ky kyVar, un unVar, MutableState<gc> mutableState, MutableState<gc> mutableState2, hm hmVar) {
        super(2, hmVar);
        this.$mutatorMutex = mutatorMutex;
        this.$finalBackProgress = mutableFloatState;
        this.$animationProgress = animatable;
        this.$onExpandedChange = kyVar;
        this.$coroutineScope = unVar;
        this.$firstBackEvent = mutableState;
        this.$currentBackEvent = mutableState2;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SearchBarKt$SearchBar$4$1 searchBarKt$SearchBar$4$1 = new SearchBarKt$SearchBar$4$1(this.$mutatorMutex, this.$finalBackProgress, this.$animationProgress, this.$onExpandedChange, this.$coroutineScope, this.$firstBackEvent, this.$currentBackEvent, hmVar);
        searchBarKt$SearchBar$4$1.L$0 = obj;
        return searchBarKt$SearchBar$4$1;
    }

    @Override // defpackage.my
    public final Object invoke(iw iwVar, hm hmVar) {
        return ((SearchBarKt$SearchBar$4$1) create(iwVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            iw iwVar = (iw) this.L$0;
            MutatorMutex mutatorMutex = this.$mutatorMutex;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$finalBackProgress, iwVar, this.$animationProgress, this.$onExpandedChange, this.$coroutineScope, this.$firstBackEvent, this.$currentBackEvent, null);
            this.label = 1;
            Object mutate$default = MutatorMutex.mutate$default(mutatorMutex, null, anonymousClass1, this, 1, null);
            vn vnVar = vn.d;
            if (mutate$default == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
