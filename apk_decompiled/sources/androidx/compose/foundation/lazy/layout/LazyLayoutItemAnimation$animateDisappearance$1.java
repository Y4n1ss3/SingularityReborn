package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.ComposerKt;
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
@bq(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {ComposerKt.providerMapsKey}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$animateDisappearance$1 extends us0 implements my {
    final /* synthetic */ GraphicsLayer $layer;
    final /* synthetic */ FiniteAnimationSpec<Float> $spec;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateDisappearance$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<Float> finiteAnimationSpec, GraphicsLayer graphicsLayer, hm hmVar) {
        super(2, hmVar);
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
        return new LazyLayoutItemAnimation$animateDisappearance$1(this.this$0, this.$spec, this.$layer, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((LazyLayoutItemAnimation$animateDisappearance$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        LazyLayoutItemAnimation$animateDisappearance$1 lazyLayoutItemAnimation$animateDisappearance$1;
        Animatable animatable;
        Throwable th;
        Float f;
        FiniteAnimationSpec<Float> finiteAnimationSpec;
        a aVar;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            try {
                animatable = this.this$0.visibilityAnimation;
            } catch (Throwable th2) {
                th = th2;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                th = th;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationInProgress(false);
                throw th;
            }
            try {
                f = new Float(0.0f);
                finiteAnimationSpec = this.$spec;
                aVar = new a(i2, this.$layer, this.this$0);
                this.label = 1;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
            } catch (Throwable th3) {
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                th = th3;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationInProgress(false);
                throw th;
            }
            try {
                Object animateTo$default = Animatable.animateTo$default(animatable, f, finiteAnimationSpec, null, aVar, lazyLayoutItemAnimation$animateDisappearance$1, 4, null);
                vn vnVar = vn.d;
                if (animateTo$default == vnVar) {
                    return vnVar;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationInProgress(false);
                throw th;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                p10.Q(obj);
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
            } catch (Throwable th5) {
                th = th5;
                lazyLayoutItemAnimation$animateDisappearance$1 = this;
                lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationInProgress(false);
                throw th;
            }
        }
        lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationFinished(true);
        lazyLayoutItemAnimation$animateDisappearance$1.this$0.setDisappearanceAnimationInProgress(false);
        return w01.a;
    }
}
