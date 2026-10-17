package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", l = {413}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class MarqueeModifierNode$runAnimation$2 extends us0 implements my {
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", l = {427, 429, 433, 433}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MarqueeModifierNode marqueeModifierNode, hm hmVar) {
            super(2, hmVar);
            this.this$0 = marqueeModifierNode;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, hmVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.my
        public final Object invoke(Float f, hm hmVar) {
            return ((AnonymousClass2) create(f, hmVar)).invokeSuspend(w01.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00c0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00d8 A[RETURN] */
        @Override // defpackage.mc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Animatable animatable;
            Float f;
            int i;
            int i2;
            int i3;
            float f2;
            AnimationSpec m234createMarqueeAnimationSpecZ4HSEVQ;
            Animatable animatable2;
            AnimationSpec animationSpec;
            Animatable animatable3;
            Object animateTo$default;
            Animatable animatable4;
            int i4 = this.label;
            w01 w01Var = w01.a;
            vn vnVar = vn.d;
            try {
            } catch (Throwable th) {
                animatable = this.this$0.offset;
                Float f3 = new Float(0.0f);
                this.L$0 = th;
                this.L$1 = null;
                this.label = 4;
                if (animatable.snapTo(f3, this) != vnVar) {
                    throw th;
                }
            }
            if (i4 == 0) {
                p10.Q(obj);
                f = (Float) this.L$0;
                if (f == null) {
                    return w01Var;
                }
                i = this.this$0.iterations;
                float floatValue = f.floatValue();
                i2 = this.this$0.initialDelayMillis;
                i3 = this.this$0.delayMillis;
                f2 = this.this$0.velocity;
                m234createMarqueeAnimationSpecZ4HSEVQ = BasicMarqueeKt.m234createMarqueeAnimationSpecZ4HSEVQ(i, floatValue, i2, i3, f2, DelegatableNodeKt.requireDensity(this.this$0));
                animatable2 = this.this$0.offset;
                Float f4 = new Float(0.0f);
                this.L$0 = f;
                this.L$1 = m234createMarqueeAnimationSpecZ4HSEVQ;
                this.label = 1;
                if (animatable2.snapTo(f4, this) != vnVar) {
                    animationSpec = m234createMarqueeAnimationSpecZ4HSEVQ;
                }
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    p10.Q(obj);
                    animateTo$default = obj;
                    animatable4 = this.this$0.offset;
                    Float f5 = new Float(0.0f);
                    this.label = 3;
                    return animatable4.snapTo(f5, this) != vnVar ? vnVar : w01Var;
                }
                if (i4 == 3) {
                    p10.Q(obj);
                }
                if (i4 != 4) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = (Throwable) this.L$0;
                p10.Q(obj);
                throw th2;
            }
            AnimationSpec animationSpec2 = (AnimationSpec) this.L$1;
            Float f6 = (Float) this.L$0;
            p10.Q(obj);
            animationSpec = animationSpec2;
            f = f6;
            animatable3 = this.this$0.offset;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            animateTo$default = Animatable.animateTo$default(animatable3, f, animationSpec, null, null, this, 12, null);
            if (animateTo$default == vnVar) {
            }
            animatable4 = this.this$0.offset;
            Float f52 = new Float(0.0f);
            this.label = 3;
            if (animatable4.snapTo(f52, this) != vnVar) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$runAnimation$2(MarqueeModifierNode marqueeModifierNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = marqueeModifierNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float invokeSuspend$lambda$0(MarqueeModifierNode marqueeModifierNode) {
        int contentWidth;
        int containerWidth;
        int contentWidth2;
        int spacingPx;
        boolean hasFocus;
        contentWidth = marqueeModifierNode.getContentWidth();
        containerWidth = marqueeModifierNode.getContainerWidth();
        if (contentWidth <= containerWidth) {
            return null;
        }
        if (MarqueeAnimationMode.m300equalsimpl0(marqueeModifierNode.m311getAnimationModeZbEOnfQ(), MarqueeAnimationMode.Companion.m305getWhileFocusedZbEOnfQ())) {
            hasFocus = marqueeModifierNode.getHasFocus();
            if (!hasFocus) {
                return null;
            }
        }
        contentWidth2 = marqueeModifierNode.getContentWidth();
        spacingPx = marqueeModifierNode.getSpacingPx();
        return Float.valueOf(contentWidth2 + spacingPx);
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new MarqueeModifierNode$runAnimation$2(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((MarqueeModifierNode$runAnimation$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            p10.Q(obj);
            iw snapshotFlow = SnapshotStateKt.snapshotFlow(new e(i2, this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            Object k = y80.k(snapshotFlow, anonymousClass2, this);
            vn vnVar = vn.d;
            if (k == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
