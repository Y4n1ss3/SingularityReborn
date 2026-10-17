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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsEsportsKt {
    private static ImageVector _sportsEsports;

    public static final ImageVector getSportsEsports(Icons.Filled filled) {
        ImageVector imageVector = _sportsEsports;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SportsEsports", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.58f, 16.09f, -1.09f, -7.66f);
        e.curveTo(20.21f, 6.46f, 18.52f, 5.0f, 16.53f, 5.0f);
        e.horizontalLineTo(7.47f);
        e.curveTo(5.48f, 5.0f, 3.79f, 6.46f, 3.51f, 8.43f);
        e.lineToRelative(-1.09f, 7.66f);
        e.curveTo(2.2f, 17.63f, 3.39f, 19.0f, 4.94f, 19.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.68f, 0.0f, 1.32f, -0.27f, 1.8f, -0.75f);
        e.lineTo(9.0f, 16.0f);
        e.horizontalLineToRelative(6.0f);
        e.lineToRelative(2.25f, 2.25f);
        e.curveToRelative(0.48f, 0.48f, 1.13f, 0.75f, 1.8f, 0.75f);
        e.horizontalLineToRelative(0.0f);
        e.curveTo(20.61f, 19.0f, 21.8f, 17.63f, 21.58f, 16.09f);
        uo.q(e, 11.0f, 11.0f, 9.0f, 2.0f);
        af0.o(e, 8.0f, -2.0f, 6.0f, -1.0f);
        af0.q(e, 2.0f, 8.0f, 1.0f, 2.0f);
        uo.r(e, 2.0f, 11.0f, 15.0f, 10.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.curveTo(16.0f, 9.55f, 15.55f, 10.0f, 15.0f, 10.0f);
        e.close();
        e.moveTo(17.0f, 13.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.curveTo(18.0f, 12.55f, 17.55f, 13.0f, 17.0f, 13.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsEsports = build;
        build.getClass();
        return build;
    }
}
