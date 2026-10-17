package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface DropShadowRendererProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final DropShadowRendererProvider Default = new DropShadowRendererProvider() { // from class: androidx.compose.ui.graphics.shadow.DropShadowRendererProvider$Companion$Default$1
            @Override // androidx.compose.ui.graphics.shadow.DropShadowRendererProvider
            /* renamed from: obtainDropShadowRenderer-eZhPAX0 */
            public final DropShadowRenderer mo5462obtainDropShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow) {
                return new DropShadowRenderer(shadow, shape.mo283createOutlinePq9zytI(j, layoutDirection, density));
            }
        };

        private Companion() {
        }

        public final DropShadowRendererProvider getDefault() {
            return Default;
        }
    }

    /* renamed from: obtainDropShadowRenderer-eZhPAX0 */
    DropShadowRenderer mo5462obtainDropShadowRenderereZhPAX0(Shape shape, long j, LayoutDirection layoutDirection, Density density, Shadow shadow);
}
