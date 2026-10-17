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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Co2Kt {
    private static ImageVector _co2;

    public static final ImageVector getCo2(Icons.Rounded rounded) {
        ImageVector imageVector = _co2;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Co2", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(14.0f, 9.0f, -3.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(4.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(3.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineToRelative(-4.0f);
        a.curveTo(15.0f, 9.45f, 14.55f, 9.0f, 14.0f, 9.0f);
        r6.B(a, 13.5f, 13.5f, -2.0f, -3.0f);
        uo.r(a, 2.0f, 13.5f, 20.5f, 15.5f);
        kf0.x(a, -2.0f, 1.0f, 2.25f);
        a.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        a.lineToRelative(0.0f, 0.0f);
        a.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        a.horizontalLineTo(18.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.verticalLineToRelative(-1.5f);
        a.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        kf0.x(a, 2.0f, -1.0f, -2.25f);
        a.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        a.verticalLineToRelative(0.0f);
        a.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        a.horizontalLineToRelative(2.75f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.verticalLineToRelative(1.5f);
        a.curveTo(21.5f, 15.05f, 21.05f, 15.5f, 20.5f, 15.5f);
        a.close();
        a.moveTo(8.0f, 14.0f);
        a.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        a.horizontalLineTo(4.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.verticalLineToRelative(-4.0f);
        a.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        a.horizontalLineToRelative(3.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        a.verticalLineToRelative(0.25f);
        a.curveTo(8.0f, 10.66f, 7.66f, 11.0f, 7.25f, 11.0f);
        a.curveToRelative(-0.33f, 0.0f, -0.6f, -0.21f, -0.71f, -0.5f);
        a.curveToRelative(0.0f, 0.0f, -2.04f, 0.0f, -2.04f, 0.0f);
        a.verticalLineToRelative(3.0f);
        a.lineToRelative(2.04f, 0.0f);
        a.curveToRelative(0.1f, -0.29f, 0.38f, -0.5f, 0.71f, -0.5f);
        a.curveTo(7.66f, 13.0f, 8.0f, 13.34f, 8.0f, 13.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(a, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _co2 = build;
        build.getClass();
        return build;
    }
}
