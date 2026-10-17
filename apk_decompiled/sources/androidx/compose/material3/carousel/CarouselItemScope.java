package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface CarouselItemScope {
    CarouselItemDrawInfo getCarouselItemDrawInfo();

    Modifier maskBorder(Modifier modifier, BorderStroke borderStroke, Shape shape, Composer composer, int i);

    Modifier maskClip(Modifier modifier, Shape shape, Composer composer, int i);

    GenericShape rememberMaskShape(Shape shape, Composer composer, int i);
}
