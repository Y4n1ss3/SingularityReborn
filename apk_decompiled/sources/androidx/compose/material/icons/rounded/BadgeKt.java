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
import defpackage.af0;
import defpackage.c21;
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BadgeKt {
    private static ImageVector _badge;

    public static final ImageVector getBadge(Icons.Rounded rounded) {
        ImageVector imageVector = _badge;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Badge", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(20.0f, 7.0f, -5.0f, 4.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineToRelative(-2.0f);
        e.curveTo(9.9f, 2.0f, 9.0f, 2.9f, 9.0f, 4.0f);
        e.verticalLineToRelative(3.0f);
        e.horizontalLineTo(4.0f);
        e.curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f);
        e.verticalLineToRelative(11.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(16.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(9.0f);
        e.curveTo(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f);
        e.close();
        e.moveTo(9.0f, 12.0f);
        e.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        e.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        e.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        e.curveTo(7.5f, 12.67f, 8.17f, 12.0f, 9.0f, 12.0f);
        uo.q(e, 12.0f, 18.0f, 6.0f, -0.43f);
        e.curveToRelative(0.0f, -0.6f, 0.36f, -1.15f, 0.92f, -1.39f);
        e.curveTo(7.56f, 15.9f, 8.26f, 15.75f, 9.0f, 15.75f);
        e.reflectiveCurveToRelative(1.44f, 0.15f, 2.08f, 0.43f);
        e.curveToRelative(0.55f, 0.24f, 0.92f, 0.78f, 0.92f, 1.39f);
        k4.D(e, 18.0f, 13.0f, 9.0f, -2.0f);
        c21.c(e, 4.0f, 2.0f, 9.0f);
        e.moveTo(17.25f, 16.5f);
        e.horizontalLineToRelative(-2.5f);
        e.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        e.horizontalLineToRelative(2.5f);
        e.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        e.verticalLineToRelative(0.0f);
        e.curveTo(18.0f, 16.16f, 17.66f, 16.5f, 17.25f, 16.5f);
        af0.l(e, 17.25f, 13.5f, -2.5f);
        e.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        e.horizontalLineToRelative(2.5f);
        e.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        e.verticalLineToRelative(0.0f);
        e.curveTo(18.0f, 13.16f, 17.66f, 13.5f, 17.25f, 13.5f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _badge = build;
        build.getClass();
        return build;
    }
}
