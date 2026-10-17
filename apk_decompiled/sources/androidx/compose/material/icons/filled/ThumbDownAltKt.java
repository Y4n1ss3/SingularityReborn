package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbDownAltKt {
    private static ImageVector _thumbDownAlt;

    public static final ImageVector getThumbDownAlt(Icons.Filled filled) {
        ImageVector imageVector = _thumbDownAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThumbDownAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(22.0f, 4.0f, -2.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(9.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        uo.r(a, 2.0f, 4.0f, 2.17f, 11.12f);
        a.curveToRelative(-0.11f, 0.25f, -0.17f, 0.52f, -0.17f, 0.8f);
        a.verticalLineTo(13.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        a.horizontalLineToRelative(5.5f);
        a.lineToRelative(-0.92f, 4.65f);
        a.curveToRelative(-0.05f, 0.22f, -0.02f, 0.46f, 0.08f, 0.66f);
        a.curveToRelative(0.23f, 0.45f, 0.52f, 0.86f, 0.88f, 1.22f);
        a.lineTo(10.0f, 22.0f);
        a.lineToRelative(6.41f, -6.41f);
        a.curveToRelative(0.38f, -0.38f, 0.59f, -0.89f, 0.59f, -1.42f);
        a.verticalLineTo(6.34f);
        a.curveTo(17.0f, 5.05f, 15.95f, 4.0f, 14.66f, 4.0f);
        a.horizontalLineToRelative(-8.1f);
        a.curveToRelative(-0.71f, 0.0f, -1.36f, 0.37f, -1.72f, 0.97f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(a, -2.67f, 6.15f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbDownAlt = build;
        build.getClass();
        return build;
    }
}
