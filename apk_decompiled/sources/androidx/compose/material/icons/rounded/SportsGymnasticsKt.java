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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsGymnasticsKt {
    private static ImageVector _sportsGymnastics;

    public static final ImageVector getSportsGymnastics(Icons.Rounded rounded) {
        ImageVector imageVector = _sportsGymnastics;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsGymnastics", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.0f, 6.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveTo(7.1f, 8.0f, 6.0f, 8.0f);
        b.reflectiveCurveTo(4.0f, 7.1f, 4.0f, 6.0f);
        b.close();
        b.moveTo(13.0f, 22.0f);
        b.curveToRelative(-0.56f, 0.0f, -1.02f, -0.44f, -1.05f, -1.0f);
        b.lineToRelative(-0.45f, -9.0f);
        b.lineTo(8.0f, 11.0f);
        b.horizontalLineTo(2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(5.0f);
        b.lineToRelative(6.26f, -4.47f);
        b.curveToRelative(0.42f, -0.3f, 1.0f, -0.23f, 1.34f, 0.16f);
        b.curveToRelative(0.38f, 0.45f, 0.3f, 1.12f, -0.18f, 1.46f);
        b.lineTo(11.14f, 8.5f);
        b.horizontalLineTo(14.0f);
        b.lineToRelative(7.09f, -4.09f);
        b.curveToRelative(0.41f, -0.24f, 0.93f, -0.15f, 1.24f, 0.21f);
        b.curveToRelative(0.36f, 0.43f, 0.3f, 1.07f, -0.14f, 1.41f);
        b.lineTo(14.5f, 12.0f);
        b.lineToRelative(-0.45f, 9.0f);
        b.curveTo(14.02f, 21.56f, 13.56f, 22.0f, 13.0f, 22.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsGymnastics = build;
        build.getClass();
        return build;
    }
}
