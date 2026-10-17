package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface InnerShadowRendererProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final InnerShadowRendererProvider Default = new InnerShadowRendererProvider() { // from class: androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider$Companion$Default$1
            @Override // androidx.compose.ui.graphics.shadow.InnerShadowRendererProvider
            /* renamed from: obtainInnerShadowRenderer-eZhPAX0 */
            public final InnerShadowRenderer mo5463obtainInnerShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
                return new InnerShadowRenderer(shadow, shape.mo283createOutlinePq9zytI(j, layoutDirection, density));
            }
        };

        private Companion() {
        }

        public final InnerShadowRendererProvider getDefault() {
            return Default;
        }
    }

    /* renamed from: obtainInnerShadowRenderer-eZhPAX0 */
    InnerShadowRenderer mo5463obtainInnerShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow);
}
