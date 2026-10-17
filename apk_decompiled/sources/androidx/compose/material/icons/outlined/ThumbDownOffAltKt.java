package androidx.compose.material.icons.outlined;

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
public final class ThumbDownOffAltKt {
    private static ImageVector _thumbDownOffAlt;

    public static final ImageVector getThumbDownOffAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _thumbDownOffAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ThumbDownOffAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(15.0f, 3.0f, 6.0f);
        d.curveTo(5.17f, 3.0f, 4.46f, 3.5f, 4.16f, 4.22f);
        d.lineToRelative(-3.02f, 7.05f);
        d.curveTo(1.05f, 11.5f, 1.0f, 11.74f, 1.0f, 12.0f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(6.31f);
        d.lineToRelative(-0.95f, 4.57f);
        d.lineToRelative(-0.03f, 0.32f);
        d.curveToRelative(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f);
        d.lineTo(9.83f, 23.0f);
        d.lineToRelative(6.59f, -6.59f);
        d.curveTo(16.78f, 16.05f, 17.0f, 15.55f, 17.0f, 15.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(17.0f, 3.9f, 16.1f, 3.0f, 15.0f, 3.0f);
        k4.x(d, 15.0f, 15.0f, -4.34f, 4.34f);
        r6.w(d, 12.0f, 14.0f, 3.0f, -2.0f);
        d.lineToRelative(3.0f, -7.0f);
        d.horizontalLineToRelative(9.0f);
        d.verticalLineTo(15.0f);
        d.close();
        k4.C(d, 19.0f, 3.0f, 4.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, -4.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbDownOffAlt = build;
        build.getClass();
        return build;
    }
}
