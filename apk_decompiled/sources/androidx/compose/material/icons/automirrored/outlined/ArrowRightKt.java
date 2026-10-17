package androidx.compose.material.icons.automirrored.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArrowRightKt {
    private static ImageVector _arrowRight;

    public static final ImageVector getArrowRight(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _arrowRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(new ImageVector.Builder("AutoMirrored.Outlined.ArrowRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null), r6.n(k4.e(10.0f, 17.0f, 5.0f, -5.0f), -5.0f, -5.0f, 10.0f), VectorKt.getDefaultFillType(), "", new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, StrokeCap.Companion.m5135getButtKaPHkGw(), StrokeJoin.Companion.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _arrowRight = build;
        build.getClass();
        return build;
    }
}
