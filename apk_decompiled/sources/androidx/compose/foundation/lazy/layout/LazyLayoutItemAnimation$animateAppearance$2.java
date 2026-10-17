package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import defpackage.bq;
import defpackage.hm;
import defpackage.iy;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$animateAppearance$2 extends us0 implements my {
    final /* synthetic */ GraphicsLayer $layer;
    final /* synthetic */ boolean $shouldResetValue;
    final /* synthetic */ FiniteAnimationSpec<Float> $spec;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$2(boolean z, LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<Float> finiteAnimationSpec, GraphicsLayer graphicsLayer, hm hmVar) {
        super(2, hmVar);
        this.$shouldResetValue = z;
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$layer = graphicsLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 invokeSuspend$lambda$0(GraphicsLayer graphicsLayer, LazyLayoutItemAnimation lazyLayoutItemAnimation, Animatable animatable) {
        iy iyVar;
        graphicsLayer.setAlpha(((Number) animatable.getValue()).floatValue());
        iyVar = lazyLayoutItemAnimation.onLayerPropertyChanged;
        iyVar.invoke();
        return w01.a;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(1:2)|(3:(1:(1:(5:6|7|8|9|10)(2:17|18))(1:19))(4:35|36|37|(1:39))|25|26)|20|21|22|23|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r14 == r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        r10 = r13;
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x003a, code lost:
    
        if (r14.snapTo(r0, r13) == r4) goto L26;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        LazyLayoutItemAnimation$animateAppearance$2 lazyLayoutItemAnimation$animateAppearance$2;
        Animatable animatable;
        Animatable animatable2;
        Float f;
        FiniteAnimationSpec<Float> finiteAnimationSpec;
        a aVar;
        int i = this.label;
        int i2 = 0;
        vn vnVar = vn.d;
        try {
        } catch (Throwable th2) {
            th = th2;
            lazyLayoutItemAnimation$animateAppearance$2 = this;
        }
        try {
            if (i == 0) {
                p10.Q(obj);
                try {
                    if (this.$shouldResetValue) {
                        animatable = this.this$0.visibilityAnimation;
                        Float f2 = new Float(0.0f);
                        this.label = 1;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    lazyLayoutItemAnimation$animateAppearance$2 = this;
                    th = th;
                    lazyLayoutItemAnimation$animateAppearance$2.this$0.setAppearanceAnimationInProgress(false);
                    throw th;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    lazyLayoutItemAnimation$animateAppearance$2 = this;
                    lazyLayoutItemAnimation$animateAppearance$2.this$0.setAppearanceAnimationInProgress(false);
                    return w01.a;
                }
                p10.Q(obj);
            }
            obj = Animatable.animateTo$default(animatable2, f, finiteAnimationSpec, null, aVar, lazyLayoutItemAnimation$animateAppearance$2, 4, null);
        } catch (Throwable th4) {
            th = th4;
            th = th;
            lazyLayoutItemAnimation$animateAppearance$2.this$0.setAppearanceAnimationInProgress(false);
            throw th;
        }
        animatable2 = this.this$0.visibilityAnimation;
        f = new Float(1.0f);
        finiteAnimationSpec = this.$spec;
        aVar = new a(i2, this.$layer, this.this$0);
        this.label = 2;
        lazyLayoutItemAnimation$animateAppearance$2 = this;
    }
}
