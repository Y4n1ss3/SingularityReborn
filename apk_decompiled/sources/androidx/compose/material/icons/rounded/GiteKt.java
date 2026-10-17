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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GiteKt {
    private static ImageVector _gite;

    public static final ImageVector getGite(Icons.Rounded rounded) {
        ImageVector imageVector = _gite;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Gite", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.41f, 9.41f, -2.83f, -2.83f);
        e.curveTo(18.21f, 6.21f, 17.7f, 6.0f, 17.17f, 6.0f);
        e.horizontalLineTo(9.0f);
        e.verticalLineTo(5.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.reflectiveCurveTo(7.0f, 4.45f, 7.0f, 5.0f);
        e.verticalLineToRelative(1.0f);
        e.horizontalLineTo(6.83f);
        e.curveTo(6.3f, 6.0f, 5.79f, 6.21f, 5.41f, 6.59f);
        e.lineTo(2.59f, 9.41f);
        e.curveTo(2.21f, 9.79f, 2.0f, 10.3f, 2.0f, 10.83f);
        e.verticalLineTo(17.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(16.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineToRelative(-6.17f);
        e.curveTo(22.0f, 10.3f, 21.79f, 9.79f, 21.41f, 9.41f);
        uo.q(e, 14.0f, 17.0f, 4.0f, -5.0f);
        uo.r(e, 10.0f, 17.0f, 20.0f, 17.0f);
        bv.p(e, -4.0f, -6.17f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(e, 2.0f, 2.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gite = build;
        build.getClass();
        return build;
    }
}
