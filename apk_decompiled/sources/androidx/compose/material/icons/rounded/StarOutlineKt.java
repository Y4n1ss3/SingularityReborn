package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StarOutlineKt {
    private static ImageVector _starOutline;

    public static final ImageVector getStarOutline(Icons.Rounded rounded) {
        ImageVector imageVector = _starOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StarOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.65f, 9.04f, -4.84f, -0.42f);
        e.lineToRelative(-1.89f, -4.45f);
        e.curveToRelative(-0.34f, -0.81f, -1.5f, -0.81f, -1.84f, 0.0f);
        e.lineTo(9.19f, 8.63f);
        e.lineToRelative(-4.83f, 0.41f);
        e.curveToRelative(-0.88f, 0.07f, -1.24f, 1.17f, -0.57f, 1.75f);
        e.lineToRelative(3.67f, 3.18f);
        e.lineToRelative(-1.1f, 4.72f);
        e.curveToRelative(-0.2f, 0.86f, 0.73f, 1.54f, 1.49f, 1.08f);
        e.lineToRelative(4.15f, -2.5f);
        e.lineToRelative(4.15f, 2.51f);
        e.curveToRelative(0.76f, 0.46f, 1.69f, -0.22f, 1.49f, -1.08f);
        e.lineToRelative(-1.1f, -4.73f);
        e.lineToRelative(3.67f, -3.18f);
        e.curveToRelative(0.67f, -0.58f, 0.32f, -1.68f, -0.56f, -1.75f);
        k4.x(e, 12.0f, 15.4f, -3.76f, 2.27f);
        e.lineToRelative(1.0f, -4.28f);
        e.lineToRelative(-3.32f, -2.88f);
        e.lineToRelative(4.38f, -0.38f);
        e.lineTo(12.0f, 6.1f);
        e.lineToRelative(1.71f, 4.04f);
        e.lineToRelative(4.38f, 0.38f);
        e.lineToRelative(-3.32f, 2.88f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 1.0f, 4.28f, 12.0f, 15.4f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starOutline = build;
        build.getClass();
        return build;
    }
}
