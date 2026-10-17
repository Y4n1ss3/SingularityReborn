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
import defpackage.gy;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CasinoKt {
    private static ImageVector _casino;

    public static final ImageVector getCasino(Icons.Sharp sharp) {
        ImageVector imageVector = _casino;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Casino", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(21.0f, 3.0f, 3.0f, 3.0f, 18.0f);
        gy.n(s, 18.0f, 21.0f, 3.0f);
        s.moveTo(7.5f, 18.0f);
        s.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        s.reflectiveCurveTo(6.67f, 15.0f, 7.5f, 15.0f);
        s.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        s.reflectiveCurveTo(8.33f, 18.0f, 7.5f, 18.0f);
        s.close();
        s.moveTo(7.5f, 9.0f);
        s.curveTo(6.67f, 9.0f, 6.0f, 8.33f, 6.0f, 7.5f);
        s.reflectiveCurveTo(6.67f, 6.0f, 7.5f, 6.0f);
        s.reflectiveCurveTo(9.0f, 6.67f, 9.0f, 7.5f);
        s.reflectiveCurveTo(8.33f, 9.0f, 7.5f, 9.0f);
        s.close();
        s.moveTo(12.0f, 13.5f);
        s.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        s.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        s.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        s.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        s.close();
        s.moveTo(16.5f, 18.0f);
        s.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        s.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        s.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        s.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        s.close();
        s.moveTo(16.5f, 9.0f);
        s.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        s.reflectiveCurveTo(15.67f, 6.0f, 16.5f, 6.0f);
        s.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(s, 17.33f, 9.0f, 16.5f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _casino = build;
        build.getClass();
        return build;
    }
}
