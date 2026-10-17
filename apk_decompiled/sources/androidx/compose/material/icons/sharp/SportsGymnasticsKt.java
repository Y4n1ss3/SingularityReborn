package androidx.compose.material.icons.sharp;

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
import defpackage.gy;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsGymnasticsKt {
    private static ImageVector _sportsGymnastics;

    public static final ImageVector getSportsGymnastics(Icons.Sharp sharp) {
        ImageVector imageVector = _sportsGymnastics;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SportsGymnastics", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.0f, 6.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveTo(7.1f, 8.0f, 6.0f, 8.0f);
        b.reflectiveCurveTo(4.0f, 7.1f, 4.0f, 6.0f);
        af0.l(b, 1.0f, 9.0f, 6.0f);
        b.lineToRelative(7.0f, -5.0f);
        b.lineToRelative(1.31f, 1.52f);
        b.lineTo(11.14f, 8.5f);
        b.horizontalLineTo(14.0f);
        b.lineTo(21.8f, 4.0f);
        b.lineTo(23.0f, 5.4f);
        b.lineTo(14.5f, 12.0f);
        b.lineTo(14.0f, 22.0f);
        b.horizontalLineToRelative(-2.0f);
        b.lineToRelative(-0.5f, -10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(b, 8.0f, 11.0f, 1.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsGymnastics = build;
        build.getClass();
        return build;
    }
}
